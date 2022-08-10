package com.idat.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.Model.Profesor;
import com.idat.Repository.ProfesorRepository;
@Service
public class ProfesorServiceImpl implements ProfesorService {
	
	@Autowired
	private ProfesorRepository repository;

	@Override
	public List<Profesor> listar() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Profesor ObtenerId(Integer id) {
		// TODO Auto-generated method stub
		return repository.findById(id).orElse(null);
	}

	@Override
	public void guardar(Profesor profesor) {
		repository.save(profesor);
		
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public void actualizar(Profesor profesor) {
		// TODO Auto-generated method stub
		repository.saveAndFlush(profesor);
	}

}
