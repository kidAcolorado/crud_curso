package com.viewnext.kidaprojects.crudcurso.service;

import java.util.List;

import com.viewnext.kidaprojects.crudcurso.model.Curso;

public interface CursoService {
	
	public List<Curso> getAllCursos();
	
	public Curso getCursoByCodigo(String codigo);
	
	public Curso createCurso(Curso curso);
	
	public boolean existCursoByCodigo(String codigo);
	
	public void deleteCursoByCodigo(String codigo);
	
	public void updateHoras(String codigo, int horas);
		

}
