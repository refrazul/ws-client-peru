
package pe.com.equifax.creditreport.ws.endpoint;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para statusResponse.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="statusResponse"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="RSP_SUCCESS"/&gt;
 *     &lt;enumeration value="RSP_ERROR"/&gt;
 *     &lt;enumeration value="RSP_EC"/&gt;
 *     &lt;enumeration value="RSP_EC_SERV_NOT_AVAILABLE"/&gt;
 *     &lt;enumeration value="RSP_EC_SERV_CA_NOT_AVAILABLE"/&gt;
 *     &lt;enumeration value="RSP_EC_SERV_PM_NOT_AVAILABLE"/&gt;
 *     &lt;enumeration value="RSP_EC_SERV_OP2_NOT_AVAILABLE"/&gt;
 *     &lt;enumeration value="RSP_EC_SERV_EMAIL_NOT_AVAILABLE"/&gt;
 *     &lt;enumeration value="RSP_EC_SERV_IDV_NOT_AVAILABLE"/&gt;
 *     &lt;enumeration value="RSP_EC_SERV_EXPERT_NOT_AVAILABLE"/&gt;
 *     &lt;enumeration value="RSP_EC_SERV_DAS_NOT_AVAILABLE"/&gt;
 *     &lt;enumeration value="RSP_EC_SERV_RIO_NOT_AVAILABLE"/&gt;
 *     &lt;enumeration value="RSP_EC_SERV_DF_NOT_AVAILABLE"/&gt;
 *     &lt;enumeration value="RSP_EC_REQ_INCORRECT"/&gt;
 *     &lt;enumeration value="RSP_EC_REQ_HEADER_INCORRECT"/&gt;
 *     &lt;enumeration value="RSP_EC_REQ_NOT_AUTHENTICATED"/&gt;
 *     &lt;enumeration value="RSP_EC_REQ_NOT_AUTHORIZED"/&gt;
 *     &lt;enumeration value="RSP_EC_REQ_TIMEOUT"/&gt;
 *     &lt;enumeration value="RSP_EC_REQ_VERY_BIG"/&gt;
 *     &lt;enumeration value="RSP_EC_REQ_URL_VERY_LONG"/&gt;
 *     &lt;enumeration value="RSP_EC_REQ_MEDIA_TYPE_INCORRECT"/&gt;
 *     &lt;enumeration value="RSP_EI"/&gt;
 *     &lt;enumeration value="RSP_EI_VALUES_NULL"/&gt;
 *     &lt;enumeration value="RSP_EI_CA_TOKEN_NULL"/&gt;
 *     &lt;enumeration value="RSP_EI_OP2_COD_ENTI_NULL"/&gt;
 *     &lt;enumeration value="RSP_EI_VALUES_EMPTY"/&gt;
 *     &lt;enumeration value="RSP_EI_CA_TOKEN_EMPTY"/&gt;
 *     &lt;enumeration value="RSP_EI_VALUES_INCORRECT"/&gt;
 *     &lt;enumeration value="RSP_EI_CA_TOKEN_INCORRECT"/&gt;
 *     &lt;enumeration value="RSP_EI_CA_USER_INCORRECT"/&gt;
 *     &lt;enumeration value="RSP_EI_CA_PWD_INCORRECT"/&gt;
 *     &lt;enumeration value="RSP_EI_SESSION_INVALID"/&gt;
 *     &lt;enumeration value="RSP_EI_COOKIES_INVALID"/&gt;
 *     &lt;enumeration value="RSP_EI_SESSION_EXPIRED"/&gt;
 *     &lt;enumeration value="RSP_EI_IP_NO_AUTHORIZED"/&gt;
 *     &lt;enumeration value="RSP_EI_PARAMS_INCORRECT"/&gt;
 *     &lt;enumeration value="RSP_EB"/&gt;
 *     &lt;enumeration value="RSP_EB_BUSINESS_RULE_INCORRECT"/&gt;
 *     &lt;enumeration value="RSP_EB_OPERATION_INCORRECT"/&gt;
 *     &lt;enumeration value="RSP_EB_FILE_NOT_GENERATE"/&gt;
 *     &lt;enumeration value="RSP_ED"/&gt;
 *     &lt;enumeration value="RSP_ED_DATASOURCE_NOT_FOUND"/&gt;
 *     &lt;enumeration value="RSP_ED_DATASOURCE_NOT_GET"/&gt;
 *     &lt;enumeration value="RSP_ED_DATASOURCE_NOT_INSERT"/&gt;
 *     &lt;enumeration value="RSP_ED_DATASOURCE_NOT_DELETE"/&gt;
 *     &lt;enumeration value="RSP_ED_DATASOURCE_NOT_UPDATE"/&gt;
 *     &lt;enumeration value="RSP_ED_DATASOURCE_TIMEOUT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "statusResponse")
@XmlEnum
public enum StatusResponse {

    RSP_SUCCESS("RSP_SUCCESS"),
    RSP_ERROR("RSP_ERROR"),
    RSP_EC("RSP_EC"),
    RSP_EC_SERV_NOT_AVAILABLE("RSP_EC_SERV_NOT_AVAILABLE"),
    RSP_EC_SERV_CA_NOT_AVAILABLE("RSP_EC_SERV_CA_NOT_AVAILABLE"),
    RSP_EC_SERV_PM_NOT_AVAILABLE("RSP_EC_SERV_PM_NOT_AVAILABLE"),
    @XmlEnumValue("RSP_EC_SERV_OP2_NOT_AVAILABLE")
    RSP_EC_SERV_OP_2_NOT_AVAILABLE("RSP_EC_SERV_OP2_NOT_AVAILABLE"),
    RSP_EC_SERV_EMAIL_NOT_AVAILABLE("RSP_EC_SERV_EMAIL_NOT_AVAILABLE"),
    RSP_EC_SERV_IDV_NOT_AVAILABLE("RSP_EC_SERV_IDV_NOT_AVAILABLE"),
    RSP_EC_SERV_EXPERT_NOT_AVAILABLE("RSP_EC_SERV_EXPERT_NOT_AVAILABLE"),
    RSP_EC_SERV_DAS_NOT_AVAILABLE("RSP_EC_SERV_DAS_NOT_AVAILABLE"),
    RSP_EC_SERV_RIO_NOT_AVAILABLE("RSP_EC_SERV_RIO_NOT_AVAILABLE"),
    RSP_EC_SERV_DF_NOT_AVAILABLE("RSP_EC_SERV_DF_NOT_AVAILABLE"),
    RSP_EC_REQ_INCORRECT("RSP_EC_REQ_INCORRECT"),
    RSP_EC_REQ_HEADER_INCORRECT("RSP_EC_REQ_HEADER_INCORRECT"),
    RSP_EC_REQ_NOT_AUTHENTICATED("RSP_EC_REQ_NOT_AUTHENTICATED"),
    RSP_EC_REQ_NOT_AUTHORIZED("RSP_EC_REQ_NOT_AUTHORIZED"),
    RSP_EC_REQ_TIMEOUT("RSP_EC_REQ_TIMEOUT"),
    RSP_EC_REQ_VERY_BIG("RSP_EC_REQ_VERY_BIG"),
    RSP_EC_REQ_URL_VERY_LONG("RSP_EC_REQ_URL_VERY_LONG"),
    RSP_EC_REQ_MEDIA_TYPE_INCORRECT("RSP_EC_REQ_MEDIA_TYPE_INCORRECT"),
    RSP_EI("RSP_EI"),
    RSP_EI_VALUES_NULL("RSP_EI_VALUES_NULL"),
    RSP_EI_CA_TOKEN_NULL("RSP_EI_CA_TOKEN_NULL"),
    @XmlEnumValue("RSP_EI_OP2_COD_ENTI_NULL")
    RSP_EI_OP_2_COD_ENTI_NULL("RSP_EI_OP2_COD_ENTI_NULL"),
    RSP_EI_VALUES_EMPTY("RSP_EI_VALUES_EMPTY"),
    RSP_EI_CA_TOKEN_EMPTY("RSP_EI_CA_TOKEN_EMPTY"),
    RSP_EI_VALUES_INCORRECT("RSP_EI_VALUES_INCORRECT"),
    RSP_EI_CA_TOKEN_INCORRECT("RSP_EI_CA_TOKEN_INCORRECT"),
    RSP_EI_CA_USER_INCORRECT("RSP_EI_CA_USER_INCORRECT"),
    RSP_EI_CA_PWD_INCORRECT("RSP_EI_CA_PWD_INCORRECT"),
    RSP_EI_SESSION_INVALID("RSP_EI_SESSION_INVALID"),
    RSP_EI_COOKIES_INVALID("RSP_EI_COOKIES_INVALID"),
    RSP_EI_SESSION_EXPIRED("RSP_EI_SESSION_EXPIRED"),
    RSP_EI_IP_NO_AUTHORIZED("RSP_EI_IP_NO_AUTHORIZED"),
    RSP_EI_PARAMS_INCORRECT("RSP_EI_PARAMS_INCORRECT"),
    RSP_EB("RSP_EB"),
    RSP_EB_BUSINESS_RULE_INCORRECT("RSP_EB_BUSINESS_RULE_INCORRECT"),
    RSP_EB_OPERATION_INCORRECT("RSP_EB_OPERATION_INCORRECT"),
    RSP_EB_FILE_NOT_GENERATE("RSP_EB_FILE_NOT_GENERATE"),
    RSP_ED("RSP_ED"),
    RSP_ED_DATASOURCE_NOT_FOUND("RSP_ED_DATASOURCE_NOT_FOUND"),
    RSP_ED_DATASOURCE_NOT_GET("RSP_ED_DATASOURCE_NOT_GET"),
    RSP_ED_DATASOURCE_NOT_INSERT("RSP_ED_DATASOURCE_NOT_INSERT"),
    RSP_ED_DATASOURCE_NOT_DELETE("RSP_ED_DATASOURCE_NOT_DELETE"),
    RSP_ED_DATASOURCE_NOT_UPDATE("RSP_ED_DATASOURCE_NOT_UPDATE"),
    RSP_ED_DATASOURCE_TIMEOUT("RSP_ED_DATASOURCE_TIMEOUT");
    private final String value;

    StatusResponse(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StatusResponse fromValue(String v) {
        for (StatusResponse c: StatusResponse.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
