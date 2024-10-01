package com.example.Fraud.Service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class TarjetaServiceTest {

    @InjectMocks
    private TarjetaService tarjetaService;

    @Test
    void testTarjetaEnListaNegra() {
        // Arrange
        String numeroTarjeta = "1234";

        // Act
        boolean resultado = tarjetaService.estaEnListaNegra(numeroTarjeta);

        // Assert
        assertTrue(resultado, "La tarjeta debería estar en la lista negra");
    }

    @Test
    void testTarjetaNoEnListaNegra() {
        // Arrange
        String numeroTarjeta = "5555";

        // Act
        boolean resultado = tarjetaService.estaEnListaNegra(numeroTarjeta);

        // Assert
        assertFalse(resultado, "La tarjeta no debería estar en la lista negra");
    }
}