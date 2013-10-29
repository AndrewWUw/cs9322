/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package au.edu.unsw.sltf.services;

/**
 * A very simple Web service implementation that does not do much.
 * The public methods of this class will be turned into Web service
 * operations by Axis2.
 */
public class SimpleServices {

    /**
     * Constructor.
     */
    public SimpleServices() {
    }


    public String importMarketData(String sec, String startDate, String endDate, String dataSource) {
        StringBuilder sbf = new StringBuilder();
        sbf.append("Security Code: ").append(sec).append("\r\n");
        sbf.append("Start date: ").append(startDate).append("\r\n");
        sbf.append("End date: ").append(endDate).append("\r\n");
        sbf.append("Data source: ").append(dataSource).append("\r\n");

        return sbf.toString();
    }

    public String downloadFile(String eventSetID) {
        return "EventSet Id: " + eventSetID;
    }

}
