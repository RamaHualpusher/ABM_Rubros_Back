package com.abm.rubros.test.demo.repository;

import com.abm.rubros.test.demo.domain.RubroIngrediente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RubroIngredienteRepository extends JpaRepository<RubroIngrediente, Long> {
}
