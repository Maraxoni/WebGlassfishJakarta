package com.example.webglassfishjakarta;
import jakarta.jws.WebService;
@WebService(endpointInterface = "com.example.webglassfishjakarta.HelloWorld")

public class HelloWorldImpl implements HelloWorld {
    @Override
    public String getHelloWorldAsString(String name) {
        return "Witaj świecie JAX-WS: " + name;
    }
}
