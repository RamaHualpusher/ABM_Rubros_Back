package com.abm.rubros.test.demo.service;

import com.abm.rubros.test.demo.domain.RubroIngrediente;
import com.abm.rubros.test.demo.dto.RubroIngredienteDto;
import com.abm.rubros.test.demo.mapper.RubroIngredienteMapper;
import com.abm.rubros.test.demo.repository.RubroIngredienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RubroIngredienteService {

    @Autowired
    private RubroIngredienteRepository rubroIngredienteRepository;

    @Autowired
    private RubroIngredienteMapper rubroIngredienteMapper;

    public List<RubroIngredienteDto> getAllRubrosIngredientes() {
        List<RubroIngrediente> rubrosIngredientes = rubroIngredienteRepository.findAll();
        return rubroIngredienteMapper.toDtoList(rubrosIngredientes);
    }

    public RubroIngredienteDto createRubroIngrediente(RubroIngredienteDto rubroIngredienteDto) {
        RubroIngrediente rubroIngrediente = rubroIngredienteMapper.toEntity(rubroIngredienteDto);
        RubroIngrediente createdRubroIngrediente = rubroIngredienteRepository.save(rubroIngrediente);
        return rubroIngredienteMapper.toDto(createdRubroIngrediente);
    }
}
