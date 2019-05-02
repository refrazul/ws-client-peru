
package pe.com.equifax.creditreport.ws.endpoint;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SummaryDebtCurrent complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SummaryDebtCurrent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Entidades" type="{http://ws.creditreport.equifax.com.pe/endpoint}SummaryEntityQuotaDebtCurrent" minOccurs="0"/&gt;
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
@XmlType(name = "SummaryDebtCurrent", propOrder = {
    "entidades"
})
public class SummaryDebtCurrent {

    @XmlElement(name = "Entidades")
    protected SummaryEntityQuotaDebtCurrent entidades;
    @XmlAttribute(name = "periodo")
    protected String periodo;

    /**
     * Obtiene el valor de la propiedad entidades.
     * 
     * @return
     *     possible object is
     *     {@link SummaryEntityQuotaDebtCurrent }
     *     
     */
    public SummaryEntityQuotaDebtCurrent getEntidades() {
        return entidades;
    }

    /**
     * Define el valor de la propiedad entidades.
     * 
     * @param value
     *     allowed object is
     *     {@link SummaryEntityQuotaDebtCurrent }
     *     
     */
    public void setEntidades(SummaryEntityQuotaDebtCurrent value) {
        this.entidades = value;
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
