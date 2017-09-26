/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package demows;

import javax.xml.ws.Endpoint;

/**
 *
 * @author MyPC
 */
public class ACSWebServicePublisher {
    public static final String WS_HOSTNAME_KEY = "net.vnpttech.acs.ws.StartWebservice.hostname";
    public static final String WS_PORT_KEY = "net.vnpttech.acs.ws.StartWebservice.port";
    public static final String WS_CONTEXT_KEY = "net.vnpttech.acs.ws.StartWebservice.context";
 
    public static void main(String[] args) {
        String hostName = System.getProperty(WS_HOSTNAME_KEY, "0.0.0.0");
        String port = System.getProperty(WS_PORT_KEY, "9000");
        String context = System.getProperty(WS_CONTEXT_KEY, "/acs/ws");
        StringBuilder sb = new StringBuilder();
        sb.append("http://")
                .append(hostName)
                .append(":")
                .append(port)
                .append(context)
                .append("?wsdl");
        String serviceAddress = sb.toString();
        Endpoint.publish(serviceAddress, new ACSWebServiceImpl());
        System.out.println("Published Address: " + serviceAddress);
    }
}
