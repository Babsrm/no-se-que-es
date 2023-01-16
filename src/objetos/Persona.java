package objetos;

public class Persona {
	
	//estado o variables miembro
	private String nombre;
	private String dni;
	private int altura; //en cm, después en la función lo paso a metros
	private int edad;
	private double peso;
	
	//constructor: inicializa los valores de la clase
	public Persona (String nombre, String dni, int altura, int edad, double peso ) {
		this.nombre = nombre; //el this me lleva de referencia a la variable miembro del inicio
		this.dni = dni;
		this.altura = altura;
		this.edad = edad;
		this.peso = peso;
	}
	
	//constructor sin parámetros
	public Persona () { //este constructor no hace nada, pero nos inicializa las variables con las variables que le quiera dar al objeto
		nombre = null;
		dni = null;
	}
	
	//comportamiento o métodos
	
	public double calculaIMC() {
		return peso/(Math.pow(altura/100.0, 2));
	}
	
	//getters and setters. se necesita que las variables estén en private!
	//getter (devuelve el dato)
	public String getNombre() {
		return this.nombre;
	}
	
	
	
}
