
package pe.com.equifax.creditreport.ws.endpoint;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.2.5
 * 2019-05-02T12:30:40.413-05:00
 * Generated source version: 3.2.5
 */

@WebFault(name = "EquifaxInterfaceException", targetNamespace = "http://ws.creditreport.equifax.com.pe/endpoint")
public class EquifaxInterfaceException_Exception extends Exception {

    private pe.com.equifax.creditreport.ws.endpoint.EquifaxInterfaceException equifaxInterfaceException;

    public EquifaxInterfaceException_Exception() {
        super();
    }

    public EquifaxInterfaceException_Exception(String message) {
        super(message);
    }

    public EquifaxInterfaceException_Exception(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public EquifaxInterfaceException_Exception(String message, pe.com.equifax.creditreport.ws.endpoint.EquifaxInterfaceException equifaxInterfaceException) {
        super(message);
        this.equifaxInterfaceException = equifaxInterfaceException;
    }

    public EquifaxInterfaceException_Exception(String message, pe.com.equifax.creditreport.ws.endpoint.EquifaxInterfaceException equifaxInterfaceException, java.lang.Throwable cause) {
        super(message, cause);
        this.equifaxInterfaceException = equifaxInterfaceException;
    }

    public pe.com.equifax.creditreport.ws.endpoint.EquifaxInterfaceException getFaultInfo() {
        return this.equifaxInterfaceException;
    }
}
