/**
 * DSXSTROUT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.eqs.lampoadr.ws.client.egon.suite;

public class DSXSTROUT  implements java.io.Serializable {
    private java.lang.String DSXADD;

    private it.eqs.lampoadr.ws.client.egon.suite.STROUTELE DSXST1;

    private it.eqs.lampoadr.ws.client.egon.suite.STROUTELE DSXST2;

    public DSXSTROUT() {
    }

    public DSXSTROUT(
           java.lang.String DSXADD,
           it.eqs.lampoadr.ws.client.egon.suite.STROUTELE DSXST1,
           it.eqs.lampoadr.ws.client.egon.suite.STROUTELE DSXST2) {
           this.DSXADD = DSXADD;
           this.DSXST1 = DSXST1;
           this.DSXST2 = DSXST2;
    }


    /**
     * Gets the DSXADD value for this DSXSTROUT.
     * 
     * @return DSXADD
     */
    public java.lang.String getDSXADD() {
        return DSXADD;
    }


    /**
     * Sets the DSXADD value for this DSXSTROUT.
     * 
     * @param DSXADD
     */
    public void setDSXADD(java.lang.String DSXADD) {
        this.DSXADD = DSXADD;
    }


    /**
     * Gets the DSXST1 value for this DSXSTROUT.
     * 
     * @return DSXST1
     */
    public it.eqs.lampoadr.ws.client.egon.suite.STROUTELE getDSXST1() {
        return DSXST1;
    }


    /**
     * Sets the DSXST1 value for this DSXSTROUT.
     * 
     * @param DSXST1
     */
    public void setDSXST1(it.eqs.lampoadr.ws.client.egon.suite.STROUTELE DSXST1) {
        this.DSXST1 = DSXST1;
    }


    /**
     * Gets the DSXST2 value for this DSXSTROUT.
     * 
     * @return DSXST2
     */
    public it.eqs.lampoadr.ws.client.egon.suite.STROUTELE getDSXST2() {
        return DSXST2;
    }


    /**
     * Sets the DSXST2 value for this DSXSTROUT.
     * 
     * @param DSXST2
     */
    public void setDSXST2(it.eqs.lampoadr.ws.client.egon.suite.STROUTELE DSXST2) {
        this.DSXST2 = DSXST2;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DSXSTROUT)) return false;
        DSXSTROUT other = (DSXSTROUT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.DSXADD==null && other.getDSXADD()==null) || 
             (this.DSXADD!=null &&
              this.DSXADD.equals(other.getDSXADD()))) &&
            ((this.DSXST1==null && other.getDSXST1()==null) || 
             (this.DSXST1!=null &&
              this.DSXST1.equals(other.getDSXST1()))) &&
            ((this.DSXST2==null && other.getDSXST2()==null) || 
             (this.DSXST2!=null &&
              this.DSXST2.equals(other.getDSXST2())));
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
        if (getDSXADD() != null) {
            _hashCode += getDSXADD().hashCode();
        }
        if (getDSXST1() != null) {
            _hashCode += getDSXST1().hashCode();
        }
        if (getDSXST2() != null) {
            _hashCode += getDSXST2().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DSXSTROUT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "DSXSTROUT"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DSXADD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "DSXADD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DSXST1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "DSXST1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "STROUTELE"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DSXST2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "DSXST2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "STROUTELE"));
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
