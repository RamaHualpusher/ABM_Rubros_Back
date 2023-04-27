package com.abm.rubros.test.demo.service;

import com.abm.rubros.test.demo.domain.RubroIngrediente;
import com.abm.rubros.test.demo.dto.RubroIngredienteDto;
import com.abm.rubros.test.demo.exeption.ResourceNotFoundException;
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

    public RubroIngredienteDto getRubroIngredienteById(Long id) {
        RubroIngrediente rubroIngrediente = rubroIngredienteRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("RubroIngrediente", "id", id));
        return rubroIngredienteMapper.toDto(rubroIngrediente);
    }

    public RubroIngredienteDto createRubroIngrediente(RubroIngredienteDto rubroIngredienteDto) {
        RubroIngrediente rubroIngrediente = rubroIngredienteMapper.toEntity(rubroIngredienteDto);
        RubroIngrediente createdRubroIngrediente = rubroIngredienteRepository.save(rubroIngrediente);
        return rubroIngredienteMapper.toDto(createdRubroIngrediente);
    }

    public RubroIngredienteDto updateRubroIngrediente(Long id, RubroIngredienteDto rubroIngredienteDto) {
        RubroIngrediente rubroIngrediente = rubroIngredienteRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("RubroIngrediente", "id", id));
        rubroIngredienteMapper.updateEntityFromDto(rubroIngredienteDto, rubroIngrediente);
        RubroIngrediente updatedRubroIngrediente = rubroIngredienteRepository.save(rubroIngrediente);
        return rubroIngredienteMapper.toDto(updatedRubroIngrediente);
    }
    public void deleteRubroIngrediente(Long id) {
        RubroIngrediente rubroIngrediente = rubroIngredienteRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("RubroIngrediente", "id", id));
        rubroIngredienteRepository.delete(rubroIngrediente);
    }
}
