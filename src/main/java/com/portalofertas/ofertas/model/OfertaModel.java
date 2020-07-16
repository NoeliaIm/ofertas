package com.portalofertas.ofertas.model;

import java.util.Locale;

public class OfertaModel {
	private String producto;
	private double precio;
	private Locale fechaInicio;
	private String tipo;
	
	
	public String getProducto() {
		return producto;
	}
	public void setProducto(String producto) {
		this.producto = producto;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public Locale getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(Locale fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	@Override
	public String toString() {
		return "OfertaModel [producto=" + producto + ", precio=" + precio + ", fechaInicio=" + fechaInicio + ", tipo="
				+ tipo + "]";
	}
	
	

}
