/**
 * ELECLI.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.eqs.lampoadr.ws.client.egon.suite;

public class ELECLI  implements java.io.Serializable {
    private org.apache.axis.types.UnsignedInt CDPFON;

    private org.apache.axis.types.UnsignedLong CDPCLI;

    private java.lang.String CDXCLI;

    private org.apache.axis.types.UnsignedLong PRPIND;

    private java.lang.String PRXIND;

    public ELECLI() {
    }

    public ELECLI(
           org.apache.axis.types.UnsignedInt CDPFON,
           org.apache.axis.types.UnsignedLong CDPCLI,
           java.lang.String CDXCLI,
           org.apache.axis.types.UnsignedLong PRPIND,
           java.lang.String PRXIND) {
           this.CDPFON = CDPFON;
           this.CDPCLI = CDPCLI;
           this.CDXCLI = CDXCLI;
           this.PRPIND = PRPIND;
           this.PRXIND = PRXIND;
    }


    /**
     * Gets the CDPFON value for this ELECLI.
     * 
     * @return CDPFON
     */
    public org.apache.axis.types.UnsignedInt getCDPFON() {
        return CDPFON;
    }


    /**
     * Sets the CDPFON value for this ELECLI.
     * 
     * @param CDPFON
     */
    public void setCDPFON(org.apache.axis.types.UnsignedInt CDPFON) {
        this.CDPFON = CDPFON;
    }


    /**
     * Gets the CDPCLI value for this ELECLI.
     * 
     * @return CDPCLI
     */
    public org.apache.axis.types.UnsignedLong getCDPCLI() {
        return CDPCLI;
    }


    /**
     * Sets the CDPCLI value for this ELECLI.
     * 
     * @param CDPCLI
     */
    public void setCDPCLI(org.apache.axis.types.UnsignedLong CDPCLI) {
        this.CDPCLI = CDPCLI;
    }


    /**
     * Gets the CDXCLI value for this ELECLI.
     * 
     * @return CDXCLI
     */
    public java.lang.String getCDXCLI() {
        return CDXCLI;
    }


    /**
     * Sets the CDXCLI value for this ELECLI.
     * 
     * @param CDXCLI
     */
    public void setCDXCLI(java.lang.String CDXCLI) {
        this.CDXCLI = CDXCLI;
    }


    /**
     * Gets the PRPIND value for this ELECLI.
     * 
     * @return PRPIND
     */
    public org.apache.axis.types.UnsignedLong getPRPIND() {
        return PRPIND;
    }


    /**
     * Sets the PRPIND value for this ELECLI.
     * 
     * @param PRPIND
     */
    public void setPRPIND(org.apache.axis.types.UnsignedLong PRPIND) {
        this.PRPIND = PRPIND;
    }


    /**
     * Gets the PRXIND value for this ELECLI.
     * 
     * @return PRXIND
     */
    public java.lang.String getPRXIND() {
        return PRXIND;
    }


    /**
     * Sets the PRXIND value for this ELECLI.
     * 
     * @param PRXIND
     */
    public void setPRXIND(java.lang.String PRXIND) {
        this.PRXIND = PRXIND;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ELECLI)) return false;
        ELECLI other = (ELECLI) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.CDPFON==null && other.getCDPFON()==null) || 
             (this.CDPFON!=null &&
              this.CDPFON.equals(other.getCDPFON()))) &&
            ((this.CDPCLI==null && other.getCDPCLI()==null) || 
             (this.CDPCLI!=null &&
              this.CDPCLI.equals(other.getCDPCLI()))) &&
            ((this.CDXCLI==null && other.getCDXCLI()==null) || 
             (this.CDXCLI!=null &&
              this.CDXCLI.equals(other.getCDXCLI()))) &&
            ((this.PRPIND==null && other.getPRPIND()==null) || 
             (this.PRPIND!=null &&
              this.PRPIND.equals(other.getPRPIND()))) &&
            ((this.PRXIND==null && other.getPRXIND()==null) || 
             (this.PRXIND!=null &&
              this.PRXIND.equals(other.getPRXIND())));
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
        if (getCDPFON() != null) {
            _hashCode += getCDPFON().hashCode();
        }
        if (getCDPCLI() != null) {
            _hashCode += getCDPCLI().hashCode();
        }
        if (getCDXCLI() != null) {
            _hashCode += getCDXCLI().hashCode();
        }
        if (getPRPIND() != null) {
            _hashCode += getPRPIND().hashCode();
        }
        if (getPRXIND() != null) {
            _hashCode += getPRXIND().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ELECLI.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "ELECLI"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CDPFON");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "CDPFON"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CDPCLI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "CDPCLI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedLong"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CDXCLI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "CDXCLI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PRPIND");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "PRPIND"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedLong"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PRXIND");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "PRXIND"));
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
