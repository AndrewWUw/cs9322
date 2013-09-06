
import au.edu.unsw.sltf.client.TopDownSimpleServicesStub;
import au.edu.unsw.sltf.topdown.DownloadFileDocument;
import au.edu.unsw.sltf.topdown.DownloadFileDocument.DownloadFile;
import au.edu.unsw.sltf.topdown.DownloadFileResponseDocument;
import au.edu.unsw.sltf.topdown.DownloadFileResponseDocument.DownloadFileResponse;
import au.edu.unsw.sltf.topdown.ImportMarketDataDocument;
import au.edu.unsw.sltf.topdown.ImportMarketDataDocument.ImportMarketData;
import au.edu.unsw.sltf.topdown.ImportMarketDataResponseDocument;
import au.edu.unsw.sltf.topdown.ImportMarketDataResponseDocument.ImportMarketDataResponse;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Web service client that connects to the TopDownSimpleServices
 * Web service.
 */
public class WebServiceClient {

    public static void main(String[] args) {
        String wsURL = "http://localhost:8080/axis2/services/TopDownSimpleServices";
        try {
            TopDownSimpleServicesStub stub = new TopDownSimpleServicesStub(wsURL);
            System.out.println("The output of importMarketData operation is: ");
            System.out.println(callImportMarketDataOperation(stub));
            System.out.println("The output of downloadFile operation is: ");
            System.out.println(callDownloadFileOperation(stub));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private static String callImportMarketDataOperation(TopDownSimpleServicesStub stub) throws Exception {
        // Ready the request for rdthImport operation.
        ImportMarketDataDocument reqDoc = ImportMarketDataDocument.Factory.newInstance();
        ImportMarketData req = reqDoc.addNewImportMarketData();
        req.setDataSource("/data/source/file.csv");
        req.setEndDate("15/01/2000");
        req.setSec("BHP.AX");
        req.setStartDate("01/01/2000");

        // Use the stub (from generated code) to make the call.
        ImportMarketDataResponseDocument respDoc = stub.importMarketData(reqDoc);
        ImportMarketDataResponse resp = respDoc.getImportMarketDataResponse();
        String result = resp.getReturn();

        return result;
    }

    private static String callDownloadFileOperation(TopDownSimpleServicesStub stub) throws Exception{
        // Ready the request for downloadFile operation.
        DownloadFileDocument reqDoc = DownloadFileDocument.Factory.newInstance();
        DownloadFile req = reqDoc.addNewDownloadFile();
        req.setEventSetID("EvId0003");

        // Use the stub (from generated code) to make the call.
        DownloadFileResponseDocument respDoc = stub.downloadFile(reqDoc);
        DownloadFileResponse resp = respDoc.getDownloadFileResponse();
        String result = resp.getReturn();

        return result;
    }
}

