/**
 * DOCIDN.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.eqs.lampoadr.ws.client.egon.suite;

public class DOCIDN  implements java.io.Serializable {
    private java.lang.String DSXDATRIL;

    private java.lang.String DSXDATNAS;

    private java.lang.String DSXDATSCA;

    private java.lang.String DSXPRORIL;

    private java.lang.String DSXCOMRIL;

    private java.lang.String TPXDOC;

    private java.lang.String CDXDOC;

    private java.lang.String DSXENTRIL;

    public DOCIDN() {
    }

    public DOCIDN(
           java.lang.String DSXDATRIL,
           java.lang.String DSXDATNAS,
           java.lang.String DSXDATSCA,
           java.lang.String DSXPRORIL,
           java.lang.String DSXCOMRIL,
           java.lang.String TPXDOC,
           java.lang.String CDXDOC,
           java.lang.String DSXENTRIL) {
           this.DSXDATRIL = DSXDATRIL;
           this.DSXDATNAS = DSXDATNAS;
           this.DSXDATSCA = DSXDATSCA;
           this.DSXPRORIL = DSXPRORIL;
           this.DSXCOMRIL = DSXCOMRIL;
           this.TPXDOC = TPXDOC;
           this.CDXDOC = CDXDOC;
           this.DSXENTRIL = DSXENTRIL;
    }


    /**
     * Gets the DSXDATRIL value for this DOCIDN.
     * 
     * @return DSXDATRIL
     */
    public java.lang.String getDSXDATRIL() {
        return DSXDATRIL;
    }


    /**
     * Sets the DSXDATRIL value for this DOCIDN.
     * 
     * @param DSXDATRIL
     */
    public void setDSXDATRIL(java.lang.String DSXDATRIL) {
        this.DSXDATRIL = DSXDATRIL;
    }


    /**
     * Gets the DSXDATNAS value for this DOCIDN.
     * 
     * @return DSXDATNAS
     */
    public java.lang.String getDSXDATNAS() {
        return DSXDATNAS;
    }


    /**
     * Sets the DSXDATNAS value for this DOCIDN.
     * 
     * @param DSXDATNAS
     */
    public void setDSXDATNAS(java.lang.String DSXDATNAS) {
        this.DSXDATNAS = DSXDATNAS;
    }


    /**
     * Gets the DSXDATSCA value for this DOCIDN.
     * 
     * @return DSXDATSCA
     */
    public java.lang.String getDSXDATSCA() {
        return DSXDATSCA;
    }


    /**
     * Sets the DSXDATSCA value for this DOCIDN.
     * 
     * @param DSXDATSCA
     */
    public void setDSXDATSCA(java.lang.String DSXDATSCA) {
        this.DSXDATSCA = DSXDATSCA;
    }


    /**
     * Gets the DSXPRORIL value for this DOCIDN.
     * 
     * @return DSXPRORIL
     */
    public java.lang.String getDSXPRORIL() {
        return DSXPRORIL;
    }


    /**
     * Sets the DSXPRORIL value for this DOCIDN.
     * 
     * @param DSXPRORIL
     */
    public void setDSXPRORIL(java.lang.String DSXPRORIL) {
        this.DSXPRORIL = DSXPRORIL;
    }


    /**
     * Gets the DSXCOMRIL value for this DOCIDN.
     * 
     * @return DSXCOMRIL
     */
    public java.lang.String getDSXCOMRIL() {
        return DSXCOMRIL;
    }


    /**
     * Sets the DSXCOMRIL value for this DOCIDN.
     * 
     * @param DSXCOMRIL
     */
    public void setDSXCOMRIL(java.lang.String DSXCOMRIL) {
        this.DSXCOMRIL = DSXCOMRIL;
    }


    /**
     * Gets the TPXDOC value for this DOCIDN.
     * 
     * @return TPXDOC
     */
    public java.lang.String getTPXDOC() {
        return TPXDOC;
    }


    /**
     * Sets the TPXDOC value for this DOCIDN.
     * 
     * @param TPXDOC
     */
    public void setTPXDOC(java.lang.String TPXDOC) {
        this.TPXDOC = TPXDOC;
    }


    /**
     * Gets the CDXDOC value for this DOCIDN.
     * 
     * @return CDXDOC
     */
    public java.lang.String getCDXDOC() {
        return CDXDOC;
    }


    /**
     * Sets the CDXDOC value for this DOCIDN.
     * 
     * @param CDXDOC
     */
    public void setCDXDOC(java.lang.String CDXDOC) {
        this.CDXDOC = CDXDOC;
    }


    /**
     * Gets the DSXENTRIL value for this DOCIDN.
     * 
     * @return DSXENTRIL
     */
    public java.lang.String getDSXENTRIL() {
        return DSXENTRIL;
    }


    /**
     * Sets the DSXENTRIL value for this DOCIDN.
     * 
     * @param DSXENTRIL
     */
    public void setDSXENTRIL(java.lang.String DSXENTRIL) {
        this.DSXENTRIL = DSXENTRIL;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DOCIDN)) return false;
        DOCIDN other = (DOCIDN) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.DSXDATRIL==null && other.getDSXDATRIL()==null) || 
             (this.DSXDATRIL!=null &&
              this.DSXDATRIL.equals(other.getDSXDATRIL()))) &&
            ((this.DSXDATNAS==null && other.getDSXDATNAS()==null) || 
             (this.DSXDATNAS!=null &&
              this.DSXDATNAS.equals(other.getDSXDATNAS()))) &&
            ((this.DSXDATSCA==null && other.getDSXDATSCA()==null) || 
             (this.DSXDATSCA!=null &&
              this.DSXDATSCA.equals(other.getDSXDATSCA()))) &&
            ((this.DSXPRORIL==null && other.getDSXPRORIL()==null) || 
             (this.DSXPRORIL!=null &&
              this.DSXPRORIL.equals(other.getDSXPRORIL()))) &&
            ((this.DSXCOMRIL==null && other.getDSXCOMRIL()==null) || 
             (this.DSXCOMRIL!=null &&
              this.DSXCOMRIL.equals(other.getDSXCOMRIL()))) &&
            ((this.TPXDOC==null && other.getTPXDOC()==null) || 
             (this.TPXDOC!=null &&
              this.TPXDOC.equals(other.getTPXDOC()))) &&
            ((this.CDXDOC==null && other.getCDXDOC()==null) || 
             (this.CDXDOC!=null &&
              this.CDXDOC.equals(other.getCDXDOC()))) &&
            ((this.DSXENTRIL==null && other.getDSXENTRIL()==null) || 
             (this.DSXENTRIL!=null &&
              this.DSXENTRIL.equals(other.getDSXENTRIL())));
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
        if (getDSXDATRIL() != null) {
            _hashCode += getDSXDATRIL().hashCode();
        }
        if (getDSXDATNAS() != null) {
            _hashCode += getDSXDATNAS().hashCode();
        }
        if (getDSXDATSCA() != null) {
            _hashCode += getDSXDATSCA().hashCode();
        }
        if (getDSXPRORIL() != null) {
            _hashCode += getDSXPRORIL().hashCode();
        }
        if (getDSXCOMRIL() != null) {
            _hashCode += getDSXCOMRIL().hashCode();
        }
        if (getTPXDOC() != null) {
            _hashCode += getTPXDOC().hashCode();
        }
        if (getCDXDOC() != null) {
            _hashCode += getCDXDOC().hashCode();
        }
        if (getDSXENTRIL() != null) {
            _hashCode += getDSXENTRIL().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DOCIDN.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "DOCIDN"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DSXDATRIL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "DSXDATRIL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DSXDATNAS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "DSXDATNAS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DSXDATSCA");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "DSXDATSCA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DSXPRORIL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "DSXPRORIL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DSXCOMRIL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "DSXCOMRIL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TPXDOC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "TPXDOC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CDXDOC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "CDXDOC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DSXENTRIL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "DSXENTRIL"));
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
