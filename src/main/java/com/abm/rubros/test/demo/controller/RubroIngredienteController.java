package com.abm.rubros.test.demo.controller;


import com.abm.rubros.test.demo.dto.RubroIngredienteDto;
import com.abm.rubros.test.demo.service.RubroIngredienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/rubros-ingredientes")
public class RubroIngredienteController {

    @Autowired
    private RubroIngredienteService rubroIngredienteService;

    @GetMapping
    public List<RubroIngredienteDto> getAllRubrosIngredientes() {
        return rubroIngredienteService.getAllRubrosIngredientes();
    }

    @GetMapping("/{id}")
    public RubroIngredienteDto getRubroIngredienteById(@PathVariable Long id) {
        return rubroIngredienteService.getRubroIngredienteById(id);
    }

    @PostMapping
    public RubroIngredienteDto createRubroIngrediente(@RequestBody RubroIngredienteDto rubroIngredienteDto) {
        return rubroIngredienteService.createRubroIngrediente(rubroIngredienteDto);
    }

    @PutMapping("/{id}")
    public RubroIngredienteDto updateRubroIngrediente(@PathVariable Long id, @RequestBody RubroIngredienteDto rubroIngredienteDto) {
        return rubroIngredienteService.updateRubroIngrediente(id, rubroIngredienteDto);
    }

    @DeleteMapping("/{id}")
    public void deleteRubroIngrediente(@PathVariable Long id) {
        rubroIngredienteService.deleteRubroIngrediente(id);
    }
}
