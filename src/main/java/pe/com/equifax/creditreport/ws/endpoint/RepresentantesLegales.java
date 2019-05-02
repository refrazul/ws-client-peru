
package pe.com.equifax.creditreport.ws.endpoint;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="RepresentantesDe"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Representante" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Nombres" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="TipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="NumeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="Cargo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="Fecha" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
 *         &lt;element name="RepresentandosPor"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Representante" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Nombres" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="TipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="NumeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="Cargo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="Fecha" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "representantesDe",
    "representandosPor"
})
@XmlRootElement(name = "RepresentantesLegales")
public class RepresentantesLegales {

    @XmlElement(name = "RepresentantesDe", required = true)
    protected RepresentantesLegales.RepresentantesDe representantesDe;
    @XmlElement(name = "RepresentandosPor", required = true)
    protected RepresentantesLegales.RepresentandosPor representandosPor;

    /**
     * Obtiene el valor de la propiedad representantesDe.
     * 
     * @return
     *     possible object is
     *     {@link RepresentantesLegales.RepresentantesDe }
     *     
     */
    public RepresentantesLegales.RepresentantesDe getRepresentantesDe() {
        return representantesDe;
    }

    /**
     * Define el valor de la propiedad representantesDe.
     * 
     * @param value
     *     allowed object is
     *     {@link RepresentantesLegales.RepresentantesDe }
     *     
     */
    public void setRepresentantesDe(RepresentantesLegales.RepresentantesDe value) {
        this.representantesDe = value;
    }

    /**
     * Obtiene el valor de la propiedad representandosPor.
     * 
     * @return
     *     possible object is
     *     {@link RepresentantesLegales.RepresentandosPor }
     *     
     */
    public RepresentantesLegales.RepresentandosPor getRepresentandosPor() {
        return representandosPor;
    }

    /**
     * Define el valor de la propiedad representandosPor.
     * 
     * @param value
     *     allowed object is
     *     {@link RepresentantesLegales.RepresentandosPor }
     *     
     */
    public void setRepresentandosPor(RepresentantesLegales.RepresentandosPor value) {
        this.representandosPor = value;
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
     *         &lt;element name="Representante" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Nombres" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="TipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="NumeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="Cargo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="Fecha" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "representante"
    })
    public static class RepresentandosPor {

        @XmlElement(name = "Representante", required = true)
        protected List<RepresentantesLegales.RepresentandosPor.Representante> representante;

        /**
         * Gets the value of the representante property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the representante property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRepresentante().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RepresentantesLegales.RepresentandosPor.Representante }
         * 
         * 
         */
        public List<RepresentantesLegales.RepresentandosPor.Representante> getRepresentante() {
            if (representante == null) {
                representante = new ArrayList<RepresentantesLegales.RepresentandosPor.Representante>();
            }
            return this.representante;
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
         *         &lt;element name="Nombres" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="TipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="NumeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="Cargo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="Fecha" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
            "cargo",
            "fecha"
        })
        public static class Representante {

            @XmlElement(name = "Nombres", required = true)
            protected String nombres;
            @XmlElement(name = "TipoDocumento", required = true)
            protected String tipoDocumento;
            @XmlElement(name = "NumeroDocumento", required = true)
            protected String numeroDocumento;
            @XmlElement(name = "Cargo", required = true)
            protected String cargo;
            @XmlElement(name = "Fecha", required = true)
            protected String fecha;

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
             * Obtiene el valor de la propiedad cargo.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCargo() {
                return cargo;
            }

            /**
             * Define el valor de la propiedad cargo.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCargo(String value) {
                this.cargo = value;
            }

            /**
             * Obtiene el valor de la propiedad fecha.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFecha() {
                return fecha;
            }

            /**
             * Define el valor de la propiedad fecha.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFecha(String value) {
                this.fecha = value;
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
     *         &lt;element name="Representante" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Nombres" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="TipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="NumeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="Cargo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="Fecha" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "representante"
    })
    public static class RepresentantesDe {

        @XmlElement(name = "Representante", required = true)
        protected List<RepresentantesLegales.RepresentantesDe.Representante> representante;

        /**
         * Gets the value of the representante property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the representante property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRepresentante().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RepresentantesLegales.RepresentantesDe.Representante }
         * 
         * 
         */
        public List<RepresentantesLegales.RepresentantesDe.Representante> getRepresentante() {
            if (representante == null) {
                representante = new ArrayList<RepresentantesLegales.RepresentantesDe.Representante>();
            }
            return this.representante;
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
         *         &lt;element name="Nombres" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="TipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="NumeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="Cargo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="Fecha" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
            "cargo",
            "fecha"
        })
        public static class Representante {

            @XmlElement(name = "Nombres", required = true)
            protected String nombres;
            @XmlElement(name = "TipoDocumento", required = true)
            protected String tipoDocumento;
            @XmlElement(name = "NumeroDocumento", required = true)
            protected String numeroDocumento;
            @XmlElement(name = "Cargo", required = true)
            protected String cargo;
            @XmlElement(name = "Fecha", required = true)
            protected String fecha;

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
             * Obtiene el valor de la propiedad cargo.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCargo() {
                return cargo;
            }

            /**
             * Define el valor de la propiedad cargo.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCargo(String value) {
                this.cargo = value;
            }

            /**
             * Obtiene el valor de la propiedad fecha.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFecha() {
                return fecha;
            }

            /**
             * Define el valor de la propiedad fecha.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFecha(String value) {
                this.fecha = value;
            }

        }

    }

}
