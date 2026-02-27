package com.reto.catalog_service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Andre
 */


@RestController
public class PingController {

    // Mapea las peticiones GET a la ruta /ping

    @GetMapping("/ping")
    public ResponseEntity<String> ping() {
        // restorna si funciona
        return ResponseEntity.ok("catalog ok");
    }
}