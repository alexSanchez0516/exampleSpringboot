package com.spring.jpa.app.models.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.spring.jpa.app.models.entity.Cliente;

@Repository
public interface IClienteDao extends PagingAndSortingRepository<Cliente, Long> {

	
	
}
