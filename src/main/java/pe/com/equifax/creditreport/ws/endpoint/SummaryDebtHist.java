
package pe.com.equifax.creditreport.ws.endpoint;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SummaryDebtHist complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SummaryDebtHist"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EntidadesReportadas" type="{http://ws.creditreport.equifax.com.pe/endpoint}SummaryEntityReportedHist" minOccurs="0"/&gt;
 *         &lt;element name="Entidades" type="{http://ws.creditreport.equifax.com.pe/endpoint}SummaryEntityQuotaDebtHist" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SummaryDebtHist", propOrder = {
    "entidadesReportadas",
    "entidades"
})
public class SummaryDebtHist {

    @XmlElement(name = "EntidadesReportadas")
    protected SummaryEntityReportedHist entidadesReportadas;
    @XmlElement(name = "Entidades")
    protected SummaryEntityQuotaDebtHist entidades;

    /**
     * Obtiene el valor de la propiedad entidadesReportadas.
     * 
     * @return
     *     possible object is
     *     {@link SummaryEntityReportedHist }
     *     
     */
    public SummaryEntityReportedHist getEntidadesReportadas() {
        return entidadesReportadas;
    }

    /**
     * Define el valor de la propiedad entidadesReportadas.
     * 
     * @param value
     *     allowed object is
     *     {@link SummaryEntityReportedHist }
     *     
     */
    public void setEntidadesReportadas(SummaryEntityReportedHist value) {
        this.entidadesReportadas = value;
    }

    /**
     * Obtiene el valor de la propiedad entidades.
     * 
     * @return
     *     possible object is
     *     {@link SummaryEntityQuotaDebtHist }
     *     
     */
    public SummaryEntityQuotaDebtHist getEntidades() {
        return entidades;
    }

    /**
     * Define el valor de la propiedad entidades.
     * 
     * @param value
     *     allowed object is
     *     {@link SummaryEntityQuotaDebtHist }
     *     
     */
    public void setEntidades(SummaryEntityQuotaDebtHist value) {
        this.entidades = value;
    }

}
