package pe.com.equifax.creditreport.ws.endpoint;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import javax.xml.namespace.QName;

import pe.com.equifax.creditreport.ws.document.HistoricType;
import pe.com.equifax.creditreport.ws.document.QueryDataType;
import pe.com.equifax.creditreport.ws.document.ReporteCrediticio;
import pe.com.equifax.ws.creditreport.endpoint.impl.CreditReportPortService;
import pe.com.equifax.ws.creditreport.security.ClientePasswordCallback;

import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.ws.security.wss4j.WSS4JOutInterceptor;
import org.apache.ws.security.WSConstants;
import org.apache.ws.security.handler.WSHandlerConstants;


public final class Endpoint_CreditReportPort_Client {

    private static final QName SERVICE_NAME = new QName("http://impl.endpoint.creditreport.ws.equifax.com.pe/", "CreditReportPortService");

    private Endpoint_CreditReportPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = CreditReportPortService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) {
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }

        CreditReportPortService ss = new CreditReportPortService(wsdlURL, SERVICE_NAME);
        Endpoint port = ss.getCreditReportPort();
        
        org.apache.cxf.endpoint.Client client = ClientProxy.getClient(port);
        org.apache.cxf.endpoint.Endpoint cxfEndpoint = client.getEndpoint();
        Map<String, Object> outProps = new HashMap<String, Object>();
        outProps.put(WSHandlerConstants.ACTION,WSHandlerConstants.USERNAME_TOKEN);
        outProps.put(WSHandlerConstants.USER, "");  //TODO: Put user here
        outProps.put(WSHandlerConstants.PASSWORD_TYPE, WSConstants.PW_TEXT);
        outProps.put(WSHandlerConstants.PW_CALLBACK_CLASS,ClientePasswordCallback.class.getName());
        WSS4JOutInterceptor wsOut = new WSS4JOutInterceptor(outProps);
        cxfEndpoint.getOutInterceptors().add(wsOut);
       
        {
        System.out.println("Invoking getReporteOnline...");
        GetReporteOnline reporteOnline = new GetReporteOnline();
        QueryDataType queryDataType = new QueryDataType();
        queryDataType.setTipoPersona(""); 				//TODO: Service data
        queryDataType.setTipoDocumento(""); 			//TODO: Service data
        queryDataType.setNumeroDocumento("");			//TODO: Service data
        queryDataType.setCodigoReporte("");				//TODO: Service data	        
        reporteOnline.setDatosConsulta(queryDataType);
        try {
            GetReporteOnlineResponse reporteOnlineResponse = port.getReporteOnline(reporteOnline);
            System.out.println("getReporteOnline.result=" + reporteOnlineResponse);
            ReporteCrediticio response = reporteOnlineResponse.getReporteCrediticio();
            System.out.println("Respuesta =>");
            System.out.println("Nombre:" + response.getNombre());
            System.out.println("Fecha reposrte:" + response.getFechaReporte() );
            System.out.println("Datos principales:" + response.getDatosPrincipales());
            

        } catch (EquifaxInterfaceException_Exception e) {
            System.out.println("Expected exception: EquifaxInterfaceException has occurred.");
            System.out.println(e.toString());
        }
            }
        /*{
        System.out.println("Invoking getReporteHistorico...");
        HistoricType historicType = new HistoricType();
        historicType.setCodigoReporte("0");
        historicType.setNumeroDeOperacion("1");
        GetReporteHistorico reporteHistorico = new GetReporteHistorico();
        reporteHistorico.setConsultaHistorica(historicType);
        
        try {
            GetReporteHistoricoResponse reporteHistoricoResponse = port.getReporteHistorico(reporteHistorico);
            System.out.println("getReporteHistorico.result=" + reporteHistoricoResponse);

        } catch (EquifaxInterfaceException_Exception e) {
            System.out.println("Expected exception: EquifaxInterfaceException has occurred.");
            System.out.println(e.toString());
        }
        }*/

        System.exit(0);
    }

}
