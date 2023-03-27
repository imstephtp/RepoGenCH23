package com.maqueceramica.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.maqueceramica.models.UsuarioModel;


@Repository
public interface UsuarioRepository extends CrudRepository<UsuarioModel, Long> {


}

