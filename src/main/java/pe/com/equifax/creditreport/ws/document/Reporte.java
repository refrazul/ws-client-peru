
package pe.com.equifax.creditreport.ws.document;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


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
 *         &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FechaReporte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumeroOperacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DatosPrincipales"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="NumeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Modulos"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Modulo" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="Data"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;any processContents='lax' namespace='##other'/&gt;
 *                                     &lt;/sequence&gt;
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
    "nombre",
    "fechaReporte",
    "numeroOperacion",
    "datosPrincipales",
    "modulos"
})
@XmlRootElement(name = "Reporte")
public class Reporte {

    @XmlElement(name = "Nombre", required = true)
    protected String nombre;
    @XmlElement(name = "FechaReporte")
    protected String fechaReporte;
    @XmlElement(name = "NumeroOperacion")
    protected String numeroOperacion;
    @XmlElement(name = "DatosPrincipales", required = true)
    protected Reporte.DatosPrincipales datosPrincipales;
    @XmlElement(name = "Modulos", required = true)
    protected Reporte.Modulos modulos;

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
     * Obtiene el valor de la propiedad fechaReporte.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaReporte() {
        return fechaReporte;
    }

    /**
     * Define el valor de la propiedad fechaReporte.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaReporte(String value) {
        this.fechaReporte = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroOperacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroOperacion() {
        return numeroOperacion;
    }

    /**
     * Define el valor de la propiedad numeroOperacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroOperacion(String value) {
        this.numeroOperacion = value;
    }

    /**
     * Obtiene el valor de la propiedad datosPrincipales.
     * 
     * @return
     *     possible object is
     *     {@link Reporte.DatosPrincipales }
     *     
     */
    public Reporte.DatosPrincipales getDatosPrincipales() {
        return datosPrincipales;
    }

    /**
     * Define el valor de la propiedad datosPrincipales.
     * 
     * @param value
     *     allowed object is
     *     {@link Reporte.DatosPrincipales }
     *     
     */
    public void setDatosPrincipales(Reporte.DatosPrincipales value) {
        this.datosPrincipales = value;
    }

    /**
     * Obtiene el valor de la propiedad modulos.
     * 
     * @return
     *     possible object is
     *     {@link Reporte.Modulos }
     *     
     */
    public Reporte.Modulos getModulos() {
        return modulos;
    }

    /**
     * Define el valor de la propiedad modulos.
     * 
     * @param value
     *     allowed object is
     *     {@link Reporte.Modulos }
     *     
     */
    public void setModulos(Reporte.Modulos value) {
        this.modulos = value;
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
     *         &lt;element name="TipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="NumeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "direccion",
        "nombre"
    })
    public static class DatosPrincipales {

        @XmlElement(name = "TipoDocumento", required = true)
        protected String tipoDocumento;
        @XmlElement(name = "NumeroDocumento")
        protected String numeroDocumento;
        @XmlElement(name = "Direccion", required = true, nillable = true)
        protected String direccion;
        @XmlElement(name = "Nombre", required = true)
        protected String nombre;

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
         * Obtiene el valor de la propiedad direccion.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDireccion() {
            return direccion;
        }

        /**
         * Define el valor de la propiedad direccion.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDireccion(String value) {
            this.direccion = value;
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
     *         &lt;element name="Modulo" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="Data"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;any processContents='lax' namespace='##other'/&gt;
     *                           &lt;/sequence&gt;
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
        "modulo"
    })
    public static class Modulos {

        @XmlElement(name = "Modulo", required = true)
        protected List<Reporte.Modulos.Modulo> modulo;

        /**
         * Gets the value of the modulo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the modulo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getModulo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Reporte.Modulos.Modulo }
         * 
         * 
         */
        public List<Reporte.Modulos.Modulo> getModulo() {
            if (modulo == null) {
                modulo = new ArrayList<Reporte.Modulos.Modulo>();
            }
            return this.modulo;
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
         *         &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="Data"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;any processContents='lax' namespace='##other'/&gt;
         *                 &lt;/sequence&gt;
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
            "codigo",
            "nombre",
            "data"
        })
        public static class Modulo {

            @XmlElement(name = "Codigo")
            protected String codigo;
            @XmlElement(name = "Nombre", required = true)
            protected String nombre;
            @XmlElement(name = "Data", required = true)
            protected Reporte.Modulos.Modulo.Data data;

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
             * Obtiene el valor de la propiedad data.
             * 
             * @return
             *     possible object is
             *     {@link Reporte.Modulos.Modulo.Data }
             *     
             */
            public Reporte.Modulos.Modulo.Data getData() {
                return data;
            }

            /**
             * Define el valor de la propiedad data.
             * 
             * @param value
             *     allowed object is
             *     {@link Reporte.Modulos.Modulo.Data }
             *     
             */
            public void setData(Reporte.Modulos.Modulo.Data value) {
                this.data = value;
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
             *         &lt;any processContents='lax' namespace='##other'/&gt;
             *       &lt;/sequence&gt;
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
                "any"
            })
            public static class Data {

                @XmlAnyElement(lax = true)
                protected Object any;
                @XmlAttribute(name = "flag", required = true)
                protected boolean flag;

                /**
                 * Obtiene el valor de la propiedad any.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Element }
                 *     {@link Object }
                 *     
                 */
                public Object getAny() {
                    return any;
                }

                /**
                 * Define el valor de la propiedad any.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Element }
                 *     {@link Object }
                 *     
                 */
                public void setAny(Object value) {
                    this.any = value;
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

            }

        }

    }

}
