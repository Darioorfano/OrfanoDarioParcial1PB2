package ar.edu.unlam.pb2.biblioteca;

import static org.junit.Assert.*;

import org.junit.Test;

public class BibliotecaTest {

	@Test
	public void testQueVerificaQueLosEstudiantesNoPuedenSolicitarMasde2LibrosSimultaneamente() {

		Libro libro=new Historia(1,"Historia del mundo en 12 mapas","Jerry Brotton");
	Libro libro1=new Geografia(2,"Geografia de Estrabon","Estrabon");
	Libro libro2=new Geografia(3,"Geografia de Estraba","Estrabon");
	
		Estudiante estudiante= new Estudiante(41582343,"Orfano","Dario");
	Biblioteca biblioteca =new Biblioteca();
biblioteca.agregarLibro(libro1);
biblioteca.agregarLibro(libro);
	biblioteca.registrarPrestamo(estudiante, libro);
	biblioteca.registrarPrestamo(estudiante, libro1);
	assertFalse(biblioteca.registrarPrestamo(estudiante, libro1));
	}

}
