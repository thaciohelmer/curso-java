package fundamentos;

public class DesafioAritimeticos {
	public static void main(String[] args) {
		
		/*int a = 3 * 4 - 10;
		int b = (int) Math.pow(a,  3);
		double C = Math.pow(a,  3);
		System.out.println(b);
		System.out.println(C);*/
		
		var Valor1 = Math.pow((6*(3+2)),2)/(3*2);
		var Valor2 = Math.pow((((1-5)*(2-7)/2)),2);
		var Valor3 = Math.pow((Valor1 - Valor2),3);
		var Valor4 = Valor3 /(Math.pow(10, 3));
		
		
		System.out.println(Valor1);
		System.out.println(Valor2);
		System.out.println(Valor3);
		System.out.println(Valor4);
		
	}

}
