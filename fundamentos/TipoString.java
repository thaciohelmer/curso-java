package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Ol� pessoal".charAt(0));
		String s = "Boa Tarde";
		System.out.println(s.concat("!!!"));
		//System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.length());
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12345.987;
		System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome);
		System.out.printf("O Senhor %s %s tem %d e ganha R$%.2f.", nome, sobrenome, idade, salario);
		
		String frase = String.format("\nO Senhor %s %s tem %d e ganha R$%.2f.", nome, sobrenome, idade, salario);
		System.out.println(frase);
	}

}
