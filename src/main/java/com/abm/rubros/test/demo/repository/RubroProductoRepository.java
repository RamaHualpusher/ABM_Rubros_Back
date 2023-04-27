package com.abm.rubros.test.demo.repository;

import com.abm.rubros.test.demo.domain.RubroProducto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RubroProductoRepository extends JpaRepository<RubroProducto, Long> {
}
