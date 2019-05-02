
package pe.com.equifax.creditreport.ws.endpoint;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *         &lt;element name="ResumenDeudasImpagas"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="SemaforoPeriodo" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="TieneDeuda" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *                             &lt;element name="DetalleProductos"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="ProductoDeuda" maxOccurs="unbounded"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="CodigoProducto" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                                                 &lt;element name="DeudaSoles" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                                                 &lt;element name="DeudaDolares" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
 *         &lt;element name="Sicom"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Cabecera"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="FechaVencimientoReciente" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="CantidadSoles" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                             &lt;element name="MontoSoles" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                             &lt;element name="CantidadDolares" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                             &lt;element name="MontoDolares" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Detalle"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Deuda" maxOccurs="unbounded"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="FechaVencimiento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="FechaReportada" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="Divisa" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="Monto" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                                       &lt;element name="Acreedor" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="DocumentoBancario" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="CondicionDeuda" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="TipoDeudor" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
 *         &lt;element name="NegativoSunat"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Cabecera"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="FechaCobranzaReciente" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="CantidadTotal" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                             &lt;element name="MontoTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Detalle"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Deuda" maxOccurs="unbounded"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Periodo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="Monto" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                                       &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="Dependencia" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="FechaCobranza" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="FechaProceso" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
 *         &lt;element name="Omisos" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Cabecera" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Cantidad" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Detalle" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Omision" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="FechaOmision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                       &lt;element name="Concepto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                       &lt;element name="FechaProceso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
 *         &lt;element name="Protestos"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ProtestosAclarados"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Cabecera"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="FechaVencimientoReciente" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="CantidadSoles" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                                       &lt;element name="MontoSoles" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                                       &lt;element name="CantidadDolares" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                                       &lt;element name="MontoDolares" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="Detalle"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Deuda" maxOccurs="unbounded"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="CorrelativoBNP" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="NumeroBoletin" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="TipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="Divisa" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="Monto" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                                 &lt;element name="EmisorDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="AceptanteDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                                 &lt;element name="FechaVencimiento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="FechaAclaracion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                                 &lt;element name="Notaria" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
 *                   &lt;element name="ProtestosNoAclarados"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Cabecera"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="FechaVencimientoReciente" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="CantidadSoles" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                                       &lt;element name="MontoSoles" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                                       &lt;element name="CantidadDolares" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                                       &lt;element name="MontoDolares" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="Detalle"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Deuda" maxOccurs="unbounded"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="CorrelativoBNP" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="NumeroBoletin" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="TipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="Divisa" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="Monto" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                                 &lt;element name="EmisorDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="AceptanteDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                                 &lt;element name="FechaVencimiento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="FechaAclaracion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                                 &lt;element name="Notaria" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
 *         &lt;element name="CuentasCerradas"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Cabecera"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="FechaSancionReciente" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Detalle"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="InformacionNegativa" maxOccurs="unbounded"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="FechaSancion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="FechaFinSancion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="FechaPublicacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="NumeroPublicacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="Divisa" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="TipoCuenta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="Entidad" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
 *         &lt;element name="TarjetasAnuladas"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Cabecera"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="FechaSancionReciente" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Detalle"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="InformacionNegativa" maxOccurs="unbounded"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="FechaSancion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="FechaFinSancion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="FechaPublicacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="NumeroPublicacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="Divisa" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="TipoCuenta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="Entidad" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
 *         &lt;element name="DeudasAFP" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="PeriodoAFP" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Meses" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *                             &lt;element name="TipoDeudas"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="TipoDeuda" maxOccurs="unbounded"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="CodigoTipoDeuda" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                                                 &lt;element name="TieneDeuda" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *                                                 &lt;element name="AFPs" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="Monto" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                                 &lt;element name="Meses" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
 *                           &lt;attribute name="periodo" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
    "resumenDeudasImpagas",
    "sicom",
    "negativoSunat",
    "omisos",
    "protestos",
    "cuentasCerradas",
    "tarjetasAnuladas",
    "deudasAFP"
})
@XmlRootElement(name = "DeudasImpagas")
public class DeudasImpagas {

    @XmlElement(name = "ResumenDeudasImpagas", required = true)
    protected DeudasImpagas.ResumenDeudasImpagas resumenDeudasImpagas;
    @XmlElement(name = "Sicom", required = true)
    protected DeudasImpagas.Sicom sicom;
    @XmlElement(name = "NegativoSunat", required = true)
    protected DeudasImpagas.NegativoSunat negativoSunat;
    @XmlElement(name = "Omisos")
    protected DeudasImpagas.Omisos omisos;
    @XmlElement(name = "Protestos", required = true)
    protected DeudasImpagas.Protestos protestos;
    @XmlElement(name = "CuentasCerradas", required = true)
    protected DeudasImpagas.CuentasCerradas cuentasCerradas;
    @XmlElement(name = "TarjetasAnuladas", required = true)
    protected DeudasImpagas.TarjetasAnuladas tarjetasAnuladas;
    @XmlElement(name = "DeudasAFP")
    protected DeudasImpagas.DeudasAFP deudasAFP;

    /**
     * Obtiene el valor de la propiedad resumenDeudasImpagas.
     * 
     * @return
     *     possible object is
     *     {@link DeudasImpagas.ResumenDeudasImpagas }
     *     
     */
    public DeudasImpagas.ResumenDeudasImpagas getResumenDeudasImpagas() {
        return resumenDeudasImpagas;
    }

    /**
     * Define el valor de la propiedad resumenDeudasImpagas.
     * 
     * @param value
     *     allowed object is
     *     {@link DeudasImpagas.ResumenDeudasImpagas }
     *     
     */
    public void setResumenDeudasImpagas(DeudasImpagas.ResumenDeudasImpagas value) {
        this.resumenDeudasImpagas = value;
    }

    /**
     * Obtiene el valor de la propiedad sicom.
     * 
     * @return
     *     possible object is
     *     {@link DeudasImpagas.Sicom }
     *     
     */
    public DeudasImpagas.Sicom getSicom() {
        return sicom;
    }

    /**
     * Define el valor de la propiedad sicom.
     * 
     * @param value
     *     allowed object is
     *     {@link DeudasImpagas.Sicom }
     *     
     */
    public void setSicom(DeudasImpagas.Sicom value) {
        this.sicom = value;
    }

    /**
     * Obtiene el valor de la propiedad negativoSunat.
     * 
     * @return
     *     possible object is
     *     {@link DeudasImpagas.NegativoSunat }
     *     
     */
    public DeudasImpagas.NegativoSunat getNegativoSunat() {
        return negativoSunat;
    }

    /**
     * Define el valor de la propiedad negativoSunat.
     * 
     * @param value
     *     allowed object is
     *     {@link DeudasImpagas.NegativoSunat }
     *     
     */
    public void setNegativoSunat(DeudasImpagas.NegativoSunat value) {
        this.negativoSunat = value;
    }

    /**
     * Obtiene el valor de la propiedad omisos.
     * 
     * @return
     *     possible object is
     *     {@link DeudasImpagas.Omisos }
     *     
     */
    public DeudasImpagas.Omisos getOmisos() {
        return omisos;
    }

    /**
     * Define el valor de la propiedad omisos.
     * 
     * @param value
     *     allowed object is
     *     {@link DeudasImpagas.Omisos }
     *     
     */
    public void setOmisos(DeudasImpagas.Omisos value) {
        this.omisos = value;
    }

    /**
     * Obtiene el valor de la propiedad protestos.
     * 
     * @return
     *     possible object is
     *     {@link DeudasImpagas.Protestos }
     *     
     */
    public DeudasImpagas.Protestos getProtestos() {
        return protestos;
    }

    /**
     * Define el valor de la propiedad protestos.
     * 
     * @param value
     *     allowed object is
     *     {@link DeudasImpagas.Protestos }
     *     
     */
    public void setProtestos(DeudasImpagas.Protestos value) {
        this.protestos = value;
    }

    /**
     * Obtiene el valor de la propiedad cuentasCerradas.
     * 
     * @return
     *     possible object is
     *     {@link DeudasImpagas.CuentasCerradas }
     *     
     */
    public DeudasImpagas.CuentasCerradas getCuentasCerradas() {
        return cuentasCerradas;
    }

    /**
     * Define el valor de la propiedad cuentasCerradas.
     * 
     * @param value
     *     allowed object is
     *     {@link DeudasImpagas.CuentasCerradas }
     *     
     */
    public void setCuentasCerradas(DeudasImpagas.CuentasCerradas value) {
        this.cuentasCerradas = value;
    }

    /**
     * Obtiene el valor de la propiedad tarjetasAnuladas.
     * 
     * @return
     *     possible object is
     *     {@link DeudasImpagas.TarjetasAnuladas }
     *     
     */
    public DeudasImpagas.TarjetasAnuladas getTarjetasAnuladas() {
        return tarjetasAnuladas;
    }

    /**
     * Define el valor de la propiedad tarjetasAnuladas.
     * 
     * @param value
     *     allowed object is
     *     {@link DeudasImpagas.TarjetasAnuladas }
     *     
     */
    public void setTarjetasAnuladas(DeudasImpagas.TarjetasAnuladas value) {
        this.tarjetasAnuladas = value;
    }

    /**
     * Obtiene el valor de la propiedad deudasAFP.
     * 
     * @return
     *     possible object is
     *     {@link DeudasImpagas.DeudasAFP }
     *     
     */
    public DeudasImpagas.DeudasAFP getDeudasAFP() {
        return deudasAFP;
    }

    /**
     * Define el valor de la propiedad deudasAFP.
     * 
     * @param value
     *     allowed object is
     *     {@link DeudasImpagas.DeudasAFP }
     *     
     */
    public void setDeudasAFP(DeudasImpagas.DeudasAFP value) {
        this.deudasAFP = value;
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
     *         &lt;element name="Cabecera"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="FechaSancionReciente" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Detalle"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="InformacionNegativa" maxOccurs="unbounded"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="FechaSancion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="FechaFinSancion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="FechaPublicacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="NumeroPublicacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="Divisa" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="TipoCuenta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="Entidad" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "cabecera",
        "detalle"
    })
    public static class CuentasCerradas {

        @XmlElement(name = "Cabecera", required = true)
        protected DeudasImpagas.CuentasCerradas.Cabecera cabecera;
        @XmlElement(name = "Detalle", required = true)
        protected DeudasImpagas.CuentasCerradas.Detalle detalle;

        /**
         * Obtiene el valor de la propiedad cabecera.
         * 
         * @return
         *     possible object is
         *     {@link DeudasImpagas.CuentasCerradas.Cabecera }
         *     
         */
        public DeudasImpagas.CuentasCerradas.Cabecera getCabecera() {
            return cabecera;
        }

        /**
         * Define el valor de la propiedad cabecera.
         * 
         * @param value
         *     allowed object is
         *     {@link DeudasImpagas.CuentasCerradas.Cabecera }
         *     
         */
        public void setCabecera(DeudasImpagas.CuentasCerradas.Cabecera value) {
            this.cabecera = value;
        }

        /**
         * Obtiene el valor de la propiedad detalle.
         * 
         * @return
         *     possible object is
         *     {@link DeudasImpagas.CuentasCerradas.Detalle }
         *     
         */
        public DeudasImpagas.CuentasCerradas.Detalle getDetalle() {
            return detalle;
        }

        /**
         * Define el valor de la propiedad detalle.
         * 
         * @param value
         *     allowed object is
         *     {@link DeudasImpagas.CuentasCerradas.Detalle }
         *     
         */
        public void setDetalle(DeudasImpagas.CuentasCerradas.Detalle value) {
            this.detalle = value;
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
         *         &lt;element name="FechaSancionReciente" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
            "fechaSancionReciente"
        })
        public static class Cabecera {

            @XmlElement(name = "FechaSancionReciente", required = true)
            protected String fechaSancionReciente;

            /**
             * Obtiene el valor de la propiedad fechaSancionReciente.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFechaSancionReciente() {
                return fechaSancionReciente;
            }

            /**
             * Define el valor de la propiedad fechaSancionReciente.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFechaSancionReciente(String value) {
                this.fechaSancionReciente = value;
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
         *         &lt;element name="InformacionNegativa" maxOccurs="unbounded"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="FechaSancion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="FechaFinSancion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="FechaPublicacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="NumeroPublicacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="Divisa" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="TipoCuenta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="Entidad" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
            "informacionNegativa"
        })
        public static class Detalle {

            @XmlElement(name = "InformacionNegativa", required = true)
            protected List<DeudasImpagas.CuentasCerradas.Detalle.InformacionNegativa> informacionNegativa;

            /**
             * Gets the value of the informacionNegativa property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the informacionNegativa property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getInformacionNegativa().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link DeudasImpagas.CuentasCerradas.Detalle.InformacionNegativa }
             * 
             * 
             */
            public List<DeudasImpagas.CuentasCerradas.Detalle.InformacionNegativa> getInformacionNegativa() {
                if (informacionNegativa == null) {
                    informacionNegativa = new ArrayList<DeudasImpagas.CuentasCerradas.Detalle.InformacionNegativa>();
                }
                return this.informacionNegativa;
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
             *         &lt;element name="FechaSancion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="FechaFinSancion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="FechaPublicacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="NumeroPublicacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="Divisa" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="TipoCuenta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="Entidad" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
                "fechaSancion",
                "fechaFinSancion",
                "fechaPublicacion",
                "numeroPublicacion",
                "divisa",
                "tipoCuenta",
                "entidad"
            })
            public static class InformacionNegativa {

                @XmlElement(name = "FechaSancion", required = true)
                protected String fechaSancion;
                @XmlElement(name = "FechaFinSancion", required = true)
                protected String fechaFinSancion;
                @XmlElement(name = "FechaPublicacion", required = true)
                protected String fechaPublicacion;
                @XmlElement(name = "NumeroPublicacion", required = true)
                protected String numeroPublicacion;
                @XmlElement(name = "Divisa", required = true)
                protected String divisa;
                @XmlElement(name = "TipoCuenta", required = true)
                protected String tipoCuenta;
                @XmlElement(name = "Entidad", required = true)
                protected String entidad;

                /**
                 * Obtiene el valor de la propiedad fechaSancion.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFechaSancion() {
                    return fechaSancion;
                }

                /**
                 * Define el valor de la propiedad fechaSancion.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFechaSancion(String value) {
                    this.fechaSancion = value;
                }

                /**
                 * Obtiene el valor de la propiedad fechaFinSancion.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFechaFinSancion() {
                    return fechaFinSancion;
                }

                /**
                 * Define el valor de la propiedad fechaFinSancion.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFechaFinSancion(String value) {
                    this.fechaFinSancion = value;
                }

                /**
                 * Obtiene el valor de la propiedad fechaPublicacion.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFechaPublicacion() {
                    return fechaPublicacion;
                }

                /**
                 * Define el valor de la propiedad fechaPublicacion.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFechaPublicacion(String value) {
                    this.fechaPublicacion = value;
                }

                /**
                 * Obtiene el valor de la propiedad numeroPublicacion.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNumeroPublicacion() {
                    return numeroPublicacion;
                }

                /**
                 * Define el valor de la propiedad numeroPublicacion.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNumeroPublicacion(String value) {
                    this.numeroPublicacion = value;
                }

                /**
                 * Obtiene el valor de la propiedad divisa.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDivisa() {
                    return divisa;
                }

                /**
                 * Define el valor de la propiedad divisa.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDivisa(String value) {
                    this.divisa = value;
                }

                /**
                 * Obtiene el valor de la propiedad tipoCuenta.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTipoCuenta() {
                    return tipoCuenta;
                }

                /**
                 * Define el valor de la propiedad tipoCuenta.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTipoCuenta(String value) {
                    this.tipoCuenta = value;
                }

                /**
                 * Obtiene el valor de la propiedad entidad.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getEntidad() {
                    return entidad;
                }

                /**
                 * Define el valor de la propiedad entidad.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setEntidad(String value) {
                    this.entidad = value;
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
     *         &lt;element name="PeriodoAFP" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Meses" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
     *                   &lt;element name="TipoDeudas"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="TipoDeuda" maxOccurs="unbounded"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="CodigoTipoDeuda" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *                                       &lt;element name="TieneDeuda" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
     *                                       &lt;element name="AFPs" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="Monto" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                                       &lt;element name="Meses" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
     *                 &lt;attribute name="periodo" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
        "periodoAFP"
    })
    public static class DeudasAFP {

        @XmlElement(name = "PeriodoAFP", required = true)
        protected List<DeudasImpagas.DeudasAFP.PeriodoAFP> periodoAFP;

        /**
         * Gets the value of the periodoAFP property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the periodoAFP property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPeriodoAFP().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DeudasImpagas.DeudasAFP.PeriodoAFP }
         * 
         * 
         */
        public List<DeudasImpagas.DeudasAFP.PeriodoAFP> getPeriodoAFP() {
            if (periodoAFP == null) {
                periodoAFP = new ArrayList<DeudasImpagas.DeudasAFP.PeriodoAFP>();
            }
            return this.periodoAFP;
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
         *         &lt;element name="Meses" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
         *         &lt;element name="TipoDeudas"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="TipoDeuda" maxOccurs="unbounded"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="CodigoTipoDeuda" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
         *                             &lt;element name="TieneDeuda" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
         *                             &lt;element name="AFPs" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="Monto" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                             &lt;element name="Meses" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
         *       &lt;attribute name="periodo" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
            "meses",
            "tipoDeudas"
        })
        public static class PeriodoAFP {

            @XmlElement(name = "Meses")
            protected Integer meses;
            @XmlElement(name = "TipoDeudas", required = true)
            protected DeudasImpagas.DeudasAFP.PeriodoAFP.TipoDeudas tipoDeudas;
            @XmlAttribute(name = "periodo", required = true)
            protected String periodo;
            @XmlAttribute(name = "flag", required = true)
            protected boolean flag;

            /**
             * Obtiene el valor de la propiedad meses.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getMeses() {
                return meses;
            }

            /**
             * Define el valor de la propiedad meses.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setMeses(Integer value) {
                this.meses = value;
            }

            /**
             * Obtiene el valor de la propiedad tipoDeudas.
             * 
             * @return
             *     possible object is
             *     {@link DeudasImpagas.DeudasAFP.PeriodoAFP.TipoDeudas }
             *     
             */
            public DeudasImpagas.DeudasAFP.PeriodoAFP.TipoDeudas getTipoDeudas() {
                return tipoDeudas;
            }

            /**
             * Define el valor de la propiedad tipoDeudas.
             * 
             * @param value
             *     allowed object is
             *     {@link DeudasImpagas.DeudasAFP.PeriodoAFP.TipoDeudas }
             *     
             */
            public void setTipoDeudas(DeudasImpagas.DeudasAFP.PeriodoAFP.TipoDeudas value) {
                this.tipoDeudas = value;
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
             *         &lt;element name="TipoDeuda" maxOccurs="unbounded"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="CodigoTipoDeuda" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
             *                   &lt;element name="TieneDeuda" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
             *                   &lt;element name="AFPs" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="Monto" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *                   &lt;element name="Meses" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
                "tipoDeuda"
            })
            public static class TipoDeudas {

                @XmlElement(name = "TipoDeuda", required = true)
                protected List<DeudasImpagas.DeudasAFP.PeriodoAFP.TipoDeudas.TipoDeuda> tipoDeuda;

                /**
                 * Gets the value of the tipoDeuda property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the tipoDeuda property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getTipoDeuda().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link DeudasImpagas.DeudasAFP.PeriodoAFP.TipoDeudas.TipoDeuda }
                 * 
                 * 
                 */
                public List<DeudasImpagas.DeudasAFP.PeriodoAFP.TipoDeudas.TipoDeuda> getTipoDeuda() {
                    if (tipoDeuda == null) {
                        tipoDeuda = new ArrayList<DeudasImpagas.DeudasAFP.PeriodoAFP.TipoDeudas.TipoDeuda>();
                    }
                    return this.tipoDeuda;
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
                 *         &lt;element name="CodigoTipoDeuda" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
                 *         &lt;element name="TieneDeuda" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
                 *         &lt;element name="AFPs" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="Monto" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
                 *         &lt;element name="Meses" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
                    "codigoTipoDeuda",
                    "tieneDeuda",
                    "afPs",
                    "monto",
                    "meses"
                })
                public static class TipoDeuda {

                    @XmlElement(name = "CodigoTipoDeuda")
                    protected int codigoTipoDeuda;
                    @XmlElement(name = "TieneDeuda")
                    protected boolean tieneDeuda;
                    @XmlElement(name = "AFPs", required = true)
                    protected String afPs;
                    @XmlElement(name = "Monto", required = true)
                    protected BigDecimal monto;
                    @XmlElement(name = "Meses")
                    protected Integer meses;

                    /**
                     * Obtiene el valor de la propiedad codigoTipoDeuda.
                     * 
                     */
                    public int getCodigoTipoDeuda() {
                        return codigoTipoDeuda;
                    }

                    /**
                     * Define el valor de la propiedad codigoTipoDeuda.
                     * 
                     */
                    public void setCodigoTipoDeuda(int value) {
                        this.codigoTipoDeuda = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad tieneDeuda.
                     * 
                     */
                    public boolean isTieneDeuda() {
                        return tieneDeuda;
                    }

                    /**
                     * Define el valor de la propiedad tieneDeuda.
                     * 
                     */
                    public void setTieneDeuda(boolean value) {
                        this.tieneDeuda = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad afPs.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getAFPs() {
                        return afPs;
                    }

                    /**
                     * Define el valor de la propiedad afPs.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setAFPs(String value) {
                        this.afPs = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad monto.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getMonto() {
                        return monto;
                    }

                    /**
                     * Define el valor de la propiedad monto.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setMonto(BigDecimal value) {
                        this.monto = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad meses.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *     
                     */
                    public Integer getMeses() {
                        return meses;
                    }

                    /**
                     * Define el valor de la propiedad meses.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *     
                     */
                    public void setMeses(Integer value) {
                        this.meses = value;
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
     *         &lt;element name="Cabecera"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="FechaCobranzaReciente" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="CantidadTotal" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *                   &lt;element name="MontoTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Detalle"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Deuda" maxOccurs="unbounded"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Periodo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="Monto" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                             &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="Dependencia" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="FechaCobranza" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="FechaProceso" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "cabecera",
        "detalle"
    })
    public static class NegativoSunat {

        @XmlElement(name = "Cabecera", required = true)
        protected DeudasImpagas.NegativoSunat.Cabecera cabecera;
        @XmlElement(name = "Detalle", required = true)
        protected DeudasImpagas.NegativoSunat.Detalle detalle;

        /**
         * Obtiene el valor de la propiedad cabecera.
         * 
         * @return
         *     possible object is
         *     {@link DeudasImpagas.NegativoSunat.Cabecera }
         *     
         */
        public DeudasImpagas.NegativoSunat.Cabecera getCabecera() {
            return cabecera;
        }

        /**
         * Define el valor de la propiedad cabecera.
         * 
         * @param value
         *     allowed object is
         *     {@link DeudasImpagas.NegativoSunat.Cabecera }
         *     
         */
        public void setCabecera(DeudasImpagas.NegativoSunat.Cabecera value) {
            this.cabecera = value;
        }

        /**
         * Obtiene el valor de la propiedad detalle.
         * 
         * @return
         *     possible object is
         *     {@link DeudasImpagas.NegativoSunat.Detalle }
         *     
         */
        public DeudasImpagas.NegativoSunat.Detalle getDetalle() {
            return detalle;
        }

        /**
         * Define el valor de la propiedad detalle.
         * 
         * @param value
         *     allowed object is
         *     {@link DeudasImpagas.NegativoSunat.Detalle }
         *     
         */
        public void setDetalle(DeudasImpagas.NegativoSunat.Detalle value) {
            this.detalle = value;
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
         *         &lt;element name="FechaCobranzaReciente" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="CantidadTotal" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
         *         &lt;element name="MontoTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
            "fechaCobranzaReciente",
            "cantidadTotal",
            "montoTotal"
        })
        public static class Cabecera {

            @XmlElement(name = "FechaCobranzaReciente", required = true)
            protected String fechaCobranzaReciente;
            @XmlElement(name = "CantidadTotal")
            protected int cantidadTotal;
            @XmlElement(name = "MontoTotal")
            protected BigDecimal montoTotal;

            /**
             * Obtiene el valor de la propiedad fechaCobranzaReciente.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFechaCobranzaReciente() {
                return fechaCobranzaReciente;
            }

            /**
             * Define el valor de la propiedad fechaCobranzaReciente.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFechaCobranzaReciente(String value) {
                this.fechaCobranzaReciente = value;
            }

            /**
             * Obtiene el valor de la propiedad cantidadTotal.
             * 
             */
            public int getCantidadTotal() {
                return cantidadTotal;
            }

            /**
             * Define el valor de la propiedad cantidadTotal.
             * 
             */
            public void setCantidadTotal(int value) {
                this.cantidadTotal = value;
            }

            /**
             * Obtiene el valor de la propiedad montoTotal.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getMontoTotal() {
                return montoTotal;
            }

            /**
             * Define el valor de la propiedad montoTotal.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setMontoTotal(BigDecimal value) {
                this.montoTotal = value;
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
         *         &lt;element name="Deuda" maxOccurs="unbounded"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Periodo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="Monto" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *                   &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="Dependencia" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="FechaCobranza" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="FechaProceso" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        public static class Detalle {

            @XmlElement(name = "Deuda", required = true)
            protected List<DeudasImpagas.NegativoSunat.Detalle.Deuda> deuda;

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
             * {@link DeudasImpagas.NegativoSunat.Detalle.Deuda }
             * 
             * 
             */
            public List<DeudasImpagas.NegativoSunat.Detalle.Deuda> getDeuda() {
                if (deuda == null) {
                    deuda = new ArrayList<DeudasImpagas.NegativoSunat.Detalle.Deuda>();
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
             *         &lt;element name="Periodo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="Monto" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
             *         &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="Dependencia" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="FechaCobranza" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="FechaProceso" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
                "periodo",
                "monto",
                "tipo",
                "dependencia",
                "fechaCobranza",
                "fechaProceso"
            })
            public static class Deuda {

                @XmlElement(name = "Periodo", required = true)
                protected String periodo;
                @XmlElement(name = "Monto")
                protected BigDecimal monto;
                @XmlElement(name = "Tipo", required = true)
                protected String tipo;
                @XmlElement(name = "Dependencia", required = true)
                protected String dependencia;
                @XmlElement(name = "FechaCobranza", required = true)
                protected String fechaCobranza;
                @XmlElement(name = "FechaProceso", required = true)
                protected String fechaProceso;

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
                 * Obtiene el valor de la propiedad monto.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getMonto() {
                    return monto;
                }

                /**
                 * Define el valor de la propiedad monto.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setMonto(BigDecimal value) {
                    this.monto = value;
                }

                /**
                 * Obtiene el valor de la propiedad tipo.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTipo() {
                    return tipo;
                }

                /**
                 * Define el valor de la propiedad tipo.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTipo(String value) {
                    this.tipo = value;
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
                 * Obtiene el valor de la propiedad fechaCobranza.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFechaCobranza() {
                    return fechaCobranza;
                }

                /**
                 * Define el valor de la propiedad fechaCobranza.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFechaCobranza(String value) {
                    this.fechaCobranza = value;
                }

                /**
                 * Obtiene el valor de la propiedad fechaProceso.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFechaProceso() {
                    return fechaProceso;
                }

                /**
                 * Define el valor de la propiedad fechaProceso.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFechaProceso(String value) {
                    this.fechaProceso = value;
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
     *         &lt;element name="Cabecera" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Cantidad" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Detalle" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Omision" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="FechaOmision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="Concepto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="FechaProceso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "cabecera",
        "detalle"
    })
    public static class Omisos {

        @XmlElement(name = "Cabecera")
        protected DeudasImpagas.Omisos.Cabecera cabecera;
        @XmlElement(name = "Detalle")
        protected DeudasImpagas.Omisos.Detalle detalle;

        /**
         * Obtiene el valor de la propiedad cabecera.
         * 
         * @return
         *     possible object is
         *     {@link DeudasImpagas.Omisos.Cabecera }
         *     
         */
        public DeudasImpagas.Omisos.Cabecera getCabecera() {
            return cabecera;
        }

        /**
         * Define el valor de la propiedad cabecera.
         * 
         * @param value
         *     allowed object is
         *     {@link DeudasImpagas.Omisos.Cabecera }
         *     
         */
        public void setCabecera(DeudasImpagas.Omisos.Cabecera value) {
            this.cabecera = value;
        }

        /**
         * Obtiene el valor de la propiedad detalle.
         * 
         * @return
         *     possible object is
         *     {@link DeudasImpagas.Omisos.Detalle }
         *     
         */
        public DeudasImpagas.Omisos.Detalle getDetalle() {
            return detalle;
        }

        /**
         * Define el valor de la propiedad detalle.
         * 
         * @param value
         *     allowed object is
         *     {@link DeudasImpagas.Omisos.Detalle }
         *     
         */
        public void setDetalle(DeudasImpagas.Omisos.Detalle value) {
            this.detalle = value;
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
         *         &lt;element name="Cantidad" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
            "cantidad"
        })
        public static class Cabecera {

            @XmlElement(name = "Cantidad")
            protected int cantidad;

            /**
             * Obtiene el valor de la propiedad cantidad.
             * 
             */
            public int getCantidad() {
                return cantidad;
            }

            /**
             * Define el valor de la propiedad cantidad.
             * 
             */
            public void setCantidad(int value) {
                this.cantidad = value;
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
         *         &lt;element name="Omision" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="FechaOmision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="Concepto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="FechaProceso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "omision"
        })
        public static class Detalle {

            @XmlElement(name = "Omision")
            protected List<DeudasImpagas.Omisos.Detalle.Omision> omision;

            /**
             * Gets the value of the omision property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the omision property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getOmision().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link DeudasImpagas.Omisos.Detalle.Omision }
             * 
             * 
             */
            public List<DeudasImpagas.Omisos.Detalle.Omision> getOmision() {
                if (omision == null) {
                    omision = new ArrayList<DeudasImpagas.Omisos.Detalle.Omision>();
                }
                return this.omision;
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
             *         &lt;element name="FechaOmision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;element name="Concepto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;element name="FechaProceso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
                "fechaOmision",
                "concepto",
                "fechaProceso"
            })
            public static class Omision {

                @XmlElement(name = "FechaOmision")
                protected String fechaOmision;
                @XmlElement(name = "Concepto")
                protected String concepto;
                @XmlElement(name = "FechaProceso")
                protected String fechaProceso;

                /**
                 * Obtiene el valor de la propiedad fechaOmision.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFechaOmision() {
                    return fechaOmision;
                }

                /**
                 * Define el valor de la propiedad fechaOmision.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFechaOmision(String value) {
                    this.fechaOmision = value;
                }

                /**
                 * Obtiene el valor de la propiedad concepto.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getConcepto() {
                    return concepto;
                }

                /**
                 * Define el valor de la propiedad concepto.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setConcepto(String value) {
                    this.concepto = value;
                }

                /**
                 * Obtiene el valor de la propiedad fechaProceso.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFechaProceso() {
                    return fechaProceso;
                }

                /**
                 * Define el valor de la propiedad fechaProceso.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFechaProceso(String value) {
                    this.fechaProceso = value;
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
     *         &lt;element name="ProtestosAclarados"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Cabecera"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="FechaVencimientoReciente" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="CantidadSoles" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *                             &lt;element name="MontoSoles" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                             &lt;element name="CantidadDolares" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *                             &lt;element name="MontoDolares" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="Detalle"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Deuda" maxOccurs="unbounded"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="CorrelativoBNP" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="NumeroBoletin" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="TipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="Divisa" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="Monto" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                                       &lt;element name="EmisorDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="AceptanteDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                       &lt;element name="FechaVencimiento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="FechaAclaracion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                       &lt;element name="Notaria" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
     *         &lt;element name="ProtestosNoAclarados"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Cabecera"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="FechaVencimientoReciente" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="CantidadSoles" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *                             &lt;element name="MontoSoles" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                             &lt;element name="CantidadDolares" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *                             &lt;element name="MontoDolares" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="Detalle"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Deuda" maxOccurs="unbounded"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="CorrelativoBNP" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="NumeroBoletin" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="TipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="Divisa" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="Monto" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                                       &lt;element name="EmisorDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="AceptanteDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                       &lt;element name="FechaVencimiento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="FechaAclaracion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                       &lt;element name="Notaria" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "protestosAclarados",
        "protestosNoAclarados"
    })
    public static class Protestos {

        @XmlElement(name = "ProtestosAclarados", required = true)
        protected DeudasImpagas.Protestos.ProtestosAclarados protestosAclarados;
        @XmlElement(name = "ProtestosNoAclarados", required = true)
        protected DeudasImpagas.Protestos.ProtestosNoAclarados protestosNoAclarados;

        /**
         * Obtiene el valor de la propiedad protestosAclarados.
         * 
         * @return
         *     possible object is
         *     {@link DeudasImpagas.Protestos.ProtestosAclarados }
         *     
         */
        public DeudasImpagas.Protestos.ProtestosAclarados getProtestosAclarados() {
            return protestosAclarados;
        }

        /**
         * Define el valor de la propiedad protestosAclarados.
         * 
         * @param value
         *     allowed object is
         *     {@link DeudasImpagas.Protestos.ProtestosAclarados }
         *     
         */
        public void setProtestosAclarados(DeudasImpagas.Protestos.ProtestosAclarados value) {
            this.protestosAclarados = value;
        }

        /**
         * Obtiene el valor de la propiedad protestosNoAclarados.
         * 
         * @return
         *     possible object is
         *     {@link DeudasImpagas.Protestos.ProtestosNoAclarados }
         *     
         */
        public DeudasImpagas.Protestos.ProtestosNoAclarados getProtestosNoAclarados() {
            return protestosNoAclarados;
        }

        /**
         * Define el valor de la propiedad protestosNoAclarados.
         * 
         * @param value
         *     allowed object is
         *     {@link DeudasImpagas.Protestos.ProtestosNoAclarados }
         *     
         */
        public void setProtestosNoAclarados(DeudasImpagas.Protestos.ProtestosNoAclarados value) {
            this.protestosNoAclarados = value;
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
         *         &lt;element name="Cabecera"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="FechaVencimientoReciente" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="CantidadSoles" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
         *                   &lt;element name="MontoSoles" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *                   &lt;element name="CantidadDolares" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
         *                   &lt;element name="MontoDolares" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="Detalle"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Deuda" maxOccurs="unbounded"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="CorrelativoBNP" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="NumeroBoletin" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="TipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="Divisa" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="Monto" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                             &lt;element name="EmisorDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="AceptanteDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                             &lt;element name="FechaVencimiento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="FechaAclaracion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                             &lt;element name="Notaria" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
            "cabecera",
            "detalle"
        })
        public static class ProtestosAclarados {

            @XmlElement(name = "Cabecera", required = true)
            protected DeudasImpagas.Protestos.ProtestosAclarados.Cabecera cabecera;
            @XmlElement(name = "Detalle", required = true)
            protected DeudasImpagas.Protestos.ProtestosAclarados.Detalle detalle;

            /**
             * Obtiene el valor de la propiedad cabecera.
             * 
             * @return
             *     possible object is
             *     {@link DeudasImpagas.Protestos.ProtestosAclarados.Cabecera }
             *     
             */
            public DeudasImpagas.Protestos.ProtestosAclarados.Cabecera getCabecera() {
                return cabecera;
            }

            /**
             * Define el valor de la propiedad cabecera.
             * 
             * @param value
             *     allowed object is
             *     {@link DeudasImpagas.Protestos.ProtestosAclarados.Cabecera }
             *     
             */
            public void setCabecera(DeudasImpagas.Protestos.ProtestosAclarados.Cabecera value) {
                this.cabecera = value;
            }

            /**
             * Obtiene el valor de la propiedad detalle.
             * 
             * @return
             *     possible object is
             *     {@link DeudasImpagas.Protestos.ProtestosAclarados.Detalle }
             *     
             */
            public DeudasImpagas.Protestos.ProtestosAclarados.Detalle getDetalle() {
                return detalle;
            }

            /**
             * Define el valor de la propiedad detalle.
             * 
             * @param value
             *     allowed object is
             *     {@link DeudasImpagas.Protestos.ProtestosAclarados.Detalle }
             *     
             */
            public void setDetalle(DeudasImpagas.Protestos.ProtestosAclarados.Detalle value) {
                this.detalle = value;
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
             *         &lt;element name="FechaVencimientoReciente" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="CantidadSoles" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
             *         &lt;element name="MontoSoles" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
             *         &lt;element name="CantidadDolares" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
             *         &lt;element name="MontoDolares" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
                "fechaVencimientoReciente",
                "cantidadSoles",
                "montoSoles",
                "cantidadDolares",
                "montoDolares"
            })
            public static class Cabecera {

                @XmlElement(name = "FechaVencimientoReciente", required = true)
                protected String fechaVencimientoReciente;
                @XmlElement(name = "CantidadSoles")
                protected int cantidadSoles;
                @XmlElement(name = "MontoSoles")
                protected BigDecimal montoSoles;
                @XmlElement(name = "CantidadDolares")
                protected int cantidadDolares;
                @XmlElement(name = "MontoDolares")
                protected BigDecimal montoDolares;

                /**
                 * Obtiene el valor de la propiedad fechaVencimientoReciente.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFechaVencimientoReciente() {
                    return fechaVencimientoReciente;
                }

                /**
                 * Define el valor de la propiedad fechaVencimientoReciente.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFechaVencimientoReciente(String value) {
                    this.fechaVencimientoReciente = value;
                }

                /**
                 * Obtiene el valor de la propiedad cantidadSoles.
                 * 
                 */
                public int getCantidadSoles() {
                    return cantidadSoles;
                }

                /**
                 * Define el valor de la propiedad cantidadSoles.
                 * 
                 */
                public void setCantidadSoles(int value) {
                    this.cantidadSoles = value;
                }

                /**
                 * Obtiene el valor de la propiedad montoSoles.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getMontoSoles() {
                    return montoSoles;
                }

                /**
                 * Define el valor de la propiedad montoSoles.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setMontoSoles(BigDecimal value) {
                    this.montoSoles = value;
                }

                /**
                 * Obtiene el valor de la propiedad cantidadDolares.
                 * 
                 */
                public int getCantidadDolares() {
                    return cantidadDolares;
                }

                /**
                 * Define el valor de la propiedad cantidadDolares.
                 * 
                 */
                public void setCantidadDolares(int value) {
                    this.cantidadDolares = value;
                }

                /**
                 * Obtiene el valor de la propiedad montoDolares.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getMontoDolares() {
                    return montoDolares;
                }

                /**
                 * Define el valor de la propiedad montoDolares.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setMontoDolares(BigDecimal value) {
                    this.montoDolares = value;
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
             *         &lt;element name="Deuda" maxOccurs="unbounded"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="CorrelativoBNP" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="NumeroBoletin" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="TipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="Divisa" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="Monto" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *                   &lt;element name="EmisorDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="AceptanteDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                   &lt;element name="FechaVencimiento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="FechaAclaracion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                   &lt;element name="Notaria" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
            public static class Detalle {

                @XmlElement(name = "Deuda", required = true)
                protected List<DeudasImpagas.Protestos.ProtestosAclarados.Detalle.Deuda> deuda;

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
                 * {@link DeudasImpagas.Protestos.ProtestosAclarados.Detalle.Deuda }
                 * 
                 * 
                 */
                public List<DeudasImpagas.Protestos.ProtestosAclarados.Detalle.Deuda> getDeuda() {
                    if (deuda == null) {
                        deuda = new ArrayList<DeudasImpagas.Protestos.ProtestosAclarados.Detalle.Deuda>();
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
                 *         &lt;element name="CorrelativoBNP" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="NumeroBoletin" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="TipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="Divisa" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="Monto" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
                 *         &lt;element name="EmisorDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="AceptanteDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *         &lt;element name="FechaVencimiento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="FechaAclaracion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *         &lt;element name="Notaria" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
                    "divisa",
                    "monto",
                    "emisorDocumento",
                    "aceptanteDocumento",
                    "fechaVencimiento",
                    "fechaAclaracion",
                    "notaria"
                })
                public static class Deuda {

                    @XmlElement(name = "CorrelativoBNP", required = true)
                    protected String correlativoBNP;
                    @XmlElement(name = "NumeroBoletin", required = true)
                    protected String numeroBoletin;
                    @XmlElement(name = "TipoDocumento", required = true)
                    protected String tipoDocumento;
                    @XmlElement(name = "Divisa", required = true)
                    protected String divisa;
                    @XmlElement(name = "Monto", required = true)
                    protected BigDecimal monto;
                    @XmlElement(name = "EmisorDocumento", required = true)
                    protected String emisorDocumento;
                    @XmlElement(name = "AceptanteDocumento")
                    protected String aceptanteDocumento;
                    @XmlElement(name = "FechaVencimiento", required = true)
                    protected String fechaVencimiento;
                    @XmlElement(name = "FechaAclaracion")
                    protected String fechaAclaracion;
                    @XmlElement(name = "Notaria", required = true)
                    protected String notaria;

                    /**
                     * Obtiene el valor de la propiedad correlativoBNP.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCorrelativoBNP() {
                        return correlativoBNP;
                    }

                    /**
                     * Define el valor de la propiedad correlativoBNP.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCorrelativoBNP(String value) {
                        this.correlativoBNP = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad numeroBoletin.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNumeroBoletin() {
                        return numeroBoletin;
                    }

                    /**
                     * Define el valor de la propiedad numeroBoletin.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNumeroBoletin(String value) {
                        this.numeroBoletin = value;
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
                     * Obtiene el valor de la propiedad divisa.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDivisa() {
                        return divisa;
                    }

                    /**
                     * Define el valor de la propiedad divisa.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDivisa(String value) {
                        this.divisa = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad monto.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getMonto() {
                        return monto;
                    }

                    /**
                     * Define el valor de la propiedad monto.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setMonto(BigDecimal value) {
                        this.monto = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad emisorDocumento.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getEmisorDocumento() {
                        return emisorDocumento;
                    }

                    /**
                     * Define el valor de la propiedad emisorDocumento.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setEmisorDocumento(String value) {
                        this.emisorDocumento = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad aceptanteDocumento.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getAceptanteDocumento() {
                        return aceptanteDocumento;
                    }

                    /**
                     * Define el valor de la propiedad aceptanteDocumento.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setAceptanteDocumento(String value) {
                        this.aceptanteDocumento = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad fechaVencimiento.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getFechaVencimiento() {
                        return fechaVencimiento;
                    }

                    /**
                     * Define el valor de la propiedad fechaVencimiento.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setFechaVencimiento(String value) {
                        this.fechaVencimiento = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad fechaAclaracion.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getFechaAclaracion() {
                        return fechaAclaracion;
                    }

                    /**
                     * Define el valor de la propiedad fechaAclaracion.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setFechaAclaracion(String value) {
                        this.fechaAclaracion = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad notaria.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNotaria() {
                        return notaria;
                    }

                    /**
                     * Define el valor de la propiedad notaria.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNotaria(String value) {
                        this.notaria = value;
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
         *         &lt;element name="Cabecera"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="FechaVencimientoReciente" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="CantidadSoles" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
         *                   &lt;element name="MontoSoles" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *                   &lt;element name="CantidadDolares" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
         *                   &lt;element name="MontoDolares" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="Detalle"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Deuda" maxOccurs="unbounded"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="CorrelativoBNP" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="NumeroBoletin" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="TipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="Divisa" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="Monto" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                             &lt;element name="EmisorDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="AceptanteDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                             &lt;element name="FechaVencimiento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="FechaAclaracion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                             &lt;element name="Notaria" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
            "cabecera",
            "detalle"
        })
        public static class ProtestosNoAclarados {

            @XmlElement(name = "Cabecera", required = true)
            protected DeudasImpagas.Protestos.ProtestosNoAclarados.Cabecera cabecera;
            @XmlElement(name = "Detalle", required = true)
            protected DeudasImpagas.Protestos.ProtestosNoAclarados.Detalle detalle;

            /**
             * Obtiene el valor de la propiedad cabecera.
             * 
             * @return
             *     possible object is
             *     {@link DeudasImpagas.Protestos.ProtestosNoAclarados.Cabecera }
             *     
             */
            public DeudasImpagas.Protestos.ProtestosNoAclarados.Cabecera getCabecera() {
                return cabecera;
            }

            /**
             * Define el valor de la propiedad cabecera.
             * 
             * @param value
             *     allowed object is
             *     {@link DeudasImpagas.Protestos.ProtestosNoAclarados.Cabecera }
             *     
             */
            public void setCabecera(DeudasImpagas.Protestos.ProtestosNoAclarados.Cabecera value) {
                this.cabecera = value;
            }

            /**
             * Obtiene el valor de la propiedad detalle.
             * 
             * @return
             *     possible object is
             *     {@link DeudasImpagas.Protestos.ProtestosNoAclarados.Detalle }
             *     
             */
            public DeudasImpagas.Protestos.ProtestosNoAclarados.Detalle getDetalle() {
                return detalle;
            }

            /**
             * Define el valor de la propiedad detalle.
             * 
             * @param value
             *     allowed object is
             *     {@link DeudasImpagas.Protestos.ProtestosNoAclarados.Detalle }
             *     
             */
            public void setDetalle(DeudasImpagas.Protestos.ProtestosNoAclarados.Detalle value) {
                this.detalle = value;
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
             *         &lt;element name="FechaVencimientoReciente" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="CantidadSoles" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
             *         &lt;element name="MontoSoles" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
             *         &lt;element name="CantidadDolares" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
             *         &lt;element name="MontoDolares" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
                "fechaVencimientoReciente",
                "cantidadSoles",
                "montoSoles",
                "cantidadDolares",
                "montoDolares"
            })
            public static class Cabecera {

                @XmlElement(name = "FechaVencimientoReciente", required = true)
                protected String fechaVencimientoReciente;
                @XmlElement(name = "CantidadSoles")
                protected int cantidadSoles;
                @XmlElement(name = "MontoSoles")
                protected BigDecimal montoSoles;
                @XmlElement(name = "CantidadDolares")
                protected int cantidadDolares;
                @XmlElement(name = "MontoDolares")
                protected BigDecimal montoDolares;

                /**
                 * Obtiene el valor de la propiedad fechaVencimientoReciente.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFechaVencimientoReciente() {
                    return fechaVencimientoReciente;
                }

                /**
                 * Define el valor de la propiedad fechaVencimientoReciente.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFechaVencimientoReciente(String value) {
                    this.fechaVencimientoReciente = value;
                }

                /**
                 * Obtiene el valor de la propiedad cantidadSoles.
                 * 
                 */
                public int getCantidadSoles() {
                    return cantidadSoles;
                }

                /**
                 * Define el valor de la propiedad cantidadSoles.
                 * 
                 */
                public void setCantidadSoles(int value) {
                    this.cantidadSoles = value;
                }

                /**
                 * Obtiene el valor de la propiedad montoSoles.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getMontoSoles() {
                    return montoSoles;
                }

                /**
                 * Define el valor de la propiedad montoSoles.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setMontoSoles(BigDecimal value) {
                    this.montoSoles = value;
                }

                /**
                 * Obtiene el valor de la propiedad cantidadDolares.
                 * 
                 */
                public int getCantidadDolares() {
                    return cantidadDolares;
                }

                /**
                 * Define el valor de la propiedad cantidadDolares.
                 * 
                 */
                public void setCantidadDolares(int value) {
                    this.cantidadDolares = value;
                }

                /**
                 * Obtiene el valor de la propiedad montoDolares.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getMontoDolares() {
                    return montoDolares;
                }

                /**
                 * Define el valor de la propiedad montoDolares.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setMontoDolares(BigDecimal value) {
                    this.montoDolares = value;
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
             *         &lt;element name="Deuda" maxOccurs="unbounded"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="CorrelativoBNP" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="NumeroBoletin" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="TipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="Divisa" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="Monto" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *                   &lt;element name="EmisorDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="AceptanteDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                   &lt;element name="FechaVencimiento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="FechaAclaracion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                   &lt;element name="Notaria" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
            public static class Detalle {

                @XmlElement(name = "Deuda", required = true)
                protected List<DeudasImpagas.Protestos.ProtestosNoAclarados.Detalle.Deuda> deuda;

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
                 * {@link DeudasImpagas.Protestos.ProtestosNoAclarados.Detalle.Deuda }
                 * 
                 * 
                 */
                public List<DeudasImpagas.Protestos.ProtestosNoAclarados.Detalle.Deuda> getDeuda() {
                    if (deuda == null) {
                        deuda = new ArrayList<DeudasImpagas.Protestos.ProtestosNoAclarados.Detalle.Deuda>();
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
                 *         &lt;element name="CorrelativoBNP" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="NumeroBoletin" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="TipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="Divisa" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="Monto" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
                 *         &lt;element name="EmisorDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="AceptanteDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *         &lt;element name="FechaVencimiento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="FechaAclaracion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *         &lt;element name="Notaria" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
                    "divisa",
                    "monto",
                    "emisorDocumento",
                    "aceptanteDocumento",
                    "fechaVencimiento",
                    "fechaAclaracion",
                    "notaria"
                })
                public static class Deuda {

                    @XmlElement(name = "CorrelativoBNP", required = true)
                    protected String correlativoBNP;
                    @XmlElement(name = "NumeroBoletin", required = true)
                    protected String numeroBoletin;
                    @XmlElement(name = "TipoDocumento", required = true)
                    protected String tipoDocumento;
                    @XmlElement(name = "Divisa", required = true)
                    protected String divisa;
                    @XmlElement(name = "Monto", required = true)
                    protected BigDecimal monto;
                    @XmlElement(name = "EmisorDocumento", required = true)
                    protected String emisorDocumento;
                    @XmlElement(name = "AceptanteDocumento")
                    protected String aceptanteDocumento;
                    @XmlElement(name = "FechaVencimiento", required = true)
                    protected String fechaVencimiento;
                    @XmlElement(name = "FechaAclaracion")
                    protected String fechaAclaracion;
                    @XmlElement(name = "Notaria", required = true)
                    protected String notaria;

                    /**
                     * Obtiene el valor de la propiedad correlativoBNP.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCorrelativoBNP() {
                        return correlativoBNP;
                    }

                    /**
                     * Define el valor de la propiedad correlativoBNP.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCorrelativoBNP(String value) {
                        this.correlativoBNP = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad numeroBoletin.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNumeroBoletin() {
                        return numeroBoletin;
                    }

                    /**
                     * Define el valor de la propiedad numeroBoletin.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNumeroBoletin(String value) {
                        this.numeroBoletin = value;
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
                     * Obtiene el valor de la propiedad divisa.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDivisa() {
                        return divisa;
                    }

                    /**
                     * Define el valor de la propiedad divisa.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDivisa(String value) {
                        this.divisa = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad monto.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getMonto() {
                        return monto;
                    }

                    /**
                     * Define el valor de la propiedad monto.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setMonto(BigDecimal value) {
                        this.monto = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad emisorDocumento.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getEmisorDocumento() {
                        return emisorDocumento;
                    }

                    /**
                     * Define el valor de la propiedad emisorDocumento.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setEmisorDocumento(String value) {
                        this.emisorDocumento = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad aceptanteDocumento.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getAceptanteDocumento() {
                        return aceptanteDocumento;
                    }

                    /**
                     * Define el valor de la propiedad aceptanteDocumento.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setAceptanteDocumento(String value) {
                        this.aceptanteDocumento = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad fechaVencimiento.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getFechaVencimiento() {
                        return fechaVencimiento;
                    }

                    /**
                     * Define el valor de la propiedad fechaVencimiento.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setFechaVencimiento(String value) {
                        this.fechaVencimiento = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad fechaAclaracion.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getFechaAclaracion() {
                        return fechaAclaracion;
                    }

                    /**
                     * Define el valor de la propiedad fechaAclaracion.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setFechaAclaracion(String value) {
                        this.fechaAclaracion = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad notaria.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNotaria() {
                        return notaria;
                    }

                    /**
                     * Define el valor de la propiedad notaria.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNotaria(String value) {
                        this.notaria = value;
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
     *         &lt;element name="SemaforoPeriodo" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="TieneDeuda" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
     *                   &lt;element name="DetalleProductos"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="ProductoDeuda" maxOccurs="unbounded"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="CodigoProducto" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *                                       &lt;element name="DeudaSoles" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                                       &lt;element name="DeudaDolares" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
        "semaforoPeriodo"
    })
    public static class ResumenDeudasImpagas {

        @XmlElement(name = "SemaforoPeriodo", required = true)
        protected List<DeudasImpagas.ResumenDeudasImpagas.SemaforoPeriodo> semaforoPeriodo;

        /**
         * Gets the value of the semaforoPeriodo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the semaforoPeriodo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSemaforoPeriodo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DeudasImpagas.ResumenDeudasImpagas.SemaforoPeriodo }
         * 
         * 
         */
        public List<DeudasImpagas.ResumenDeudasImpagas.SemaforoPeriodo> getSemaforoPeriodo() {
            if (semaforoPeriodo == null) {
                semaforoPeriodo = new ArrayList<DeudasImpagas.ResumenDeudasImpagas.SemaforoPeriodo>();
            }
            return this.semaforoPeriodo;
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
         *         &lt;element name="TieneDeuda" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
         *         &lt;element name="DetalleProductos"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="ProductoDeuda" maxOccurs="unbounded"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="CodigoProducto" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
         *                             &lt;element name="DeudaSoles" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *                             &lt;element name="DeudaDolares" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
            "tieneDeuda",
            "detalleProductos"
        })
        public static class SemaforoPeriodo {

            @XmlElement(name = "TieneDeuda")
            protected boolean tieneDeuda;
            @XmlElement(name = "DetalleProductos", required = true)
            protected DeudasImpagas.ResumenDeudasImpagas.SemaforoPeriodo.DetalleProductos detalleProductos;
            @XmlAttribute(name = "periodo")
            protected String periodo;

            /**
             * Obtiene el valor de la propiedad tieneDeuda.
             * 
             */
            public boolean isTieneDeuda() {
                return tieneDeuda;
            }

            /**
             * Define el valor de la propiedad tieneDeuda.
             * 
             */
            public void setTieneDeuda(boolean value) {
                this.tieneDeuda = value;
            }

            /**
             * Obtiene el valor de la propiedad detalleProductos.
             * 
             * @return
             *     possible object is
             *     {@link DeudasImpagas.ResumenDeudasImpagas.SemaforoPeriodo.DetalleProductos }
             *     
             */
            public DeudasImpagas.ResumenDeudasImpagas.SemaforoPeriodo.DetalleProductos getDetalleProductos() {
                return detalleProductos;
            }

            /**
             * Define el valor de la propiedad detalleProductos.
             * 
             * @param value
             *     allowed object is
             *     {@link DeudasImpagas.ResumenDeudasImpagas.SemaforoPeriodo.DetalleProductos }
             *     
             */
            public void setDetalleProductos(DeudasImpagas.ResumenDeudasImpagas.SemaforoPeriodo.DetalleProductos value) {
                this.detalleProductos = value;
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
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="ProductoDeuda" maxOccurs="unbounded"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="CodigoProducto" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
             *                   &lt;element name="DeudaSoles" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
             *                   &lt;element name="DeudaDolares" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
                "productoDeuda"
            })
            public static class DetalleProductos {

                @XmlElement(name = "ProductoDeuda", required = true)
                protected List<DeudasImpagas.ResumenDeudasImpagas.SemaforoPeriodo.DetalleProductos.ProductoDeuda> productoDeuda;

                /**
                 * Gets the value of the productoDeuda property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the productoDeuda property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getProductoDeuda().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link DeudasImpagas.ResumenDeudasImpagas.SemaforoPeriodo.DetalleProductos.ProductoDeuda }
                 * 
                 * 
                 */
                public List<DeudasImpagas.ResumenDeudasImpagas.SemaforoPeriodo.DetalleProductos.ProductoDeuda> getProductoDeuda() {
                    if (productoDeuda == null) {
                        productoDeuda = new ArrayList<DeudasImpagas.ResumenDeudasImpagas.SemaforoPeriodo.DetalleProductos.ProductoDeuda>();
                    }
                    return this.productoDeuda;
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
                 *         &lt;element name="CodigoProducto" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
                 *         &lt;element name="DeudaSoles" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
                 *         &lt;element name="DeudaDolares" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
                    "codigoProducto",
                    "deudaSoles",
                    "deudaDolares"
                })
                public static class ProductoDeuda {

                    @XmlElement(name = "CodigoProducto")
                    protected int codigoProducto;
                    @XmlElement(name = "DeudaSoles")
                    protected BigDecimal deudaSoles;
                    @XmlElement(name = "DeudaDolares")
                    protected BigDecimal deudaDolares;

                    /**
                     * Obtiene el valor de la propiedad codigoProducto.
                     * 
                     */
                    public int getCodigoProducto() {
                        return codigoProducto;
                    }

                    /**
                     * Define el valor de la propiedad codigoProducto.
                     * 
                     */
                    public void setCodigoProducto(int value) {
                        this.codigoProducto = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad deudaSoles.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getDeudaSoles() {
                        return deudaSoles;
                    }

                    /**
                     * Define el valor de la propiedad deudaSoles.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setDeudaSoles(BigDecimal value) {
                        this.deudaSoles = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad deudaDolares.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getDeudaDolares() {
                        return deudaDolares;
                    }

                    /**
                     * Define el valor de la propiedad deudaDolares.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setDeudaDolares(BigDecimal value) {
                        this.deudaDolares = value;
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
     *         &lt;element name="Cabecera"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="FechaVencimientoReciente" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="CantidadSoles" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *                   &lt;element name="MontoSoles" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                   &lt;element name="CantidadDolares" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *                   &lt;element name="MontoDolares" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Detalle"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Deuda" maxOccurs="unbounded"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="FechaVencimiento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="FechaReportada" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="Divisa" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="Monto" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                             &lt;element name="Acreedor" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="DocumentoBancario" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="CondicionDeuda" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="TipoDeudor" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "cabecera",
        "detalle"
    })
    public static class Sicom {

        @XmlElement(name = "Cabecera", required = true)
        protected DeudasImpagas.Sicom.Cabecera cabecera;
        @XmlElement(name = "Detalle", required = true)
        protected DeudasImpagas.Sicom.Detalle detalle;

        /**
         * Obtiene el valor de la propiedad cabecera.
         * 
         * @return
         *     possible object is
         *     {@link DeudasImpagas.Sicom.Cabecera }
         *     
         */
        public DeudasImpagas.Sicom.Cabecera getCabecera() {
            return cabecera;
        }

        /**
         * Define el valor de la propiedad cabecera.
         * 
         * @param value
         *     allowed object is
         *     {@link DeudasImpagas.Sicom.Cabecera }
         *     
         */
        public void setCabecera(DeudasImpagas.Sicom.Cabecera value) {
            this.cabecera = value;
        }

        /**
         * Obtiene el valor de la propiedad detalle.
         * 
         * @return
         *     possible object is
         *     {@link DeudasImpagas.Sicom.Detalle }
         *     
         */
        public DeudasImpagas.Sicom.Detalle getDetalle() {
            return detalle;
        }

        /**
         * Define el valor de la propiedad detalle.
         * 
         * @param value
         *     allowed object is
         *     {@link DeudasImpagas.Sicom.Detalle }
         *     
         */
        public void setDetalle(DeudasImpagas.Sicom.Detalle value) {
            this.detalle = value;
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
         *         &lt;element name="FechaVencimientoReciente" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="CantidadSoles" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
         *         &lt;element name="MontoSoles" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *         &lt;element name="CantidadDolares" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
         *         &lt;element name="MontoDolares" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
            "fechaVencimientoReciente",
            "cantidadSoles",
            "montoSoles",
            "cantidadDolares",
            "montoDolares"
        })
        public static class Cabecera {

            @XmlElement(name = "FechaVencimientoReciente", required = true)
            protected String fechaVencimientoReciente;
            @XmlElement(name = "CantidadSoles")
            protected int cantidadSoles;
            @XmlElement(name = "MontoSoles")
            protected BigDecimal montoSoles;
            @XmlElement(name = "CantidadDolares")
            protected int cantidadDolares;
            @XmlElement(name = "MontoDolares")
            protected BigDecimal montoDolares;

            /**
             * Obtiene el valor de la propiedad fechaVencimientoReciente.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFechaVencimientoReciente() {
                return fechaVencimientoReciente;
            }

            /**
             * Define el valor de la propiedad fechaVencimientoReciente.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFechaVencimientoReciente(String value) {
                this.fechaVencimientoReciente = value;
            }

            /**
             * Obtiene el valor de la propiedad cantidadSoles.
             * 
             */
            public int getCantidadSoles() {
                return cantidadSoles;
            }

            /**
             * Define el valor de la propiedad cantidadSoles.
             * 
             */
            public void setCantidadSoles(int value) {
                this.cantidadSoles = value;
            }

            /**
             * Obtiene el valor de la propiedad montoSoles.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getMontoSoles() {
                return montoSoles;
            }

            /**
             * Define el valor de la propiedad montoSoles.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setMontoSoles(BigDecimal value) {
                this.montoSoles = value;
            }

            /**
             * Obtiene el valor de la propiedad cantidadDolares.
             * 
             */
            public int getCantidadDolares() {
                return cantidadDolares;
            }

            /**
             * Define el valor de la propiedad cantidadDolares.
             * 
             */
            public void setCantidadDolares(int value) {
                this.cantidadDolares = value;
            }

            /**
             * Obtiene el valor de la propiedad montoDolares.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getMontoDolares() {
                return montoDolares;
            }

            /**
             * Define el valor de la propiedad montoDolares.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setMontoDolares(BigDecimal value) {
                this.montoDolares = value;
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
         *         &lt;element name="Deuda" maxOccurs="unbounded"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="FechaVencimiento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="FechaReportada" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="Divisa" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="Monto" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *                   &lt;element name="Acreedor" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="DocumentoBancario" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="CondicionDeuda" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="TipoDeudor" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        public static class Detalle {

            @XmlElement(name = "Deuda", required = true)
            protected List<DeudasImpagas.Sicom.Detalle.Deuda> deuda;

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
             * {@link DeudasImpagas.Sicom.Detalle.Deuda }
             * 
             * 
             */
            public List<DeudasImpagas.Sicom.Detalle.Deuda> getDeuda() {
                if (deuda == null) {
                    deuda = new ArrayList<DeudasImpagas.Sicom.Detalle.Deuda>();
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
             *         &lt;element name="FechaVencimiento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="FechaReportada" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="Divisa" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="Monto" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
             *         &lt;element name="Acreedor" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="DocumentoBancario" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="CondicionDeuda" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="TipoDeudor" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
                "fechaVencimiento",
                "fechaReportada",
                "divisa",
                "monto",
                "acreedor",
                "documentoBancario",
                "condicionDeuda",
                "tipoDeudor"
            })
            public static class Deuda {

                @XmlElement(name = "FechaVencimiento", required = true)
                protected String fechaVencimiento;
                @XmlElement(name = "FechaReportada", required = true)
                protected String fechaReportada;
                @XmlElement(name = "Divisa", required = true)
                protected String divisa;
                @XmlElement(name = "Monto")
                protected BigDecimal monto;
                @XmlElement(name = "Acreedor", required = true)
                protected String acreedor;
                @XmlElement(name = "DocumentoBancario", required = true)
                protected String documentoBancario;
                @XmlElement(name = "CondicionDeuda", required = true)
                protected String condicionDeuda;
                @XmlElement(name = "TipoDeudor", required = true)
                protected String tipoDeudor;

                /**
                 * Obtiene el valor de la propiedad fechaVencimiento.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFechaVencimiento() {
                    return fechaVencimiento;
                }

                /**
                 * Define el valor de la propiedad fechaVencimiento.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFechaVencimiento(String value) {
                    this.fechaVencimiento = value;
                }

                /**
                 * Obtiene el valor de la propiedad fechaReportada.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFechaReportada() {
                    return fechaReportada;
                }

                /**
                 * Define el valor de la propiedad fechaReportada.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFechaReportada(String value) {
                    this.fechaReportada = value;
                }

                /**
                 * Obtiene el valor de la propiedad divisa.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDivisa() {
                    return divisa;
                }

                /**
                 * Define el valor de la propiedad divisa.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDivisa(String value) {
                    this.divisa = value;
                }

                /**
                 * Obtiene el valor de la propiedad monto.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getMonto() {
                    return monto;
                }

                /**
                 * Define el valor de la propiedad monto.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setMonto(BigDecimal value) {
                    this.monto = value;
                }

                /**
                 * Obtiene el valor de la propiedad acreedor.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAcreedor() {
                    return acreedor;
                }

                /**
                 * Define el valor de la propiedad acreedor.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAcreedor(String value) {
                    this.acreedor = value;
                }

                /**
                 * Obtiene el valor de la propiedad documentoBancario.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDocumentoBancario() {
                    return documentoBancario;
                }

                /**
                 * Define el valor de la propiedad documentoBancario.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDocumentoBancario(String value) {
                    this.documentoBancario = value;
                }

                /**
                 * Obtiene el valor de la propiedad condicionDeuda.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCondicionDeuda() {
                    return condicionDeuda;
                }

                /**
                 * Define el valor de la propiedad condicionDeuda.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCondicionDeuda(String value) {
                    this.condicionDeuda = value;
                }

                /**
                 * Obtiene el valor de la propiedad tipoDeudor.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTipoDeudor() {
                    return tipoDeudor;
                }

                /**
                 * Define el valor de la propiedad tipoDeudor.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTipoDeudor(String value) {
                    this.tipoDeudor = value;
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
     *         &lt;element name="Cabecera"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="FechaSancionReciente" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Detalle"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="InformacionNegativa" maxOccurs="unbounded"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="FechaSancion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="FechaFinSancion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="FechaPublicacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="NumeroPublicacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="Divisa" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="TipoCuenta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="Entidad" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "cabecera",
        "detalle"
    })
    public static class TarjetasAnuladas {

        @XmlElement(name = "Cabecera", required = true)
        protected DeudasImpagas.TarjetasAnuladas.Cabecera cabecera;
        @XmlElement(name = "Detalle", required = true)
        protected DeudasImpagas.TarjetasAnuladas.Detalle detalle;

        /**
         * Obtiene el valor de la propiedad cabecera.
         * 
         * @return
         *     possible object is
         *     {@link DeudasImpagas.TarjetasAnuladas.Cabecera }
         *     
         */
        public DeudasImpagas.TarjetasAnuladas.Cabecera getCabecera() {
            return cabecera;
        }

        /**
         * Define el valor de la propiedad cabecera.
         * 
         * @param value
         *     allowed object is
         *     {@link DeudasImpagas.TarjetasAnuladas.Cabecera }
         *     
         */
        public void setCabecera(DeudasImpagas.TarjetasAnuladas.Cabecera value) {
            this.cabecera = value;
        }

        /**
         * Obtiene el valor de la propiedad detalle.
         * 
         * @return
         *     possible object is
         *     {@link DeudasImpagas.TarjetasAnuladas.Detalle }
         *     
         */
        public DeudasImpagas.TarjetasAnuladas.Detalle getDetalle() {
            return detalle;
        }

        /**
         * Define el valor de la propiedad detalle.
         * 
         * @param value
         *     allowed object is
         *     {@link DeudasImpagas.TarjetasAnuladas.Detalle }
         *     
         */
        public void setDetalle(DeudasImpagas.TarjetasAnuladas.Detalle value) {
            this.detalle = value;
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
         *         &lt;element name="FechaSancionReciente" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
            "fechaSancionReciente"
        })
        public static class Cabecera {

            @XmlElement(name = "FechaSancionReciente", required = true)
            protected String fechaSancionReciente;

            /**
             * Obtiene el valor de la propiedad fechaSancionReciente.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFechaSancionReciente() {
                return fechaSancionReciente;
            }

            /**
             * Define el valor de la propiedad fechaSancionReciente.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFechaSancionReciente(String value) {
                this.fechaSancionReciente = value;
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
         *         &lt;element name="InformacionNegativa" maxOccurs="unbounded"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="FechaSancion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="FechaFinSancion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="FechaPublicacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="NumeroPublicacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="Divisa" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="TipoCuenta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="Entidad" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
            "informacionNegativa"
        })
        public static class Detalle {

            @XmlElement(name = "InformacionNegativa", required = true)
            protected List<DeudasImpagas.TarjetasAnuladas.Detalle.InformacionNegativa> informacionNegativa;

            /**
             * Gets the value of the informacionNegativa property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the informacionNegativa property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getInformacionNegativa().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link DeudasImpagas.TarjetasAnuladas.Detalle.InformacionNegativa }
             * 
             * 
             */
            public List<DeudasImpagas.TarjetasAnuladas.Detalle.InformacionNegativa> getInformacionNegativa() {
                if (informacionNegativa == null) {
                    informacionNegativa = new ArrayList<DeudasImpagas.TarjetasAnuladas.Detalle.InformacionNegativa>();
                }
                return this.informacionNegativa;
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
             *         &lt;element name="FechaSancion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="FechaFinSancion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="FechaPublicacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="NumeroPublicacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="Divisa" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="TipoCuenta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="Entidad" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
                "fechaSancion",
                "fechaFinSancion",
                "fechaPublicacion",
                "numeroPublicacion",
                "divisa",
                "tipoCuenta",
                "entidad"
            })
            public static class InformacionNegativa {

                @XmlElement(name = "FechaSancion", required = true)
                protected String fechaSancion;
                @XmlElement(name = "FechaFinSancion", required = true)
                protected String fechaFinSancion;
                @XmlElement(name = "FechaPublicacion", required = true)
                protected String fechaPublicacion;
                @XmlElement(name = "NumeroPublicacion", required = true)
                protected String numeroPublicacion;
                @XmlElement(name = "Divisa", required = true)
                protected String divisa;
                @XmlElement(name = "TipoCuenta", required = true)
                protected String tipoCuenta;
                @XmlElement(name = "Entidad", required = true)
                protected String entidad;

                /**
                 * Obtiene el valor de la propiedad fechaSancion.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFechaSancion() {
                    return fechaSancion;
                }

                /**
                 * Define el valor de la propiedad fechaSancion.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFechaSancion(String value) {
                    this.fechaSancion = value;
                }

                /**
                 * Obtiene el valor de la propiedad fechaFinSancion.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFechaFinSancion() {
                    return fechaFinSancion;
                }

                /**
                 * Define el valor de la propiedad fechaFinSancion.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFechaFinSancion(String value) {
                    this.fechaFinSancion = value;
                }

                /**
                 * Obtiene el valor de la propiedad fechaPublicacion.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFechaPublicacion() {
                    return fechaPublicacion;
                }

                /**
                 * Define el valor de la propiedad fechaPublicacion.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFechaPublicacion(String value) {
                    this.fechaPublicacion = value;
                }

                /**
                 * Obtiene el valor de la propiedad numeroPublicacion.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNumeroPublicacion() {
                    return numeroPublicacion;
                }

                /**
                 * Define el valor de la propiedad numeroPublicacion.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNumeroPublicacion(String value) {
                    this.numeroPublicacion = value;
                }

                /**
                 * Obtiene el valor de la propiedad divisa.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDivisa() {
                    return divisa;
                }

                /**
                 * Define el valor de la propiedad divisa.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDivisa(String value) {
                    this.divisa = value;
                }

                /**
                 * Obtiene el valor de la propiedad tipoCuenta.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTipoCuenta() {
                    return tipoCuenta;
                }

                /**
                 * Define el valor de la propiedad tipoCuenta.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTipoCuenta(String value) {
                    this.tipoCuenta = value;
                }

                /**
                 * Obtiene el valor de la propiedad entidad.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getEntidad() {
                    return entidad;
                }

                /**
                 * Define el valor de la propiedad entidad.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setEntidad(String value) {
                    this.entidad = value;
                }

            }

        }

    }

}
