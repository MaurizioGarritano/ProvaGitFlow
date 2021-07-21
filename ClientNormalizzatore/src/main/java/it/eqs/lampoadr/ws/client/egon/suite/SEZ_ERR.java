/**
 * SEZ_ERR.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.eqs.lampoadr.ws.client.egon.suite;

public class SEZ_ERR  implements java.io.Serializable {
    private java.lang.String FLXSEG;

    private org.apache.axis.types.UnsignedShort CDPSEG;

    private java.lang.String DSXSEG;

    public SEZ_ERR() {
    }

    public SEZ_ERR(
           java.lang.String FLXSEG,
           org.apache.axis.types.UnsignedShort CDPSEG,
           java.lang.String DSXSEG) {
           this.FLXSEG = FLXSEG;
           this.CDPSEG = CDPSEG;
           this.DSXSEG = DSXSEG;
    }


    /**
     * Gets the FLXSEG value for this SEZ_ERR.
     * 
     * @return FLXSEG
     */
    public java.lang.String getFLXSEG() {
        return FLXSEG;
    }


    /**
     * Sets the FLXSEG value for this SEZ_ERR.
     * 
     * @param FLXSEG
     */
    public void setFLXSEG(java.lang.String FLXSEG) {
        this.FLXSEG = FLXSEG;
    }


    /**
     * Gets the CDPSEG value for this SEZ_ERR.
     * 
     * @return CDPSEG
     */
    public org.apache.axis.types.UnsignedShort getCDPSEG() {
        return CDPSEG;
    }


    /**
     * Sets the CDPSEG value for this SEZ_ERR.
     * 
     * @param CDPSEG
     */
    public void setCDPSEG(org.apache.axis.types.UnsignedShort CDPSEG) {
        this.CDPSEG = CDPSEG;
    }


    /**
     * Gets the DSXSEG value for this SEZ_ERR.
     * 
     * @return DSXSEG
     */
    public java.lang.String getDSXSEG() {
        return DSXSEG;
    }


    /**
     * Sets the DSXSEG value for this SEZ_ERR.
     * 
     * @param DSXSEG
     */
    public void setDSXSEG(java.lang.String DSXSEG) {
        this.DSXSEG = DSXSEG;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SEZ_ERR)) return false;
        SEZ_ERR other = (SEZ_ERR) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.FLXSEG==null && other.getFLXSEG()==null) || 
             (this.FLXSEG!=null &&
              this.FLXSEG.equals(other.getFLXSEG()))) &&
            ((this.CDPSEG==null && other.getCDPSEG()==null) || 
             (this.CDPSEG!=null &&
              this.CDPSEG.equals(other.getCDPSEG()))) &&
            ((this.DSXSEG==null && other.getDSXSEG()==null) || 
             (this.DSXSEG!=null &&
              this.DSXSEG.equals(other.getDSXSEG())));
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
        if (getFLXSEG() != null) {
            _hashCode += getFLXSEG().hashCode();
        }
        if (getCDPSEG() != null) {
            _hashCode += getCDPSEG().hashCode();
        }
        if (getDSXSEG() != null) {
            _hashCode += getDSXSEG().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SEZ_ERR.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "SEZ_ERR"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FLXSEG");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "FLXSEG"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CDPSEG");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "CDPSEG"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedShort"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DSXSEG");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "DSXSEG"));
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
