/**
 * LOCNAS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.eqs.lampoadr.ws.client.egon.suite;

public class LOCNAS  implements java.io.Serializable {
    private it.eqs.lampoadr.ws.client.egon.suite.DSXPLC DSXPLCNAS;

    private java.lang.String CDXZIPNAS;

    public LOCNAS() {
    }

    public LOCNAS(
           it.eqs.lampoadr.ws.client.egon.suite.DSXPLC DSXPLCNAS,
           java.lang.String CDXZIPNAS) {
           this.DSXPLCNAS = DSXPLCNAS;
           this.CDXZIPNAS = CDXZIPNAS;
    }


    /**
     * Gets the DSXPLCNAS value for this LOCNAS.
     * 
     * @return DSXPLCNAS
     */
    public it.eqs.lampoadr.ws.client.egon.suite.DSXPLC getDSXPLCNAS() {
        return DSXPLCNAS;
    }


    /**
     * Sets the DSXPLCNAS value for this LOCNAS.
     * 
     * @param DSXPLCNAS
     */
    public void setDSXPLCNAS(it.eqs.lampoadr.ws.client.egon.suite.DSXPLC DSXPLCNAS) {
        this.DSXPLCNAS = DSXPLCNAS;
    }


    /**
     * Gets the CDXZIPNAS value for this LOCNAS.
     * 
     * @return CDXZIPNAS
     */
    public java.lang.String getCDXZIPNAS() {
        return CDXZIPNAS;
    }


    /**
     * Sets the CDXZIPNAS value for this LOCNAS.
     * 
     * @param CDXZIPNAS
     */
    public void setCDXZIPNAS(java.lang.String CDXZIPNAS) {
        this.CDXZIPNAS = CDXZIPNAS;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LOCNAS)) return false;
        LOCNAS other = (LOCNAS) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.DSXPLCNAS==null && other.getDSXPLCNAS()==null) || 
             (this.DSXPLCNAS!=null &&
              this.DSXPLCNAS.equals(other.getDSXPLCNAS()))) &&
            ((this.CDXZIPNAS==null && other.getCDXZIPNAS()==null) || 
             (this.CDXZIPNAS!=null &&
              this.CDXZIPNAS.equals(other.getCDXZIPNAS())));
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
        if (getDSXPLCNAS() != null) {
            _hashCode += getDSXPLCNAS().hashCode();
        }
        if (getCDXZIPNAS() != null) {
            _hashCode += getCDXZIPNAS().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LOCNAS.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "LOCNAS"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DSXPLCNAS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "DSXPLCNAS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "DSXPLC"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CDXZIPNAS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "CDXZIPNAS"));
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
