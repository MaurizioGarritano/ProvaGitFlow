/**
 * DSXPLC.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.eqs.lampoadr.ws.client.egon.suite;

public class DSXPLC  implements java.io.Serializable {
    private java.lang.String DSXCNY;

    private java.lang.String DSXSTA;

    private java.lang.String DSXREG;

    private java.lang.String DSXDPT;

    private java.lang.String DSXCNL;

    private java.lang.String DSXDS1;

    private java.lang.String DSXDS2;

    private java.lang.String DSXDS3;

    public DSXPLC() {
    }

    public DSXPLC(
           java.lang.String DSXCNY,
           java.lang.String DSXSTA,
           java.lang.String DSXREG,
           java.lang.String DSXDPT,
           java.lang.String DSXCNL,
           java.lang.String DSXDS1,
           java.lang.String DSXDS2,
           java.lang.String DSXDS3) {
           this.DSXCNY = DSXCNY;
           this.DSXSTA = DSXSTA;
           this.DSXREG = DSXREG;
           this.DSXDPT = DSXDPT;
           this.DSXCNL = DSXCNL;
           this.DSXDS1 = DSXDS1;
           this.DSXDS2 = DSXDS2;
           this.DSXDS3 = DSXDS3;
    }


    /**
     * Gets the DSXCNY value for this DSXPLC.
     * 
     * @return DSXCNY
     */
    public java.lang.String getDSXCNY() {
        return DSXCNY;
    }


    /**
     * Sets the DSXCNY value for this DSXPLC.
     * 
     * @param DSXCNY
     */
    public void setDSXCNY(java.lang.String DSXCNY) {
        this.DSXCNY = DSXCNY;
    }


    /**
     * Gets the DSXSTA value for this DSXPLC.
     * 
     * @return DSXSTA
     */
    public java.lang.String getDSXSTA() {
        return DSXSTA;
    }


    /**
     * Sets the DSXSTA value for this DSXPLC.
     * 
     * @param DSXSTA
     */
    public void setDSXSTA(java.lang.String DSXSTA) {
        this.DSXSTA = DSXSTA;
    }


    /**
     * Gets the DSXREG value for this DSXPLC.
     * 
     * @return DSXREG
     */
    public java.lang.String getDSXREG() {
        return DSXREG;
    }


    /**
     * Sets the DSXREG value for this DSXPLC.
     * 
     * @param DSXREG
     */
    public void setDSXREG(java.lang.String DSXREG) {
        this.DSXREG = DSXREG;
    }


    /**
     * Gets the DSXDPT value for this DSXPLC.
     * 
     * @return DSXDPT
     */
    public java.lang.String getDSXDPT() {
        return DSXDPT;
    }


    /**
     * Sets the DSXDPT value for this DSXPLC.
     * 
     * @param DSXDPT
     */
    public void setDSXDPT(java.lang.String DSXDPT) {
        this.DSXDPT = DSXDPT;
    }


    /**
     * Gets the DSXCNL value for this DSXPLC.
     * 
     * @return DSXCNL
     */
    public java.lang.String getDSXCNL() {
        return DSXCNL;
    }


    /**
     * Sets the DSXCNL value for this DSXPLC.
     * 
     * @param DSXCNL
     */
    public void setDSXCNL(java.lang.String DSXCNL) {
        this.DSXCNL = DSXCNL;
    }


    /**
     * Gets the DSXDS1 value for this DSXPLC.
     * 
     * @return DSXDS1
     */
    public java.lang.String getDSXDS1() {
        return DSXDS1;
    }


    /**
     * Sets the DSXDS1 value for this DSXPLC.
     * 
     * @param DSXDS1
     */
    public void setDSXDS1(java.lang.String DSXDS1) {
        this.DSXDS1 = DSXDS1;
    }


    /**
     * Gets the DSXDS2 value for this DSXPLC.
     * 
     * @return DSXDS2
     */
    public java.lang.String getDSXDS2() {
        return DSXDS2;
    }


    /**
     * Sets the DSXDS2 value for this DSXPLC.
     * 
     * @param DSXDS2
     */
    public void setDSXDS2(java.lang.String DSXDS2) {
        this.DSXDS2 = DSXDS2;
    }


    /**
     * Gets the DSXDS3 value for this DSXPLC.
     * 
     * @return DSXDS3
     */
    public java.lang.String getDSXDS3() {
        return DSXDS3;
    }


    /**
     * Sets the DSXDS3 value for this DSXPLC.
     * 
     * @param DSXDS3
     */
    public void setDSXDS3(java.lang.String DSXDS3) {
        this.DSXDS3 = DSXDS3;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DSXPLC)) return false;
        DSXPLC other = (DSXPLC) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.DSXCNY==null && other.getDSXCNY()==null) || 
             (this.DSXCNY!=null &&
              this.DSXCNY.equals(other.getDSXCNY()))) &&
            ((this.DSXSTA==null && other.getDSXSTA()==null) || 
             (this.DSXSTA!=null &&
              this.DSXSTA.equals(other.getDSXSTA()))) &&
            ((this.DSXREG==null && other.getDSXREG()==null) || 
             (this.DSXREG!=null &&
              this.DSXREG.equals(other.getDSXREG()))) &&
            ((this.DSXDPT==null && other.getDSXDPT()==null) || 
             (this.DSXDPT!=null &&
              this.DSXDPT.equals(other.getDSXDPT()))) &&
            ((this.DSXCNL==null && other.getDSXCNL()==null) || 
             (this.DSXCNL!=null &&
              this.DSXCNL.equals(other.getDSXCNL()))) &&
            ((this.DSXDS1==null && other.getDSXDS1()==null) || 
             (this.DSXDS1!=null &&
              this.DSXDS1.equals(other.getDSXDS1()))) &&
            ((this.DSXDS2==null && other.getDSXDS2()==null) || 
             (this.DSXDS2!=null &&
              this.DSXDS2.equals(other.getDSXDS2()))) &&
            ((this.DSXDS3==null && other.getDSXDS3()==null) || 
             (this.DSXDS3!=null &&
              this.DSXDS3.equals(other.getDSXDS3())));
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
        if (getDSXCNY() != null) {
            _hashCode += getDSXCNY().hashCode();
        }
        if (getDSXSTA() != null) {
            _hashCode += getDSXSTA().hashCode();
        }
        if (getDSXREG() != null) {
            _hashCode += getDSXREG().hashCode();
        }
        if (getDSXDPT() != null) {
            _hashCode += getDSXDPT().hashCode();
        }
        if (getDSXCNL() != null) {
            _hashCode += getDSXCNL().hashCode();
        }
        if (getDSXDS1() != null) {
            _hashCode += getDSXDS1().hashCode();
        }
        if (getDSXDS2() != null) {
            _hashCode += getDSXDS2().hashCode();
        }
        if (getDSXDS3() != null) {
            _hashCode += getDSXDS3().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DSXPLC.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "DSXPLC"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DSXCNY");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "DSXCNY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DSXSTA");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "DSXSTA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DSXREG");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "DSXREG"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DSXDPT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "DSXDPT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DSXCNL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "DSXCNL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DSXDS1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "DSXDS1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DSXDS2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "DSXDS2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DSXDS3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "DSXDS3"));
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
