/**
 * KII.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.eqs.lampoadr.ws.client.egon.suite;

public class KII  implements java.io.Serializable {
    private org.apache.axis.types.UnsignedInt CDPFAS;

    private it.eqs.lampoadr.ws.client.egon.suite.ELECLI ELECLI;

    private it.eqs.lampoadr.ws.client.egon.suite.ELECLI ELECLIDOP;

    private org.apache.axis.types.UnsignedShort NR9KEY;

    private it.eqs.lampoadr.ws.client.egon.suite.KEY[] KEY;

    public KII() {
    }

    public KII(
           org.apache.axis.types.UnsignedInt CDPFAS,
           it.eqs.lampoadr.ws.client.egon.suite.ELECLI ELECLI,
           it.eqs.lampoadr.ws.client.egon.suite.ELECLI ELECLIDOP,
           org.apache.axis.types.UnsignedShort NR9KEY,
           it.eqs.lampoadr.ws.client.egon.suite.KEY[] KEY) {
           this.CDPFAS = CDPFAS;
           this.ELECLI = ELECLI;
           this.ELECLIDOP = ELECLIDOP;
           this.NR9KEY = NR9KEY;
           this.KEY = KEY;
    }


    /**
     * Gets the CDPFAS value for this KII.
     * 
     * @return CDPFAS
     */
    public org.apache.axis.types.UnsignedInt getCDPFAS() {
        return CDPFAS;
    }


    /**
     * Sets the CDPFAS value for this KII.
     * 
     * @param CDPFAS
     */
    public void setCDPFAS(org.apache.axis.types.UnsignedInt CDPFAS) {
        this.CDPFAS = CDPFAS;
    }


    /**
     * Gets the ELECLI value for this KII.
     * 
     * @return ELECLI
     */
    public it.eqs.lampoadr.ws.client.egon.suite.ELECLI getELECLI() {
        return ELECLI;
    }


    /**
     * Sets the ELECLI value for this KII.
     * 
     * @param ELECLI
     */
    public void setELECLI(it.eqs.lampoadr.ws.client.egon.suite.ELECLI ELECLI) {
        this.ELECLI = ELECLI;
    }


    /**
     * Gets the ELECLIDOP value for this KII.
     * 
     * @return ELECLIDOP
     */
    public it.eqs.lampoadr.ws.client.egon.suite.ELECLI getELECLIDOP() {
        return ELECLIDOP;
    }


    /**
     * Sets the ELECLIDOP value for this KII.
     * 
     * @param ELECLIDOP
     */
    public void setELECLIDOP(it.eqs.lampoadr.ws.client.egon.suite.ELECLI ELECLIDOP) {
        this.ELECLIDOP = ELECLIDOP;
    }


    /**
     * Gets the NR9KEY value for this KII.
     * 
     * @return NR9KEY
     */
    public org.apache.axis.types.UnsignedShort getNR9KEY() {
        return NR9KEY;
    }


    /**
     * Sets the NR9KEY value for this KII.
     * 
     * @param NR9KEY
     */
    public void setNR9KEY(org.apache.axis.types.UnsignedShort NR9KEY) {
        this.NR9KEY = NR9KEY;
    }


    /**
     * Gets the KEY value for this KII.
     * 
     * @return KEY
     */
    public it.eqs.lampoadr.ws.client.egon.suite.KEY[] getKEY() {
        return KEY;
    }


    /**
     * Sets the KEY value for this KII.
     * 
     * @param KEY
     */
    public void setKEY(it.eqs.lampoadr.ws.client.egon.suite.KEY[] KEY) {
        this.KEY = KEY;
    }

    public it.eqs.lampoadr.ws.client.egon.suite.KEY getKEY(int i) {
        return this.KEY[i];
    }

    public void setKEY(int i, it.eqs.lampoadr.ws.client.egon.suite.KEY _value) {
        this.KEY[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof KII)) return false;
        KII other = (KII) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.CDPFAS==null && other.getCDPFAS()==null) || 
             (this.CDPFAS!=null &&
              this.CDPFAS.equals(other.getCDPFAS()))) &&
            ((this.ELECLI==null && other.getELECLI()==null) || 
             (this.ELECLI!=null &&
              this.ELECLI.equals(other.getELECLI()))) &&
            ((this.ELECLIDOP==null && other.getELECLIDOP()==null) || 
             (this.ELECLIDOP!=null &&
              this.ELECLIDOP.equals(other.getELECLIDOP()))) &&
            ((this.NR9KEY==null && other.getNR9KEY()==null) || 
             (this.NR9KEY!=null &&
              this.NR9KEY.equals(other.getNR9KEY()))) &&
            ((this.KEY==null && other.getKEY()==null) || 
             (this.KEY!=null &&
              java.util.Arrays.equals(this.KEY, other.getKEY())));
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
        if (getCDPFAS() != null) {
            _hashCode += getCDPFAS().hashCode();
        }
        if (getELECLI() != null) {
            _hashCode += getELECLI().hashCode();
        }
        if (getELECLIDOP() != null) {
            _hashCode += getELECLIDOP().hashCode();
        }
        if (getNR9KEY() != null) {
            _hashCode += getNR9KEY().hashCode();
        }
        if (getKEY() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getKEY());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getKEY(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(KII.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "KII"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CDPFAS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "CDPFAS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ELECLI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "ELECLI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "ELECLI"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ELECLIDOP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "ELECLIDOP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "ELECLI"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NR9KEY");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "NR9KEY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedShort"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("KEY");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "KEY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "KEY"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
