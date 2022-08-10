package com.idat.Service;

import java.util.List;

import com.idat.Model.Profesor;



public interface ProfesorService {
	List<Profesor> listar();
	Profesor ObtenerId(Integer id);
	void guardar(Profesor profesor);
	void eliminar(Integer id);
	void actualizar(Profesor profesor);

}
