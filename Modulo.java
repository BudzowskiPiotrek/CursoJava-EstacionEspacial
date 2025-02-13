package estacion.espacial;

public class Modulo {
	private String nombre;
	private int capacidad;
	private Persona[] habitantes; 
	private int cantidadHabitantes;

	public Modulo(String nombre, int capacidad, Persona[] habitantes) {
		this.nombre = nombre;
		this.capacidad = capacidad;
		this.habitantes = new Persona[capacidad]; // aqui una pequena mejora
		this.cantidadHabitantes = 0;
	}

	public void agregarHabitante(Persona persona) {
		if (cantidadHabitantes < habitantes.length) {
			habitantes[cantidadHabitantes] = persona;
			cantidadHabitantes++;
		} else {
			System.out.println("No hay espacio para mas habitantes en el módulo " + nombre + ".");
		}
	}

	public void eliminarHabitante(String nombrePersona) {
		boolean encontrado = false, seguro = false;

		for (int i = 0; i < cantidadHabitantes && !seguro; i++) {
			if (habitantes[i].getNombre().equalsIgnoreCase(nombrePersona)) {
				for (int j = i; j < cantidadHabitantes - 1; j++) {
					habitantes[j] = habitantes[j + 1];
				}
				habitantes[cantidadHabitantes - 1] = null;
				cantidadHabitantes--;
				seguro = true;
			}
		}
		if (encontrado) {
			System.err.println("La persona " + nombrePersona + " bye bye");
		} else {
			System.err.println("La persona con el nombre " + nombrePersona + " no existe papi");
		}
	}

	public int getCantidadHabitantes() {
		return cantidadHabitantes;
	}

	public void setCantidadHabitantes(int cantidadHabitantes) {
		this.cantidadHabitantes = cantidadHabitantes;
	}

	public void listarHabitantes() {
		if (cantidadHabitantes == 0) {
			System.out.println("Desierto aqui no hay nadie!");
		} else {
			System.out.println("Habitantes del modulo " + nombre + ": \n");
			for (int i = 0; i < cantidadHabitantes; i++) {
				System.out.println(habitantes[i].getNombre());
			}
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public Persona[] getHabitantes() {
		return habitantes;
	}

	public void setHabitantes(Persona[] habitantes) {
		this.habitantes = habitantes;
	}
	

}
