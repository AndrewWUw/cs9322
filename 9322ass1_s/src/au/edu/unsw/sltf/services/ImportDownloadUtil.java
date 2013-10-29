package au.edu.unsw.sltf.services;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.CSVWriter;

public class ImportDownloadUtil {

	/**
	 * Import file from given URL to server
	 * 
	 * @param urlAddress
	 * @param outputFileName
	 * @return
	 */
	public static boolean importFileToServer(String urlAddress, String outputFileName) {
		try {
			URL url = new URL(urlAddress);
			URLConnection conn = url.openConnection();
			// InputStream inputStream = conn.getInputStream();
			DataInputStream reader = new DataInputStream(conn.getInputStream());

			File f = new File(outputFileName);
			if (!f.getParentFile().exists()) {
				f.getParentFile().mkdir();
			}
			DataOutputStream writer = new DataOutputStream(
					new FileOutputStream(f));

			int ks = 0;
			while ((ks = reader.read()) != -1) {
				writer.write(ks);
			}

			reader.close();
			writer.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}

		return true;
	}

	/**
	 * Filter the input csv file according to the sec, startDate, endDate
	 * provided. 
	 * Uses the opencsv package to parse the csv file
	 * opencsv: http://opencsv.sourceforge.net/
	 * 
	 * @param sourceFilePath
	 * @param destnationFilePath
	 * @param sec
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	public static boolean csvFileFilter(String sourceFilePath,
			String destnationFilePath, String sec, Calendar startDate,
			Calendar endDate) {
		try {
			CSVReader reader = new CSVReader(new FileReader(sourceFilePath));
			List<String[]> myEntries = reader.readAll();
			CSVWriter writer = new CSVWriter(new FileWriter(destnationFilePath), ',');
			
			writer.writeNext(myEntries.get(0));
			myEntries.remove(0);
			SimpleDateFormat sourceSDF = new SimpleDateFormat("dd-MMM-yy hh:mm:ss.sss", Locale.ENGLISH);

			for (Iterator<String[]> iterator = myEntries.iterator(); iterator.hasNext();) {
				String[] entry = iterator.next();
				String date = entry[1] + " " + entry[2];
				Date date1 = sourceSDF.parse(date);
				Calendar calendar = Calendar.getInstance();
				calendar.setTime(date1);
				
				if (entry[0].equals(sec) && calendar.after(startDate)
						&& calendar.before(endDate))
					writer.writeNext(entry);
			}
			reader.close();
			writer.close();
		} catch (Exception e) {
			// e.printStackTrace();
			return false;
		}
		return true;
	}

	public static boolean inputValidation(String sec, Calendar startDate, Calendar endDate, String uri) {
		
		if (sec.equals(" ") || startDate == null || endDate == null
				|| !isValid(uri))
			return false;
		else
			return true;
	}
	
	/**
	 * Vaildate URI address
	 * 
	 * @param uri
	 * @return 
	 */
    public static boolean isValid(String uri){  
        boolean isValid = false;  
        String ipRegex = "((25[0-5]|2[0-4]\\d|1\\d\\d|\\d{1,2})\\.(25[0-5]|2[0-4]\\d|1\\d\\d|\\d{1,2})\\.(25[0-5]|2[0-4]\\d|1\\d\\d|\\d{1,2})\\.(25[0-5]|2[0-4]\\d|1\\d\\d|\\d{1,2}))";  
        String domain = "([0-9a-z][0-9a-z-]*\\.)*[a-z]{2,6}|localhost";  
        String port = "(:[0-9]{1,4})";  
        String remain = "(/[\\w!~*'()\\.;?:@&=+$,%#-[\u4e00-\u9fa5]]*)+/?$";  
        String httpRegex = "^http://"+"("+ipRegex+"|"+domain+")"+port+"?"+remain;  
        
        Pattern p = Pattern.compile(httpRegex,Pattern.CASE_INSENSITIVE);  
        Matcher m = p.matcher(uri);  
        isValid = m.find();  
        return isValid;  
    }  

    
}
