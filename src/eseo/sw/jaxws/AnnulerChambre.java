
package eseo.sw.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 3.2.2
 * Fri Mar 16 14:23:36 CET 2018
 * Generated source version: 3.2.2
 */

@XmlRootElement(name = "annulerChambre", namespace = "http://sw.eseo/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "annulerChambre", namespace = "http://sw.eseo/")

public class AnnulerChambre {

    @XmlElement(name = "arg0")
    private int arg0;

    public int getArg0() {
        return this.arg0;
    }

    public void setArg0(int newArg0)  {
        this.arg0 = newArg0;
    }

}

