
package pe.com.equifax.creditreport.ws.endpoint;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SummaryAccountDebtCurrent complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SummaryAccountDebtCurrent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Cuenta" type="{http://ws.creditreport.equifax.com.pe/endpoint}AccountDebtCurrent" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SummaryAccountDebtCurrent", propOrder = {
    "cuenta"
})
public class SummaryAccountDebtCurrent {

    @XmlElement(name = "Cuenta")
    protected List<AccountDebtCurrent> cuenta;

    /**
     * Gets the value of the cuenta property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cuenta property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCuenta().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountDebtCurrent }
     * 
     * 
     */
    public List<AccountDebtCurrent> getCuenta() {
        if (cuenta == null) {
            cuenta = new ArrayList<AccountDebtCurrent>();
        }
        return this.cuenta;
    }

}
