package com.abm.rubros.test.demo.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import java.io.Serializable;



@MappedSuperclass
public abstract class Base implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Base() {}

    public Base(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
