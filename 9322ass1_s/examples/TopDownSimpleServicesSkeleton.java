/**
 * TopDownSimpleServicesSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5  Built on : Apr 30, 2009 (06:07:24 EDT)
 */
package au.edu.unsw.sltf.services;

import au.edu.unsw.sltf.topdown.DownloadFileDocument;
import au.edu.unsw.sltf.topdown.DownloadFileDocument.DownloadFile;
import au.edu.unsw.sltf.topdown.DownloadFileResponseDocument;
import au.edu.unsw.sltf.topdown.DownloadFileResponseDocument.DownloadFileResponse;
import au.edu.unsw.sltf.topdown.ImportMarketDataDocument;
import au.edu.unsw.sltf.topdown.ImportMarketDataDocument.ImportMarketData;
import au.edu.unsw.sltf.topdown.ImportMarketDataResponseDocument;
import au.edu.unsw.sltf.topdown.ImportMarketDataResponseDocument.ImportMarketDataResponse;

/**
 *  Simple TopDownSimpleServices implementation.
 */
public class TopDownSimpleServicesSkeleton implements TopDownSimpleServicesSkeletonInterface {

    /**
     * Auto generated method signature
     *
     * @param reqDoc XMLBeans document containing the input (request) data.
     * @return Response document containing the output data.
     */
    public DownloadFileResponseDocument downloadFile(DownloadFileDocument reqDoc) {
        DownloadFile req = reqDoc.getDownloadFile();
        String returnStr = "EventSet Id: " + req.getEventSetID();

        DownloadFileResponseDocument resDoc = DownloadFileResponseDocument.Factory.newInstance();
        DownloadFileResponse res = resDoc.addNewDownloadFileResponse();
        res.setReturn(returnStr);

        return resDoc;
    }

    /**
     * Auto generated method signature
     *
     * @param reqDoc XMLBeans document containing the input (request) data.
     * @return Response document containing the output data.
     */
    public ImportMarketDataResponseDocument importMarketData(ImportMarketDataDocument reqDoc) {
        ImportMarketData req = reqDoc.getImportMarketData();
        StringBuilder sbf = new StringBuilder();
        sbf.append("Security Code: ").append(req.getSec()).append("\r\n");
        sbf.append("Start date: ").append(req.getStartDate()).append("\r\n");
        sbf.append("End date: ").append(req.getEndDate()).append("\r\n");
        sbf.append("Data source: ").append(req.getDataSource()).append("\r\n");
        String returnStr = sbf.toString();

        ImportMarketDataResponseDocument resDoc = ImportMarketDataResponseDocument.Factory.newInstance();
        ImportMarketDataResponse res = resDoc.addNewImportMarketDataResponse();
        res.setReturn(returnStr);

        return resDoc;
    }
}
