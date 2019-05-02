
package pe.com.equifax.creditreport.ws.endpoint;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para HistoricalQuota complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="HistoricalQuota"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DeudasSupervisadas" type="{http://ws.creditreport.equifax.com.pe/endpoint}SummaryDebtHist" minOccurs="0"/&gt;
 *         &lt;element name="DeudasNoSupervisadas" type="{http://ws.creditreport.equifax.com.pe/endpoint}SummaryDebtHist" minOccurs="0"/&gt;
 *         &lt;element name="DeudasPersonales" type="{http://ws.creditreport.equifax.com.pe/endpoint}SummaryDebtHist" minOccurs="0"/&gt;
 *         &lt;element name="Garantias" type="{http://ws.creditreport.equifax.com.pe/endpoint}SummaryNodeHist" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HistoricalQuota", propOrder = {
    "deudasSupervisadas",
    "deudasNoSupervisadas",
    "deudasPersonales",
    "garantias"
})
public class HistoricalQuota {

    @XmlElement(name = "DeudasSupervisadas")
    protected SummaryDebtHist deudasSupervisadas;
    @XmlElement(name = "DeudasNoSupervisadas")
    protected SummaryDebtHist deudasNoSupervisadas;
    @XmlElement(name = "DeudasPersonales")
    protected SummaryDebtHist deudasPersonales;
    @XmlElement(name = "Garantias")
    protected SummaryNodeHist garantias;

    /**
     * Obtiene el valor de la propiedad deudasSupervisadas.
     * 
     * @return
     *     possible object is
     *     {@link SummaryDebtHist }
     *     
     */
    public SummaryDebtHist getDeudasSupervisadas() {
        return deudasSupervisadas;
    }

    /**
     * Define el valor de la propiedad deudasSupervisadas.
     * 
     * @param value
     *     allowed object is
     *     {@link SummaryDebtHist }
     *     
     */
    public void setDeudasSupervisadas(SummaryDebtHist value) {
        this.deudasSupervisadas = value;
    }

    /**
     * Obtiene el valor de la propiedad deudasNoSupervisadas.
     * 
     * @return
     *     possible object is
     *     {@link SummaryDebtHist }
     *     
     */
    public SummaryDebtHist getDeudasNoSupervisadas() {
        return deudasNoSupervisadas;
    }

    /**
     * Define el valor de la propiedad deudasNoSupervisadas.
     * 
     * @param value
     *     allowed object is
     *     {@link SummaryDebtHist }
     *     
     */
    public void setDeudasNoSupervisadas(SummaryDebtHist value) {
        this.deudasNoSupervisadas = value;
    }

    /**
     * Obtiene el valor de la propiedad deudasPersonales.
     * 
     * @return
     *     possible object is
     *     {@link SummaryDebtHist }
     *     
     */
    public SummaryDebtHist getDeudasPersonales() {
        return deudasPersonales;
    }

    /**
     * Define el valor de la propiedad deudasPersonales.
     * 
     * @param value
     *     allowed object is
     *     {@link SummaryDebtHist }
     *     
     */
    public void setDeudasPersonales(SummaryDebtHist value) {
        this.deudasPersonales = value;
    }

    /**
     * Obtiene el valor de la propiedad garantias.
     * 
     * @return
     *     possible object is
     *     {@link SummaryNodeHist }
     *     
     */
    public SummaryNodeHist getGarantias() {
        return garantias;
    }

    /**
     * Define el valor de la propiedad garantias.
     * 
     * @param value
     *     allowed object is
     *     {@link SummaryNodeHist }
     *     
     */
    public void setGarantias(SummaryNodeHist value) {
        this.garantias = value;
    }

}
