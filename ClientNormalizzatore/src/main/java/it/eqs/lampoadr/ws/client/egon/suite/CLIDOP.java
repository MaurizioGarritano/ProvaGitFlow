/**
 * CLIDOP.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.eqs.lampoadr.ws.client.egon.suite;

public class CLIDOP  implements java.io.Serializable {
    private it.eqs.lampoadr.ws.client.egon.suite.ELECLI ELECLIDOP;

    private org.apache.axis.types.UnsignedInt CDPSOTFAS;

    private org.apache.axis.types.UnsignedInt VL9PES;

    private java.lang.String FILLERDOP;

    public CLIDOP() {
    }

    public CLIDOP(
           it.eqs.lampoadr.ws.client.egon.suite.ELECLI ELECLIDOP,
           org.apache.axis.types.UnsignedInt CDPSOTFAS,
           org.apache.axis.types.UnsignedInt VL9PES,
           java.lang.String FILLERDOP) {
           this.ELECLIDOP = ELECLIDOP;
           this.CDPSOTFAS = CDPSOTFAS;
           this.VL9PES = VL9PES;
           this.FILLERDOP = FILLERDOP;
    }


    /**
     * Gets the ELECLIDOP value for this CLIDOP.
     * 
     * @return ELECLIDOP
     */
    public it.eqs.lampoadr.ws.client.egon.suite.ELECLI getELECLIDOP() {
        return ELECLIDOP;
    }


    /**
     * Sets the ELECLIDOP value for this CLIDOP.
     * 
     * @param ELECLIDOP
     */
    public void setELECLIDOP(it.eqs.lampoadr.ws.client.egon.suite.ELECLI ELECLIDOP) {
        this.ELECLIDOP = ELECLIDOP;
    }


    /**
     * Gets the CDPSOTFAS value for this CLIDOP.
     * 
     * @return CDPSOTFAS
     */
    public org.apache.axis.types.UnsignedInt getCDPSOTFAS() {
        return CDPSOTFAS;
    }


    /**
     * Sets the CDPSOTFAS value for this CLIDOP.
     * 
     * @param CDPSOTFAS
     */
    public void setCDPSOTFAS(org.apache.axis.types.UnsignedInt CDPSOTFAS) {
        this.CDPSOTFAS = CDPSOTFAS;
    }


    /**
     * Gets the VL9PES value for this CLIDOP.
     * 
     * @return VL9PES
     */
    public org.apache.axis.types.UnsignedInt getVL9PES() {
        return VL9PES;
    }


    /**
     * Sets the VL9PES value for this CLIDOP.
     * 
     * @param VL9PES
     */
    public void setVL9PES(org.apache.axis.types.UnsignedInt VL9PES) {
        this.VL9PES = VL9PES;
    }


    /**
     * Gets the FILLERDOP value for this CLIDOP.
     * 
     * @return FILLERDOP
     */
    public java.lang.String getFILLERDOP() {
        return FILLERDOP;
    }


    /**
     * Sets the FILLERDOP value for this CLIDOP.
     * 
     * @param FILLERDOP
     */
    public void setFILLERDOP(java.lang.String FILLERDOP) {
        this.FILLERDOP = FILLERDOP;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CLIDOP)) return false;
        CLIDOP other = (CLIDOP) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ELECLIDOP==null && other.getELECLIDOP()==null) || 
             (this.ELECLIDOP!=null &&
              this.ELECLIDOP.equals(other.getELECLIDOP()))) &&
            ((this.CDPSOTFAS==null && other.getCDPSOTFAS()==null) || 
             (this.CDPSOTFAS!=null &&
              this.CDPSOTFAS.equals(other.getCDPSOTFAS()))) &&
            ((this.VL9PES==null && other.getVL9PES()==null) || 
             (this.VL9PES!=null &&
              this.VL9PES.equals(other.getVL9PES()))) &&
            ((this.FILLERDOP==null && other.getFILLERDOP()==null) || 
             (this.FILLERDOP!=null &&
              this.FILLERDOP.equals(other.getFILLERDOP())));
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
        if (getELECLIDOP() != null) {
            _hashCode += getELECLIDOP().hashCode();
        }
        if (getCDPSOTFAS() != null) {
            _hashCode += getCDPSOTFAS().hashCode();
        }
        if (getVL9PES() != null) {
            _hashCode += getVL9PES().hashCode();
        }
        if (getFILLERDOP() != null) {
            _hashCode += getFILLERDOP().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CLIDOP.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "CLIDOP"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ELECLIDOP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "ELECLIDOP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "ELECLI"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CDPSOTFAS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "CDPSOTFAS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VL9PES");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "VL9PES"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FILLERDOP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "FILLERDOP"));
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
