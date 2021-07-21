/**
 * TELUNI.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.eqs.lampoadr.ws.client.egon.suite;

public class TELUNI  implements java.io.Serializable {
    private java.lang.String CDXISOUNI;

    private java.lang.String TELUNI;

    public TELUNI() {
    }

    public TELUNI(
           java.lang.String CDXISOUNI,
           java.lang.String TELUNI) {
           this.CDXISOUNI = CDXISOUNI;
           this.TELUNI = TELUNI;
    }


    /**
     * Gets the CDXISOUNI value for this TELUNI.
     * 
     * @return CDXISOUNI
     */
    public java.lang.String getCDXISOUNI() {
        return CDXISOUNI;
    }


    /**
     * Sets the CDXISOUNI value for this TELUNI.
     * 
     * @param CDXISOUNI
     */
    public void setCDXISOUNI(java.lang.String CDXISOUNI) {
        this.CDXISOUNI = CDXISOUNI;
    }


    /**
     * Gets the TELUNI value for this TELUNI.
     * 
     * @return TELUNI
     */
    public java.lang.String getTELUNI() {
        return TELUNI;
    }


    /**
     * Sets the TELUNI value for this TELUNI.
     * 
     * @param TELUNI
     */
    public void setTELUNI(java.lang.String TELUNI) {
        this.TELUNI = TELUNI;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TELUNI)) return false;
        TELUNI other = (TELUNI) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.CDXISOUNI==null && other.getCDXISOUNI()==null) || 
             (this.CDXISOUNI!=null &&
              this.CDXISOUNI.equals(other.getCDXISOUNI()))) &&
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
        if (getCDXISOUNI() != null) {
            _hashCode += getCDXISOUNI().hashCode();
        }
        if (getTELUNI() != null) {
            _hashCode += getTELUNI().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TELUNI.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "TELUNI"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CDXISOUNI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "CDXISOUNI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TELUNI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "TELUNI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
