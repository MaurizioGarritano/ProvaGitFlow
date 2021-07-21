/**
 * PTF.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.eqs.lampoadr.ws.client.egon.suite;

public class PTF  implements java.io.Serializable {
    private java.lang.String ROW1;

    private java.lang.String ROW2;

    private java.lang.String ROW3;

    private java.lang.String ROW4;

    private java.lang.String ROW5;

    private java.lang.String ROW6;

    private java.lang.String ROW7;

    public PTF() {
    }

    public PTF(
           java.lang.String ROW1,
           java.lang.String ROW2,
           java.lang.String ROW3,
           java.lang.String ROW4,
           java.lang.String ROW5,
           java.lang.String ROW6,
           java.lang.String ROW7) {
           this.ROW1 = ROW1;
           this.ROW2 = ROW2;
           this.ROW3 = ROW3;
           this.ROW4 = ROW4;
           this.ROW5 = ROW5;
           this.ROW6 = ROW6;
           this.ROW7 = ROW7;
    }


    /**
     * Gets the ROW1 value for this PTF.
     * 
     * @return ROW1
     */
    public java.lang.String getROW1() {
        return ROW1;
    }


    /**
     * Sets the ROW1 value for this PTF.
     * 
     * @param ROW1
     */
    public void setROW1(java.lang.String ROW1) {
        this.ROW1 = ROW1;
    }


    /**
     * Gets the ROW2 value for this PTF.
     * 
     * @return ROW2
     */
    public java.lang.String getROW2() {
        return ROW2;
    }


    /**
     * Sets the ROW2 value for this PTF.
     * 
     * @param ROW2
     */
    public void setROW2(java.lang.String ROW2) {
        this.ROW2 = ROW2;
    }


    /**
     * Gets the ROW3 value for this PTF.
     * 
     * @return ROW3
     */
    public java.lang.String getROW3() {
        return ROW3;
    }


    /**
     * Sets the ROW3 value for this PTF.
     * 
     * @param ROW3
     */
    public void setROW3(java.lang.String ROW3) {
        this.ROW3 = ROW3;
    }


    /**
     * Gets the ROW4 value for this PTF.
     * 
     * @return ROW4
     */
    public java.lang.String getROW4() {
        return ROW4;
    }


    /**
     * Sets the ROW4 value for this PTF.
     * 
     * @param ROW4
     */
    public void setROW4(java.lang.String ROW4) {
        this.ROW4 = ROW4;
    }


    /**
     * Gets the ROW5 value for this PTF.
     * 
     * @return ROW5
     */
    public java.lang.String getROW5() {
        return ROW5;
    }


    /**
     * Sets the ROW5 value for this PTF.
     * 
     * @param ROW5
     */
    public void setROW5(java.lang.String ROW5) {
        this.ROW5 = ROW5;
    }


    /**
     * Gets the ROW6 value for this PTF.
     * 
     * @return ROW6
     */
    public java.lang.String getROW6() {
        return ROW6;
    }


    /**
     * Sets the ROW6 value for this PTF.
     * 
     * @param ROW6
     */
    public void setROW6(java.lang.String ROW6) {
        this.ROW6 = ROW6;
    }


    /**
     * Gets the ROW7 value for this PTF.
     * 
     * @return ROW7
     */
    public java.lang.String getROW7() {
        return ROW7;
    }


    /**
     * Sets the ROW7 value for this PTF.
     * 
     * @param ROW7
     */
    public void setROW7(java.lang.String ROW7) {
        this.ROW7 = ROW7;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PTF)) return false;
        PTF other = (PTF) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ROW1==null && other.getROW1()==null) || 
             (this.ROW1!=null &&
              this.ROW1.equals(other.getROW1()))) &&
            ((this.ROW2==null && other.getROW2()==null) || 
             (this.ROW2!=null &&
              this.ROW2.equals(other.getROW2()))) &&
            ((this.ROW3==null && other.getROW3()==null) || 
             (this.ROW3!=null &&
              this.ROW3.equals(other.getROW3()))) &&
            ((this.ROW4==null && other.getROW4()==null) || 
             (this.ROW4!=null &&
              this.ROW4.equals(other.getROW4()))) &&
            ((this.ROW5==null && other.getROW5()==null) || 
             (this.ROW5!=null &&
              this.ROW5.equals(other.getROW5()))) &&
            ((this.ROW6==null && other.getROW6()==null) || 
             (this.ROW6!=null &&
              this.ROW6.equals(other.getROW6()))) &&
            ((this.ROW7==null && other.getROW7()==null) || 
             (this.ROW7!=null &&
              this.ROW7.equals(other.getROW7())));
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
        if (getROW1() != null) {
            _hashCode += getROW1().hashCode();
        }
        if (getROW2() != null) {
            _hashCode += getROW2().hashCode();
        }
        if (getROW3() != null) {
            _hashCode += getROW3().hashCode();
        }
        if (getROW4() != null) {
            _hashCode += getROW4().hashCode();
        }
        if (getROW5() != null) {
            _hashCode += getROW5().hashCode();
        }
        if (getROW6() != null) {
            _hashCode += getROW6().hashCode();
        }
        if (getROW7() != null) {
            _hashCode += getROW7().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PTF.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "PTF"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ROW1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "ROW1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ROW2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "ROW2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ROW3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "ROW3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ROW4");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "ROW4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ROW5");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "ROW5"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ROW6");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "ROW6"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ROW7");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "ROW7"));
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
