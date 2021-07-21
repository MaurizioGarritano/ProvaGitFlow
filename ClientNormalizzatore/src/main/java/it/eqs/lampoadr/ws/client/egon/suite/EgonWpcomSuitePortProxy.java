package it.eqs.lampoadr.ws.client.egon.suite;

public class EgonWpcomSuitePortProxy implements it.eqs.lampoadr.ws.client.egon.suite.EgonWpcomSuitePort {
  private String _endpoint = null;
  private it.eqs.lampoadr.ws.client.egon.suite.EgonWpcomSuitePort egonWpcomSuitePort = null;
  
  public EgonWpcomSuitePortProxy() {
    _initEgonWpcomSuitePortProxy();
  }
  
  public EgonWpcomSuitePortProxy(String endpoint) {
    _endpoint = endpoint;
    _initEgonWpcomSuitePortProxy();
  }
  
  private void _initEgonWpcomSuitePortProxy() {
    try {
      egonWpcomSuitePort = (new it.eqs.lampoadr.ws.client.egon.suite.EgonWpcomSuiteServiceLocator()).getEgonWpcomSuite();
      if (egonWpcomSuitePort != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)egonWpcomSuitePort)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)egonWpcomSuitePort)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (egonWpcomSuitePort != null)
      ((javax.xml.rpc.Stub)egonWpcomSuitePort)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public it.eqs.lampoadr.ws.client.egon.suite.EgonWpcomSuitePort getEgonWpcomSuitePort() {
    if (egonWpcomSuitePort == null)
      _initEgonWpcomSuitePortProxy();
    return egonWpcomSuitePort;
  }
  
  public it.eqs.lampoadr.ws.client.egon.suite.WPFGO wpNorm(it.eqs.lampoadr.ws.client.egon.suite.WPFGO parametro) throws java.rmi.RemoteException{
    if (egonWpcomSuitePort == null)
      _initEgonWpcomSuitePortProxy();
    return egonWpcomSuitePort.wpNorm(parametro);
  }
  
  public it.eqs.lampoadr.ws.client.egon.suite.WPFGO wpDed(it.eqs.lampoadr.ws.client.egon.suite.WPFGO parametro) throws java.rmi.RemoteException{
    if (egonWpcomSuitePort == null)
      _initEgonWpcomSuitePortProxy();
    return egonWpcomSuitePort.wpDed(parametro);
  }
  
  public it.eqs.lampoadr.ws.client.egon.suite.WPFGO wpInsKey(it.eqs.lampoadr.ws.client.egon.suite.WPFGO parametro) throws java.rmi.RemoteException{
    if (egonWpcomSuitePort == null)
      _initEgonWpcomSuitePortProxy();
    return egonWpcomSuitePort.wpInsKey(parametro);
  }
  
  public it.eqs.lampoadr.ws.client.egon.suite.WPFGO wpCanKey(it.eqs.lampoadr.ws.client.egon.suite.WPFGO parametro) throws java.rmi.RemoteException{
    if (egonWpcomSuitePort == null)
      _initEgonWpcomSuitePortProxy();
    return egonWpcomSuitePort.wpCanKey(parametro);
  }
  
  public it.eqs.lampoadr.ws.client.egon.suite.WPFGO wpCanSog(it.eqs.lampoadr.ws.client.egon.suite.WPFGO parametro) throws java.rmi.RemoteException{
    if (egonWpcomSuitePort == null)
      _initEgonWpcomSuitePortProxy();
    return egonWpcomSuitePort.wpCanSog(parametro);
  }
  
  public it.eqs.lampoadr.ws.client.egon.suite.WPFGO wpModFon(it.eqs.lampoadr.ws.client.egon.suite.WPFGO parametro) throws java.rmi.RemoteException{
    if (egonWpcomSuitePort == null)
      _initEgonWpcomSuitePortProxy();
    return egonWpcomSuitePort.wpModFon(parametro);
  }
  
  public it.eqs.lampoadr.ws.client.egon.suite.WPFGO wpRicSog(it.eqs.lampoadr.ws.client.egon.suite.WPFGO parametro) throws java.rmi.RemoteException{
    if (egonWpcomSuitePort == null)
      _initEgonWpcomSuitePortProxy();
    return egonWpcomSuitePort.wpRicSog(parametro);
  }
  
  public it.eqs.lampoadr.ws.client.egon.suite.WPFGO wpModSog(it.eqs.lampoadr.ws.client.egon.suite.WPFGO parametro) throws java.rmi.RemoteException{
    if (egonWpcomSuitePort == null)
      _initEgonWpcomSuitePortProxy();
    return egonWpcomSuitePort.wpModSog(parametro);
  }
  
  public java.lang.String wpNormDrt(java.lang.String parametro) throws java.rmi.RemoteException{
    if (egonWpcomSuitePort == null)
      _initEgonWpcomSuitePortProxy();
    return egonWpcomSuitePort.wpNormDrt(parametro);
  }
  
  
}