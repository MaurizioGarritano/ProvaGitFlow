/**
 * ELETEL.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.eqs.lampoadr.ws.client.egon.suite;

public class ELETEL  implements java.io.Serializable {
    private java.lang.String CDXISO;

    private java.lang.String TPXTEL;

    private java.lang.String USOTEL;

    private java.lang.String PFXOPR;

    private java.lang.String PFXINT;

    private java.lang.String PFXNAZ;

    private java.lang.String NR9TEL;

    public ELETEL() {
    }

    public ELETEL(
           java.lang.String CDXISO,
           java.lang.String TPXTEL,
           java.lang.String USOTEL,
           java.lang.String PFXOPR,
           java.lang.String PFXINT,
           java.lang.String PFXNAZ,
           java.lang.String NR9TEL) {
           this.CDXISO = CDXISO;
           this.TPXTEL = TPXTEL;
           this.USOTEL = USOTEL;
           this.PFXOPR = PFXOPR;
           this.PFXINT = PFXINT;
           this.PFXNAZ = PFXNAZ;
           this.NR9TEL = NR9TEL;
    }


    /**
     * Gets the CDXISO value for this ELETEL.
     * 
     * @return CDXISO
     */
    public java.lang.String getCDXISO() {
        return CDXISO;
    }


    /**
     * Sets the CDXISO value for this ELETEL.
     * 
     * @param CDXISO
     */
    public void setCDXISO(java.lang.String CDXISO) {
        this.CDXISO = CDXISO;
    }


    /**
     * Gets the TPXTEL value for this ELETEL.
     * 
     * @return TPXTEL
     */
    public java.lang.String getTPXTEL() {
        return TPXTEL;
    }


    /**
     * Sets the TPXTEL value for this ELETEL.
     * 
     * @param TPXTEL
     */
    public void setTPXTEL(java.lang.String TPXTEL) {
        this.TPXTEL = TPXTEL;
    }


    /**
     * Gets the USOTEL value for this ELETEL.
     * 
     * @return USOTEL
     */
    public java.lang.String getUSOTEL() {
        return USOTEL;
    }


    /**
     * Sets the USOTEL value for this ELETEL.
     * 
     * @param USOTEL
     */
    public void setUSOTEL(java.lang.String USOTEL) {
        this.USOTEL = USOTEL;
    }


    /**
     * Gets the PFXOPR value for this ELETEL.
     * 
     * @return PFXOPR
     */
    public java.lang.String getPFXOPR() {
        return PFXOPR;
    }


    /**
     * Sets the PFXOPR value for this ELETEL.
     * 
     * @param PFXOPR
     */
    public void setPFXOPR(java.lang.String PFXOPR) {
        this.PFXOPR = PFXOPR;
    }


    /**
     * Gets the PFXINT value for this ELETEL.
     * 
     * @return PFXINT
     */
    public java.lang.String getPFXINT() {
        return PFXINT;
    }


    /**
     * Sets the PFXINT value for this ELETEL.
     * 
     * @param PFXINT
     */
    public void setPFXINT(java.lang.String PFXINT) {
        this.PFXINT = PFXINT;
    }


    /**
     * Gets the PFXNAZ value for this ELETEL.
     * 
     * @return PFXNAZ
     */
    public java.lang.String getPFXNAZ() {
        return PFXNAZ;
    }


    /**
     * Sets the PFXNAZ value for this ELETEL.
     * 
     * @param PFXNAZ
     */
    public void setPFXNAZ(java.lang.String PFXNAZ) {
        this.PFXNAZ = PFXNAZ;
    }


    /**
     * Gets the NR9TEL value for this ELETEL.
     * 
     * @return NR9TEL
     */
    public java.lang.String getNR9TEL() {
        return NR9TEL;
    }


    /**
     * Sets the NR9TEL value for this ELETEL.
     * 
     * @param NR9TEL
     */
    public void setNR9TEL(java.lang.String NR9TEL) {
        this.NR9TEL = NR9TEL;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ELETEL)) return false;
        ELETEL other = (ELETEL) obj;
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
            ((this.TPXTEL==null && other.getTPXTEL()==null) || 
             (this.TPXTEL!=null &&
              this.TPXTEL.equals(other.getTPXTEL()))) &&
            ((this.USOTEL==null && other.getUSOTEL()==null) || 
             (this.USOTEL!=null &&
              this.USOTEL.equals(other.getUSOTEL()))) &&
            ((this.PFXOPR==null && other.getPFXOPR()==null) || 
             (this.PFXOPR!=null &&
              this.PFXOPR.equals(other.getPFXOPR()))) &&
            ((this.PFXINT==null && other.getPFXINT()==null) || 
             (this.PFXINT!=null &&
              this.PFXINT.equals(other.getPFXINT()))) &&
            ((this.PFXNAZ==null && other.getPFXNAZ()==null) || 
             (this.PFXNAZ!=null &&
              this.PFXNAZ.equals(other.getPFXNAZ()))) &&
            ((this.NR9TEL==null && other.getNR9TEL()==null) || 
             (this.NR9TEL!=null &&
              this.NR9TEL.equals(other.getNR9TEL())));
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
        if (getTPXTEL() != null) {
            _hashCode += getTPXTEL().hashCode();
        }
        if (getUSOTEL() != null) {
            _hashCode += getUSOTEL().hashCode();
        }
        if (getPFXOPR() != null) {
            _hashCode += getPFXOPR().hashCode();
        }
        if (getPFXINT() != null) {
            _hashCode += getPFXINT().hashCode();
        }
        if (getPFXNAZ() != null) {
            _hashCode += getPFXNAZ().hashCode();
        }
        if (getNR9TEL() != null) {
            _hashCode += getNR9TEL().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ELETEL.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "ELETEL"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CDXISO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "CDXISO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TPXTEL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "TPXTEL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("USOTEL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "USOTEL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PFXOPR");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "PFXOPR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PFXINT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "PFXINT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PFXNAZ");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "PFXNAZ"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NR9TEL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "NR9TEL"));
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
