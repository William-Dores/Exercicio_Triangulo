import java.util.Locale;
import java.util.Scanner;
public class inicio {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		Triangulo x, y;
		 x = new Triangulo();
		 y = new Triangulo();
		
		
		System.out.println("Infomre as medidas do triangulo X");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c= sc.nextDouble();
		System.out.println("Informe as medidas do Trianguo Y");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		
		double areaX = x.area();		
		
		double areaY = y.area();

		System.out.printf("Triangulo X area: %.4f%n", areaX);		
		
		System.out.printf("Triangulo Y area: %.4f%n", areaY);

		if (areaX > areaY) {
			System.out.printf("Triangulo com a maior area: X");
		} else {
			System.out.printf("Triangulo com a maior area: Y");
		}
		
		sc.close();

	}

}
