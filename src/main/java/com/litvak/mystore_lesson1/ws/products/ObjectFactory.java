//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.06.21 at 12:12:38 PM MSK 
//


package com.litvak.mystore_lesson1.ws.products;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the com.litvak.mystore_lesson1.ws.products package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.litvak.mystore_lesson1.ws.products
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetProductsRequest }
     */
    public GetProductsRequest createGetProductsRequest() {
        return new GetProductsRequest();
    }

    /**
     * Create an instance of {@link GetProductsResponse }
     */
    public GetProductsResponse createGetProductsResponse() {
        return new GetProductsResponse();
    }

    /**
     * Create an instance of {@link ProductsWS }
     */
    public ProductsWS createProductsWS() {
        return new ProductsWS();
    }

}
