
package pe.com.equifax.creditreport.ws.endpoint;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="Directorio" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="RUC" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="RazonSocial" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="NombreComercial" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="TipoContribuyente" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="EstadoContribuyente" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="CondicionContribuyente" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="Dependencia" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="CodigoCIIU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="DescripcionCIIU" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="InicioActividades" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="ActividadComercioExterior" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="Padron" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="Direcciones"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="NumeroTrabajadores" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "directorio"
})
@XmlRootElement(name = "DirectorioSUNAT")
public class DirectorioSUNAT {

    @XmlElement(name = "Directorio")
    protected List<DirectorioSUNAT.Directorio> directorio;

    /**
     * Gets the value of the directorio property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the directorio property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDirectorio().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DirectorioSUNAT.Directorio }
     * 
     * 
     */
    public List<DirectorioSUNAT.Directorio> getDirectorio() {
        if (directorio == null) {
            directorio = new ArrayList<DirectorioSUNAT.Directorio>();
        }
        return this.directorio;
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
     *         &lt;element name="RUC" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="RazonSocial" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="NombreComercial" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="TipoContribuyente" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="EstadoContribuyente" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="CondicionContribuyente" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="Dependencia" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="CodigoCIIU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="DescripcionCIIU" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="InicioActividades" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="ActividadComercioExterior" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="Padron" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="Direcciones"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="NumeroTrabajadores" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "ruc",
        "razonSocial",
        "nombreComercial",
        "tipoContribuyente",
        "estadoContribuyente",
        "condicionContribuyente",
        "dependencia",
        "codigoCIIU",
        "descripcionCIIU",
        "inicioActividades",
        "actividadComercioExterior",
        "padron",
        "direcciones",
        "numeroTrabajadores"
    })
    public static class Directorio {

        @XmlElement(name = "RUC", required = true, nillable = true)
        protected String ruc;
        @XmlElement(name = "RazonSocial", required = true, nillable = true)
        protected String razonSocial;
        @XmlElement(name = "NombreComercial", required = true, nillable = true)
        protected String nombreComercial;
        @XmlElement(name = "TipoContribuyente", required = true, nillable = true)
        protected String tipoContribuyente;
        @XmlElement(name = "EstadoContribuyente", required = true, nillable = true)
        protected String estadoContribuyente;
        @XmlElement(name = "CondicionContribuyente", required = true, nillable = true)
        protected String condicionContribuyente;
        @XmlElement(name = "Dependencia", required = true, nillable = true)
        protected String dependencia;
        @XmlElementRef(name = "CodigoCIIU", type = JAXBElement.class, required = false)
        protected JAXBElement<String> codigoCIIU;
        @XmlElement(name = "DescripcionCIIU", required = true, nillable = true)
        protected String descripcionCIIU;
        @XmlElement(name = "InicioActividades", required = true, nillable = true)
        protected String inicioActividades;
        @XmlElement(name = "ActividadComercioExterior", required = true, nillable = true)
        protected String actividadComercioExterior;
        @XmlElement(name = "Padron")
        protected String padron;
        @XmlElement(name = "Direcciones", required = true, nillable = true)
        protected DirectorioSUNAT.Directorio.Direcciones direcciones;
        @XmlElement(name = "NumeroTrabajadores", required = true, nillable = true)
        protected String numeroTrabajadores;

        /**
         * Obtiene el valor de la propiedad ruc.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRUC() {
            return ruc;
        }

        /**
         * Define el valor de la propiedad ruc.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRUC(String value) {
            this.ruc = value;
        }

        /**
         * Obtiene el valor de la propiedad razonSocial.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRazonSocial() {
            return razonSocial;
        }

        /**
         * Define el valor de la propiedad razonSocial.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRazonSocial(String value) {
            this.razonSocial = value;
        }

        /**
         * Obtiene el valor de la propiedad nombreComercial.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNombreComercial() {
            return nombreComercial;
        }

        /**
         * Define el valor de la propiedad nombreComercial.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNombreComercial(String value) {
            this.nombreComercial = value;
        }

        /**
         * Obtiene el valor de la propiedad tipoContribuyente.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTipoContribuyente() {
            return tipoContribuyente;
        }

        /**
         * Define el valor de la propiedad tipoContribuyente.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTipoContribuyente(String value) {
            this.tipoContribuyente = value;
        }

        /**
         * Obtiene el valor de la propiedad estadoContribuyente.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEstadoContribuyente() {
            return estadoContribuyente;
        }

        /**
         * Define el valor de la propiedad estadoContribuyente.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEstadoContribuyente(String value) {
            this.estadoContribuyente = value;
        }

        /**
         * Obtiene el valor de la propiedad condicionContribuyente.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCondicionContribuyente() {
            return condicionContribuyente;
        }

        /**
         * Define el valor de la propiedad condicionContribuyente.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCondicionContribuyente(String value) {
            this.condicionContribuyente = value;
        }

        /**
         * Obtiene el valor de la propiedad dependencia.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDependencia() {
            return dependencia;
        }

        /**
         * Define el valor de la propiedad dependencia.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDependencia(String value) {
            this.dependencia = value;
        }

        /**
         * Obtiene el valor de la propiedad codigoCIIU.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getCodigoCIIU() {
            return codigoCIIU;
        }

        /**
         * Define el valor de la propiedad codigoCIIU.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setCodigoCIIU(JAXBElement<String> value) {
            this.codigoCIIU = value;
        }

        /**
         * Obtiene el valor de la propiedad descripcionCIIU.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescripcionCIIU() {
            return descripcionCIIU;
        }

        /**
         * Define el valor de la propiedad descripcionCIIU.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescripcionCIIU(String value) {
            this.descripcionCIIU = value;
        }

        /**
         * Obtiene el valor de la propiedad inicioActividades.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInicioActividades() {
            return inicioActividades;
        }

        /**
         * Define el valor de la propiedad inicioActividades.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInicioActividades(String value) {
            this.inicioActividades = value;
        }

        /**
         * Obtiene el valor de la propiedad actividadComercioExterior.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getActividadComercioExterior() {
            return actividadComercioExterior;
        }

        /**
         * Define el valor de la propiedad actividadComercioExterior.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setActividadComercioExterior(String value) {
            this.actividadComercioExterior = value;
        }

        /**
         * Obtiene el valor de la propiedad padron.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPadron() {
            return padron;
        }

        /**
         * Define el valor de la propiedad padron.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPadron(String value) {
            this.padron = value;
        }

        /**
         * Obtiene el valor de la propiedad direcciones.
         * 
         * @return
         *     possible object is
         *     {@link DirectorioSUNAT.Directorio.Direcciones }
         *     
         */
        public DirectorioSUNAT.Directorio.Direcciones getDirecciones() {
            return direcciones;
        }

        /**
         * Define el valor de la propiedad direcciones.
         * 
         * @param value
         *     allowed object is
         *     {@link DirectorioSUNAT.Directorio.Direcciones }
         *     
         */
        public void setDirecciones(DirectorioSUNAT.Directorio.Direcciones value) {
            this.direcciones = value;
        }

        /**
         * Obtiene el valor de la propiedad numeroTrabajadores.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNumeroTrabajadores() {
            return numeroTrabajadores;
        }

        /**
         * Define el valor de la propiedad numeroTrabajadores.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNumeroTrabajadores(String value) {
            this.numeroTrabajadores = value;
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
         *         &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
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
            "direccion"
        })
        public static class Direcciones {

            @XmlElement(name = "Direccion")
            protected List<String> direccion;

            /**
             * Gets the value of the direccion property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the direccion property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDireccion().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getDireccion() {
                if (direccion == null) {
                    direccion = new ArrayList<String>();
                }
                return this.direccion;
            }

        }

    }

}
