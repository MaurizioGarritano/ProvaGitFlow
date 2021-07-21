/**
 * ELECODOUT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.eqs.lampoadr.ws.client.egon.suite;

public class ELECODOUT  implements java.io.Serializable {
    private it.eqs.lampoadr.ws.client.egon.suite.ELECOD ELECOD;

    private org.apache.axis.types.UnsignedInt VLPBON;

    public ELECODOUT() {
    }

    public ELECODOUT(
           it.eqs.lampoadr.ws.client.egon.suite.ELECOD ELECOD,
           org.apache.axis.types.UnsignedInt VLPBON) {
           this.ELECOD = ELECOD;
           this.VLPBON = VLPBON;
    }


    /**
     * Gets the ELECOD value for this ELECODOUT.
     * 
     * @return ELECOD
     */
    public it.eqs.lampoadr.ws.client.egon.suite.ELECOD getELECOD() {
        return ELECOD;
    }


    /**
     * Sets the ELECOD value for this ELECODOUT.
     * 
     * @param ELECOD
     */
    public void setELECOD(it.eqs.lampoadr.ws.client.egon.suite.ELECOD ELECOD) {
        this.ELECOD = ELECOD;
    }


    /**
     * Gets the VLPBON value for this ELECODOUT.
     * 
     * @return VLPBON
     */
    public org.apache.axis.types.UnsignedInt getVLPBON() {
        return VLPBON;
    }


    /**
     * Sets the VLPBON value for this ELECODOUT.
     * 
     * @param VLPBON
     */
    public void setVLPBON(org.apache.axis.types.UnsignedInt VLPBON) {
        this.VLPBON = VLPBON;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ELECODOUT)) return false;
        ELECODOUT other = (ELECODOUT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ELECOD==null && other.getELECOD()==null) || 
             (this.ELECOD!=null &&
              this.ELECOD.equals(other.getELECOD()))) &&
            ((this.VLPBON==null && other.getVLPBON()==null) || 
             (this.VLPBON!=null &&
              this.VLPBON.equals(other.getVLPBON())));
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
        if (getELECOD() != null) {
            _hashCode += getELECOD().hashCode();
        }
        if (getVLPBON() != null) {
            _hashCode += getVLPBON().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ELECODOUT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "ELECODOUT"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ELECOD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "ELECOD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "ELECOD"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VLPBON");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "VLPBON"));
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
