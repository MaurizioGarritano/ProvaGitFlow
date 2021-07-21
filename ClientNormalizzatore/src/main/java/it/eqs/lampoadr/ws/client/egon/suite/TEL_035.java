/**
 * TEL_035.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.eqs.lampoadr.ws.client.egon.suite;

public class TEL_035  implements java.io.Serializable {
    private it.eqs.lampoadr.ws.client.egon.suite.ELETEL[] ELETEL;

    private it.eqs.lampoadr.ws.client.egon.suite.TELUNI TELUNI;

    public TEL_035() {
    }

    public TEL_035(
           it.eqs.lampoadr.ws.client.egon.suite.ELETEL[] ELETEL,
           it.eqs.lampoadr.ws.client.egon.suite.TELUNI TELUNI) {
           this.ELETEL = ELETEL;
           this.TELUNI = TELUNI;
    }


    /**
     * Gets the ELETEL value for this TEL_035.
     * 
     * @return ELETEL
     */
    public it.eqs.lampoadr.ws.client.egon.suite.ELETEL[] getELETEL() {
        return ELETEL;
    }


    /**
     * Sets the ELETEL value for this TEL_035.
     * 
     * @param ELETEL
     */
    public void setELETEL(it.eqs.lampoadr.ws.client.egon.suite.ELETEL[] ELETEL) {
        this.ELETEL = ELETEL;
    }

    public it.eqs.lampoadr.ws.client.egon.suite.ELETEL getELETEL(int i) {
        return this.ELETEL[i];
    }

    public void setELETEL(int i, it.eqs.lampoadr.ws.client.egon.suite.ELETEL _value) {
        this.ELETEL[i] = _value;
    }


    /**
     * Gets the TELUNI value for this TEL_035.
     * 
     * @return TELUNI
     */
    public it.eqs.lampoadr.ws.client.egon.suite.TELUNI getTELUNI() {
        return TELUNI;
    }


    /**
     * Sets the TELUNI value for this TEL_035.
     * 
     * @param TELUNI
     */
    public void setTELUNI(it.eqs.lampoadr.ws.client.egon.suite.TELUNI TELUNI) {
        this.TELUNI = TELUNI;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TEL_035)) return false;
        TEL_035 other = (TEL_035) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ELETEL==null && other.getELETEL()==null) || 
             (this.ELETEL!=null &&
              java.util.Arrays.equals(this.ELETEL, other.getELETEL()))) &&
            ((this.TELUNI==null && other.getTELUNI()==null) || 
             (this.TELUNI!=null &&
              this.TELUNI.equals(other.getTELUNI())));
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
        if (getELETEL() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getELETEL());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getELETEL(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTELUNI() != null) {
            _hashCode += getTELUNI().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TEL_035.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "TEL_035"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ELETEL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "ELETEL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "ELETEL"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TELUNI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "TELUNI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "TELUNI"));
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
