
package pe.com.equifax.creditreport.ws.endpoint;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para QuotaDebtCurrent complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="QuotaDebtCurrent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TipoBanca" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TipoDeuda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LineaTotal" type="{http://ws.creditreport.equifax.com.pe/endpoint}AmountDebtCurrent" minOccurs="0"/&gt;
 *         &lt;element name="SaldoUltimoMes" type="{http://ws.creditreport.equifax.com.pe/endpoint}AmountDebtCurrent" minOccurs="0"/&gt;
 *         &lt;element name="SaldoPromedio" type="{http://ws.creditreport.equifax.com.pe/endpoint}AmountDebtCurrent" minOccurs="0"/&gt;
 *         &lt;element name="CuotaMensual" type="{http://ws.creditreport.equifax.com.pe/endpoint}AmountDebtCurrent" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuotaDebtCurrent", propOrder = {
    "tipoBanca",
    "tipoDeuda",
    "lineaTotal",
    "saldoUltimoMes",
    "saldoPromedio",
    "cuotaMensual"
})
public class QuotaDebtCurrent {

    @XmlElement(name = "TipoBanca")
    protected String tipoBanca;
    @XmlElement(name = "TipoDeuda")
    protected String tipoDeuda;
    @XmlElement(name = "LineaTotal")
    protected BigDecimal lineaTotal;
    @XmlElement(name = "SaldoUltimoMes")
    protected BigDecimal saldoUltimoMes;
    @XmlElement(name = "SaldoPromedio")
    protected BigDecimal saldoPromedio;
    @XmlElement(name = "CuotaMensual")
    protected BigDecimal cuotaMensual;

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
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLineaTotal() {
        return lineaTotal;
    }

    /**
     * Define el valor de la propiedad lineaTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLineaTotal(BigDecimal value) {
        this.lineaTotal = value;
    }

    /**
     * Obtiene el valor de la propiedad saldoUltimoMes.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSaldoUltimoMes() {
        return saldoUltimoMes;
    }

    /**
     * Define el valor de la propiedad saldoUltimoMes.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSaldoUltimoMes(BigDecimal value) {
        this.saldoUltimoMes = value;
    }

    /**
     * Obtiene el valor de la propiedad saldoPromedio.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSaldoPromedio() {
        return saldoPromedio;
    }

    /**
     * Define el valor de la propiedad saldoPromedio.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSaldoPromedio(BigDecimal value) {
        this.saldoPromedio = value;
    }

    /**
     * Obtiene el valor de la propiedad cuotaMensual.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCuotaMensual() {
        return cuotaMensual;
    }

    /**
     * Define el valor de la propiedad cuotaMensual.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCuotaMensual(BigDecimal value) {
        this.cuotaMensual = value;
    }

}
