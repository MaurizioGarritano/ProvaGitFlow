/**
 * ALTRO_620.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.eqs.lampoadr.ws.client.egon.suite;

public class ALTRO_620  implements java.io.Serializable {
    private java.lang.String DSXCASPOS;

    private java.lang.String DSXPREINR;

    private java.lang.String DSXCPNINR;

    private java.lang.String DSXEXTURB;

    private java.lang.String CDXMATCOD;

    public ALTRO_620() {
    }

    public ALTRO_620(
           java.lang.String DSXCASPOS,
           java.lang.String DSXPREINR,
           java.lang.String DSXCPNINR,
           java.lang.String DSXEXTURB,
           java.lang.String CDXMATCOD) {
           this.DSXCASPOS = DSXCASPOS;
           this.DSXPREINR = DSXPREINR;
           this.DSXCPNINR = DSXCPNINR;
           this.DSXEXTURB = DSXEXTURB;
           this.CDXMATCOD = CDXMATCOD;
    }


    /**
     * Gets the DSXCASPOS value for this ALTRO_620.
     * 
     * @return DSXCASPOS
     */
    public java.lang.String getDSXCASPOS() {
        return DSXCASPOS;
    }


    /**
     * Sets the DSXCASPOS value for this ALTRO_620.
     * 
     * @param DSXCASPOS
     */
    public void setDSXCASPOS(java.lang.String DSXCASPOS) {
        this.DSXCASPOS = DSXCASPOS;
    }


    /**
     * Gets the DSXPREINR value for this ALTRO_620.
     * 
     * @return DSXPREINR
     */
    public java.lang.String getDSXPREINR() {
        return DSXPREINR;
    }


    /**
     * Sets the DSXPREINR value for this ALTRO_620.
     * 
     * @param DSXPREINR
     */
    public void setDSXPREINR(java.lang.String DSXPREINR) {
        this.DSXPREINR = DSXPREINR;
    }


    /**
     * Gets the DSXCPNINR value for this ALTRO_620.
     * 
     * @return DSXCPNINR
     */
    public java.lang.String getDSXCPNINR() {
        return DSXCPNINR;
    }


    /**
     * Sets the DSXCPNINR value for this ALTRO_620.
     * 
     * @param DSXCPNINR
     */
    public void setDSXCPNINR(java.lang.String DSXCPNINR) {
        this.DSXCPNINR = DSXCPNINR;
    }


    /**
     * Gets the DSXEXTURB value for this ALTRO_620.
     * 
     * @return DSXEXTURB
     */
    public java.lang.String getDSXEXTURB() {
        return DSXEXTURB;
    }


    /**
     * Sets the DSXEXTURB value for this ALTRO_620.
     * 
     * @param DSXEXTURB
     */
    public void setDSXEXTURB(java.lang.String DSXEXTURB) {
        this.DSXEXTURB = DSXEXTURB;
    }


    /**
     * Gets the CDXMATCOD value for this ALTRO_620.
     * 
     * @return CDXMATCOD
     */
    public java.lang.String getCDXMATCOD() {
        return CDXMATCOD;
    }


    /**
     * Sets the CDXMATCOD value for this ALTRO_620.
     * 
     * @param CDXMATCOD
     */
    public void setCDXMATCOD(java.lang.String CDXMATCOD) {
        this.CDXMATCOD = CDXMATCOD;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ALTRO_620)) return false;
        ALTRO_620 other = (ALTRO_620) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.DSXCASPOS==null && other.getDSXCASPOS()==null) || 
             (this.DSXCASPOS!=null &&
              this.DSXCASPOS.equals(other.getDSXCASPOS()))) &&
            ((this.DSXPREINR==null && other.getDSXPREINR()==null) || 
             (this.DSXPREINR!=null &&
              this.DSXPREINR.equals(other.getDSXPREINR()))) &&
            ((this.DSXCPNINR==null && other.getDSXCPNINR()==null) || 
             (this.DSXCPNINR!=null &&
              this.DSXCPNINR.equals(other.getDSXCPNINR()))) &&
            ((this.DSXEXTURB==null && other.getDSXEXTURB()==null) || 
             (this.DSXEXTURB!=null &&
              this.DSXEXTURB.equals(other.getDSXEXTURB()))) &&
            ((this.CDXMATCOD==null && other.getCDXMATCOD()==null) || 
             (this.CDXMATCOD!=null &&
              this.CDXMATCOD.equals(other.getCDXMATCOD())));
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
        if (getDSXCASPOS() != null) {
            _hashCode += getDSXCASPOS().hashCode();
        }
        if (getDSXPREINR() != null) {
            _hashCode += getDSXPREINR().hashCode();
        }
        if (getDSXCPNINR() != null) {
            _hashCode += getDSXCPNINR().hashCode();
        }
        if (getDSXEXTURB() != null) {
            _hashCode += getDSXEXTURB().hashCode();
        }
        if (getCDXMATCOD() != null) {
            _hashCode += getCDXMATCOD().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ALTRO_620.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "ALTRO_620"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DSXCASPOS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "DSXCASPOS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DSXPREINR");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "DSXPREINR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DSXCPNINR");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "DSXCPNINR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DSXEXTURB");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "DSXEXTURB"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CDXMATCOD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "CDXMATCOD"));
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
