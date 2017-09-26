/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package demows;


import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 *
 * @author MyPC
 */

@WebService
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT,
        use = SOAPBinding.Use.LITERAL,
        parameterStyle = SOAPBinding.ParameterStyle.WRAPPED)
public interface ACSWebService {
     @WebMethod
    String ping();
 
    // WAN CONFIGURATION
    @WebMethod
    BasicResult configTunnelMode(String serialNumber, String urlRequestCpe, int mode);
 
    @WebMethod
    BasicResult configWanEthernetPort(String serialNumber, String urlRequestCpe, String port);
 


}
