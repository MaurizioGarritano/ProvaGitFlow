/**
 * KEY.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.eqs.lampoadr.ws.client.egon.suite;

public class KEY  implements java.io.Serializable {
    private java.lang.String DSXKEY;

    private org.apache.axis.types.UnsignedInt TPPKEY;

    private org.apache.axis.types.UnsignedInt VLPBON;

    private org.apache.axis.types.UnsignedInt SQPPAR;

    public KEY() {
    }

    public KEY(
           java.lang.String DSXKEY,
           org.apache.axis.types.UnsignedInt TPPKEY,
           org.apache.axis.types.UnsignedInt VLPBON,
           org.apache.axis.types.UnsignedInt SQPPAR) {
           this.DSXKEY = DSXKEY;
           this.TPPKEY = TPPKEY;
           this.VLPBON = VLPBON;
           this.SQPPAR = SQPPAR;
    }


    /**
     * Gets the DSXKEY value for this KEY.
     * 
     * @return DSXKEY
     */
    public java.lang.String getDSXKEY() {
        return DSXKEY;
    }


    /**
     * Sets the DSXKEY value for this KEY.
     * 
     * @param DSXKEY
     */
    public void setDSXKEY(java.lang.String DSXKEY) {
        this.DSXKEY = DSXKEY;
    }


    /**
     * Gets the TPPKEY value for this KEY.
     * 
     * @return TPPKEY
     */
    public org.apache.axis.types.UnsignedInt getTPPKEY() {
        return TPPKEY;
    }


    /**
     * Sets the TPPKEY value for this KEY.
     * 
     * @param TPPKEY
     */
    public void setTPPKEY(org.apache.axis.types.UnsignedInt TPPKEY) {
        this.TPPKEY = TPPKEY;
    }


    /**
     * Gets the VLPBON value for this KEY.
     * 
     * @return VLPBON
     */
    public org.apache.axis.types.UnsignedInt getVLPBON() {
        return VLPBON;
    }


    /**
     * Sets the VLPBON value for this KEY.
     * 
     * @param VLPBON
     */
    public void setVLPBON(org.apache.axis.types.UnsignedInt VLPBON) {
        this.VLPBON = VLPBON;
    }


    /**
     * Gets the SQPPAR value for this KEY.
     * 
     * @return SQPPAR
     */
    public org.apache.axis.types.UnsignedInt getSQPPAR() {
        return SQPPAR;
    }


    /**
     * Sets the SQPPAR value for this KEY.
     * 
     * @param SQPPAR
     */
    public void setSQPPAR(org.apache.axis.types.UnsignedInt SQPPAR) {
        this.SQPPAR = SQPPAR;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof KEY)) return false;
        KEY other = (KEY) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.DSXKEY==null && other.getDSXKEY()==null) || 
             (this.DSXKEY!=null &&
              this.DSXKEY.equals(other.getDSXKEY()))) &&
            ((this.TPPKEY==null && other.getTPPKEY()==null) || 
             (this.TPPKEY!=null &&
              this.TPPKEY.equals(other.getTPPKEY()))) &&
            ((this.VLPBON==null && other.getVLPBON()==null) || 
             (this.VLPBON!=null &&
              this.VLPBON.equals(other.getVLPBON()))) &&
            ((this.SQPPAR==null && other.getSQPPAR()==null) || 
             (this.SQPPAR!=null &&
              this.SQPPAR.equals(other.getSQPPAR())));
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
        if (getDSXKEY() != null) {
            _hashCode += getDSXKEY().hashCode();
        }
        if (getTPPKEY() != null) {
            _hashCode += getTPPKEY().hashCode();
        }
        if (getVLPBON() != null) {
            _hashCode += getVLPBON().hashCode();
        }
        if (getSQPPAR() != null) {
            _hashCode += getSQPPAR().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(KEY.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "KEY"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DSXKEY");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "DSXKEY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TPPKEY");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "TPPKEY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VLPBON");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "VLPBON"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SQPPAR");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "SQPPAR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
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
