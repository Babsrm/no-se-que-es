package objetos;

public class principal {
	public static void main(String[] args) {
		
		int num;
		
		Persona p = new Persona(); 
//		
//		p.nombre = "Barbara";
//		p.altura = 160;
//		p.peso = 58;
		
//		System.out.printf("Tu nombre es %s y tu imc es %.2f.", p.nombre, p.calculaIMC());
		
		Persona q = new Persona ("Bea", "7000000R", 155, 85, 78);
		System.out.printf("Tu nombre es %s y tu imc es %.2f.", q.getNombre(), q.calculaIMC());
	}
}
