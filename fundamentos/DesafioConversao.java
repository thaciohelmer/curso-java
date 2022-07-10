package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		// 3 Strings, cada uma recebe um salario de um funcionario, converte para valor numerico
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o primeiro valor: R$");
		String valor1 = entrada.next().replace(",", ".");
		System.out.print("Digite o segundo valor: R$");
		String valor2 = entrada.next().replace(",", ".");;
		System.out.print("Digite o terceiro valor: R$");
		String valor3 = entrada.next().replace(",", ".");;
		entrada.close();
		
		double numero1 = Double.parseDouble(valor1); 
		double numero2 = Double.parseDouble(valor2); 
		double numero3 = Double.parseDouble(valor3);
		
		double media = (numero1 + numero2 + numero3)/3;
		System.out.println(media);
		
		
		
	}
 
}
