/**
 * KIO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.eqs.lampoadr.ws.client.egon.suite;

public class KIO  implements java.io.Serializable {
    private java.lang.String FLXDOP;

    private it.eqs.lampoadr.ws.client.egon.suite.ELECLI ELECLI;

    private java.lang.String FLXSTA;

    private java.lang.String FLXSCN;

    private org.apache.axis.types.UnsignedShort NUMDOP;

    private it.eqs.lampoadr.ws.client.egon.suite.CLIDOP[] CLIDOP;

    public KIO() {
    }

    public KIO(
           java.lang.String FLXDOP,
           it.eqs.lampoadr.ws.client.egon.suite.ELECLI ELECLI,
           java.lang.String FLXSTA,
           java.lang.String FLXSCN,
           org.apache.axis.types.UnsignedShort NUMDOP,
           it.eqs.lampoadr.ws.client.egon.suite.CLIDOP[] CLIDOP) {
           this.FLXDOP = FLXDOP;
           this.ELECLI = ELECLI;
           this.FLXSTA = FLXSTA;
           this.FLXSCN = FLXSCN;
           this.NUMDOP = NUMDOP;
           this.CLIDOP = CLIDOP;
    }


    /**
     * Gets the FLXDOP value for this KIO.
     * 
     * @return FLXDOP
     */
    public java.lang.String getFLXDOP() {
        return FLXDOP;
    }


    /**
     * Sets the FLXDOP value for this KIO.
     * 
     * @param FLXDOP
     */
    public void setFLXDOP(java.lang.String FLXDOP) {
        this.FLXDOP = FLXDOP;
    }


    /**
     * Gets the ELECLI value for this KIO.
     * 
     * @return ELECLI
     */
    public it.eqs.lampoadr.ws.client.egon.suite.ELECLI getELECLI() {
        return ELECLI;
    }


    /**
     * Sets the ELECLI value for this KIO.
     * 
     * @param ELECLI
     */
    public void setELECLI(it.eqs.lampoadr.ws.client.egon.suite.ELECLI ELECLI) {
        this.ELECLI = ELECLI;
    }


    /**
     * Gets the FLXSTA value for this KIO.
     * 
     * @return FLXSTA
     */
    public java.lang.String getFLXSTA() {
        return FLXSTA;
    }


    /**
     * Sets the FLXSTA value for this KIO.
     * 
     * @param FLXSTA
     */
    public void setFLXSTA(java.lang.String FLXSTA) {
        this.FLXSTA = FLXSTA;
    }


    /**
     * Gets the FLXSCN value for this KIO.
     * 
     * @return FLXSCN
     */
    public java.lang.String getFLXSCN() {
        return FLXSCN;
    }


    /**
     * Sets the FLXSCN value for this KIO.
     * 
     * @param FLXSCN
     */
    public void setFLXSCN(java.lang.String FLXSCN) {
        this.FLXSCN = FLXSCN;
    }


    /**
     * Gets the NUMDOP value for this KIO.
     * 
     * @return NUMDOP
     */
    public org.apache.axis.types.UnsignedShort getNUMDOP() {
        return NUMDOP;
    }


    /**
     * Sets the NUMDOP value for this KIO.
     * 
     * @param NUMDOP
     */
    public void setNUMDOP(org.apache.axis.types.UnsignedShort NUMDOP) {
        this.NUMDOP = NUMDOP;
    }


    /**
     * Gets the CLIDOP value for this KIO.
     * 
     * @return CLIDOP
     */
    public it.eqs.lampoadr.ws.client.egon.suite.CLIDOP[] getCLIDOP() {
        return CLIDOP;
    }


    /**
     * Sets the CLIDOP value for this KIO.
     * 
     * @param CLIDOP
     */
    public void setCLIDOP(it.eqs.lampoadr.ws.client.egon.suite.CLIDOP[] CLIDOP) {
        this.CLIDOP = CLIDOP;
    }

    public it.eqs.lampoadr.ws.client.egon.suite.CLIDOP getCLIDOP(int i) {
        return this.CLIDOP[i];
    }

    public void setCLIDOP(int i, it.eqs.lampoadr.ws.client.egon.suite.CLIDOP _value) {
        this.CLIDOP[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof KIO)) return false;
        KIO other = (KIO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.FLXDOP==null && other.getFLXDOP()==null) || 
             (this.FLXDOP!=null &&
              this.FLXDOP.equals(other.getFLXDOP()))) &&
            ((this.ELECLI==null && other.getELECLI()==null) || 
             (this.ELECLI!=null &&
              this.ELECLI.equals(other.getELECLI()))) &&
            ((this.FLXSTA==null && other.getFLXSTA()==null) || 
             (this.FLXSTA!=null &&
              this.FLXSTA.equals(other.getFLXSTA()))) &&
            ((this.FLXSCN==null && other.getFLXSCN()==null) || 
             (this.FLXSCN!=null &&
              this.FLXSCN.equals(other.getFLXSCN()))) &&
            ((this.NUMDOP==null && other.getNUMDOP()==null) || 
             (this.NUMDOP!=null &&
              this.NUMDOP.equals(other.getNUMDOP()))) &&
            ((this.CLIDOP==null && other.getCLIDOP()==null) || 
             (this.CLIDOP!=null &&
              java.util.Arrays.equals(this.CLIDOP, other.getCLIDOP())));
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
        if (getFLXDOP() != null) {
            _hashCode += getFLXDOP().hashCode();
        }
        if (getELECLI() != null) {
            _hashCode += getELECLI().hashCode();
        }
        if (getFLXSTA() != null) {
            _hashCode += getFLXSTA().hashCode();
        }
        if (getFLXSCN() != null) {
            _hashCode += getFLXSCN().hashCode();
        }
        if (getNUMDOP() != null) {
            _hashCode += getNUMDOP().hashCode();
        }
        if (getCLIDOP() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCLIDOP());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCLIDOP(), i);
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
        new org.apache.axis.description.TypeDesc(KIO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "KIO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FLXDOP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "FLXDOP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ELECLI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "ELECLI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "ELECLI"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FLXSTA");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "FLXSTA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FLXSCN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "FLXSCN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NUMDOP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "NUMDOP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedShort"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CLIDOP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "CLIDOP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "CLIDOP"));
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
