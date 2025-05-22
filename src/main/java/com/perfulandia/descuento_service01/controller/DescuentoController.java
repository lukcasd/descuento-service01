package com.perfulandia.descuento_service01.controller;

import com.perfulandia.descuento_service01.model.Descuento;
import com.perfulandia.descuento_service01.service.DescuentoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/descuentos")
public class DescuentoController {

    private final DescuentoService service;

    public DescuentoController(DescuentoService service) {
        this.service = service;
    }

    @PostMapping
    public Descuento crearDescuento(@RequestBody Descuento descuento) {
        return service.guardar(descuento);
    }

    @GetMapping
    public List<Descuento> obtenerDescuentos() {
        return service.listarTodos();
    }
}