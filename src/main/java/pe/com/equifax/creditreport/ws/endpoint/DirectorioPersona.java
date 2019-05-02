
package pe.com.equifax.creditreport.ws.endpoint;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Nombres" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NumeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FechaNacimiento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="EstadoCivil" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Nacionalidad" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="GradoInstruccion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Telefono" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Ocupacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ApellidoPaterno" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ApellidoMaterno" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PrimerNombre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SegundoNombre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Sexo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "nombres",
    "tipoDocumento",
    "numeroDocumento",
    "fechaNacimiento",
    "estadoCivil",
    "nacionalidad",
    "gradoInstruccion",
    "telefono",
    "ocupacion",
    "apellidoPaterno",
    "apellidoMaterno",
    "primerNombre",
    "segundoNombre",
    "sexo"
})
@XmlRootElement(name = "DirectorioPersona")
public class DirectorioPersona {

    @XmlElement(name = "Nombres", required = true)
    protected String nombres;
    @XmlElement(name = "TipoDocumento", required = true)
    protected String tipoDocumento;
    @XmlElement(name = "NumeroDocumento", required = true)
    protected String numeroDocumento;
    @XmlElement(name = "FechaNacimiento", required = true)
    protected String fechaNacimiento;
    @XmlElement(name = "EstadoCivil", required = true)
    protected String estadoCivil;
    @XmlElement(name = "Nacionalidad", required = true)
    protected String nacionalidad;
    @XmlElement(name = "GradoInstruccion", required = true)
    protected String gradoInstruccion;
    @XmlElement(name = "Telefono", required = true)
    protected String telefono;
    @XmlElement(name = "Ocupacion", required = true)
    protected String ocupacion;
    @XmlElement(name = "ApellidoPaterno", required = true)
    protected String apellidoPaterno;
    @XmlElement(name = "ApellidoMaterno", required = true)
    protected String apellidoMaterno;
    @XmlElement(name = "PrimerNombre", required = true)
    protected String primerNombre;
    @XmlElement(name = "SegundoNombre", required = true)
    protected String segundoNombre;
    @XmlElement(name = "Sexo", required = true)
    protected String sexo;

    /**
     * Obtiene el valor de la propiedad nombres.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * Define el valor de la propiedad nombres.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombres(String value) {
        this.nombres = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoDocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDocumento() {
        return tipoDocumento;
    }

    /**
     * Define el valor de la propiedad tipoDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDocumento(String value) {
        this.tipoDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroDocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    /**
     * Define el valor de la propiedad numeroDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroDocumento(String value) {
        this.numeroDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaNacimiento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Define el valor de la propiedad fechaNacimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaNacimiento(String value) {
        this.fechaNacimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad estadoCivil.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoCivil() {
        return estadoCivil;
    }

    /**
     * Define el valor de la propiedad estadoCivil.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoCivil(String value) {
        this.estadoCivil = value;
    }

    /**
     * Obtiene el valor de la propiedad nacionalidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNacionalidad() {
        return nacionalidad;
    }

    /**
     * Define el valor de la propiedad nacionalidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNacionalidad(String value) {
        this.nacionalidad = value;
    }

    /**
     * Obtiene el valor de la propiedad gradoInstruccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGradoInstruccion() {
        return gradoInstruccion;
    }

    /**
     * Define el valor de la propiedad gradoInstruccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGradoInstruccion(String value) {
        this.gradoInstruccion = value;
    }

    /**
     * Obtiene el valor de la propiedad telefono.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Define el valor de la propiedad telefono.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefono(String value) {
        this.telefono = value;
    }

    /**
     * Obtiene el valor de la propiedad ocupacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOcupacion() {
        return ocupacion;
    }

    /**
     * Define el valor de la propiedad ocupacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOcupacion(String value) {
        this.ocupacion = value;
    }

    /**
     * Obtiene el valor de la propiedad apellidoPaterno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    /**
     * Define el valor de la propiedad apellidoPaterno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApellidoPaterno(String value) {
        this.apellidoPaterno = value;
    }

    /**
     * Obtiene el valor de la propiedad apellidoMaterno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    /**
     * Define el valor de la propiedad apellidoMaterno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApellidoMaterno(String value) {
        this.apellidoMaterno = value;
    }

    /**
     * Obtiene el valor de la propiedad primerNombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimerNombre() {
        return primerNombre;
    }

    /**
     * Define el valor de la propiedad primerNombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimerNombre(String value) {
        this.primerNombre = value;
    }

    /**
     * Obtiene el valor de la propiedad segundoNombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegundoNombre() {
        return segundoNombre;
    }

    /**
     * Define el valor de la propiedad segundoNombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegundoNombre(String value) {
        this.segundoNombre = value;
    }

    /**
     * Obtiene el valor de la propiedad sexo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * Define el valor de la propiedad sexo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSexo(String value) {
        this.sexo = value;
    }

}
