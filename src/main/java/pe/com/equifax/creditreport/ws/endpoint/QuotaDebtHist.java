
package pe.com.equifax.creditreport.ws.endpoint;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para QuotaDebtHist complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="QuotaDebtHist"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TipoBanca" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TipoDeuda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LineaTotal" type="{http://ws.creditreport.equifax.com.pe/endpoint}TypeAmountDebtHist" minOccurs="0"/&gt;
 *         &lt;element name="SaldoUltimoMes" type="{http://ws.creditreport.equifax.com.pe/endpoint}TypeAmountDebtHist" minOccurs="0"/&gt;
 *         &lt;element name="SaldoPromedio" type="{http://ws.creditreport.equifax.com.pe/endpoint}TypeAmountDebtHist" minOccurs="0"/&gt;
 *         &lt;element name="CuotaMensual" type="{http://ws.creditreport.equifax.com.pe/endpoint}TypeAmountDebtHist" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuotaDebtHist", propOrder = {
    "tipoBanca",
    "tipoDeuda",
    "lineaTotal",
    "saldoUltimoMes",
    "saldoPromedio",
    "cuotaMensual"
})
public class QuotaDebtHist {

    @XmlElement(name = "TipoBanca")
    protected String tipoBanca;
    @XmlElement(name = "TipoDeuda")
    protected String tipoDeuda;
    @XmlElement(name = "LineaTotal")
    protected TypeAmountDebtHist lineaTotal;
    @XmlElement(name = "SaldoUltimoMes")
    protected TypeAmountDebtHist saldoUltimoMes;
    @XmlElement(name = "SaldoPromedio")
    protected TypeAmountDebtHist saldoPromedio;
    @XmlElement(name = "CuotaMensual")
    protected TypeAmountDebtHist cuotaMensual;

    /**
     * Obtiene el valor de la propiedad tipoBanca.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoBanca() {
        return tipoBanca;
    }

    /**
     * Define el valor de la propiedad tipoBanca.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoBanca(String value) {
        this.tipoBanca = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoDeuda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDeuda() {
        return tipoDeuda;
    }

    /**
     * Define el valor de la propiedad tipoDeuda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDeuda(String value) {
        this.tipoDeuda = value;
    }

    /**
     * Obtiene el valor de la propiedad lineaTotal.
     * 
     * @return
     *     possible object is
     *     {@link TypeAmountDebtHist }
     *     
     */
    public TypeAmountDebtHist getLineaTotal() {
        return lineaTotal;
    }

    /**
     * Define el valor de la propiedad lineaTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeAmountDebtHist }
     *     
     */
    public void setLineaTotal(TypeAmountDebtHist value) {
        this.lineaTotal = value;
    }

    /**
     * Obtiene el valor de la propiedad saldoUltimoMes.
     * 
     * @return
     *     possible object is
     *     {@link TypeAmountDebtHist }
     *     
     */
    public TypeAmountDebtHist getSaldoUltimoMes() {
        return saldoUltimoMes;
    }

    /**
     * Define el valor de la propiedad saldoUltimoMes.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeAmountDebtHist }
     *     
     */
    public void setSaldoUltimoMes(TypeAmountDebtHist value) {
        this.saldoUltimoMes = value;
    }

    /**
     * Obtiene el valor de la propiedad saldoPromedio.
     * 
     * @return
     *     possible object is
     *     {@link TypeAmountDebtHist }
     *     
     */
    public TypeAmountDebtHist getSaldoPromedio() {
        return saldoPromedio;
    }

    /**
     * Define el valor de la propiedad saldoPromedio.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeAmountDebtHist }
     *     
     */
    public void setSaldoPromedio(TypeAmountDebtHist value) {
        this.saldoPromedio = value;
    }

    /**
     * Obtiene el valor de la propiedad cuotaMensual.
     * 
     * @return
     *     possible object is
     *     {@link TypeAmountDebtHist }
     *     
     */
    public TypeAmountDebtHist getCuotaMensual() {
        return cuotaMensual;
    }

    /**
     * Define el valor de la propiedad cuotaMensual.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeAmountDebtHist }
     *     
     */
    public void setCuotaMensual(TypeAmountDebtHist value) {
        this.cuotaMensual = value;
    }

}
