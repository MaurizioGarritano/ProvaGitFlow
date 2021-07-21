/**
 * LNGCDP.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.eqs.lampoadr.ws.client.egon.suite;

public class LNGCDP  implements java.io.Serializable {
    private org.apache.axis.types.UnsignedShort TPPLNG;

    private org.apache.axis.types.UnsignedInt CDPLNG;

    private org.apache.axis.types.UnsignedShort NRPPRG;

    public LNGCDP() {
    }

    public LNGCDP(
           org.apache.axis.types.UnsignedShort TPPLNG,
           org.apache.axis.types.UnsignedInt CDPLNG,
           org.apache.axis.types.UnsignedShort NRPPRG) {
           this.TPPLNG = TPPLNG;
           this.CDPLNG = CDPLNG;
           this.NRPPRG = NRPPRG;
    }


    /**
     * Gets the TPPLNG value for this LNGCDP.
     * 
     * @return TPPLNG
     */
    public org.apache.axis.types.UnsignedShort getTPPLNG() {
        return TPPLNG;
    }


    /**
     * Sets the TPPLNG value for this LNGCDP.
     * 
     * @param TPPLNG
     */
    public void setTPPLNG(org.apache.axis.types.UnsignedShort TPPLNG) {
        this.TPPLNG = TPPLNG;
    }


    /**
     * Gets the CDPLNG value for this LNGCDP.
     * 
     * @return CDPLNG
     */
    public org.apache.axis.types.UnsignedInt getCDPLNG() {
        return CDPLNG;
    }


    /**
     * Sets the CDPLNG value for this LNGCDP.
     * 
     * @param CDPLNG
     */
    public void setCDPLNG(org.apache.axis.types.UnsignedInt CDPLNG) {
        this.CDPLNG = CDPLNG;
    }


    /**
     * Gets the NRPPRG value for this LNGCDP.
     * 
     * @return NRPPRG
     */
    public org.apache.axis.types.UnsignedShort getNRPPRG() {
        return NRPPRG;
    }


    /**
     * Sets the NRPPRG value for this LNGCDP.
     * 
     * @param NRPPRG
     */
    public void setNRPPRG(org.apache.axis.types.UnsignedShort NRPPRG) {
        this.NRPPRG = NRPPRG;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LNGCDP)) return false;
        LNGCDP other = (LNGCDP) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.TPPLNG==null && other.getTPPLNG()==null) || 
             (this.TPPLNG!=null &&
              this.TPPLNG.equals(other.getTPPLNG()))) &&
            ((this.CDPLNG==null && other.getCDPLNG()==null) || 
             (this.CDPLNG!=null &&
              this.CDPLNG.equals(other.getCDPLNG()))) &&
            ((this.NRPPRG==null && other.getNRPPRG()==null) || 
             (this.NRPPRG!=null &&
              this.NRPPRG.equals(other.getNRPPRG())));
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
        if (getTPPLNG() != null) {
            _hashCode += getTPPLNG().hashCode();
        }
        if (getCDPLNG() != null) {
            _hashCode += getCDPLNG().hashCode();
        }
        if (getNRPPRG() != null) {
            _hashCode += getNRPPRG().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LNGCDP.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "LNGCDP"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TPPLNG");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "TPPLNG"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedShort"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CDPLNG");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "CDPLNG"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NRPPRG");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "NRPPRG"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedShort"));
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
