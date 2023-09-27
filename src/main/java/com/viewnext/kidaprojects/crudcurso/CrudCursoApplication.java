package com.viewnext.kidaprojects.crudcurso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.viewnext.kidaprojects.crudcurso.restcontroller", 
		"com.viewnext.kidaprojects.crudcurso.service",
		"com.viewnext.kidaprojects.crudcurso.exception",
		"com.viewnext.kidaprojects.crudcurso.model"})
public class CrudCursoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudCursoApplication.class, args);
	}

}
