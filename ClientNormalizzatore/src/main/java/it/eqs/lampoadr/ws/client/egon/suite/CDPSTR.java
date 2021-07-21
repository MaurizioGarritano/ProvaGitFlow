/**
 * CDPSTR.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.eqs.lampoadr.ws.client.egon.suite;

public class CDPSTR  implements java.io.Serializable {
    private org.apache.axis.types.UnsignedLong CDPSTR;

    private org.apache.axis.types.UnsignedInt CDPDUG;

    public CDPSTR() {
    }

    public CDPSTR(
           org.apache.axis.types.UnsignedLong CDPSTR,
           org.apache.axis.types.UnsignedInt CDPDUG) {
           this.CDPSTR = CDPSTR;
           this.CDPDUG = CDPDUG;
    }


    /**
     * Gets the CDPSTR value for this CDPSTR.
     * 
     * @return CDPSTR
     */
    public org.apache.axis.types.UnsignedLong getCDPSTR() {
        return CDPSTR;
    }


    /**
     * Sets the CDPSTR value for this CDPSTR.
     * 
     * @param CDPSTR
     */
    public void setCDPSTR(org.apache.axis.types.UnsignedLong CDPSTR) {
        this.CDPSTR = CDPSTR;
    }


    /**
     * Gets the CDPDUG value for this CDPSTR.
     * 
     * @return CDPDUG
     */
    public org.apache.axis.types.UnsignedInt getCDPDUG() {
        return CDPDUG;
    }


    /**
     * Sets the CDPDUG value for this CDPSTR.
     * 
     * @param CDPDUG
     */
    public void setCDPDUG(org.apache.axis.types.UnsignedInt CDPDUG) {
        this.CDPDUG = CDPDUG;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CDPSTR)) return false;
        CDPSTR other = (CDPSTR) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.CDPSTR==null && other.getCDPSTR()==null) || 
             (this.CDPSTR!=null &&
              this.CDPSTR.equals(other.getCDPSTR()))) &&
            ((this.CDPDUG==null && other.getCDPDUG()==null) || 
             (this.CDPDUG!=null &&
              this.CDPDUG.equals(other.getCDPDUG())));
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
        if (getCDPSTR() != null) {
            _hashCode += getCDPSTR().hashCode();
        }
        if (getCDPDUG() != null) {
            _hashCode += getCDPDUG().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CDPSTR.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "CDPSTR"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CDPSTR");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "CDPSTR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedLong"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CDPDUG");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "CDPDUG"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
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
