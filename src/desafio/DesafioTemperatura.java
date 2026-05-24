package desafio;

public class DesafioTemperatura {
	public static void main(String[] args) {
		//Fórmula para o cálculo: (°F - 32) x 5/9 = °C
		final int AJUSTE = 32;
		final double FATOR = 5.0 /9.0;
		double fahrenheit = 126;
		
		double celsius = (fahrenheit - AJUSTE) * FATOR;
		
		System.out.println("O resultado da conversão é: " + celsius + " °C");
	}
}
