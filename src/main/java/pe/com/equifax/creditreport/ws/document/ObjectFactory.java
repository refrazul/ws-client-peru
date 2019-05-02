
package pe.com.equifax.creditreport.ws.document;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pe.com.equifax.creditreport.ws.document package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ConsultaHistorica_QNAME = new QName("http://ws.creditreport.equifax.com.pe/document", "ConsultaHistorica");
    private final static QName _DatosConsulta_QNAME = new QName("http://ws.creditreport.equifax.com.pe/document", "DatosConsulta");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pe.com.equifax.creditreport.ws.document
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Reporte }
     * 
     */
    public Reporte createReporte() {
        return new Reporte();
    }

    /**
     * Create an instance of {@link ReporteCrediticio }
     * 
     */
    public ReporteCrediticio createReporteCrediticio() {
        return new ReporteCrediticio();
    }

    /**
     * Create an instance of {@link ReporteCrediticio.Modulos }
     * 
     */
    public ReporteCrediticio.Modulos createReporteCrediticioModulos() {
        return new ReporteCrediticio.Modulos();
    }

    /**
     * Create an instance of {@link ReporteCrediticio.Modulos.Modulo }
     * 
     */
    public ReporteCrediticio.Modulos.Modulo createReporteCrediticioModulosModulo() {
        return new ReporteCrediticio.Modulos.Modulo();
    }

    /**
     * Create an instance of {@link Reporte.Modulos }
     * 
     */
    public Reporte.Modulos createReporteModulos() {
        return new Reporte.Modulos();
    }

    /**
     * Create an instance of {@link Reporte.Modulos.Modulo }
     * 
     */
    public Reporte.Modulos.Modulo createReporteModulosModulo() {
        return new Reporte.Modulos.Modulo();
    }

    /**
     * Create an instance of {@link HistoricType }
     * 
     */
    public HistoricType createHistoricType() {
        return new HistoricType();
    }

    /**
     * Create an instance of {@link QueryDataType }
     * 
     */
    public QueryDataType createQueryDataType() {
        return new QueryDataType();
    }

    /**
     * Create an instance of {@link Reporte.DatosPrincipales }
     * 
     */
    public Reporte.DatosPrincipales createReporteDatosPrincipales() {
        return new Reporte.DatosPrincipales();
    }

    /**
     * Create an instance of {@link ReporteCrediticio.DatosPrincipales }
     * 
     */
    public ReporteCrediticio.DatosPrincipales createReporteCrediticioDatosPrincipales() {
        return new ReporteCrediticio.DatosPrincipales();
    }

    /**
     * Create an instance of {@link ReporteCrediticio.Modulos.Modulo.Data }
     * 
     */
    public ReporteCrediticio.Modulos.Modulo.Data createReporteCrediticioModulosModuloData() {
        return new ReporteCrediticio.Modulos.Modulo.Data();
    }

    /**
     * Create an instance of {@link Reporte.Modulos.Modulo.Data }
     * 
     */
    public Reporte.Modulos.Modulo.Data createReporteModulosModuloData() {
        return new Reporte.Modulos.Modulo.Data();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HistoricType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.creditreport.equifax.com.pe/document", name = "ConsultaHistorica")
    public JAXBElement<HistoricType> createConsultaHistorica(HistoricType value) {
        return new JAXBElement<HistoricType>(_ConsultaHistorica_QNAME, HistoricType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.creditreport.equifax.com.pe/document", name = "DatosConsulta")
    public JAXBElement<QueryDataType> createDatosConsulta(QueryDataType value) {
        return new JAXBElement<QueryDataType>(_DatosConsulta_QNAME, QueryDataType.class, null, value);
    }

}
