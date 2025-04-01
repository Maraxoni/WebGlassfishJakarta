package com.example.webglassfishjakarta;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.jws.soap.SOAPBinding.Style;

import java.util.List;

//Service Endpoint Interface
@WebService
@SOAPBinding(style = Style.DOCUMENT, use = SOAPBinding.Use.LITERAL) //optional
public interface HelloWorld {
    @WebMethod
    String getHelloWorldAsString(String name);
    @WebMethod
    List<Product> getProducts();
}