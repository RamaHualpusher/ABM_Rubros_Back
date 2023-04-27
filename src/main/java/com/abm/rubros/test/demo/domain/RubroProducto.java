package com.abm.rubros.test.demo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "rubros_productos")
public class RubroProducto extends Base {
    @Column(name = "nombre")
    private String nombre;

    @Column(name = "activo")
    private boolean activo;

    public RubroProducto() {
    }

    public RubroProducto(String nombre, boolean activo) {
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
