import java.io.*;
import java.math.*;

public class IUHotel {

		
	public static void main (String args[]) throws java.io.IOException{
		
		BufferedReader in;
		in = new BufferedReader (new InputStreamReader(System.in));
		boolean seguir = false;
		int opcionMenu = 0;
		Rutinas.inicializarMatrizHotel();
		Rutinas.inicializarMatrizConfiguracion();
		Rutinas.inicializarMatrizGrupos();
		Rutinas.imprimirMatriz3D(Rutinas.hotel);
		Rutinas.imprimirMatriz3D(Rutinas.configuracion);
		Rutinas.imprimirMatriz2D(Rutinas.grupos);
		Rutinas.imprimirMatriz2D(Rutinas.getMatrizPersonas(Rutinas.personas)); // Revisa que String pasa a Array
		System.out.println(Rutinas.revertirListaAString(Rutinas.getMatrizPersonas(Rutinas.personas))); // Revisa que Array pasa a String
		
		
		do {
			System.out.println("Bienvenidos al Hotel El Triángulo.");
			System.out.println("Digite el número correspondiente a cada opción para ejecutar la acción");
			System.out.println("**1 Ingresar cuartos al sistema");
			System.out.println("**2 Ver el costo por persona");
			System.out.println("**3 Ver cantidad de personas en un cuarto");
			System.out.println("**4 Ver ingresos por semana");
			System.out.println("**5 Habitación de personas en grupo");
			System.out.println("**6 Cantidad de personas no desaparecidas");
			System.out.println("**7 Salir del programa");
			System.out.println("**8 TEST");
			
			
			opcionMenu= Integer.parseInt(in.readLine());
			
			switch (opcionMenu){
			case 1:
				Rutinas.ingresarCuarto("EJEMPLO");   //ESTO HAY QUE HACERLO INPUT
				break;
			case 2:
				Rutinas.costoPorPersona();
				break;
			case 3:
				Rutinas.personasEnCuarto();
				break;
			case 4:
				Rutinas.ingresosSemana();
				break;
			case 5:
				Rutinas.habitacionPersonaGrupo();
				break;
			case 6:
				Rutinas.personasNoDesaparecidas();
				break;
			case 7:
				System.out.println("Gracias por usar el sistema del Hotel Triángulo");
				break;
			case 8:
				Rutinas.imprimirMatriz3D(Rutinas.getMatriz());
				Rutinas.personasEnCuarto();				
				break;
			default:
				System.out.println("Favor de ingresar un número que corresponda a las opciones");
				seguir = true;
			}
		}
		while (seguir == true);
	}

	
	
	
}

	
	
	
	

/*
	static int contLlenarA = 0;
	static int contLlenarAA = 0;
	static int contLlenarAAA = 0;
	
	public static void main (String [] args) throws java.io.IOException {
		
		//Se crean las matrices y arreglos necesarios
		int [] [] configuracion = new int [3] [11]; //Se crea matriz de configuracion
		int [] [] habitaciones = new int [3] [11];   //Se crea matriz habitaciones
		int [] grupo = new int [5];   //Arreglo de grupos. Cantidad máxima de grupos es 5
		
		//Se definen las variables
		BufferedReader in;
		in = new BufferedReader (new InputStreamReader(System.in));
		int costoPersA = 115;
		int costoPersAA = 75;
		int costoPersAAA = 55;
		int cuartoOcupado = 0;
		boolean seguir = true;
		int tipoCuarto = 0;

		
		do {
			System.out.println("Desea reportar que un cuarto adicional está ocupado (1 para si, 2 para no)?");
			cuartoOcupado = Integer.parseInt(in.readLine());
			
			if (cuartoOcupado == 1){
				System.out.println("Qué tipo de cuarto está ocupado? (1 para A, 2 para AA y 3 para AAA)");
				tipoCuarto = Integer.parseInt(in.readLine());
				
				switch (cuartoOcupado){
					case 1: llenarA(configuracion);
						break;
					case 2: llenarAA(configuracion);
						break;
					case 3: llenarAAA(configuracion);
						break;
				}
			}
			else {
				seguir = false;
			}
			}
		while (seguir == true);
	
		
		



		System.out.println(configuracion[0].length);
	}
	
	
	public static void llenarA(int [][] input){
	
		for (int i = 0; i < input[0].length; i++){
			if (input[0][0] == 0){
				input[0][0] = 1;
				break;
			}
			else if (input[0][i] == 1){
				contLlenarA += 1;   
				input[0][i+contLlenarA] = 1;
				break;
			}
			else{
				System.out.println("No hay campos disponibles de este tipo.");
			}
		}
		
		System.out.println("Se ha ingresado un huesped en el cuarto tipo A.");
	};
	
	public static void llenarAA(int [][] input){
		for (int i = 0; i < input[0].length; i++){
			if (input[1][0] == 0){
				input[1][0] = 1;
				break;
			}
			else if (input[1][i] == 1){
				contLlenarAA += 1;   
				input[1][i+contLlenarAA] = 1;
				break;
			}
			else{
				System.out.println("No hay campos disponibles de este tipo.");
			}
		}
		
		System.out.println("Se ha ingresado un huesped en el cuarto tipo A.");
	};

	public static void llenarAAA(int [][] input){
		for (int i = 0; i < input[0].length; i++){
			if (input[2][0] == 0){
				input[2][0] = 1;
				break;
			}
			else if (input[2][i] == 1){
				contLlenarAAA += 1;   
				input[2][i+contLlenarAAA] = 1;
				break;
			}
			else{
				System.out.println("No hay campos disponibles de este tipo.");
			}
		}
		
		System.out.println("Se ha ingresado un huesped en el cuarto tipo A.");
	};
	
	public static void vaciarA(){
		
	}
	
	public static void vaciarAA(){
		
	}
	
	public static void vaciarAAA(){
		
	}
	
	public static void cantA(){
		
	}

	public static void cantAA(){

		
	}
	
	public static void cantAAA(){
		
	}
	
}



/*
		for (int i = 0; i < input.length; i++){
			if (input[0][i] == 0){
				input[0][i+1] = 1;
				break;
			}
			else{
				System.out.println("No hay campos disponibles de este tipo.");
			}
		}
		
		System.out.println("Se ha ingresado un huesped en el cuarto tipo A.");
	};
*/