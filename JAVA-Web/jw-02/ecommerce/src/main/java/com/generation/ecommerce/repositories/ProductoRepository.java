package com.generation.ecommerce.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.generation.ecommerce.model.Producto;

//Indicamos que extendemos de la interface JpaRepository, y que manejamos a entidad llamada ProductoRepository identificandola por su atributo Long Id

//Usaré querys predeinidas del JPA Repository
public interface ProductoRepository extends JpaRepository <Producto, Long>{

//Crear mis propias querys personalizadas
	@Query("SELECT p FROM Producto p WHERE p.nombre=?1")

	Optional<Producto> findByNombre(String nombre);
}
