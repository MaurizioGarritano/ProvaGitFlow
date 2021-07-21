/**
 * ALTRO_610.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.eqs.lampoadr.ws.client.egon.suite;

public class ALTRO_610  implements java.io.Serializable {
    private java.lang.String DSXMRENAS;

    private java.lang.String CDXZIPNAS;

    private java.lang.String DSXPRENOM;

    private java.lang.String CDXMATCOD;

    public ALTRO_610() {
    }

    public ALTRO_610(
           java.lang.String DSXMRENAS,
           java.lang.String CDXZIPNAS,
           java.lang.String DSXPRENOM,
           java.lang.String CDXMATCOD) {
           this.DSXMRENAS = DSXMRENAS;
           this.CDXZIPNAS = CDXZIPNAS;
           this.DSXPRENOM = DSXPRENOM;
           this.CDXMATCOD = CDXMATCOD;
    }


    /**
     * Gets the DSXMRENAS value for this ALTRO_610.
     * 
     * @return DSXMRENAS
     */
    public java.lang.String getDSXMRENAS() {
        return DSXMRENAS;
    }


    /**
     * Sets the DSXMRENAS value for this ALTRO_610.
     * 
     * @param DSXMRENAS
     */
    public void setDSXMRENAS(java.lang.String DSXMRENAS) {
        this.DSXMRENAS = DSXMRENAS;
    }


    /**
     * Gets the CDXZIPNAS value for this ALTRO_610.
     * 
     * @return CDXZIPNAS
     */
    public java.lang.String getCDXZIPNAS() {
        return CDXZIPNAS;
    }


    /**
     * Sets the CDXZIPNAS value for this ALTRO_610.
     * 
     * @param CDXZIPNAS
     */
    public void setCDXZIPNAS(java.lang.String CDXZIPNAS) {
        this.CDXZIPNAS = CDXZIPNAS;
    }


    /**
     * Gets the DSXPRENOM value for this ALTRO_610.
     * 
     * @return DSXPRENOM
     */
    public java.lang.String getDSXPRENOM() {
        return DSXPRENOM;
    }


    /**
     * Sets the DSXPRENOM value for this ALTRO_610.
     * 
     * @param DSXPRENOM
     */
    public void setDSXPRENOM(java.lang.String DSXPRENOM) {
        this.DSXPRENOM = DSXPRENOM;
    }


    /**
     * Gets the CDXMATCOD value for this ALTRO_610.
     * 
     * @return CDXMATCOD
     */
    public java.lang.String getCDXMATCOD() {
        return CDXMATCOD;
    }


    /**
     * Sets the CDXMATCOD value for this ALTRO_610.
     * 
     * @param CDXMATCOD
     */
    public void setCDXMATCOD(java.lang.String CDXMATCOD) {
        this.CDXMATCOD = CDXMATCOD;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ALTRO_610)) return false;
        ALTRO_610 other = (ALTRO_610) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.DSXMRENAS==null && other.getDSXMRENAS()==null) || 
             (this.DSXMRENAS!=null &&
              this.DSXMRENAS.equals(other.getDSXMRENAS()))) &&
            ((this.CDXZIPNAS==null && other.getCDXZIPNAS()==null) || 
             (this.CDXZIPNAS!=null &&
              this.CDXZIPNAS.equals(other.getCDXZIPNAS()))) &&
            ((this.DSXPRENOM==null && other.getDSXPRENOM()==null) || 
             (this.DSXPRENOM!=null &&
              this.DSXPRENOM.equals(other.getDSXPRENOM()))) &&
            ((this.CDXMATCOD==null && other.getCDXMATCOD()==null) || 
             (this.CDXMATCOD!=null &&
              this.CDXMATCOD.equals(other.getCDXMATCOD())));
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
        if (getDSXMRENAS() != null) {
            _hashCode += getDSXMRENAS().hashCode();
        }
        if (getCDXZIPNAS() != null) {
            _hashCode += getCDXZIPNAS().hashCode();
        }
        if (getDSXPRENOM() != null) {
            _hashCode += getDSXPRENOM().hashCode();
        }
        if (getCDXMATCOD() != null) {
            _hashCode += getCDXMATCOD().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ALTRO_610.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "ALTRO_610"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DSXMRENAS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "DSXMRENAS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CDXZIPNAS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "CDXZIPNAS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DSXPRENOM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "DSXPRENOM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CDXMATCOD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "CDXMATCOD"));
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
