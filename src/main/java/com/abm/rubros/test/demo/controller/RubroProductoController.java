package com.abm.rubros.test.demo.controller;

import com.abm.rubros.test.demo.dto.RubroProductoDto;
import com.abm.rubros.test.demo.service.RubroProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/rubros-productos")
public class RubroProductoController {

    @Autowired
    private RubroProductoService rubroProductoService;

    @GetMapping
    public List<RubroProductoDto> getAllRubrosProductos() {
        return rubroProductoService.getAllRubrosProductos();
    }

    @GetMapping("/{id}")
    public RubroProductoDto getRubroProductoById(@PathVariable Long id) {
        return rubroProductoService.getRubroProductoById(id);
    }
    @PostMapping
    public RubroProductoDto createRubroProducto(@RequestBody RubroProductoDto rubroProductoDto) {
        return rubroProductoService.createRubroProducto(rubroProductoDto);
    }
    @PutMapping("/{id}")
    public RubroProductoDto updateRubroProducto(@PathVariable Long id, @RequestBody RubroProductoDto rubroProductoDto) {
        return rubroProductoService.updateRubroProducto(id, rubroProductoDto);
    }

    @DeleteMapping("/{id}")
    public void deleteRubroProducto(@PathVariable Long id) {
        rubroProductoService.deleteRubroProducto(id);
    }

}
