
package pe.com.equifax.creditreport.ws.endpoint;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AccountDebtCurrent complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AccountDebtCurrent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Monto" type="{http://ws.creditreport.equifax.com.pe/endpoint}AmountDebtCurrent" minOccurs="0"/&gt;
 *         &lt;element name="Cuentas" type="{http://ws.creditreport.equifax.com.pe/endpoint}SummaryAccountDebtCurrent" minOccurs="0"/&gt;
 *         &lt;element name="Entidades" type="{http://ws.creditreport.equifax.com.pe/endpoint}SummaryEntityAccountCurrent" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountDebtCurrent", propOrder = {
    "codigo",
    "nombre",
    "monto",
    "cuentas",
    "entidades"
})
public class AccountDebtCurrent {

    @XmlElement(name = "Codigo")
    protected String codigo;
    @XmlElement(name = "Nombre")
    protected String nombre;
    @XmlElement(name = "Monto")
    protected BigDecimal monto;
    @XmlElement(name = "Cuentas")
    protected SummaryAccountDebtCurrent cuentas;
    @XmlElement(name = "Entidades")
    protected SummaryEntityAccountCurrent entidades;

    /**
     * Obtiene el valor de la propiedad codigo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Define el valor de la propiedad codigo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigo(String value) {
        this.codigo = value;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad monto.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMonto() {
        return monto;
    }

    /**
     * Define el valor de la propiedad monto.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMonto(BigDecimal value) {
        this.monto = value;
    }

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
     * Obtiene el valor de la propiedad entidades.
     * 
     * @return
     *     possible object is
     *     {@link SummaryEntityAccountCurrent }
     *     
     */
    public SummaryEntityAccountCurrent getEntidades() {
        return entidades;
    }

    /**
     * Define el valor de la propiedad entidades.
     * 
     * @param value
     *     allowed object is
     *     {@link SummaryEntityAccountCurrent }
     *     
     */
    public void setEntidades(SummaryEntityAccountCurrent value) {
        this.entidades = value;
    }

}
