//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.06 at 11:47:18 AM CEST 
//


package edu.hu.clickwatch.xml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for protocolType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="protocolType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="tcp"/>
 *     &lt;enumeration value="udp"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@SuppressWarnings("restriction")
@XmlType(name = "protocolType")
@XmlEnum
public enum ProtocolType {

    @XmlEnumValue("tcp")
    TCP("tcp"),
    @XmlEnumValue("udp")
    UDP("udp");
    private final String value;

    ProtocolType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProtocolType fromValue(String v) {
        for (ProtocolType c: ProtocolType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}