package com.company;

public class Autos {
    private String marca;
    private Integer añio;
    private String modelo;
    private Integer precio;

    public Autos(String marca, Integer añio, String modelo, Integer precio) {
        this.marca = marca;
        this.añio = añio;
        this.modelo = modelo;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public Integer getAñio() {
        return añio;
    }

    public String getModelo() {
        return modelo;
    }

    public Integer getPrecio() {
        return precio;
    }
}
