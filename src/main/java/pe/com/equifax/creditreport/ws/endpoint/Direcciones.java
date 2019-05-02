
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
 *         &lt;element name="Direccion" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Fecha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="Telefono" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="Anexo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="Fuente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="Ubigeo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="CodigoUbigeo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="Departamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="Provincia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="Distrito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "direccion"
})
@XmlRootElement(name = "Direcciones")
public class Direcciones {

    @XmlElement(name = "Direccion", nillable = true)
    protected List<Direcciones.Direccion> direccion;

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
     * {@link Direcciones.Direccion }
     * 
     * 
     */
    public List<Direcciones.Direccion> getDireccion() {
        if (direccion == null) {
            direccion = new ArrayList<Direcciones.Direccion>();
        }
        return this.direccion;
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
     *         &lt;element name="Fecha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="Telefono" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="Anexo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="Fuente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="Ubigeo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="CodigoUbigeo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="Departamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="Provincia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="Distrito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "fecha",
        "descripcion",
        "telefono",
        "anexo",
        "fuente",
        "ubigeo",
        "codigoUbigeo",
        "departamento",
        "provincia",
        "distrito"
    })
    public static class Direccion {

        @XmlElementRef(name = "Fecha", type = JAXBElement.class, required = false)
        protected JAXBElement<String> fecha;
        @XmlElementRef(name = "Descripcion", type = JAXBElement.class, required = false)
        protected JAXBElement<String> descripcion;
        @XmlElementRef(name = "Telefono", type = JAXBElement.class, required = false)
        protected JAXBElement<String> telefono;
        @XmlElementRef(name = "Anexo", type = JAXBElement.class, required = false)
        protected JAXBElement<String> anexo;
        @XmlElementRef(name = "Fuente", type = JAXBElement.class, required = false)
        protected JAXBElement<String> fuente;
        @XmlElementRef(name = "Ubigeo", type = JAXBElement.class, required = false)
        protected JAXBElement<String> ubigeo;
        @XmlElementRef(name = "CodigoUbigeo", type = JAXBElement.class, required = false)
        protected JAXBElement<String> codigoUbigeo;
        @XmlElementRef(name = "Departamento", type = JAXBElement.class, required = false)
        protected JAXBElement<String> departamento;
        @XmlElementRef(name = "Provincia", type = JAXBElement.class, required = false)
        protected JAXBElement<String> provincia;
        @XmlElementRef(name = "Distrito", type = JAXBElement.class, required = false)
        protected JAXBElement<String> distrito;

        /**
         * Obtiene el valor de la propiedad fecha.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getFecha() {
            return fecha;
        }

        /**
         * Define el valor de la propiedad fecha.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setFecha(JAXBElement<String> value) {
            this.fecha = value;
        }

        /**
         * Obtiene el valor de la propiedad descripcion.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getDescripcion() {
            return descripcion;
        }

        /**
         * Define el valor de la propiedad descripcion.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setDescripcion(JAXBElement<String> value) {
            this.descripcion = value;
        }

        /**
         * Obtiene el valor de la propiedad telefono.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getTelefono() {
            return telefono;
        }

        /**
         * Define el valor de la propiedad telefono.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setTelefono(JAXBElement<String> value) {
            this.telefono = value;
        }

        /**
         * Obtiene el valor de la propiedad anexo.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getAnexo() {
            return anexo;
        }

        /**
         * Define el valor de la propiedad anexo.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setAnexo(JAXBElement<String> value) {
            this.anexo = value;
        }

        /**
         * Obtiene el valor de la propiedad fuente.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getFuente() {
            return fuente;
        }

        /**
         * Define el valor de la propiedad fuente.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setFuente(JAXBElement<String> value) {
            this.fuente = value;
        }

        /**
         * Obtiene el valor de la propiedad ubigeo.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getUbigeo() {
            return ubigeo;
        }

        /**
         * Define el valor de la propiedad ubigeo.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setUbigeo(JAXBElement<String> value) {
            this.ubigeo = value;
        }

        /**
         * Obtiene el valor de la propiedad codigoUbigeo.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getCodigoUbigeo() {
            return codigoUbigeo;
        }

        /**
         * Define el valor de la propiedad codigoUbigeo.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setCodigoUbigeo(JAXBElement<String> value) {
            this.codigoUbigeo = value;
        }

        /**
         * Obtiene el valor de la propiedad departamento.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getDepartamento() {
            return departamento;
        }

        /**
         * Define el valor de la propiedad departamento.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setDepartamento(JAXBElement<String> value) {
            this.departamento = value;
        }

        /**
         * Obtiene el valor de la propiedad provincia.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getProvincia() {
            return provincia;
        }

        /**
         * Define el valor de la propiedad provincia.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setProvincia(JAXBElement<String> value) {
            this.provincia = value;
        }

        /**
         * Obtiene el valor de la propiedad distrito.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getDistrito() {
            return distrito;
        }

        /**
         * Define el valor de la propiedad distrito.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setDistrito(JAXBElement<String> value) {
            this.distrito = value;
        }

    }

}
