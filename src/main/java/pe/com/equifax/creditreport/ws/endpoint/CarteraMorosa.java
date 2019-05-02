
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
 *         &lt;element name="ResumenProtestos" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Periodo" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="CantidadSolesAclarados" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                             &lt;element name="MontoSolesAclarados" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                             &lt;element name="CantidadDolaresAclarados" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                             &lt;element name="MontoDolaresAclarados" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                             &lt;element name="CantidadOmAclarados" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                             &lt;element name="CantidadSolesNoAclarados" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                             &lt;element name="MontoSolesNoAclarados" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                             &lt;element name="CantidadDolaresNoAclarados" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                             &lt;element name="MontoDolaresNoAclarados" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                             &lt;element name="CantidadOmNoAclarados" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
 *         &lt;element name="DetalleProtestos" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Protesto" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="CorrelativoBNP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NumeroBoletin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="TipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="Moneda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="Monto" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                             &lt;element name="Emisor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="FechaVencimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="FechaAclaracion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="Notaria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "resumenProtestos",
    "detalleProtestos"
})
@XmlRootElement(name = "CarteraMorosa")
public class CarteraMorosa {

    @XmlElementRef(name = "ResumenProtestos", type = JAXBElement.class, required = false)
    protected JAXBElement<CarteraMorosa.ResumenProtestos> resumenProtestos;
    @XmlElementRef(name = "DetalleProtestos", type = JAXBElement.class, required = false)
    protected JAXBElement<CarteraMorosa.DetalleProtestos> detalleProtestos;

    /**
     * Obtiene el valor de la propiedad resumenProtestos.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CarteraMorosa.ResumenProtestos }{@code >}
     *     
     */
    public JAXBElement<CarteraMorosa.ResumenProtestos> getResumenProtestos() {
        return resumenProtestos;
    }

    /**
     * Define el valor de la propiedad resumenProtestos.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CarteraMorosa.ResumenProtestos }{@code >}
     *     
     */
    public void setResumenProtestos(JAXBElement<CarteraMorosa.ResumenProtestos> value) {
        this.resumenProtestos = value;
    }

    /**
     * Obtiene el valor de la propiedad detalleProtestos.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CarteraMorosa.DetalleProtestos }{@code >}
     *     
     */
    public JAXBElement<CarteraMorosa.DetalleProtestos> getDetalleProtestos() {
        return detalleProtestos;
    }

    /**
     * Define el valor de la propiedad detalleProtestos.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CarteraMorosa.DetalleProtestos }{@code >}
     *     
     */
    public void setDetalleProtestos(JAXBElement<CarteraMorosa.DetalleProtestos> value) {
        this.detalleProtestos = value;
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
     *         &lt;element name="Protesto" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="CorrelativoBNP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NumeroBoletin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="TipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="Moneda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="Monto" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                   &lt;element name="Emisor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="FechaVencimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="FechaAclaracion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="Notaria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "protesto"
    })
    public static class DetalleProtestos {

        @XmlElement(name = "Protesto", nillable = true)
        protected List<CarteraMorosa.DetalleProtestos.Protesto> protesto;

        /**
         * Gets the value of the protesto property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the protesto property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProtesto().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CarteraMorosa.DetalleProtestos.Protesto }
         * 
         * 
         */
        public List<CarteraMorosa.DetalleProtestos.Protesto> getProtesto() {
            if (protesto == null) {
                protesto = new ArrayList<CarteraMorosa.DetalleProtestos.Protesto>();
            }
            return this.protesto;
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
         *         &lt;element name="CorrelativoBNP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NumeroBoletin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="TipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="Moneda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="Monto" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *         &lt;element name="Emisor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="FechaVencimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="FechaAclaracion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="Notaria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "correlativoBNP",
            "numeroBoletin",
            "tipoDocumento",
            "moneda",
            "monto",
            "emisor",
            "fechaVencimiento",
            "fechaAclaracion",
            "notaria"
        })
        public static class Protesto {

            @XmlElementRef(name = "CorrelativoBNP", type = JAXBElement.class, required = false)
            protected JAXBElement<String> correlativoBNP;
            @XmlElementRef(name = "NumeroBoletin", type = JAXBElement.class, required = false)
            protected JAXBElement<String> numeroBoletin;
            @XmlElementRef(name = "TipoDocumento", type = JAXBElement.class, required = false)
            protected JAXBElement<String> tipoDocumento;
            @XmlElementRef(name = "Moneda", type = JAXBElement.class, required = false)
            protected JAXBElement<String> moneda;
            @XmlElementRef(name = "Monto", type = JAXBElement.class, required = false)
            protected JAXBElement<BigDecimal> monto;
            @XmlElementRef(name = "Emisor", type = JAXBElement.class, required = false)
            protected JAXBElement<String> emisor;
            @XmlElementRef(name = "FechaVencimiento", type = JAXBElement.class, required = false)
            protected JAXBElement<String> fechaVencimiento;
            @XmlElementRef(name = "FechaAclaracion", type = JAXBElement.class, required = false)
            protected JAXBElement<String> fechaAclaracion;
            @XmlElementRef(name = "Notaria", type = JAXBElement.class, required = false)
            protected JAXBElement<String> notaria;

            /**
             * Obtiene el valor de la propiedad correlativoBNP.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getCorrelativoBNP() {
                return correlativoBNP;
            }

            /**
             * Define el valor de la propiedad correlativoBNP.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setCorrelativoBNP(JAXBElement<String> value) {
                this.correlativoBNP = value;
            }

            /**
             * Obtiene el valor de la propiedad numeroBoletin.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getNumeroBoletin() {
                return numeroBoletin;
            }

            /**
             * Define el valor de la propiedad numeroBoletin.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setNumeroBoletin(JAXBElement<String> value) {
                this.numeroBoletin = value;
            }

            /**
             * Obtiene el valor de la propiedad tipoDocumento.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getTipoDocumento() {
                return tipoDocumento;
            }

            /**
             * Define el valor de la propiedad tipoDocumento.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setTipoDocumento(JAXBElement<String> value) {
                this.tipoDocumento = value;
            }

            /**
             * Obtiene el valor de la propiedad moneda.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getMoneda() {
                return moneda;
            }

            /**
             * Define el valor de la propiedad moneda.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setMoneda(JAXBElement<String> value) {
                this.moneda = value;
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

            /**
             * Obtiene el valor de la propiedad emisor.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getEmisor() {
                return emisor;
            }

            /**
             * Define el valor de la propiedad emisor.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setEmisor(JAXBElement<String> value) {
                this.emisor = value;
            }

            /**
             * Obtiene el valor de la propiedad fechaVencimiento.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getFechaVencimiento() {
                return fechaVencimiento;
            }

            /**
             * Define el valor de la propiedad fechaVencimiento.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setFechaVencimiento(JAXBElement<String> value) {
                this.fechaVencimiento = value;
            }

            /**
             * Obtiene el valor de la propiedad fechaAclaracion.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getFechaAclaracion() {
                return fechaAclaracion;
            }

            /**
             * Define el valor de la propiedad fechaAclaracion.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setFechaAclaracion(JAXBElement<String> value) {
                this.fechaAclaracion = value;
            }

            /**
             * Obtiene el valor de la propiedad notaria.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getNotaria() {
                return notaria;
            }

            /**
             * Define el valor de la propiedad notaria.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setNotaria(JAXBElement<String> value) {
                this.notaria = value;
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
     *                   &lt;element name="CantidadSolesAclarados" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *                   &lt;element name="MontoSolesAclarados" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                   &lt;element name="CantidadDolaresAclarados" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *                   &lt;element name="MontoDolaresAclarados" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                   &lt;element name="CantidadOmAclarados" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *                   &lt;element name="CantidadSolesNoAclarados" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *                   &lt;element name="MontoSolesNoAclarados" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                   &lt;element name="CantidadDolaresNoAclarados" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *                   &lt;element name="MontoDolaresNoAclarados" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                   &lt;element name="CantidadOmNoAclarados" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    public static class ResumenProtestos {

        @XmlElement(name = "Periodo")
        protected List<CarteraMorosa.ResumenProtestos.Periodo> periodo;

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
         * {@link CarteraMorosa.ResumenProtestos.Periodo }
         * 
         * 
         */
        public List<CarteraMorosa.ResumenProtestos.Periodo> getPeriodo() {
            if (periodo == null) {
                periodo = new ArrayList<CarteraMorosa.ResumenProtestos.Periodo>();
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
         *         &lt;element name="CantidadSolesAclarados" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
         *         &lt;element name="MontoSolesAclarados" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *         &lt;element name="CantidadDolaresAclarados" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
         *         &lt;element name="MontoDolaresAclarados" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *         &lt;element name="CantidadOmAclarados" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
         *         &lt;element name="CantidadSolesNoAclarados" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
         *         &lt;element name="MontoSolesNoAclarados" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *         &lt;element name="CantidadDolaresNoAclarados" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
         *         &lt;element name="MontoDolaresNoAclarados" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *         &lt;element name="CantidadOmNoAclarados" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
            "cantidadSolesAclarados",
            "montoSolesAclarados",
            "cantidadDolaresAclarados",
            "montoDolaresAclarados",
            "cantidadOmAclarados",
            "cantidadSolesNoAclarados",
            "montoSolesNoAclarados",
            "cantidadDolaresNoAclarados",
            "montoDolaresNoAclarados",
            "cantidadOmNoAclarados"
        })
        public static class Periodo {

            @XmlElement(name = "CantidadSolesAclarados", required = true, type = Integer.class, nillable = true)
            protected Integer cantidadSolesAclarados;
            @XmlElementRef(name = "MontoSolesAclarados", type = JAXBElement.class, required = false)
            protected JAXBElement<BigDecimal> montoSolesAclarados;
            @XmlElement(name = "CantidadDolaresAclarados", required = true, type = Integer.class, nillable = true)
            protected Integer cantidadDolaresAclarados;
            @XmlElementRef(name = "MontoDolaresAclarados", type = JAXBElement.class, required = false)
            protected JAXBElement<BigDecimal> montoDolaresAclarados;
            @XmlElement(name = "CantidadOmAclarados", required = true, type = Integer.class, nillable = true)
            protected Integer cantidadOmAclarados;
            @XmlElement(name = "CantidadSolesNoAclarados", required = true, type = Integer.class, nillable = true)
            protected Integer cantidadSolesNoAclarados;
            @XmlElementRef(name = "MontoSolesNoAclarados", type = JAXBElement.class, required = false)
            protected JAXBElement<BigDecimal> montoSolesNoAclarados;
            @XmlElement(name = "CantidadDolaresNoAclarados", required = true, type = Integer.class, nillable = true)
            protected Integer cantidadDolaresNoAclarados;
            @XmlElementRef(name = "MontoDolaresNoAclarados", type = JAXBElement.class, required = false)
            protected JAXBElement<BigDecimal> montoDolaresNoAclarados;
            @XmlElement(name = "CantidadOmNoAclarados", required = true, type = Integer.class, nillable = true)
            protected Integer cantidadOmNoAclarados;
            @XmlAttribute(name = "valor")
            protected String valor;

            /**
             * Obtiene el valor de la propiedad cantidadSolesAclarados.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getCantidadSolesAclarados() {
                return cantidadSolesAclarados;
            }

            /**
             * Define el valor de la propiedad cantidadSolesAclarados.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setCantidadSolesAclarados(Integer value) {
                this.cantidadSolesAclarados = value;
            }

            /**
             * Obtiene el valor de la propiedad montoSolesAclarados.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
             *     
             */
            public JAXBElement<BigDecimal> getMontoSolesAclarados() {
                return montoSolesAclarados;
            }

            /**
             * Define el valor de la propiedad montoSolesAclarados.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
             *     
             */
            public void setMontoSolesAclarados(JAXBElement<BigDecimal> value) {
                this.montoSolesAclarados = value;
            }

            /**
             * Obtiene el valor de la propiedad cantidadDolaresAclarados.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getCantidadDolaresAclarados() {
                return cantidadDolaresAclarados;
            }

            /**
             * Define el valor de la propiedad cantidadDolaresAclarados.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setCantidadDolaresAclarados(Integer value) {
                this.cantidadDolaresAclarados = value;
            }

            /**
             * Obtiene el valor de la propiedad montoDolaresAclarados.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
             *     
             */
            public JAXBElement<BigDecimal> getMontoDolaresAclarados() {
                return montoDolaresAclarados;
            }

            /**
             * Define el valor de la propiedad montoDolaresAclarados.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
             *     
             */
            public void setMontoDolaresAclarados(JAXBElement<BigDecimal> value) {
                this.montoDolaresAclarados = value;
            }

            /**
             * Obtiene el valor de la propiedad cantidadOmAclarados.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getCantidadOmAclarados() {
                return cantidadOmAclarados;
            }

            /**
             * Define el valor de la propiedad cantidadOmAclarados.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setCantidadOmAclarados(Integer value) {
                this.cantidadOmAclarados = value;
            }

            /**
             * Obtiene el valor de la propiedad cantidadSolesNoAclarados.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getCantidadSolesNoAclarados() {
                return cantidadSolesNoAclarados;
            }

            /**
             * Define el valor de la propiedad cantidadSolesNoAclarados.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setCantidadSolesNoAclarados(Integer value) {
                this.cantidadSolesNoAclarados = value;
            }

            /**
             * Obtiene el valor de la propiedad montoSolesNoAclarados.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
             *     
             */
            public JAXBElement<BigDecimal> getMontoSolesNoAclarados() {
                return montoSolesNoAclarados;
            }

            /**
             * Define el valor de la propiedad montoSolesNoAclarados.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
             *     
             */
            public void setMontoSolesNoAclarados(JAXBElement<BigDecimal> value) {
                this.montoSolesNoAclarados = value;
            }

            /**
             * Obtiene el valor de la propiedad cantidadDolaresNoAclarados.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getCantidadDolaresNoAclarados() {
                return cantidadDolaresNoAclarados;
            }

            /**
             * Define el valor de la propiedad cantidadDolaresNoAclarados.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setCantidadDolaresNoAclarados(Integer value) {
                this.cantidadDolaresNoAclarados = value;
            }

            /**
             * Obtiene el valor de la propiedad montoDolaresNoAclarados.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
             *     
             */
            public JAXBElement<BigDecimal> getMontoDolaresNoAclarados() {
                return montoDolaresNoAclarados;
            }

            /**
             * Define el valor de la propiedad montoDolaresNoAclarados.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
             *     
             */
            public void setMontoDolaresNoAclarados(JAXBElement<BigDecimal> value) {
                this.montoDolaresNoAclarados = value;
            }

            /**
             * Obtiene el valor de la propiedad cantidadOmNoAclarados.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getCantidadOmNoAclarados() {
                return cantidadOmNoAclarados;
            }

            /**
             * Define el valor de la propiedad cantidadOmNoAclarados.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setCantidadOmNoAclarados(Integer value) {
                this.cantidadOmNoAclarados = value;
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

        }

    }

}
