package com.example.Fraud.Service;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TarjetaService {

    private final List<String> listaNegra = Arrays.asList("1234", "9876");

    public boolean estaEnListaNegra(String numeroTarjeta) {
        return listaNegra.contains(numeroTarjeta);
    }
}
