/**
 * ImportDownloadServicesSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
package au.edu.unsw.sltf.services;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.CSVWriter;
import au.edu.unsw.sltf.services.DownloadFileDocument;
import au.edu.unsw.sltf.services.DownloadFileDocument.DownloadFile;
import au.edu.unsw.sltf.services.DownloadFileResponseDocument;
import au.edu.unsw.sltf.services.DownloadFileResponseDocument.DownloadFileResponse;
import au.edu.unsw.sltf.services.ImportMarketDataDocument;
import au.edu.unsw.sltf.services.ImportMarketDataDocument.ImportMarketData;
import au.edu.unsw.sltf.services.ImportMarketDataResponseDocument;
import au.edu.unsw.sltf.services.ImportMarketDataResponseDocument.ImportMarketDataResponse;

/**
 * ImportDownloadServicesSkeleton java skeleton for the axisService
 */
public class ImportDownloadServicesSkeleton implements
		ImportDownloadServicesSkeletonInterface {

	/**
	 * Auto generated method signature
	 * 
	 * @param importMarketData0
	 * @return importMarketDataResponse1
	 * @throws ImportDownloadFaultException
	 */
	public au.edu.unsw.sltf.services.ImportMarketDataResponseDocument importMarketData(
			ImportMarketDataDocument importMarketData0)
			throws ImportDownloadFaultException {
		ImportMarketData req = importMarketData0.getImportMarketData();
		StringBuilder sbf = new StringBuilder();
		if (!(req.getSec() == " " && req.getStartDate() == null
				&& req.getEndDate() == null && req.getDataSourceURL() == " ")) {

			sbf.append("Security Code: ").append(req.getSec()).append("\r\n");
			sbf.append("Start date: ").append(req.getStartDate()).append("\r\n");
			sbf.append("End date: ").append(req.getEndDate()).append("\r\n");
			sbf.append("Data source: ").append(req.getDataSourceURL()).append("\r\n");
			String returnStr = sbf.toString();
			
			List inputList = new ArrayList();
			inputList.add(req.getSec());
			inputList.add(req.getStartDate());
			inputList.add(req.getEndDate());
			inputList.add(req.getDataSourceURL());
			
			if(ImportDownloadUtil.inputValidation(inputList))
				ImportDownloadUtil.importFileToServer(req.getDataSourceURL(), " ");
			
			
			
			ImportMarketDataResponseDocument resDoc = ImportMarketDataResponseDocument.Factory.newInstance();
			ImportMarketDataResponse res = resDoc.addNewImportMarketDataResponse();
			
			res.setEventSetId(returnStr);
			// res.setReturn(returnStr);
			return resDoc;
		} else
			return null;

	}

	/**
	 * Auto generated method signature
	 * 
	 * @param downloadFile2
	 * @return downloadFileResponse3
	 * @throws ImportDownloadFaultException
	 */
	public au.edu.unsw.sltf.services.DownloadFileResponseDocument downloadFile(
			DownloadFileDocument downloadFile2)
			throws ImportDownloadFaultException {
		DownloadFile req = downloadFile2.getDownloadFile();
		String returnStr = "EventSet Id: " + req.getEventSetId();

		DownloadFileResponseDocument resDoc = DownloadFileResponseDocument.Factory.newInstance();
		DownloadFileResponse res = resDoc.addNewDownloadFileResponse();
		// res.setReturn(returnStr);
		return resDoc;
	}



}
