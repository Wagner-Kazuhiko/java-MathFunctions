import java.util.Locale;

public class Main2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C;
		
		A = 22.0;
		B = 4.0;
		C = 8.0;
		
		double delta = Math.pow(B, 2.0) - 4 * A * C;
		
		double x1 = (-B + Math.sqrt(delta)) / (2.0 * A);
		double x2 = (-B - Math.sqrt(delta)) / (2.0 * A);
		
		System.out.println(x1);
		System.out.println(x2);

	}

}
