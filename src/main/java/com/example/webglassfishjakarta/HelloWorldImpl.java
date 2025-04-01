package com.example.webglassfishjakarta;
import jakarta.jws.WebService;

import java.util.ArrayList;
import java.util.List;

@WebService(endpointInterface = "com.example.webglassfishjakarta.HelloWorld")

public class HelloWorldImpl implements HelloWorld {
    @Override
    public String getHelloWorldAsString(String name) {
        return "Witaj świecie JAX-WS: " + name;
    }
    @Override
    public List<Product> getProducts() {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", "Laptop gamingowy", 5000));
        products.add(new Product("Telefon", "Smartfon z Androidem", 2000));
        products.add(new Product("Monitor", "Monitor 27 cali 144Hz", 1500));
        return products;
    }
}
