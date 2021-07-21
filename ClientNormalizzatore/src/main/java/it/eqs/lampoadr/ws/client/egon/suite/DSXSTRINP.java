/**
 * DSXSTRINP.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.eqs.lampoadr.ws.client.egon.suite;

public class DSXSTRINP  implements java.io.Serializable {
    private java.lang.String DSXDUG;

    private java.lang.String DSXVIA;

    private org.apache.axis.types.UnsignedInt NRPNUMCIV;

    private java.lang.String DSXESP;

    public DSXSTRINP() {
    }

    public DSXSTRINP(
           java.lang.String DSXDUG,
           java.lang.String DSXVIA,
           org.apache.axis.types.UnsignedInt NRPNUMCIV,
           java.lang.String DSXESP) {
           this.DSXDUG = DSXDUG;
           this.DSXVIA = DSXVIA;
           this.NRPNUMCIV = NRPNUMCIV;
           this.DSXESP = DSXESP;
    }


    /**
     * Gets the DSXDUG value for this DSXSTRINP.
     * 
     * @return DSXDUG
     */
    public java.lang.String getDSXDUG() {
        return DSXDUG;
    }


    /**
     * Sets the DSXDUG value for this DSXSTRINP.
     * 
     * @param DSXDUG
     */
    public void setDSXDUG(java.lang.String DSXDUG) {
        this.DSXDUG = DSXDUG;
    }


    /**
     * Gets the DSXVIA value for this DSXSTRINP.
     * 
     * @return DSXVIA
     */
    public java.lang.String getDSXVIA() {
        return DSXVIA;
    }


    /**
     * Sets the DSXVIA value for this DSXSTRINP.
     * 
     * @param DSXVIA
     */
    public void setDSXVIA(java.lang.String DSXVIA) {
        this.DSXVIA = DSXVIA;
    }


    /**
     * Gets the NRPNUMCIV value for this DSXSTRINP.
     * 
     * @return NRPNUMCIV
     */
    public org.apache.axis.types.UnsignedInt getNRPNUMCIV() {
        return NRPNUMCIV;
    }


    /**
     * Sets the NRPNUMCIV value for this DSXSTRINP.
     * 
     * @param NRPNUMCIV
     */
    public void setNRPNUMCIV(org.apache.axis.types.UnsignedInt NRPNUMCIV) {
        this.NRPNUMCIV = NRPNUMCIV;
    }


    /**
     * Gets the DSXESP value for this DSXSTRINP.
     * 
     * @return DSXESP
     */
    public java.lang.String getDSXESP() {
        return DSXESP;
    }


    /**
     * Sets the DSXESP value for this DSXSTRINP.
     * 
     * @param DSXESP
     */
    public void setDSXESP(java.lang.String DSXESP) {
        this.DSXESP = DSXESP;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DSXSTRINP)) return false;
        DSXSTRINP other = (DSXSTRINP) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.DSXDUG==null && other.getDSXDUG()==null) || 
             (this.DSXDUG!=null &&
              this.DSXDUG.equals(other.getDSXDUG()))) &&
            ((this.DSXVIA==null && other.getDSXVIA()==null) || 
             (this.DSXVIA!=null &&
              this.DSXVIA.equals(other.getDSXVIA()))) &&
            ((this.NRPNUMCIV==null && other.getNRPNUMCIV()==null) || 
             (this.NRPNUMCIV!=null &&
              this.NRPNUMCIV.equals(other.getNRPNUMCIV()))) &&
            ((this.DSXESP==null && other.getDSXESP()==null) || 
             (this.DSXESP!=null &&
              this.DSXESP.equals(other.getDSXESP())));
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
        if (getDSXDUG() != null) {
            _hashCode += getDSXDUG().hashCode();
        }
        if (getDSXVIA() != null) {
            _hashCode += getDSXVIA().hashCode();
        }
        if (getNRPNUMCIV() != null) {
            _hashCode += getNRPNUMCIV().hashCode();
        }
        if (getDSXESP() != null) {
            _hashCode += getDSXESP().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DSXSTRINP.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "DSXSTRINP"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DSXDUG");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "DSXDUG"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DSXVIA");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "DSXVIA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("DSXESP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "DSXESP"));
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
