
package eseo.sw.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 3.2.2
 * Thu Mar 29 12:55:11 CEST 2018
 * Generated source version: 3.2.2
 */

@XmlRootElement(name = "payerChambreResponse", namespace = "http://sw.eseo/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "payerChambreResponse", namespace = "http://sw.eseo/")

public class PayerChambreResponse {

    @XmlElement(name = "return")
    private java.lang.String _return;

    public java.lang.String getReturn() {
        return this._return;
    }

    public void setReturn(java.lang.String new_return)  {
        this._return = new_return;
    }

}

