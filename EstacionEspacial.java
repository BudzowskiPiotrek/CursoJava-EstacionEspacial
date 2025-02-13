package estacion.espacial;

public class EstacionEspacial {

	private String nombre;
	private Modulo[] modulos;
	private int cantidadModulos;

	public EstacionEspacial(String nombre) {
		this.nombre = nombre;
		this.modulos = new Modulo[20];
		this.cantidadModulos = 0;
	}

	public void agregarModulo(Modulo modulo) {
		if (cantidadModulos < modulos.length) {
			modulos[cantidadModulos] = modulo;
			cantidadModulos++;
		} else {
			System.out.println("No se pueden agregar más módulos, la estación espacial ya está llena.");
		}
	}

	public void eliminarModuloPorNombre(String nombreModulo) {
		boolean encontrado = false, seguro = false;
		;

		for (int i = 0; i < cantidadModulos && !seguro; i++) {
			if (modulos[i].getNombre().equalsIgnoreCase(nombreModulo)) {
				for (int j = i; j < cantidadModulos - 1; j++) {
					modulos[j] = modulos[j + 1];
				}
				modulos[cantidadModulos - 1] = null;
				cantidadModulos--;
				encontrado = true;
				seguro = true;
			}
		}
		if (encontrado) {
			System.err.println("El modulo " + nombreModulo + " bye bye");
		} else {
			System.err.println("El modulo " + nombreModulo + " no existe papi");
		}

	}

	public void listarModulos() {
		if (cantidadModulos == 0) {
			System.out.println("No hay modulos en la estacion espacial.");
		} else {
			System.out.println("Modulos en la estación " + nombre + ":\n");
			for (int i = 0; i < cantidadModulos; i++) {
				System.out.println("Modulo: " + modulos[i].getNombre() + "\nCapacidad: " + modulos[i].getCapacidad());

				modulos[i].listarHabitantes();
			}
		}
	}
	
	 public int obtenerTotalHabitantes() {
	        int totalHabitantes = 0;
	        for (int i = 0; i < cantidadModulos; i++) {
	            totalHabitantes += modulos[i].getCantidadHabitantes();
	        }
	        return totalHabitantes;
	    }

}
