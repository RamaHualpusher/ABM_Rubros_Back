package com.abm.rubros.test.demo.mapper;

import com.abm.rubros.test.demo.domain.RubroIngrediente;
import com.abm.rubros.test.demo.dto.RubroIngredienteDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RubroIngredienteMapper {

    public RubroIngredienteDto toDto(RubroIngrediente rubroIngrediente) {
        RubroIngredienteDto rubroIngredienteDto = new RubroIngredienteDto();
        rubroIngredienteDto.setId(rubroIngrediente.getId());
        rubroIngredienteDto.setNombre(rubroIngrediente.getNombre());
        rubroIngredienteDto.setActivo(rubroIngrediente.isActivo());
        return rubroIngredienteDto;
    }

    public List<RubroIngredienteDto> toDtoList(List<RubroIngrediente> rubrosIngredientes) {
        List<RubroIngredienteDto> rubrosIngredientesDto = new ArrayList<>();
        for (RubroIngrediente rubroIngrediente : rubrosIngredientes) {
            rubrosIngredientesDto.add(toDto(rubroIngrediente));
        }
        return rubrosIngredientesDto;
    }

    public RubroIngrediente toEntity(RubroIngredienteDto rubroIngredienteDto) {
        RubroIngrediente rubroIngrediente = new RubroIngrediente();
        rubroIngrediente.setNombre(rubroIngredienteDto.getNombre());
        rubroIngrediente.setActivo(rubroIngredienteDto.isActivo());
        return rubroIngrediente;
    }

    public void updateEntityFromDto(RubroIngredienteDto rubroIngredienteDto, RubroIngrediente rubroIngrediente) {
        rubroIngrediente.setNombre(rubroIngredienteDto.getNombre());
        rubroIngrediente.setActivo(rubroIngredienteDto.isActivo());
    }
}
