package com.abm.rubros.test.demo.controller;


import com.abm.rubros.test.demo.dto.RubroIngredienteDto;
import com.abm.rubros.test.demo.service.RubroIngredienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/rubros-ingredientes")
public class RubroIngredienteController {

    @Autowired
    private RubroIngredienteService rubroIngredienteService;

    @GetMapping
    public List<RubroIngredienteDto> getAllRubrosIngredientes() {return rubroIngredienteService.getAllRubrosIngredientes();}

    @PostMapping
    public RubroIngredienteDto createRubroIngrediente(@RequestBody RubroIngredienteDto rubroIngredienteDto) {
        return rubroIngredienteService.createRubroIngrediente(rubroIngredienteDto);
    }
}
