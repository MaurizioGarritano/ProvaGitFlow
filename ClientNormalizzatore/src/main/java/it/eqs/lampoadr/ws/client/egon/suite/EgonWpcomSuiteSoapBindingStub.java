/**
 * EgonWpcomSuiteSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.eqs.lampoadr.ws.client.egon.suite;

public class EgonWpcomSuiteSoapBindingStub extends org.apache.axis.client.Stub implements it.eqs.lampoadr.ws.client.egon.suite.EgonWpcomSuitePort {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[9];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("wpNorm");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "parametro"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "WPFGO"), it.eqs.lampoadr.ws.client.egon.suite.WPFGO.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "WPFGO"));
        oper.setReturnClass(it.eqs.lampoadr.ws.client.egon.suite.WPFGO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "wpNormResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("wpDed");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "parametro"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "WPFGO"), it.eqs.lampoadr.ws.client.egon.suite.WPFGO.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "WPFGO"));
        oper.setReturnClass(it.eqs.lampoadr.ws.client.egon.suite.WPFGO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "wpDedResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("wpInsKey");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "parametro"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "WPFGO"), it.eqs.lampoadr.ws.client.egon.suite.WPFGO.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "WPFGO"));
        oper.setReturnClass(it.eqs.lampoadr.ws.client.egon.suite.WPFGO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "wpInsKeyResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("wpCanKey");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "parametro"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "WPFGO"), it.eqs.lampoadr.ws.client.egon.suite.WPFGO.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "WPFGO"));
        oper.setReturnClass(it.eqs.lampoadr.ws.client.egon.suite.WPFGO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "wpCanKeyResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("wpCanSog");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "parametro"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "WPFGO"), it.eqs.lampoadr.ws.client.egon.suite.WPFGO.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "WPFGO"));
        oper.setReturnClass(it.eqs.lampoadr.ws.client.egon.suite.WPFGO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "wpCanSogResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("wpModFon");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "parametro"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "WPFGO"), it.eqs.lampoadr.ws.client.egon.suite.WPFGO.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "WPFGO"));
        oper.setReturnClass(it.eqs.lampoadr.ws.client.egon.suite.WPFGO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "wpModFonResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("wpRicSog");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "parametro"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "WPFGO"), it.eqs.lampoadr.ws.client.egon.suite.WPFGO.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "WPFGO"));
        oper.setReturnClass(it.eqs.lampoadr.ws.client.egon.suite.WPFGO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "wpRicSogResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("wpModSog");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "parametro"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "WPFGO"), it.eqs.lampoadr.ws.client.egon.suite.WPFGO.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "WPFGO"));
        oper.setReturnClass(it.eqs.lampoadr.ws.client.egon.suite.WPFGO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "wpModSogResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("wpNormDrt");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "parametro"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "wpNormResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

    }

    public EgonWpcomSuiteSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public EgonWpcomSuiteSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public EgonWpcomSuiteSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "ALTRO_610");
            cachedSerQNames.add(qName);
            cls = it.eqs.lampoadr.ws.client.egon.suite.ALTRO_610.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "ALTRO_620");
            cachedSerQNames.add(qName);
            cls = it.eqs.lampoadr.ws.client.egon.suite.ALTRO_620.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "CDPPLC");
            cachedSerQNames.add(qName);
            cls = it.eqs.lampoadr.ws.client.egon.suite.CDPPLC.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "CDPSTR");
            cachedSerQNames.add(qName);
            cls = it.eqs.lampoadr.ws.client.egon.suite.CDPSTR.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "CDXPLC");
            cachedSerQNames.add(qName);
            cls = it.eqs.lampoadr.ws.client.egon.suite.CDXPLC.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "CDXSTR");
            cachedSerQNames.add(qName);
            cls = it.eqs.lampoadr.ws.client.egon.suite.CDXSTR.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "CIVICO");
            cachedSerQNames.add(qName);
            cls = it.eqs.lampoadr.ws.client.egon.suite.CIVICO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "CLIDOP");
            cachedSerQNames.add(qName);
            cls = it.eqs.lampoadr.ws.client.egon.suite.CLIDOP.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "COD_011");
            cachedSerQNames.add(qName);
            cls = it.eqs.lampoadr.ws.client.egon.suite.ELECOD[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "ELECOD");
            qName2 = new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "COD_611");
            cachedSerQNames.add(qName);
            cls = it.eqs.lampoadr.ws.client.egon.suite.ELECODOUT[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "ELECODOUT");
            qName2 = new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "COO_626");
            cachedSerQNames.add(qName);
            cls = it.eqs.lampoadr.ws.client.egon.suite.COO_626.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "DOCIDN");
            cachedSerQNames.add(qName);
            cls = it.eqs.lampoadr.ws.client.egon.suite.DOCIDN.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "DSXCND");
            cachedSerQNames.add(qName);
            cls = it.eqs.lampoadr.ws.client.egon.suite.DSXCND.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "DSXPLC");
            cachedSerQNames.add(qName);
            cls = it.eqs.lampoadr.ws.client.egon.suite.DSXPLC.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "DSXSTRINP");
            cachedSerQNames.add(qName);
            cls = it.eqs.lampoadr.ws.client.egon.suite.DSXSTRINP.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "DSXSTROUT");
            cachedSerQNames.add(qName);
            cls = it.eqs.lampoadr.ws.client.egon.suite.DSXSTROUT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "ELECLI");
            cachedSerQNames.add(qName);
            cls = it.eqs.lampoadr.ws.client.egon.suite.ELECLI.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "ELECOD");
            cachedSerQNames.add(qName);
            cls = it.eqs.lampoadr.ws.client.egon.suite.ELECOD.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "ELECODOUT");
            cachedSerQNames.add(qName);
            cls = it.eqs.lampoadr.ws.client.egon.suite.ELECODOUT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "ELETEL");
            cachedSerQNames.add(qName);
            cls = it.eqs.lampoadr.ws.client.egon.suite.ELETEL.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "ERR");
            cachedSerQNames.add(qName);
            cls = it.eqs.lampoadr.ws.client.egon.suite.ERR.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "ERR_620_ELE");
            cachedSerQNames.add(qName);
            cls = it.eqs.lampoadr.ws.client.egon.suite.ERR_620_ELE.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "FLXOBJ");
            cachedSerQNames.add(qName);
            cls = it.eqs.lampoadr.ws.client.egon.suite.FLXOBJ.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "FLXSTR");
            cachedSerQNames.add(qName);
            cls = it.eqs.lampoadr.ws.client.egon.suite.FLXSTR.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "INR_020");
            cachedSerQNames.add(qName);
            cls = it.eqs.lampoadr.ws.client.egon.suite.INR_020.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "INR_620");
            cachedSerQNames.add(qName);
            cls = it.eqs.lampoadr.ws.client.egon.suite.INR_620.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "INRCND");
            cachedSerQNames.add(qName);
            cls = it.eqs.lampoadr.ws.client.egon.suite.INRCND.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "KEY");
            cachedSerQNames.add(qName);
            cls = it.eqs.lampoadr.ws.client.egon.suite.KEY.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "KII");
            cachedSerQNames.add(qName);
            cls = it.eqs.lampoadr.ws.client.egon.suite.KII.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "KIO");
            cachedSerQNames.add(qName);
            cls = it.eqs.lampoadr.ws.client.egon.suite.KIO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "LNGCDP");
            cachedSerQNames.add(qName);
            cls = it.eqs.lampoadr.ws.client.egon.suite.LNGCDP.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "LOCNAS");
            cachedSerQNames.add(qName);
            cls = it.eqs.lampoadr.ws.client.egon.suite.LOCNAS.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "MCZ_627");
            cachedSerQNames.add(qName);
            cls = it.eqs.lampoadr.ws.client.egon.suite.MCZ_627.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "MRE");
            cachedSerQNames.add(qName);
            cls = it.eqs.lampoadr.ws.client.egon.suite.MRE.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "PAR");
            cachedSerQNames.add(qName);
            cls = it.eqs.lampoadr.ws.client.egon.suite.PAR.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "PTF");
            cachedSerQNames.add(qName);
            cls = it.eqs.lampoadr.ws.client.egon.suite.PTF.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "RGS_010");
            cachedSerQNames.add(qName);
            cls = it.eqs.lampoadr.ws.client.egon.suite.RGS_010.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "RGS_610");
            cachedSerQNames.add(qName);
            cls = it.eqs.lampoadr.ws.client.egon.suite.RGS_610.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "SEG");
            cachedSerQNames.add(qName);
            cls = it.eqs.lampoadr.ws.client.egon.suite.SEG.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "SEZ_ERR");
            cachedSerQNames.add(qName);
            cls = it.eqs.lampoadr.ws.client.egon.suite.SEZ_ERR.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "SOG");
            cachedSerQNames.add(qName);
            cls = it.eqs.lampoadr.ws.client.egon.suite.SOG.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "STROUTELE");
            cachedSerQNames.add(qName);
            cls = it.eqs.lampoadr.ws.client.egon.suite.STROUTELE.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "TEL_035");
            cachedSerQNames.add(qName);
            cls = it.eqs.lampoadr.ws.client.egon.suite.TEL_035.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "TEL_635");
            cachedSerQNames.add(qName);
            cls = it.eqs.lampoadr.ws.client.egon.suite.TEL_635.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "TELUNI");
            cachedSerQNames.add(qName);
            cls = it.eqs.lampoadr.ws.client.egon.suite.TELUNI.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "WPFGO");
            cachedSerQNames.add(qName);
            cls = it.eqs.lampoadr.ws.client.egon.suite.WPFGO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public it.eqs.lampoadr.ws.client.egon.suite.WPFGO wpNorm(it.eqs.lampoadr.ws.client.egon.suite.WPFGO parametro) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.wareplace.it/services/it/EgonWpcomSuite/wpNorm");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "wpNorm"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parametro});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (it.eqs.lampoadr.ws.client.egon.suite.WPFGO) _resp;
            } catch (java.lang.Exception _exception) {
                return (it.eqs.lampoadr.ws.client.egon.suite.WPFGO) org.apache.axis.utils.JavaUtils.convert(_resp, it.eqs.lampoadr.ws.client.egon.suite.WPFGO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public it.eqs.lampoadr.ws.client.egon.suite.WPFGO wpDed(it.eqs.lampoadr.ws.client.egon.suite.WPFGO parametro) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.wareplace.it/services/it/EgonWpcomSuite/wpDed");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "wpDed"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parametro});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (it.eqs.lampoadr.ws.client.egon.suite.WPFGO) _resp;
            } catch (java.lang.Exception _exception) {
                return (it.eqs.lampoadr.ws.client.egon.suite.WPFGO) org.apache.axis.utils.JavaUtils.convert(_resp, it.eqs.lampoadr.ws.client.egon.suite.WPFGO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public it.eqs.lampoadr.ws.client.egon.suite.WPFGO wpInsKey(it.eqs.lampoadr.ws.client.egon.suite.WPFGO parametro) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.wareplace.it/services/it/EgonWpcomSuite/wpInsKey");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "wpInsKey"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parametro});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (it.eqs.lampoadr.ws.client.egon.suite.WPFGO) _resp;
            } catch (java.lang.Exception _exception) {
                return (it.eqs.lampoadr.ws.client.egon.suite.WPFGO) org.apache.axis.utils.JavaUtils.convert(_resp, it.eqs.lampoadr.ws.client.egon.suite.WPFGO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public it.eqs.lampoadr.ws.client.egon.suite.WPFGO wpCanKey(it.eqs.lampoadr.ws.client.egon.suite.WPFGO parametro) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.wareplace.it/services/it/EgonWpcomSuite/wpCanKey");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "wpCanKey"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parametro});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (it.eqs.lampoadr.ws.client.egon.suite.WPFGO) _resp;
            } catch (java.lang.Exception _exception) {
                return (it.eqs.lampoadr.ws.client.egon.suite.WPFGO) org.apache.axis.utils.JavaUtils.convert(_resp, it.eqs.lampoadr.ws.client.egon.suite.WPFGO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public it.eqs.lampoadr.ws.client.egon.suite.WPFGO wpCanSog(it.eqs.lampoadr.ws.client.egon.suite.WPFGO parametro) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.wareplace.it/services/it/EgonWpcomSuite/wpCanSog");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "wpCanSog"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parametro});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (it.eqs.lampoadr.ws.client.egon.suite.WPFGO) _resp;
            } catch (java.lang.Exception _exception) {
                return (it.eqs.lampoadr.ws.client.egon.suite.WPFGO) org.apache.axis.utils.JavaUtils.convert(_resp, it.eqs.lampoadr.ws.client.egon.suite.WPFGO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public it.eqs.lampoadr.ws.client.egon.suite.WPFGO wpModFon(it.eqs.lampoadr.ws.client.egon.suite.WPFGO parametro) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.wareplace.it/services/it/EgonWpcomSuite/wpModFon");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "wpModFon"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parametro});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (it.eqs.lampoadr.ws.client.egon.suite.WPFGO) _resp;
            } catch (java.lang.Exception _exception) {
                return (it.eqs.lampoadr.ws.client.egon.suite.WPFGO) org.apache.axis.utils.JavaUtils.convert(_resp, it.eqs.lampoadr.ws.client.egon.suite.WPFGO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public it.eqs.lampoadr.ws.client.egon.suite.WPFGO wpRicSog(it.eqs.lampoadr.ws.client.egon.suite.WPFGO parametro) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.wareplace.it/services/it/EgonWpcomSuite/wpRicSog");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "wpRicSog"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parametro});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (it.eqs.lampoadr.ws.client.egon.suite.WPFGO) _resp;
            } catch (java.lang.Exception _exception) {
                return (it.eqs.lampoadr.ws.client.egon.suite.WPFGO) org.apache.axis.utils.JavaUtils.convert(_resp, it.eqs.lampoadr.ws.client.egon.suite.WPFGO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public it.eqs.lampoadr.ws.client.egon.suite.WPFGO wpModSog(it.eqs.lampoadr.ws.client.egon.suite.WPFGO parametro) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.wareplace.it/services/it/EgonWpcomSuite/wpModSog");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "wpModSog"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parametro});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (it.eqs.lampoadr.ws.client.egon.suite.WPFGO) _resp;
            } catch (java.lang.Exception _exception) {
                return (it.eqs.lampoadr.ws.client.egon.suite.WPFGO) org.apache.axis.utils.JavaUtils.convert(_resp, it.eqs.lampoadr.ws.client.egon.suite.WPFGO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String wpNormDrt(java.lang.String parametro) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.wareplace.it/services/it/EgonWpcomSuite/wpNormDrt");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.wareplace.it/services/it/EgonWpcomSuite", "wpNormDrt"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parametro});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
