/**
 * ERR_620_ELE.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.eqs.lampoadr.ws.client.egon.suite;

public class ERR_620_ELE  implements java.io.Serializable {
    private java.lang.String ERR_620_S;

    private it.eqs.lampoadr.ws.client.egon.suite.SEZ_ERR[] ERR_620;

    public ERR_620_ELE() {
    }

    public ERR_620_ELE(
           java.lang.String ERR_620_S,
           it.eqs.lampoadr.ws.client.egon.suite.SEZ_ERR[] ERR_620) {
           this.ERR_620_S = ERR_620_S;
           this.ERR_620 = ERR_620;
    }


    /**
     * Gets the ERR_620_S value for this ERR_620_ELE.
     * 
     * @return ERR_620_S
     */
    public java.lang.String getERR_620_S() {
        return ERR_620_S;
    }


    /**
     * Sets the ERR_620_S value for this ERR_620_ELE.
     * 
     * @param ERR_620_S
     */
    public void setERR_620_S(java.lang.String ERR_620_S) {
        this.ERR_620_S = ERR_620_S;
    }


    /**
     * Gets the ERR_620 value for this ERR_620_ELE.
     * 
     * @return ERR_620
     */
    public it.eqs.lampoadr.ws.client.egon.suite.SEZ_ERR[] getERR_620() {
        return ERR_620;
    }


    /**
     * Sets the ERR_620 value for this ERR_620_ELE.
     * 
     * @param ERR_620
     */
    public void setERR_620(it.eqs.lampoadr.ws.client.egon.suite.SEZ_ERR[] ERR_620) {
        this.ERR_620 = ERR_620;
    }

    public it.eqs.lampoadr.ws.client.egon.suite.SEZ_ERR getERR_620(int i) {
        return this.ERR_620[i];
    }

    public void setERR_620(int i, it.eqs.lampoadr.ws.client.egon.suite.SEZ_ERR _value) {
        this.ERR_620[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ERR_620_ELE)) return false;
        ERR_620_ELE other = (ERR_620_ELE) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ERR_620_S==null && other.getERR_620_S()==null) || 
             (this.ERR_620_S!=null &&
              this.ERR_620_S.equals(other.getERR_620_S()))) &&
            ((this.ERR_620==null && other.getERR_620()==null) || 
             (this.ERR_620!=null &&
              java.util.Arrays.equals(this.ERR_620, other.getERR_620())));
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
        if (getERR_620_S() != null) {
            _hashCode += getERR_620_S().hashCode();
        }
        if (getERR_620() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getERR_620());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getERR_620(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ERR_620_ELE.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "ERR_620_ELE"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ERR_620_S");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "ERR_620_S"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ERR_620");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "ERR_620"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "SEZ_ERR"));
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
