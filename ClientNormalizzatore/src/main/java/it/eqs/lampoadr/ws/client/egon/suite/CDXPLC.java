/**
 * CDXPLC.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.eqs.lampoadr.ws.client.egon.suite;

public class CDXPLC  implements java.io.Serializable {
    private java.lang.String CDXCNY;

    private java.lang.String CDXSTA;

    private java.lang.String CDXREG;

    private java.lang.String CDXDPT;

    private java.lang.String CDXCNL;

    private java.lang.String CDXDS1;

    private java.lang.String CDXDS2;

    private java.lang.String CDXDS3;

    public CDXPLC() {
    }

    public CDXPLC(
           java.lang.String CDXCNY,
           java.lang.String CDXSTA,
           java.lang.String CDXREG,
           java.lang.String CDXDPT,
           java.lang.String CDXCNL,
           java.lang.String CDXDS1,
           java.lang.String CDXDS2,
           java.lang.String CDXDS3) {
           this.CDXCNY = CDXCNY;
           this.CDXSTA = CDXSTA;
           this.CDXREG = CDXREG;
           this.CDXDPT = CDXDPT;
           this.CDXCNL = CDXCNL;
           this.CDXDS1 = CDXDS1;
           this.CDXDS2 = CDXDS2;
           this.CDXDS3 = CDXDS3;
    }


    /**
     * Gets the CDXCNY value for this CDXPLC.
     * 
     * @return CDXCNY
     */
    public java.lang.String getCDXCNY() {
        return CDXCNY;
    }


    /**
     * Sets the CDXCNY value for this CDXPLC.
     * 
     * @param CDXCNY
     */
    public void setCDXCNY(java.lang.String CDXCNY) {
        this.CDXCNY = CDXCNY;
    }


    /**
     * Gets the CDXSTA value for this CDXPLC.
     * 
     * @return CDXSTA
     */
    public java.lang.String getCDXSTA() {
        return CDXSTA;
    }


    /**
     * Sets the CDXSTA value for this CDXPLC.
     * 
     * @param CDXSTA
     */
    public void setCDXSTA(java.lang.String CDXSTA) {
        this.CDXSTA = CDXSTA;
    }


    /**
     * Gets the CDXREG value for this CDXPLC.
     * 
     * @return CDXREG
     */
    public java.lang.String getCDXREG() {
        return CDXREG;
    }


    /**
     * Sets the CDXREG value for this CDXPLC.
     * 
     * @param CDXREG
     */
    public void setCDXREG(java.lang.String CDXREG) {
        this.CDXREG = CDXREG;
    }


    /**
     * Gets the CDXDPT value for this CDXPLC.
     * 
     * @return CDXDPT
     */
    public java.lang.String getCDXDPT() {
        return CDXDPT;
    }


    /**
     * Sets the CDXDPT value for this CDXPLC.
     * 
     * @param CDXDPT
     */
    public void setCDXDPT(java.lang.String CDXDPT) {
        this.CDXDPT = CDXDPT;
    }


    /**
     * Gets the CDXCNL value for this CDXPLC.
     * 
     * @return CDXCNL
     */
    public java.lang.String getCDXCNL() {
        return CDXCNL;
    }


    /**
     * Sets the CDXCNL value for this CDXPLC.
     * 
     * @param CDXCNL
     */
    public void setCDXCNL(java.lang.String CDXCNL) {
        this.CDXCNL = CDXCNL;
    }


    /**
     * Gets the CDXDS1 value for this CDXPLC.
     * 
     * @return CDXDS1
     */
    public java.lang.String getCDXDS1() {
        return CDXDS1;
    }


    /**
     * Sets the CDXDS1 value for this CDXPLC.
     * 
     * @param CDXDS1
     */
    public void setCDXDS1(java.lang.String CDXDS1) {
        this.CDXDS1 = CDXDS1;
    }


    /**
     * Gets the CDXDS2 value for this CDXPLC.
     * 
     * @return CDXDS2
     */
    public java.lang.String getCDXDS2() {
        return CDXDS2;
    }


    /**
     * Sets the CDXDS2 value for this CDXPLC.
     * 
     * @param CDXDS2
     */
    public void setCDXDS2(java.lang.String CDXDS2) {
        this.CDXDS2 = CDXDS2;
    }


    /**
     * Gets the CDXDS3 value for this CDXPLC.
     * 
     * @return CDXDS3
     */
    public java.lang.String getCDXDS3() {
        return CDXDS3;
    }


    /**
     * Sets the CDXDS3 value for this CDXPLC.
     * 
     * @param CDXDS3
     */
    public void setCDXDS3(java.lang.String CDXDS3) {
        this.CDXDS3 = CDXDS3;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CDXPLC)) return false;
        CDXPLC other = (CDXPLC) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.CDXCNY==null && other.getCDXCNY()==null) || 
             (this.CDXCNY!=null &&
              this.CDXCNY.equals(other.getCDXCNY()))) &&
            ((this.CDXSTA==null && other.getCDXSTA()==null) || 
             (this.CDXSTA!=null &&
              this.CDXSTA.equals(other.getCDXSTA()))) &&
            ((this.CDXREG==null && other.getCDXREG()==null) || 
             (this.CDXREG!=null &&
              this.CDXREG.equals(other.getCDXREG()))) &&
            ((this.CDXDPT==null && other.getCDXDPT()==null) || 
             (this.CDXDPT!=null &&
              this.CDXDPT.equals(other.getCDXDPT()))) &&
            ((this.CDXCNL==null && other.getCDXCNL()==null) || 
             (this.CDXCNL!=null &&
              this.CDXCNL.equals(other.getCDXCNL()))) &&
            ((this.CDXDS1==null && other.getCDXDS1()==null) || 
             (this.CDXDS1!=null &&
              this.CDXDS1.equals(other.getCDXDS1()))) &&
            ((this.CDXDS2==null && other.getCDXDS2()==null) || 
             (this.CDXDS2!=null &&
              this.CDXDS2.equals(other.getCDXDS2()))) &&
            ((this.CDXDS3==null && other.getCDXDS3()==null) || 
             (this.CDXDS3!=null &&
              this.CDXDS3.equals(other.getCDXDS3())));
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
        if (getCDXCNY() != null) {
            _hashCode += getCDXCNY().hashCode();
        }
        if (getCDXSTA() != null) {
            _hashCode += getCDXSTA().hashCode();
        }
        if (getCDXREG() != null) {
            _hashCode += getCDXREG().hashCode();
        }
        if (getCDXDPT() != null) {
            _hashCode += getCDXDPT().hashCode();
        }
        if (getCDXCNL() != null) {
            _hashCode += getCDXCNL().hashCode();
        }
        if (getCDXDS1() != null) {
            _hashCode += getCDXDS1().hashCode();
        }
        if (getCDXDS2() != null) {
            _hashCode += getCDXDS2().hashCode();
        }
        if (getCDXDS3() != null) {
            _hashCode += getCDXDS3().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CDXPLC.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "CDXPLC"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CDXCNY");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "CDXCNY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CDXSTA");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "CDXSTA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CDXREG");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "CDXREG"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CDXDPT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "CDXDPT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CDXCNL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "CDXCNL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CDXDS1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "CDXDS1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CDXDS2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "CDXDS2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CDXDS3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "CDXDS3"));
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
