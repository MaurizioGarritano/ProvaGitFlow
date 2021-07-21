/**
 * ELECOD.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.eqs.lampoadr.ws.client.egon.suite;

public class ELECOD  implements java.io.Serializable {
    private java.lang.String CDXISO;

    private java.lang.String TPXCOD;

    private java.lang.String DSXCOD;

    private java.lang.String TPXRNK;

    private java.lang.String TPXCHK;

    public ELECOD() {
    }

    public ELECOD(
           java.lang.String CDXISO,
           java.lang.String TPXCOD,
           java.lang.String DSXCOD,
           java.lang.String TPXRNK,
           java.lang.String TPXCHK) {
           this.CDXISO = CDXISO;
           this.TPXCOD = TPXCOD;
           this.DSXCOD = DSXCOD;
           this.TPXRNK = TPXRNK;
           this.TPXCHK = TPXCHK;
    }


    /**
     * Gets the CDXISO value for this ELECOD.
     * 
     * @return CDXISO
     */
    public java.lang.String getCDXISO() {
        return CDXISO;
    }


    /**
     * Sets the CDXISO value for this ELECOD.
     * 
     * @param CDXISO
     */
    public void setCDXISO(java.lang.String CDXISO) {
        this.CDXISO = CDXISO;
    }


    /**
     * Gets the TPXCOD value for this ELECOD.
     * 
     * @return TPXCOD
     */
    public java.lang.String getTPXCOD() {
        return TPXCOD;
    }


    /**
     * Sets the TPXCOD value for this ELECOD.
     * 
     * @param TPXCOD
     */
    public void setTPXCOD(java.lang.String TPXCOD) {
        this.TPXCOD = TPXCOD;
    }


    /**
     * Gets the DSXCOD value for this ELECOD.
     * 
     * @return DSXCOD
     */
    public java.lang.String getDSXCOD() {
        return DSXCOD;
    }


    /**
     * Sets the DSXCOD value for this ELECOD.
     * 
     * @param DSXCOD
     */
    public void setDSXCOD(java.lang.String DSXCOD) {
        this.DSXCOD = DSXCOD;
    }


    /**
     * Gets the TPXRNK value for this ELECOD.
     * 
     * @return TPXRNK
     */
    public java.lang.String getTPXRNK() {
        return TPXRNK;
    }


    /**
     * Sets the TPXRNK value for this ELECOD.
     * 
     * @param TPXRNK
     */
    public void setTPXRNK(java.lang.String TPXRNK) {
        this.TPXRNK = TPXRNK;
    }


    /**
     * Gets the TPXCHK value for this ELECOD.
     * 
     * @return TPXCHK
     */
    public java.lang.String getTPXCHK() {
        return TPXCHK;
    }


    /**
     * Sets the TPXCHK value for this ELECOD.
     * 
     * @param TPXCHK
     */
    public void setTPXCHK(java.lang.String TPXCHK) {
        this.TPXCHK = TPXCHK;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ELECOD)) return false;
        ELECOD other = (ELECOD) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.CDXISO==null && other.getCDXISO()==null) || 
             (this.CDXISO!=null &&
              this.CDXISO.equals(other.getCDXISO()))) &&
            ((this.TPXCOD==null && other.getTPXCOD()==null) || 
             (this.TPXCOD!=null &&
              this.TPXCOD.equals(other.getTPXCOD()))) &&
            ((this.DSXCOD==null && other.getDSXCOD()==null) || 
             (this.DSXCOD!=null &&
              this.DSXCOD.equals(other.getDSXCOD()))) &&
            ((this.TPXRNK==null && other.getTPXRNK()==null) || 
             (this.TPXRNK!=null &&
              this.TPXRNK.equals(other.getTPXRNK()))) &&
            ((this.TPXCHK==null && other.getTPXCHK()==null) || 
             (this.TPXCHK!=null &&
              this.TPXCHK.equals(other.getTPXCHK())));
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
        if (getCDXISO() != null) {
            _hashCode += getCDXISO().hashCode();
        }
        if (getTPXCOD() != null) {
            _hashCode += getTPXCOD().hashCode();
        }
        if (getDSXCOD() != null) {
            _hashCode += getDSXCOD().hashCode();
        }
        if (getTPXRNK() != null) {
            _hashCode += getTPXRNK().hashCode();
        }
        if (getTPXCHK() != null) {
            _hashCode += getTPXCHK().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ELECOD.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "ELECOD"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CDXISO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "CDXISO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TPXCOD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "TPXCOD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DSXCOD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "DSXCOD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TPXRNK");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "TPXRNK"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TPXCHK");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "TPXCHK"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
