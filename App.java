package estacion.espacial;

import java.util.Scanner;

import estudiantes.Estudiante;

public class App {

	static Scanner sn = new Scanner(System.in);
	static Scanner st = new Scanner(System.in);
	static EstacionEspacial luna = new EstacionEspacial("luna");
	static Modulo[] modulo = new Modulo[100];
	static Persona[] persona = new Persona[100];

	public static void main(String[] args) {

		modulo[0] = new Modulo("Labolatorio", 20);
		modulo[1] = new Modulo("Puerto Cosmico", 100);
		modulo[2] = new Modulo("Comedor", 20);
		luna.agregarModulo(modulo[0]);
		luna.agregarModulo(modulo[1]);
		luna.agregarModulo(modulo[2]);
		modulo[1].agregarHabitante(persona[0] = new Persona("Juan","Mecanico","12345678H"));
		modulo[1].agregarHabitante(persona[1] = new Persona("Luiz","Mecanico","23456434H"));
		

		menu();

	}

	private static void menu() {
		int flag = 0;

		do {

			System.out.println("Pulsa 1 para agregar un modulo");
			System.out.println("Pulsa 2 para eliminar el modulo");
			System.out.println("Pulsa 3 para agregar personal al modulo");
			System.out.println("Pulsa 4 para borrar personal del modulo");
			System.out.println("Pulsa 5 para ver informacion");
			System.out.println("Pulsa 6 para encontrar Persona");
			System.out.println("pulsa 7 para salir");
			flag = sn.nextInt();
			switch (flag) {
			case 1:
				System.out.println("Nombre del nuevo modulo");
				String nombre = st.next();
				System.out.println("Capacidad del nuevo modulo");
				int capacidad = sn.nextInt();
				modulo[EstacionEspacial.cantidadModulos] = new Modulo(nombre, capacidad);
				luna.agregarModulo(modulo[EstacionEspacial.cantidadModulos]);
				break;
			case 2:
				System.out.println("Dime el nombre del modulo");
				luna.eliminarModuloPorNombre(st.next());
				break;
			case 3:
				System.out.println("Dime el numero del modulo");
				int numero = sn.nextInt();
				System.out.println("nombre de la persona asignada");
				nombre = st.next();
				System.out.println("dime su oficio");
				String oficio = st.next();
				System.out.println("dime su numero de pasaporte");
				String pasaporte = st.next();
				persona[modulo[numero].cantidadHabitantes] = new Persona(nombre, oficio, pasaporte);
				modulo[numero].agregarHabitante(persona[modulo[numero].cantidadHabitantes]);
				break;
			case 4:
				System.out.println("Dime de que modulo quieres borarlo");
				numero = sn.nextInt();
				System.out.println("Cual es su nombre");
				nombre = st.next();
				modulo[numero].eliminarHabitante(nombre);
				break;
			case 5:
				luna.obtenerTotalHabitantes();
				luna.listarModulos();
				break;
			case 6:
				System.out.println("Cual es nombre");
				nombre = st.next();
				luna.encontrarPersonaModulo(nombre, persona);
				break;
							
			}

		} while (flag != 7);

	}

}
