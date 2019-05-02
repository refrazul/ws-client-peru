
package pe.com.equifax.creditreport.ws.endpoint;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SummaryNodeCurrent complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SummaryNodeCurrent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Cuentas" type="{http://ws.creditreport.equifax.com.pe/endpoint}SummaryAccountDebtCurrent" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="periodo" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SummaryNodeCurrent", propOrder = {
    "cuentas"
})
public class SummaryNodeCurrent {

    @XmlElement(name = "Cuentas")
    protected SummaryAccountDebtCurrent cuentas;
    @XmlAttribute(name = "periodo")
    protected String periodo;

    /**
     * Obtiene el valor de la propiedad cuentas.
     * 
     * @return
     *     possible object is
     *     {@link SummaryAccountDebtCurrent }
     *     
     */
    public SummaryAccountDebtCurrent getCuentas() {
        return cuentas;
    }

    /**
     * Define el valor de la propiedad cuentas.
     * 
     * @param value
     *     allowed object is
     *     {@link SummaryAccountDebtCurrent }
     *     
     */
    public void setCuentas(SummaryAccountDebtCurrent value) {
        this.cuentas = value;
    }

    /**
     * Obtiene el valor de la propiedad periodo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriodo() {
        return periodo;
    }

    /**
     * Define el valor de la propiedad periodo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriodo(String value) {
        this.periodo = value;
    }

}
