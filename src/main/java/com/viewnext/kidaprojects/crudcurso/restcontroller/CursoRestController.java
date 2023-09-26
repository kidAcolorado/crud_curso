package com.viewnext.kidaprojects.crudcurso.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.viewnext.kidaprojects.crudcurso.exception.CursoNotFoundException;
import com.viewnext.kidaprojects.crudcurso.model.Curso;
import com.viewnext.kidaprojects.crudcurso.service.CursoServiceImpl;


/**
 * Controlador REST para la gestión de cursos.
 */
@RestController
public class CursoRestController {

    @Autowired
    CursoServiceImpl cursoServiceImpl;

    /**
     * Obtiene todos los cursos.
     *
     * @return Una lista de cursos en formato JSON.
     */
    @GetMapping(value = "cursos", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Curso> mostrarCursos() {
        // Llama al servicio para obtener la lista de cursos y la devuelve como JSON
        return cursoServiceImpl.getAllCursos();
    }

    /**
     * Obtiene un curso por su código.
     *
     * @param codigo El código del curso que se desea obtener.
     * @return Una respuesta HTTP con el curso en formato JSON si se encuentra, o un mensaje de error si no se encuentra.
     */
    @GetMapping(value = "curso/{codigo}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> mostrarCursoByCodigo(@PathVariable("codigo") String codigo) {
        try {
            // Intenta obtener el curso por su código
            Curso curso = cursoServiceImpl.getCursoByCodigo(codigo);
            // Devuelve el curso en la respuesta si se encuentra
            return ResponseEntity.ok(curso);
        } catch (CursoNotFoundException e) {
            // Devuelve un mensaje de error y un estado HTTP 404 si no se encuentra el curso
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }

    /**
     * Da de alta un nuevo curso.
     *
     * @param curso El curso que se va a dar de alta.
     * @return Una respuesta HTTP con una lista actualizada de cursos en formato JSON.
     */
    @PostMapping(value = "curso", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity<?> darDeAltaCurso(@RequestBody Curso curso) {
        // Llama al servicio para dar de alta el curso y obtener la lista actualizada
        List<Curso> listaCursos = cursoServiceImpl.darDeAltaCurso(curso);
        // Devuelve la lista actualizada en la respuesta
        return ResponseEntity.ok(listaCursos);
    }
    
    /**
     * Actualiza las horas de un curso.
     *
     * @param codigo El código del curso que se va a actualizar.
     * @param horas Las nuevas horas del curso.
     * @return Una respuesta HTTP 200 (OK) si la actualización se completa con éxito, o un mensaje de error y un estado HTTP 404 si el curso no se encuentra.
     */
    @PutMapping(value = "curso", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> updateHoras(@RequestParam("codigo") String codigo, 
            @RequestParam("horas") String horas){
        Integer horasNumerico = Integer.parseInt(horas);
        
        try {
            // Intenta actualizar las horas del curso
            cursoServiceImpl.updateHoras(codigo, horasNumerico);
            // Devuelve una respuesta HTTP 200 (OK) si la actualización se completa con éxito
            return ResponseEntity.ok(null);
        } catch (CursoNotFoundException e) {
            // Devuelve un mensaje de error y un estado HTTP 404 si no se encuentra el curso
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
        
    }
    
    /**
     * Elimina un curso por su código.
     *
     * @param codigo El código del curso que se va a eliminar.
     * @return Una respuesta HTTP con una lista actualizada de cursos en formato JSON si la eliminación se completa con éxito, o un mensaje de error y un estado HTTP 404 si el curso no se encuentra.
     */
    @DeleteMapping(value = "curso/{codigo}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> deleteCursoAndShowLista(@PathVariable("codigo") String codigo){
        
        try {
            // Intenta eliminar el curso y obtener la lista actualizada
            List<Curso> listaCursos = cursoServiceImpl.eliminacionCurso(codigo);
            // Devuelve la lista actualizada en la respuesta
            return ResponseEntity.ok(listaCursos);
        } catch (CursoNotFoundException e) {
            // Devuelve un mensaje de error y un estado HTTP 404 si no se encuentra el curso
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
        
    }
}
