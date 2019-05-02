
package pe.com.equifax.creditreport.ws.endpoint;

import java.math.BigDecimal;
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
 *         &lt;element name="RematesBienesMuebles"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="RemateMueble" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="NumeroExpediente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NumeroRemate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="Motivo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="Juzgado" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="EncargoDe" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="Divisa" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="MontoTasacion" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                             &lt;element name="MontoBase" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                             &lt;element name="FechaPublicacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="Ubigeo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="FechaRemate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="HoraRemate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="Demandantes"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Demandante" maxOccurs="unbounded"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="TipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="NumeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="Nombres" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
 *                             &lt;element name="Demandados"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Demandado" maxOccurs="unbounded"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="TipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="NumeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="Nombres" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
 *                             &lt;element name="Muebles"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Mueble" maxOccurs="unbounded"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="RegistroPublico" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="PartidaElectronica" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="Ubigeo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="Caracteristica" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="MontoTasacion" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                                                 &lt;element name="MontoBase" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
 *                             &lt;element name="Inmuebles"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Inmueble" maxOccurs="unbounded"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="RegistroPublico" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="PartidaElectronica" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="Ubigeo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="Caracteristica" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="MontoTasacion" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                                                 &lt;element name="MontoBase" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
 *                             &lt;element name="Mercaderias"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Mercaderia" maxOccurs="unbounded"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="RegistroPublico" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="PartidaElectronica" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="Ubigeo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="Caracteristica" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="MontoTasacion" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                                                 &lt;element name="MontoBase" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
 *         &lt;element name="RematesBienesInmuebles"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="RemateInmueble" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="NumeroExpediente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NumeroRemate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="Motivo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="Juzgado" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="EncargoDe" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="Divisa" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="MontoTasacion" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                             &lt;element name="MontoBase" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                             &lt;element name="FechaPublicacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="Ubigeo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="FechaRemate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="HoraRemate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="Demandantes"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Demandante" maxOccurs="unbounded"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="TipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="NumeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="Nombres" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
 *                             &lt;element name="Demandados"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Demandado" maxOccurs="unbounded"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="TipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="NumeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="Nombres" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
 *                             &lt;element name="Muebles"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Mueble" maxOccurs="unbounded"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="RegistroPublico" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="PartidaElectronica" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="Ubigeo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="Caracteristica" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="MontoTasacion" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                                                 &lt;element name="MontoBase" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
 *                             &lt;element name="Inmuebles"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Inmueble" maxOccurs="unbounded"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="RegistroPublico" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="PartidaElectronica" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="Ubigeo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="Caracteristica" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="MontoTasacion" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                                                 &lt;element name="MontoBase" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
 *                             &lt;element name="Mercaderias"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Mercaderia" maxOccurs="unbounded"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="RegistroPublico" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="PartidaElectronica" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="Ubigeo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="Caracteristica" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="MontoTasacion" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                                                 &lt;element name="MontoBase" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
 *         &lt;element name="ConvocatoriaAccredores"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Convocatoria" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Motivo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="FechaComunicado" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="FechaPublicacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="FechaJunta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="HoraJunta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="Ubigeo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
 *         &lt;element name="RematesWarrants"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="RemateWarrant" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="NumeroExpediente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NumeroRemate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="Motivo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="Juzgado" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="EncargoDe" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="Divisa" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="MontoTasacion" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                             &lt;element name="MontoBase" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                             &lt;element name="FechaPublicacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="Ubigeo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="FechaRemate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="HoraRemate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="Demandantes"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Demandante" maxOccurs="unbounded"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="TipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="NumeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="Nombres" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
 *                             &lt;element name="Demandados"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Demandado" maxOccurs="unbounded"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="TipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="NumeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="Nombres" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
 *                             &lt;element name="Muebles"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Mueble" maxOccurs="unbounded"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="RegistroPublico" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="PartidaElectronica" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="Ubigeo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="Caracteristica" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="MontoTasacion" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                                                 &lt;element name="MontoBase" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
 *                             &lt;element name="Inmuebles"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Inmueble" maxOccurs="unbounded"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="RegistroPublico" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="PartidaElectronica" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="Ubigeo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="Caracteristica" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="MontoTasacion" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                                                 &lt;element name="MontoBase" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
 *                             &lt;element name="Mercaderias"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Mercaderia" maxOccurs="unbounded"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="RegistroPublico" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="PartidaElectronica" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="Ubigeo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="Caracteristica" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="MontoTasacion" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                                                 &lt;element name="MontoBase" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
 *         &lt;element name="FusionSociedades"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Fusion" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="NuevoNombre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="Divisa" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="NuevoCapital" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                             &lt;element name="FechaAcuerdo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="FechaPublicacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="Empresas"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Empresa" maxOccurs="unbounded"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="TipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="NumeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="Nombres" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
 *         &lt;element name="Disoluciones"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Disolucion" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="Ubigeo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="FechaVigencia" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="FechaPublicacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="Liquidadores"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Liquidador" maxOccurs="unbounded"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="TipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="NumeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="Nombres" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
 *         &lt;element name="CambiosCapital"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Cambio" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="FechaAcuerdo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="Divisa" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="TipoCambio" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="MontoAcuerdo" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                             &lt;element name="CapitalAnterior" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                             &lt;element name="CapitalActual" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                             &lt;element name="FechaPublicacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
 *         &lt;element name="ObligacionDarDinero"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Obligacion" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Motivo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="Divisa" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="Monto" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                             &lt;element name="Juzgado" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="FechaResolucion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="FechaPublicacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="Acreedores"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Acreedor" maxOccurs="unbounded"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="TipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="NumeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="Nombres" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
 *                             &lt;element name="Deudores"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Deudor" maxOccurs="unbounded"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="TipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="NumeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="Nombres" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
 *         &lt;element name="AvisosQuiebra"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Quiebra" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Expediente" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="FechaResolucion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="FechaPublicacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="Liquidadores"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Liquidador" maxOccurs="unbounded"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="TipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="NumeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="Nombres" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
 *         &lt;element name="ConstitucionPatrimonioFamiliar"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="PatrimonioFamiliar" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="FechaComunicacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="FechaPublicacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="Personas"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Persona" maxOccurs="unbounded"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="TipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="NumeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="Nombres" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
 *                             &lt;element name="Bienes"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Bien" maxOccurs="unbounded"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="RegistroPublico" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="Ubigeo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
 *         &lt;element name="ExtincionPatrimonioFamiliar"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="PatrimonioFamiliar" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="FechaComunicacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="FechaPublicacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="Personas"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Persona" maxOccurs="unbounded"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="TipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="NumeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="Nombres" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
 *                             &lt;element name="Bienes"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Bien" maxOccurs="unbounded"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="RegistroPublico" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="Ubigeo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
 *         &lt;element name="EscisionPatrimonio"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Escision" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Divisa" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="PatrimonioEscindido" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                             &lt;element name="FechaVigencia" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="FechaPublicacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="EscindenteTipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="EscidenteNumeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="EscindenteNombre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="EscindenteCapital" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                             &lt;element name="BeneficiarioTipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="BeneficiarioNumeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="BeneficiarioNombre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="BeneficiarioCapital" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
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
    "rematesBienesMuebles",
    "rematesBienesInmuebles",
    "convocatoriaAccredores",
    "rematesWarrants",
    "fusionSociedades",
    "disoluciones",
    "cambiosCapital",
    "obligacionDarDinero",
    "avisosQuiebra",
    "constitucionPatrimonioFamiliar",
    "extincionPatrimonioFamiliar",
    "escisionPatrimonio"
})
@XmlRootElement(name = "BoletinOficial")
public class BoletinOficial {

    @XmlElement(name = "RematesBienesMuebles", required = true)
    protected BoletinOficial.RematesBienesMuebles rematesBienesMuebles;
    @XmlElement(name = "RematesBienesInmuebles", required = true)
    protected BoletinOficial.RematesBienesInmuebles rematesBienesInmuebles;
    @XmlElement(name = "ConvocatoriaAccredores", required = true)
    protected BoletinOficial.ConvocatoriaAccredores convocatoriaAccredores;
    @XmlElement(name = "RematesWarrants", required = true)
    protected BoletinOficial.RematesWarrants rematesWarrants;
    @XmlElement(name = "FusionSociedades", required = true)
    protected BoletinOficial.FusionSociedades fusionSociedades;
    @XmlElement(name = "Disoluciones", required = true)
    protected BoletinOficial.Disoluciones disoluciones;
    @XmlElement(name = "CambiosCapital", required = true)
    protected BoletinOficial.CambiosCapital cambiosCapital;
    @XmlElement(name = "ObligacionDarDinero", required = true)
    protected BoletinOficial.ObligacionDarDinero obligacionDarDinero;
    @XmlElement(name = "AvisosQuiebra", required = true)
    protected BoletinOficial.AvisosQuiebra avisosQuiebra;
    @XmlElement(name = "ConstitucionPatrimonioFamiliar", required = true)
    protected BoletinOficial.ConstitucionPatrimonioFamiliar constitucionPatrimonioFamiliar;
    @XmlElement(name = "ExtincionPatrimonioFamiliar", required = true)
    protected BoletinOficial.ExtincionPatrimonioFamiliar extincionPatrimonioFamiliar;
    @XmlElement(name = "EscisionPatrimonio", required = true)
    protected BoletinOficial.EscisionPatrimonio escisionPatrimonio;

    /**
     * Obtiene el valor de la propiedad rematesBienesMuebles.
     * 
     * @return
     *     possible object is
     *     {@link BoletinOficial.RematesBienesMuebles }
     *     
     */
    public BoletinOficial.RematesBienesMuebles getRematesBienesMuebles() {
        return rematesBienesMuebles;
    }

    /**
     * Define el valor de la propiedad rematesBienesMuebles.
     * 
     * @param value
     *     allowed object is
     *     {@link BoletinOficial.RematesBienesMuebles }
     *     
     */
    public void setRematesBienesMuebles(BoletinOficial.RematesBienesMuebles value) {
        this.rematesBienesMuebles = value;
    }

    /**
     * Obtiene el valor de la propiedad rematesBienesInmuebles.
     * 
     * @return
     *     possible object is
     *     {@link BoletinOficial.RematesBienesInmuebles }
     *     
     */
    public BoletinOficial.RematesBienesInmuebles getRematesBienesInmuebles() {
        return rematesBienesInmuebles;
    }

    /**
     * Define el valor de la propiedad rematesBienesInmuebles.
     * 
     * @param value
     *     allowed object is
     *     {@link BoletinOficial.RematesBienesInmuebles }
     *     
     */
    public void setRematesBienesInmuebles(BoletinOficial.RematesBienesInmuebles value) {
        this.rematesBienesInmuebles = value;
    }

    /**
     * Obtiene el valor de la propiedad convocatoriaAccredores.
     * 
     * @return
     *     possible object is
     *     {@link BoletinOficial.ConvocatoriaAccredores }
     *     
     */
    public BoletinOficial.ConvocatoriaAccredores getConvocatoriaAccredores() {
        return convocatoriaAccredores;
    }

    /**
     * Define el valor de la propiedad convocatoriaAccredores.
     * 
     * @param value
     *     allowed object is
     *     {@link BoletinOficial.ConvocatoriaAccredores }
     *     
     */
    public void setConvocatoriaAccredores(BoletinOficial.ConvocatoriaAccredores value) {
        this.convocatoriaAccredores = value;
    }

    /**
     * Obtiene el valor de la propiedad rematesWarrants.
     * 
     * @return
     *     possible object is
     *     {@link BoletinOficial.RematesWarrants }
     *     
     */
    public BoletinOficial.RematesWarrants getRematesWarrants() {
        return rematesWarrants;
    }

    /**
     * Define el valor de la propiedad rematesWarrants.
     * 
     * @param value
     *     allowed object is
     *     {@link BoletinOficial.RematesWarrants }
     *     
     */
    public void setRematesWarrants(BoletinOficial.RematesWarrants value) {
        this.rematesWarrants = value;
    }

    /**
     * Obtiene el valor de la propiedad fusionSociedades.
     * 
     * @return
     *     possible object is
     *     {@link BoletinOficial.FusionSociedades }
     *     
     */
    public BoletinOficial.FusionSociedades getFusionSociedades() {
        return fusionSociedades;
    }

    /**
     * Define el valor de la propiedad fusionSociedades.
     * 
     * @param value
     *     allowed object is
     *     {@link BoletinOficial.FusionSociedades }
     *     
     */
    public void setFusionSociedades(BoletinOficial.FusionSociedades value) {
        this.fusionSociedades = value;
    }

    /**
     * Obtiene el valor de la propiedad disoluciones.
     * 
     * @return
     *     possible object is
     *     {@link BoletinOficial.Disoluciones }
     *     
     */
    public BoletinOficial.Disoluciones getDisoluciones() {
        return disoluciones;
    }

    /**
     * Define el valor de la propiedad disoluciones.
     * 
     * @param value
     *     allowed object is
     *     {@link BoletinOficial.Disoluciones }
     *     
     */
    public void setDisoluciones(BoletinOficial.Disoluciones value) {
        this.disoluciones = value;
    }

    /**
     * Obtiene el valor de la propiedad cambiosCapital.
     * 
     * @return
     *     possible object is
     *     {@link BoletinOficial.CambiosCapital }
     *     
     */
    public BoletinOficial.CambiosCapital getCambiosCapital() {
        return cambiosCapital;
    }

    /**
     * Define el valor de la propiedad cambiosCapital.
     * 
     * @param value
     *     allowed object is
     *     {@link BoletinOficial.CambiosCapital }
     *     
     */
    public void setCambiosCapital(BoletinOficial.CambiosCapital value) {
        this.cambiosCapital = value;
    }

    /**
     * Obtiene el valor de la propiedad obligacionDarDinero.
     * 
     * @return
     *     possible object is
     *     {@link BoletinOficial.ObligacionDarDinero }
     *     
     */
    public BoletinOficial.ObligacionDarDinero getObligacionDarDinero() {
        return obligacionDarDinero;
    }

    /**
     * Define el valor de la propiedad obligacionDarDinero.
     * 
     * @param value
     *     allowed object is
     *     {@link BoletinOficial.ObligacionDarDinero }
     *     
     */
    public void setObligacionDarDinero(BoletinOficial.ObligacionDarDinero value) {
        this.obligacionDarDinero = value;
    }

    /**
     * Obtiene el valor de la propiedad avisosQuiebra.
     * 
     * @return
     *     possible object is
     *     {@link BoletinOficial.AvisosQuiebra }
     *     
     */
    public BoletinOficial.AvisosQuiebra getAvisosQuiebra() {
        return avisosQuiebra;
    }

    /**
     * Define el valor de la propiedad avisosQuiebra.
     * 
     * @param value
     *     allowed object is
     *     {@link BoletinOficial.AvisosQuiebra }
     *     
     */
    public void setAvisosQuiebra(BoletinOficial.AvisosQuiebra value) {
        this.avisosQuiebra = value;
    }

    /**
     * Obtiene el valor de la propiedad constitucionPatrimonioFamiliar.
     * 
     * @return
     *     possible object is
     *     {@link BoletinOficial.ConstitucionPatrimonioFamiliar }
     *     
     */
    public BoletinOficial.ConstitucionPatrimonioFamiliar getConstitucionPatrimonioFamiliar() {
        return constitucionPatrimonioFamiliar;
    }

    /**
     * Define el valor de la propiedad constitucionPatrimonioFamiliar.
     * 
     * @param value
     *     allowed object is
     *     {@link BoletinOficial.ConstitucionPatrimonioFamiliar }
     *     
     */
    public void setConstitucionPatrimonioFamiliar(BoletinOficial.ConstitucionPatrimonioFamiliar value) {
        this.constitucionPatrimonioFamiliar = value;
    }

    /**
     * Obtiene el valor de la propiedad extincionPatrimonioFamiliar.
     * 
     * @return
     *     possible object is
     *     {@link BoletinOficial.ExtincionPatrimonioFamiliar }
     *     
     */
    public BoletinOficial.ExtincionPatrimonioFamiliar getExtincionPatrimonioFamiliar() {
        return extincionPatrimonioFamiliar;
    }

    /**
     * Define el valor de la propiedad extincionPatrimonioFamiliar.
     * 
     * @param value
     *     allowed object is
     *     {@link BoletinOficial.ExtincionPatrimonioFamiliar }
     *     
     */
    public void setExtincionPatrimonioFamiliar(BoletinOficial.ExtincionPatrimonioFamiliar value) {
        this.extincionPatrimonioFamiliar = value;
    }

    /**
     * Obtiene el valor de la propiedad escisionPatrimonio.
     * 
     * @return
     *     possible object is
     *     {@link BoletinOficial.EscisionPatrimonio }
     *     
     */
    public BoletinOficial.EscisionPatrimonio getEscisionPatrimonio() {
        return escisionPatrimonio;
    }

    /**
     * Define el valor de la propiedad escisionPatrimonio.
     * 
     * @param value
     *     allowed object is
     *     {@link BoletinOficial.EscisionPatrimonio }
     *     
     */
    public void setEscisionPatrimonio(BoletinOficial.EscisionPatrimonio value) {
        this.escisionPatrimonio = value;
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
     *         &lt;element name="Quiebra" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Expediente" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="FechaResolucion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="FechaPublicacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="Liquidadores"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Liquidador" maxOccurs="unbounded"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="TipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="NumeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="Nombres" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "quiebra"
    })
    public static class AvisosQuiebra {

        @XmlElement(name = "Quiebra", required = true)
        protected List<BoletinOficial.AvisosQuiebra.Quiebra> quiebra;

        /**
         * Gets the value of the quiebra property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the quiebra property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getQuiebra().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BoletinOficial.AvisosQuiebra.Quiebra }
         * 
         * 
         */
        public List<BoletinOficial.AvisosQuiebra.Quiebra> getQuiebra() {
            if (quiebra == null) {
                quiebra = new ArrayList<BoletinOficial.AvisosQuiebra.Quiebra>();
            }
            return this.quiebra;
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
         *         &lt;element name="Expediente" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="FechaResolucion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="FechaPublicacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="Liquidadores"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Liquidador" maxOccurs="unbounded"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="TipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="NumeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="Nombres" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
            "expediente",
            "fechaResolucion",
            "fechaPublicacion",
            "liquidadores"
        })
        public static class Quiebra {

            @XmlElement(name = "Expediente", required = true)
            protected String expediente;
            @XmlElement(name = "FechaResolucion", required = true)
            protected String fechaResolucion;
            @XmlElement(name = "FechaPublicacion", required = true)
            protected String fechaPublicacion;
            @XmlElement(name = "Liquidadores", required = true)
            protected BoletinOficial.AvisosQuiebra.Quiebra.Liquidadores liquidadores;

            /**
             * Obtiene el valor de la propiedad expediente.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getExpediente() {
                return expediente;
            }

            /**
             * Define el valor de la propiedad expediente.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setExpediente(String value) {
                this.expediente = value;
            }

            /**
             * Obtiene el valor de la propiedad fechaResolucion.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFechaResolucion() {
                return fechaResolucion;
            }

            /**
             * Define el valor de la propiedad fechaResolucion.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFechaResolucion(String value) {
                this.fechaResolucion = value;
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
             * Obtiene el valor de la propiedad liquidadores.
             * 
             * @return
             *     possible object is
             *     {@link BoletinOficial.AvisosQuiebra.Quiebra.Liquidadores }
             *     
             */
            public BoletinOficial.AvisosQuiebra.Quiebra.Liquidadores getLiquidadores() {
                return liquidadores;
            }

            /**
             * Define el valor de la propiedad liquidadores.
             * 
             * @param value
             *     allowed object is
             *     {@link BoletinOficial.AvisosQuiebra.Quiebra.Liquidadores }
             *     
             */
            public void setLiquidadores(BoletinOficial.AvisosQuiebra.Quiebra.Liquidadores value) {
                this.liquidadores = value;
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
             *         &lt;element name="Liquidador" maxOccurs="unbounded"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="TipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="NumeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="Nombres" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
                "liquidador"
            })
            public static class Liquidadores {

                @XmlElement(name = "Liquidador", required = true)
                protected List<BoletinOficial.AvisosQuiebra.Quiebra.Liquidadores.Liquidador> liquidador;

                /**
                 * Gets the value of the liquidador property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the liquidador property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getLiquidador().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link BoletinOficial.AvisosQuiebra.Quiebra.Liquidadores.Liquidador }
                 * 
                 * 
                 */
                public List<BoletinOficial.AvisosQuiebra.Quiebra.Liquidadores.Liquidador> getLiquidador() {
                    if (liquidador == null) {
                        liquidador = new ArrayList<BoletinOficial.AvisosQuiebra.Quiebra.Liquidadores.Liquidador>();
                    }
                    return this.liquidador;
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
                 *         &lt;element name="NumeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="Nombres" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
                    "nombres",
                    "tipo"
                })
                public static class Liquidador {

                    @XmlElement(name = "TipoDocumento", required = true)
                    protected String tipoDocumento;
                    @XmlElement(name = "NumeroDocumento", required = true)
                    protected String numeroDocumento;
                    @XmlElement(name = "Nombres", required = true)
                    protected String nombres;
                    @XmlElement(name = "Tipo", required = true)
                    protected String tipo;

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
     *         &lt;element name="Cambio" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="FechaAcuerdo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="Divisa" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="TipoCambio" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="MontoAcuerdo" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                   &lt;element name="CapitalAnterior" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                   &lt;element name="CapitalActual" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                   &lt;element name="FechaPublicacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "cambio"
    })
    public static class CambiosCapital {

        @XmlElement(name = "Cambio", required = true)
        protected List<BoletinOficial.CambiosCapital.Cambio> cambio;

        /**
         * Gets the value of the cambio property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the cambio property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCambio().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BoletinOficial.CambiosCapital.Cambio }
         * 
         * 
         */
        public List<BoletinOficial.CambiosCapital.Cambio> getCambio() {
            if (cambio == null) {
                cambio = new ArrayList<BoletinOficial.CambiosCapital.Cambio>();
            }
            return this.cambio;
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
         *         &lt;element name="FechaAcuerdo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="Divisa" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="TipoCambio" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="MontoAcuerdo" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *         &lt;element name="CapitalAnterior" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *         &lt;element name="CapitalActual" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *         &lt;element name="FechaPublicacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
            "fechaAcuerdo",
            "divisa",
            "tipoCambio",
            "montoAcuerdo",
            "capitalAnterior",
            "capitalActual",
            "fechaPublicacion"
        })
        public static class Cambio {

            @XmlElement(name = "FechaAcuerdo", required = true)
            protected String fechaAcuerdo;
            @XmlElement(name = "Divisa", required = true)
            protected String divisa;
            @XmlElement(name = "TipoCambio", required = true)
            protected String tipoCambio;
            @XmlElement(name = "MontoAcuerdo", required = true)
            protected BigDecimal montoAcuerdo;
            @XmlElement(name = "CapitalAnterior", required = true)
            protected BigDecimal capitalAnterior;
            @XmlElement(name = "CapitalActual", required = true)
            protected BigDecimal capitalActual;
            @XmlElement(name = "FechaPublicacion", required = true)
            protected String fechaPublicacion;

            /**
             * Obtiene el valor de la propiedad fechaAcuerdo.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFechaAcuerdo() {
                return fechaAcuerdo;
            }

            /**
             * Define el valor de la propiedad fechaAcuerdo.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFechaAcuerdo(String value) {
                this.fechaAcuerdo = value;
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
             * Obtiene el valor de la propiedad tipoCambio.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTipoCambio() {
                return tipoCambio;
            }

            /**
             * Define el valor de la propiedad tipoCambio.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTipoCambio(String value) {
                this.tipoCambio = value;
            }

            /**
             * Obtiene el valor de la propiedad montoAcuerdo.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getMontoAcuerdo() {
                return montoAcuerdo;
            }

            /**
             * Define el valor de la propiedad montoAcuerdo.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setMontoAcuerdo(BigDecimal value) {
                this.montoAcuerdo = value;
            }

            /**
             * Obtiene el valor de la propiedad capitalAnterior.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getCapitalAnterior() {
                return capitalAnterior;
            }

            /**
             * Define el valor de la propiedad capitalAnterior.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setCapitalAnterior(BigDecimal value) {
                this.capitalAnterior = value;
            }

            /**
             * Obtiene el valor de la propiedad capitalActual.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getCapitalActual() {
                return capitalActual;
            }

            /**
             * Define el valor de la propiedad capitalActual.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setCapitalActual(BigDecimal value) {
                this.capitalActual = value;
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
     *         &lt;element name="PatrimonioFamiliar" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="FechaComunicacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="FechaPublicacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="Personas"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Persona" maxOccurs="unbounded"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="TipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="NumeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="Nombres" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
     *                   &lt;element name="Bienes"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Bien" maxOccurs="unbounded"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="RegistroPublico" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="Ubigeo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "patrimonioFamiliar"
    })
    public static class ConstitucionPatrimonioFamiliar {

        @XmlElement(name = "PatrimonioFamiliar", required = true)
        protected List<BoletinOficial.ConstitucionPatrimonioFamiliar.PatrimonioFamiliar> patrimonioFamiliar;

        /**
         * Gets the value of the patrimonioFamiliar property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the patrimonioFamiliar property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPatrimonioFamiliar().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BoletinOficial.ConstitucionPatrimonioFamiliar.PatrimonioFamiliar }
         * 
         * 
         */
        public List<BoletinOficial.ConstitucionPatrimonioFamiliar.PatrimonioFamiliar> getPatrimonioFamiliar() {
            if (patrimonioFamiliar == null) {
                patrimonioFamiliar = new ArrayList<BoletinOficial.ConstitucionPatrimonioFamiliar.PatrimonioFamiliar>();
            }
            return this.patrimonioFamiliar;
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
         *         &lt;element name="FechaComunicacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="FechaPublicacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="Personas"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Persona" maxOccurs="unbounded"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="TipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="NumeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="Nombres" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
         *         &lt;element name="Bienes"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Bien" maxOccurs="unbounded"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="RegistroPublico" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="Ubigeo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
            "fechaComunicacion",
            "fechaPublicacion",
            "personas",
            "bienes"
        })
        public static class PatrimonioFamiliar {

            @XmlElement(name = "FechaComunicacion", required = true)
            protected String fechaComunicacion;
            @XmlElement(name = "FechaPublicacion", required = true)
            protected String fechaPublicacion;
            @XmlElement(name = "Personas", required = true)
            protected BoletinOficial.ConstitucionPatrimonioFamiliar.PatrimonioFamiliar.Personas personas;
            @XmlElement(name = "Bienes", required = true)
            protected BoletinOficial.ConstitucionPatrimonioFamiliar.PatrimonioFamiliar.Bienes bienes;

            /**
             * Obtiene el valor de la propiedad fechaComunicacion.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFechaComunicacion() {
                return fechaComunicacion;
            }

            /**
             * Define el valor de la propiedad fechaComunicacion.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFechaComunicacion(String value) {
                this.fechaComunicacion = value;
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
             * Obtiene el valor de la propiedad personas.
             * 
             * @return
             *     possible object is
             *     {@link BoletinOficial.ConstitucionPatrimonioFamiliar.PatrimonioFamiliar.Personas }
             *     
             */
            public BoletinOficial.ConstitucionPatrimonioFamiliar.PatrimonioFamiliar.Personas getPersonas() {
                return personas;
            }

            /**
             * Define el valor de la propiedad personas.
             * 
             * @param value
             *     allowed object is
             *     {@link BoletinOficial.ConstitucionPatrimonioFamiliar.PatrimonioFamiliar.Personas }
             *     
             */
            public void setPersonas(BoletinOficial.ConstitucionPatrimonioFamiliar.PatrimonioFamiliar.Personas value) {
                this.personas = value;
            }

            /**
             * Obtiene el valor de la propiedad bienes.
             * 
             * @return
             *     possible object is
             *     {@link BoletinOficial.ConstitucionPatrimonioFamiliar.PatrimonioFamiliar.Bienes }
             *     
             */
            public BoletinOficial.ConstitucionPatrimonioFamiliar.PatrimonioFamiliar.Bienes getBienes() {
                return bienes;
            }

            /**
             * Define el valor de la propiedad bienes.
             * 
             * @param value
             *     allowed object is
             *     {@link BoletinOficial.ConstitucionPatrimonioFamiliar.PatrimonioFamiliar.Bienes }
             *     
             */
            public void setBienes(BoletinOficial.ConstitucionPatrimonioFamiliar.PatrimonioFamiliar.Bienes value) {
                this.bienes = value;
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
             *         &lt;element name="Bien" maxOccurs="unbounded"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="RegistroPublico" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="Ubigeo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
                "bien"
            })
            public static class Bienes {

                @XmlElement(name = "Bien", required = true)
                protected List<BoletinOficial.ConstitucionPatrimonioFamiliar.PatrimonioFamiliar.Bienes.Bien> bien;

                /**
                 * Gets the value of the bien property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the bien property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getBien().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link BoletinOficial.ConstitucionPatrimonioFamiliar.PatrimonioFamiliar.Bienes.Bien }
                 * 
                 * 
                 */
                public List<BoletinOficial.ConstitucionPatrimonioFamiliar.PatrimonioFamiliar.Bienes.Bien> getBien() {
                    if (bien == null) {
                        bien = new ArrayList<BoletinOficial.ConstitucionPatrimonioFamiliar.PatrimonioFamiliar.Bienes.Bien>();
                    }
                    return this.bien;
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
                 *         &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="RegistroPublico" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="Ubigeo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
                    "tipo",
                    "registroPublico",
                    "direccion",
                    "ubigeo"
                })
                public static class Bien {

                    @XmlElement(name = "Tipo", required = true)
                    protected String tipo;
                    @XmlElement(name = "RegistroPublico", required = true)
                    protected String registroPublico;
                    @XmlElement(name = "Direccion", required = true)
                    protected String direccion;
                    @XmlElement(name = "Ubigeo", required = true)
                    protected String ubigeo;

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
                     * Obtiene el valor de la propiedad registroPublico.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getRegistroPublico() {
                        return registroPublico;
                    }

                    /**
                     * Define el valor de la propiedad registroPublico.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setRegistroPublico(String value) {
                        this.registroPublico = value;
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
                     * Obtiene el valor de la propiedad ubigeo.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getUbigeo() {
                        return ubigeo;
                    }

                    /**
                     * Define el valor de la propiedad ubigeo.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setUbigeo(String value) {
                        this.ubigeo = value;
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
             *         &lt;element name="Persona" maxOccurs="unbounded"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="TipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="NumeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="Nombres" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
                "persona"
            })
            public static class Personas {

                @XmlElement(name = "Persona", required = true)
                protected List<BoletinOficial.ConstitucionPatrimonioFamiliar.PatrimonioFamiliar.Personas.Persona> persona;

                /**
                 * Gets the value of the persona property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the persona property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getPersona().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link BoletinOficial.ConstitucionPatrimonioFamiliar.PatrimonioFamiliar.Personas.Persona }
                 * 
                 * 
                 */
                public List<BoletinOficial.ConstitucionPatrimonioFamiliar.PatrimonioFamiliar.Personas.Persona> getPersona() {
                    if (persona == null) {
                        persona = new ArrayList<BoletinOficial.ConstitucionPatrimonioFamiliar.PatrimonioFamiliar.Personas.Persona>();
                    }
                    return this.persona;
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
                 *         &lt;element name="NumeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="Nombres" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
                    "nombres",
                    "tipo"
                })
                public static class Persona {

                    @XmlElement(name = "TipoDocumento", required = true)
                    protected String tipoDocumento;
                    @XmlElement(name = "NumeroDocumento", required = true)
                    protected String numeroDocumento;
                    @XmlElement(name = "Nombres", required = true)
                    protected String nombres;
                    @XmlElement(name = "Tipo", required = true)
                    protected String tipo;

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
     *         &lt;element name="Convocatoria" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Motivo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="FechaComunicado" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="FechaPublicacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="FechaJunta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="HoraJunta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="Ubigeo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "convocatoria"
    })
    public static class ConvocatoriaAccredores {

        @XmlElement(name = "Convocatoria", required = true)
        protected List<BoletinOficial.ConvocatoriaAccredores.Convocatoria> convocatoria;

        /**
         * Gets the value of the convocatoria property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the convocatoria property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getConvocatoria().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BoletinOficial.ConvocatoriaAccredores.Convocatoria }
         * 
         * 
         */
        public List<BoletinOficial.ConvocatoriaAccredores.Convocatoria> getConvocatoria() {
            if (convocatoria == null) {
                convocatoria = new ArrayList<BoletinOficial.ConvocatoriaAccredores.Convocatoria>();
            }
            return this.convocatoria;
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
         *         &lt;element name="Motivo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="FechaComunicado" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="FechaPublicacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="FechaJunta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="HoraJunta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="Ubigeo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
            "motivo",
            "numero",
            "fechaComunicado",
            "fechaPublicacion",
            "fechaJunta",
            "horaJunta",
            "direccion",
            "ubigeo"
        })
        public static class Convocatoria {

            @XmlElement(name = "Motivo", required = true)
            protected String motivo;
            @XmlElement(name = "Numero")
            protected String numero;
            @XmlElement(name = "FechaComunicado", required = true)
            protected String fechaComunicado;
            @XmlElement(name = "FechaPublicacion", required = true)
            protected String fechaPublicacion;
            @XmlElement(name = "FechaJunta", required = true)
            protected String fechaJunta;
            @XmlElement(name = "HoraJunta", required = true)
            protected String horaJunta;
            @XmlElement(name = "Direccion", required = true)
            protected String direccion;
            @XmlElement(name = "Ubigeo", required = true)
            protected String ubigeo;

            /**
             * Obtiene el valor de la propiedad motivo.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMotivo() {
                return motivo;
            }

            /**
             * Define el valor de la propiedad motivo.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMotivo(String value) {
                this.motivo = value;
            }

            /**
             * Obtiene el valor de la propiedad numero.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumero() {
                return numero;
            }

            /**
             * Define el valor de la propiedad numero.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumero(String value) {
                this.numero = value;
            }

            /**
             * Obtiene el valor de la propiedad fechaComunicado.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFechaComunicado() {
                return fechaComunicado;
            }

            /**
             * Define el valor de la propiedad fechaComunicado.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFechaComunicado(String value) {
                this.fechaComunicado = value;
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
             * Obtiene el valor de la propiedad fechaJunta.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFechaJunta() {
                return fechaJunta;
            }

            /**
             * Define el valor de la propiedad fechaJunta.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFechaJunta(String value) {
                this.fechaJunta = value;
            }

            /**
             * Obtiene el valor de la propiedad horaJunta.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getHoraJunta() {
                return horaJunta;
            }

            /**
             * Define el valor de la propiedad horaJunta.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setHoraJunta(String value) {
                this.horaJunta = value;
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
             * Obtiene el valor de la propiedad ubigeo.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUbigeo() {
                return ubigeo;
            }

            /**
             * Define el valor de la propiedad ubigeo.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUbigeo(String value) {
                this.ubigeo = value;
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
     *         &lt;element name="Disolucion" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="Ubigeo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="FechaVigencia" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="FechaPublicacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="Liquidadores"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Liquidador" maxOccurs="unbounded"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="TipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="NumeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="Nombres" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "disolucion"
    })
    public static class Disoluciones {

        @XmlElement(name = "Disolucion", required = true)
        protected List<BoletinOficial.Disoluciones.Disolucion> disolucion;

        /**
         * Gets the value of the disolucion property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the disolucion property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDisolucion().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BoletinOficial.Disoluciones.Disolucion }
         * 
         * 
         */
        public List<BoletinOficial.Disoluciones.Disolucion> getDisolucion() {
            if (disolucion == null) {
                disolucion = new ArrayList<BoletinOficial.Disoluciones.Disolucion>();
            }
            return this.disolucion;
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
         *         &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="Ubigeo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="FechaVigencia" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="FechaPublicacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="Liquidadores"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Liquidador" maxOccurs="unbounded"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="TipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="NumeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="Nombres" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
            "direccion",
            "ubigeo",
            "fechaVigencia",
            "fechaPublicacion",
            "liquidadores"
        })
        public static class Disolucion {

            @XmlElement(name = "Direccion", required = true)
            protected String direccion;
            @XmlElement(name = "Ubigeo", required = true)
            protected String ubigeo;
            @XmlElement(name = "FechaVigencia", required = true)
            protected String fechaVigencia;
            @XmlElement(name = "FechaPublicacion", required = true)
            protected String fechaPublicacion;
            @XmlElement(name = "Liquidadores", required = true)
            protected BoletinOficial.Disoluciones.Disolucion.Liquidadores liquidadores;

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
             * Obtiene el valor de la propiedad ubigeo.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUbigeo() {
                return ubigeo;
            }

            /**
             * Define el valor de la propiedad ubigeo.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUbigeo(String value) {
                this.ubigeo = value;
            }

            /**
             * Obtiene el valor de la propiedad fechaVigencia.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFechaVigencia() {
                return fechaVigencia;
            }

            /**
             * Define el valor de la propiedad fechaVigencia.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFechaVigencia(String value) {
                this.fechaVigencia = value;
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
             * Obtiene el valor de la propiedad liquidadores.
             * 
             * @return
             *     possible object is
             *     {@link BoletinOficial.Disoluciones.Disolucion.Liquidadores }
             *     
             */
            public BoletinOficial.Disoluciones.Disolucion.Liquidadores getLiquidadores() {
                return liquidadores;
            }

            /**
             * Define el valor de la propiedad liquidadores.
             * 
             * @param value
             *     allowed object is
             *     {@link BoletinOficial.Disoluciones.Disolucion.Liquidadores }
             *     
             */
            public void setLiquidadores(BoletinOficial.Disoluciones.Disolucion.Liquidadores value) {
                this.liquidadores = value;
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
             *         &lt;element name="Liquidador" maxOccurs="unbounded"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="TipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="NumeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="Nombres" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
                "liquidador"
            })
            public static class Liquidadores {

                @XmlElement(name = "Liquidador", required = true)
                protected List<BoletinOficial.Disoluciones.Disolucion.Liquidadores.Liquidador> liquidador;

                /**
                 * Gets the value of the liquidador property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the liquidador property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getLiquidador().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link BoletinOficial.Disoluciones.Disolucion.Liquidadores.Liquidador }
                 * 
                 * 
                 */
                public List<BoletinOficial.Disoluciones.Disolucion.Liquidadores.Liquidador> getLiquidador() {
                    if (liquidador == null) {
                        liquidador = new ArrayList<BoletinOficial.Disoluciones.Disolucion.Liquidadores.Liquidador>();
                    }
                    return this.liquidador;
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
                 *         &lt;element name="NumeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="Nombres" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
                    "nombres",
                    "tipo"
                })
                public static class Liquidador {

                    @XmlElement(name = "TipoDocumento", required = true)
                    protected String tipoDocumento;
                    @XmlElement(name = "NumeroDocumento", required = true)
                    protected String numeroDocumento;
                    @XmlElement(name = "Nombres", required = true)
                    protected String nombres;
                    @XmlElement(name = "Tipo", required = true)
                    protected String tipo;

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
     *         &lt;element name="Escision" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Divisa" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="PatrimonioEscindido" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                   &lt;element name="FechaVigencia" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="FechaPublicacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="EscindenteTipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="EscidenteNumeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="EscindenteNombre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="EscindenteCapital" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                   &lt;element name="BeneficiarioTipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="BeneficiarioNumeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="BeneficiarioNombre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="BeneficiarioCapital" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
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
        "escision"
    })
    public static class EscisionPatrimonio {

        @XmlElement(name = "Escision", required = true)
        protected List<BoletinOficial.EscisionPatrimonio.Escision> escision;

        /**
         * Gets the value of the escision property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the escision property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEscision().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BoletinOficial.EscisionPatrimonio.Escision }
         * 
         * 
         */
        public List<BoletinOficial.EscisionPatrimonio.Escision> getEscision() {
            if (escision == null) {
                escision = new ArrayList<BoletinOficial.EscisionPatrimonio.Escision>();
            }
            return this.escision;
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
         *         &lt;element name="Divisa" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="PatrimonioEscindido" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *         &lt;element name="FechaVigencia" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="FechaPublicacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="EscindenteTipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="EscidenteNumeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="EscindenteNombre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="EscindenteCapital" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *         &lt;element name="BeneficiarioTipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="BeneficiarioNumeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="BeneficiarioNombre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="BeneficiarioCapital" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
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
            "divisa",
            "patrimonioEscindido",
            "fechaVigencia",
            "fechaPublicacion",
            "escindenteTipoDocumento",
            "escidenteNumeroDocumento",
            "escindenteNombre",
            "escindenteCapital",
            "beneficiarioTipoDocumento",
            "beneficiarioNumeroDocumento",
            "beneficiarioNombre",
            "beneficiarioCapital"
        })
        public static class Escision {

            @XmlElement(name = "Divisa", required = true)
            protected String divisa;
            @XmlElement(name = "PatrimonioEscindido", required = true)
            protected BigDecimal patrimonioEscindido;
            @XmlElement(name = "FechaVigencia", required = true)
            protected String fechaVigencia;
            @XmlElement(name = "FechaPublicacion", required = true)
            protected String fechaPublicacion;
            @XmlElement(name = "EscindenteTipoDocumento", required = true)
            protected String escindenteTipoDocumento;
            @XmlElement(name = "EscidenteNumeroDocumento", required = true)
            protected String escidenteNumeroDocumento;
            @XmlElement(name = "EscindenteNombre", required = true)
            protected String escindenteNombre;
            @XmlElement(name = "EscindenteCapital", required = true)
            protected BigDecimal escindenteCapital;
            @XmlElement(name = "BeneficiarioTipoDocumento", required = true)
            protected String beneficiarioTipoDocumento;
            @XmlElement(name = "BeneficiarioNumeroDocumento", required = true)
            protected String beneficiarioNumeroDocumento;
            @XmlElement(name = "BeneficiarioNombre", required = true)
            protected String beneficiarioNombre;
            @XmlElement(name = "BeneficiarioCapital", required = true)
            protected BigDecimal beneficiarioCapital;

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
             * Obtiene el valor de la propiedad patrimonioEscindido.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getPatrimonioEscindido() {
                return patrimonioEscindido;
            }

            /**
             * Define el valor de la propiedad patrimonioEscindido.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setPatrimonioEscindido(BigDecimal value) {
                this.patrimonioEscindido = value;
            }

            /**
             * Obtiene el valor de la propiedad fechaVigencia.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFechaVigencia() {
                return fechaVigencia;
            }

            /**
             * Define el valor de la propiedad fechaVigencia.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFechaVigencia(String value) {
                this.fechaVigencia = value;
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
             * Obtiene el valor de la propiedad escindenteTipoDocumento.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEscindenteTipoDocumento() {
                return escindenteTipoDocumento;
            }

            /**
             * Define el valor de la propiedad escindenteTipoDocumento.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEscindenteTipoDocumento(String value) {
                this.escindenteTipoDocumento = value;
            }

            /**
             * Obtiene el valor de la propiedad escidenteNumeroDocumento.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEscidenteNumeroDocumento() {
                return escidenteNumeroDocumento;
            }

            /**
             * Define el valor de la propiedad escidenteNumeroDocumento.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEscidenteNumeroDocumento(String value) {
                this.escidenteNumeroDocumento = value;
            }

            /**
             * Obtiene el valor de la propiedad escindenteNombre.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEscindenteNombre() {
                return escindenteNombre;
            }

            /**
             * Define el valor de la propiedad escindenteNombre.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEscindenteNombre(String value) {
                this.escindenteNombre = value;
            }

            /**
             * Obtiene el valor de la propiedad escindenteCapital.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getEscindenteCapital() {
                return escindenteCapital;
            }

            /**
             * Define el valor de la propiedad escindenteCapital.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setEscindenteCapital(BigDecimal value) {
                this.escindenteCapital = value;
            }

            /**
             * Obtiene el valor de la propiedad beneficiarioTipoDocumento.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBeneficiarioTipoDocumento() {
                return beneficiarioTipoDocumento;
            }

            /**
             * Define el valor de la propiedad beneficiarioTipoDocumento.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBeneficiarioTipoDocumento(String value) {
                this.beneficiarioTipoDocumento = value;
            }

            /**
             * Obtiene el valor de la propiedad beneficiarioNumeroDocumento.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBeneficiarioNumeroDocumento() {
                return beneficiarioNumeroDocumento;
            }

            /**
             * Define el valor de la propiedad beneficiarioNumeroDocumento.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBeneficiarioNumeroDocumento(String value) {
                this.beneficiarioNumeroDocumento = value;
            }

            /**
             * Obtiene el valor de la propiedad beneficiarioNombre.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBeneficiarioNombre() {
                return beneficiarioNombre;
            }

            /**
             * Define el valor de la propiedad beneficiarioNombre.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBeneficiarioNombre(String value) {
                this.beneficiarioNombre = value;
            }

            /**
             * Obtiene el valor de la propiedad beneficiarioCapital.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getBeneficiarioCapital() {
                return beneficiarioCapital;
            }

            /**
             * Define el valor de la propiedad beneficiarioCapital.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setBeneficiarioCapital(BigDecimal value) {
                this.beneficiarioCapital = value;
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
     *         &lt;element name="PatrimonioFamiliar" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="FechaComunicacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="FechaPublicacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="Personas"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Persona" maxOccurs="unbounded"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="TipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="NumeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="Nombres" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
     *                   &lt;element name="Bienes"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Bien" maxOccurs="unbounded"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="RegistroPublico" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="Ubigeo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "patrimonioFamiliar"
    })
    public static class ExtincionPatrimonioFamiliar {

        @XmlElement(name = "PatrimonioFamiliar", required = true)
        protected List<BoletinOficial.ExtincionPatrimonioFamiliar.PatrimonioFamiliar> patrimonioFamiliar;

        /**
         * Gets the value of the patrimonioFamiliar property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the patrimonioFamiliar property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPatrimonioFamiliar().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BoletinOficial.ExtincionPatrimonioFamiliar.PatrimonioFamiliar }
         * 
         * 
         */
        public List<BoletinOficial.ExtincionPatrimonioFamiliar.PatrimonioFamiliar> getPatrimonioFamiliar() {
            if (patrimonioFamiliar == null) {
                patrimonioFamiliar = new ArrayList<BoletinOficial.ExtincionPatrimonioFamiliar.PatrimonioFamiliar>();
            }
            return this.patrimonioFamiliar;
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
         *         &lt;element name="FechaComunicacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="FechaPublicacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="Personas"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Persona" maxOccurs="unbounded"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="TipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="NumeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="Nombres" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
         *         &lt;element name="Bienes"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Bien" maxOccurs="unbounded"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="RegistroPublico" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="Ubigeo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
            "fechaComunicacion",
            "fechaPublicacion",
            "personas",
            "bienes"
        })
        public static class PatrimonioFamiliar {

            @XmlElement(name = "FechaComunicacion", required = true)
            protected String fechaComunicacion;
            @XmlElement(name = "FechaPublicacion", required = true)
            protected String fechaPublicacion;
            @XmlElement(name = "Personas", required = true)
            protected BoletinOficial.ExtincionPatrimonioFamiliar.PatrimonioFamiliar.Personas personas;
            @XmlElement(name = "Bienes", required = true)
            protected BoletinOficial.ExtincionPatrimonioFamiliar.PatrimonioFamiliar.Bienes bienes;

            /**
             * Obtiene el valor de la propiedad fechaComunicacion.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFechaComunicacion() {
                return fechaComunicacion;
            }

            /**
             * Define el valor de la propiedad fechaComunicacion.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFechaComunicacion(String value) {
                this.fechaComunicacion = value;
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
             * Obtiene el valor de la propiedad personas.
             * 
             * @return
             *     possible object is
             *     {@link BoletinOficial.ExtincionPatrimonioFamiliar.PatrimonioFamiliar.Personas }
             *     
             */
            public BoletinOficial.ExtincionPatrimonioFamiliar.PatrimonioFamiliar.Personas getPersonas() {
                return personas;
            }

            /**
             * Define el valor de la propiedad personas.
             * 
             * @param value
             *     allowed object is
             *     {@link BoletinOficial.ExtincionPatrimonioFamiliar.PatrimonioFamiliar.Personas }
             *     
             */
            public void setPersonas(BoletinOficial.ExtincionPatrimonioFamiliar.PatrimonioFamiliar.Personas value) {
                this.personas = value;
            }

            /**
             * Obtiene el valor de la propiedad bienes.
             * 
             * @return
             *     possible object is
             *     {@link BoletinOficial.ExtincionPatrimonioFamiliar.PatrimonioFamiliar.Bienes }
             *     
             */
            public BoletinOficial.ExtincionPatrimonioFamiliar.PatrimonioFamiliar.Bienes getBienes() {
                return bienes;
            }

            /**
             * Define el valor de la propiedad bienes.
             * 
             * @param value
             *     allowed object is
             *     {@link BoletinOficial.ExtincionPatrimonioFamiliar.PatrimonioFamiliar.Bienes }
             *     
             */
            public void setBienes(BoletinOficial.ExtincionPatrimonioFamiliar.PatrimonioFamiliar.Bienes value) {
                this.bienes = value;
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
             *         &lt;element name="Bien" maxOccurs="unbounded"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="RegistroPublico" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="Ubigeo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
                "bien"
            })
            public static class Bienes {

                @XmlElement(name = "Bien", required = true)
                protected List<BoletinOficial.ExtincionPatrimonioFamiliar.PatrimonioFamiliar.Bienes.Bien> bien;

                /**
                 * Gets the value of the bien property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the bien property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getBien().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link BoletinOficial.ExtincionPatrimonioFamiliar.PatrimonioFamiliar.Bienes.Bien }
                 * 
                 * 
                 */
                public List<BoletinOficial.ExtincionPatrimonioFamiliar.PatrimonioFamiliar.Bienes.Bien> getBien() {
                    if (bien == null) {
                        bien = new ArrayList<BoletinOficial.ExtincionPatrimonioFamiliar.PatrimonioFamiliar.Bienes.Bien>();
                    }
                    return this.bien;
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
                 *         &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="RegistroPublico" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="Ubigeo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
                    "tipo",
                    "registroPublico",
                    "direccion",
                    "ubigeo"
                })
                public static class Bien {

                    @XmlElement(name = "Tipo", required = true)
                    protected String tipo;
                    @XmlElement(name = "RegistroPublico", required = true)
                    protected String registroPublico;
                    @XmlElement(name = "Direccion", required = true)
                    protected String direccion;
                    @XmlElement(name = "Ubigeo", required = true)
                    protected String ubigeo;

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
                     * Obtiene el valor de la propiedad registroPublico.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getRegistroPublico() {
                        return registroPublico;
                    }

                    /**
                     * Define el valor de la propiedad registroPublico.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setRegistroPublico(String value) {
                        this.registroPublico = value;
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
                     * Obtiene el valor de la propiedad ubigeo.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getUbigeo() {
                        return ubigeo;
                    }

                    /**
                     * Define el valor de la propiedad ubigeo.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setUbigeo(String value) {
                        this.ubigeo = value;
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
             *         &lt;element name="Persona" maxOccurs="unbounded"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="TipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="NumeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="Nombres" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
                "persona"
            })
            public static class Personas {

                @XmlElement(name = "Persona", required = true)
                protected List<BoletinOficial.ExtincionPatrimonioFamiliar.PatrimonioFamiliar.Personas.Persona> persona;

                /**
                 * Gets the value of the persona property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the persona property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getPersona().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link BoletinOficial.ExtincionPatrimonioFamiliar.PatrimonioFamiliar.Personas.Persona }
                 * 
                 * 
                 */
                public List<BoletinOficial.ExtincionPatrimonioFamiliar.PatrimonioFamiliar.Personas.Persona> getPersona() {
                    if (persona == null) {
                        persona = new ArrayList<BoletinOficial.ExtincionPatrimonioFamiliar.PatrimonioFamiliar.Personas.Persona>();
                    }
                    return this.persona;
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
                 *         &lt;element name="NumeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="Nombres" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
                    "nombres",
                    "tipo"
                })
                public static class Persona {

                    @XmlElement(name = "TipoDocumento", required = true)
                    protected String tipoDocumento;
                    @XmlElement(name = "NumeroDocumento", required = true)
                    protected String numeroDocumento;
                    @XmlElement(name = "Nombres", required = true)
                    protected String nombres;
                    @XmlElement(name = "Tipo", required = true)
                    protected String tipo;

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
     *         &lt;element name="Fusion" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="NuevoNombre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="Divisa" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="NuevoCapital" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                   &lt;element name="FechaAcuerdo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="FechaPublicacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="Empresas"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Empresa" maxOccurs="unbounded"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="TipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="NumeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="Nombres" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "fusion"
    })
    public static class FusionSociedades {

        @XmlElement(name = "Fusion", required = true)
        protected List<BoletinOficial.FusionSociedades.Fusion> fusion;

        /**
         * Gets the value of the fusion property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fusion property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFusion().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BoletinOficial.FusionSociedades.Fusion }
         * 
         * 
         */
        public List<BoletinOficial.FusionSociedades.Fusion> getFusion() {
            if (fusion == null) {
                fusion = new ArrayList<BoletinOficial.FusionSociedades.Fusion>();
            }
            return this.fusion;
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
         *         &lt;element name="NuevoNombre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="Divisa" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="NuevoCapital" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *         &lt;element name="FechaAcuerdo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="FechaPublicacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="Empresas"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Empresa" maxOccurs="unbounded"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="TipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="NumeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="Nombres" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
            "nuevoNombre",
            "divisa",
            "nuevoCapital",
            "fechaAcuerdo",
            "fechaPublicacion",
            "empresas"
        })
        public static class Fusion {

            @XmlElement(name = "NuevoNombre", required = true)
            protected String nuevoNombre;
            @XmlElement(name = "Divisa", required = true)
            protected String divisa;
            @XmlElement(name = "NuevoCapital", required = true)
            protected BigDecimal nuevoCapital;
            @XmlElement(name = "FechaAcuerdo", required = true)
            protected String fechaAcuerdo;
            @XmlElement(name = "FechaPublicacion", required = true)
            protected String fechaPublicacion;
            @XmlElement(name = "Empresas", required = true)
            protected BoletinOficial.FusionSociedades.Fusion.Empresas empresas;

            /**
             * Obtiene el valor de la propiedad nuevoNombre.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNuevoNombre() {
                return nuevoNombre;
            }

            /**
             * Define el valor de la propiedad nuevoNombre.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNuevoNombre(String value) {
                this.nuevoNombre = value;
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
             * Obtiene el valor de la propiedad nuevoCapital.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getNuevoCapital() {
                return nuevoCapital;
            }

            /**
             * Define el valor de la propiedad nuevoCapital.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setNuevoCapital(BigDecimal value) {
                this.nuevoCapital = value;
            }

            /**
             * Obtiene el valor de la propiedad fechaAcuerdo.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFechaAcuerdo() {
                return fechaAcuerdo;
            }

            /**
             * Define el valor de la propiedad fechaAcuerdo.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFechaAcuerdo(String value) {
                this.fechaAcuerdo = value;
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
             * Obtiene el valor de la propiedad empresas.
             * 
             * @return
             *     possible object is
             *     {@link BoletinOficial.FusionSociedades.Fusion.Empresas }
             *     
             */
            public BoletinOficial.FusionSociedades.Fusion.Empresas getEmpresas() {
                return empresas;
            }

            /**
             * Define el valor de la propiedad empresas.
             * 
             * @param value
             *     allowed object is
             *     {@link BoletinOficial.FusionSociedades.Fusion.Empresas }
             *     
             */
            public void setEmpresas(BoletinOficial.FusionSociedades.Fusion.Empresas value) {
                this.empresas = value;
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
             *         &lt;element name="Empresa" maxOccurs="unbounded"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="TipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="NumeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="Nombres" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
                "empresa"
            })
            public static class Empresas {

                @XmlElement(name = "Empresa", required = true)
                protected List<BoletinOficial.FusionSociedades.Fusion.Empresas.Empresa> empresa;

                /**
                 * Gets the value of the empresa property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the empresa property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getEmpresa().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link BoletinOficial.FusionSociedades.Fusion.Empresas.Empresa }
                 * 
                 * 
                 */
                public List<BoletinOficial.FusionSociedades.Fusion.Empresas.Empresa> getEmpresa() {
                    if (empresa == null) {
                        empresa = new ArrayList<BoletinOficial.FusionSociedades.Fusion.Empresas.Empresa>();
                    }
                    return this.empresa;
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
                 *         &lt;element name="NumeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="Nombres" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
                    "nombres",
                    "tipo"
                })
                public static class Empresa {

                    @XmlElement(name = "TipoDocumento", required = true)
                    protected String tipoDocumento;
                    @XmlElement(name = "NumeroDocumento", required = true)
                    protected String numeroDocumento;
                    @XmlElement(name = "Nombres", required = true)
                    protected String nombres;
                    @XmlElement(name = "Tipo", required = true)
                    protected String tipo;

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
     *         &lt;element name="Obligacion" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Motivo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="Divisa" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="Monto" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                   &lt;element name="Juzgado" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="FechaResolucion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="FechaPublicacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="Acreedores"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Acreedor" maxOccurs="unbounded"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="TipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="NumeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="Nombres" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
     *                   &lt;element name="Deudores"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Deudor" maxOccurs="unbounded"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="TipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="NumeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="Nombres" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "obligacion"
    })
    public static class ObligacionDarDinero {

        @XmlElement(name = "Obligacion", required = true)
        protected List<BoletinOficial.ObligacionDarDinero.Obligacion> obligacion;

        /**
         * Gets the value of the obligacion property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the obligacion property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getObligacion().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BoletinOficial.ObligacionDarDinero.Obligacion }
         * 
         * 
         */
        public List<BoletinOficial.ObligacionDarDinero.Obligacion> getObligacion() {
            if (obligacion == null) {
                obligacion = new ArrayList<BoletinOficial.ObligacionDarDinero.Obligacion>();
            }
            return this.obligacion;
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
         *         &lt;element name="Motivo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="Divisa" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="Monto" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *         &lt;element name="Juzgado" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="FechaResolucion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="FechaPublicacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="Acreedores"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Acreedor" maxOccurs="unbounded"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="TipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="NumeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="Nombres" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
         *         &lt;element name="Deudores"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Deudor" maxOccurs="unbounded"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="TipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="NumeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="Nombres" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
            "motivo",
            "divisa",
            "monto",
            "juzgado",
            "fechaResolucion",
            "fechaPublicacion",
            "acreedores",
            "deudores"
        })
        public static class Obligacion {

            @XmlElement(name = "Motivo", required = true)
            protected String motivo;
            @XmlElement(name = "Divisa", required = true)
            protected String divisa;
            @XmlElement(name = "Monto", required = true)
            protected BigDecimal monto;
            @XmlElement(name = "Juzgado", required = true)
            protected String juzgado;
            @XmlElement(name = "FechaResolucion", required = true)
            protected String fechaResolucion;
            @XmlElement(name = "FechaPublicacion", required = true)
            protected String fechaPublicacion;
            @XmlElement(name = "Acreedores", required = true)
            protected BoletinOficial.ObligacionDarDinero.Obligacion.Acreedores acreedores;
            @XmlElement(name = "Deudores", required = true)
            protected BoletinOficial.ObligacionDarDinero.Obligacion.Deudores deudores;

            /**
             * Obtiene el valor de la propiedad motivo.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMotivo() {
                return motivo;
            }

            /**
             * Define el valor de la propiedad motivo.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMotivo(String value) {
                this.motivo = value;
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
             * Obtiene el valor de la propiedad juzgado.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getJuzgado() {
                return juzgado;
            }

            /**
             * Define el valor de la propiedad juzgado.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setJuzgado(String value) {
                this.juzgado = value;
            }

            /**
             * Obtiene el valor de la propiedad fechaResolucion.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFechaResolucion() {
                return fechaResolucion;
            }

            /**
             * Define el valor de la propiedad fechaResolucion.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFechaResolucion(String value) {
                this.fechaResolucion = value;
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
             * Obtiene el valor de la propiedad acreedores.
             * 
             * @return
             *     possible object is
             *     {@link BoletinOficial.ObligacionDarDinero.Obligacion.Acreedores }
             *     
             */
            public BoletinOficial.ObligacionDarDinero.Obligacion.Acreedores getAcreedores() {
                return acreedores;
            }

            /**
             * Define el valor de la propiedad acreedores.
             * 
             * @param value
             *     allowed object is
             *     {@link BoletinOficial.ObligacionDarDinero.Obligacion.Acreedores }
             *     
             */
            public void setAcreedores(BoletinOficial.ObligacionDarDinero.Obligacion.Acreedores value) {
                this.acreedores = value;
            }

            /**
             * Obtiene el valor de la propiedad deudores.
             * 
             * @return
             *     possible object is
             *     {@link BoletinOficial.ObligacionDarDinero.Obligacion.Deudores }
             *     
             */
            public BoletinOficial.ObligacionDarDinero.Obligacion.Deudores getDeudores() {
                return deudores;
            }

            /**
             * Define el valor de la propiedad deudores.
             * 
             * @param value
             *     allowed object is
             *     {@link BoletinOficial.ObligacionDarDinero.Obligacion.Deudores }
             *     
             */
            public void setDeudores(BoletinOficial.ObligacionDarDinero.Obligacion.Deudores value) {
                this.deudores = value;
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
             *         &lt;element name="Acreedor" maxOccurs="unbounded"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="TipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="NumeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="Nombres" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
                "acreedor"
            })
            public static class Acreedores {

                @XmlElement(name = "Acreedor", required = true)
                protected List<BoletinOficial.ObligacionDarDinero.Obligacion.Acreedores.Acreedor> acreedor;

                /**
                 * Gets the value of the acreedor property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the acreedor property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getAcreedor().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link BoletinOficial.ObligacionDarDinero.Obligacion.Acreedores.Acreedor }
                 * 
                 * 
                 */
                public List<BoletinOficial.ObligacionDarDinero.Obligacion.Acreedores.Acreedor> getAcreedor() {
                    if (acreedor == null) {
                        acreedor = new ArrayList<BoletinOficial.ObligacionDarDinero.Obligacion.Acreedores.Acreedor>();
                    }
                    return this.acreedor;
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
                 *         &lt;element name="NumeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="Nombres" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
                    "nombres",
                    "tipo"
                })
                public static class Acreedor {

                    @XmlElement(name = "TipoDocumento", required = true)
                    protected String tipoDocumento;
                    @XmlElement(name = "NumeroDocumento", required = true)
                    protected String numeroDocumento;
                    @XmlElement(name = "Nombres", required = true)
                    protected String nombres;
                    @XmlElement(name = "Tipo", required = true)
                    protected String tipo;

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
             *         &lt;element name="Deudor" maxOccurs="unbounded"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="TipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="NumeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="Nombres" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
                "deudor"
            })
            public static class Deudores {

                @XmlElement(name = "Deudor", required = true)
                protected List<BoletinOficial.ObligacionDarDinero.Obligacion.Deudores.Deudor> deudor;

                /**
                 * Gets the value of the deudor property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the deudor property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getDeudor().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link BoletinOficial.ObligacionDarDinero.Obligacion.Deudores.Deudor }
                 * 
                 * 
                 */
                public List<BoletinOficial.ObligacionDarDinero.Obligacion.Deudores.Deudor> getDeudor() {
                    if (deudor == null) {
                        deudor = new ArrayList<BoletinOficial.ObligacionDarDinero.Obligacion.Deudores.Deudor>();
                    }
                    return this.deudor;
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
                 *         &lt;element name="NumeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="Nombres" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
                    "nombres",
                    "tipo"
                })
                public static class Deudor {

                    @XmlElement(name = "TipoDocumento", required = true)
                    protected String tipoDocumento;
                    @XmlElement(name = "NumeroDocumento", required = true)
                    protected String numeroDocumento;
                    @XmlElement(name = "Nombres", required = true)
                    protected String nombres;
                    @XmlElement(name = "Tipo", required = true)
                    protected String tipo;

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
     *         &lt;element name="RemateInmueble" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="NumeroExpediente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NumeroRemate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="Motivo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="Juzgado" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="EncargoDe" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="Divisa" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="MontoTasacion" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                   &lt;element name="MontoBase" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                   &lt;element name="FechaPublicacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="Ubigeo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="FechaRemate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="HoraRemate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="Demandantes"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Demandante" maxOccurs="unbounded"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="TipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="NumeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="Nombres" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
     *                   &lt;element name="Demandados"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Demandado" maxOccurs="unbounded"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="TipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="NumeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="Nombres" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
     *                   &lt;element name="Muebles"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Mueble" maxOccurs="unbounded"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="RegistroPublico" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="PartidaElectronica" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="Ubigeo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="Caracteristica" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="MontoTasacion" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                                       &lt;element name="MontoBase" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
     *                   &lt;element name="Inmuebles"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Inmueble" maxOccurs="unbounded"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="RegistroPublico" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="PartidaElectronica" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="Ubigeo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="Caracteristica" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="MontoTasacion" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                                       &lt;element name="MontoBase" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
     *                   &lt;element name="Mercaderias"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Mercaderia" maxOccurs="unbounded"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="RegistroPublico" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="PartidaElectronica" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="Ubigeo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="Caracteristica" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="MontoTasacion" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                                       &lt;element name="MontoBase" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
        "remateInmueble"
    })
    public static class RematesBienesInmuebles {

        @XmlElement(name = "RemateInmueble", required = true)
        protected List<BoletinOficial.RematesBienesInmuebles.RemateInmueble> remateInmueble;

        /**
         * Gets the value of the remateInmueble property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the remateInmueble property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRemateInmueble().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BoletinOficial.RematesBienesInmuebles.RemateInmueble }
         * 
         * 
         */
        public List<BoletinOficial.RematesBienesInmuebles.RemateInmueble> getRemateInmueble() {
            if (remateInmueble == null) {
                remateInmueble = new ArrayList<BoletinOficial.RematesBienesInmuebles.RemateInmueble>();
            }
            return this.remateInmueble;
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
         *         &lt;element name="NumeroExpediente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NumeroRemate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="Motivo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="Juzgado" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="EncargoDe" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="Divisa" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="MontoTasacion" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *         &lt;element name="MontoBase" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *         &lt;element name="FechaPublicacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="Ubigeo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="FechaRemate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="HoraRemate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="Demandantes"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Demandante" maxOccurs="unbounded"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="TipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="NumeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="Nombres" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
         *         &lt;element name="Demandados"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Demandado" maxOccurs="unbounded"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="TipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="NumeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="Nombres" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
         *         &lt;element name="Muebles"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Mueble" maxOccurs="unbounded"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="RegistroPublico" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="PartidaElectronica" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="Ubigeo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="Caracteristica" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="MontoTasacion" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *                             &lt;element name="MontoBase" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
         *         &lt;element name="Inmuebles"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Inmueble" maxOccurs="unbounded"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="RegistroPublico" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="PartidaElectronica" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="Ubigeo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="Caracteristica" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="MontoTasacion" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *                             &lt;element name="MontoBase" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
         *         &lt;element name="Mercaderias"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Mercaderia" maxOccurs="unbounded"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="RegistroPublico" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="PartidaElectronica" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="Ubigeo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="Caracteristica" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="MontoTasacion" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *                             &lt;element name="MontoBase" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
            "numeroExpediente",
            "numeroRemate",
            "motivo",
            "juzgado",
            "encargoDe",
            "divisa",
            "montoTasacion",
            "montoBase",
            "fechaPublicacion",
            "ubigeo",
            "direccion",
            "fechaRemate",
            "horaRemate",
            "demandantes",
            "demandados",
            "muebles",
            "inmuebles",
            "mercaderias"
        })
        public static class RemateInmueble {

            @XmlElement(name = "NumeroExpediente")
            protected String numeroExpediente;
            @XmlElement(name = "NumeroRemate")
            protected String numeroRemate;
            @XmlElement(name = "Motivo", required = true)
            protected String motivo;
            @XmlElement(name = "Juzgado", required = true)
            protected String juzgado;
            @XmlElement(name = "EncargoDe", required = true)
            protected String encargoDe;
            @XmlElement(name = "Divisa", required = true)
            protected String divisa;
            @XmlElement(name = "MontoTasacion")
            protected BigDecimal montoTasacion;
            @XmlElement(name = "MontoBase")
            protected BigDecimal montoBase;
            @XmlElement(name = "FechaPublicacion", required = true)
            protected String fechaPublicacion;
            @XmlElement(name = "Ubigeo", required = true)
            protected String ubigeo;
            @XmlElement(name = "Direccion", required = true)
            protected String direccion;
            @XmlElement(name = "FechaRemate", required = true)
            protected String fechaRemate;
            @XmlElement(name = "HoraRemate", required = true)
            protected String horaRemate;
            @XmlElement(name = "Demandantes", required = true)
            protected BoletinOficial.RematesBienesInmuebles.RemateInmueble.Demandantes demandantes;
            @XmlElement(name = "Demandados", required = true)
            protected BoletinOficial.RematesBienesInmuebles.RemateInmueble.Demandados demandados;
            @XmlElement(name = "Muebles", required = true)
            protected BoletinOficial.RematesBienesInmuebles.RemateInmueble.Muebles muebles;
            @XmlElement(name = "Inmuebles", required = true)
            protected BoletinOficial.RematesBienesInmuebles.RemateInmueble.Inmuebles inmuebles;
            @XmlElement(name = "Mercaderias", required = true)
            protected BoletinOficial.RematesBienesInmuebles.RemateInmueble.Mercaderias mercaderias;

            /**
             * Obtiene el valor de la propiedad numeroExpediente.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumeroExpediente() {
                return numeroExpediente;
            }

            /**
             * Define el valor de la propiedad numeroExpediente.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumeroExpediente(String value) {
                this.numeroExpediente = value;
            }

            /**
             * Obtiene el valor de la propiedad numeroRemate.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumeroRemate() {
                return numeroRemate;
            }

            /**
             * Define el valor de la propiedad numeroRemate.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumeroRemate(String value) {
                this.numeroRemate = value;
            }

            /**
             * Obtiene el valor de la propiedad motivo.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMotivo() {
                return motivo;
            }

            /**
             * Define el valor de la propiedad motivo.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMotivo(String value) {
                this.motivo = value;
            }

            /**
             * Obtiene el valor de la propiedad juzgado.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getJuzgado() {
                return juzgado;
            }

            /**
             * Define el valor de la propiedad juzgado.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setJuzgado(String value) {
                this.juzgado = value;
            }

            /**
             * Obtiene el valor de la propiedad encargoDe.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEncargoDe() {
                return encargoDe;
            }

            /**
             * Define el valor de la propiedad encargoDe.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEncargoDe(String value) {
                this.encargoDe = value;
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
             * Obtiene el valor de la propiedad montoTasacion.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getMontoTasacion() {
                return montoTasacion;
            }

            /**
             * Define el valor de la propiedad montoTasacion.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setMontoTasacion(BigDecimal value) {
                this.montoTasacion = value;
            }

            /**
             * Obtiene el valor de la propiedad montoBase.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getMontoBase() {
                return montoBase;
            }

            /**
             * Define el valor de la propiedad montoBase.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setMontoBase(BigDecimal value) {
                this.montoBase = value;
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
             * Obtiene el valor de la propiedad ubigeo.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUbigeo() {
                return ubigeo;
            }

            /**
             * Define el valor de la propiedad ubigeo.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUbigeo(String value) {
                this.ubigeo = value;
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
             * Obtiene el valor de la propiedad fechaRemate.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFechaRemate() {
                return fechaRemate;
            }

            /**
             * Define el valor de la propiedad fechaRemate.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFechaRemate(String value) {
                this.fechaRemate = value;
            }

            /**
             * Obtiene el valor de la propiedad horaRemate.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getHoraRemate() {
                return horaRemate;
            }

            /**
             * Define el valor de la propiedad horaRemate.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setHoraRemate(String value) {
                this.horaRemate = value;
            }

            /**
             * Obtiene el valor de la propiedad demandantes.
             * 
             * @return
             *     possible object is
             *     {@link BoletinOficial.RematesBienesInmuebles.RemateInmueble.Demandantes }
             *     
             */
            public BoletinOficial.RematesBienesInmuebles.RemateInmueble.Demandantes getDemandantes() {
                return demandantes;
            }

            /**
             * Define el valor de la propiedad demandantes.
             * 
             * @param value
             *     allowed object is
             *     {@link BoletinOficial.RematesBienesInmuebles.RemateInmueble.Demandantes }
             *     
             */
            public void setDemandantes(BoletinOficial.RematesBienesInmuebles.RemateInmueble.Demandantes value) {
                this.demandantes = value;
            }

            /**
             * Obtiene el valor de la propiedad demandados.
             * 
             * @return
             *     possible object is
             *     {@link BoletinOficial.RematesBienesInmuebles.RemateInmueble.Demandados }
             *     
             */
            public BoletinOficial.RematesBienesInmuebles.RemateInmueble.Demandados getDemandados() {
                return demandados;
            }

            /**
             * Define el valor de la propiedad demandados.
             * 
             * @param value
             *     allowed object is
             *     {@link BoletinOficial.RematesBienesInmuebles.RemateInmueble.Demandados }
             *     
             */
            public void setDemandados(BoletinOficial.RematesBienesInmuebles.RemateInmueble.Demandados value) {
                this.demandados = value;
            }

            /**
             * Obtiene el valor de la propiedad muebles.
             * 
             * @return
             *     possible object is
             *     {@link BoletinOficial.RematesBienesInmuebles.RemateInmueble.Muebles }
             *     
             */
            public BoletinOficial.RematesBienesInmuebles.RemateInmueble.Muebles getMuebles() {
                return muebles;
            }

            /**
             * Define el valor de la propiedad muebles.
             * 
             * @param value
             *     allowed object is
             *     {@link BoletinOficial.RematesBienesInmuebles.RemateInmueble.Muebles }
             *     
             */
            public void setMuebles(BoletinOficial.RematesBienesInmuebles.RemateInmueble.Muebles value) {
                this.muebles = value;
            }

            /**
             * Obtiene el valor de la propiedad inmuebles.
             * 
             * @return
             *     possible object is
             *     {@link BoletinOficial.RematesBienesInmuebles.RemateInmueble.Inmuebles }
             *     
             */
            public BoletinOficial.RematesBienesInmuebles.RemateInmueble.Inmuebles getInmuebles() {
                return inmuebles;
            }

            /**
             * Define el valor de la propiedad inmuebles.
             * 
             * @param value
             *     allowed object is
             *     {@link BoletinOficial.RematesBienesInmuebles.RemateInmueble.Inmuebles }
             *     
             */
            public void setInmuebles(BoletinOficial.RematesBienesInmuebles.RemateInmueble.Inmuebles value) {
                this.inmuebles = value;
            }

            /**
             * Obtiene el valor de la propiedad mercaderias.
             * 
             * @return
             *     possible object is
             *     {@link BoletinOficial.RematesBienesInmuebles.RemateInmueble.Mercaderias }
             *     
             */
            public BoletinOficial.RematesBienesInmuebles.RemateInmueble.Mercaderias getMercaderias() {
                return mercaderias;
            }

            /**
             * Define el valor de la propiedad mercaderias.
             * 
             * @param value
             *     allowed object is
             *     {@link BoletinOficial.RematesBienesInmuebles.RemateInmueble.Mercaderias }
             *     
             */
            public void setMercaderias(BoletinOficial.RematesBienesInmuebles.RemateInmueble.Mercaderias value) {
                this.mercaderias = value;
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
             *         &lt;element name="Demandado" maxOccurs="unbounded"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="TipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="NumeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="Nombres" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
                "demandado"
            })
            public static class Demandados {

                @XmlElement(name = "Demandado", required = true)
                protected List<BoletinOficial.RematesBienesInmuebles.RemateInmueble.Demandados.Demandado> demandado;

                /**
                 * Gets the value of the demandado property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the demandado property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getDemandado().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link BoletinOficial.RematesBienesInmuebles.RemateInmueble.Demandados.Demandado }
                 * 
                 * 
                 */
                public List<BoletinOficial.RematesBienesInmuebles.RemateInmueble.Demandados.Demandado> getDemandado() {
                    if (demandado == null) {
                        demandado = new ArrayList<BoletinOficial.RematesBienesInmuebles.RemateInmueble.Demandados.Demandado>();
                    }
                    return this.demandado;
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
                 *         &lt;element name="NumeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="Nombres" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
                    "nombres",
                    "tipo"
                })
                public static class Demandado {

                    @XmlElement(name = "TipoDocumento", required = true)
                    protected String tipoDocumento;
                    @XmlElement(name = "NumeroDocumento", required = true)
                    protected String numeroDocumento;
                    @XmlElement(name = "Nombres", required = true)
                    protected String nombres;
                    @XmlElement(name = "Tipo", required = true)
                    protected String tipo;

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
             *         &lt;element name="Demandante" maxOccurs="unbounded"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="TipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="NumeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="Nombres" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
                "demandante"
            })
            public static class Demandantes {

                @XmlElement(name = "Demandante", required = true)
                protected List<BoletinOficial.RematesBienesInmuebles.RemateInmueble.Demandantes.Demandante> demandante;

                /**
                 * Gets the value of the demandante property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the demandante property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getDemandante().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link BoletinOficial.RematesBienesInmuebles.RemateInmueble.Demandantes.Demandante }
                 * 
                 * 
                 */
                public List<BoletinOficial.RematesBienesInmuebles.RemateInmueble.Demandantes.Demandante> getDemandante() {
                    if (demandante == null) {
                        demandante = new ArrayList<BoletinOficial.RematesBienesInmuebles.RemateInmueble.Demandantes.Demandante>();
                    }
                    return this.demandante;
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
                 *         &lt;element name="NumeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="Nombres" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
                    "nombres",
                    "tipo"
                })
                public static class Demandante {

                    @XmlElement(name = "TipoDocumento", required = true)
                    protected String tipoDocumento;
                    @XmlElement(name = "NumeroDocumento", required = true)
                    protected String numeroDocumento;
                    @XmlElement(name = "Nombres", required = true)
                    protected String nombres;
                    @XmlElement(name = "Tipo", required = true)
                    protected String tipo;

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
             *         &lt;element name="Inmueble" maxOccurs="unbounded"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="RegistroPublico" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="PartidaElectronica" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="Ubigeo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="Caracteristica" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="MontoTasacion" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
             *                   &lt;element name="MontoBase" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
                "inmueble"
            })
            public static class Inmuebles {

                @XmlElement(name = "Inmueble", required = true)
                protected List<BoletinOficial.RematesBienesInmuebles.RemateInmueble.Inmuebles.Inmueble> inmueble;

                /**
                 * Gets the value of the inmueble property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the inmueble property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getInmueble().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link BoletinOficial.RematesBienesInmuebles.RemateInmueble.Inmuebles.Inmueble }
                 * 
                 * 
                 */
                public List<BoletinOficial.RematesBienesInmuebles.RemateInmueble.Inmuebles.Inmueble> getInmueble() {
                    if (inmueble == null) {
                        inmueble = new ArrayList<BoletinOficial.RematesBienesInmuebles.RemateInmueble.Inmuebles.Inmueble>();
                    }
                    return this.inmueble;
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
                 *         &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="RegistroPublico" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="PartidaElectronica" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="Ubigeo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="Caracteristica" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="MontoTasacion" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
                 *         &lt;element name="MontoBase" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
                    "tipo",
                    "numero",
                    "registroPublico",
                    "partidaElectronica",
                    "direccion",
                    "ubigeo",
                    "caracteristica",
                    "montoTasacion",
                    "montoBase"
                })
                public static class Inmueble {

                    @XmlElement(name = "Tipo", required = true)
                    protected String tipo;
                    @XmlElement(name = "Numero", required = true)
                    protected String numero;
                    @XmlElement(name = "RegistroPublico", required = true)
                    protected String registroPublico;
                    @XmlElement(name = "PartidaElectronica", required = true)
                    protected String partidaElectronica;
                    @XmlElement(name = "Direccion", required = true)
                    protected String direccion;
                    @XmlElement(name = "Ubigeo", required = true)
                    protected String ubigeo;
                    @XmlElement(name = "Caracteristica", required = true)
                    protected String caracteristica;
                    @XmlElement(name = "MontoTasacion")
                    protected BigDecimal montoTasacion;
                    @XmlElement(name = "MontoBase")
                    protected BigDecimal montoBase;

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
                     * Obtiene el valor de la propiedad numero.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNumero() {
                        return numero;
                    }

                    /**
                     * Define el valor de la propiedad numero.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNumero(String value) {
                        this.numero = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad registroPublico.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getRegistroPublico() {
                        return registroPublico;
                    }

                    /**
                     * Define el valor de la propiedad registroPublico.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setRegistroPublico(String value) {
                        this.registroPublico = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad partidaElectronica.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPartidaElectronica() {
                        return partidaElectronica;
                    }

                    /**
                     * Define el valor de la propiedad partidaElectronica.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPartidaElectronica(String value) {
                        this.partidaElectronica = value;
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
                     * Obtiene el valor de la propiedad ubigeo.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getUbigeo() {
                        return ubigeo;
                    }

                    /**
                     * Define el valor de la propiedad ubigeo.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setUbigeo(String value) {
                        this.ubigeo = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad caracteristica.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCaracteristica() {
                        return caracteristica;
                    }

                    /**
                     * Define el valor de la propiedad caracteristica.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCaracteristica(String value) {
                        this.caracteristica = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad montoTasacion.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getMontoTasacion() {
                        return montoTasacion;
                    }

                    /**
                     * Define el valor de la propiedad montoTasacion.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setMontoTasacion(BigDecimal value) {
                        this.montoTasacion = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad montoBase.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getMontoBase() {
                        return montoBase;
                    }

                    /**
                     * Define el valor de la propiedad montoBase.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setMontoBase(BigDecimal value) {
                        this.montoBase = value;
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
             *         &lt;element name="Mercaderia" maxOccurs="unbounded"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="RegistroPublico" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="PartidaElectronica" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="Ubigeo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="Caracteristica" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="MontoTasacion" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
             *                   &lt;element name="MontoBase" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
                "mercaderia"
            })
            public static class Mercaderias {

                @XmlElement(name = "Mercaderia", required = true)
                protected List<BoletinOficial.RematesBienesInmuebles.RemateInmueble.Mercaderias.Mercaderia> mercaderia;

                /**
                 * Gets the value of the mercaderia property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the mercaderia property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getMercaderia().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link BoletinOficial.RematesBienesInmuebles.RemateInmueble.Mercaderias.Mercaderia }
                 * 
                 * 
                 */
                public List<BoletinOficial.RematesBienesInmuebles.RemateInmueble.Mercaderias.Mercaderia> getMercaderia() {
                    if (mercaderia == null) {
                        mercaderia = new ArrayList<BoletinOficial.RematesBienesInmuebles.RemateInmueble.Mercaderias.Mercaderia>();
                    }
                    return this.mercaderia;
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
                 *         &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="RegistroPublico" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="PartidaElectronica" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="Ubigeo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="Caracteristica" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="MontoTasacion" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
                 *         &lt;element name="MontoBase" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
                    "tipo",
                    "numero",
                    "registroPublico",
                    "partidaElectronica",
                    "direccion",
                    "ubigeo",
                    "caracteristica",
                    "montoTasacion",
                    "montoBase"
                })
                public static class Mercaderia {

                    @XmlElement(name = "Tipo", required = true)
                    protected String tipo;
                    @XmlElement(name = "Numero", required = true)
                    protected String numero;
                    @XmlElement(name = "RegistroPublico", required = true)
                    protected String registroPublico;
                    @XmlElement(name = "PartidaElectronica", required = true)
                    protected String partidaElectronica;
                    @XmlElement(name = "Direccion", required = true)
                    protected String direccion;
                    @XmlElement(name = "Ubigeo", required = true)
                    protected String ubigeo;
                    @XmlElement(name = "Caracteristica", required = true)
                    protected String caracteristica;
                    @XmlElement(name = "MontoTasacion")
                    protected BigDecimal montoTasacion;
                    @XmlElement(name = "MontoBase")
                    protected BigDecimal montoBase;

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
                     * Obtiene el valor de la propiedad numero.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNumero() {
                        return numero;
                    }

                    /**
                     * Define el valor de la propiedad numero.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNumero(String value) {
                        this.numero = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad registroPublico.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getRegistroPublico() {
                        return registroPublico;
                    }

                    /**
                     * Define el valor de la propiedad registroPublico.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setRegistroPublico(String value) {
                        this.registroPublico = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad partidaElectronica.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPartidaElectronica() {
                        return partidaElectronica;
                    }

                    /**
                     * Define el valor de la propiedad partidaElectronica.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPartidaElectronica(String value) {
                        this.partidaElectronica = value;
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
                     * Obtiene el valor de la propiedad ubigeo.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getUbigeo() {
                        return ubigeo;
                    }

                    /**
                     * Define el valor de la propiedad ubigeo.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setUbigeo(String value) {
                        this.ubigeo = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad caracteristica.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCaracteristica() {
                        return caracteristica;
                    }

                    /**
                     * Define el valor de la propiedad caracteristica.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCaracteristica(String value) {
                        this.caracteristica = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad montoTasacion.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getMontoTasacion() {
                        return montoTasacion;
                    }

                    /**
                     * Define el valor de la propiedad montoTasacion.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setMontoTasacion(BigDecimal value) {
                        this.montoTasacion = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad montoBase.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getMontoBase() {
                        return montoBase;
                    }

                    /**
                     * Define el valor de la propiedad montoBase.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setMontoBase(BigDecimal value) {
                        this.montoBase = value;
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
             *         &lt;element name="Mueble" maxOccurs="unbounded"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="RegistroPublico" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="PartidaElectronica" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="Ubigeo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="Caracteristica" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="MontoTasacion" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
             *                   &lt;element name="MontoBase" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
                "mueble"
            })
            public static class Muebles {

                @XmlElement(name = "Mueble", required = true)
                protected List<BoletinOficial.RematesBienesInmuebles.RemateInmueble.Muebles.Mueble> mueble;

                /**
                 * Gets the value of the mueble property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the mueble property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getMueble().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link BoletinOficial.RematesBienesInmuebles.RemateInmueble.Muebles.Mueble }
                 * 
                 * 
                 */
                public List<BoletinOficial.RematesBienesInmuebles.RemateInmueble.Muebles.Mueble> getMueble() {
                    if (mueble == null) {
                        mueble = new ArrayList<BoletinOficial.RematesBienesInmuebles.RemateInmueble.Muebles.Mueble>();
                    }
                    return this.mueble;
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
                 *         &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="RegistroPublico" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="PartidaElectronica" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="Ubigeo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="Caracteristica" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="MontoTasacion" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
                 *         &lt;element name="MontoBase" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
                    "tipo",
                    "numero",
                    "registroPublico",
                    "partidaElectronica",
                    "direccion",
                    "ubigeo",
                    "caracteristica",
                    "montoTasacion",
                    "montoBase"
                })
                public static class Mueble {

                    @XmlElement(name = "Tipo", required = true)
                    protected String tipo;
                    @XmlElement(name = "Numero", required = true)
                    protected String numero;
                    @XmlElement(name = "RegistroPublico", required = true)
                    protected String registroPublico;
                    @XmlElement(name = "PartidaElectronica", required = true)
                    protected String partidaElectronica;
                    @XmlElement(name = "Direccion", required = true)
                    protected String direccion;
                    @XmlElement(name = "Ubigeo", required = true)
                    protected String ubigeo;
                    @XmlElement(name = "Caracteristica", required = true)
                    protected String caracteristica;
                    @XmlElement(name = "MontoTasacion")
                    protected BigDecimal montoTasacion;
                    @XmlElement(name = "MontoBase")
                    protected BigDecimal montoBase;

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
                     * Obtiene el valor de la propiedad numero.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNumero() {
                        return numero;
                    }

                    /**
                     * Define el valor de la propiedad numero.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNumero(String value) {
                        this.numero = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad registroPublico.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getRegistroPublico() {
                        return registroPublico;
                    }

                    /**
                     * Define el valor de la propiedad registroPublico.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setRegistroPublico(String value) {
                        this.registroPublico = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad partidaElectronica.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPartidaElectronica() {
                        return partidaElectronica;
                    }

                    /**
                     * Define el valor de la propiedad partidaElectronica.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPartidaElectronica(String value) {
                        this.partidaElectronica = value;
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
                     * Obtiene el valor de la propiedad ubigeo.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getUbigeo() {
                        return ubigeo;
                    }

                    /**
                     * Define el valor de la propiedad ubigeo.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setUbigeo(String value) {
                        this.ubigeo = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad caracteristica.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCaracteristica() {
                        return caracteristica;
                    }

                    /**
                     * Define el valor de la propiedad caracteristica.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCaracteristica(String value) {
                        this.caracteristica = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad montoTasacion.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getMontoTasacion() {
                        return montoTasacion;
                    }

                    /**
                     * Define el valor de la propiedad montoTasacion.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setMontoTasacion(BigDecimal value) {
                        this.montoTasacion = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad montoBase.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getMontoBase() {
                        return montoBase;
                    }

                    /**
                     * Define el valor de la propiedad montoBase.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setMontoBase(BigDecimal value) {
                        this.montoBase = value;
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
     *         &lt;element name="RemateMueble" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="NumeroExpediente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NumeroRemate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="Motivo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="Juzgado" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="EncargoDe" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="Divisa" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="MontoTasacion" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                   &lt;element name="MontoBase" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                   &lt;element name="FechaPublicacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="Ubigeo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="FechaRemate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="HoraRemate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="Demandantes"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Demandante" maxOccurs="unbounded"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="TipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="NumeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="Nombres" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
     *                   &lt;element name="Demandados"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Demandado" maxOccurs="unbounded"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="TipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="NumeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="Nombres" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
     *                   &lt;element name="Muebles"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Mueble" maxOccurs="unbounded"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="RegistroPublico" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="PartidaElectronica" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="Ubigeo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="Caracteristica" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="MontoTasacion" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                                       &lt;element name="MontoBase" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
     *                   &lt;element name="Inmuebles"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Inmueble" maxOccurs="unbounded"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="RegistroPublico" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="PartidaElectronica" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="Ubigeo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="Caracteristica" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="MontoTasacion" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                                       &lt;element name="MontoBase" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
     *                   &lt;element name="Mercaderias"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Mercaderia" maxOccurs="unbounded"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="RegistroPublico" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="PartidaElectronica" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="Ubigeo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="Caracteristica" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="MontoTasacion" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                                       &lt;element name="MontoBase" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
        "remateMueble"
    })
    public static class RematesBienesMuebles {

        @XmlElement(name = "RemateMueble", required = true)
        protected List<BoletinOficial.RematesBienesMuebles.RemateMueble> remateMueble;

        /**
         * Gets the value of the remateMueble property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the remateMueble property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRemateMueble().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BoletinOficial.RematesBienesMuebles.RemateMueble }
         * 
         * 
         */
        public List<BoletinOficial.RematesBienesMuebles.RemateMueble> getRemateMueble() {
            if (remateMueble == null) {
                remateMueble = new ArrayList<BoletinOficial.RematesBienesMuebles.RemateMueble>();
            }
            return this.remateMueble;
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
         *         &lt;element name="NumeroExpediente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NumeroRemate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="Motivo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="Juzgado" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="EncargoDe" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="Divisa" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="MontoTasacion" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *         &lt;element name="MontoBase" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *         &lt;element name="FechaPublicacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="Ubigeo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="FechaRemate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="HoraRemate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="Demandantes"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Demandante" maxOccurs="unbounded"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="TipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="NumeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="Nombres" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
         *         &lt;element name="Demandados"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Demandado" maxOccurs="unbounded"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="TipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="NumeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="Nombres" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
         *         &lt;element name="Muebles"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Mueble" maxOccurs="unbounded"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="RegistroPublico" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="PartidaElectronica" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="Ubigeo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="Caracteristica" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="MontoTasacion" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *                             &lt;element name="MontoBase" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
         *         &lt;element name="Inmuebles"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Inmueble" maxOccurs="unbounded"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="RegistroPublico" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="PartidaElectronica" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="Ubigeo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="Caracteristica" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="MontoTasacion" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *                             &lt;element name="MontoBase" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
         *         &lt;element name="Mercaderias"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Mercaderia" maxOccurs="unbounded"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="RegistroPublico" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="PartidaElectronica" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="Ubigeo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="Caracteristica" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="MontoTasacion" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *                             &lt;element name="MontoBase" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
            "numeroExpediente",
            "numeroRemate",
            "motivo",
            "juzgado",
            "encargoDe",
            "divisa",
            "montoTasacion",
            "montoBase",
            "fechaPublicacion",
            "ubigeo",
            "direccion",
            "fechaRemate",
            "horaRemate",
            "demandantes",
            "demandados",
            "muebles",
            "inmuebles",
            "mercaderias"
        })
        public static class RemateMueble {

            @XmlElement(name = "NumeroExpediente")
            protected String numeroExpediente;
            @XmlElement(name = "NumeroRemate")
            protected String numeroRemate;
            @XmlElement(name = "Motivo", required = true)
            protected String motivo;
            @XmlElement(name = "Juzgado", required = true)
            protected String juzgado;
            @XmlElement(name = "EncargoDe", required = true)
            protected String encargoDe;
            @XmlElement(name = "Divisa", required = true)
            protected String divisa;
            @XmlElement(name = "MontoTasacion")
            protected BigDecimal montoTasacion;
            @XmlElement(name = "MontoBase")
            protected BigDecimal montoBase;
            @XmlElement(name = "FechaPublicacion", required = true)
            protected String fechaPublicacion;
            @XmlElement(name = "Ubigeo", required = true)
            protected String ubigeo;
            @XmlElement(name = "Direccion", required = true)
            protected String direccion;
            @XmlElement(name = "FechaRemate", required = true)
            protected String fechaRemate;
            @XmlElement(name = "HoraRemate", required = true)
            protected String horaRemate;
            @XmlElement(name = "Demandantes", required = true)
            protected BoletinOficial.RematesBienesMuebles.RemateMueble.Demandantes demandantes;
            @XmlElement(name = "Demandados", required = true)
            protected BoletinOficial.RematesBienesMuebles.RemateMueble.Demandados demandados;
            @XmlElement(name = "Muebles", required = true)
            protected BoletinOficial.RematesBienesMuebles.RemateMueble.Muebles muebles;
            @XmlElement(name = "Inmuebles", required = true)
            protected BoletinOficial.RematesBienesMuebles.RemateMueble.Inmuebles inmuebles;
            @XmlElement(name = "Mercaderias", required = true)
            protected BoletinOficial.RematesBienesMuebles.RemateMueble.Mercaderias mercaderias;

            /**
             * Obtiene el valor de la propiedad numeroExpediente.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumeroExpediente() {
                return numeroExpediente;
            }

            /**
             * Define el valor de la propiedad numeroExpediente.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumeroExpediente(String value) {
                this.numeroExpediente = value;
            }

            /**
             * Obtiene el valor de la propiedad numeroRemate.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumeroRemate() {
                return numeroRemate;
            }

            /**
             * Define el valor de la propiedad numeroRemate.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumeroRemate(String value) {
                this.numeroRemate = value;
            }

            /**
             * Obtiene el valor de la propiedad motivo.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMotivo() {
                return motivo;
            }

            /**
             * Define el valor de la propiedad motivo.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMotivo(String value) {
                this.motivo = value;
            }

            /**
             * Obtiene el valor de la propiedad juzgado.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getJuzgado() {
                return juzgado;
            }

            /**
             * Define el valor de la propiedad juzgado.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setJuzgado(String value) {
                this.juzgado = value;
            }

            /**
             * Obtiene el valor de la propiedad encargoDe.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEncargoDe() {
                return encargoDe;
            }

            /**
             * Define el valor de la propiedad encargoDe.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEncargoDe(String value) {
                this.encargoDe = value;
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
             * Obtiene el valor de la propiedad montoTasacion.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getMontoTasacion() {
                return montoTasacion;
            }

            /**
             * Define el valor de la propiedad montoTasacion.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setMontoTasacion(BigDecimal value) {
                this.montoTasacion = value;
            }

            /**
             * Obtiene el valor de la propiedad montoBase.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getMontoBase() {
                return montoBase;
            }

            /**
             * Define el valor de la propiedad montoBase.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setMontoBase(BigDecimal value) {
                this.montoBase = value;
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
             * Obtiene el valor de la propiedad ubigeo.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUbigeo() {
                return ubigeo;
            }

            /**
             * Define el valor de la propiedad ubigeo.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUbigeo(String value) {
                this.ubigeo = value;
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
             * Obtiene el valor de la propiedad fechaRemate.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFechaRemate() {
                return fechaRemate;
            }

            /**
             * Define el valor de la propiedad fechaRemate.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFechaRemate(String value) {
                this.fechaRemate = value;
            }

            /**
             * Obtiene el valor de la propiedad horaRemate.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getHoraRemate() {
                return horaRemate;
            }

            /**
             * Define el valor de la propiedad horaRemate.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setHoraRemate(String value) {
                this.horaRemate = value;
            }

            /**
             * Obtiene el valor de la propiedad demandantes.
             * 
             * @return
             *     possible object is
             *     {@link BoletinOficial.RematesBienesMuebles.RemateMueble.Demandantes }
             *     
             */
            public BoletinOficial.RematesBienesMuebles.RemateMueble.Demandantes getDemandantes() {
                return demandantes;
            }

            /**
             * Define el valor de la propiedad demandantes.
             * 
             * @param value
             *     allowed object is
             *     {@link BoletinOficial.RematesBienesMuebles.RemateMueble.Demandantes }
             *     
             */
            public void setDemandantes(BoletinOficial.RematesBienesMuebles.RemateMueble.Demandantes value) {
                this.demandantes = value;
            }

            /**
             * Obtiene el valor de la propiedad demandados.
             * 
             * @return
             *     possible object is
             *     {@link BoletinOficial.RematesBienesMuebles.RemateMueble.Demandados }
             *     
             */
            public BoletinOficial.RematesBienesMuebles.RemateMueble.Demandados getDemandados() {
                return demandados;
            }

            /**
             * Define el valor de la propiedad demandados.
             * 
             * @param value
             *     allowed object is
             *     {@link BoletinOficial.RematesBienesMuebles.RemateMueble.Demandados }
             *     
             */
            public void setDemandados(BoletinOficial.RematesBienesMuebles.RemateMueble.Demandados value) {
                this.demandados = value;
            }

            /**
             * Obtiene el valor de la propiedad muebles.
             * 
             * @return
             *     possible object is
             *     {@link BoletinOficial.RematesBienesMuebles.RemateMueble.Muebles }
             *     
             */
            public BoletinOficial.RematesBienesMuebles.RemateMueble.Muebles getMuebles() {
                return muebles;
            }

            /**
             * Define el valor de la propiedad muebles.
             * 
             * @param value
             *     allowed object is
             *     {@link BoletinOficial.RematesBienesMuebles.RemateMueble.Muebles }
             *     
             */
            public void setMuebles(BoletinOficial.RematesBienesMuebles.RemateMueble.Muebles value) {
                this.muebles = value;
            }

            /**
             * Obtiene el valor de la propiedad inmuebles.
             * 
             * @return
             *     possible object is
             *     {@link BoletinOficial.RematesBienesMuebles.RemateMueble.Inmuebles }
             *     
             */
            public BoletinOficial.RematesBienesMuebles.RemateMueble.Inmuebles getInmuebles() {
                return inmuebles;
            }

            /**
             * Define el valor de la propiedad inmuebles.
             * 
             * @param value
             *     allowed object is
             *     {@link BoletinOficial.RematesBienesMuebles.RemateMueble.Inmuebles }
             *     
             */
            public void setInmuebles(BoletinOficial.RematesBienesMuebles.RemateMueble.Inmuebles value) {
                this.inmuebles = value;
            }

            /**
             * Obtiene el valor de la propiedad mercaderias.
             * 
             * @return
             *     possible object is
             *     {@link BoletinOficial.RematesBienesMuebles.RemateMueble.Mercaderias }
             *     
             */
            public BoletinOficial.RematesBienesMuebles.RemateMueble.Mercaderias getMercaderias() {
                return mercaderias;
            }

            /**
             * Define el valor de la propiedad mercaderias.
             * 
             * @param value
             *     allowed object is
             *     {@link BoletinOficial.RematesBienesMuebles.RemateMueble.Mercaderias }
             *     
             */
            public void setMercaderias(BoletinOficial.RematesBienesMuebles.RemateMueble.Mercaderias value) {
                this.mercaderias = value;
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
             *         &lt;element name="Demandado" maxOccurs="unbounded"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="TipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="NumeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="Nombres" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
                "demandado"
            })
            public static class Demandados {

                @XmlElement(name = "Demandado", required = true)
                protected List<BoletinOficial.RematesBienesMuebles.RemateMueble.Demandados.Demandado> demandado;

                /**
                 * Gets the value of the demandado property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the demandado property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getDemandado().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link BoletinOficial.RematesBienesMuebles.RemateMueble.Demandados.Demandado }
                 * 
                 * 
                 */
                public List<BoletinOficial.RematesBienesMuebles.RemateMueble.Demandados.Demandado> getDemandado() {
                    if (demandado == null) {
                        demandado = new ArrayList<BoletinOficial.RematesBienesMuebles.RemateMueble.Demandados.Demandado>();
                    }
                    return this.demandado;
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
                 *         &lt;element name="NumeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="Nombres" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
                    "nombres",
                    "tipo"
                })
                public static class Demandado {

                    @XmlElement(name = "TipoDocumento", required = true)
                    protected String tipoDocumento;
                    @XmlElement(name = "NumeroDocumento", required = true)
                    protected String numeroDocumento;
                    @XmlElement(name = "Nombres", required = true)
                    protected String nombres;
                    @XmlElement(name = "Tipo", required = true)
                    protected String tipo;

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
             *         &lt;element name="Demandante" maxOccurs="unbounded"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="TipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="NumeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="Nombres" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
                "demandante"
            })
            public static class Demandantes {

                @XmlElement(name = "Demandante", required = true)
                protected List<BoletinOficial.RematesBienesMuebles.RemateMueble.Demandantes.Demandante> demandante;

                /**
                 * Gets the value of the demandante property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the demandante property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getDemandante().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link BoletinOficial.RematesBienesMuebles.RemateMueble.Demandantes.Demandante }
                 * 
                 * 
                 */
                public List<BoletinOficial.RematesBienesMuebles.RemateMueble.Demandantes.Demandante> getDemandante() {
                    if (demandante == null) {
                        demandante = new ArrayList<BoletinOficial.RematesBienesMuebles.RemateMueble.Demandantes.Demandante>();
                    }
                    return this.demandante;
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
                 *         &lt;element name="NumeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="Nombres" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
                    "nombres",
                    "tipo"
                })
                public static class Demandante {

                    @XmlElement(name = "TipoDocumento", required = true)
                    protected String tipoDocumento;
                    @XmlElement(name = "NumeroDocumento", required = true)
                    protected String numeroDocumento;
                    @XmlElement(name = "Nombres", required = true)
                    protected String nombres;
                    @XmlElement(name = "Tipo", required = true)
                    protected String tipo;

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
             *         &lt;element name="Inmueble" maxOccurs="unbounded"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="RegistroPublico" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="PartidaElectronica" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="Ubigeo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="Caracteristica" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="MontoTasacion" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
             *                   &lt;element name="MontoBase" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
                "inmueble"
            })
            public static class Inmuebles {

                @XmlElement(name = "Inmueble", required = true)
                protected List<BoletinOficial.RematesBienesMuebles.RemateMueble.Inmuebles.Inmueble> inmueble;

                /**
                 * Gets the value of the inmueble property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the inmueble property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getInmueble().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link BoletinOficial.RematesBienesMuebles.RemateMueble.Inmuebles.Inmueble }
                 * 
                 * 
                 */
                public List<BoletinOficial.RematesBienesMuebles.RemateMueble.Inmuebles.Inmueble> getInmueble() {
                    if (inmueble == null) {
                        inmueble = new ArrayList<BoletinOficial.RematesBienesMuebles.RemateMueble.Inmuebles.Inmueble>();
                    }
                    return this.inmueble;
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
                 *         &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="RegistroPublico" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="PartidaElectronica" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="Ubigeo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="Caracteristica" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="MontoTasacion" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
                 *         &lt;element name="MontoBase" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
                    "tipo",
                    "numero",
                    "registroPublico",
                    "partidaElectronica",
                    "direccion",
                    "ubigeo",
                    "caracteristica",
                    "montoTasacion",
                    "montoBase"
                })
                public static class Inmueble {

                    @XmlElement(name = "Tipo", required = true)
                    protected String tipo;
                    @XmlElement(name = "Numero", required = true)
                    protected String numero;
                    @XmlElement(name = "RegistroPublico", required = true)
                    protected String registroPublico;
                    @XmlElement(name = "PartidaElectronica", required = true)
                    protected String partidaElectronica;
                    @XmlElement(name = "Direccion", required = true)
                    protected String direccion;
                    @XmlElement(name = "Ubigeo", required = true)
                    protected String ubigeo;
                    @XmlElement(name = "Caracteristica", required = true)
                    protected String caracteristica;
                    @XmlElement(name = "MontoTasacion")
                    protected BigDecimal montoTasacion;
                    @XmlElement(name = "MontoBase")
                    protected BigDecimal montoBase;

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
                     * Obtiene el valor de la propiedad numero.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNumero() {
                        return numero;
                    }

                    /**
                     * Define el valor de la propiedad numero.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNumero(String value) {
                        this.numero = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad registroPublico.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getRegistroPublico() {
                        return registroPublico;
                    }

                    /**
                     * Define el valor de la propiedad registroPublico.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setRegistroPublico(String value) {
                        this.registroPublico = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad partidaElectronica.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPartidaElectronica() {
                        return partidaElectronica;
                    }

                    /**
                     * Define el valor de la propiedad partidaElectronica.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPartidaElectronica(String value) {
                        this.partidaElectronica = value;
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
                     * Obtiene el valor de la propiedad ubigeo.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getUbigeo() {
                        return ubigeo;
                    }

                    /**
                     * Define el valor de la propiedad ubigeo.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setUbigeo(String value) {
                        this.ubigeo = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad caracteristica.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCaracteristica() {
                        return caracteristica;
                    }

                    /**
                     * Define el valor de la propiedad caracteristica.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCaracteristica(String value) {
                        this.caracteristica = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad montoTasacion.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getMontoTasacion() {
                        return montoTasacion;
                    }

                    /**
                     * Define el valor de la propiedad montoTasacion.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setMontoTasacion(BigDecimal value) {
                        this.montoTasacion = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad montoBase.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getMontoBase() {
                        return montoBase;
                    }

                    /**
                     * Define el valor de la propiedad montoBase.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setMontoBase(BigDecimal value) {
                        this.montoBase = value;
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
             *         &lt;element name="Mercaderia" maxOccurs="unbounded"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="RegistroPublico" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="PartidaElectronica" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="Ubigeo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="Caracteristica" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="MontoTasacion" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
             *                   &lt;element name="MontoBase" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
                "mercaderia"
            })
            public static class Mercaderias {

                @XmlElement(name = "Mercaderia", required = true)
                protected List<BoletinOficial.RematesBienesMuebles.RemateMueble.Mercaderias.Mercaderia> mercaderia;

                /**
                 * Gets the value of the mercaderia property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the mercaderia property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getMercaderia().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link BoletinOficial.RematesBienesMuebles.RemateMueble.Mercaderias.Mercaderia }
                 * 
                 * 
                 */
                public List<BoletinOficial.RematesBienesMuebles.RemateMueble.Mercaderias.Mercaderia> getMercaderia() {
                    if (mercaderia == null) {
                        mercaderia = new ArrayList<BoletinOficial.RematesBienesMuebles.RemateMueble.Mercaderias.Mercaderia>();
                    }
                    return this.mercaderia;
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
                 *         &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="RegistroPublico" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="PartidaElectronica" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="Ubigeo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="Caracteristica" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="MontoTasacion" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
                 *         &lt;element name="MontoBase" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
                    "tipo",
                    "numero",
                    "registroPublico",
                    "partidaElectronica",
                    "direccion",
                    "ubigeo",
                    "caracteristica",
                    "montoTasacion",
                    "montoBase"
                })
                public static class Mercaderia {

                    @XmlElement(name = "Tipo", required = true)
                    protected String tipo;
                    @XmlElement(name = "Numero", required = true)
                    protected String numero;
                    @XmlElement(name = "RegistroPublico", required = true)
                    protected String registroPublico;
                    @XmlElement(name = "PartidaElectronica", required = true)
                    protected String partidaElectronica;
                    @XmlElement(name = "Direccion", required = true)
                    protected String direccion;
                    @XmlElement(name = "Ubigeo", required = true)
                    protected String ubigeo;
                    @XmlElement(name = "Caracteristica", required = true)
                    protected String caracteristica;
                    @XmlElement(name = "MontoTasacion")
                    protected BigDecimal montoTasacion;
                    @XmlElement(name = "MontoBase")
                    protected BigDecimal montoBase;

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
                     * Obtiene el valor de la propiedad numero.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNumero() {
                        return numero;
                    }

                    /**
                     * Define el valor de la propiedad numero.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNumero(String value) {
                        this.numero = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad registroPublico.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getRegistroPublico() {
                        return registroPublico;
                    }

                    /**
                     * Define el valor de la propiedad registroPublico.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setRegistroPublico(String value) {
                        this.registroPublico = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad partidaElectronica.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPartidaElectronica() {
                        return partidaElectronica;
                    }

                    /**
                     * Define el valor de la propiedad partidaElectronica.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPartidaElectronica(String value) {
                        this.partidaElectronica = value;
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
                     * Obtiene el valor de la propiedad ubigeo.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getUbigeo() {
                        return ubigeo;
                    }

                    /**
                     * Define el valor de la propiedad ubigeo.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setUbigeo(String value) {
                        this.ubigeo = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad caracteristica.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCaracteristica() {
                        return caracteristica;
                    }

                    /**
                     * Define el valor de la propiedad caracteristica.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCaracteristica(String value) {
                        this.caracteristica = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad montoTasacion.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getMontoTasacion() {
                        return montoTasacion;
                    }

                    /**
                     * Define el valor de la propiedad montoTasacion.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setMontoTasacion(BigDecimal value) {
                        this.montoTasacion = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad montoBase.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getMontoBase() {
                        return montoBase;
                    }

                    /**
                     * Define el valor de la propiedad montoBase.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setMontoBase(BigDecimal value) {
                        this.montoBase = value;
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
             *         &lt;element name="Mueble" maxOccurs="unbounded"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="RegistroPublico" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="PartidaElectronica" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="Ubigeo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="Caracteristica" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="MontoTasacion" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
             *                   &lt;element name="MontoBase" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
                "mueble"
            })
            public static class Muebles {

                @XmlElement(name = "Mueble", required = true)
                protected List<BoletinOficial.RematesBienesMuebles.RemateMueble.Muebles.Mueble> mueble;

                /**
                 * Gets the value of the mueble property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the mueble property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getMueble().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link BoletinOficial.RematesBienesMuebles.RemateMueble.Muebles.Mueble }
                 * 
                 * 
                 */
                public List<BoletinOficial.RematesBienesMuebles.RemateMueble.Muebles.Mueble> getMueble() {
                    if (mueble == null) {
                        mueble = new ArrayList<BoletinOficial.RematesBienesMuebles.RemateMueble.Muebles.Mueble>();
                    }
                    return this.mueble;
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
                 *         &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="RegistroPublico" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="PartidaElectronica" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="Ubigeo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="Caracteristica" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="MontoTasacion" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
                 *         &lt;element name="MontoBase" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
                    "tipo",
                    "numero",
                    "registroPublico",
                    "partidaElectronica",
                    "direccion",
                    "ubigeo",
                    "caracteristica",
                    "montoTasacion",
                    "montoBase"
                })
                public static class Mueble {

                    @XmlElement(name = "Tipo", required = true)
                    protected String tipo;
                    @XmlElement(name = "Numero", required = true)
                    protected String numero;
                    @XmlElement(name = "RegistroPublico", required = true)
                    protected String registroPublico;
                    @XmlElement(name = "PartidaElectronica", required = true)
                    protected String partidaElectronica;
                    @XmlElement(name = "Direccion", required = true)
                    protected String direccion;
                    @XmlElement(name = "Ubigeo", required = true)
                    protected String ubigeo;
                    @XmlElement(name = "Caracteristica", required = true)
                    protected String caracteristica;
                    @XmlElement(name = "MontoTasacion")
                    protected BigDecimal montoTasacion;
                    @XmlElement(name = "MontoBase")
                    protected BigDecimal montoBase;

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
                     * Obtiene el valor de la propiedad numero.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNumero() {
                        return numero;
                    }

                    /**
                     * Define el valor de la propiedad numero.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNumero(String value) {
                        this.numero = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad registroPublico.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getRegistroPublico() {
                        return registroPublico;
                    }

                    /**
                     * Define el valor de la propiedad registroPublico.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setRegistroPublico(String value) {
                        this.registroPublico = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad partidaElectronica.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPartidaElectronica() {
                        return partidaElectronica;
                    }

                    /**
                     * Define el valor de la propiedad partidaElectronica.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPartidaElectronica(String value) {
                        this.partidaElectronica = value;
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
                     * Obtiene el valor de la propiedad ubigeo.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getUbigeo() {
                        return ubigeo;
                    }

                    /**
                     * Define el valor de la propiedad ubigeo.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setUbigeo(String value) {
                        this.ubigeo = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad caracteristica.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCaracteristica() {
                        return caracteristica;
                    }

                    /**
                     * Define el valor de la propiedad caracteristica.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCaracteristica(String value) {
                        this.caracteristica = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad montoTasacion.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getMontoTasacion() {
                        return montoTasacion;
                    }

                    /**
                     * Define el valor de la propiedad montoTasacion.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setMontoTasacion(BigDecimal value) {
                        this.montoTasacion = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad montoBase.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getMontoBase() {
                        return montoBase;
                    }

                    /**
                     * Define el valor de la propiedad montoBase.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setMontoBase(BigDecimal value) {
                        this.montoBase = value;
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
     *         &lt;element name="RemateWarrant" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="NumeroExpediente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NumeroRemate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="Motivo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="Juzgado" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="EncargoDe" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="Divisa" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="MontoTasacion" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                   &lt;element name="MontoBase" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                   &lt;element name="FechaPublicacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="Ubigeo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="FechaRemate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="HoraRemate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="Demandantes"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Demandante" maxOccurs="unbounded"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="TipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="NumeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="Nombres" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
     *                   &lt;element name="Demandados"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Demandado" maxOccurs="unbounded"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="TipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="NumeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="Nombres" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
     *                   &lt;element name="Muebles"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Mueble" maxOccurs="unbounded"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="RegistroPublico" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="PartidaElectronica" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="Ubigeo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="Caracteristica" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="MontoTasacion" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                                       &lt;element name="MontoBase" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
     *                   &lt;element name="Inmuebles"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Inmueble" maxOccurs="unbounded"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="RegistroPublico" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="PartidaElectronica" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="Ubigeo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="Caracteristica" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="MontoTasacion" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                                       &lt;element name="MontoBase" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
     *                   &lt;element name="Mercaderias"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Mercaderia" maxOccurs="unbounded"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="RegistroPublico" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="PartidaElectronica" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="Ubigeo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="Caracteristica" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="MontoTasacion" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                                       &lt;element name="MontoBase" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
        "remateWarrant"
    })
    public static class RematesWarrants {

        @XmlElement(name = "RemateWarrant", required = true)
        protected List<BoletinOficial.RematesWarrants.RemateWarrant> remateWarrant;

        /**
         * Gets the value of the remateWarrant property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the remateWarrant property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRemateWarrant().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BoletinOficial.RematesWarrants.RemateWarrant }
         * 
         * 
         */
        public List<BoletinOficial.RematesWarrants.RemateWarrant> getRemateWarrant() {
            if (remateWarrant == null) {
                remateWarrant = new ArrayList<BoletinOficial.RematesWarrants.RemateWarrant>();
            }
            return this.remateWarrant;
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
         *         &lt;element name="NumeroExpediente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NumeroRemate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="Motivo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="Juzgado" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="EncargoDe" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="Divisa" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="MontoTasacion" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *         &lt;element name="MontoBase" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *         &lt;element name="FechaPublicacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="Ubigeo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="FechaRemate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="HoraRemate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="Demandantes"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Demandante" maxOccurs="unbounded"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="TipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="NumeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="Nombres" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
         *         &lt;element name="Demandados"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Demandado" maxOccurs="unbounded"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="TipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="NumeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="Nombres" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
         *         &lt;element name="Muebles"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Mueble" maxOccurs="unbounded"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="RegistroPublico" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="PartidaElectronica" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="Ubigeo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="Caracteristica" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="MontoTasacion" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *                             &lt;element name="MontoBase" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
         *         &lt;element name="Inmuebles"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Inmueble" maxOccurs="unbounded"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="RegistroPublico" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="PartidaElectronica" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="Ubigeo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="Caracteristica" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="MontoTasacion" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *                             &lt;element name="MontoBase" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
         *         &lt;element name="Mercaderias"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Mercaderia" maxOccurs="unbounded"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="RegistroPublico" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="PartidaElectronica" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="Ubigeo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="Caracteristica" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="MontoTasacion" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *                             &lt;element name="MontoBase" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
            "numeroExpediente",
            "numeroRemate",
            "motivo",
            "juzgado",
            "encargoDe",
            "divisa",
            "montoTasacion",
            "montoBase",
            "fechaPublicacion",
            "ubigeo",
            "direccion",
            "fechaRemate",
            "horaRemate",
            "demandantes",
            "demandados",
            "muebles",
            "inmuebles",
            "mercaderias"
        })
        public static class RemateWarrant {

            @XmlElement(name = "NumeroExpediente")
            protected String numeroExpediente;
            @XmlElement(name = "NumeroRemate")
            protected String numeroRemate;
            @XmlElement(name = "Motivo", required = true)
            protected String motivo;
            @XmlElement(name = "Juzgado", required = true)
            protected String juzgado;
            @XmlElement(name = "EncargoDe", required = true)
            protected String encargoDe;
            @XmlElement(name = "Divisa", required = true)
            protected String divisa;
            @XmlElement(name = "MontoTasacion")
            protected BigDecimal montoTasacion;
            @XmlElement(name = "MontoBase")
            protected BigDecimal montoBase;
            @XmlElement(name = "FechaPublicacion", required = true)
            protected String fechaPublicacion;
            @XmlElement(name = "Ubigeo", required = true)
            protected String ubigeo;
            @XmlElement(name = "Direccion", required = true)
            protected String direccion;
            @XmlElement(name = "FechaRemate", required = true)
            protected String fechaRemate;
            @XmlElement(name = "HoraRemate", required = true)
            protected String horaRemate;
            @XmlElement(name = "Demandantes", required = true)
            protected BoletinOficial.RematesWarrants.RemateWarrant.Demandantes demandantes;
            @XmlElement(name = "Demandados", required = true)
            protected BoletinOficial.RematesWarrants.RemateWarrant.Demandados demandados;
            @XmlElement(name = "Muebles", required = true)
            protected BoletinOficial.RematesWarrants.RemateWarrant.Muebles muebles;
            @XmlElement(name = "Inmuebles", required = true)
            protected BoletinOficial.RematesWarrants.RemateWarrant.Inmuebles inmuebles;
            @XmlElement(name = "Mercaderias", required = true)
            protected BoletinOficial.RematesWarrants.RemateWarrant.Mercaderias mercaderias;

            /**
             * Obtiene el valor de la propiedad numeroExpediente.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumeroExpediente() {
                return numeroExpediente;
            }

            /**
             * Define el valor de la propiedad numeroExpediente.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumeroExpediente(String value) {
                this.numeroExpediente = value;
            }

            /**
             * Obtiene el valor de la propiedad numeroRemate.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumeroRemate() {
                return numeroRemate;
            }

            /**
             * Define el valor de la propiedad numeroRemate.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumeroRemate(String value) {
                this.numeroRemate = value;
            }

            /**
             * Obtiene el valor de la propiedad motivo.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMotivo() {
                return motivo;
            }

            /**
             * Define el valor de la propiedad motivo.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMotivo(String value) {
                this.motivo = value;
            }

            /**
             * Obtiene el valor de la propiedad juzgado.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getJuzgado() {
                return juzgado;
            }

            /**
             * Define el valor de la propiedad juzgado.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setJuzgado(String value) {
                this.juzgado = value;
            }

            /**
             * Obtiene el valor de la propiedad encargoDe.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEncargoDe() {
                return encargoDe;
            }

            /**
             * Define el valor de la propiedad encargoDe.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEncargoDe(String value) {
                this.encargoDe = value;
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
             * Obtiene el valor de la propiedad montoTasacion.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getMontoTasacion() {
                return montoTasacion;
            }

            /**
             * Define el valor de la propiedad montoTasacion.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setMontoTasacion(BigDecimal value) {
                this.montoTasacion = value;
            }

            /**
             * Obtiene el valor de la propiedad montoBase.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getMontoBase() {
                return montoBase;
            }

            /**
             * Define el valor de la propiedad montoBase.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setMontoBase(BigDecimal value) {
                this.montoBase = value;
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
             * Obtiene el valor de la propiedad ubigeo.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUbigeo() {
                return ubigeo;
            }

            /**
             * Define el valor de la propiedad ubigeo.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUbigeo(String value) {
                this.ubigeo = value;
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
             * Obtiene el valor de la propiedad fechaRemate.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFechaRemate() {
                return fechaRemate;
            }

            /**
             * Define el valor de la propiedad fechaRemate.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFechaRemate(String value) {
                this.fechaRemate = value;
            }

            /**
             * Obtiene el valor de la propiedad horaRemate.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getHoraRemate() {
                return horaRemate;
            }

            /**
             * Define el valor de la propiedad horaRemate.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setHoraRemate(String value) {
                this.horaRemate = value;
            }

            /**
             * Obtiene el valor de la propiedad demandantes.
             * 
             * @return
             *     possible object is
             *     {@link BoletinOficial.RematesWarrants.RemateWarrant.Demandantes }
             *     
             */
            public BoletinOficial.RematesWarrants.RemateWarrant.Demandantes getDemandantes() {
                return demandantes;
            }

            /**
             * Define el valor de la propiedad demandantes.
             * 
             * @param value
             *     allowed object is
             *     {@link BoletinOficial.RematesWarrants.RemateWarrant.Demandantes }
             *     
             */
            public void setDemandantes(BoletinOficial.RematesWarrants.RemateWarrant.Demandantes value) {
                this.demandantes = value;
            }

            /**
             * Obtiene el valor de la propiedad demandados.
             * 
             * @return
             *     possible object is
             *     {@link BoletinOficial.RematesWarrants.RemateWarrant.Demandados }
             *     
             */
            public BoletinOficial.RematesWarrants.RemateWarrant.Demandados getDemandados() {
                return demandados;
            }

            /**
             * Define el valor de la propiedad demandados.
             * 
             * @param value
             *     allowed object is
             *     {@link BoletinOficial.RematesWarrants.RemateWarrant.Demandados }
             *     
             */
            public void setDemandados(BoletinOficial.RematesWarrants.RemateWarrant.Demandados value) {
                this.demandados = value;
            }

            /**
             * Obtiene el valor de la propiedad muebles.
             * 
             * @return
             *     possible object is
             *     {@link BoletinOficial.RematesWarrants.RemateWarrant.Muebles }
             *     
             */
            public BoletinOficial.RematesWarrants.RemateWarrant.Muebles getMuebles() {
                return muebles;
            }

            /**
             * Define el valor de la propiedad muebles.
             * 
             * @param value
             *     allowed object is
             *     {@link BoletinOficial.RematesWarrants.RemateWarrant.Muebles }
             *     
             */
            public void setMuebles(BoletinOficial.RematesWarrants.RemateWarrant.Muebles value) {
                this.muebles = value;
            }

            /**
             * Obtiene el valor de la propiedad inmuebles.
             * 
             * @return
             *     possible object is
             *     {@link BoletinOficial.RematesWarrants.RemateWarrant.Inmuebles }
             *     
             */
            public BoletinOficial.RematesWarrants.RemateWarrant.Inmuebles getInmuebles() {
                return inmuebles;
            }

            /**
             * Define el valor de la propiedad inmuebles.
             * 
             * @param value
             *     allowed object is
             *     {@link BoletinOficial.RematesWarrants.RemateWarrant.Inmuebles }
             *     
             */
            public void setInmuebles(BoletinOficial.RematesWarrants.RemateWarrant.Inmuebles value) {
                this.inmuebles = value;
            }

            /**
             * Obtiene el valor de la propiedad mercaderias.
             * 
             * @return
             *     possible object is
             *     {@link BoletinOficial.RematesWarrants.RemateWarrant.Mercaderias }
             *     
             */
            public BoletinOficial.RematesWarrants.RemateWarrant.Mercaderias getMercaderias() {
                return mercaderias;
            }

            /**
             * Define el valor de la propiedad mercaderias.
             * 
             * @param value
             *     allowed object is
             *     {@link BoletinOficial.RematesWarrants.RemateWarrant.Mercaderias }
             *     
             */
            public void setMercaderias(BoletinOficial.RematesWarrants.RemateWarrant.Mercaderias value) {
                this.mercaderias = value;
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
             *         &lt;element name="Demandado" maxOccurs="unbounded"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="TipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="NumeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="Nombres" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
                "demandado"
            })
            public static class Demandados {

                @XmlElement(name = "Demandado", required = true)
                protected List<BoletinOficial.RematesWarrants.RemateWarrant.Demandados.Demandado> demandado;

                /**
                 * Gets the value of the demandado property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the demandado property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getDemandado().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link BoletinOficial.RematesWarrants.RemateWarrant.Demandados.Demandado }
                 * 
                 * 
                 */
                public List<BoletinOficial.RematesWarrants.RemateWarrant.Demandados.Demandado> getDemandado() {
                    if (demandado == null) {
                        demandado = new ArrayList<BoletinOficial.RematesWarrants.RemateWarrant.Demandados.Demandado>();
                    }
                    return this.demandado;
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
                 *         &lt;element name="NumeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="Nombres" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
                    "nombres",
                    "tipo"
                })
                public static class Demandado {

                    @XmlElement(name = "TipoDocumento", required = true)
                    protected String tipoDocumento;
                    @XmlElement(name = "NumeroDocumento", required = true)
                    protected String numeroDocumento;
                    @XmlElement(name = "Nombres", required = true)
                    protected String nombres;
                    @XmlElement(name = "Tipo", required = true)
                    protected String tipo;

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
             *         &lt;element name="Demandante" maxOccurs="unbounded"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="TipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="NumeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="Nombres" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
                "demandante"
            })
            public static class Demandantes {

                @XmlElement(name = "Demandante", required = true)
                protected List<BoletinOficial.RematesWarrants.RemateWarrant.Demandantes.Demandante> demandante;

                /**
                 * Gets the value of the demandante property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the demandante property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getDemandante().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link BoletinOficial.RematesWarrants.RemateWarrant.Demandantes.Demandante }
                 * 
                 * 
                 */
                public List<BoletinOficial.RematesWarrants.RemateWarrant.Demandantes.Demandante> getDemandante() {
                    if (demandante == null) {
                        demandante = new ArrayList<BoletinOficial.RematesWarrants.RemateWarrant.Demandantes.Demandante>();
                    }
                    return this.demandante;
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
                 *         &lt;element name="NumeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="Nombres" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
                    "nombres",
                    "tipo"
                })
                public static class Demandante {

                    @XmlElement(name = "TipoDocumento", required = true)
                    protected String tipoDocumento;
                    @XmlElement(name = "NumeroDocumento", required = true)
                    protected String numeroDocumento;
                    @XmlElement(name = "Nombres", required = true)
                    protected String nombres;
                    @XmlElement(name = "Tipo", required = true)
                    protected String tipo;

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
             *         &lt;element name="Inmueble" maxOccurs="unbounded"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="RegistroPublico" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="PartidaElectronica" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="Ubigeo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="Caracteristica" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="MontoTasacion" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
             *                   &lt;element name="MontoBase" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
                "inmueble"
            })
            public static class Inmuebles {

                @XmlElement(name = "Inmueble", required = true)
                protected List<BoletinOficial.RematesWarrants.RemateWarrant.Inmuebles.Inmueble> inmueble;

                /**
                 * Gets the value of the inmueble property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the inmueble property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getInmueble().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link BoletinOficial.RematesWarrants.RemateWarrant.Inmuebles.Inmueble }
                 * 
                 * 
                 */
                public List<BoletinOficial.RematesWarrants.RemateWarrant.Inmuebles.Inmueble> getInmueble() {
                    if (inmueble == null) {
                        inmueble = new ArrayList<BoletinOficial.RematesWarrants.RemateWarrant.Inmuebles.Inmueble>();
                    }
                    return this.inmueble;
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
                 *         &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="RegistroPublico" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="PartidaElectronica" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="Ubigeo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="Caracteristica" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="MontoTasacion" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
                 *         &lt;element name="MontoBase" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
                    "tipo",
                    "numero",
                    "registroPublico",
                    "partidaElectronica",
                    "direccion",
                    "ubigeo",
                    "caracteristica",
                    "montoTasacion",
                    "montoBase"
                })
                public static class Inmueble {

                    @XmlElement(name = "Tipo", required = true)
                    protected String tipo;
                    @XmlElement(name = "Numero", required = true)
                    protected String numero;
                    @XmlElement(name = "RegistroPublico", required = true)
                    protected String registroPublico;
                    @XmlElement(name = "PartidaElectronica", required = true)
                    protected String partidaElectronica;
                    @XmlElement(name = "Direccion", required = true)
                    protected String direccion;
                    @XmlElement(name = "Ubigeo", required = true)
                    protected String ubigeo;
                    @XmlElement(name = "Caracteristica", required = true)
                    protected String caracteristica;
                    @XmlElement(name = "MontoTasacion")
                    protected BigDecimal montoTasacion;
                    @XmlElement(name = "MontoBase")
                    protected BigDecimal montoBase;

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
                     * Obtiene el valor de la propiedad numero.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNumero() {
                        return numero;
                    }

                    /**
                     * Define el valor de la propiedad numero.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNumero(String value) {
                        this.numero = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad registroPublico.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getRegistroPublico() {
                        return registroPublico;
                    }

                    /**
                     * Define el valor de la propiedad registroPublico.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setRegistroPublico(String value) {
                        this.registroPublico = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad partidaElectronica.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPartidaElectronica() {
                        return partidaElectronica;
                    }

                    /**
                     * Define el valor de la propiedad partidaElectronica.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPartidaElectronica(String value) {
                        this.partidaElectronica = value;
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
                     * Obtiene el valor de la propiedad ubigeo.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getUbigeo() {
                        return ubigeo;
                    }

                    /**
                     * Define el valor de la propiedad ubigeo.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setUbigeo(String value) {
                        this.ubigeo = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad caracteristica.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCaracteristica() {
                        return caracteristica;
                    }

                    /**
                     * Define el valor de la propiedad caracteristica.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCaracteristica(String value) {
                        this.caracteristica = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad montoTasacion.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getMontoTasacion() {
                        return montoTasacion;
                    }

                    /**
                     * Define el valor de la propiedad montoTasacion.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setMontoTasacion(BigDecimal value) {
                        this.montoTasacion = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad montoBase.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getMontoBase() {
                        return montoBase;
                    }

                    /**
                     * Define el valor de la propiedad montoBase.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setMontoBase(BigDecimal value) {
                        this.montoBase = value;
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
             *         &lt;element name="Mercaderia" maxOccurs="unbounded"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="RegistroPublico" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="PartidaElectronica" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="Ubigeo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="Caracteristica" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="MontoTasacion" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
             *                   &lt;element name="MontoBase" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
                "mercaderia"
            })
            public static class Mercaderias {

                @XmlElement(name = "Mercaderia", required = true)
                protected List<BoletinOficial.RematesWarrants.RemateWarrant.Mercaderias.Mercaderia> mercaderia;

                /**
                 * Gets the value of the mercaderia property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the mercaderia property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getMercaderia().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link BoletinOficial.RematesWarrants.RemateWarrant.Mercaderias.Mercaderia }
                 * 
                 * 
                 */
                public List<BoletinOficial.RematesWarrants.RemateWarrant.Mercaderias.Mercaderia> getMercaderia() {
                    if (mercaderia == null) {
                        mercaderia = new ArrayList<BoletinOficial.RematesWarrants.RemateWarrant.Mercaderias.Mercaderia>();
                    }
                    return this.mercaderia;
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
                 *         &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="RegistroPublico" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="PartidaElectronica" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="Ubigeo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="Caracteristica" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="MontoTasacion" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
                 *         &lt;element name="MontoBase" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
                    "tipo",
                    "numero",
                    "registroPublico",
                    "partidaElectronica",
                    "direccion",
                    "ubigeo",
                    "caracteristica",
                    "montoTasacion",
                    "montoBase"
                })
                public static class Mercaderia {

                    @XmlElement(name = "Tipo", required = true)
                    protected String tipo;
                    @XmlElement(name = "Numero", required = true)
                    protected String numero;
                    @XmlElement(name = "RegistroPublico", required = true)
                    protected String registroPublico;
                    @XmlElement(name = "PartidaElectronica", required = true)
                    protected String partidaElectronica;
                    @XmlElement(name = "Direccion", required = true)
                    protected String direccion;
                    @XmlElement(name = "Ubigeo", required = true)
                    protected String ubigeo;
                    @XmlElement(name = "Caracteristica", required = true)
                    protected String caracteristica;
                    @XmlElement(name = "MontoTasacion")
                    protected BigDecimal montoTasacion;
                    @XmlElement(name = "MontoBase")
                    protected BigDecimal montoBase;

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
                     * Obtiene el valor de la propiedad numero.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNumero() {
                        return numero;
                    }

                    /**
                     * Define el valor de la propiedad numero.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNumero(String value) {
                        this.numero = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad registroPublico.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getRegistroPublico() {
                        return registroPublico;
                    }

                    /**
                     * Define el valor de la propiedad registroPublico.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setRegistroPublico(String value) {
                        this.registroPublico = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad partidaElectronica.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPartidaElectronica() {
                        return partidaElectronica;
                    }

                    /**
                     * Define el valor de la propiedad partidaElectronica.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPartidaElectronica(String value) {
                        this.partidaElectronica = value;
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
                     * Obtiene el valor de la propiedad ubigeo.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getUbigeo() {
                        return ubigeo;
                    }

                    /**
                     * Define el valor de la propiedad ubigeo.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setUbigeo(String value) {
                        this.ubigeo = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad caracteristica.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCaracteristica() {
                        return caracteristica;
                    }

                    /**
                     * Define el valor de la propiedad caracteristica.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCaracteristica(String value) {
                        this.caracteristica = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad montoTasacion.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getMontoTasacion() {
                        return montoTasacion;
                    }

                    /**
                     * Define el valor de la propiedad montoTasacion.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setMontoTasacion(BigDecimal value) {
                        this.montoTasacion = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad montoBase.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getMontoBase() {
                        return montoBase;
                    }

                    /**
                     * Define el valor de la propiedad montoBase.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setMontoBase(BigDecimal value) {
                        this.montoBase = value;
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
             *         &lt;element name="Mueble" maxOccurs="unbounded"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="RegistroPublico" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="PartidaElectronica" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="Ubigeo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="Caracteristica" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="MontoTasacion" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
             *                   &lt;element name="MontoBase" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
                "mueble"
            })
            public static class Muebles {

                @XmlElement(name = "Mueble", required = true)
                protected List<BoletinOficial.RematesWarrants.RemateWarrant.Muebles.Mueble> mueble;

                /**
                 * Gets the value of the mueble property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the mueble property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getMueble().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link BoletinOficial.RematesWarrants.RemateWarrant.Muebles.Mueble }
                 * 
                 * 
                 */
                public List<BoletinOficial.RematesWarrants.RemateWarrant.Muebles.Mueble> getMueble() {
                    if (mueble == null) {
                        mueble = new ArrayList<BoletinOficial.RematesWarrants.RemateWarrant.Muebles.Mueble>();
                    }
                    return this.mueble;
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
                 *         &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="RegistroPublico" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="PartidaElectronica" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="Ubigeo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="Caracteristica" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="MontoTasacion" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
                 *         &lt;element name="MontoBase" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
                    "tipo",
                    "numero",
                    "registroPublico",
                    "partidaElectronica",
                    "direccion",
                    "ubigeo",
                    "caracteristica",
                    "montoTasacion",
                    "montoBase"
                })
                public static class Mueble {

                    @XmlElement(name = "Tipo", required = true)
                    protected String tipo;
                    @XmlElement(name = "Numero", required = true)
                    protected String numero;
                    @XmlElement(name = "RegistroPublico", required = true)
                    protected String registroPublico;
                    @XmlElement(name = "PartidaElectronica", required = true)
                    protected String partidaElectronica;
                    @XmlElement(name = "Direccion", required = true)
                    protected String direccion;
                    @XmlElement(name = "Ubigeo", required = true)
                    protected String ubigeo;
                    @XmlElement(name = "Caracteristica", required = true)
                    protected String caracteristica;
                    @XmlElement(name = "MontoTasacion")
                    protected BigDecimal montoTasacion;
                    @XmlElement(name = "MontoBase")
                    protected BigDecimal montoBase;

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
                     * Obtiene el valor de la propiedad numero.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNumero() {
                        return numero;
                    }

                    /**
                     * Define el valor de la propiedad numero.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNumero(String value) {
                        this.numero = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad registroPublico.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getRegistroPublico() {
                        return registroPublico;
                    }

                    /**
                     * Define el valor de la propiedad registroPublico.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setRegistroPublico(String value) {
                        this.registroPublico = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad partidaElectronica.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPartidaElectronica() {
                        return partidaElectronica;
                    }

                    /**
                     * Define el valor de la propiedad partidaElectronica.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPartidaElectronica(String value) {
                        this.partidaElectronica = value;
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
                     * Obtiene el valor de la propiedad ubigeo.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getUbigeo() {
                        return ubigeo;
                    }

                    /**
                     * Define el valor de la propiedad ubigeo.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setUbigeo(String value) {
                        this.ubigeo = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad caracteristica.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCaracteristica() {
                        return caracteristica;
                    }

                    /**
                     * Define el valor de la propiedad caracteristica.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCaracteristica(String value) {
                        this.caracteristica = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad montoTasacion.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getMontoTasacion() {
                        return montoTasacion;
                    }

                    /**
                     * Define el valor de la propiedad montoTasacion.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setMontoTasacion(BigDecimal value) {
                        this.montoTasacion = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad montoBase.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getMontoBase() {
                        return montoBase;
                    }

                    /**
                     * Define el valor de la propiedad montoBase.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setMontoBase(BigDecimal value) {
                        this.montoBase = value;
                    }

                }

            }

        }

    }

}
