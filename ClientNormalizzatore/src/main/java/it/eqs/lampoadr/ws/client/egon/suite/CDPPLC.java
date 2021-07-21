/**
 * CDPPLC.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.eqs.lampoadr.ws.client.egon.suite;

public class CDPPLC  implements java.io.Serializable {
    private org.apache.axis.types.UnsignedLong CDPCNY;

    private org.apache.axis.types.UnsignedLong CDPSTA;

    private org.apache.axis.types.UnsignedLong CDPREG;

    private org.apache.axis.types.UnsignedLong CDPDPT;

    private org.apache.axis.types.UnsignedLong CDPCNL;

    private org.apache.axis.types.UnsignedLong CDPDS1;

    private org.apache.axis.types.UnsignedLong CDPDS2;

    private org.apache.axis.types.UnsignedLong CDPDS3;

    public CDPPLC() {
    }

    public CDPPLC(
           org.apache.axis.types.UnsignedLong CDPCNY,
           org.apache.axis.types.UnsignedLong CDPSTA,
           org.apache.axis.types.UnsignedLong CDPREG,
           org.apache.axis.types.UnsignedLong CDPDPT,
           org.apache.axis.types.UnsignedLong CDPCNL,
           org.apache.axis.types.UnsignedLong CDPDS1,
           org.apache.axis.types.UnsignedLong CDPDS2,
           org.apache.axis.types.UnsignedLong CDPDS3) {
           this.CDPCNY = CDPCNY;
           this.CDPSTA = CDPSTA;
           this.CDPREG = CDPREG;
           this.CDPDPT = CDPDPT;
           this.CDPCNL = CDPCNL;
           this.CDPDS1 = CDPDS1;
           this.CDPDS2 = CDPDS2;
           this.CDPDS3 = CDPDS3;
    }


    /**
     * Gets the CDPCNY value for this CDPPLC.
     * 
     * @return CDPCNY
     */
    public org.apache.axis.types.UnsignedLong getCDPCNY() {
        return CDPCNY;
    }


    /**
     * Sets the CDPCNY value for this CDPPLC.
     * 
     * @param CDPCNY
     */
    public void setCDPCNY(org.apache.axis.types.UnsignedLong CDPCNY) {
        this.CDPCNY = CDPCNY;
    }


    /**
     * Gets the CDPSTA value for this CDPPLC.
     * 
     * @return CDPSTA
     */
    public org.apache.axis.types.UnsignedLong getCDPSTA() {
        return CDPSTA;
    }


    /**
     * Sets the CDPSTA value for this CDPPLC.
     * 
     * @param CDPSTA
     */
    public void setCDPSTA(org.apache.axis.types.UnsignedLong CDPSTA) {
        this.CDPSTA = CDPSTA;
    }


    /**
     * Gets the CDPREG value for this CDPPLC.
     * 
     * @return CDPREG
     */
    public org.apache.axis.types.UnsignedLong getCDPREG() {
        return CDPREG;
    }


    /**
     * Sets the CDPREG value for this CDPPLC.
     * 
     * @param CDPREG
     */
    public void setCDPREG(org.apache.axis.types.UnsignedLong CDPREG) {
        this.CDPREG = CDPREG;
    }


    /**
     * Gets the CDPDPT value for this CDPPLC.
     * 
     * @return CDPDPT
     */
    public org.apache.axis.types.UnsignedLong getCDPDPT() {
        return CDPDPT;
    }


    /**
     * Sets the CDPDPT value for this CDPPLC.
     * 
     * @param CDPDPT
     */
    public void setCDPDPT(org.apache.axis.types.UnsignedLong CDPDPT) {
        this.CDPDPT = CDPDPT;
    }


    /**
     * Gets the CDPCNL value for this CDPPLC.
     * 
     * @return CDPCNL
     */
    public org.apache.axis.types.UnsignedLong getCDPCNL() {
        return CDPCNL;
    }


    /**
     * Sets the CDPCNL value for this CDPPLC.
     * 
     * @param CDPCNL
     */
    public void setCDPCNL(org.apache.axis.types.UnsignedLong CDPCNL) {
        this.CDPCNL = CDPCNL;
    }


    /**
     * Gets the CDPDS1 value for this CDPPLC.
     * 
     * @return CDPDS1
     */
    public org.apache.axis.types.UnsignedLong getCDPDS1() {
        return CDPDS1;
    }


    /**
     * Sets the CDPDS1 value for this CDPPLC.
     * 
     * @param CDPDS1
     */
    public void setCDPDS1(org.apache.axis.types.UnsignedLong CDPDS1) {
        this.CDPDS1 = CDPDS1;
    }


    /**
     * Gets the CDPDS2 value for this CDPPLC.
     * 
     * @return CDPDS2
     */
    public org.apache.axis.types.UnsignedLong getCDPDS2() {
        return CDPDS2;
    }


    /**
     * Sets the CDPDS2 value for this CDPPLC.
     * 
     * @param CDPDS2
     */
    public void setCDPDS2(org.apache.axis.types.UnsignedLong CDPDS2) {
        this.CDPDS2 = CDPDS2;
    }


    /**
     * Gets the CDPDS3 value for this CDPPLC.
     * 
     * @return CDPDS3
     */
    public org.apache.axis.types.UnsignedLong getCDPDS3() {
        return CDPDS3;
    }


    /**
     * Sets the CDPDS3 value for this CDPPLC.
     * 
     * @param CDPDS3
     */
    public void setCDPDS3(org.apache.axis.types.UnsignedLong CDPDS3) {
        this.CDPDS3 = CDPDS3;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CDPPLC)) return false;
        CDPPLC other = (CDPPLC) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.CDPCNY==null && other.getCDPCNY()==null) || 
             (this.CDPCNY!=null &&
              this.CDPCNY.equals(other.getCDPCNY()))) &&
            ((this.CDPSTA==null && other.getCDPSTA()==null) || 
             (this.CDPSTA!=null &&
              this.CDPSTA.equals(other.getCDPSTA()))) &&
            ((this.CDPREG==null && other.getCDPREG()==null) || 
             (this.CDPREG!=null &&
              this.CDPREG.equals(other.getCDPREG()))) &&
            ((this.CDPDPT==null && other.getCDPDPT()==null) || 
             (this.CDPDPT!=null &&
              this.CDPDPT.equals(other.getCDPDPT()))) &&
            ((this.CDPCNL==null && other.getCDPCNL()==null) || 
             (this.CDPCNL!=null &&
              this.CDPCNL.equals(other.getCDPCNL()))) &&
            ((this.CDPDS1==null && other.getCDPDS1()==null) || 
             (this.CDPDS1!=null &&
              this.CDPDS1.equals(other.getCDPDS1()))) &&
            ((this.CDPDS2==null && other.getCDPDS2()==null) || 
             (this.CDPDS2!=null &&
              this.CDPDS2.equals(other.getCDPDS2()))) &&
            ((this.CDPDS3==null && other.getCDPDS3()==null) || 
             (this.CDPDS3!=null &&
              this.CDPDS3.equals(other.getCDPDS3())));
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
        if (getCDPCNY() != null) {
            _hashCode += getCDPCNY().hashCode();
        }
        if (getCDPSTA() != null) {
            _hashCode += getCDPSTA().hashCode();
        }
        if (getCDPREG() != null) {
            _hashCode += getCDPREG().hashCode();
        }
        if (getCDPDPT() != null) {
            _hashCode += getCDPDPT().hashCode();
        }
        if (getCDPCNL() != null) {
            _hashCode += getCDPCNL().hashCode();
        }
        if (getCDPDS1() != null) {
            _hashCode += getCDPDS1().hashCode();
        }
        if (getCDPDS2() != null) {
            _hashCode += getCDPDS2().hashCode();
        }
        if (getCDPDS3() != null) {
            _hashCode += getCDPDS3().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CDPPLC.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "CDPPLC"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CDPCNY");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "CDPCNY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedLong"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CDPSTA");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "CDPSTA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedLong"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CDPREG");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "CDPREG"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedLong"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CDPDPT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "CDPDPT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedLong"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CDPCNL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "CDPCNL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedLong"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CDPDS1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "CDPDS1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedLong"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CDPDS2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "CDPDS2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedLong"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CDPDS3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "CDPDS3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedLong"));
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
