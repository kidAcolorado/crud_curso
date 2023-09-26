package com.viewnext.kidaprojects.crudcurso.model;

import java.util.Objects;

public class Curso {

	private String codigo;
	private String nombre;
	private int numeroHoras;
	private int precio;
	
	
	public Curso(String codigo, String nombre, int numeroHoras, int precio) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.numeroHoras = numeroHoras;
		this.precio = precio;
	}
	
	public Curso() {
		
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumeroHoras() {
		return numeroHoras;
	}

	public void setNumeroHoras(int numeroHoras) {
		this.numeroHoras = numeroHoras;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Curso other = (Curso) obj;
		return Objects.equals(codigo, other.codigo);
	}
	
	
}
