import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		int y = 32;
		double x = 10.35784;
		String nome = "Loacir";
		int idade = 34;
		double renda = 1900.0;
		
		System.out.println(y);
		System.out.println(x);
		System.out.printf("%.2f%n",x);
		System.out.printf("%.4f%n",x);
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n",x);
		System.out.println("RESULTADO " + x + " METROS");
		System.out.printf("RESULTADO %.2f metros%n", x);
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
	
	
		int z = 5;
		y = 2 * z;
		
		System.out.println(z);
		System.out.println(y);
		
		
		double b, B, h;
		b = 6.0;
		B = 8.0;
		h = 5.0;
		
		double area = (b + B) / 2.0 * h;
		
		System.out.println(area);
		
	
	}

}
