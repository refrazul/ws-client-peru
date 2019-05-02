
package pe.com.equifax.creditreport.ws.endpoint;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import pe.com.equifax.creditreport.ws.document.QueryDataType;


/**
 * <p>Clase Java para GetReporteOnline complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GetReporteOnline"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://ws.creditreport.equifax.com.pe/document}DatosConsulta" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetReporteOnline", propOrder = {
    "datosConsulta"
})
public class GetReporteOnline {

    @XmlElement(name = "DatosConsulta", namespace = "http://ws.creditreport.equifax.com.pe/document")
    protected QueryDataType datosConsulta;

    /**
     * Obtiene el valor de la propiedad datosConsulta.
     * 
     * @return
     *     possible object is
     *     {@link QueryDataType }
     *     
     */
    public QueryDataType getDatosConsulta() {
        return datosConsulta;
    }

    /**
     * Define el valor de la propiedad datosConsulta.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryDataType }
     *     
     */
    public void setDatosConsulta(QueryDataType value) {
        this.datosConsulta = value;
    }

}
