package com.abm.rubros.test.demo.controller;

import com.abm.rubros.test.demo.dto.RubroProductoDto;
import com.abm.rubros.test.demo.service.RubroProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rubros-productos")
public class RubroProductoController {

    @Autowired
    private RubroProductoService rubroProductoService;

    @GetMapping
    public List<RubroProductoDto> getAllRubrosProductos() {
        return rubroProductoService.getAllRubrosProductos();
    }

    @PostMapping
    public RubroProductoDto createRubroProducto(@RequestBody RubroProductoDto rubroProductoDto) {
        return rubroProductoService.createRubroProducto(rubroProductoDto);
    }

}
