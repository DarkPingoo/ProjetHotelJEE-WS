
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

@XmlRootElement(name = "reserverChambre", namespace = "http://sw.eseo/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reserverChambre", namespace = "http://sw.eseo/")

public class ReserverChambre {

    @XmlElement(name = "arg0")
    private eseo.sw.ReservationChambre arg0;

    public eseo.sw.ReservationChambre getArg0() {
        return this.arg0;
    }

    public void setArg0(eseo.sw.ReservationChambre newArg0)  {
        this.arg0 = newArg0;
    }

}

