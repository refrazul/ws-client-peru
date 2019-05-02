
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
 *         &lt;element name="ResumenComportamientoPago" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Semaforo" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="NoTieneImpagos" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *                             &lt;element name="TieneDeudasAtrasadas" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *                             &lt;element name="TieneDeudasImpagasInfocorp" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *                             &lt;element name="InformacionNoDisponible" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *                             &lt;element name="DiasAtraso" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
 *         &lt;element name="DeudasUltimoPeriodo" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Deuda" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Entidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="SistemaFinanciero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="Calificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="MontoTotal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="Productos" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Producto" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                                 &lt;element name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                                 &lt;element name="Monto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                                 &lt;element name="DiasAtraso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
 *                 &lt;attribute name="periodo" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DeudasHistoricas" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Deuda" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Calificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="Porcentaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NroEntidades" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *                             &lt;element name="DeudaVigente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="DeudaAtrasada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="DeudaVencida" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="DeudaRefinanciada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="DeudaReestructurada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="DeudaJudicial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="DeudaCastigada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="DeudaTotal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="DiasAtraso" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
 *         &lt;element name="RCC" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="DetalleEntidades" minOccurs="0"&gt;
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
 *                                       &lt;element name="CreditosVigentes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                       &lt;element name="CreditosRefinanciados" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                       &lt;element name="CreditosVencidos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                       &lt;element name="CreditosJudicial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
 *                                                           &lt;element name="CodigoCuenta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                                           &lt;element name="NombreCuenta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                                           &lt;element name="DescripcionCuenta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                                           &lt;element name="CodigoEntidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                                           &lt;element name="NombreEntidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                                           &lt;element name="Calificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                                           &lt;element name="Monto" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                                                           &lt;element name="Moneda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
 *         &lt;element name="Rectificaciones" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Rectificacion" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
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
 *                                                 &lt;element name="Codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                                 &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                                 &lt;element name="Detalles" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;sequence&gt;
 *                                                           &lt;element name="Detalle" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                                             &lt;complexType&gt;
 *                                                               &lt;complexContent&gt;
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                                   &lt;sequence&gt;
 *                                                                     &lt;element name="Concepto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                                                     &lt;element name="Dice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                                                     &lt;element name="Debedecir" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                                                   &lt;/sequence&gt;
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
    "resumenComportamientoPago",
    "deudasUltimoPeriodo",
    "deudasHistoricas",
    "rcc",
    "rectificaciones",
    "avalistas",
    "microfinanzas"
})
@XmlRootElement(name = "SistemaFinanciero")
public class SistemaFinanciero {

    @XmlElement(name = "ResumenComportamientoPago")
    protected SistemaFinanciero.ResumenComportamientoPago resumenComportamientoPago;
    @XmlElement(name = "DeudasUltimoPeriodo")
    protected SistemaFinanciero.DeudasUltimoPeriodo deudasUltimoPeriodo;
    @XmlElement(name = "DeudasHistoricas")
    protected SistemaFinanciero.DeudasHistoricas deudasHistoricas;
    @XmlElement(name = "RCC")
    protected SistemaFinanciero.RCC rcc;
    @XmlElement(name = "Rectificaciones")
    protected SistemaFinanciero.Rectificaciones rectificaciones;
    @XmlElement(name = "Avalistas")
    protected SistemaFinanciero.Avalistas avalistas;
    @XmlElement(name = "Microfinanzas")
    protected SistemaFinanciero.Microfinanzas microfinanzas;

    /**
     * Obtiene el valor de la propiedad resumenComportamientoPago.
     * 
     * @return
     *     possible object is
     *     {@link SistemaFinanciero.ResumenComportamientoPago }
     *     
     */
    public SistemaFinanciero.ResumenComportamientoPago getResumenComportamientoPago() {
        return resumenComportamientoPago;
    }

    /**
     * Define el valor de la propiedad resumenComportamientoPago.
     * 
     * @param value
     *     allowed object is
     *     {@link SistemaFinanciero.ResumenComportamientoPago }
     *     
     */
    public void setResumenComportamientoPago(SistemaFinanciero.ResumenComportamientoPago value) {
        this.resumenComportamientoPago = value;
    }

    /**
     * Obtiene el valor de la propiedad deudasUltimoPeriodo.
     * 
     * @return
     *     possible object is
     *     {@link SistemaFinanciero.DeudasUltimoPeriodo }
     *     
     */
    public SistemaFinanciero.DeudasUltimoPeriodo getDeudasUltimoPeriodo() {
        return deudasUltimoPeriodo;
    }

    /**
     * Define el valor de la propiedad deudasUltimoPeriodo.
     * 
     * @param value
     *     allowed object is
     *     {@link SistemaFinanciero.DeudasUltimoPeriodo }
     *     
     */
    public void setDeudasUltimoPeriodo(SistemaFinanciero.DeudasUltimoPeriodo value) {
        this.deudasUltimoPeriodo = value;
    }

    /**
     * Obtiene el valor de la propiedad deudasHistoricas.
     * 
     * @return
     *     possible object is
     *     {@link SistemaFinanciero.DeudasHistoricas }
     *     
     */
    public SistemaFinanciero.DeudasHistoricas getDeudasHistoricas() {
        return deudasHistoricas;
    }

    /**
     * Define el valor de la propiedad deudasHistoricas.
     * 
     * @param value
     *     allowed object is
     *     {@link SistemaFinanciero.DeudasHistoricas }
     *     
     */
    public void setDeudasHistoricas(SistemaFinanciero.DeudasHistoricas value) {
        this.deudasHistoricas = value;
    }

    /**
     * Obtiene el valor de la propiedad rcc.
     * 
     * @return
     *     possible object is
     *     {@link SistemaFinanciero.RCC }
     *     
     */
    public SistemaFinanciero.RCC getRCC() {
        return rcc;
    }

    /**
     * Define el valor de la propiedad rcc.
     * 
     * @param value
     *     allowed object is
     *     {@link SistemaFinanciero.RCC }
     *     
     */
    public void setRCC(SistemaFinanciero.RCC value) {
        this.rcc = value;
    }

    /**
     * Obtiene el valor de la propiedad rectificaciones.
     * 
     * @return
     *     possible object is
     *     {@link SistemaFinanciero.Rectificaciones }
     *     
     */
    public SistemaFinanciero.Rectificaciones getRectificaciones() {
        return rectificaciones;
    }

    /**
     * Define el valor de la propiedad rectificaciones.
     * 
     * @param value
     *     allowed object is
     *     {@link SistemaFinanciero.Rectificaciones }
     *     
     */
    public void setRectificaciones(SistemaFinanciero.Rectificaciones value) {
        this.rectificaciones = value;
    }

    /**
     * Obtiene el valor de la propiedad avalistas.
     * 
     * @return
     *     possible object is
     *     {@link SistemaFinanciero.Avalistas }
     *     
     */
    public SistemaFinanciero.Avalistas getAvalistas() {
        return avalistas;
    }

    /**
     * Define el valor de la propiedad avalistas.
     * 
     * @param value
     *     allowed object is
     *     {@link SistemaFinanciero.Avalistas }
     *     
     */
    public void setAvalistas(SistemaFinanciero.Avalistas value) {
        this.avalistas = value;
    }

    /**
     * Obtiene el valor de la propiedad microfinanzas.
     * 
     * @return
     *     possible object is
     *     {@link SistemaFinanciero.Microfinanzas }
     *     
     */
    public SistemaFinanciero.Microfinanzas getMicrofinanzas() {
        return microfinanzas;
    }

    /**
     * Define el valor de la propiedad microfinanzas.
     * 
     * @param value
     *     allowed object is
     *     {@link SistemaFinanciero.Microfinanzas }
     *     
     */
    public void setMicrofinanzas(SistemaFinanciero.Microfinanzas value) {
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
        protected List<SistemaFinanciero.Avalistas.Aval> aval;

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
         * {@link SistemaFinanciero.Avalistas.Aval }
         * 
         * 
         */
        public List<SistemaFinanciero.Avalistas.Aval> getAval() {
            if (aval == null) {
                aval = new ArrayList<SistemaFinanciero.Avalistas.Aval>();
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
            protected SistemaFinanciero.Avalistas.Aval.Entidades entidades;

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
             *     {@link SistemaFinanciero.Avalistas.Aval.Entidades }
             *     
             */
            public SistemaFinanciero.Avalistas.Aval.Entidades getEntidades() {
                return entidades;
            }

            /**
             * Define el valor de la propiedad entidades.
             * 
             * @param value
             *     allowed object is
             *     {@link SistemaFinanciero.Avalistas.Aval.Entidades }
             *     
             */
            public void setEntidades(SistemaFinanciero.Avalistas.Aval.Entidades value) {
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
                protected List<SistemaFinanciero.Avalistas.Aval.Entidades.Entidad> entidad;

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
                 * {@link SistemaFinanciero.Avalistas.Aval.Entidades.Entidad }
                 * 
                 * 
                 */
                public List<SistemaFinanciero.Avalistas.Aval.Entidades.Entidad> getEntidad() {
                    if (entidad == null) {
                        entidad = new ArrayList<SistemaFinanciero.Avalistas.Aval.Entidades.Entidad>();
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
                    protected SistemaFinanciero.Avalistas.Aval.Entidades.Entidad.Periodos periodos;

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
                     *     {@link SistemaFinanciero.Avalistas.Aval.Entidades.Entidad.Periodos }
                     *     
                     */
                    public SistemaFinanciero.Avalistas.Aval.Entidades.Entidad.Periodos getPeriodos() {
                        return periodos;
                    }

                    /**
                     * Define el valor de la propiedad periodos.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link SistemaFinanciero.Avalistas.Aval.Entidades.Entidad.Periodos }
                     *     
                     */
                    public void setPeriodos(SistemaFinanciero.Avalistas.Aval.Entidades.Entidad.Periodos value) {
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
                        protected List<SistemaFinanciero.Avalistas.Aval.Entidades.Entidad.Periodos.Periodo> periodo;

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
                         * {@link SistemaFinanciero.Avalistas.Aval.Entidades.Entidad.Periodos.Periodo }
                         * 
                         * 
                         */
                        public List<SistemaFinanciero.Avalistas.Aval.Entidades.Entidad.Periodos.Periodo> getPeriodo() {
                            if (periodo == null) {
                                periodo = new ArrayList<SistemaFinanciero.Avalistas.Aval.Entidades.Entidad.Periodos.Periodo>();
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
     *         &lt;element name="Deuda" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Calificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="Porcentaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NroEntidades" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
     *                   &lt;element name="DeudaVigente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="DeudaAtrasada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="DeudaVencida" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="DeudaRefinanciada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="DeudaReestructurada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="DeudaJudicial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="DeudaCastigada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="DeudaTotal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="DiasAtraso" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
        "deuda"
    })
    public static class DeudasHistoricas {

        @XmlElement(name = "Deuda")
        protected List<SistemaFinanciero.DeudasHistoricas.Deuda> deuda;

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
         * {@link SistemaFinanciero.DeudasHistoricas.Deuda }
         * 
         * 
         */
        public List<SistemaFinanciero.DeudasHistoricas.Deuda> getDeuda() {
            if (deuda == null) {
                deuda = new ArrayList<SistemaFinanciero.DeudasHistoricas.Deuda>();
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
         *         &lt;element name="Calificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="Porcentaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NroEntidades" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
         *         &lt;element name="DeudaVigente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="DeudaAtrasada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="DeudaVencida" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="DeudaRefinanciada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="DeudaReestructurada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="DeudaJudicial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="DeudaCastigada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="DeudaTotal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="DiasAtraso" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
            "porcentaje",
            "nroEntidades",
            "deudaVigente",
            "deudaAtrasada",
            "deudaVencida",
            "deudaRefinanciada",
            "deudaReestructurada",
            "deudaJudicial",
            "deudaCastigada",
            "deudaTotal",
            "diasAtraso"
        })
        public static class Deuda {

            @XmlElement(name = "Calificacion")
            protected String calificacion;
            @XmlElement(name = "Porcentaje")
            protected String porcentaje;
            @XmlElement(name = "NroEntidades")
            protected Integer nroEntidades;
            @XmlElement(name = "DeudaVigente")
            protected String deudaVigente;
            @XmlElement(name = "DeudaAtrasada")
            protected String deudaAtrasada;
            @XmlElement(name = "DeudaVencida")
            protected String deudaVencida;
            @XmlElement(name = "DeudaRefinanciada")
            protected String deudaRefinanciada;
            @XmlElement(name = "DeudaReestructurada")
            protected String deudaReestructurada;
            @XmlElement(name = "DeudaJudicial")
            protected String deudaJudicial;
            @XmlElement(name = "DeudaCastigada")
            protected String deudaCastigada;
            @XmlElement(name = "DeudaTotal")
            protected String deudaTotal;
            @XmlElement(name = "DiasAtraso")
            protected Integer diasAtraso;
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
             * Obtiene el valor de la propiedad porcentaje.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPorcentaje() {
                return porcentaje;
            }

            /**
             * Define el valor de la propiedad porcentaje.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPorcentaje(String value) {
                this.porcentaje = value;
            }

            /**
             * Obtiene el valor de la propiedad nroEntidades.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getNroEntidades() {
                return nroEntidades;
            }

            /**
             * Define el valor de la propiedad nroEntidades.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setNroEntidades(Integer value) {
                this.nroEntidades = value;
            }

            /**
             * Obtiene el valor de la propiedad deudaVigente.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDeudaVigente() {
                return deudaVigente;
            }

            /**
             * Define el valor de la propiedad deudaVigente.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDeudaVigente(String value) {
                this.deudaVigente = value;
            }

            /**
             * Obtiene el valor de la propiedad deudaAtrasada.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDeudaAtrasada() {
                return deudaAtrasada;
            }

            /**
             * Define el valor de la propiedad deudaAtrasada.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDeudaAtrasada(String value) {
                this.deudaAtrasada = value;
            }

            /**
             * Obtiene el valor de la propiedad deudaVencida.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDeudaVencida() {
                return deudaVencida;
            }

            /**
             * Define el valor de la propiedad deudaVencida.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDeudaVencida(String value) {
                this.deudaVencida = value;
            }

            /**
             * Obtiene el valor de la propiedad deudaRefinanciada.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDeudaRefinanciada() {
                return deudaRefinanciada;
            }

            /**
             * Define el valor de la propiedad deudaRefinanciada.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDeudaRefinanciada(String value) {
                this.deudaRefinanciada = value;
            }

            /**
             * Obtiene el valor de la propiedad deudaReestructurada.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDeudaReestructurada() {
                return deudaReestructurada;
            }

            /**
             * Define el valor de la propiedad deudaReestructurada.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDeudaReestructurada(String value) {
                this.deudaReestructurada = value;
            }

            /**
             * Obtiene el valor de la propiedad deudaJudicial.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDeudaJudicial() {
                return deudaJudicial;
            }

            /**
             * Define el valor de la propiedad deudaJudicial.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDeudaJudicial(String value) {
                this.deudaJudicial = value;
            }

            /**
             * Obtiene el valor de la propiedad deudaCastigada.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDeudaCastigada() {
                return deudaCastigada;
            }

            /**
             * Define el valor de la propiedad deudaCastigada.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDeudaCastigada(String value) {
                this.deudaCastigada = value;
            }

            /**
             * Obtiene el valor de la propiedad deudaTotal.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDeudaTotal() {
                return deudaTotal;
            }

            /**
             * Define el valor de la propiedad deudaTotal.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDeudaTotal(String value) {
                this.deudaTotal = value;
            }

            /**
             * Obtiene el valor de la propiedad diasAtraso.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getDiasAtraso() {
                return diasAtraso;
            }

            /**
             * Define el valor de la propiedad diasAtraso.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setDiasAtraso(Integer value) {
                this.diasAtraso = value;
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
     *                   &lt;element name="Entidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="SistemaFinanciero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="Calificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="MontoTotal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="Productos" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Producto" maxOccurs="unbounded" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                       &lt;element name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                       &lt;element name="Monto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                       &lt;element name="DiasAtraso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "deuda"
    })
    public static class DeudasUltimoPeriodo {

        @XmlElement(name = "Deuda")
        protected List<SistemaFinanciero.DeudasUltimoPeriodo.Deuda> deuda;
        @XmlAttribute(name = "periodo")
        protected String periodo;

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
         * {@link SistemaFinanciero.DeudasUltimoPeriodo.Deuda }
         * 
         * 
         */
        public List<SistemaFinanciero.DeudasUltimoPeriodo.Deuda> getDeuda() {
            if (deuda == null) {
                deuda = new ArrayList<SistemaFinanciero.DeudasUltimoPeriodo.Deuda>();
            }
            return this.deuda;
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
         *         &lt;element name="Entidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="SistemaFinanciero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="Calificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="MontoTotal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="Productos" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Producto" maxOccurs="unbounded" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                             &lt;element name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                             &lt;element name="Monto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                             &lt;element name="DiasAtraso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "entidad",
            "sistemaFinanciero",
            "calificacion",
            "montoTotal",
            "productos"
        })
        public static class Deuda {

            @XmlElement(name = "Entidad")
            protected String entidad;
            @XmlElement(name = "SistemaFinanciero")
            protected String sistemaFinanciero;
            @XmlElement(name = "Calificacion")
            protected String calificacion;
            @XmlElement(name = "MontoTotal")
            protected String montoTotal;
            @XmlElement(name = "Productos")
            protected SistemaFinanciero.DeudasUltimoPeriodo.Deuda.Productos productos;

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

            /**
             * Obtiene el valor de la propiedad sistemaFinanciero.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSistemaFinanciero() {
                return sistemaFinanciero;
            }

            /**
             * Define el valor de la propiedad sistemaFinanciero.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSistemaFinanciero(String value) {
                this.sistemaFinanciero = value;
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

            /**
             * Obtiene el valor de la propiedad montoTotal.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMontoTotal() {
                return montoTotal;
            }

            /**
             * Define el valor de la propiedad montoTotal.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMontoTotal(String value) {
                this.montoTotal = value;
            }

            /**
             * Obtiene el valor de la propiedad productos.
             * 
             * @return
             *     possible object is
             *     {@link SistemaFinanciero.DeudasUltimoPeriodo.Deuda.Productos }
             *     
             */
            public SistemaFinanciero.DeudasUltimoPeriodo.Deuda.Productos getProductos() {
                return productos;
            }

            /**
             * Define el valor de la propiedad productos.
             * 
             * @param value
             *     allowed object is
             *     {@link SistemaFinanciero.DeudasUltimoPeriodo.Deuda.Productos }
             *     
             */
            public void setProductos(SistemaFinanciero.DeudasUltimoPeriodo.Deuda.Productos value) {
                this.productos = value;
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
             *         &lt;element name="Producto" maxOccurs="unbounded" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                   &lt;element name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                   &lt;element name="Monto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                   &lt;element name="DiasAtraso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
                "producto"
            })
            public static class Productos {

                @XmlElement(name = "Producto")
                protected List<SistemaFinanciero.DeudasUltimoPeriodo.Deuda.Productos.Producto> producto;

                /**
                 * Gets the value of the producto property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the producto property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getProducto().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link SistemaFinanciero.DeudasUltimoPeriodo.Deuda.Productos.Producto }
                 * 
                 * 
                 */
                public List<SistemaFinanciero.DeudasUltimoPeriodo.Deuda.Productos.Producto> getProducto() {
                    if (producto == null) {
                        producto = new ArrayList<SistemaFinanciero.DeudasUltimoPeriodo.Deuda.Productos.Producto>();
                    }
                    return this.producto;
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
                 *         &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *         &lt;element name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *         &lt;element name="Monto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *         &lt;element name="DiasAtraso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
                    "descripcion",
                    "monto",
                    "diasAtraso"
                })
                public static class Producto {

                    @XmlElement(name = "Tipo")
                    protected String tipo;
                    @XmlElement(name = "Descripcion")
                    protected String descripcion;
                    @XmlElement(name = "Monto")
                    protected String monto;
                    @XmlElement(name = "DiasAtraso")
                    protected String diasAtraso;

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
                     * Obtiene el valor de la propiedad monto.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getMonto() {
                        return monto;
                    }

                    /**
                     * Define el valor de la propiedad monto.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setMonto(String value) {
                        this.monto = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad diasAtraso.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDiasAtraso() {
                        return diasAtraso;
                    }

                    /**
                     * Define el valor de la propiedad diasAtraso.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDiasAtraso(String value) {
                        this.diasAtraso = value;
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
        protected SistemaFinanciero.Microfinanzas.CalificacionEntidad calificacionEntidad;
        @XmlElement(name = "Periodos")
        protected SistemaFinanciero.Microfinanzas.Periodos periodos;

        /**
         * Obtiene el valor de la propiedad calificacionEntidad.
         * 
         * @return
         *     possible object is
         *     {@link SistemaFinanciero.Microfinanzas.CalificacionEntidad }
         *     
         */
        public SistemaFinanciero.Microfinanzas.CalificacionEntidad getCalificacionEntidad() {
            return calificacionEntidad;
        }

        /**
         * Define el valor de la propiedad calificacionEntidad.
         * 
         * @param value
         *     allowed object is
         *     {@link SistemaFinanciero.Microfinanzas.CalificacionEntidad }
         *     
         */
        public void setCalificacionEntidad(SistemaFinanciero.Microfinanzas.CalificacionEntidad value) {
            this.calificacionEntidad = value;
        }

        /**
         * Obtiene el valor de la propiedad periodos.
         * 
         * @return
         *     possible object is
         *     {@link SistemaFinanciero.Microfinanzas.Periodos }
         *     
         */
        public SistemaFinanciero.Microfinanzas.Periodos getPeriodos() {
            return periodos;
        }

        /**
         * Define el valor de la propiedad periodos.
         * 
         * @param value
         *     allowed object is
         *     {@link SistemaFinanciero.Microfinanzas.Periodos }
         *     
         */
        public void setPeriodos(SistemaFinanciero.Microfinanzas.Periodos value) {
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
            protected List<SistemaFinanciero.Microfinanzas.CalificacionEntidad.Entidades> entidades;

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
             * {@link SistemaFinanciero.Microfinanzas.CalificacionEntidad.Entidades }
             * 
             * 
             */
            public List<SistemaFinanciero.Microfinanzas.CalificacionEntidad.Entidades> getEntidades() {
                if (entidades == null) {
                    entidades = new ArrayList<SistemaFinanciero.Microfinanzas.CalificacionEntidad.Entidades>();
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
                protected List<SistemaFinanciero.Microfinanzas.CalificacionEntidad.Entidades.Entidad> entidad;
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
                 * {@link SistemaFinanciero.Microfinanzas.CalificacionEntidad.Entidades.Entidad }
                 * 
                 * 
                 */
                public List<SistemaFinanciero.Microfinanzas.CalificacionEntidad.Entidades.Entidad> getEntidad() {
                    if (entidad == null) {
                        entidad = new ArrayList<SistemaFinanciero.Microfinanzas.CalificacionEntidad.Entidades.Entidad>();
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
            protected List<SistemaFinanciero.Microfinanzas.Periodos.Periodo> periodo;

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
             * {@link SistemaFinanciero.Microfinanzas.Periodos.Periodo }
             * 
             * 
             */
            public List<SistemaFinanciero.Microfinanzas.Periodos.Periodo> getPeriodo() {
                if (periodo == null) {
                    periodo = new ArrayList<SistemaFinanciero.Microfinanzas.Periodos.Periodo>();
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
                protected SistemaFinanciero.Microfinanzas.Periodos.Periodo.Calificaciones calificaciones;
                @XmlElement(name = "Deudas")
                protected SistemaFinanciero.Microfinanzas.Periodos.Periodo.Deudas deudas;
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
                 *     {@link SistemaFinanciero.Microfinanzas.Periodos.Periodo.Calificaciones }
                 *     
                 */
                public SistemaFinanciero.Microfinanzas.Periodos.Periodo.Calificaciones getCalificaciones() {
                    return calificaciones;
                }

                /**
                 * Define el valor de la propiedad calificaciones.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SistemaFinanciero.Microfinanzas.Periodos.Periodo.Calificaciones }
                 *     
                 */
                public void setCalificaciones(SistemaFinanciero.Microfinanzas.Periodos.Periodo.Calificaciones value) {
                    this.calificaciones = value;
                }

                /**
                 * Obtiene el valor de la propiedad deudas.
                 * 
                 * @return
                 *     possible object is
                 *     {@link SistemaFinanciero.Microfinanzas.Periodos.Periodo.Deudas }
                 *     
                 */
                public SistemaFinanciero.Microfinanzas.Periodos.Periodo.Deudas getDeudas() {
                    return deudas;
                }

                /**
                 * Define el valor de la propiedad deudas.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SistemaFinanciero.Microfinanzas.Periodos.Periodo.Deudas }
                 *     
                 */
                public void setDeudas(SistemaFinanciero.Microfinanzas.Periodos.Periodo.Deudas value) {
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
                    protected List<SistemaFinanciero.Microfinanzas.Periodos.Periodo.Deudas.Deuda> deuda;

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
                     * {@link SistemaFinanciero.Microfinanzas.Periodos.Periodo.Deudas.Deuda }
                     * 
                     * 
                     */
                    public List<SistemaFinanciero.Microfinanzas.Periodos.Periodo.Deudas.Deuda> getDeuda() {
                        if (deuda == null) {
                            deuda = new ArrayList<SistemaFinanciero.Microfinanzas.Periodos.Periodo.Deudas.Deuda>();
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
     *         &lt;element name="DetalleEntidades" minOccurs="0"&gt;
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
     *                             &lt;element name="CreditosVigentes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="CreditosRefinanciados" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="CreditosVencidos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="CreditosJudicial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
     *                                                 &lt;element name="CodigoCuenta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                                 &lt;element name="NombreCuenta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                                 &lt;element name="DescripcionCuenta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                                 &lt;element name="CodigoEntidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                                 &lt;element name="NombreEntidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                                 &lt;element name="Calificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                                 &lt;element name="Monto" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                                                 &lt;element name="Moneda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "detalleEntidades",
        "periodos"
    })
    public static class RCC {

        @XmlElementRef(name = "DetalleEntidades", type = JAXBElement.class, required = false)
        protected JAXBElement<SistemaFinanciero.RCC.DetalleEntidades> detalleEntidades;
        @XmlElementRef(name = "Periodos", type = JAXBElement.class, required = false)
        protected JAXBElement<SistemaFinanciero.RCC.Periodos> periodos;

        /**
         * Obtiene el valor de la propiedad detalleEntidades.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link SistemaFinanciero.RCC.DetalleEntidades }{@code >}
         *     
         */
        public JAXBElement<SistemaFinanciero.RCC.DetalleEntidades> getDetalleEntidades() {
            return detalleEntidades;
        }

        /**
         * Define el valor de la propiedad detalleEntidades.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link SistemaFinanciero.RCC.DetalleEntidades }{@code >}
         *     
         */
        public void setDetalleEntidades(JAXBElement<SistemaFinanciero.RCC.DetalleEntidades> value) {
            this.detalleEntidades = value;
        }

        /**
         * Obtiene el valor de la propiedad periodos.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link SistemaFinanciero.RCC.Periodos }{@code >}
         *     
         */
        public JAXBElement<SistemaFinanciero.RCC.Periodos> getPeriodos() {
            return periodos;
        }

        /**
         * Define el valor de la propiedad periodos.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link SistemaFinanciero.RCC.Periodos }{@code >}
         *     
         */
        public void setPeriodos(JAXBElement<SistemaFinanciero.RCC.Periodos> value) {
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
         *         &lt;element name="Entidad" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="Calificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="CreditosVigentes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="CreditosRefinanciados" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="CreditosVencidos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="CreditosJudicial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "entidad"
        })
        public static class DetalleEntidades {

            @XmlElement(name = "Entidad", nillable = true)
            protected List<SistemaFinanciero.RCC.DetalleEntidades.Entidad> entidad;
            @XmlAttribute(name = "periodo")
            protected String periodo;

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
             * {@link SistemaFinanciero.RCC.DetalleEntidades.Entidad }
             * 
             * 
             */
            public List<SistemaFinanciero.RCC.DetalleEntidades.Entidad> getEntidad() {
                if (entidad == null) {
                    entidad = new ArrayList<SistemaFinanciero.RCC.DetalleEntidades.Entidad>();
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
             *         &lt;element name="CreditosVigentes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;element name="CreditosRefinanciados" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;element name="CreditosVencidos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;element name="CreditosJudicial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
                "calificacion",
                "creditosVigentes",
                "creditosRefinanciados",
                "creditosVencidos",
                "creditosJudicial"
            })
            public static class Entidad {

                @XmlElementRef(name = "Codigo", type = JAXBElement.class, required = false)
                protected JAXBElement<String> codigo;
                @XmlElementRef(name = "Nombre", type = JAXBElement.class, required = false)
                protected JAXBElement<String> nombre;
                @XmlElementRef(name = "Calificacion", type = JAXBElement.class, required = false)
                protected JAXBElement<String> calificacion;
                @XmlElementRef(name = "CreditosVigentes", type = JAXBElement.class, required = false)
                protected JAXBElement<String> creditosVigentes;
                @XmlElementRef(name = "CreditosRefinanciados", type = JAXBElement.class, required = false)
                protected JAXBElement<String> creditosRefinanciados;
                @XmlElementRef(name = "CreditosVencidos", type = JAXBElement.class, required = false)
                protected JAXBElement<String> creditosVencidos;
                @XmlElementRef(name = "CreditosJudicial", type = JAXBElement.class, required = false)
                protected JAXBElement<String> creditosJudicial;

                /**
                 * Obtiene el valor de la propiedad codigo.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *     
                 */
                public JAXBElement<String> getCodigo() {
                    return codigo;
                }

                /**
                 * Define el valor de la propiedad codigo.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *     
                 */
                public void setCodigo(JAXBElement<String> value) {
                    this.codigo = value;
                }

                /**
                 * Obtiene el valor de la propiedad nombre.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *     
                 */
                public JAXBElement<String> getNombre() {
                    return nombre;
                }

                /**
                 * Define el valor de la propiedad nombre.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *     
                 */
                public void setNombre(JAXBElement<String> value) {
                    this.nombre = value;
                }

                /**
                 * Obtiene el valor de la propiedad calificacion.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *     
                 */
                public JAXBElement<String> getCalificacion() {
                    return calificacion;
                }

                /**
                 * Define el valor de la propiedad calificacion.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *     
                 */
                public void setCalificacion(JAXBElement<String> value) {
                    this.calificacion = value;
                }

                /**
                 * Obtiene el valor de la propiedad creditosVigentes.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *     
                 */
                public JAXBElement<String> getCreditosVigentes() {
                    return creditosVigentes;
                }

                /**
                 * Define el valor de la propiedad creditosVigentes.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *     
                 */
                public void setCreditosVigentes(JAXBElement<String> value) {
                    this.creditosVigentes = value;
                }

                /**
                 * Obtiene el valor de la propiedad creditosRefinanciados.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *     
                 */
                public JAXBElement<String> getCreditosRefinanciados() {
                    return creditosRefinanciados;
                }

                /**
                 * Define el valor de la propiedad creditosRefinanciados.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *     
                 */
                public void setCreditosRefinanciados(JAXBElement<String> value) {
                    this.creditosRefinanciados = value;
                }

                /**
                 * Obtiene el valor de la propiedad creditosVencidos.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *     
                 */
                public JAXBElement<String> getCreditosVencidos() {
                    return creditosVencidos;
                }

                /**
                 * Define el valor de la propiedad creditosVencidos.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *     
                 */
                public void setCreditosVencidos(JAXBElement<String> value) {
                    this.creditosVencidos = value;
                }

                /**
                 * Obtiene el valor de la propiedad creditosJudicial.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *     
                 */
                public JAXBElement<String> getCreditosJudicial() {
                    return creditosJudicial;
                }

                /**
                 * Define el valor de la propiedad creditosJudicial.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *     
                 */
                public void setCreditosJudicial(JAXBElement<String> value) {
                    this.creditosJudicial = value;
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
         *                                       &lt;element name="CodigoCuenta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                                       &lt;element name="NombreCuenta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                                       &lt;element name="DescripcionCuenta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                                       &lt;element name="CodigoEntidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                                       &lt;element name="NombreEntidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                                       &lt;element name="Calificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                                       &lt;element name="Monto" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *                                       &lt;element name="Moneda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            protected List<SistemaFinanciero.RCC.Periodos.Periodo> periodo;

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
             * {@link SistemaFinanciero.RCC.Periodos.Periodo }
             * 
             * 
             */
            public List<SistemaFinanciero.RCC.Periodos.Periodo> getPeriodo() {
                if (periodo == null) {
                    periodo = new ArrayList<SistemaFinanciero.RCC.Periodos.Periodo>();
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
             *                             &lt;element name="CodigoCuenta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                             &lt;element name="NombreCuenta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                             &lt;element name="DescripcionCuenta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                             &lt;element name="CodigoEntidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                             &lt;element name="NombreEntidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                             &lt;element name="Calificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                             &lt;element name="Monto" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
             *                             &lt;element name="Moneda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
                protected SistemaFinanciero.RCC.Periodos.Periodo.Calificaciones calificaciones;
                @XmlElement(name = "Deudas")
                protected SistemaFinanciero.RCC.Periodos.Periodo.Deudas deudas;
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
                 *     {@link SistemaFinanciero.RCC.Periodos.Periodo.Calificaciones }
                 *     
                 */
                public SistemaFinanciero.RCC.Periodos.Periodo.Calificaciones getCalificaciones() {
                    return calificaciones;
                }

                /**
                 * Define el valor de la propiedad calificaciones.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SistemaFinanciero.RCC.Periodos.Periodo.Calificaciones }
                 *     
                 */
                public void setCalificaciones(SistemaFinanciero.RCC.Periodos.Periodo.Calificaciones value) {
                    this.calificaciones = value;
                }

                /**
                 * Obtiene el valor de la propiedad deudas.
                 * 
                 * @return
                 *     possible object is
                 *     {@link SistemaFinanciero.RCC.Periodos.Periodo.Deudas }
                 *     
                 */
                public SistemaFinanciero.RCC.Periodos.Periodo.Deudas getDeudas() {
                    return deudas;
                }

                /**
                 * Define el valor de la propiedad deudas.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SistemaFinanciero.RCC.Periodos.Periodo.Deudas }
                 *     
                 */
                public void setDeudas(SistemaFinanciero.RCC.Periodos.Periodo.Deudas value) {
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
                 *                   &lt;element name="CodigoCuenta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *                   &lt;element name="NombreCuenta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *                   &lt;element name="DescripcionCuenta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *                   &lt;element name="CodigoEntidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *                   &lt;element name="NombreEntidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *                   &lt;element name="Calificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *                   &lt;element name="Monto" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
                 *                   &lt;element name="Moneda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
                    protected List<SistemaFinanciero.RCC.Periodos.Periodo.Deudas.Deuda> deuda;

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
                     * {@link SistemaFinanciero.RCC.Periodos.Periodo.Deudas.Deuda }
                     * 
                     * 
                     */
                    public List<SistemaFinanciero.RCC.Periodos.Periodo.Deudas.Deuda> getDeuda() {
                        if (deuda == null) {
                            deuda = new ArrayList<SistemaFinanciero.RCC.Periodos.Periodo.Deudas.Deuda>();
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
                     *         &lt;element name="CodigoCuenta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                     *         &lt;element name="NombreCuenta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                     *         &lt;element name="DescripcionCuenta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                     *         &lt;element name="CodigoEntidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                     *         &lt;element name="NombreEntidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                     *         &lt;element name="Calificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                     *         &lt;element name="Monto" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
                     *         &lt;element name="Moneda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
                        "codigoCuenta",
                        "nombreCuenta",
                        "descripcionCuenta",
                        "codigoEntidad",
                        "nombreEntidad",
                        "calificacion",
                        "monto",
                        "moneda"
                    })
                    public static class Deuda {

                        @XmlElementRef(name = "CodigoCuenta", type = JAXBElement.class, required = false)
                        protected JAXBElement<String> codigoCuenta;
                        @XmlElementRef(name = "NombreCuenta", type = JAXBElement.class, required = false)
                        protected JAXBElement<String> nombreCuenta;
                        @XmlElementRef(name = "DescripcionCuenta", type = JAXBElement.class, required = false)
                        protected JAXBElement<String> descripcionCuenta;
                        @XmlElementRef(name = "CodigoEntidad", type = JAXBElement.class, required = false)
                        protected JAXBElement<String> codigoEntidad;
                        @XmlElementRef(name = "NombreEntidad", type = JAXBElement.class, required = false)
                        protected JAXBElement<String> nombreEntidad;
                        @XmlElementRef(name = "Calificacion", type = JAXBElement.class, required = false)
                        protected JAXBElement<String> calificacion;
                        @XmlElementRef(name = "Monto", type = JAXBElement.class, required = false)
                        protected JAXBElement<BigDecimal> monto;
                        @XmlElement(name = "Moneda")
                        protected String moneda;

                        /**
                         * Obtiene el valor de la propiedad codigoCuenta.
                         * 
                         * @return
                         *     possible object is
                         *     {@link JAXBElement }{@code <}{@link String }{@code >}
                         *     
                         */
                        public JAXBElement<String> getCodigoCuenta() {
                            return codigoCuenta;
                        }

                        /**
                         * Define el valor de la propiedad codigoCuenta.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link JAXBElement }{@code <}{@link String }{@code >}
                         *     
                         */
                        public void setCodigoCuenta(JAXBElement<String> value) {
                            this.codigoCuenta = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad nombreCuenta.
                         * 
                         * @return
                         *     possible object is
                         *     {@link JAXBElement }{@code <}{@link String }{@code >}
                         *     
                         */
                        public JAXBElement<String> getNombreCuenta() {
                            return nombreCuenta;
                        }

                        /**
                         * Define el valor de la propiedad nombreCuenta.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link JAXBElement }{@code <}{@link String }{@code >}
                         *     
                         */
                        public void setNombreCuenta(JAXBElement<String> value) {
                            this.nombreCuenta = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad descripcionCuenta.
                         * 
                         * @return
                         *     possible object is
                         *     {@link JAXBElement }{@code <}{@link String }{@code >}
                         *     
                         */
                        public JAXBElement<String> getDescripcionCuenta() {
                            return descripcionCuenta;
                        }

                        /**
                         * Define el valor de la propiedad descripcionCuenta.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link JAXBElement }{@code <}{@link String }{@code >}
                         *     
                         */
                        public void setDescripcionCuenta(JAXBElement<String> value) {
                            this.descripcionCuenta = value;
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
                         * Obtiene el valor de la propiedad calificacion.
                         * 
                         * @return
                         *     possible object is
                         *     {@link JAXBElement }{@code <}{@link String }{@code >}
                         *     
                         */
                        public JAXBElement<String> getCalificacion() {
                            return calificacion;
                        }

                        /**
                         * Define el valor de la propiedad calificacion.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link JAXBElement }{@code <}{@link String }{@code >}
                         *     
                         */
                        public void setCalificacion(JAXBElement<String> value) {
                            this.calificacion = value;
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
                         * Obtiene el valor de la propiedad moneda.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getMoneda() {
                            return moneda;
                        }

                        /**
                         * Define el valor de la propiedad moneda.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setMoneda(String value) {
                            this.moneda = value;
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
     *         &lt;element name="Rectificacion" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
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
     *                                       &lt;element name="Codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                       &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                       &lt;element name="Detalles" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;sequence&gt;
     *                                                 &lt;element name="Detalle" maxOccurs="unbounded" minOccurs="0"&gt;
     *                                                   &lt;complexType&gt;
     *                                                     &lt;complexContent&gt;
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                                         &lt;sequence&gt;
     *                                                           &lt;element name="Concepto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                                           &lt;element name="Dice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                                           &lt;element name="Debedecir" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "rectificacion"
    })
    public static class Rectificaciones {

        @XmlElement(name = "Rectificacion")
        protected List<SistemaFinanciero.Rectificaciones.Rectificacion> rectificacion;

        /**
         * Gets the value of the rectificacion property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the rectificacion property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRectificacion().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SistemaFinanciero.Rectificaciones.Rectificacion }
         * 
         * 
         */
        public List<SistemaFinanciero.Rectificaciones.Rectificacion> getRectificacion() {
            if (rectificacion == null) {
                rectificacion = new ArrayList<SistemaFinanciero.Rectificaciones.Rectificacion>();
            }
            return this.rectificacion;
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
         *                             &lt;element name="Codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                             &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                             &lt;element name="Detalles" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;sequence&gt;
         *                                       &lt;element name="Detalle" maxOccurs="unbounded" minOccurs="0"&gt;
         *                                         &lt;complexType&gt;
         *                                           &lt;complexContent&gt;
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                               &lt;sequence&gt;
         *                                                 &lt;element name="Concepto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                                                 &lt;element name="Dice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                                                 &lt;element name="Debedecir" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "entidades"
        })
        public static class Rectificacion {

            @XmlElementRef(name = "Entidades", type = JAXBElement.class, required = false)
            protected JAXBElement<SistemaFinanciero.Rectificaciones.Rectificacion.Entidades> entidades;
            @XmlAttribute(name = "periodo")
            protected String periodo;

            /**
             * Obtiene el valor de la propiedad entidades.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link SistemaFinanciero.Rectificaciones.Rectificacion.Entidades }{@code >}
             *     
             */
            public JAXBElement<SistemaFinanciero.Rectificaciones.Rectificacion.Entidades> getEntidades() {
                return entidades;
            }

            /**
             * Define el valor de la propiedad entidades.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link SistemaFinanciero.Rectificaciones.Rectificacion.Entidades }{@code >}
             *     
             */
            public void setEntidades(JAXBElement<SistemaFinanciero.Rectificaciones.Rectificacion.Entidades> value) {
                this.entidades = value;
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
             *         &lt;element name="Entidad" maxOccurs="unbounded" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="Codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                   &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                   &lt;element name="Detalles" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;sequence&gt;
             *                             &lt;element name="Detalle" maxOccurs="unbounded" minOccurs="0"&gt;
             *                               &lt;complexType&gt;
             *                                 &lt;complexContent&gt;
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                                     &lt;sequence&gt;
             *                                       &lt;element name="Concepto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                                       &lt;element name="Dice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                                       &lt;element name="Debedecir" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
                "entidad"
            })
            public static class Entidades {

                @XmlElement(name = "Entidad")
                protected List<SistemaFinanciero.Rectificaciones.Rectificacion.Entidades.Entidad> entidad;

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
                 * {@link SistemaFinanciero.Rectificaciones.Rectificacion.Entidades.Entidad }
                 * 
                 * 
                 */
                public List<SistemaFinanciero.Rectificaciones.Rectificacion.Entidades.Entidad> getEntidad() {
                    if (entidad == null) {
                        entidad = new ArrayList<SistemaFinanciero.Rectificaciones.Rectificacion.Entidades.Entidad>();
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
                 *         &lt;element name="Codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *         &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *         &lt;element name="Detalles" minOccurs="0"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;sequence&gt;
                 *                   &lt;element name="Detalle" maxOccurs="unbounded" minOccurs="0"&gt;
                 *                     &lt;complexType&gt;
                 *                       &lt;complexContent&gt;
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                           &lt;sequence&gt;
                 *                             &lt;element name="Concepto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *                             &lt;element name="Dice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *                             &lt;element name="Debedecir" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
                    "codigo",
                    "nombre",
                    "detalles"
                })
                public static class Entidad {

                    @XmlElementRef(name = "Codigo", type = JAXBElement.class, required = false)
                    protected JAXBElement<String> codigo;
                    @XmlElementRef(name = "Nombre", type = JAXBElement.class, required = false)
                    protected JAXBElement<String> nombre;
                    @XmlElementRef(name = "Detalles", type = JAXBElement.class, required = false)
                    protected JAXBElement<SistemaFinanciero.Rectificaciones.Rectificacion.Entidades.Entidad.Detalles> detalles;

                    /**
                     * Obtiene el valor de la propiedad codigo.
                     * 
                     * @return
                     *     possible object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    public JAXBElement<String> getCodigo() {
                        return codigo;
                    }

                    /**
                     * Define el valor de la propiedad codigo.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    public void setCodigo(JAXBElement<String> value) {
                        this.codigo = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad nombre.
                     * 
                     * @return
                     *     possible object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    public JAXBElement<String> getNombre() {
                        return nombre;
                    }

                    /**
                     * Define el valor de la propiedad nombre.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    public void setNombre(JAXBElement<String> value) {
                        this.nombre = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad detalles.
                     * 
                     * @return
                     *     possible object is
                     *     {@link JAXBElement }{@code <}{@link SistemaFinanciero.Rectificaciones.Rectificacion.Entidades.Entidad.Detalles }{@code >}
                     *     
                     */
                    public JAXBElement<SistemaFinanciero.Rectificaciones.Rectificacion.Entidades.Entidad.Detalles> getDetalles() {
                        return detalles;
                    }

                    /**
                     * Define el valor de la propiedad detalles.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link JAXBElement }{@code <}{@link SistemaFinanciero.Rectificaciones.Rectificacion.Entidades.Entidad.Detalles }{@code >}
                     *     
                     */
                    public void setDetalles(JAXBElement<SistemaFinanciero.Rectificaciones.Rectificacion.Entidades.Entidad.Detalles> value) {
                        this.detalles = value;
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
                     *         &lt;element name="Detalle" maxOccurs="unbounded" minOccurs="0"&gt;
                     *           &lt;complexType&gt;
                     *             &lt;complexContent&gt;
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                     *                 &lt;sequence&gt;
                     *                   &lt;element name="Concepto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                     *                   &lt;element name="Dice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                     *                   &lt;element name="Debedecir" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
                        "detalle"
                    })
                    public static class Detalles {

                        @XmlElement(name = "Detalle", nillable = true)
                        protected List<SistemaFinanciero.Rectificaciones.Rectificacion.Entidades.Entidad.Detalles.Detalle> detalle;

                        /**
                         * Gets the value of the detalle property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the detalle property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getDetalle().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link SistemaFinanciero.Rectificaciones.Rectificacion.Entidades.Entidad.Detalles.Detalle }
                         * 
                         * 
                         */
                        public List<SistemaFinanciero.Rectificaciones.Rectificacion.Entidades.Entidad.Detalles.Detalle> getDetalle() {
                            if (detalle == null) {
                                detalle = new ArrayList<SistemaFinanciero.Rectificaciones.Rectificacion.Entidades.Entidad.Detalles.Detalle>();
                            }
                            return this.detalle;
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
                         *         &lt;element name="Concepto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                         *         &lt;element name="Dice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                         *         &lt;element name="Debedecir" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
                            "concepto",
                            "dice",
                            "debedecir"
                        })
                        public static class Detalle {

                            @XmlElementRef(name = "Concepto", type = JAXBElement.class, required = false)
                            protected JAXBElement<String> concepto;
                            @XmlElementRef(name = "Dice", type = JAXBElement.class, required = false)
                            protected JAXBElement<String> dice;
                            @XmlElementRef(name = "Debedecir", type = JAXBElement.class, required = false)
                            protected JAXBElement<String> debedecir;

                            /**
                             * Obtiene el valor de la propiedad concepto.
                             * 
                             * @return
                             *     possible object is
                             *     {@link JAXBElement }{@code <}{@link String }{@code >}
                             *     
                             */
                            public JAXBElement<String> getConcepto() {
                                return concepto;
                            }

                            /**
                             * Define el valor de la propiedad concepto.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link JAXBElement }{@code <}{@link String }{@code >}
                             *     
                             */
                            public void setConcepto(JAXBElement<String> value) {
                                this.concepto = value;
                            }

                            /**
                             * Obtiene el valor de la propiedad dice.
                             * 
                             * @return
                             *     possible object is
                             *     {@link JAXBElement }{@code <}{@link String }{@code >}
                             *     
                             */
                            public JAXBElement<String> getDice() {
                                return dice;
                            }

                            /**
                             * Define el valor de la propiedad dice.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link JAXBElement }{@code <}{@link String }{@code >}
                             *     
                             */
                            public void setDice(JAXBElement<String> value) {
                                this.dice = value;
                            }

                            /**
                             * Obtiene el valor de la propiedad debedecir.
                             * 
                             * @return
                             *     possible object is
                             *     {@link JAXBElement }{@code <}{@link String }{@code >}
                             *     
                             */
                            public JAXBElement<String> getDebedecir() {
                                return debedecir;
                            }

                            /**
                             * Define el valor de la propiedad debedecir.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link JAXBElement }{@code <}{@link String }{@code >}
                             *     
                             */
                            public void setDebedecir(JAXBElement<String> value) {
                                this.debedecir = value;
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
     *         &lt;element name="Semaforo" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="NoTieneImpagos" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
     *                   &lt;element name="TieneDeudasAtrasadas" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
     *                   &lt;element name="TieneDeudasImpagasInfocorp" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
     *                   &lt;element name="InformacionNoDisponible" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
     *                   &lt;element name="DiasAtraso" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
        "semaforo"
    })
    public static class ResumenComportamientoPago {

        @XmlElement(name = "Semaforo")
        protected List<SistemaFinanciero.ResumenComportamientoPago.Semaforo> semaforo;

        /**
         * Gets the value of the semaforo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the semaforo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSemaforo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SistemaFinanciero.ResumenComportamientoPago.Semaforo }
         * 
         * 
         */
        public List<SistemaFinanciero.ResumenComportamientoPago.Semaforo> getSemaforo() {
            if (semaforo == null) {
                semaforo = new ArrayList<SistemaFinanciero.ResumenComportamientoPago.Semaforo>();
            }
            return this.semaforo;
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
         *         &lt;element name="NoTieneImpagos" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
         *         &lt;element name="TieneDeudasAtrasadas" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
         *         &lt;element name="TieneDeudasImpagasInfocorp" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
         *         &lt;element name="InformacionNoDisponible" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
         *         &lt;element name="DiasAtraso" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
            "noTieneImpagos",
            "tieneDeudasAtrasadas",
            "tieneDeudasImpagasInfocorp",
            "informacionNoDisponible",
            "diasAtraso"
        })
        public static class Semaforo {

            @XmlElement(name = "NoTieneImpagos")
            protected boolean noTieneImpagos;
            @XmlElement(name = "TieneDeudasAtrasadas")
            protected boolean tieneDeudasAtrasadas;
            @XmlElement(name = "TieneDeudasImpagasInfocorp")
            protected boolean tieneDeudasImpagasInfocorp;
            @XmlElement(name = "InformacionNoDisponible")
            protected boolean informacionNoDisponible;
            @XmlElement(name = "DiasAtraso")
            protected int diasAtraso;
            @XmlAttribute(name = "periodo")
            protected String periodo;

            /**
             * Obtiene el valor de la propiedad noTieneImpagos.
             * 
             */
            public boolean isNoTieneImpagos() {
                return noTieneImpagos;
            }

            /**
             * Define el valor de la propiedad noTieneImpagos.
             * 
             */
            public void setNoTieneImpagos(boolean value) {
                this.noTieneImpagos = value;
            }

            /**
             * Obtiene el valor de la propiedad tieneDeudasAtrasadas.
             * 
             */
            public boolean isTieneDeudasAtrasadas() {
                return tieneDeudasAtrasadas;
            }

            /**
             * Define el valor de la propiedad tieneDeudasAtrasadas.
             * 
             */
            public void setTieneDeudasAtrasadas(boolean value) {
                this.tieneDeudasAtrasadas = value;
            }

            /**
             * Obtiene el valor de la propiedad tieneDeudasImpagasInfocorp.
             * 
             */
            public boolean isTieneDeudasImpagasInfocorp() {
                return tieneDeudasImpagasInfocorp;
            }

            /**
             * Define el valor de la propiedad tieneDeudasImpagasInfocorp.
             * 
             */
            public void setTieneDeudasImpagasInfocorp(boolean value) {
                this.tieneDeudasImpagasInfocorp = value;
            }

            /**
             * Obtiene el valor de la propiedad informacionNoDisponible.
             * 
             */
            public boolean isInformacionNoDisponible() {
                return informacionNoDisponible;
            }

            /**
             * Define el valor de la propiedad informacionNoDisponible.
             * 
             */
            public void setInformacionNoDisponible(boolean value) {
                this.informacionNoDisponible = value;
            }

            /**
             * Obtiene el valor de la propiedad diasAtraso.
             * 
             */
            public int getDiasAtraso() {
                return diasAtraso;
            }

            /**
             * Define el valor de la propiedad diasAtraso.
             * 
             */
            public void setDiasAtraso(int value) {
                this.diasAtraso = value;
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
