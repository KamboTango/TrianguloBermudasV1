import java.io.*;

public class Rutinas {
	//Comentario de prueba
	//Se crean las matrices y arreglos necesarios
	
	static String [] [] [] hotel = new String [3] [11] [3];   //Se crea matriz habitaciones  piso/cuartos y 3 atributos por cuarto
	                                                          // que son (tipo, ocupacion, listaPersonas)
	static int [] [] [] configuracion = new int [3] [11] [2]; //Se crea matriz de configuracion con pisos,cuartos
																//sus dos caracteristicas (ocupado y costo por habitacion)
	static String [][] grupos = new String [7][11];   //Contiene caracteristicas de : lista de personas (son 7 dias y 10 pers max). 
	static String [] [] matrizPrueba = new String [70][5];
	static String personas = "1,1A;0,2A;1,3A;";
	
	public static void inicializarMatrizHotel(){
		//String [] cuarto = new String [3];    //Contiene caracteristicas de : tipo, ocupado y lista de personas (que contiene
		//perdida y código de cuarto
		for ( int piso = 0; piso < hotel.length; piso++){
			for (int cuartos = 0; cuartos < hotel[piso].length; cuartos++){  //sirve para matrices no cuadradas (sino funciona con [0])				
				switch (piso){
					case 0: 
						hotel[piso][cuartos][0] = "A";
						break;
					case 1: 
						hotel[piso][cuartos][0] = "AA";
						break;
					case 2: 
						hotel[piso][cuartos][0] = "AAA";
						break;
					default:
						break;
				}	
				hotel[piso][cuartos][1] = "0";
				hotel[piso][cuartos][2] = "";
			}
		}
	}
	
	public static void inicializarMatrizConfiguracion(){ //Recorre toda la matriz Configuracion y la llena de ceros

		for (int piso = 0 ; piso < configuracion.length ; piso++){
			for (int cuartos = 0 ; cuartos < configuracion[0].length ; cuartos++){
				for (int k = 0 ; k< configuracion[0][0].length; k++){
					configuracion[piso][cuartos][k] = 0;
					switch(piso){
					case 0:
							configuracion[piso][cuartos][1] = 150;
							break;
					case 1:
							configuracion[piso][cuartos][1] = 95;
							break;
					case 2:
							configuracion[piso][cuartos][1] = 80;
							break;
					default:
							break;
					}
				}
			}	
		}
	}
	
	public static void inicializarMatrizGrupos (){
		for(int dia = 0; dia < grupos.length; dia++){
			for (int  persona = 0; persona < grupos[dia].length; persona++)
				if (persona == 0){
					grupos[dia][persona] = "Perdido";
				}
				else{
					grupos[dia][persona] = "";
				}	
		}
	}
	
	
	public static void imprimirMatriz3D(String [][][] matriz){

		for (int i = 0; i < matriz.length; i++){
			for (int j = 0; j < matriz [i].length ; j++){
				String row = new String();
				for (int k = 0; k < matriz[i][j].length; k++) {
					row = row + matriz[i][j][k] + "-";	
				}				
				System.out.println(row);
			}
			System.out.println("\n");
		}
	}
	
	public static String revertirListaAString (String [][] matriz){
		String listaPersonas = "";
		for(int i = 0; i<matriz.length; i++){
			String row = "";
			for (int j=0 ; j< matriz[i].length; j++){
				if(matriz[i][j] == ""){
					
				}				
				else if(j==0){
					row = row + matriz[i][j] + ",";
				}
				else if(j==1){
					row = row + matriz[i][j]+ ";";
				}
			}
			listaPersonas = listaPersonas + row;
		}
		return listaPersonas;
	}
	
	public static void imprimirMatriz3D(int [][][] matriz){
		for (int i = 0; i < matriz.length; i++){
			for (int j = 0; j < matriz [i].length ; j++){
				String row = new String();
				for (int k = 0; k < matriz[i][j].length; k++) {
					row = row + matriz[i][j][k] + "-";	
				}				
				System.out.println(row);
			}
			System.out.println("\n");
		}
	}
	
	public static void imprimirMatriz2D(String[][] matriz) {
		for(int i=0; i < matriz.length; i++) {
			String temporal = "";
			for(int j = 0; j< matriz[i].length; j++){
				temporal = temporal + matriz [i][j] + "-";
			}
			System.out.println(temporal);
		}
	}
	
	public static String [][][] getMatriz(){
		return hotel;
	}
	
	public static void ingresarCuarto(String tipoCuarto)throws java.io.IOException{
		BufferedReader in;
		in = new BufferedReader (new InputStreamReader(System.in));
		System.out.println(" Inserte el tipo de cuarto que desea (A,AA o AAA)");
		tipoCuarto = in.readLine();
		
		switch (tipoCuarto){
		case "A": 
				for (int i = 0; i< hotel[0][0].length; i++){
					if (hotel[0][i][2] == ""){
						hotel[0][i][2] = "1";
						configuracion[0][i][0] = 1;
					}
					else {
						System.out.println("No hay campos tipo " + tipoCuarto + " disponibles.");
					}		
					}
				break;
				
		case "AA":
				for(int i = 0; i<hotel[1][0].length; i++){
						if(	Rutinas.getMatrizPersonas(hotel[1][i][2]).length < 3 ){
							hotel[1][i][2] = "";
						}
						else {
							
						}
					break;
				}
				
		case "AAA":
			
				break;
			
		}
		for (int i = 0; i<hotel.length; i++){
			for ( int j = 0; j<hotel[i].length; j++){
				
			}
		}
	}
	
	public static void eliminarCuarto()throws java.io.IOException{
		BufferedReader in;
		in = new BufferedReader (new InputStreamReader(System.in));
	}
	
	public static void costoPorPersona()throws java.io.IOException{
		BufferedReader in;
		in = new BufferedReader (new InputStreamReader(System.in));
	}
	
	public static void personasEnCuarto()throws java.io.IOException{
		BufferedReader in;
		in = new BufferedReader (new InputStreamReader(System.in));
	}
	
	public static int contarCaracteres (String str, char caracter) {  //Cuenta la cantidad de ocurrencias de caracter en String
		int counter = 0;
		for (int i = 0; i < str.length(); i++){
			if ( str.charAt(i) == caracter ){
				counter ++;
			}
		}
		return counter;
	}
	
	public static String[][] getMatrizPersonas (String listaPersonas){   //Esto transforma el String en una Matriz de Strings
		//Separados por ';'
		int cantidadPersonasEnLista = contarCaracteres(listaPersonas, ';');
		if (cantidadPersonasEnLista > 0 ){
			String [][] lista = new String [cantidadPersonasEnLista][2];
			for(int i = 0; i < cantidadPersonasEnLista; i++){
				
				String substrPersona = listaPersonas.substring(0, listaPersonas.indexOf(";"));
				 
				//Actualiza strPersonas eliminando la persona que acaba de encontrar
				listaPersonas = listaPersonas.substring(listaPersonas.indexOf(";") + 1);
	 
				// Obtiene el valor 'perdida' y 'codigo' usando substrPersona.substring() con ','
				String perdida = substrPersona.substring(0, substrPersona.indexOf(","));
				String codigo =  substrPersona.substring(2);
	 
				// Se insertan los valores la matriz
				lista[i][0] = perdida;
				lista[i][1] = codigo;
			}
			return lista; 
		}
		else{
			String [][] lista = new String [0][0];
			return lista;
		}
	}
	public static void ingresosSemana()throws java.io.IOException{
		BufferedReader in;
		in = new BufferedReader (new InputStreamReader(System.in));
	}
	public static void habitacionPersonaGrupo()throws java.io.IOException{
		BufferedReader in;
		in = new BufferedReader (new InputStreamReader(System.in));
	}
	public static void personasNoDesaparecidas(){
		BufferedReader in;
		in = new BufferedReader (new InputStreamReader(System.in));
	}
	public static void insertarPersona (String tipoCuarto) {
		/* Registros de la transaccion */
		boolean isRegistered = false;
		String codigoRegistro = new String();
		int piso = -1;
 
		/* Segun sea el tipo de cuarto seleccionado, */
		switch(tipoCuarto) {
			
			case "A":
				piso = 0;
				for(int cuarto = 0; cuarto < hotel[piso].length; cuarto++) {
					if(hotel[piso][cuarto][2].equals("")){
						codigoRegistro = "0," + Integer.valueOf(cuarto + 1) + "A" + ";";
						hotel[piso][cuarto][2] = codigoRegistro;
						isRegistered = true;
						break;
					}
				}
				break;
 
			case "AA":
				piso = 1;
				for(int cuarto = 0; cuarto < hotel[piso].length; cuarto++) {
					/* Obtiene la matriz resultante del string almacenado en cuarto[2] */
					String [][] matrizPersonasCuarto = stringToMatriz(hotel[piso][cuarto][2], 3);
 
					for(int i = 0; i < matrizPersonasCuarto.length; i++) {
 
						if(matrizPersonasCuarto[i][0] == "") {
 
							String [] registroPersona = new String[2];
							registroPersona[0] = "0";
							registroPersona[1] = Integer.valueOf(i + 1) + "AA";
 
							matrizPersonasCuarto[i] = registroPersona;
 
							isRegistered = true;
							codigoRegistro = "0," + Integer.valueOf(i + 1) + "AA" + ";";
 
							/* Actualiza el string cuarto[2] en el piso respectivo */
							hotel[piso][cuarto][2] = revertirListaAString(matrizPersonasCuarto);
							return;
						}
					}
				}
				break;
 
			case "AAA":
				piso = 2;
 
				for(int cuarto = 0; cuarto < hotel[piso].length; cuarto++) {
					/* Obtiene la matriz resultante del string almacenado en cuarto[2] */
					String [][] matrizPersonasCuarto = stringToMatriz(hotel[piso][cuarto][2], 3);
 
					for(int i = 0; i < matrizPersonasCuarto.length; i++) {
 
						if(matrizPersonasCuarto[i][0] == "") {
 
							String [] registroPersona = new String[2];
							registroPersona[0] = "0";
							registroPersona[1] = Integer.valueOf(i + 1) + "AAA";
 
							matrizPersonasCuarto[i] = registroPersona;
 
							isRegistered = true;
							codigoRegistro = "0," + Integer.valueOf(i + 1) + "AAA" + ";";
 
							/* Actualiza el string cuarto[2] en el piso respectivo */
							hotel[piso][cuarto][2] = revertirListaAString(matrizPersonasCuarto);
							return;
						}
					}
				}
				break;
 
			default:
				break;
		}
		
		/* Revisa si el usuario fue registrado exitosamente */
		if(isRegistered) {
			System.out.println("Usuario registrado, codigo habitacion: " + codigoRegistro);
		}
		else {
			System.out.println("No se encontro espacio, usuario no registrado");
		}
 
		/* Imprime la matriz global 'hotel' */
		System.out.println("-- START MATRIX: HOTEL -- ");
		imprimirMatriz3D(hotel);
		System.out.println("-- END MATRIX: HOTEL -- ");

	}
	private static String[][] stringToMatriz(String strPersonas, int maxPersonas) {
		int cantPersonas = contarCaracteres(strPersonas, ';');
		 
		if (cantPersonas > 0 ){
			String [][] matrizPersonas = new String [maxPersonas][2];
 
			for(int i = 0; i < cantPersonas; i++){
				String substrPersona = strPersonas.substring(0, strPersonas.indexOf(";"));
 
				//Actualiza strPersonas eliminando la persona que acaba de encontrar
				strPersonas = strPersonas.substring(strPersonas.indexOf(";") + 1);
 
				// Obtiene el valor 'perdida' y 'codigo' usando substrPersona.substring() con ','
				String perdida = substrPersona.substring(0, substrPersona.indexOf(","));
				String codigo =  substrPersona.substring(2);
 
				// Se insertan los valores la matriz
				matrizPersonas[i][0] = perdida;
				matrizPersonas[i][1] = codigo;
			}
			return matrizPersonas; 
		}
		else {
			String [][] matrizPersonas = new String [maxPersonas][2];
 
			for(int i=0; i<matrizPersonas.length; i++) {
				for(int j=0; j<matrizPersonas[i].length; j++) {
					matrizPersonas[i][j] = "";
				}
			}
			return matrizPersonas;
		}
	}


}