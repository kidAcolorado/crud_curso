package com.viewnext.kidaprojects.crudcurso.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.viewnext.kidaprojects.crudcurso.exception.CursoNotFoundException;
import com.viewnext.kidaprojects.crudcurso.model.Curso;



public class CursoServiceImpl implements CursoService{

	private List<Curso> listaCursos;
	
	public CursoServiceImpl() {
		listaCursos = new ArrayList<>();
		
		listaCursos.add(new Curso("C001", "Introducción a la Programación", 40, 200));
		listaCursos.add(new Curso("C002", "Diseño de Interfaces de Usuario", 30, 150));
		listaCursos.add(new Curso("C003", "Bases de Datos Avanzadas", 45, 250));
		listaCursos.add(new Curso("C004", "Machine Learning Fundamentals", 50, 300));
		listaCursos.add(new Curso("C005", "Desarrollo Web con React", 35, 180));
		listaCursos.add(new Curso("C006", "Marketing Digital", 25, 120));
		listaCursos.add(new Curso("C007", "Gestión de Proyectos", 40, 220));
		listaCursos.add(new Curso("C008", "Inglés Intermedio", 60, 350));
		listaCursos.add(new Curso("C009", "Finanzas Personales", 20, 100));
		listaCursos.add(new Curso("C010", "Introducción a la Inteligencia Artificial", 45, 250));
		listaCursos.add(new Curso("C011", "Programación en Python", 30, 150));
		listaCursos.add(new Curso("C012", "Diseño Gráfico", 40, 200));
		listaCursos.add(new Curso("C013", "Desarrollo Móvil con Android", 35, 180));
		listaCursos.add(new Curso("C014", "Gestión del Tiempo", 20, 100));
		listaCursos.add(new Curso("C015", "Economía Básica", 25, 120));
		listaCursos.add(new Curso("C016", "Marketing en Redes Sociales", 30, 160));
		listaCursos.add(new Curso("C017", "Fotografía Digital", 25, 140));
		listaCursos.add(new Curso("C018", "Desarrollo de Videojuegos", 50, 280));
		listaCursos.add(new Curso("C019", "Negociación Efectiva", 30, 170));
		listaCursos.add(new Curso("C020", "Introducción a la Robótica", 40, 220));
	}
	
	
	@Override
	public List<Curso> getAllCursos() {
				
		return listaCursos;
	}

	public Curso getCursoByCodigo(String codigo) throws CursoNotFoundException{
	    for (Curso curso : listaCursos) {
	        if (curso.getCodigo().equals(codigo)) {
	            return curso; // Curso encontrado
	        }
	    }
	    
	    throw new CursoNotFoundException(codigo);
	    
	}


	@Override
	public Curso createCurso(Curso curso) {
		listaCursos.add(curso);
		return curso;
	}
	
	public List<Curso> darDeAltaCurso(Curso curso){
		createCurso(curso);
		
		return listaCursos;
	}

	@Override
	public boolean existCursoByCodigo(String codigo) {
		for (Curso curso : listaCursos) {
			if(curso.getCodigo().equals(codigo)) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public void deleteCursoByCodigo(String codigo)throws CursoNotFoundException{
		if(!existCursoByCodigo(codigo)) {
			throw new CursoNotFoundException(codigo);
		}
		
		Iterator<Curso> iterator = listaCursos.iterator();
		while(iterator.hasNext()) {
			Curso curso = iterator.next();
			if(curso.getCodigo().equals(codigo)) {
				iterator.remove();
			}
		}
		
	}
	
	public List<Curso> eliminacionCurso(String codigo){
		deleteCursoByCodigo(codigo);
		
		return listaCursos;
	}

	@Override
	public void updateHoras(String codigo, int horas) throws CursoNotFoundException{
		if(!existCursoByCodigo(codigo)) {
			throw new CursoNotFoundException(codigo);
		}
		
		Curso curso = getCursoByCodigo(codigo);
		
		curso.setNumeroHoras(horas);
		
	}

}
