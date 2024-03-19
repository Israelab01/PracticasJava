package Interfaces;

import java.time.LocalDate;

public interface Persona {
	String getDNI();

	String getNombre();

	String getApellidos();

	LocalDate getFechaNacimiento();

	Integer getEdad();

	String getEmail();

	void setDNI(String nuevoDni);

	void setNombre(String nuevoNombre);

	void setApellidos(String nuevosApellidos);

	void setFechaNacimiento(LocalDate nuevaFechaNacimiento);

	void setEmail(String nuevoEmail);
}