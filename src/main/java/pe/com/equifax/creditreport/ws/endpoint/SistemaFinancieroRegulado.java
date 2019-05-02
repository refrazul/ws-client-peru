
package pe.com.equifax.creditreport.ws.endpoint;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
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
 *         &lt;element name="entidadesCalificaciones" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="entidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="period1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="period2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="period3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="period4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="period5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="period6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="period7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="period8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="period9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="period10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="period11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="period12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="period13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="period14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="period15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="periodos" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="periodo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Avalistas" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Aval" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="TipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NumeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NombreAval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="Entidades" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Entidad" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                                 &lt;element name="Periodos" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;sequence&gt;
 *                                                           &lt;element name="Periodo" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                                             &lt;complexType&gt;
 *                                                               &lt;complexContent&gt;
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                                   &lt;sequence&gt;
 *                                                                     &lt;element name="Calificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                                                     &lt;element name="Saldo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                                                                   &lt;/sequence&gt;
 *                                                                   &lt;attribute name="periodo" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                                                 &lt;/restriction&gt;
 *                                                               &lt;/complexContent&gt;
 *                                                             &lt;/complexType&gt;
 *                                                           &lt;/element&gt;
 *                                                         &lt;/sequence&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Microfinanzas" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CalificacionEntidad" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Entidades" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Entidad" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="Codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                                 &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                                 &lt;element name="Calificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                     &lt;attribute name="periodo" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                     &lt;attribute name="flag" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Periodos" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Periodo" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="NroEntidades" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                       &lt;element name="Calificaciones" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="NOR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                                 &lt;element name="CPP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                                 &lt;element name="DEF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                                 &lt;element name="DUD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                                 &lt;element name="PER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="Deudas" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="Deuda" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;sequence&gt;
 *                                                           &lt;element name="Cuenta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                                           &lt;element name="CodigoEntidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                                           &lt;element name="NombreEntidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                                           &lt;element name="Monto" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                                                         &lt;/sequence&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                     &lt;attribute name="valor" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                     &lt;attribute name="flag" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
    "entidadesCalificaciones",
    "periodos",
    "avalistas",
    "microfinanzas"
})
@XmlRootElement(name = "SistemaFinancieroRegulado")
public class SistemaFinancieroRegulado {

    @XmlElement(nillable = true)
    protected List<SistemaFinancieroRegulado.EntidadesCalificaciones> entidadesCalificaciones;
    @XmlElement(nillable = true)
    protected List<SistemaFinancieroRegulado.Periodos> periodos;
    @XmlElement(name = "Avalistas")
    protected SistemaFinancieroRegulado.Avalistas avalistas;
    @XmlElement(name = "Microfinanzas")
    protected SistemaFinancieroRegulado.Microfinanzas microfinanzas;

    /**
     * Gets the value of the entidadesCalificaciones property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entidadesCalificaciones property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntidadesCalificaciones().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SistemaFinancieroRegulado.EntidadesCalificaciones }
     * 
     * 
     */
    public List<SistemaFinancieroRegulado.EntidadesCalificaciones> getEntidadesCalificaciones() {
        if (entidadesCalificaciones == null) {
            entidadesCalificaciones = new ArrayList<SistemaFinancieroRegulado.EntidadesCalificaciones>();
        }
        return this.entidadesCalificaciones;
    }

    /**
     * Gets the value of the periodos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the periodos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPeriodos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SistemaFinancieroRegulado.Periodos }
     * 
     * 
     */
    public List<SistemaFinancieroRegulado.Periodos> getPeriodos() {
        if (periodos == null) {
            periodos = new ArrayList<SistemaFinancieroRegulado.Periodos>();
        }
        return this.periodos;
    }

    /**
     * Obtiene el valor de la propiedad avalistas.
     * 
     * @return
     *     possible object is
     *     {@link SistemaFinancieroRegulado.Avalistas }
     *     
     */
    public SistemaFinancieroRegulado.Avalistas getAvalistas() {
        return avalistas;
    }

    /**
     * Define el valor de la propiedad avalistas.
     * 
     * @param value
     *     allowed object is
     *     {@link SistemaFinancieroRegulado.Avalistas }
     *     
     */
    public void setAvalistas(SistemaFinancieroRegulado.Avalistas value) {
        this.avalistas = value;
    }

    /**
     * Obtiene el valor de la propiedad microfinanzas.
     * 
     * @return
     *     possible object is
     *     {@link SistemaFinancieroRegulado.Microfinanzas }
     *     
     */
    public SistemaFinancieroRegulado.Microfinanzas getMicrofinanzas() {
        return microfinanzas;
    }

    /**
     * Define el valor de la propiedad microfinanzas.
     * 
     * @param value
     *     allowed object is
     *     {@link SistemaFinancieroRegulado.Microfinanzas }
     *     
     */
    public void setMicrofinanzas(SistemaFinancieroRegulado.Microfinanzas value) {
        this.microfinanzas = value;
    }


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
     *         &lt;element name="Aval" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="TipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NumeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NombreAval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="Entidades" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Entidad" maxOccurs="unbounded" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                       &lt;element name="Periodos" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;sequence&gt;
     *                                                 &lt;element name="Periodo" maxOccurs="unbounded" minOccurs="0"&gt;
     *                                                   &lt;complexType&gt;
     *                                                     &lt;complexContent&gt;
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                                         &lt;sequence&gt;
     *                                                           &lt;element name="Calificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                                           &lt;element name="Saldo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                                                         &lt;/sequence&gt;
     *                                                         &lt;attribute name="periodo" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                                       &lt;/restriction&gt;
     *                                                     &lt;/complexContent&gt;
     *                                                   &lt;/complexType&gt;
     *                                                 &lt;/element&gt;
     *                                               &lt;/sequence&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
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
        "aval"
    })
    public static class Avalistas {

        @XmlElement(name = "Aval")
        protected List<SistemaFinancieroRegulado.Avalistas.Aval> aval;

        /**
         * Gets the value of the aval property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the aval property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAval().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SistemaFinancieroRegulado.Avalistas.Aval }
         * 
         * 
         */
        public List<SistemaFinancieroRegulado.Avalistas.Aval> getAval() {
            if (aval == null) {
                aval = new ArrayList<SistemaFinancieroRegulado.Avalistas.Aval>();
            }
            return this.aval;
        }


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
         *         &lt;element name="TipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NumeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NombreAval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="Entidades" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Entidad" maxOccurs="unbounded" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                             &lt;element name="Periodos" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;sequence&gt;
         *                                       &lt;element name="Periodo" maxOccurs="unbounded" minOccurs="0"&gt;
         *                                         &lt;complexType&gt;
         *                                           &lt;complexContent&gt;
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                               &lt;sequence&gt;
         *                                                 &lt;element name="Calificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                                                 &lt;element name="Saldo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *                                               &lt;/sequence&gt;
         *                                               &lt;attribute name="periodo" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                                             &lt;/restriction&gt;
         *                                           &lt;/complexContent&gt;
         *                                         &lt;/complexType&gt;
         *                                       &lt;/element&gt;
         *                                     &lt;/sequence&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
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
            "tipoDocumento",
            "numeroDocumento",
            "nombreAval",
            "entidades"
        })
        public static class Aval {

            @XmlElement(name = "TipoDocumento")
            protected String tipoDocumento;
            @XmlElement(name = "NumeroDocumento")
            protected String numeroDocumento;
            @XmlElement(name = "NombreAval")
            protected String nombreAval;
            @XmlElement(name = "Entidades")
            protected SistemaFinancieroRegulado.Avalistas.Aval.Entidades entidades;

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
             * Obtiene el valor de la propiedad nombreAval.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNombreAval() {
                return nombreAval;
            }

            /**
             * Define el valor de la propiedad nombreAval.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNombreAval(String value) {
                this.nombreAval = value;
            }

            /**
             * Obtiene el valor de la propiedad entidades.
             * 
             * @return
             *     possible object is
             *     {@link SistemaFinancieroRegulado.Avalistas.Aval.Entidades }
             *     
             */
            public SistemaFinancieroRegulado.Avalistas.Aval.Entidades getEntidades() {
                return entidades;
            }

            /**
             * Define el valor de la propiedad entidades.
             * 
             * @param value
             *     allowed object is
             *     {@link SistemaFinancieroRegulado.Avalistas.Aval.Entidades }
             *     
             */
            public void setEntidades(SistemaFinancieroRegulado.Avalistas.Aval.Entidades value) {
                this.entidades = value;
            }


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
             *         &lt;element name="Entidad" maxOccurs="unbounded" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                   &lt;element name="Periodos" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;sequence&gt;
             *                             &lt;element name="Periodo" maxOccurs="unbounded" minOccurs="0"&gt;
             *                               &lt;complexType&gt;
             *                                 &lt;complexContent&gt;
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                                     &lt;sequence&gt;
             *                                       &lt;element name="Calificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                                       &lt;element name="Saldo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
             *                                     &lt;/sequence&gt;
             *                                     &lt;attribute name="periodo" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                                   &lt;/restriction&gt;
             *                                 &lt;/complexContent&gt;
             *                               &lt;/complexType&gt;
             *                             &lt;/element&gt;
             *                           &lt;/sequence&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                 &lt;/sequence&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
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
                "entidad"
            })
            public static class Entidades {

                @XmlElement(name = "Entidad")
                protected List<SistemaFinancieroRegulado.Avalistas.Aval.Entidades.Entidad> entidad;

                /**
                 * Gets the value of the entidad property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the entidad property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getEntidad().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link SistemaFinancieroRegulado.Avalistas.Aval.Entidades.Entidad }
                 * 
                 * 
                 */
                public List<SistemaFinancieroRegulado.Avalistas.Aval.Entidades.Entidad> getEntidad() {
                    if (entidad == null) {
                        entidad = new ArrayList<SistemaFinancieroRegulado.Avalistas.Aval.Entidades.Entidad>();
                    }
                    return this.entidad;
                }


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
                 *         &lt;element name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *         &lt;element name="Periodos" minOccurs="0"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;sequence&gt;
                 *                   &lt;element name="Periodo" maxOccurs="unbounded" minOccurs="0"&gt;
                 *                     &lt;complexType&gt;
                 *                       &lt;complexContent&gt;
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                           &lt;sequence&gt;
                 *                             &lt;element name="Calificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *                             &lt;element name="Saldo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
                 *                           &lt;/sequence&gt;
                 *                           &lt;attribute name="periodo" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *                         &lt;/restriction&gt;
                 *                       &lt;/complexContent&gt;
                 *                     &lt;/complexType&gt;
                 *                   &lt;/element&gt;
                 *                 &lt;/sequence&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
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
                    "descripcion",
                    "periodos"
                })
                public static class Entidad {

                    @XmlElement(name = "Descripcion")
                    protected String descripcion;
                    @XmlElement(name = "Periodos")
                    protected SistemaFinancieroRegulado.Avalistas.Aval.Entidades.Entidad.Periodos periodos;

                    /**
                     * Obtiene el valor de la propiedad descripcion.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDescripcion() {
                        return descripcion;
                    }

                    /**
                     * Define el valor de la propiedad descripcion.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDescripcion(String value) {
                        this.descripcion = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad periodos.
                     * 
                     * @return
                     *     possible object is
                     *     {@link SistemaFinancieroRegulado.Avalistas.Aval.Entidades.Entidad.Periodos }
                     *     
                     */
                    public SistemaFinancieroRegulado.Avalistas.Aval.Entidades.Entidad.Periodos getPeriodos() {
                        return periodos;
                    }

                    /**
                     * Define el valor de la propiedad periodos.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link SistemaFinancieroRegulado.Avalistas.Aval.Entidades.Entidad.Periodos }
                     *     
                     */
                    public void setPeriodos(SistemaFinancieroRegulado.Avalistas.Aval.Entidades.Entidad.Periodos value) {
                        this.periodos = value;
                    }


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
                     *         &lt;element name="Periodo" maxOccurs="unbounded" minOccurs="0"&gt;
                     *           &lt;complexType&gt;
                     *             &lt;complexContent&gt;
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                     *                 &lt;sequence&gt;
                     *                   &lt;element name="Calificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                     *                   &lt;element name="Saldo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
                     *                 &lt;/sequence&gt;
                     *                 &lt;attribute name="periodo" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                     *               &lt;/restriction&gt;
                     *             &lt;/complexContent&gt;
                     *           &lt;/complexType&gt;
                     *         &lt;/element&gt;
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
                        "periodo"
                    })
                    public static class Periodos {

                        @XmlElement(name = "Periodo")
                        protected List<SistemaFinancieroRegulado.Avalistas.Aval.Entidades.Entidad.Periodos.Periodo> periodo;

                        /**
                         * Gets the value of the periodo property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the periodo property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getPeriodo().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link SistemaFinancieroRegulado.Avalistas.Aval.Entidades.Entidad.Periodos.Periodo }
                         * 
                         * 
                         */
                        public List<SistemaFinancieroRegulado.Avalistas.Aval.Entidades.Entidad.Periodos.Periodo> getPeriodo() {
                            if (periodo == null) {
                                periodo = new ArrayList<SistemaFinancieroRegulado.Avalistas.Aval.Entidades.Entidad.Periodos.Periodo>();
                            }
                            return this.periodo;
                        }


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
                         *         &lt;element name="Calificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                         *         &lt;element name="Saldo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
                        @XmlType(name = "", propOrder = {
                            "calificacion",
                            "saldo"
                        })
                        public static class Periodo {

                            @XmlElement(name = "Calificacion")
                            protected String calificacion;
                            @XmlElement(name = "Saldo")
                            protected BigDecimal saldo;
                            @XmlAttribute(name = "periodo")
                            protected String periodo;

                            /**
                             * Obtiene el valor de la propiedad calificacion.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getCalificacion() {
                                return calificacion;
                            }

                            /**
                             * Define el valor de la propiedad calificacion.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setCalificacion(String value) {
                                this.calificacion = value;
                            }

                            /**
                             * Obtiene el valor de la propiedad saldo.
                             * 
                             * @return
                             *     possible object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public BigDecimal getSaldo() {
                                return saldo;
                            }

                            /**
                             * Define el valor de la propiedad saldo.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public void setSaldo(BigDecimal value) {
                                this.saldo = value;
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

                    }

                }

            }

        }

    }


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
     *         &lt;element name="entidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="period1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="period2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="period3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="period4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="period5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="period6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="period7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="period8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="period9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="period10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="period11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="period12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="period13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="period14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="period15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "entidad",
        "period1",
        "period2",
        "period3",
        "period4",
        "period5",
        "period6",
        "period7",
        "period8",
        "period9",
        "period10",
        "period11",
        "period12",
        "period13",
        "period14",
        "period15"
    })
    public static class EntidadesCalificaciones {

        @XmlElementRef(name = "entidad", type = JAXBElement.class, required = false)
        protected JAXBElement<String> entidad;
        @XmlElementRef(name = "period1", type = JAXBElement.class, required = false)
        protected JAXBElement<String> period1;
        @XmlElementRef(name = "period2", type = JAXBElement.class, required = false)
        protected JAXBElement<String> period2;
        @XmlElementRef(name = "period3", type = JAXBElement.class, required = false)
        protected JAXBElement<String> period3;
        @XmlElementRef(name = "period4", type = JAXBElement.class, required = false)
        protected JAXBElement<String> period4;
        @XmlElementRef(name = "period5", type = JAXBElement.class, required = false)
        protected JAXBElement<String> period5;
        @XmlElementRef(name = "period6", type = JAXBElement.class, required = false)
        protected JAXBElement<String> period6;
        @XmlElementRef(name = "period7", type = JAXBElement.class, required = false)
        protected JAXBElement<String> period7;
        @XmlElementRef(name = "period8", type = JAXBElement.class, required = false)
        protected JAXBElement<String> period8;
        @XmlElementRef(name = "period9", type = JAXBElement.class, required = false)
        protected JAXBElement<String> period9;
        @XmlElementRef(name = "period10", type = JAXBElement.class, required = false)
        protected JAXBElement<String> period10;
        @XmlElementRef(name = "period11", type = JAXBElement.class, required = false)
        protected JAXBElement<String> period11;
        @XmlElementRef(name = "period12", type = JAXBElement.class, required = false)
        protected JAXBElement<String> period12;
        @XmlElementRef(name = "period13", type = JAXBElement.class, required = false)
        protected JAXBElement<String> period13;
        @XmlElementRef(name = "period14", type = JAXBElement.class, required = false)
        protected JAXBElement<String> period14;
        @XmlElementRef(name = "period15", type = JAXBElement.class, required = false)
        protected JAXBElement<String> period15;

        /**
         * Obtiene el valor de la propiedad entidad.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getEntidad() {
            return entidad;
        }

        /**
         * Define el valor de la propiedad entidad.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setEntidad(JAXBElement<String> value) {
            this.entidad = value;
        }

        /**
         * Obtiene el valor de la propiedad period1.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPeriod1() {
            return period1;
        }

        /**
         * Define el valor de la propiedad period1.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPeriod1(JAXBElement<String> value) {
            this.period1 = value;
        }

        /**
         * Obtiene el valor de la propiedad period2.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPeriod2() {
            return period2;
        }

        /**
         * Define el valor de la propiedad period2.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPeriod2(JAXBElement<String> value) {
            this.period2 = value;
        }

        /**
         * Obtiene el valor de la propiedad period3.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPeriod3() {
            return period3;
        }

        /**
         * Define el valor de la propiedad period3.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPeriod3(JAXBElement<String> value) {
            this.period3 = value;
        }

        /**
         * Obtiene el valor de la propiedad period4.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPeriod4() {
            return period4;
        }

        /**
         * Define el valor de la propiedad period4.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPeriod4(JAXBElement<String> value) {
            this.period4 = value;
        }

        /**
         * Obtiene el valor de la propiedad period5.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPeriod5() {
            return period5;
        }

        /**
         * Define el valor de la propiedad period5.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPeriod5(JAXBElement<String> value) {
            this.period5 = value;
        }

        /**
         * Obtiene el valor de la propiedad period6.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPeriod6() {
            return period6;
        }

        /**
         * Define el valor de la propiedad period6.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPeriod6(JAXBElement<String> value) {
            this.period6 = value;
        }

        /**
         * Obtiene el valor de la propiedad period7.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPeriod7() {
            return period7;
        }

        /**
         * Define el valor de la propiedad period7.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPeriod7(JAXBElement<String> value) {
            this.period7 = value;
        }

        /**
         * Obtiene el valor de la propiedad period8.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPeriod8() {
            return period8;
        }

        /**
         * Define el valor de la propiedad period8.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPeriod8(JAXBElement<String> value) {
            this.period8 = value;
        }

        /**
         * Obtiene el valor de la propiedad period9.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPeriod9() {
            return period9;
        }

        /**
         * Define el valor de la propiedad period9.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPeriod9(JAXBElement<String> value) {
            this.period9 = value;
        }

        /**
         * Obtiene el valor de la propiedad period10.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPeriod10() {
            return period10;
        }

        /**
         * Define el valor de la propiedad period10.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPeriod10(JAXBElement<String> value) {
            this.period10 = value;
        }

        /**
         * Obtiene el valor de la propiedad period11.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPeriod11() {
            return period11;
        }

        /**
         * Define el valor de la propiedad period11.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPeriod11(JAXBElement<String> value) {
            this.period11 = value;
        }

        /**
         * Obtiene el valor de la propiedad period12.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPeriod12() {
            return period12;
        }

        /**
         * Define el valor de la propiedad period12.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPeriod12(JAXBElement<String> value) {
            this.period12 = value;
        }

        /**
         * Obtiene el valor de la propiedad period13.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPeriod13() {
            return period13;
        }

        /**
         * Define el valor de la propiedad period13.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPeriod13(JAXBElement<String> value) {
            this.period13 = value;
        }

        /**
         * Obtiene el valor de la propiedad period14.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPeriod14() {
            return period14;
        }

        /**
         * Define el valor de la propiedad period14.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPeriod14(JAXBElement<String> value) {
            this.period14 = value;
        }

        /**
         * Obtiene el valor de la propiedad period15.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPeriod15() {
            return period15;
        }

        /**
         * Define el valor de la propiedad period15.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPeriod15(JAXBElement<String> value) {
            this.period15 = value;
        }

    }


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
     *         &lt;element name="CalificacionEntidad" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Entidades" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Entidad" maxOccurs="unbounded" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="Codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                       &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                       &lt;element name="Calificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                           &lt;attribute name="periodo" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                           &lt;attribute name="flag" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Periodos" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Periodo" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="NroEntidades" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="Calificaciones" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="NOR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                       &lt;element name="CPP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                       &lt;element name="DEF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                       &lt;element name="DUD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                       &lt;element name="PER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="Deudas" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="Deuda" maxOccurs="unbounded" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;sequence&gt;
     *                                                 &lt;element name="Cuenta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                                 &lt;element name="CodigoEntidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                                 &lt;element name="NombreEntidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                                 &lt;element name="Monto" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                                               &lt;/sequence&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                           &lt;attribute name="valor" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                           &lt;attribute name="flag" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
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
        "calificacionEntidad",
        "periodos"
    })
    public static class Microfinanzas {

        @XmlElement(name = "CalificacionEntidad")
        protected SistemaFinancieroRegulado.Microfinanzas.CalificacionEntidad calificacionEntidad;
        @XmlElement(name = "Periodos")
        protected SistemaFinancieroRegulado.Microfinanzas.Periodos periodos;

        /**
         * Obtiene el valor de la propiedad calificacionEntidad.
         * 
         * @return
         *     possible object is
         *     {@link SistemaFinancieroRegulado.Microfinanzas.CalificacionEntidad }
         *     
         */
        public SistemaFinancieroRegulado.Microfinanzas.CalificacionEntidad getCalificacionEntidad() {
            return calificacionEntidad;
        }

        /**
         * Define el valor de la propiedad calificacionEntidad.
         * 
         * @param value
         *     allowed object is
         *     {@link SistemaFinancieroRegulado.Microfinanzas.CalificacionEntidad }
         *     
         */
        public void setCalificacionEntidad(SistemaFinancieroRegulado.Microfinanzas.CalificacionEntidad value) {
            this.calificacionEntidad = value;
        }

        /**
         * Obtiene el valor de la propiedad periodos.
         * 
         * @return
         *     possible object is
         *     {@link SistemaFinancieroRegulado.Microfinanzas.Periodos }
         *     
         */
        public SistemaFinancieroRegulado.Microfinanzas.Periodos getPeriodos() {
            return periodos;
        }

        /**
         * Define el valor de la propiedad periodos.
         * 
         * @param value
         *     allowed object is
         *     {@link SistemaFinancieroRegulado.Microfinanzas.Periodos }
         *     
         */
        public void setPeriodos(SistemaFinancieroRegulado.Microfinanzas.Periodos value) {
            this.periodos = value;
        }


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
         *         &lt;element name="Entidades" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Entidad" maxOccurs="unbounded" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="Codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                             &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                             &lt;element name="Calificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *                 &lt;attribute name="periodo" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                 &lt;attribute name="flag" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
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
            "entidades"
        })
        public static class CalificacionEntidad {

            @XmlElement(name = "Entidades")
            protected List<SistemaFinancieroRegulado.Microfinanzas.CalificacionEntidad.Entidades> entidades;

            /**
             * Gets the value of the entidades property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the entidades property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getEntidades().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link SistemaFinancieroRegulado.Microfinanzas.CalificacionEntidad.Entidades }
             * 
             * 
             */
            public List<SistemaFinancieroRegulado.Microfinanzas.CalificacionEntidad.Entidades> getEntidades() {
                if (entidades == null) {
                    entidades = new ArrayList<SistemaFinancieroRegulado.Microfinanzas.CalificacionEntidad.Entidades>();
                }
                return this.entidades;
            }


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
             *         &lt;element name="Entidad" maxOccurs="unbounded" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="Codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                   &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                   &lt;element name="Calificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                 &lt;/sequence&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *       &lt;/sequence&gt;
             *       &lt;attribute name="periodo" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *       &lt;attribute name="flag" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "entidad"
            })
            public static class Entidades {

                @XmlElement(name = "Entidad")
                protected List<SistemaFinancieroRegulado.Microfinanzas.CalificacionEntidad.Entidades.Entidad> entidad;
                @XmlAttribute(name = "periodo")
                protected String periodo;
                @XmlAttribute(name = "flag", required = true)
                protected boolean flag;

                /**
                 * Gets the value of the entidad property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the entidad property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getEntidad().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link SistemaFinancieroRegulado.Microfinanzas.CalificacionEntidad.Entidades.Entidad }
                 * 
                 * 
                 */
                public List<SistemaFinancieroRegulado.Microfinanzas.CalificacionEntidad.Entidades.Entidad> getEntidad() {
                    if (entidad == null) {
                        entidad = new ArrayList<SistemaFinancieroRegulado.Microfinanzas.CalificacionEntidad.Entidades.Entidad>();
                    }
                    return this.entidad;
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

                /**
                 * Obtiene el valor de la propiedad flag.
                 * 
                 */
                public boolean isFlag() {
                    return flag;
                }

                /**
                 * Define el valor de la propiedad flag.
                 * 
                 */
                public void setFlag(boolean value) {
                    this.flag = value;
                }


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
                 *         &lt;element name="Codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *         &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *         &lt;element name="Calificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
                    "codigo",
                    "nombre",
                    "calificacion"
                })
                public static class Entidad {

                    @XmlElement(name = "Codigo")
                    protected String codigo;
                    @XmlElement(name = "Nombre")
                    protected String nombre;
                    @XmlElement(name = "Calificacion")
                    protected String calificacion;

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
                     * Obtiene el valor de la propiedad calificacion.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCalificacion() {
                        return calificacion;
                    }

                    /**
                     * Define el valor de la propiedad calificacion.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCalificacion(String value) {
                        this.calificacion = value;
                    }

                }

            }

        }


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
         *         &lt;element name="Periodo" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="NroEntidades" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="Calificaciones" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="NOR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                             &lt;element name="CPP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                             &lt;element name="DEF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                             &lt;element name="DUD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                             &lt;element name="PER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="Deudas" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="Deuda" maxOccurs="unbounded" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;sequence&gt;
         *                                       &lt;element name="Cuenta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                                       &lt;element name="CodigoEntidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                                       &lt;element name="NombreEntidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                                       &lt;element name="Monto" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *                                     &lt;/sequence&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *                 &lt;attribute name="valor" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                 &lt;attribute name="flag" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
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
            "periodo"
        })
        public static class Periodos {

            @XmlElement(name = "Periodo", nillable = true)
            protected List<SistemaFinancieroRegulado.Microfinanzas.Periodos.Periodo> periodo;

            /**
             * Gets the value of the periodo property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the periodo property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPeriodo().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link SistemaFinancieroRegulado.Microfinanzas.Periodos.Periodo }
             * 
             * 
             */
            public List<SistemaFinancieroRegulado.Microfinanzas.Periodos.Periodo> getPeriodo() {
                if (periodo == null) {
                    periodo = new ArrayList<SistemaFinancieroRegulado.Microfinanzas.Periodos.Periodo>();
                }
                return this.periodo;
            }


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
             *         &lt;element name="NroEntidades" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;element name="Calificaciones" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="NOR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                   &lt;element name="CPP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                   &lt;element name="DEF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                   &lt;element name="DUD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                   &lt;element name="PER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                 &lt;/sequence&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="Deudas" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="Deuda" maxOccurs="unbounded" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;sequence&gt;
             *                             &lt;element name="Cuenta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                             &lt;element name="CodigoEntidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                             &lt;element name="NombreEntidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                             &lt;element name="Monto" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
             *                           &lt;/sequence&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                 &lt;/sequence&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *       &lt;/sequence&gt;
             *       &lt;attribute name="valor" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *       &lt;attribute name="flag" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "nroEntidades",
                "calificaciones",
                "deudas"
            })
            public static class Periodo {

                @XmlElement(name = "NroEntidades")
                protected String nroEntidades;
                @XmlElement(name = "Calificaciones")
                protected SistemaFinancieroRegulado.Microfinanzas.Periodos.Periodo.Calificaciones calificaciones;
                @XmlElement(name = "Deudas")
                protected SistemaFinancieroRegulado.Microfinanzas.Periodos.Periodo.Deudas deudas;
                @XmlAttribute(name = "valor")
                protected String valor;
                @XmlAttribute(name = "flag", required = true)
                protected boolean flag;

                /**
                 * Obtiene el valor de la propiedad nroEntidades.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNroEntidades() {
                    return nroEntidades;
                }

                /**
                 * Define el valor de la propiedad nroEntidades.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNroEntidades(String value) {
                    this.nroEntidades = value;
                }

                /**
                 * Obtiene el valor de la propiedad calificaciones.
                 * 
                 * @return
                 *     possible object is
                 *     {@link SistemaFinancieroRegulado.Microfinanzas.Periodos.Periodo.Calificaciones }
                 *     
                 */
                public SistemaFinancieroRegulado.Microfinanzas.Periodos.Periodo.Calificaciones getCalificaciones() {
                    return calificaciones;
                }

                /**
                 * Define el valor de la propiedad calificaciones.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SistemaFinancieroRegulado.Microfinanzas.Periodos.Periodo.Calificaciones }
                 *     
                 */
                public void setCalificaciones(SistemaFinancieroRegulado.Microfinanzas.Periodos.Periodo.Calificaciones value) {
                    this.calificaciones = value;
                }

                /**
                 * Obtiene el valor de la propiedad deudas.
                 * 
                 * @return
                 *     possible object is
                 *     {@link SistemaFinancieroRegulado.Microfinanzas.Periodos.Periodo.Deudas }
                 *     
                 */
                public SistemaFinancieroRegulado.Microfinanzas.Periodos.Periodo.Deudas getDeudas() {
                    return deudas;
                }

                /**
                 * Define el valor de la propiedad deudas.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SistemaFinancieroRegulado.Microfinanzas.Periodos.Periodo.Deudas }
                 *     
                 */
                public void setDeudas(SistemaFinancieroRegulado.Microfinanzas.Periodos.Periodo.Deudas value) {
                    this.deudas = value;
                }

                /**
                 * Obtiene el valor de la propiedad valor.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getValor() {
                    return valor;
                }

                /**
                 * Define el valor de la propiedad valor.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setValor(String value) {
                    this.valor = value;
                }

                /**
                 * Obtiene el valor de la propiedad flag.
                 * 
                 */
                public boolean isFlag() {
                    return flag;
                }

                /**
                 * Define el valor de la propiedad flag.
                 * 
                 */
                public void setFlag(boolean value) {
                    this.flag = value;
                }


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
                 *         &lt;element name="NOR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *         &lt;element name="CPP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *         &lt;element name="DEF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *         &lt;element name="DUD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *         &lt;element name="PER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
                    "nor",
                    "cpp",
                    "def",
                    "dud",
                    "per"
                })
                public static class Calificaciones {

                    @XmlElement(name = "NOR", defaultValue = "")
                    protected String nor;
                    @XmlElement(name = "CPP", defaultValue = "")
                    protected String cpp;
                    @XmlElement(name = "DEF", defaultValue = "")
                    protected String def;
                    @XmlElement(name = "DUD", defaultValue = "")
                    protected String dud;
                    @XmlElement(name = "PER", defaultValue = "")
                    protected String per;

                    /**
                     * Obtiene el valor de la propiedad nor.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNOR() {
                        return nor;
                    }

                    /**
                     * Define el valor de la propiedad nor.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNOR(String value) {
                        this.nor = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad cpp.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCPP() {
                        return cpp;
                    }

                    /**
                     * Define el valor de la propiedad cpp.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCPP(String value) {
                        this.cpp = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad def.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDEF() {
                        return def;
                    }

                    /**
                     * Define el valor de la propiedad def.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDEF(String value) {
                        this.def = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad dud.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDUD() {
                        return dud;
                    }

                    /**
                     * Define el valor de la propiedad dud.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDUD(String value) {
                        this.dud = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad per.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPER() {
                        return per;
                    }

                    /**
                     * Define el valor de la propiedad per.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPER(String value) {
                        this.per = value;
                    }

                }


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
                 *         &lt;element name="Deuda" maxOccurs="unbounded" minOccurs="0"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;sequence&gt;
                 *                   &lt;element name="Cuenta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *                   &lt;element name="CodigoEntidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *                   &lt;element name="NombreEntidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *                   &lt;element name="Monto" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
                 *                 &lt;/sequence&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
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
                    "deuda"
                })
                public static class Deudas {

                    @XmlElement(name = "Deuda", nillable = true)
                    protected List<SistemaFinancieroRegulado.Microfinanzas.Periodos.Periodo.Deudas.Deuda> deuda;

                    /**
                     * Gets the value of the deuda property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the deuda property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getDeuda().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link SistemaFinancieroRegulado.Microfinanzas.Periodos.Periodo.Deudas.Deuda }
                     * 
                     * 
                     */
                    public List<SistemaFinancieroRegulado.Microfinanzas.Periodos.Periodo.Deudas.Deuda> getDeuda() {
                        if (deuda == null) {
                            deuda = new ArrayList<SistemaFinancieroRegulado.Microfinanzas.Periodos.Periodo.Deudas.Deuda>();
                        }
                        return this.deuda;
                    }


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
                     *         &lt;element name="Cuenta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                     *         &lt;element name="CodigoEntidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                     *         &lt;element name="NombreEntidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                     *         &lt;element name="Monto" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
                        "cuenta",
                        "codigoEntidad",
                        "nombreEntidad",
                        "monto"
                    })
                    public static class Deuda {

                        @XmlElementRef(name = "Cuenta", type = JAXBElement.class, required = false)
                        protected JAXBElement<String> cuenta;
                        @XmlElementRef(name = "CodigoEntidad", type = JAXBElement.class, required = false)
                        protected JAXBElement<String> codigoEntidad;
                        @XmlElementRef(name = "NombreEntidad", type = JAXBElement.class, required = false)
                        protected JAXBElement<String> nombreEntidad;
                        @XmlElementRef(name = "Monto", type = JAXBElement.class, required = false)
                        protected JAXBElement<BigDecimal> monto;

                        /**
                         * Obtiene el valor de la propiedad cuenta.
                         * 
                         * @return
                         *     possible object is
                         *     {@link JAXBElement }{@code <}{@link String }{@code >}
                         *     
                         */
                        public JAXBElement<String> getCuenta() {
                            return cuenta;
                        }

                        /**
                         * Define el valor de la propiedad cuenta.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link JAXBElement }{@code <}{@link String }{@code >}
                         *     
                         */
                        public void setCuenta(JAXBElement<String> value) {
                            this.cuenta = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad codigoEntidad.
                         * 
                         * @return
                         *     possible object is
                         *     {@link JAXBElement }{@code <}{@link String }{@code >}
                         *     
                         */
                        public JAXBElement<String> getCodigoEntidad() {
                            return codigoEntidad;
                        }

                        /**
                         * Define el valor de la propiedad codigoEntidad.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link JAXBElement }{@code <}{@link String }{@code >}
                         *     
                         */
                        public void setCodigoEntidad(JAXBElement<String> value) {
                            this.codigoEntidad = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad nombreEntidad.
                         * 
                         * @return
                         *     possible object is
                         *     {@link JAXBElement }{@code <}{@link String }{@code >}
                         *     
                         */
                        public JAXBElement<String> getNombreEntidad() {
                            return nombreEntidad;
                        }

                        /**
                         * Define el valor de la propiedad nombreEntidad.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link JAXBElement }{@code <}{@link String }{@code >}
                         *     
                         */
                        public void setNombreEntidad(JAXBElement<String> value) {
                            this.nombreEntidad = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad monto.
                         * 
                         * @return
                         *     possible object is
                         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                         *     
                         */
                        public JAXBElement<BigDecimal> getMonto() {
                            return monto;
                        }

                        /**
                         * Define el valor de la propiedad monto.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                         *     
                         */
                        public void setMonto(JAXBElement<BigDecimal> value) {
                            this.monto = value;
                        }

                    }

                }

            }

        }

    }


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
     *         &lt;element name="periodo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "periodo"
    })
    public static class Periodos {

        @XmlElementRef(name = "periodo", type = JAXBElement.class, required = false)
        protected JAXBElement<String> periodo;

        /**
         * Obtiene el valor de la propiedad periodo.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPeriodo() {
            return periodo;
        }

        /**
         * Define el valor de la propiedad periodo.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPeriodo(JAXBElement<String> value) {
            this.periodo = value;
        }

    }

}
