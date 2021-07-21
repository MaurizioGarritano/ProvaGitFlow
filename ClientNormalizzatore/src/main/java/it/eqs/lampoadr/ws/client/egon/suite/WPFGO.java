/**
 * WPFGO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.eqs.lampoadr.ws.client.egon.suite;

public class WPFGO  implements java.io.Serializable {
    private it.eqs.lampoadr.ws.client.egon.suite.SOG[] SOG;

    private it.eqs.lampoadr.ws.client.egon.suite.ERR ERR;

    public WPFGO() {
    }

    public WPFGO(
           it.eqs.lampoadr.ws.client.egon.suite.SOG[] SOG,
           it.eqs.lampoadr.ws.client.egon.suite.ERR ERR) {
           this.SOG = SOG;
           this.ERR = ERR;
    }


    /**
     * Gets the SOG value for this WPFGO.
     * 
     * @return SOG
     */
    public it.eqs.lampoadr.ws.client.egon.suite.SOG[] getSOG() {
        return SOG;
    }


    /**
     * Sets the SOG value for this WPFGO.
     * 
     * @param SOG
     */
    public void setSOG(it.eqs.lampoadr.ws.client.egon.suite.SOG[] SOG) {
        this.SOG = SOG;
    }

    public it.eqs.lampoadr.ws.client.egon.suite.SOG getSOG(int i) {
        return this.SOG[i];
    }

    public void setSOG(int i, it.eqs.lampoadr.ws.client.egon.suite.SOG _value) {
        this.SOG[i] = _value;
    }


    /**
     * Gets the ERR value for this WPFGO.
     * 
     * @return ERR
     */
    public it.eqs.lampoadr.ws.client.egon.suite.ERR getERR() {
        return ERR;
    }


    /**
     * Sets the ERR value for this WPFGO.
     * 
     * @param ERR
     */
    public void setERR(it.eqs.lampoadr.ws.client.egon.suite.ERR ERR) {
        this.ERR = ERR;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WPFGO)) return false;
        WPFGO other = (WPFGO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.SOG==null && other.getSOG()==null) || 
             (this.SOG!=null &&
              java.util.Arrays.equals(this.SOG, other.getSOG()))) &&
            ((this.ERR==null && other.getERR()==null) || 
             (this.ERR!=null &&
              this.ERR.equals(other.getERR())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getSOG() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSOG());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSOG(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getERR() != null) {
            _hashCode += getERR().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WPFGO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "WPFGO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SOG");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "SOG"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "SOG"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ERR");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "ERR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "ERR"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
