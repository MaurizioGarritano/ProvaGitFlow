/**
 * MRE.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.eqs.lampoadr.ws.client.egon.suite;

public class MRE  implements java.io.Serializable {
    private org.apache.axis.types.UnsignedShort TPPOBJMRE;

    private org.apache.axis.types.UnsignedLong CDPOBJMRE;

    private it.eqs.lampoadr.ws.client.egon.suite.LNGCDP LNGMRE;

    private java.lang.String DSXUFFMRE;

    private java.lang.String DSXUSRMRE;

    private java.lang.String DSXABBMRE;

    private java.lang.String DSXSIGMRE;

    public MRE() {
    }

    public MRE(
           org.apache.axis.types.UnsignedShort TPPOBJMRE,
           org.apache.axis.types.UnsignedLong CDPOBJMRE,
           it.eqs.lampoadr.ws.client.egon.suite.LNGCDP LNGMRE,
           java.lang.String DSXUFFMRE,
           java.lang.String DSXUSRMRE,
           java.lang.String DSXABBMRE,
           java.lang.String DSXSIGMRE) {
           this.TPPOBJMRE = TPPOBJMRE;
           this.CDPOBJMRE = CDPOBJMRE;
           this.LNGMRE = LNGMRE;
           this.DSXUFFMRE = DSXUFFMRE;
           this.DSXUSRMRE = DSXUSRMRE;
           this.DSXABBMRE = DSXABBMRE;
           this.DSXSIGMRE = DSXSIGMRE;
    }


    /**
     * Gets the TPPOBJMRE value for this MRE.
     * 
     * @return TPPOBJMRE
     */
    public org.apache.axis.types.UnsignedShort getTPPOBJMRE() {
        return TPPOBJMRE;
    }


    /**
     * Sets the TPPOBJMRE value for this MRE.
     * 
     * @param TPPOBJMRE
     */
    public void setTPPOBJMRE(org.apache.axis.types.UnsignedShort TPPOBJMRE) {
        this.TPPOBJMRE = TPPOBJMRE;
    }


    /**
     * Gets the CDPOBJMRE value for this MRE.
     * 
     * @return CDPOBJMRE
     */
    public org.apache.axis.types.UnsignedLong getCDPOBJMRE() {
        return CDPOBJMRE;
    }


    /**
     * Sets the CDPOBJMRE value for this MRE.
     * 
     * @param CDPOBJMRE
     */
    public void setCDPOBJMRE(org.apache.axis.types.UnsignedLong CDPOBJMRE) {
        this.CDPOBJMRE = CDPOBJMRE;
    }


    /**
     * Gets the LNGMRE value for this MRE.
     * 
     * @return LNGMRE
     */
    public it.eqs.lampoadr.ws.client.egon.suite.LNGCDP getLNGMRE() {
        return LNGMRE;
    }


    /**
     * Sets the LNGMRE value for this MRE.
     * 
     * @param LNGMRE
     */
    public void setLNGMRE(it.eqs.lampoadr.ws.client.egon.suite.LNGCDP LNGMRE) {
        this.LNGMRE = LNGMRE;
    }


    /**
     * Gets the DSXUFFMRE value for this MRE.
     * 
     * @return DSXUFFMRE
     */
    public java.lang.String getDSXUFFMRE() {
        return DSXUFFMRE;
    }


    /**
     * Sets the DSXUFFMRE value for this MRE.
     * 
     * @param DSXUFFMRE
     */
    public void setDSXUFFMRE(java.lang.String DSXUFFMRE) {
        this.DSXUFFMRE = DSXUFFMRE;
    }


    /**
     * Gets the DSXUSRMRE value for this MRE.
     * 
     * @return DSXUSRMRE
     */
    public java.lang.String getDSXUSRMRE() {
        return DSXUSRMRE;
    }


    /**
     * Sets the DSXUSRMRE value for this MRE.
     * 
     * @param DSXUSRMRE
     */
    public void setDSXUSRMRE(java.lang.String DSXUSRMRE) {
        this.DSXUSRMRE = DSXUSRMRE;
    }


    /**
     * Gets the DSXABBMRE value for this MRE.
     * 
     * @return DSXABBMRE
     */
    public java.lang.String getDSXABBMRE() {
        return DSXABBMRE;
    }


    /**
     * Sets the DSXABBMRE value for this MRE.
     * 
     * @param DSXABBMRE
     */
    public void setDSXABBMRE(java.lang.String DSXABBMRE) {
        this.DSXABBMRE = DSXABBMRE;
    }


    /**
     * Gets the DSXSIGMRE value for this MRE.
     * 
     * @return DSXSIGMRE
     */
    public java.lang.String getDSXSIGMRE() {
        return DSXSIGMRE;
    }


    /**
     * Sets the DSXSIGMRE value for this MRE.
     * 
     * @param DSXSIGMRE
     */
    public void setDSXSIGMRE(java.lang.String DSXSIGMRE) {
        this.DSXSIGMRE = DSXSIGMRE;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MRE)) return false;
        MRE other = (MRE) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.TPPOBJMRE==null && other.getTPPOBJMRE()==null) || 
             (this.TPPOBJMRE!=null &&
              this.TPPOBJMRE.equals(other.getTPPOBJMRE()))) &&
            ((this.CDPOBJMRE==null && other.getCDPOBJMRE()==null) || 
             (this.CDPOBJMRE!=null &&
              this.CDPOBJMRE.equals(other.getCDPOBJMRE()))) &&
            ((this.LNGMRE==null && other.getLNGMRE()==null) || 
             (this.LNGMRE!=null &&
              this.LNGMRE.equals(other.getLNGMRE()))) &&
            ((this.DSXUFFMRE==null && other.getDSXUFFMRE()==null) || 
             (this.DSXUFFMRE!=null &&
              this.DSXUFFMRE.equals(other.getDSXUFFMRE()))) &&
            ((this.DSXUSRMRE==null && other.getDSXUSRMRE()==null) || 
             (this.DSXUSRMRE!=null &&
              this.DSXUSRMRE.equals(other.getDSXUSRMRE()))) &&
            ((this.DSXABBMRE==null && other.getDSXABBMRE()==null) || 
             (this.DSXABBMRE!=null &&
              this.DSXABBMRE.equals(other.getDSXABBMRE()))) &&
            ((this.DSXSIGMRE==null && other.getDSXSIGMRE()==null) || 
             (this.DSXSIGMRE!=null &&
              this.DSXSIGMRE.equals(other.getDSXSIGMRE())));
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
        if (getTPPOBJMRE() != null) {
            _hashCode += getTPPOBJMRE().hashCode();
        }
        if (getCDPOBJMRE() != null) {
            _hashCode += getCDPOBJMRE().hashCode();
        }
        if (getLNGMRE() != null) {
            _hashCode += getLNGMRE().hashCode();
        }
        if (getDSXUFFMRE() != null) {
            _hashCode += getDSXUFFMRE().hashCode();
        }
        if (getDSXUSRMRE() != null) {
            _hashCode += getDSXUSRMRE().hashCode();
        }
        if (getDSXABBMRE() != null) {
            _hashCode += getDSXABBMRE().hashCode();
        }
        if (getDSXSIGMRE() != null) {
            _hashCode += getDSXSIGMRE().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MRE.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "MRE"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TPPOBJMRE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "TPPOBJMRE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedShort"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CDPOBJMRE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "CDPOBJMRE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedLong"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LNGMRE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "LNGMRE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "LNGCDP"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DSXUFFMRE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "DSXUFFMRE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DSXUSRMRE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "DSXUSRMRE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DSXABBMRE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "DSXABBMRE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DSXSIGMRE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "DSXSIGMRE"));
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
