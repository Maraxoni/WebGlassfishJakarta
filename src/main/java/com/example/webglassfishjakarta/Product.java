package com.example.webglassfishjakarta;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Product {
    private String nazwa;
    private String opis;
    private int cena;

    public Product() { }  // Konstruktor bezparametrowy (potrzebny dla JAX-WS)

    public Product(String nazwa, String opis, int cena) {
        this.nazwa = nazwa;
        this.opis = opis;
        this.cena = cena;
    }

    @XmlElement
    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    @XmlElement
    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    @XmlElement
    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }
}
