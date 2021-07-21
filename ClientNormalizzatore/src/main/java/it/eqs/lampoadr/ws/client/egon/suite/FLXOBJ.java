/**
 * FLXOBJ.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.eqs.lampoadr.ws.client.egon.suite;

public class FLXOBJ  implements java.io.Serializable {
    private java.lang.String FLXCNY;

    private java.lang.String FLXSTA;

    private java.lang.String FLXREG;

    private java.lang.String FLXDPT;

    private java.lang.String FLXCNL;

    private java.lang.String FLXDS1;

    private java.lang.String FLXDS2;

    private java.lang.String FLXDS3;

    public FLXOBJ() {
    }

    public FLXOBJ(
           java.lang.String FLXCNY,
           java.lang.String FLXSTA,
           java.lang.String FLXREG,
           java.lang.String FLXDPT,
           java.lang.String FLXCNL,
           java.lang.String FLXDS1,
           java.lang.String FLXDS2,
           java.lang.String FLXDS3) {
           this.FLXCNY = FLXCNY;
           this.FLXSTA = FLXSTA;
           this.FLXREG = FLXREG;
           this.FLXDPT = FLXDPT;
           this.FLXCNL = FLXCNL;
           this.FLXDS1 = FLXDS1;
           this.FLXDS2 = FLXDS2;
           this.FLXDS3 = FLXDS3;
    }


    /**
     * Gets the FLXCNY value for this FLXOBJ.
     * 
     * @return FLXCNY
     */
    public java.lang.String getFLXCNY() {
        return FLXCNY;
    }


    /**
     * Sets the FLXCNY value for this FLXOBJ.
     * 
     * @param FLXCNY
     */
    public void setFLXCNY(java.lang.String FLXCNY) {
        this.FLXCNY = FLXCNY;
    }


    /**
     * Gets the FLXSTA value for this FLXOBJ.
     * 
     * @return FLXSTA
     */
    public java.lang.String getFLXSTA() {
        return FLXSTA;
    }


    /**
     * Sets the FLXSTA value for this FLXOBJ.
     * 
     * @param FLXSTA
     */
    public void setFLXSTA(java.lang.String FLXSTA) {
        this.FLXSTA = FLXSTA;
    }


    /**
     * Gets the FLXREG value for this FLXOBJ.
     * 
     * @return FLXREG
     */
    public java.lang.String getFLXREG() {
        return FLXREG;
    }


    /**
     * Sets the FLXREG value for this FLXOBJ.
     * 
     * @param FLXREG
     */
    public void setFLXREG(java.lang.String FLXREG) {
        this.FLXREG = FLXREG;
    }


    /**
     * Gets the FLXDPT value for this FLXOBJ.
     * 
     * @return FLXDPT
     */
    public java.lang.String getFLXDPT() {
        return FLXDPT;
    }


    /**
     * Sets the FLXDPT value for this FLXOBJ.
     * 
     * @param FLXDPT
     */
    public void setFLXDPT(java.lang.String FLXDPT) {
        this.FLXDPT = FLXDPT;
    }


    /**
     * Gets the FLXCNL value for this FLXOBJ.
     * 
     * @return FLXCNL
     */
    public java.lang.String getFLXCNL() {
        return FLXCNL;
    }


    /**
     * Sets the FLXCNL value for this FLXOBJ.
     * 
     * @param FLXCNL
     */
    public void setFLXCNL(java.lang.String FLXCNL) {
        this.FLXCNL = FLXCNL;
    }


    /**
     * Gets the FLXDS1 value for this FLXOBJ.
     * 
     * @return FLXDS1
     */
    public java.lang.String getFLXDS1() {
        return FLXDS1;
    }


    /**
     * Sets the FLXDS1 value for this FLXOBJ.
     * 
     * @param FLXDS1
     */
    public void setFLXDS1(java.lang.String FLXDS1) {
        this.FLXDS1 = FLXDS1;
    }


    /**
     * Gets the FLXDS2 value for this FLXOBJ.
     * 
     * @return FLXDS2
     */
    public java.lang.String getFLXDS2() {
        return FLXDS2;
    }


    /**
     * Sets the FLXDS2 value for this FLXOBJ.
     * 
     * @param FLXDS2
     */
    public void setFLXDS2(java.lang.String FLXDS2) {
        this.FLXDS2 = FLXDS2;
    }


    /**
     * Gets the FLXDS3 value for this FLXOBJ.
     * 
     * @return FLXDS3
     */
    public java.lang.String getFLXDS3() {
        return FLXDS3;
    }


    /**
     * Sets the FLXDS3 value for this FLXOBJ.
     * 
     * @param FLXDS3
     */
    public void setFLXDS3(java.lang.String FLXDS3) {
        this.FLXDS3 = FLXDS3;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FLXOBJ)) return false;
        FLXOBJ other = (FLXOBJ) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.FLXCNY==null && other.getFLXCNY()==null) || 
             (this.FLXCNY!=null &&
              this.FLXCNY.equals(other.getFLXCNY()))) &&
            ((this.FLXSTA==null && other.getFLXSTA()==null) || 
             (this.FLXSTA!=null &&
              this.FLXSTA.equals(other.getFLXSTA()))) &&
            ((this.FLXREG==null && other.getFLXREG()==null) || 
             (this.FLXREG!=null &&
              this.FLXREG.equals(other.getFLXREG()))) &&
            ((this.FLXDPT==null && other.getFLXDPT()==null) || 
             (this.FLXDPT!=null &&
              this.FLXDPT.equals(other.getFLXDPT()))) &&
            ((this.FLXCNL==null && other.getFLXCNL()==null) || 
             (this.FLXCNL!=null &&
              this.FLXCNL.equals(other.getFLXCNL()))) &&
            ((this.FLXDS1==null && other.getFLXDS1()==null) || 
             (this.FLXDS1!=null &&
              this.FLXDS1.equals(other.getFLXDS1()))) &&
            ((this.FLXDS2==null && other.getFLXDS2()==null) || 
             (this.FLXDS2!=null &&
              this.FLXDS2.equals(other.getFLXDS2()))) &&
            ((this.FLXDS3==null && other.getFLXDS3()==null) || 
             (this.FLXDS3!=null &&
              this.FLXDS3.equals(other.getFLXDS3())));
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
        if (getFLXCNY() != null) {
            _hashCode += getFLXCNY().hashCode();
        }
        if (getFLXSTA() != null) {
            _hashCode += getFLXSTA().hashCode();
        }
        if (getFLXREG() != null) {
            _hashCode += getFLXREG().hashCode();
        }
        if (getFLXDPT() != null) {
            _hashCode += getFLXDPT().hashCode();
        }
        if (getFLXCNL() != null) {
            _hashCode += getFLXCNL().hashCode();
        }
        if (getFLXDS1() != null) {
            _hashCode += getFLXDS1().hashCode();
        }
        if (getFLXDS2() != null) {
            _hashCode += getFLXDS2().hashCode();
        }
        if (getFLXDS3() != null) {
            _hashCode += getFLXDS3().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FLXOBJ.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "FLXOBJ"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FLXCNY");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "FLXCNY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("FLXREG");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "FLXREG"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FLXDPT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "FLXDPT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FLXCNL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "FLXCNL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FLXDS1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "FLXDS1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FLXDS2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "FLXDS2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FLXDS3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "FLXDS3"));
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
