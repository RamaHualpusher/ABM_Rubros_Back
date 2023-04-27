package com.abm.rubros.test.demo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "rubros_ingredientes")
public class RubroIngrediente extends Base {
    @Column(name = "nombre")
    private String nombre;

    @Column(name = "activo")
    private boolean activo;

    public RubroIngrediente() {
    }

    public RubroIngrediente(String nombre, boolean activo) {
        this.nombre = nombre;
        this.activo = activo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}
