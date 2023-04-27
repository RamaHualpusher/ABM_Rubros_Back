package com.abm.rubros.test.demo.mapper;

import com.abm.rubros.test.demo.domain.RubroProducto;
import com.abm.rubros.test.demo.dto.RubroProductoDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RubroProductoMapper {

    public RubroProductoDto toDto(RubroProducto rubroProducto) {
        RubroProductoDto rubroProductoDto = new RubroProductoDto();
        rubroProductoDto.setId(rubroProducto.getId());
        rubroProductoDto.setNombre(rubroProducto.getNombre());
        rubroProductoDto.setActivo(rubroProducto.isActivo());
        return rubroProductoDto;
    }

    public List<RubroProductoDto> toDtoList(List<RubroProducto> rubrosProductos) {
        List<RubroProductoDto> rubrosProductosDto = new ArrayList<>();
        for (RubroProducto rubroProducto : rubrosProductos) {
            rubrosProductosDto.add(toDto(rubroProducto));
        }
        return rubrosProductosDto;
    }

    public RubroProducto toEntity(RubroProductoDto rubroProductoDto) {
        RubroProducto rubroProducto = new RubroProducto();
        rubroProducto.setNombre(rubroProductoDto.getNombre());
        rubroProducto.setActivo(rubroProductoDto.isActivo());
        return rubroProducto;
    }

    public void updateEntityFromDto(RubroProductoDto rubroProductoDto, RubroProducto rubroProducto) {
        rubroProducto.setNombre(rubroProductoDto.getNombre());
        rubroProducto.setActivo(rubroProductoDto.isActivo());
    }

}