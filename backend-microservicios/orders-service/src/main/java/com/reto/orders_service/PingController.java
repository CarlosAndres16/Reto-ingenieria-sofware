
package com.reto.orders_service;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 *
 * @author Andre
 */


// Indica que esta clase es un controlador REST
@RestController
public class PingController {

    // Mapea las peticiones GET a la ruta /ping

    @GetMapping("/ping")
    public ResponseEntity<String> ping() {
        // restorna si funciona
        return ResponseEntity.ok("order ok");
    }
}

