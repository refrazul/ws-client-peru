
package pe.com.equifax.creditreport.ws.endpoint;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import pe.com.equifax.creditreport.ws.document.ReporteCrediticio;


/**
 * <p>Clase Java para GetReporteOnlineResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GetReporteOnlineResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://ws.creditreport.equifax.com.pe/document}ReporteCrediticio" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetReporteOnlineResponse", propOrder = {
    "reporteCrediticio"
})
public class GetReporteOnlineResponse {

    @XmlElement(name = "ReporteCrediticio", namespace = "http://ws.creditreport.equifax.com.pe/document")
    protected ReporteCrediticio reporteCrediticio;

    /**
     * Obtiene el valor de la propiedad reporteCrediticio.
     * 
     * @return
     *     possible object is
     *     {@link ReporteCrediticio }
     *     
     */
    public ReporteCrediticio getReporteCrediticio() {
        return reporteCrediticio;
    }

    /**
     * Define el valor de la propiedad reporteCrediticio.
     * 
     * @param value
     *     allowed object is
     *     {@link ReporteCrediticio }
     *     
     */
    public void setReporteCrediticio(ReporteCrediticio value) {
        this.reporteCrediticio = value;
    }

}
