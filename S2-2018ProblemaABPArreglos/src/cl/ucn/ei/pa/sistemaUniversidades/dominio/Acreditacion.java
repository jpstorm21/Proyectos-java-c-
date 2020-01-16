package cl.ucn.ei.pa.sistemaUniversidades.dominio;

public class Acreditacion {
	private Universidad universidad;
	private Carrera carrera;
	private  boolean acreditada;
	private int a�osAcreditacion;
	private String fechaInicioAcreditacion;
	private String fechaFinAcreditacion;

	public Acreditacion(Universidad universidad, Carrera carrera, boolean acreditada, int a�osAcreditacion, String fechaInicioAcreditacion, String fechaFinAcreditacion) {
		this.universidad = universidad;
		this.carrera = carrera;
		this.acreditada = acreditada;
		this.a�osAcreditacion = a�osAcreditacion;
		this.fechaInicioAcreditacion = fechaInicioAcreditacion;
		this.fechaFinAcreditacion = fechaFinAcreditacion;
	}
	
	public Universidad getUniversidad() {
		return universidad;
	}
	public void setUniversidad(Universidad universidad) {
		this.universidad = universidad;
	}
	public Carrera getCarrera() {
		return carrera;
	}
	public void setCarrera(Carrera carrera) {
		this.carrera = carrera;
	}

	public boolean isAcreditada() {
		return acreditada;
	}

	public void setAcreditada(boolean acreditada) {
		this.acreditada = acreditada;
	}

	public int getA�osAcreditacion() {
		return a�osAcreditacion;
	}

	public void setA�osAcreditacion(int a�osAcreditacion) {
		this.a�osAcreditacion = a�osAcreditacion;
	}

	public String getFechaInicioAcreditacion() {
		return fechaInicioAcreditacion;
	}

	public void setFechaInicioAcreditacion(String fechaInicioAcreditacion) {
		this.fechaInicioAcreditacion = fechaInicioAcreditacion;
	}

	public String getFechaFinAcreditacion() {
		return fechaFinAcreditacion;
	}

	public void setFechaFinAcreditacion(String fechaFinAcreditacion) {
		this.fechaFinAcreditacion = fechaFinAcreditacion;
	}
	
	
	
}
