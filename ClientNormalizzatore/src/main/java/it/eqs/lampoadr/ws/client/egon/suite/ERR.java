/**
 * ERR.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.eqs.lampoadr.ws.client.egon.suite;

public class ERR  implements java.io.Serializable {
    private org.apache.axis.types.UnsignedInt WP9STC;

    private java.lang.String DSXERR;

    public ERR() {
    }

    public ERR(
           org.apache.axis.types.UnsignedInt WP9STC,
           java.lang.String DSXERR) {
           this.WP9STC = WP9STC;
           this.DSXERR = DSXERR;
    }


    /**
     * Gets the WP9STC value for this ERR.
     * 
     * @return WP9STC
     */
    public org.apache.axis.types.UnsignedInt getWP9STC() {
        return WP9STC;
    }


    /**
     * Sets the WP9STC value for this ERR.
     * 
     * @param WP9STC
     */
    public void setWP9STC(org.apache.axis.types.UnsignedInt WP9STC) {
        this.WP9STC = WP9STC;
    }


    /**
     * Gets the DSXERR value for this ERR.
     * 
     * @return DSXERR
     */
    public java.lang.String getDSXERR() {
        return DSXERR;
    }


    /**
     * Sets the DSXERR value for this ERR.
     * 
     * @param DSXERR
     */
    public void setDSXERR(java.lang.String DSXERR) {
        this.DSXERR = DSXERR;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ERR)) return false;
        ERR other = (ERR) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.WP9STC==null && other.getWP9STC()==null) || 
             (this.WP9STC!=null &&
              this.WP9STC.equals(other.getWP9STC()))) &&
            ((this.DSXERR==null && other.getDSXERR()==null) || 
             (this.DSXERR!=null &&
              this.DSXERR.equals(other.getDSXERR())));
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
        if (getWP9STC() != null) {
            _hashCode += getWP9STC().hashCode();
        }
        if (getDSXERR() != null) {
            _hashCode += getDSXERR().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ERR.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "ERR"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WP9STC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "WP9STC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DSXERR");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "DSXERR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
