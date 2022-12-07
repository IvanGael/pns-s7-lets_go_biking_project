
package com.soap.ws.client.generated;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "RoutingService", targetNamespace = "http://tempuri.org/", wsdlLocation = "http://localhost:8733/Design_Time_Addresses/RoutingWithBikesHost/RoutingService/?wsdl")
public class RoutingService
    extends Service
{

    private final static URL ROUTINGSERVICE_WSDL_LOCATION;
    private final static WebServiceException ROUTINGSERVICE_EXCEPTION;
    private final static QName ROUTINGSERVICE_QNAME = new QName("http://tempuri.org/", "RoutingService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8733/Design_Time_Addresses/RoutingWithBikesHost/RoutingService/?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ROUTINGSERVICE_WSDL_LOCATION = url;
        ROUTINGSERVICE_EXCEPTION = e;
    }

    public RoutingService() {
        super(__getWsdlLocation(), ROUTINGSERVICE_QNAME);
    }

    public RoutingService(WebServiceFeature... features) {
        super(__getWsdlLocation(), ROUTINGSERVICE_QNAME, features);
    }

    public RoutingService(URL wsdlLocation) {
        super(wsdlLocation, ROUTINGSERVICE_QNAME);
    }

    public RoutingService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ROUTINGSERVICE_QNAME, features);
    }

    public RoutingService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public RoutingService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns IRoutingService
     */
    @WebEndpoint(name = "BasicHttpBinding_IRoutingService")
    public IRoutingService getBasicHttpBindingIRoutingService() {
        return super.getPort(new QName("http://tempuri.org/", "BasicHttpBinding_IRoutingService"), IRoutingService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IRoutingService
     */
    @WebEndpoint(name = "BasicHttpBinding_IRoutingService")
    public IRoutingService getBasicHttpBindingIRoutingService(WebServiceFeature... features) {
        return super.getPort(new QName("http://tempuri.org/", "BasicHttpBinding_IRoutingService"), IRoutingService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ROUTINGSERVICE_EXCEPTION!= null) {
            throw ROUTINGSERVICE_EXCEPTION;
        }
        return ROUTINGSERVICE_WSDL_LOCATION;
    }

}