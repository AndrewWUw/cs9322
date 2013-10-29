package xquerysample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import net.sf.saxon.xqj.SaxonXQDataSource;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.xquery.XQConnection;
import javax.xml.xquery.XQConstants;
import javax.xml.xquery.XQDataSource;
import javax.xml.xquery.XQException;
import javax.xml.xquery.XQItemType;
import javax.xml.xquery.XQPreparedExpression;
import javax.xml.xquery.XQResultSequence;

public class XQuerySample {

    public static void main(String[] args) {

        XQDataSource ds = new SaxonXQDataSource();
        XQConnection xqjc;
        int n = 5;
        String query = " <GOLD_Level_CUSTOMERS>{"
                + "for $customer in doc(\"src/xquerysample/customer.xml\")/customers/customer[position() le "
                + n + "]" + "return " + " <customer>" + "   {"
                + "        $customer/id," + "        $customer/firstName,"
                + "        $customer/lastName," + "        $customer/level,"
                + "        $customer/mobile," + "        $customer/email,"
                + "        $customer/city," + "        $customer/state,"
                + "        $customer/zip," + "        $customer/allowUpgrade"
                + "   }" + " </customer>" + "}</GOLD_Level_CUSTOMERS>";

        try {
            xqjc = ds.getConnection();
//            XQPreparedExpression xqje = xqjc.prepareExpression(new FileInputStream("src/xquerysample/gold.xquery"));
//            XQPreparedExpression xqje = xqjc.prepareExpression(new FileInputStream("src/xquerysample/entry.xquery"));
//            XQPreparedExpression xqje = xqjc.prepareExpression(new FileInputStream("src/xquerysample/sorted.xquery"));
//            XQPreparedExpression xqje = xqjc.prepareExpression(new FileInputStream("src/xquerysample/firstx.xquery"));
            XQPreparedExpression xqje = xqjc.prepareExpression(query);

            XMLInputFactory factory = XMLInputFactory.newInstance();
            XMLStreamReader streamReader = factory.createXMLStreamReader(new FileReader("src/xquerysample/customer.xml"));

            XQItemType s = xqjc.createDocumentType();
            xqje.bindDocument(XQConstants.CONTEXT_ITEM, streamReader, s);

            XQResultSequence xqjs = xqje.executeQuery();

            xqjs.writeSequence(System.out, null);

        } catch (XQException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (XMLStreamException e) {
            e.printStackTrace();
        }

    }
}
