
public class DatosTest {

	
	public static void main(String[] args) {
		
	//asignacion al entero
		Datos ref = new Datos();
		ref.entero = 1;
		System.out.println("Entero "+ref.entero);

		ref.caracter = 'X';	
		System.out.println("Caracter "+ref.caracter);
	
		ref.noDecimal = 1.6;
		System.out.println("El nº double es "+ref.noDecimal);
	
		ref.booleano = true;
		System.out.println("La afirmacion booleana es "+ref.booleano);
	
		ref.cadenaCaract = "Hola Mundo";
		System.out.println("La cadena del string es "+ref.cadenaCaract);
				
		Datos ref2 = new Datos();
		System.out.println(ref2.entero);
		System.out.println(ref2.caracter);
		System.out.println(ref2.noDecimal);
		System.out.println(ref2.booleano);
		System.out.println(ref2.cadenaCaract);
		
		// CREAR 5 VARIABLES LOCALES, DE LA MISMA INDOLE PERO CREARLAS DENTRO DE REF2 Y NO INVOCAR DEL OTRO, Y LLAMARLAS.
		// ej int entero;
		// syso (entero)
		//moraleja moraleja los campos asignan valores por defecto a diferenca de las variables q estan definidas en el main y sino se le asignan valores no compila 
		}
	
}
