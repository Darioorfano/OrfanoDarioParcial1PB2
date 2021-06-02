package ar.edu.unlam.pb2.biblioteca;

import java.util.ArrayList;

public class Biblioteca {
private ArrayList librosDisponibles;
private ArrayList librosPrestados;
private ArrayList listaPrestamo;

public Biblioteca(){
	
	this.librosDisponibles=new ArrayList<>();
	this.librosPrestados=new ArrayList<>();
	this.listaPrestamo=new ArrayList<>();
	
}

public void agregarLibro(Libro libro){
	this.librosDisponibles.add(libro);
	
}

public Boolean registrarPrestamo(Estudiante estudiante, Libro libro) {
	if(estudiante.getCantidadLibrosPrestados()<2) {
		this.librosDisponibles.remove(libro);
		this.librosPrestados.add(libro);
		
		return true;
	}
	return false;
}



}
