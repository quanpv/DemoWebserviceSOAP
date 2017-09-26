/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package demows;

import javax.jws.WebResult;
import javax.jws.WebService;

/**
 *
 * @author MyPC
 */
@WebService(serviceName = WebServiceConfig.WS_SERVICE_NAME,
        name = WebServiceConfig.WS_NAME,
        targetNamespace = WebServiceConfig.WS_TARGET_NAMESPACE)
public class ACSWebServiceImpl implements ACSWebService{
    @Override
    @WebResult(targetNamespace = WebServiceConfig.WS_NAMESPACE_APMANAGEMENT)
    public String ping() {
        return "pong";
    }
 
    @Override
    @WebResult(targetNamespace = WebServiceConfig.WS_NAMESPACE_APMANAGEMENT)
    public BasicResult configTunnelMode(String serialNumber, String urlRequestCpe, int mode) {
        BasicResult result = new BasicResult();
        try {
            String retValue = "Something value";
            String description = "I'm doing stuff !";
            result.setErrorCode(0);
            result.setRetValue(retValue);
            result.setMessage(description);
            return result;
        } catch (Exception ex) {
            result.setErrorCode(WebServiceConfig.ErrorCode.CPE_CONFIG_ERROR);
            result.setMessage(ex.getMessage());
            return result;
        }
    }
 
    @Override
    @WebResult(targetNamespace = WebServiceConfig.WS_NAMESPACE_APMANAGEMENT)
    public BasicResult configWanEthernetPort(String serialNumber, String urlRequestCpe, String port) {
        BasicResult result = new BasicResult();
        try {
            boolean retValue = true;
            String description = "I'm doing stuff !";
            result.setErrorCode(0);
            result.setRetValue(retValue);
            result.setMessage(description);
            return result;
        } catch (Exception ex) {
            result.setErrorCode(WebServiceConfig.ErrorCode.CPE_CONFIG_ERROR);
            result.setMessage(ex.getMessage());
            return result;
        }
    }
}
