package com.nttdata.demoweb.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.nttdata.demoweb.repository.EmpleadoRepoJPA;
import com.nttdata.demoweb.repository.entity.Empleado;
import com.nttdata.demoweb.service.EmpleadoService;


@Service
public class EmpleadoServiceImpl implements EmpleadoService {
	
	@Autowired
	EmpleadoRepoJPA empleadoRepo;
	
	
	@Override
	public void registrar(String name) {
		empleadoRepo.registrar(name);
	}


	@Override
	public List<Empleado> listar() {
		return empleadoRepo.findAll();
	}


	@Override
	public List<Empleado> listarFiltroNombre(String cad) {
		return empleadoRepo.listarCuyoNombreContiene(cad);
	}


	@Override
	public List<Empleado> listarConJPA(Integer pId, String contiene) {
		return empleadoRepo.findByIdGreaterThanAndNameLike(pId, contiene);
	}


	@Override
	public List<Empleado> listarFiltroNombreEs(String cad) {
		return empleadoRepo.listarCuyoNombreEs(cad);
	}
}
