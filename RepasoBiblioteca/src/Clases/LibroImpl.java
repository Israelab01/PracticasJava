package Clases;

import java.time.LocalDate;

import Interfaces.Libro;

public class LibroImpl implements Libro {

	// PROPIEDADES

	private String Isbn;
	private String Titulo;
	private String Nombre;
	private LocalDate FechaAdquisicion;
	private Double Precio;
	private Integer NumeroCopiasVendidas;
	private TipoPrestamo tipoPrestamo;

	// CONSTRUCTOR
	public LibroImpl(String Isbn, String Titulo, String Nombre, LocalDate FechaAdquisicion, Double Precio,
			Integer NumeroCopiasVendidas) {
		this.Isbn = Isbn;
		this.Titulo = Titulo;
		this.Nombre = Nombre;
		this.FechaAdquisicion = FechaAdquisicion;
		this.Precio = Precio;
		this.NumeroCopiasVendidas = NumeroCopiasVendidas;

	}

	// TIPOS
	public enum TipoPrestamo {
		DIARIO, SEMANAL, MENSUAL
	}

	// METODOS

	public boolean esBestSeller() {
		return getNumeroCopiasVendidas() > 500000 ? true : false;

	}

	public Integer getDiasPrestamo() {
		Integer diasPrestamo;
		switch (getTipoPrestamo()) {
		
		case DIARIO:
			diasPrestamo = 1;
			break;
			
		case SEMANAL:
			diasPrestamo = 7;
			break;
			
		default:
			diasPrestamo = 30;
			break;
		}
		return diasPrestamo;
	}
	
	public String toString() {
		return getTitulo()+ "(ISBN: "+ getIsbn() +")";
	}
	
	// METODOS GET/SET
	public void numeroDiasPrestado() {
	}

	public String getIsbn() {
		return Isbn;
	}

	public String getTitulo() {
		return Titulo;
	}

	public String getNombre() {
		return Nombre;
	}

	public LocalDate getFechaAdquisicion() {
		return FechaAdquisicion;
	}

	public Double getPrecio() {
		return Precio;
	}

	public Integer getNumeroCopiasVendidas() {
		return NumeroCopiasVendidas;
	}

	public TipoPrestamo getTipoPrestamo() {
		return tipoPrestamo;
	}

	public void setTipoPrestamo(TipoPrestamo nuevoTipoPrestamo) {
		this.tipoPrestamo = nuevoTipoPrestamo;
	}

	public void setIsbn(String nuevoIsbn) {
		this.Isbn = nuevoIsbn;
	}

	public void setTitulo(String nuevoTitulo) {
		this.Titulo = nuevoTitulo;
	}

	public void setNombre(String nuevoNombre) {
		this.Nombre = nuevoNombre;
	}

	public void setFechaAdquisicion(LocalDate nuevaFechaAdquisicion) {
		this.FechaAdquisicion = nuevaFechaAdquisicion;
	}

	public void setPrecio(Double nuevoPrecio) {
		this.Precio = nuevoPrecio;
	}

	public void setNumeroCopiasVendidas(Integer nuevoNumeroCopiasVendidas) {
		this.NumeroCopiasVendidas = nuevoNumeroCopiasVendidas;
	}

}
