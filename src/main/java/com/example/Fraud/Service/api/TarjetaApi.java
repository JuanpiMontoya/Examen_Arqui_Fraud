package com.example.Fraud.Service.api;

import com.example.Fraud.Service.model.ErrorResponse;
import com.example.Fraud.Service.model.TarjetaDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Tarjetas", description = "API para la gestión de tarjetas")
@RestController
@RequestMapping("/api/tarjetas")
public interface TarjetaApi {

    @Operation(summary = "Verificar si una tarjeta está en la lista negra",
            description = "Verifica si el número de tarjeta proporcionado está en la lista negra.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "La tarjeta no está en la lista negra",
                    content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
            @ApiResponse(responseCode = "404", description = "La tarjeta está en la lista negra",
                    content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))),
            @ApiResponse(responseCode = "500", description = "Error interno del servidor",
                    content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class)))
    })
    @PostMapping("/verificar")
    ResponseEntity<String> verificarTarjeta(@RequestBody TarjetaDto tarjetaDto);

    @Operation(summary = "Obtener todas las tarjetas en la lista negra",
            description = "Devuelve una lista de todas las tarjetas en la lista negra.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Lista de tarjetas obtenida exitosamente",
                    content = @Content(mediaType = "application/json", schema = @Schema(implementation = List.class))),
            @ApiResponse(responseCode = "500", description = "Error interno del servidor",
                    content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class)))
    })
    @GetMapping("/lista")
    ResponseEntity<List<String>> obtenerListaNegra();
}