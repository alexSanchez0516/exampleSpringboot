package com.spring.jpa.app.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.spring.jpa.app.models.entity.Factura;

public interface IFacturaDao extends CrudRepository<Factura, Long> {

}
