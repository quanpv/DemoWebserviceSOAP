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
public class BasicResult {
    private int errorCode;
    private String message;
    private String retValue;
 
    public BasicResult() {
        this.errorCode = 0;
        this.message = "(not provided)";
        this.retValue = "(not provided)";
    }
 
    public int getErrorCode() {
        return errorCode;
    }
 
    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }
 
    public String getMessage() {
        return message;
    }
 
    public void setMessage(String message) {
        this.message = message;
    }
 
    public String getRetValue() {
        return retValue;
    }
 
    public void setRetValue(String retValue) {
        this.retValue = retValue;
    }
 
    public void setRetValue(Object retValue) {
        this.retValue = String.valueOf(retValue);
    }
}
