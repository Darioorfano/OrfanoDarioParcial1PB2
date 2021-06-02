package ar.edu.unlam.pb2.biblioteca;

public class Estudiante {

	private String apellido;
	private String nombre;
	private Integer dni;
	private Integer cantidadLibrosPrestados;

	public Estudiante(Integer dni, String apellido, String nombre) {
		
		// TODO Auto-generated constructor stub
	this.dni=dni;
	this.apellido=apellido;
	this.nombre=nombre;
	this.cantidadLibrosPrestados=cantidadLibrosPrestados=0;
	}

	
	
	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public Integer getCantidadLibrosPrestados() {
		return cantidadLibrosPrestados;
	}

	public void setCantidadLibrosPrestados(Integer cantidadLibrosPrestados) {
		this.cantidadLibrosPrestados = cantidadLibrosPrestados;
	}

	

}
