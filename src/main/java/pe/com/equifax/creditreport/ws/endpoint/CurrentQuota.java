
package pe.com.equifax.creditreport.ws.endpoint;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CurrentQuota complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CurrentQuota"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DeudasSupervisadas" type="{http://ws.creditreport.equifax.com.pe/endpoint}SummaryDebtCurrent" minOccurs="0"/&gt;
 *         &lt;element name="DeudasNoSupervisadas" type="{http://ws.creditreport.equifax.com.pe/endpoint}SummaryDebtCurrent" minOccurs="0"/&gt;
 *         &lt;element name="DeudasPersonales" type="{http://ws.creditreport.equifax.com.pe/endpoint}SummaryDebtCurrent" minOccurs="0"/&gt;
 *         &lt;element name="Garantias" type="{http://ws.creditreport.equifax.com.pe/endpoint}SummaryNodeCurrent" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrentQuota", propOrder = {
    "deudasSupervisadas",
    "deudasNoSupervisadas",
    "deudasPersonales",
    "garantias"
})
public class CurrentQuota {

    @XmlElement(name = "DeudasSupervisadas")
    protected SummaryDebtCurrent deudasSupervisadas;
    @XmlElement(name = "DeudasNoSupervisadas")
    protected SummaryDebtCurrent deudasNoSupervisadas;
    @XmlElement(name = "DeudasPersonales")
    protected SummaryDebtCurrent deudasPersonales;
    @XmlElement(name = "Garantias")
    protected SummaryNodeCurrent garantias;

    /**
     * Obtiene el valor de la propiedad deudasSupervisadas.
     * 
     * @return
     *     possible object is
     *     {@link SummaryDebtCurrent }
     *     
     */
    public SummaryDebtCurrent getDeudasSupervisadas() {
        return deudasSupervisadas;
    }

    /**
     * Define el valor de la propiedad deudasSupervisadas.
     * 
     * @param value
     *     allowed object is
     *     {@link SummaryDebtCurrent }
     *     
     */
    public void setDeudasSupervisadas(SummaryDebtCurrent value) {
        this.deudasSupervisadas = value;
    }

    /**
     * Obtiene el valor de la propiedad deudasNoSupervisadas.
     * 
     * @return
     *     possible object is
     *     {@link SummaryDebtCurrent }
     *     
     */
    public SummaryDebtCurrent getDeudasNoSupervisadas() {
        return deudasNoSupervisadas;
    }

    /**
     * Define el valor de la propiedad deudasNoSupervisadas.
     * 
     * @param value
     *     allowed object is
     *     {@link SummaryDebtCurrent }
     *     
     */
    public void setDeudasNoSupervisadas(SummaryDebtCurrent value) {
        this.deudasNoSupervisadas = value;
    }

    /**
     * Obtiene el valor de la propiedad deudasPersonales.
     * 
     * @return
     *     possible object is
     *     {@link SummaryDebtCurrent }
     *     
     */
    public SummaryDebtCurrent getDeudasPersonales() {
        return deudasPersonales;
    }

    /**
     * Define el valor de la propiedad deudasPersonales.
     * 
     * @param value
     *     allowed object is
     *     {@link SummaryDebtCurrent }
     *     
     */
    public void setDeudasPersonales(SummaryDebtCurrent value) {
        this.deudasPersonales = value;
    }

    /**
     * Obtiene el valor de la propiedad garantias.
     * 
     * @return
     *     possible object is
     *     {@link SummaryNodeCurrent }
     *     
     */
    public SummaryNodeCurrent getGarantias() {
        return garantias;
    }

    /**
     * Define el valor de la propiedad garantias.
     * 
     * @param value
     *     allowed object is
     *     {@link SummaryNodeCurrent }
     *     
     */
    public void setGarantias(SummaryNodeCurrent value) {
        this.garantias = value;
    }

}
