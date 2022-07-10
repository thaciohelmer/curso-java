package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		//Informa��es do funcionario
		
		//Tipos num�ricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3234845223L;
		
		//Tipos num�ricos reais
		float salario = 11445.44F;
		double vendasAcumuladas = 2991797103.01;
		
		//Tipos booleano
		boolean estaDeFerias = false; // true
		
		//Tipo caractere
		char status = 'A';
		
		//Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		//N�mero de viagens
		System.out.println(numeroDeVoos / 2);
		
		//Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		System.out.println(id + ": ganha -> " + salario);
		System.out.println("F�rias ? " + estaDeFerias);
		System.out.println("Status: " + status);		
	}

}
