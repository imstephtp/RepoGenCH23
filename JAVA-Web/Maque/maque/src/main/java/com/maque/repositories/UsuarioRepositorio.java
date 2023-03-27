package com.maque.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.maque.models.UsuarioModel;

@Repository
public interface UsuarioRepositorio extends CrudRepository<UsuarioModel, Long> {
	
}
