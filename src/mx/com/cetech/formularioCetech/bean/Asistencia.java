package mx.com.cetech.formularioCetech.bean;

import java.io.Serializable;

public class Asistencia implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idAsistencia;
	private int idEstudiante;
	private String fechaRegistro;
	public int getIdAsistencia() {
		return idAsistencia;
	}
	public void setIdAsistencia(int idAsistencia) {
		this.idAsistencia = idAsistencia;
	}
	public int getIdEstudiante() {
		return idEstudiante;
	}
	public void setIdEstudiante(int idEstudiante) {
		this.idEstudiante = idEstudiante;
	}
	
	public Asistencia(int idAsistencia, int idEstudiante, String fechaRegistro) {
		super();
		this.idAsistencia = idAsistencia;
		this.idEstudiante = idEstudiante;
		this.fechaRegistro = fechaRegistro;
	}
	public String getFechaRegistro() {
		return fechaRegistro;
	}
	public void setFechaRegistro(String fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	public Asistencia() {
		super();
	}
	
}
