/**
 * STROUTELE.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.eqs.lampoadr.ws.client.egon.suite;

public class STROUTELE  implements java.io.Serializable {
    private java.lang.String DSXSTR;

    private java.lang.String DSXDUG;

    private java.lang.String DSXVIA;

    public STROUTELE() {
    }

    public STROUTELE(
           java.lang.String DSXSTR,
           java.lang.String DSXDUG,
           java.lang.String DSXVIA) {
           this.DSXSTR = DSXSTR;
           this.DSXDUG = DSXDUG;
           this.DSXVIA = DSXVIA;
    }


    /**
     * Gets the DSXSTR value for this STROUTELE.
     * 
     * @return DSXSTR
     */
    public java.lang.String getDSXSTR() {
        return DSXSTR;
    }


    /**
     * Sets the DSXSTR value for this STROUTELE.
     * 
     * @param DSXSTR
     */
    public void setDSXSTR(java.lang.String DSXSTR) {
        this.DSXSTR = DSXSTR;
    }


    /**
     * Gets the DSXDUG value for this STROUTELE.
     * 
     * @return DSXDUG
     */
    public java.lang.String getDSXDUG() {
        return DSXDUG;
    }


    /**
     * Sets the DSXDUG value for this STROUTELE.
     * 
     * @param DSXDUG
     */
    public void setDSXDUG(java.lang.String DSXDUG) {
        this.DSXDUG = DSXDUG;
    }


    /**
     * Gets the DSXVIA value for this STROUTELE.
     * 
     * @return DSXVIA
     */
    public java.lang.String getDSXVIA() {
        return DSXVIA;
    }


    /**
     * Sets the DSXVIA value for this STROUTELE.
     * 
     * @param DSXVIA
     */
    public void setDSXVIA(java.lang.String DSXVIA) {
        this.DSXVIA = DSXVIA;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof STROUTELE)) return false;
        STROUTELE other = (STROUTELE) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.DSXSTR==null && other.getDSXSTR()==null) || 
             (this.DSXSTR!=null &&
              this.DSXSTR.equals(other.getDSXSTR()))) &&
            ((this.DSXDUG==null && other.getDSXDUG()==null) || 
             (this.DSXDUG!=null &&
              this.DSXDUG.equals(other.getDSXDUG()))) &&
            ((this.DSXVIA==null && other.getDSXVIA()==null) || 
             (this.DSXVIA!=null &&
              this.DSXVIA.equals(other.getDSXVIA())));
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
        if (getDSXSTR() != null) {
            _hashCode += getDSXSTR().hashCode();
        }
        if (getDSXDUG() != null) {
            _hashCode += getDSXDUG().hashCode();
        }
        if (getDSXVIA() != null) {
            _hashCode += getDSXVIA().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(STROUTELE.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "STROUTELE"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DSXSTR");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "DSXSTR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DSXDUG");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "DSXDUG"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DSXVIA");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "DSXVIA"));
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
