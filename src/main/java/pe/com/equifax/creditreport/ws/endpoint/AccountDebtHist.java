
package pe.com.equifax.creditreport.ws.endpoint;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AccountDebtHist complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AccountDebtHist"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Montos" type="{http://ws.creditreport.equifax.com.pe/endpoint}TypeAmountDebtHist" minOccurs="0"/&gt;
 *         &lt;element name="Cuentas" type="{http://ws.creditreport.equifax.com.pe/endpoint}SummaryAccountDebtHist" minOccurs="0"/&gt;
 *         &lt;element name="Entidades" type="{http://ws.creditreport.equifax.com.pe/endpoint}SummaryEntityAccountHist" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountDebtHist", propOrder = {
    "codigo",
    "nombre",
    "montos",
    "cuentas",
    "entidades"
})
public class AccountDebtHist {

    @XmlElement(name = "Codigo")
    protected String codigo;
    @XmlElement(name = "Nombre")
    protected String nombre;
    @XmlElement(name = "Montos")
    protected TypeAmountDebtHist montos;
    @XmlElement(name = "Cuentas")
    protected SummaryAccountDebtHist cuentas;
    @XmlElement(name = "Entidades")
    protected SummaryEntityAccountHist entidades;

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
     * Obtiene el valor de la propiedad montos.
     * 
     * @return
     *     possible object is
     *     {@link TypeAmountDebtHist }
     *     
     */
    public TypeAmountDebtHist getMontos() {
        return montos;
    }

    /**
     * Define el valor de la propiedad montos.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeAmountDebtHist }
     *     
     */
    public void setMontos(TypeAmountDebtHist value) {
        this.montos = value;
    }

    /**
     * Obtiene el valor de la propiedad cuentas.
     * 
     * @return
     *     possible object is
     *     {@link SummaryAccountDebtHist }
     *     
     */
    public SummaryAccountDebtHist getCuentas() {
        return cuentas;
    }

    /**
     * Define el valor de la propiedad cuentas.
     * 
     * @param value
     *     allowed object is
     *     {@link SummaryAccountDebtHist }
     *     
     */
    public void setCuentas(SummaryAccountDebtHist value) {
        this.cuentas = value;
    }

    /**
     * Obtiene el valor de la propiedad entidades.
     * 
     * @return
     *     possible object is
     *     {@link SummaryEntityAccountHist }
     *     
     */
    public SummaryEntityAccountHist getEntidades() {
        return entidades;
    }

    /**
     * Define el valor de la propiedad entidades.
     * 
     * @param value
     *     allowed object is
     *     {@link SummaryEntityAccountHist }
     *     
     */
    public void setEntidades(SummaryEntityAccountHist value) {
        this.entidades = value;
    }

}
