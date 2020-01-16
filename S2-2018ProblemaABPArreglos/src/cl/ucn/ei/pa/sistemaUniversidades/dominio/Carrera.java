package cl.ucn.ei.pa.sistemaUniversidades.dominio;

import cl.ucn.ei.pa.sistemaUniversidades.logica.ListaAcreditaciones;
import cl.ucn.ei.pa.sistemaUniversidades.logica.ListaAranceles;
import cl.ucn.ei.pa.sistemaUniversidades.logica.ListaUniversidades;

public class Carrera {
	private int codigo;
	private String nombre;
	private int a�osDuracion;
	private int costoEstimadoSemestral;
	private ListaUniversidades listaUniversidades;
	private ListaAcreditaciones listaAcreditaciones;
	private ListaAranceles listaAranceles;
	
	
	public Carrera(int codigo, String nombre, int a�osDuracion, int costoEstimadoSemestral) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.a�osDuracion = a�osDuracion;
		this.costoEstimadoSemestral = costoEstimadoSemestral;
		this.listaUniversidades = new ListaUniversidades(20);
		this.listaAcreditaciones = new ListaAcreditaciones(20);
		this.listaAranceles = new ListaAranceles(20);
		
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getA�osDuracion() {
		return a�osDuracion;
	}
	
	public void setA�osDuracion(int a�osDuracion) {
		this.a�osDuracion = a�osDuracion;
	}
	
	public int getCostoEstimadoSemestral() {
		return costoEstimadoSemestral;
	}
	
	public void setCostoEstimadoSemestral(int costoEstimadoSemestral) {
		this.costoEstimadoSemestral = costoEstimadoSemestral;
	}
	
	public ListaUniversidades getListaUniversidades() {
		return listaUniversidades;
	}
	
	public void setListaUniversidades(ListaUniversidades listaUniversidades) {
		this.listaUniversidades = listaUniversidades;
	}
	
	public ListaAcreditaciones getListaAcreditaciones() {
		return listaAcreditaciones;
	}
	
	
	public void setListaAcreditaciones(ListaAcreditaciones listaAcreditaciones) {
		this.listaAcreditaciones = listaAcreditaciones;
	}
	
	
	public ListaAranceles getListaAranceles() {
		return listaAranceles;
	}
	
	
	public void setListaAranceles(ListaAranceles listaAranceles) {
		this.listaAranceles = listaAranceles;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Carrera [codigo=" + codigo + ", " + (nombre != null ? "nombre=" + nombre + ", " : "") + "agnosDuracion="
				+ a�osDuracion + ", costoEstimadoSemestral=" + costoEstimadoSemestral + "]";
	}
	


}
