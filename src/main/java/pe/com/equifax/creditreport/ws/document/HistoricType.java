
package pe.com.equifax.creditreport.ws.document;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para HistoricType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="HistoricType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NumeroDeOperacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CodigoReporte" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HistoricType", propOrder = {
    "numeroDeOperacion",
    "codigoReporte"
})
public class HistoricType {

    @XmlElement(name = "NumeroDeOperacion", required = true)
    protected String numeroDeOperacion;
    @XmlElement(name = "CodigoReporte", required = true)
    protected String codigoReporte;

    /**
     * Obtiene el valor de la propiedad numeroDeOperacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroDeOperacion() {
        return numeroDeOperacion;
    }

    /**
     * Define el valor de la propiedad numeroDeOperacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroDeOperacion(String value) {
        this.numeroDeOperacion = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoReporte.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoReporte() {
        return codigoReporte;
    }

    /**
     * Define el valor de la propiedad codigoReporte.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoReporte(String value) {
        this.codigoReporte = value;
    }

}
