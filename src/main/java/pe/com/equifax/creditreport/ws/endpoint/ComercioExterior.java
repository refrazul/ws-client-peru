
package pe.com.equifax.creditreport.ws.endpoint;

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
 *         &lt;element name="ComercioExteriorAnual" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
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
 *                                       &lt;element name="Importaciones" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="Importacion" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;sequence&gt;
 *                                                           &lt;element name="NumeroOperacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                                           &lt;element name="TotalFOB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                                           &lt;element name="PaisProcedencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
 *                                       &lt;element name="Exportaciones" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="Exportacion" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;sequence&gt;
 *                                                           &lt;element name="NumeroOperacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                                           &lt;element name="TotalFOB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                                           &lt;element name="PaisDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
 *         &lt;element name="ComercioExteriorMensual" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
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
 *                                       &lt;element name="Importaciones" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="Importacion" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;sequence&gt;
 *                                                           &lt;element name="NumeroOperacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                                           &lt;element name="TotalFOB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                                           &lt;element name="PaisProcedencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
 *                                       &lt;element name="Exportaciones" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="Exportacion" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;sequence&gt;
 *                                                           &lt;element name="NumeroOperacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                                           &lt;element name="TotalFOB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                                           &lt;element name="PaisDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
 *         &lt;element name="ComercioExteriorPais" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Paises" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Pais" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Importaciones" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="Importacion" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;sequence&gt;
 *                                                           &lt;element name="PrimerMovimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                                           &lt;element name="UltimoMovimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                                           &lt;element name="NumeroOperaciones" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                                           &lt;element name="TotalFOB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
 *                                       &lt;element name="Exportaciones" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="Exportacion" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;sequence&gt;
 *                                                           &lt;element name="PrimerMovimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                                           &lt;element name="UltimoMovimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                                           &lt;element name="NumeroOperaciones" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                                           &lt;element name="TotalFOB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "comercioExteriorAnual",
    "comercioExteriorMensual",
    "comercioExteriorPais"
})
@XmlRootElement(name = "ComercioExterior")
public class ComercioExterior {

    @XmlElementRef(name = "ComercioExteriorAnual", type = JAXBElement.class, required = false)
    protected JAXBElement<ComercioExterior.ComercioExteriorAnual> comercioExteriorAnual;
    @XmlElementRef(name = "ComercioExteriorMensual", type = JAXBElement.class, required = false)
    protected JAXBElement<ComercioExterior.ComercioExteriorMensual> comercioExteriorMensual;
    @XmlElementRef(name = "ComercioExteriorPais", type = JAXBElement.class, required = false)
    protected JAXBElement<ComercioExterior.ComercioExteriorPais> comercioExteriorPais;

    /**
     * Obtiene el valor de la propiedad comercioExteriorAnual.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ComercioExterior.ComercioExteriorAnual }{@code >}
     *     
     */
    public JAXBElement<ComercioExterior.ComercioExteriorAnual> getComercioExteriorAnual() {
        return comercioExteriorAnual;
    }

    /**
     * Define el valor de la propiedad comercioExteriorAnual.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ComercioExterior.ComercioExteriorAnual }{@code >}
     *     
     */
    public void setComercioExteriorAnual(JAXBElement<ComercioExterior.ComercioExteriorAnual> value) {
        this.comercioExteriorAnual = value;
    }

    /**
     * Obtiene el valor de la propiedad comercioExteriorMensual.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ComercioExterior.ComercioExteriorMensual }{@code >}
     *     
     */
    public JAXBElement<ComercioExterior.ComercioExteriorMensual> getComercioExteriorMensual() {
        return comercioExteriorMensual;
    }

    /**
     * Define el valor de la propiedad comercioExteriorMensual.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ComercioExterior.ComercioExteriorMensual }{@code >}
     *     
     */
    public void setComercioExteriorMensual(JAXBElement<ComercioExterior.ComercioExteriorMensual> value) {
        this.comercioExteriorMensual = value;
    }

    /**
     * Obtiene el valor de la propiedad comercioExteriorPais.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ComercioExterior.ComercioExteriorPais }{@code >}
     *     
     */
    public JAXBElement<ComercioExterior.ComercioExteriorPais> getComercioExteriorPais() {
        return comercioExteriorPais;
    }

    /**
     * Define el valor de la propiedad comercioExteriorPais.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ComercioExterior.ComercioExteriorPais }{@code >}
     *     
     */
    public void setComercioExteriorPais(JAXBElement<ComercioExterior.ComercioExteriorPais> value) {
        this.comercioExteriorPais = value;
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
     *                             &lt;element name="Importaciones" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="Importacion" maxOccurs="unbounded" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;sequence&gt;
     *                                                 &lt;element name="NumeroOperacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                                 &lt;element name="TotalFOB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                                 &lt;element name="PaisProcedencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
     *                             &lt;element name="Exportaciones" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="Exportacion" maxOccurs="unbounded" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;sequence&gt;
     *                                                 &lt;element name="NumeroOperacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                                 &lt;element name="TotalFOB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                                 &lt;element name="PaisDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "periodos"
    })
    public static class ComercioExteriorAnual {

        @XmlElement(name = "Periodos")
        protected ComercioExterior.ComercioExteriorAnual.Periodos periodos;

        /**
         * Obtiene el valor de la propiedad periodos.
         * 
         * @return
         *     possible object is
         *     {@link ComercioExterior.ComercioExteriorAnual.Periodos }
         *     
         */
        public ComercioExterior.ComercioExteriorAnual.Periodos getPeriodos() {
            return periodos;
        }

        /**
         * Define el valor de la propiedad periodos.
         * 
         * @param value
         *     allowed object is
         *     {@link ComercioExterior.ComercioExteriorAnual.Periodos }
         *     
         */
        public void setPeriodos(ComercioExterior.ComercioExteriorAnual.Periodos value) {
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
         *                   &lt;element name="Importaciones" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="Importacion" maxOccurs="unbounded" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;sequence&gt;
         *                                       &lt;element name="NumeroOperacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                                       &lt;element name="TotalFOB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                                       &lt;element name="PaisProcedencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
         *                   &lt;element name="Exportaciones" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="Exportacion" maxOccurs="unbounded" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;sequence&gt;
         *                                       &lt;element name="NumeroOperacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                                       &lt;element name="TotalFOB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                                       &lt;element name="PaisDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            protected List<ComercioExterior.ComercioExteriorAnual.Periodos.Periodo> periodo;

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
             * {@link ComercioExterior.ComercioExteriorAnual.Periodos.Periodo }
             * 
             * 
             */
            public List<ComercioExterior.ComercioExteriorAnual.Periodos.Periodo> getPeriodo() {
                if (periodo == null) {
                    periodo = new ArrayList<ComercioExterior.ComercioExteriorAnual.Periodos.Periodo>();
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
             *         &lt;element name="Importaciones" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="Importacion" maxOccurs="unbounded" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;sequence&gt;
             *                             &lt;element name="NumeroOperacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                             &lt;element name="TotalFOB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                             &lt;element name="PaisProcedencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
             *         &lt;element name="Exportaciones" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="Exportacion" maxOccurs="unbounded" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;sequence&gt;
             *                             &lt;element name="NumeroOperacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                             &lt;element name="TotalFOB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                             &lt;element name="PaisDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "importaciones",
                "exportaciones"
            })
            public static class Periodo {

                @XmlElementRef(name = "Importaciones", type = JAXBElement.class, required = false)
                protected JAXBElement<ComercioExterior.ComercioExteriorAnual.Periodos.Periodo.Importaciones> importaciones;
                @XmlElementRef(name = "Exportaciones", type = JAXBElement.class, required = false)
                protected JAXBElement<ComercioExterior.ComercioExteriorAnual.Periodos.Periodo.Exportaciones> exportaciones;
                @XmlAttribute(name = "valor")
                protected String valor;

                /**
                 * Obtiene el valor de la propiedad importaciones.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link ComercioExterior.ComercioExteriorAnual.Periodos.Periodo.Importaciones }{@code >}
                 *     
                 */
                public JAXBElement<ComercioExterior.ComercioExteriorAnual.Periodos.Periodo.Importaciones> getImportaciones() {
                    return importaciones;
                }

                /**
                 * Define el valor de la propiedad importaciones.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link ComercioExterior.ComercioExteriorAnual.Periodos.Periodo.Importaciones }{@code >}
                 *     
                 */
                public void setImportaciones(JAXBElement<ComercioExterior.ComercioExteriorAnual.Periodos.Periodo.Importaciones> value) {
                    this.importaciones = value;
                }

                /**
                 * Obtiene el valor de la propiedad exportaciones.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link ComercioExterior.ComercioExteriorAnual.Periodos.Periodo.Exportaciones }{@code >}
                 *     
                 */
                public JAXBElement<ComercioExterior.ComercioExteriorAnual.Periodos.Periodo.Exportaciones> getExportaciones() {
                    return exportaciones;
                }

                /**
                 * Define el valor de la propiedad exportaciones.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link ComercioExterior.ComercioExteriorAnual.Periodos.Periodo.Exportaciones }{@code >}
                 *     
                 */
                public void setExportaciones(JAXBElement<ComercioExterior.ComercioExteriorAnual.Periodos.Periodo.Exportaciones> value) {
                    this.exportaciones = value;
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
                 * <p>Clase Java para anonymous complex type.
                 * 
                 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *       &lt;sequence&gt;
                 *         &lt;element name="Exportacion" maxOccurs="unbounded" minOccurs="0"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;sequence&gt;
                 *                   &lt;element name="NumeroOperacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *                   &lt;element name="TotalFOB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *                   &lt;element name="PaisDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
                    "exportacion"
                })
                public static class Exportaciones {

                    @XmlElement(name = "Exportacion", nillable = true)
                    protected List<ComercioExterior.ComercioExteriorAnual.Periodos.Periodo.Exportaciones.Exportacion> exportacion;

                    /**
                     * Gets the value of the exportacion property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the exportacion property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getExportacion().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link ComercioExterior.ComercioExteriorAnual.Periodos.Periodo.Exportaciones.Exportacion }
                     * 
                     * 
                     */
                    public List<ComercioExterior.ComercioExteriorAnual.Periodos.Periodo.Exportaciones.Exportacion> getExportacion() {
                        if (exportacion == null) {
                            exportacion = new ArrayList<ComercioExterior.ComercioExteriorAnual.Periodos.Periodo.Exportaciones.Exportacion>();
                        }
                        return this.exportacion;
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
                     *         &lt;element name="NumeroOperacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                     *         &lt;element name="TotalFOB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                     *         &lt;element name="PaisDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
                        "numeroOperacion",
                        "totalFOB",
                        "paisDestino"
                    })
                    public static class Exportacion {

                        @XmlElementRef(name = "NumeroOperacion", type = JAXBElement.class, required = false)
                        protected JAXBElement<String> numeroOperacion;
                        @XmlElementRef(name = "TotalFOB", type = JAXBElement.class, required = false)
                        protected JAXBElement<String> totalFOB;
                        @XmlElementRef(name = "PaisDestino", type = JAXBElement.class, required = false)
                        protected JAXBElement<String> paisDestino;

                        /**
                         * Obtiene el valor de la propiedad numeroOperacion.
                         * 
                         * @return
                         *     possible object is
                         *     {@link JAXBElement }{@code <}{@link String }{@code >}
                         *     
                         */
                        public JAXBElement<String> getNumeroOperacion() {
                            return numeroOperacion;
                        }

                        /**
                         * Define el valor de la propiedad numeroOperacion.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link JAXBElement }{@code <}{@link String }{@code >}
                         *     
                         */
                        public void setNumeroOperacion(JAXBElement<String> value) {
                            this.numeroOperacion = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad totalFOB.
                         * 
                         * @return
                         *     possible object is
                         *     {@link JAXBElement }{@code <}{@link String }{@code >}
                         *     
                         */
                        public JAXBElement<String> getTotalFOB() {
                            return totalFOB;
                        }

                        /**
                         * Define el valor de la propiedad totalFOB.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link JAXBElement }{@code <}{@link String }{@code >}
                         *     
                         */
                        public void setTotalFOB(JAXBElement<String> value) {
                            this.totalFOB = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad paisDestino.
                         * 
                         * @return
                         *     possible object is
                         *     {@link JAXBElement }{@code <}{@link String }{@code >}
                         *     
                         */
                        public JAXBElement<String> getPaisDestino() {
                            return paisDestino;
                        }

                        /**
                         * Define el valor de la propiedad paisDestino.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link JAXBElement }{@code <}{@link String }{@code >}
                         *     
                         */
                        public void setPaisDestino(JAXBElement<String> value) {
                            this.paisDestino = value;
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
                 *         &lt;element name="Importacion" maxOccurs="unbounded" minOccurs="0"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;sequence&gt;
                 *                   &lt;element name="NumeroOperacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *                   &lt;element name="TotalFOB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *                   &lt;element name="PaisProcedencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
                    "importacion"
                })
                public static class Importaciones {

                    @XmlElement(name = "Importacion", nillable = true)
                    protected List<ComercioExterior.ComercioExteriorAnual.Periodos.Periodo.Importaciones.Importacion> importacion;

                    /**
                     * Gets the value of the importacion property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the importacion property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getImportacion().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link ComercioExterior.ComercioExteriorAnual.Periodos.Periodo.Importaciones.Importacion }
                     * 
                     * 
                     */
                    public List<ComercioExterior.ComercioExteriorAnual.Periodos.Periodo.Importaciones.Importacion> getImportacion() {
                        if (importacion == null) {
                            importacion = new ArrayList<ComercioExterior.ComercioExteriorAnual.Periodos.Periodo.Importaciones.Importacion>();
                        }
                        return this.importacion;
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
                     *         &lt;element name="NumeroOperacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                     *         &lt;element name="TotalFOB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                     *         &lt;element name="PaisProcedencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
                        "numeroOperacion",
                        "totalFOB",
                        "paisProcedencia"
                    })
                    public static class Importacion {

                        @XmlElementRef(name = "NumeroOperacion", type = JAXBElement.class, required = false)
                        protected JAXBElement<String> numeroOperacion;
                        @XmlElementRef(name = "TotalFOB", type = JAXBElement.class, required = false)
                        protected JAXBElement<String> totalFOB;
                        @XmlElementRef(name = "PaisProcedencia", type = JAXBElement.class, required = false)
                        protected JAXBElement<String> paisProcedencia;

                        /**
                         * Obtiene el valor de la propiedad numeroOperacion.
                         * 
                         * @return
                         *     possible object is
                         *     {@link JAXBElement }{@code <}{@link String }{@code >}
                         *     
                         */
                        public JAXBElement<String> getNumeroOperacion() {
                            return numeroOperacion;
                        }

                        /**
                         * Define el valor de la propiedad numeroOperacion.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link JAXBElement }{@code <}{@link String }{@code >}
                         *     
                         */
                        public void setNumeroOperacion(JAXBElement<String> value) {
                            this.numeroOperacion = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad totalFOB.
                         * 
                         * @return
                         *     possible object is
                         *     {@link JAXBElement }{@code <}{@link String }{@code >}
                         *     
                         */
                        public JAXBElement<String> getTotalFOB() {
                            return totalFOB;
                        }

                        /**
                         * Define el valor de la propiedad totalFOB.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link JAXBElement }{@code <}{@link String }{@code >}
                         *     
                         */
                        public void setTotalFOB(JAXBElement<String> value) {
                            this.totalFOB = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad paisProcedencia.
                         * 
                         * @return
                         *     possible object is
                         *     {@link JAXBElement }{@code <}{@link String }{@code >}
                         *     
                         */
                        public JAXBElement<String> getPaisProcedencia() {
                            return paisProcedencia;
                        }

                        /**
                         * Define el valor de la propiedad paisProcedencia.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link JAXBElement }{@code <}{@link String }{@code >}
                         *     
                         */
                        public void setPaisProcedencia(JAXBElement<String> value) {
                            this.paisProcedencia = value;
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
     *                             &lt;element name="Importaciones" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="Importacion" maxOccurs="unbounded" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;sequence&gt;
     *                                                 &lt;element name="NumeroOperacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                                 &lt;element name="TotalFOB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                                 &lt;element name="PaisProcedencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
     *                             &lt;element name="Exportaciones" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="Exportacion" maxOccurs="unbounded" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;sequence&gt;
     *                                                 &lt;element name="NumeroOperacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                                 &lt;element name="TotalFOB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                                 &lt;element name="PaisDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "periodos"
    })
    public static class ComercioExteriorMensual {

        @XmlElement(name = "Periodos")
        protected ComercioExterior.ComercioExteriorMensual.Periodos periodos;

        /**
         * Obtiene el valor de la propiedad periodos.
         * 
         * @return
         *     possible object is
         *     {@link ComercioExterior.ComercioExteriorMensual.Periodos }
         *     
         */
        public ComercioExterior.ComercioExteriorMensual.Periodos getPeriodos() {
            return periodos;
        }

        /**
         * Define el valor de la propiedad periodos.
         * 
         * @param value
         *     allowed object is
         *     {@link ComercioExterior.ComercioExteriorMensual.Periodos }
         *     
         */
        public void setPeriodos(ComercioExterior.ComercioExteriorMensual.Periodos value) {
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
         *                   &lt;element name="Importaciones" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="Importacion" maxOccurs="unbounded" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;sequence&gt;
         *                                       &lt;element name="NumeroOperacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                                       &lt;element name="TotalFOB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                                       &lt;element name="PaisProcedencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
         *                   &lt;element name="Exportaciones" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="Exportacion" maxOccurs="unbounded" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;sequence&gt;
         *                                       &lt;element name="NumeroOperacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                                       &lt;element name="TotalFOB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                                       &lt;element name="PaisDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            protected List<ComercioExterior.ComercioExteriorMensual.Periodos.Periodo> periodo;

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
             * {@link ComercioExterior.ComercioExteriorMensual.Periodos.Periodo }
             * 
             * 
             */
            public List<ComercioExterior.ComercioExteriorMensual.Periodos.Periodo> getPeriodo() {
                if (periodo == null) {
                    periodo = new ArrayList<ComercioExterior.ComercioExteriorMensual.Periodos.Periodo>();
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
             *         &lt;element name="Importaciones" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="Importacion" maxOccurs="unbounded" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;sequence&gt;
             *                             &lt;element name="NumeroOperacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                             &lt;element name="TotalFOB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                             &lt;element name="PaisProcedencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
             *         &lt;element name="Exportaciones" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="Exportacion" maxOccurs="unbounded" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;sequence&gt;
             *                             &lt;element name="NumeroOperacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                             &lt;element name="TotalFOB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                             &lt;element name="PaisDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "importaciones",
                "exportaciones"
            })
            public static class Periodo {

                @XmlElementRef(name = "Importaciones", type = JAXBElement.class, required = false)
                protected JAXBElement<ComercioExterior.ComercioExteriorMensual.Periodos.Periodo.Importaciones> importaciones;
                @XmlElementRef(name = "Exportaciones", type = JAXBElement.class, required = false)
                protected JAXBElement<ComercioExterior.ComercioExteriorMensual.Periodos.Periodo.Exportaciones> exportaciones;
                @XmlAttribute(name = "valor")
                protected String valor;

                /**
                 * Obtiene el valor de la propiedad importaciones.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link ComercioExterior.ComercioExteriorMensual.Periodos.Periodo.Importaciones }{@code >}
                 *     
                 */
                public JAXBElement<ComercioExterior.ComercioExteriorMensual.Periodos.Periodo.Importaciones> getImportaciones() {
                    return importaciones;
                }

                /**
                 * Define el valor de la propiedad importaciones.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link ComercioExterior.ComercioExteriorMensual.Periodos.Periodo.Importaciones }{@code >}
                 *     
                 */
                public void setImportaciones(JAXBElement<ComercioExterior.ComercioExteriorMensual.Periodos.Periodo.Importaciones> value) {
                    this.importaciones = value;
                }

                /**
                 * Obtiene el valor de la propiedad exportaciones.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link ComercioExterior.ComercioExteriorMensual.Periodos.Periodo.Exportaciones }{@code >}
                 *     
                 */
                public JAXBElement<ComercioExterior.ComercioExteriorMensual.Periodos.Periodo.Exportaciones> getExportaciones() {
                    return exportaciones;
                }

                /**
                 * Define el valor de la propiedad exportaciones.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link ComercioExterior.ComercioExteriorMensual.Periodos.Periodo.Exportaciones }{@code >}
                 *     
                 */
                public void setExportaciones(JAXBElement<ComercioExterior.ComercioExteriorMensual.Periodos.Periodo.Exportaciones> value) {
                    this.exportaciones = value;
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
                 * <p>Clase Java para anonymous complex type.
                 * 
                 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *       &lt;sequence&gt;
                 *         &lt;element name="Exportacion" maxOccurs="unbounded" minOccurs="0"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;sequence&gt;
                 *                   &lt;element name="NumeroOperacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *                   &lt;element name="TotalFOB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *                   &lt;element name="PaisDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
                    "exportacion"
                })
                public static class Exportaciones {

                    @XmlElement(name = "Exportacion", nillable = true)
                    protected List<ComercioExterior.ComercioExteriorMensual.Periodos.Periodo.Exportaciones.Exportacion> exportacion;

                    /**
                     * Gets the value of the exportacion property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the exportacion property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getExportacion().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link ComercioExterior.ComercioExteriorMensual.Periodos.Periodo.Exportaciones.Exportacion }
                     * 
                     * 
                     */
                    public List<ComercioExterior.ComercioExteriorMensual.Periodos.Periodo.Exportaciones.Exportacion> getExportacion() {
                        if (exportacion == null) {
                            exportacion = new ArrayList<ComercioExterior.ComercioExteriorMensual.Periodos.Periodo.Exportaciones.Exportacion>();
                        }
                        return this.exportacion;
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
                     *         &lt;element name="NumeroOperacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                     *         &lt;element name="TotalFOB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                     *         &lt;element name="PaisDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
                        "numeroOperacion",
                        "totalFOB",
                        "paisDestino"
                    })
                    public static class Exportacion {

                        @XmlElementRef(name = "NumeroOperacion", type = JAXBElement.class, required = false)
                        protected JAXBElement<String> numeroOperacion;
                        @XmlElementRef(name = "TotalFOB", type = JAXBElement.class, required = false)
                        protected JAXBElement<String> totalFOB;
                        @XmlElementRef(name = "PaisDestino", type = JAXBElement.class, required = false)
                        protected JAXBElement<String> paisDestino;

                        /**
                         * Obtiene el valor de la propiedad numeroOperacion.
                         * 
                         * @return
                         *     possible object is
                         *     {@link JAXBElement }{@code <}{@link String }{@code >}
                         *     
                         */
                        public JAXBElement<String> getNumeroOperacion() {
                            return numeroOperacion;
                        }

                        /**
                         * Define el valor de la propiedad numeroOperacion.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link JAXBElement }{@code <}{@link String }{@code >}
                         *     
                         */
                        public void setNumeroOperacion(JAXBElement<String> value) {
                            this.numeroOperacion = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad totalFOB.
                         * 
                         * @return
                         *     possible object is
                         *     {@link JAXBElement }{@code <}{@link String }{@code >}
                         *     
                         */
                        public JAXBElement<String> getTotalFOB() {
                            return totalFOB;
                        }

                        /**
                         * Define el valor de la propiedad totalFOB.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link JAXBElement }{@code <}{@link String }{@code >}
                         *     
                         */
                        public void setTotalFOB(JAXBElement<String> value) {
                            this.totalFOB = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad paisDestino.
                         * 
                         * @return
                         *     possible object is
                         *     {@link JAXBElement }{@code <}{@link String }{@code >}
                         *     
                         */
                        public JAXBElement<String> getPaisDestino() {
                            return paisDestino;
                        }

                        /**
                         * Define el valor de la propiedad paisDestino.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link JAXBElement }{@code <}{@link String }{@code >}
                         *     
                         */
                        public void setPaisDestino(JAXBElement<String> value) {
                            this.paisDestino = value;
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
                 *         &lt;element name="Importacion" maxOccurs="unbounded" minOccurs="0"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;sequence&gt;
                 *                   &lt;element name="NumeroOperacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *                   &lt;element name="TotalFOB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *                   &lt;element name="PaisProcedencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
                    "importacion"
                })
                public static class Importaciones {

                    @XmlElement(name = "Importacion", nillable = true)
                    protected List<ComercioExterior.ComercioExteriorMensual.Periodos.Periodo.Importaciones.Importacion> importacion;

                    /**
                     * Gets the value of the importacion property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the importacion property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getImportacion().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link ComercioExterior.ComercioExteriorMensual.Periodos.Periodo.Importaciones.Importacion }
                     * 
                     * 
                     */
                    public List<ComercioExterior.ComercioExteriorMensual.Periodos.Periodo.Importaciones.Importacion> getImportacion() {
                        if (importacion == null) {
                            importacion = new ArrayList<ComercioExterior.ComercioExteriorMensual.Periodos.Periodo.Importaciones.Importacion>();
                        }
                        return this.importacion;
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
                     *         &lt;element name="NumeroOperacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                     *         &lt;element name="TotalFOB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                     *         &lt;element name="PaisProcedencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
                        "numeroOperacion",
                        "totalFOB",
                        "paisProcedencia"
                    })
                    public static class Importacion {

                        @XmlElementRef(name = "NumeroOperacion", type = JAXBElement.class, required = false)
                        protected JAXBElement<String> numeroOperacion;
                        @XmlElementRef(name = "TotalFOB", type = JAXBElement.class, required = false)
                        protected JAXBElement<String> totalFOB;
                        @XmlElementRef(name = "PaisProcedencia", type = JAXBElement.class, required = false)
                        protected JAXBElement<String> paisProcedencia;

                        /**
                         * Obtiene el valor de la propiedad numeroOperacion.
                         * 
                         * @return
                         *     possible object is
                         *     {@link JAXBElement }{@code <}{@link String }{@code >}
                         *     
                         */
                        public JAXBElement<String> getNumeroOperacion() {
                            return numeroOperacion;
                        }

                        /**
                         * Define el valor de la propiedad numeroOperacion.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link JAXBElement }{@code <}{@link String }{@code >}
                         *     
                         */
                        public void setNumeroOperacion(JAXBElement<String> value) {
                            this.numeroOperacion = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad totalFOB.
                         * 
                         * @return
                         *     possible object is
                         *     {@link JAXBElement }{@code <}{@link String }{@code >}
                         *     
                         */
                        public JAXBElement<String> getTotalFOB() {
                            return totalFOB;
                        }

                        /**
                         * Define el valor de la propiedad totalFOB.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link JAXBElement }{@code <}{@link String }{@code >}
                         *     
                         */
                        public void setTotalFOB(JAXBElement<String> value) {
                            this.totalFOB = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad paisProcedencia.
                         * 
                         * @return
                         *     possible object is
                         *     {@link JAXBElement }{@code <}{@link String }{@code >}
                         *     
                         */
                        public JAXBElement<String> getPaisProcedencia() {
                            return paisProcedencia;
                        }

                        /**
                         * Define el valor de la propiedad paisProcedencia.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link JAXBElement }{@code <}{@link String }{@code >}
                         *     
                         */
                        public void setPaisProcedencia(JAXBElement<String> value) {
                            this.paisProcedencia = value;
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
     *         &lt;element name="Paises" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Pais" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Importaciones" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="Importacion" maxOccurs="unbounded" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;sequence&gt;
     *                                                 &lt;element name="PrimerMovimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                                 &lt;element name="UltimoMovimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                                 &lt;element name="NumeroOperaciones" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                                 &lt;element name="TotalFOB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
     *                             &lt;element name="Exportaciones" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="Exportacion" maxOccurs="unbounded" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;sequence&gt;
     *                                                 &lt;element name="PrimerMovimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                                 &lt;element name="UltimoMovimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                                 &lt;element name="NumeroOperaciones" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                                 &lt;element name="TotalFOB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "paises"
    })
    public static class ComercioExteriorPais {

        @XmlElementRef(name = "Paises", type = JAXBElement.class, required = false)
        protected JAXBElement<ComercioExterior.ComercioExteriorPais.Paises> paises;

        /**
         * Obtiene el valor de la propiedad paises.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link ComercioExterior.ComercioExteriorPais.Paises }{@code >}
         *     
         */
        public JAXBElement<ComercioExterior.ComercioExteriorPais.Paises> getPaises() {
            return paises;
        }

        /**
         * Define el valor de la propiedad paises.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link ComercioExterior.ComercioExteriorPais.Paises }{@code >}
         *     
         */
        public void setPaises(JAXBElement<ComercioExterior.ComercioExteriorPais.Paises> value) {
            this.paises = value;
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
         *         &lt;element name="Pais" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Importaciones" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="Importacion" maxOccurs="unbounded" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;sequence&gt;
         *                                       &lt;element name="PrimerMovimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                                       &lt;element name="UltimoMovimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                                       &lt;element name="NumeroOperaciones" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                                       &lt;element name="TotalFOB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
         *                   &lt;element name="Exportaciones" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="Exportacion" maxOccurs="unbounded" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;sequence&gt;
         *                                       &lt;element name="PrimerMovimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                                       &lt;element name="UltimoMovimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                                       &lt;element name="NumeroOperaciones" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                                       &lt;element name="TotalFOB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "pais"
        })
        public static class Paises {

            @XmlElement(name = "Pais")
            protected List<ComercioExterior.ComercioExteriorPais.Paises.Pais> pais;

            /**
             * Gets the value of the pais property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the pais property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPais().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ComercioExterior.ComercioExteriorPais.Paises.Pais }
             * 
             * 
             */
            public List<ComercioExterior.ComercioExteriorPais.Paises.Pais> getPais() {
                if (pais == null) {
                    pais = new ArrayList<ComercioExterior.ComercioExteriorPais.Paises.Pais>();
                }
                return this.pais;
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
             *         &lt;element name="Importaciones" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="Importacion" maxOccurs="unbounded" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;sequence&gt;
             *                             &lt;element name="PrimerMovimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                             &lt;element name="UltimoMovimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                             &lt;element name="NumeroOperaciones" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                             &lt;element name="TotalFOB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
             *         &lt;element name="Exportaciones" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="Exportacion" maxOccurs="unbounded" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;sequence&gt;
             *                             &lt;element name="PrimerMovimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                             &lt;element name="UltimoMovimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                             &lt;element name="NumeroOperaciones" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                             &lt;element name="TotalFOB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "importaciones",
                "exportaciones"
            })
            public static class Pais {

                @XmlElementRef(name = "Importaciones", type = JAXBElement.class, required = false)
                protected JAXBElement<ComercioExterior.ComercioExteriorPais.Paises.Pais.Importaciones> importaciones;
                @XmlElementRef(name = "Exportaciones", type = JAXBElement.class, required = false)
                protected JAXBElement<ComercioExterior.ComercioExteriorPais.Paises.Pais.Exportaciones> exportaciones;
                @XmlAttribute(name = "valor")
                protected String valor;

                /**
                 * Obtiene el valor de la propiedad importaciones.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link ComercioExterior.ComercioExteriorPais.Paises.Pais.Importaciones }{@code >}
                 *     
                 */
                public JAXBElement<ComercioExterior.ComercioExteriorPais.Paises.Pais.Importaciones> getImportaciones() {
                    return importaciones;
                }

                /**
                 * Define el valor de la propiedad importaciones.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link ComercioExterior.ComercioExteriorPais.Paises.Pais.Importaciones }{@code >}
                 *     
                 */
                public void setImportaciones(JAXBElement<ComercioExterior.ComercioExteriorPais.Paises.Pais.Importaciones> value) {
                    this.importaciones = value;
                }

                /**
                 * Obtiene el valor de la propiedad exportaciones.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link ComercioExterior.ComercioExteriorPais.Paises.Pais.Exportaciones }{@code >}
                 *     
                 */
                public JAXBElement<ComercioExterior.ComercioExteriorPais.Paises.Pais.Exportaciones> getExportaciones() {
                    return exportaciones;
                }

                /**
                 * Define el valor de la propiedad exportaciones.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link ComercioExterior.ComercioExteriorPais.Paises.Pais.Exportaciones }{@code >}
                 *     
                 */
                public void setExportaciones(JAXBElement<ComercioExterior.ComercioExteriorPais.Paises.Pais.Exportaciones> value) {
                    this.exportaciones = value;
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
                 * <p>Clase Java para anonymous complex type.
                 * 
                 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *       &lt;sequence&gt;
                 *         &lt;element name="Exportacion" maxOccurs="unbounded" minOccurs="0"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;sequence&gt;
                 *                   &lt;element name="PrimerMovimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *                   &lt;element name="UltimoMovimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *                   &lt;element name="NumeroOperaciones" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *                   &lt;element name="TotalFOB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
                    "exportacion"
                })
                public static class Exportaciones {

                    @XmlElement(name = "Exportacion", nillable = true)
                    protected List<ComercioExterior.ComercioExteriorPais.Paises.Pais.Exportaciones.Exportacion> exportacion;

                    /**
                     * Gets the value of the exportacion property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the exportacion property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getExportacion().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link ComercioExterior.ComercioExteriorPais.Paises.Pais.Exportaciones.Exportacion }
                     * 
                     * 
                     */
                    public List<ComercioExterior.ComercioExteriorPais.Paises.Pais.Exportaciones.Exportacion> getExportacion() {
                        if (exportacion == null) {
                            exportacion = new ArrayList<ComercioExterior.ComercioExteriorPais.Paises.Pais.Exportaciones.Exportacion>();
                        }
                        return this.exportacion;
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
                     *         &lt;element name="PrimerMovimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                     *         &lt;element name="UltimoMovimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                     *         &lt;element name="NumeroOperaciones" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                     *         &lt;element name="TotalFOB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
                        "primerMovimiento",
                        "ultimoMovimiento",
                        "numeroOperaciones",
                        "totalFOB"
                    })
                    public static class Exportacion {

                        @XmlElement(name = "PrimerMovimiento")
                        protected String primerMovimiento;
                        @XmlElement(name = "UltimoMovimiento")
                        protected String ultimoMovimiento;
                        @XmlElement(name = "NumeroOperaciones")
                        protected String numeroOperaciones;
                        @XmlElement(name = "TotalFOB")
                        protected String totalFOB;

                        /**
                         * Obtiene el valor de la propiedad primerMovimiento.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPrimerMovimiento() {
                            return primerMovimiento;
                        }

                        /**
                         * Define el valor de la propiedad primerMovimiento.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPrimerMovimiento(String value) {
                            this.primerMovimiento = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad ultimoMovimiento.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getUltimoMovimiento() {
                            return ultimoMovimiento;
                        }

                        /**
                         * Define el valor de la propiedad ultimoMovimiento.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setUltimoMovimiento(String value) {
                            this.ultimoMovimiento = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad numeroOperaciones.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getNumeroOperaciones() {
                            return numeroOperaciones;
                        }

                        /**
                         * Define el valor de la propiedad numeroOperaciones.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setNumeroOperaciones(String value) {
                            this.numeroOperaciones = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad totalFOB.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getTotalFOB() {
                            return totalFOB;
                        }

                        /**
                         * Define el valor de la propiedad totalFOB.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setTotalFOB(String value) {
                            this.totalFOB = value;
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
                 *         &lt;element name="Importacion" maxOccurs="unbounded" minOccurs="0"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;sequence&gt;
                 *                   &lt;element name="PrimerMovimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *                   &lt;element name="UltimoMovimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *                   &lt;element name="NumeroOperaciones" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *                   &lt;element name="TotalFOB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
                    "importacion"
                })
                public static class Importaciones {

                    @XmlElement(name = "Importacion", nillable = true)
                    protected List<ComercioExterior.ComercioExteriorPais.Paises.Pais.Importaciones.Importacion> importacion;

                    /**
                     * Gets the value of the importacion property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the importacion property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getImportacion().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link ComercioExterior.ComercioExteriorPais.Paises.Pais.Importaciones.Importacion }
                     * 
                     * 
                     */
                    public List<ComercioExterior.ComercioExteriorPais.Paises.Pais.Importaciones.Importacion> getImportacion() {
                        if (importacion == null) {
                            importacion = new ArrayList<ComercioExterior.ComercioExteriorPais.Paises.Pais.Importaciones.Importacion>();
                        }
                        return this.importacion;
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
                     *         &lt;element name="PrimerMovimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                     *         &lt;element name="UltimoMovimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                     *         &lt;element name="NumeroOperaciones" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                     *         &lt;element name="TotalFOB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
                        "primerMovimiento",
                        "ultimoMovimiento",
                        "numeroOperaciones",
                        "totalFOB"
                    })
                    public static class Importacion {

                        @XmlElement(name = "PrimerMovimiento")
                        protected String primerMovimiento;
                        @XmlElement(name = "UltimoMovimiento")
                        protected String ultimoMovimiento;
                        @XmlElement(name = "NumeroOperaciones")
                        protected String numeroOperaciones;
                        @XmlElement(name = "TotalFOB")
                        protected String totalFOB;

                        /**
                         * Obtiene el valor de la propiedad primerMovimiento.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPrimerMovimiento() {
                            return primerMovimiento;
                        }

                        /**
                         * Define el valor de la propiedad primerMovimiento.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPrimerMovimiento(String value) {
                            this.primerMovimiento = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad ultimoMovimiento.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getUltimoMovimiento() {
                            return ultimoMovimiento;
                        }

                        /**
                         * Define el valor de la propiedad ultimoMovimiento.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setUltimoMovimiento(String value) {
                            this.ultimoMovimiento = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad numeroOperaciones.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getNumeroOperaciones() {
                            return numeroOperaciones;
                        }

                        /**
                         * Define el valor de la propiedad numeroOperaciones.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setNumeroOperaciones(String value) {
                            this.numeroOperaciones = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad totalFOB.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getTotalFOB() {
                            return totalFOB;
                        }

                        /**
                         * Define el valor de la propiedad totalFOB.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setTotalFOB(String value) {
                            this.totalFOB = value;
                        }

                    }

                }

            }

        }

    }

}
