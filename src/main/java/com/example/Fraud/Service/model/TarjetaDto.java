package com.example.Fraud.Service.model;

public class TarjetaDto {
    private String numeroTarjeta;

    public TarjetaDto() {
    }

    public TarjetaDto(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }
}