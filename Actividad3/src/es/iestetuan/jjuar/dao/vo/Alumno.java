package es.iestetuan.jjuar.dao.vo;

public class Alumno {
	public String id;
	public String nie;
	public String nombre;
	public String apellido1;
	public String apellido2;
	public String email;
	
	public Alumno() {
		id = "Sin id";
		nie = "Sin NIE";
		nombre = "Sin Nombre";
		apellido1 = "Sin Apellido1";
		apellido2 = "Sin Apellido2";
		email = "Sin Email";
	}
	
	public Alumno(String nia, String dni, String name, String ap1, String ap2, String imiel)  {
		id = nia;
		nie = dni;
		nombre = name;
		apellido1 = ap1;
		apellido2 = ap2;
		email = imiel;
	}

	@Override
	public String toString() {
		return "Alumno [id=" + id + ", nie=" + nie + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2="
				+ apellido2 + ", email=" + email + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNie() {
		return nie;
	}

	public void setNie(String nie) {
		this.nie = nie;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
