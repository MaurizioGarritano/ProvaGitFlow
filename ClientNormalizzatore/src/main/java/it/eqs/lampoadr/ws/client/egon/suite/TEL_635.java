/**
 * TEL_635.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.eqs.lampoadr.ws.client.egon.suite;

public class TEL_635  implements java.io.Serializable {
    private org.apache.axis.types.UnsignedShort NRZELE;

    private it.eqs.lampoadr.ws.client.egon.suite.ELETEL[] ELETEL;

    private java.lang.String NOTE;

    public TEL_635() {
    }

    public TEL_635(
           org.apache.axis.types.UnsignedShort NRZELE,
           it.eqs.lampoadr.ws.client.egon.suite.ELETEL[] ELETEL,
           java.lang.String NOTE) {
           this.NRZELE = NRZELE;
           this.ELETEL = ELETEL;
           this.NOTE = NOTE;
    }


    /**
     * Gets the NRZELE value for this TEL_635.
     * 
     * @return NRZELE
     */
    public org.apache.axis.types.UnsignedShort getNRZELE() {
        return NRZELE;
    }


    /**
     * Sets the NRZELE value for this TEL_635.
     * 
     * @param NRZELE
     */
    public void setNRZELE(org.apache.axis.types.UnsignedShort NRZELE) {
        this.NRZELE = NRZELE;
    }


    /**
     * Gets the ELETEL value for this TEL_635.
     * 
     * @return ELETEL
     */
    public it.eqs.lampoadr.ws.client.egon.suite.ELETEL[] getELETEL() {
        return ELETEL;
    }


    /**
     * Sets the ELETEL value for this TEL_635.
     * 
     * @param ELETEL
     */
    public void setELETEL(it.eqs.lampoadr.ws.client.egon.suite.ELETEL[] ELETEL) {
        this.ELETEL = ELETEL;
    }

    public it.eqs.lampoadr.ws.client.egon.suite.ELETEL getELETEL(int i) {
        return this.ELETEL[i];
    }

    public void setELETEL(int i, it.eqs.lampoadr.ws.client.egon.suite.ELETEL _value) {
        this.ELETEL[i] = _value;
    }


    /**
     * Gets the NOTE value for this TEL_635.
     * 
     * @return NOTE
     */
    public java.lang.String getNOTE() {
        return NOTE;
    }


    /**
     * Sets the NOTE value for this TEL_635.
     * 
     * @param NOTE
     */
    public void setNOTE(java.lang.String NOTE) {
        this.NOTE = NOTE;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TEL_635)) return false;
        TEL_635 other = (TEL_635) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.NRZELE==null && other.getNRZELE()==null) || 
             (this.NRZELE!=null &&
              this.NRZELE.equals(other.getNRZELE()))) &&
            ((this.ELETEL==null && other.getELETEL()==null) || 
             (this.ELETEL!=null &&
              java.util.Arrays.equals(this.ELETEL, other.getELETEL()))) &&
            ((this.NOTE==null && other.getNOTE()==null) || 
             (this.NOTE!=null &&
              this.NOTE.equals(other.getNOTE())));
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
        if (getNRZELE() != null) {
            _hashCode += getNRZELE().hashCode();
        }
        if (getELETEL() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getELETEL());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getELETEL(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNOTE() != null) {
            _hashCode += getNOTE().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TEL_635.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "TEL_635"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NRZELE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "NRZELE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedShort"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ELETEL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "ELETEL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "ELETEL"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NOTE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "NOTE"));
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
