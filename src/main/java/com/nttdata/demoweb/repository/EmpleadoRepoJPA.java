package com.nttdata.demoweb.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nttdata.demoweb.repository.entity.Empleado;

public interface EmpleadoRepoJPA extends JpaRepository<Empleado, Integer>, EmpleadoRepo {
	
	@Query(value="select * from empleado where name = ?1", nativeQuery=true)
	public List<Empleado> listarCuyoNombreEs(String nombre);
	
	List<Empleado> findByIdGreaterThanAndNameLike(Integer pId, String contiene);
	
}
