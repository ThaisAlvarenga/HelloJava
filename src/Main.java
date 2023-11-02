
public class Main {

	//void does not return anything but does perform actions
	public static void main(String[] args) {
		// TODO 
		// try out printing
		//try out loops and if statements
		
		System.out.println("Hola Java!");
		
		/* Las variables 
		 * 
		 * Para nombrar variables usamos camelCase.
		 * Los primitivos en Java son:
		 * 	byte		short
		 * 	int			float
		 * 	double		boolean
		 * 	char
		 * 	long
		 * 
		 * Floats and doubles can perform operations with each other
		 */

		String myString ="You looking very handsome today.";
		System.out.println(myString);

		System.out.println("");

		int a = 10;
		int b = 5;
		
		//las comparaciones regresan valores true o false
		System.out.println("Comparar a < b " + (a <= b));

		b = ++a; //primero suma 1 a a y luego assigna su valor a b
		int c = a++; //primero asigna el valor de a a c y luego incrementa el valor de a 

		System.out.println("++a = "+ b); 
		a -= 1;
		System.out.println("a++ = "+ c);


		//otra manera de declarar un int
		Integer myInt = 7;  

		System.out.println("Esto es otro integer " + myInt);

		System.out.println("");

		// you can not print null in Java, por eso es importante hacer cases por si el valor podria ser null
		Float letra = null;

		if(letra == null){
			System.out.println("Letra tiene valor nulo");
		}
		else{
			System.out.println("El valor de letra es" + letra);
		}
		

		
		// Structure in Java
		/*[modifiers] dataType methodName(parameter list)
			{
		  		methodBody functions and all that
		  
		  		return result
		   }
		
		  Java es modular y utiliza paquetes para run el code
		  Los modificadores nos permite guardar o definir niveles de acceso para el metodo
		  Si no ponemos modificadores, entonces es publicos para cualquiera en su mismo paquete
		*/

		//myFunction no puede funcionar por si sola porque es de la clase Main
		//significa que hay que hacer una instancia de la clase para poderla utilizar
		Main miMain = new Main();
		miMain.miFuncion();

	}

	public void miFuncion()
	{
		System.out.println("");
		System.out.println("Este print fue hecho por miFuncion");
	}

}
