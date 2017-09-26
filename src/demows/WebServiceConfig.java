/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package demows;

/**
 *
 * @author MyPC
 */
public class WebServiceConfig {
    public static final String WS_SERVICE_NAME = "APConfigService";
    public static final String WS_NAME = "APConfig";
    public static final String WS_TARGET_NAMESPACE = "http://ws.acs.vnpttech.net";
 
    public static final String WS_NAMESPACE_APMANAGEMENT = WS_TARGET_NAMESPACE + "/apmanagement";
    public static final String WS_NAMESPACE_WLAN_CONFIG = WS_TARGET_NAMESPACE + "/wlanconfig";
    public static final String WS_NAMESPACE_DEVICE_INFO = WS_TARGET_NAMESPACE + "/deviceinfo";
 
    public class ErrorCode {
 
        public static final int SUCCESS = 0;
        public static final int SYSTEM_FAIL = -1;
        public static final int CPE_CONNECTION_ERROR = 1;
        public static final int CPE_CONFIG_ERROR = 2;
 
    }
}
