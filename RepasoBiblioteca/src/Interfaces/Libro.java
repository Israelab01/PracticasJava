package Interfaces;

import java.time.LocalDate;

public interface Libro {

	String getIsbn();

	String getTitulo();

	String getNombre();
	
	LocalDate getFechaAdquisicion();
	
	Double getPrecio();
	
	Integer getNumeroCopiasVendidas();
	
	
	void setNumeroCopiasVendidas(Integer nuevoNumeroCopiasVendidas);
	
	void setPrecio(Double nuevoPrecio);
	
	void setFechaAdquisicion( LocalDate nuevaFechaAdquisicion);
	
	void setIsbn(String nuevoIsbn);
	
	void setTitulo(String nuevoTitulo);
	
	void setNombre(String nuevoNombre);
	
	
}
