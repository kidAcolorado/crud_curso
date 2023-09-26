package com.viewnext.kidaprojects.crudcurso.service;

import java.util.List;

import com.viewnext.kidaprojects.crudcurso.model.Curso;
/**
 * La interfaz {@code CursoService} define un conjunto de operaciones para gestionar cursos.
 * Estas operaciones incluyen la obtención de la lista de todos los cursos, la búsqueda de un curso por su código,
 * la creación de un nuevo curso, la verificación de la existencia de un curso por su código, la eliminación de un curso
 * por su código y la actualización de las horas de un curso.
 * 
 * <p>
 * El autor de esta interfaz es Víctor Colorado "Kid A".
 * </p>
 *
 * @version 1.0
 * @since 26 de Septiembre de 2023
 */
public interface CursoService {
	
	public List<Curso> getAllCursos();
	
	public Curso getCursoByCodigo(String codigo);
	
	public Curso createCurso(Curso curso);
	
	public boolean existCursoByCodigo(String codigo);
	
	public void deleteCursoByCodigo(String codigo);
	
	public void updateHoras(String codigo, int horas);
		

}
