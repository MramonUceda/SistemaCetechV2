package mx.com.cetech.formularioCetech.bean;

import java.io.Serializable;

public class Alumno implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1209652191614989577L;
	
	private int idUsuario;
	private String nombre;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private String correoElectronico;
	private String curso;
	private String formaDePago;
	private boolean activo;
	private String contrasenia;
	private String userName;
	private String sexo;
	private String fechaNacimiento;
	private String telefono;	
	private String calle;
	private String codigoPostal;
	private String colonia;
	private String estado;
	private String delegacion;
	private String ocupacion;
	private String nivelAcademico;
	private String escuela;
	private String medio;
	private String expectativas;
	private String fechaRegistro;
	private String fechaActualizacion;
	private String horario;
	

	public Alumno() {

	}
	

	public Alumno(int idUsuario, String nombre, String apellidoPaterno, String apellidoMaterno,
			String correoElectronico, String curso, String formaDePago, boolean activo, String contrasenia, String userName, String sexo,String fechaNacimiento, String telefono, String calle, String codigoPostal, String colonia, String estado,String delegacion,
			 String ocupacion, String nivelAcademico, String escuela, String medio,
			String expectativas, String fechaRegistro, String fechaActualizacion, String horario) {
		super();
		//,String delegacionMunicipio, String ocupacion,
		this.idUsuario = idUsuario;
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.correoElectronico = correoElectronico;
		this.curso = curso;
		this.formaDePago = formaDePago;
		this.activo = activo;
		this.contrasenia = contrasenia;
		this.userName = userName;
		this.sexo = sexo;
		this.fechaNacimiento = fechaNacimiento;
		this.telefono = telefono;
		this.calle = calle;
		this.codigoPostal = codigoPostal;
		this.colonia = colonia;
		this.estado = estado;
		this.delegacion = delegacion;
		this.ocupacion = ocupacion;
		this.nivelAcademico = nivelAcademico;
		this.escuela = escuela;
		this.medio = medio;
		this.expectativas = expectativas;
		this.fechaRegistro = fechaRegistro;
		this.fechaActualizacion = fechaActualizacion;
		this.horario = horario;
	}


	public int getIdUsuario() {
		return idUsuario;
	}


	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellidoPaterno() {
		return apellidoPaterno;
	}


	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}


	public String getApellidoMaterno() {
		return apellidoMaterno;
	}


	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}


	public String getCorreoElectronico() {
		return correoElectronico;
	}


	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}


	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getFormaDePago() {
		return formaDePago;
	}


	public void setFormaDePago(String formaDePago) {
		this.formaDePago = formaDePago;
	}


	


	public boolean isActivo() {
		return activo;
	}


	public void setActivo(boolean activo) {
		this.activo = activo;
	}


	public String getContrasenia() {
		return contrasenia;
	}


	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	

	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


	public String getFechaNacimiento() {
		return fechaNacimiento;
	}


	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String getCalle() {
		return calle;
	}


	public void setCalle(String calle) {
		this.calle = calle;
	}


	public String getCodigoPostal() {
		return codigoPostal;
	}


	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}


	public String getColonia() {
		return colonia;
	}


	public void setColonia(String colonia) {
		this.colonia = colonia;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}


	public String getDelegacion() {
		return delegacion;
	}


	public void setDelegacion(String delegacion) {
		this.delegacion = delegacion;
	}


	public String getOcupacion() {
		return ocupacion;
	}


	public void setOcupacion(String ocupacion) {
		this.ocupacion = ocupacion;
	}


	public String getNivelAcademico() {
		return nivelAcademico;
	}


	public void setNivelAcademico(String nivelAcademico) {
		this.nivelAcademico = nivelAcademico;
	}


	public String getEscuela() {
		return escuela;
	}


	public void setEscuela(String escuela) {
		this.escuela = escuela;
	}


	public String getMedio() {
		return medio;
	}


	public void setMedio(String medio) {
		this.medio = medio;
	}


	public String getExpectativas() {
		return expectativas;
	}


	public void setExpectativas(String expectativas) {
		this.expectativas = expectativas;
	}


	public String getFechaRegistro() {
		return fechaRegistro;
	}


	public void setFechaRegistro(String fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}


	public String getFechaActualizacion() {
		return fechaActualizacion;
	}


	public void setFechaActualizacion(String fechaActualizacion) {
		this.fechaActualizacion = fechaActualizacion;
	}


	public String getHorario() {
		return horario;
	}


	public void setHorario(String horario) {
		this.horario = horario;
	}





	

	

}
