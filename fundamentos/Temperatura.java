package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		// (F - 32) X 5/9 = C
		float tempF = 50f;
		final float DenC = 32f;
		final float Div = 5/9.0f;
		float tempC = (tempF - DenC) * Div;
		System.out.println("O resultado é " + tempC + "°C."); 	
	}
}
