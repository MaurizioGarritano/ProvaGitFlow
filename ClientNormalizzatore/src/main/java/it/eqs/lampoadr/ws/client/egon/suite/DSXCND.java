/**
 * DSXCND.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.eqs.lampoadr.ws.client.egon.suite;

public class DSXCND  implements java.io.Serializable {
    private java.lang.String DPTCND;

    private java.lang.String CNLCND;

    private java.lang.String DS1CND;

    private java.lang.String STRCND;

    private java.lang.String ZIPCND;

    public DSXCND() {
    }

    public DSXCND(
           java.lang.String DPTCND,
           java.lang.String CNLCND,
           java.lang.String DS1CND,
           java.lang.String STRCND,
           java.lang.String ZIPCND) {
           this.DPTCND = DPTCND;
           this.CNLCND = CNLCND;
           this.DS1CND = DS1CND;
           this.STRCND = STRCND;
           this.ZIPCND = ZIPCND;
    }


    /**
     * Gets the DPTCND value for this DSXCND.
     * 
     * @return DPTCND
     */
    public java.lang.String getDPTCND() {
        return DPTCND;
    }


    /**
     * Sets the DPTCND value for this DSXCND.
     * 
     * @param DPTCND
     */
    public void setDPTCND(java.lang.String DPTCND) {
        this.DPTCND = DPTCND;
    }


    /**
     * Gets the CNLCND value for this DSXCND.
     * 
     * @return CNLCND
     */
    public java.lang.String getCNLCND() {
        return CNLCND;
    }


    /**
     * Sets the CNLCND value for this DSXCND.
     * 
     * @param CNLCND
     */
    public void setCNLCND(java.lang.String CNLCND) {
        this.CNLCND = CNLCND;
    }


    /**
     * Gets the DS1CND value for this DSXCND.
     * 
     * @return DS1CND
     */
    public java.lang.String getDS1CND() {
        return DS1CND;
    }


    /**
     * Sets the DS1CND value for this DSXCND.
     * 
     * @param DS1CND
     */
    public void setDS1CND(java.lang.String DS1CND) {
        this.DS1CND = DS1CND;
    }


    /**
     * Gets the STRCND value for this DSXCND.
     * 
     * @return STRCND
     */
    public java.lang.String getSTRCND() {
        return STRCND;
    }


    /**
     * Sets the STRCND value for this DSXCND.
     * 
     * @param STRCND
     */
    public void setSTRCND(java.lang.String STRCND) {
        this.STRCND = STRCND;
    }


    /**
     * Gets the ZIPCND value for this DSXCND.
     * 
     * @return ZIPCND
     */
    public java.lang.String getZIPCND() {
        return ZIPCND;
    }


    /**
     * Sets the ZIPCND value for this DSXCND.
     * 
     * @param ZIPCND
     */
    public void setZIPCND(java.lang.String ZIPCND) {
        this.ZIPCND = ZIPCND;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DSXCND)) return false;
        DSXCND other = (DSXCND) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.DPTCND==null && other.getDPTCND()==null) || 
             (this.DPTCND!=null &&
              this.DPTCND.equals(other.getDPTCND()))) &&
            ((this.CNLCND==null && other.getCNLCND()==null) || 
             (this.CNLCND!=null &&
              this.CNLCND.equals(other.getCNLCND()))) &&
            ((this.DS1CND==null && other.getDS1CND()==null) || 
             (this.DS1CND!=null &&
              this.DS1CND.equals(other.getDS1CND()))) &&
            ((this.STRCND==null && other.getSTRCND()==null) || 
             (this.STRCND!=null &&
              this.STRCND.equals(other.getSTRCND()))) &&
            ((this.ZIPCND==null && other.getZIPCND()==null) || 
             (this.ZIPCND!=null &&
              this.ZIPCND.equals(other.getZIPCND())));
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
        if (getDPTCND() != null) {
            _hashCode += getDPTCND().hashCode();
        }
        if (getCNLCND() != null) {
            _hashCode += getCNLCND().hashCode();
        }
        if (getDS1CND() != null) {
            _hashCode += getDS1CND().hashCode();
        }
        if (getSTRCND() != null) {
            _hashCode += getSTRCND().hashCode();
        }
        if (getZIPCND() != null) {
            _hashCode += getZIPCND().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DSXCND.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "DSXCND"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DPTCND");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "DPTCND"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CNLCND");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "CNLCND"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DS1CND");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "DS1CND"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("STRCND");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "STRCND"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZIPCND");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "ZIPCND"));
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
