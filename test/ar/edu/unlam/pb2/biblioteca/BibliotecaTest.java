package ar.edu.unlam.pb2.biblioteca;

import static org.junit.Assert.*;

import org.junit.Test;

public class BibliotecaTest {

	@Test
	public void testQueVerificaQueLosEstudiantesPuedenSolicitar2LibrosSimultaneamente() {

		Libro libro=new Historia(1,"Historia del mundo en 12 mapas","Jerry Brotton");
		Libro libro1=new Geografia(2,"Geografia de Estrabon","Estrabon");
		Estudiante estudiante= new Estudiante(41582343,"Orfano","Dario");
	Biblioteca biblioteca =new Biblioteca();
	
	biblioteca.registrarPrestamo(estudiante, libro);
	
	}

}
