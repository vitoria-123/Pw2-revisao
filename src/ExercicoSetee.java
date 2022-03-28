
public class ExercicoSetee {

	public static void main(String[] args) {

		double lado1 = 4;
		double lado2 = 2;
		double lado3 = 3;
		
		if (lado1 == lado2 && lado2 == lado3) {
			System.out.println("Equilátero.");
		}
		else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
			System.out.println("Isósceles.");
		}
		else {
			System.out.println("Escaleno.");
		}
		
	}
}
