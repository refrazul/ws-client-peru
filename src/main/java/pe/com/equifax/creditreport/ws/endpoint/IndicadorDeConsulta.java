
package pe.com.equifax.creditreport.ws.endpoint;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


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
 *         &lt;element name="Entidades"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Entidad" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Mercado" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="Periodos"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Periodo" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;simpleContent&gt;
 *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;int"&gt;
 *                                               &lt;attribute name="periodo" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                             &lt;/extension&gt;
 *                                           &lt;/simpleContent&gt;
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
    "entidades"
})
@XmlRootElement(name = "IndicadorDeConsulta")
public class IndicadorDeConsulta {

    @XmlElement(name = "Entidades", required = true)
    protected IndicadorDeConsulta.Entidades entidades;

    /**
     * Obtiene el valor de la propiedad entidades.
     * 
     * @return
     *     possible object is
     *     {@link IndicadorDeConsulta.Entidades }
     *     
     */
    public IndicadorDeConsulta.Entidades getEntidades() {
        return entidades;
    }

    /**
     * Define el valor de la propiedad entidades.
     * 
     * @param value
     *     allowed object is
     *     {@link IndicadorDeConsulta.Entidades }
     *     
     */
    public void setEntidades(IndicadorDeConsulta.Entidades value) {
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
     *         &lt;element name="Entidad" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Mercado" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="Periodos"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Periodo" maxOccurs="unbounded" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;simpleContent&gt;
     *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;int"&gt;
     *                                     &lt;attribute name="periodo" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                   &lt;/extension&gt;
     *                                 &lt;/simpleContent&gt;
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

        @XmlElement(name = "Entidad", required = true)
        protected List<IndicadorDeConsulta.Entidades.Entidad> entidad;

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
         * {@link IndicadorDeConsulta.Entidades.Entidad }
         * 
         * 
         */
        public List<IndicadorDeConsulta.Entidades.Entidad> getEntidad() {
            if (entidad == null) {
                entidad = new ArrayList<IndicadorDeConsulta.Entidades.Entidad>();
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
         *         &lt;element name="Mercado" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="Periodos"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Periodo" maxOccurs="unbounded" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;simpleContent&gt;
         *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;int"&gt;
         *                           &lt;attribute name="periodo" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                         &lt;/extension&gt;
         *                       &lt;/simpleContent&gt;
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
            "mercado",
            "nombre",
            "periodos"
        })
        public static class Entidad {

            @XmlElement(name = "Mercado", required = true)
            protected String mercado;
            @XmlElement(name = "Nombre", required = true)
            protected String nombre;
            @XmlElement(name = "Periodos", required = true)
            protected IndicadorDeConsulta.Entidades.Entidad.Periodos periodos;

            /**
             * Obtiene el valor de la propiedad mercado.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMercado() {
                return mercado;
            }

            /**
             * Define el valor de la propiedad mercado.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMercado(String value) {
                this.mercado = value;
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
             * Obtiene el valor de la propiedad periodos.
             * 
             * @return
             *     possible object is
             *     {@link IndicadorDeConsulta.Entidades.Entidad.Periodos }
             *     
             */
            public IndicadorDeConsulta.Entidades.Entidad.Periodos getPeriodos() {
                return periodos;
            }

            /**
             * Define el valor de la propiedad periodos.
             * 
             * @param value
             *     allowed object is
             *     {@link IndicadorDeConsulta.Entidades.Entidad.Periodos }
             *     
             */
            public void setPeriodos(IndicadorDeConsulta.Entidades.Entidad.Periodos value) {
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
             *             &lt;simpleContent&gt;
             *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;int"&gt;
             *                 &lt;attribute name="periodo" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *               &lt;/extension&gt;
             *             &lt;/simpleContent&gt;
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
                protected List<IndicadorDeConsulta.Entidades.Entidad.Periodos.Periodo> periodo;

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
                 * {@link IndicadorDeConsulta.Entidades.Entidad.Periodos.Periodo }
                 * 
                 * 
                 */
                public List<IndicadorDeConsulta.Entidades.Entidad.Periodos.Periodo> getPeriodo() {
                    if (periodo == null) {
                        periodo = new ArrayList<IndicadorDeConsulta.Entidades.Entidad.Periodos.Periodo>();
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
                 *   &lt;simpleContent&gt;
                 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;int"&gt;
                 *       &lt;attribute name="periodo" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *     &lt;/extension&gt;
                 *   &lt;/simpleContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "value"
                })
                public static class Periodo {

                    @XmlValue
                    protected int value;
                    @XmlAttribute(name = "periodo")
                    protected String periodo;

                    /**
                     * Obtiene el valor de la propiedad value.
                     * 
                     */
                    public int getValue() {
                        return value;
                    }

                    /**
                     * Define el valor de la propiedad value.
                     * 
                     */
                    public void setValue(int value) {
                        this.value = value;
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
