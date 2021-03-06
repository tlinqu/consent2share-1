
package echosign.api.clientv20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import echosign.api.clientv20.dto16.UrlWidgetCreationResult;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="urlWidgetCreationResult" type="{http://dto16.api.echosign}UrlWidgetCreationResult"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "urlWidgetCreationResult"
})
@XmlRootElement(name = "createPersonalUrlWidgetResponse")
public class CreatePersonalUrlWidgetResponse {

    @XmlElement(required = true, nillable = true)
    protected UrlWidgetCreationResult urlWidgetCreationResult;

    /**
     * Gets the value of the urlWidgetCreationResult property.
     * 
     * @return
     *     possible object is
     *     {@link UrlWidgetCreationResult }
     *     
     */
    public UrlWidgetCreationResult getUrlWidgetCreationResult() {
        return urlWidgetCreationResult;
    }

    /**
     * Sets the value of the urlWidgetCreationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link UrlWidgetCreationResult }
     *     
     */
    public void setUrlWidgetCreationResult(UrlWidgetCreationResult value) {
        this.urlWidgetCreationResult = value;
    }

}
