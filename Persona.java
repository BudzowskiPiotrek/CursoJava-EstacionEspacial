package estacion.espacial;

public class Persona {

	private String nombre;
	private int edad;
	private String oficio;
	private String numeroPasaporte;

	public Persona(String nombre, int edad, String oficio, String numeroPasaporte) {
		this.nombre = nombre;
		this.edad = edad;
		this.oficio = oficio;
		this.numeroPasaporte = numeroPasaporte;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getOficio() {
		return oficio;
	}

	public void setOficio(String oficio) {
		this.oficio = oficio;
	}

	public String getNumeroPasaporte() {
		return numeroPasaporte;
	}

	public void setNumeroPasaporte(String numeroPasaporte) {
		this.numeroPasaporte = numeroPasaporte;
	}

}
