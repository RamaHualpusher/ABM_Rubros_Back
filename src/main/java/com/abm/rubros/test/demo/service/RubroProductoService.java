package com.abm.rubros.test.demo.service;

import com.abm.rubros.test.demo.domain.RubroProducto;
import com.abm.rubros.test.demo.dto.RubroProductoDto;
import com.abm.rubros.test.demo.mapper.RubroProductoMapper;
import com.abm.rubros.test.demo.repository.RubroProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RubroProductoService {

    @Autowired
    private RubroProductoRepository rubroProductoRepository;

    @Autowired
    private RubroProductoMapper rubroProductoMapper;

    public List<RubroProductoDto> getAllRubrosProductos() {
        List<RubroProducto> rubrosProductos = rubroProductoRepository.findAll();
        return rubroProductoMapper.toDtoList(rubrosProductos);
    }

    public RubroProductoDto createRubroProducto(RubroProductoDto rubroProductoDto) {
        RubroProducto rubroProducto = rubroProductoMapper.toEntity(rubroProductoDto);
        RubroProducto createdRubroProducto = rubroProductoRepository.save(rubroProducto);
        return rubroProductoMapper.toDto(createdRubroProducto);
    }

}
