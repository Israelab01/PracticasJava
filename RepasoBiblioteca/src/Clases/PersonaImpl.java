package Clases;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import Interfaces.Persona;

public class PersonaImpl implements Persona {

	// PROPIEDADES

	private String dni;
	private String nombre;
	private String apellidos;
	private LocalDate fechaNacimiento;
	private String email;

	// CONSTRUCTORES

	public PersonaImpl(String dni, String nombre, String apellidos, LocalDate fechaNacimiento, String email) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
		this.email = email;
	}

	public PersonaImpl(String dni, String nombre, String apellidos, LocalDate fechaNacimiento) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
	}

	// METODOS
	public Integer getEdad() {
		Period p = Period.between(getFechaNacimiento(), LocalDate.now());
		return p.getYears();
	}

	public String toString() {
		return getDNI() + " - " + getApellidos() + ", " + getNombre() + " - "
				+ getFechaNacimiento().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	}
	// METODS GET/SET

	public String getDNI() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public String getEmail() {
		return email;
	}

	public void setDNI(String nuevoDni) {
		this.dni = nuevoDni;
	}

	public void setNombre(String nuevoNombre) {
		this.nombre = nuevoNombre;
	}

	public void setApellidos(String nuevosApellidos) {
		this.apellidos = nuevosApellidos;
	}

	public void setFechaNacimiento(LocalDate nuevaFechaNacimiento) {
		this.fechaNacimiento = nuevaFechaNacimiento;
	}

	public void setEmail(String nuevoEmail) {
		this.email = nuevoEmail;
	}

}