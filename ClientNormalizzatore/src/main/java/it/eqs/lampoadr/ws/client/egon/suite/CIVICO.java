/**
 * CIVICO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.eqs.lampoadr.ws.client.egon.suite;

public class CIVICO  implements java.io.Serializable {
    private org.apache.axis.types.UnsignedLong CDPCIV;

    private org.apache.axis.types.UnsignedInt NRPNUMCIV;

    private java.lang.String NRXNUMCIV;

    private java.lang.String DSXESP;

    private java.lang.String DSXCOM;

    public CIVICO() {
    }

    public CIVICO(
           org.apache.axis.types.UnsignedLong CDPCIV,
           org.apache.axis.types.UnsignedInt NRPNUMCIV,
           java.lang.String NRXNUMCIV,
           java.lang.String DSXESP,
           java.lang.String DSXCOM) {
           this.CDPCIV = CDPCIV;
           this.NRPNUMCIV = NRPNUMCIV;
           this.NRXNUMCIV = NRXNUMCIV;
           this.DSXESP = DSXESP;
           this.DSXCOM = DSXCOM;
    }


    /**
     * Gets the CDPCIV value for this CIVICO.
     * 
     * @return CDPCIV
     */
    public org.apache.axis.types.UnsignedLong getCDPCIV() {
        return CDPCIV;
    }


    /**
     * Sets the CDPCIV value for this CIVICO.
     * 
     * @param CDPCIV
     */
    public void setCDPCIV(org.apache.axis.types.UnsignedLong CDPCIV) {
        this.CDPCIV = CDPCIV;
    }


    /**
     * Gets the NRPNUMCIV value for this CIVICO.
     * 
     * @return NRPNUMCIV
     */
    public org.apache.axis.types.UnsignedInt getNRPNUMCIV() {
        return NRPNUMCIV;
    }


    /**
     * Sets the NRPNUMCIV value for this CIVICO.
     * 
     * @param NRPNUMCIV
     */
    public void setNRPNUMCIV(org.apache.axis.types.UnsignedInt NRPNUMCIV) {
        this.NRPNUMCIV = NRPNUMCIV;
    }


    /**
     * Gets the NRXNUMCIV value for this CIVICO.
     * 
     * @return NRXNUMCIV
     */
    public java.lang.String getNRXNUMCIV() {
        return NRXNUMCIV;
    }


    /**
     * Sets the NRXNUMCIV value for this CIVICO.
     * 
     * @param NRXNUMCIV
     */
    public void setNRXNUMCIV(java.lang.String NRXNUMCIV) {
        this.NRXNUMCIV = NRXNUMCIV;
    }


    /**
     * Gets the DSXESP value for this CIVICO.
     * 
     * @return DSXESP
     */
    public java.lang.String getDSXESP() {
        return DSXESP;
    }


    /**
     * Sets the DSXESP value for this CIVICO.
     * 
     * @param DSXESP
     */
    public void setDSXESP(java.lang.String DSXESP) {
        this.DSXESP = DSXESP;
    }


    /**
     * Gets the DSXCOM value for this CIVICO.
     * 
     * @return DSXCOM
     */
    public java.lang.String getDSXCOM() {
        return DSXCOM;
    }


    /**
     * Sets the DSXCOM value for this CIVICO.
     * 
     * @param DSXCOM
     */
    public void setDSXCOM(java.lang.String DSXCOM) {
        this.DSXCOM = DSXCOM;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CIVICO)) return false;
        CIVICO other = (CIVICO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.CDPCIV==null && other.getCDPCIV()==null) || 
             (this.CDPCIV!=null &&
              this.CDPCIV.equals(other.getCDPCIV()))) &&
            ((this.NRPNUMCIV==null && other.getNRPNUMCIV()==null) || 
             (this.NRPNUMCIV!=null &&
              this.NRPNUMCIV.equals(other.getNRPNUMCIV()))) &&
            ((this.NRXNUMCIV==null && other.getNRXNUMCIV()==null) || 
             (this.NRXNUMCIV!=null &&
              this.NRXNUMCIV.equals(other.getNRXNUMCIV()))) &&
            ((this.DSXESP==null && other.getDSXESP()==null) || 
             (this.DSXESP!=null &&
              this.DSXESP.equals(other.getDSXESP()))) &&
            ((this.DSXCOM==null && other.getDSXCOM()==null) || 
             (this.DSXCOM!=null &&
              this.DSXCOM.equals(other.getDSXCOM())));
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
        if (getCDPCIV() != null) {
            _hashCode += getCDPCIV().hashCode();
        }
        if (getNRPNUMCIV() != null) {
            _hashCode += getNRPNUMCIV().hashCode();
        }
        if (getNRXNUMCIV() != null) {
            _hashCode += getNRXNUMCIV().hashCode();
        }
        if (getDSXESP() != null) {
            _hashCode += getDSXESP().hashCode();
        }
        if (getDSXCOM() != null) {
            _hashCode += getDSXCOM().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CIVICO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "CIVICO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CDPCIV");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "CDPCIV"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedLong"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NRPNUMCIV");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "NRPNUMCIV"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NRXNUMCIV");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "NRXNUMCIV"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DSXESP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "DSXESP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DSXCOM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "DSXCOM"));
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
