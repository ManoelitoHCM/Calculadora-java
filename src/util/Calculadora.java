package util;

public class Calculadora {
	public double soma(double numeroA, double numeroB) {
		return numeroA + numeroB;
	}
	
	public double subtracao(double numeroA, double numeroB) {
		return numeroA - numeroB;
	}
	
	public double multiplicacao(double numeroA, double numeroB) {
		return numeroA * numeroB;
	}
	
	public double divisao(double numeroA, double numeroB) {
		return numeroA / numeroB;
	}
	
	public double exponencial(double numeroA, double numeroB) {
		return Math.pow(numeroA, numeroB);
	}
	
	public double raizQuadrada(double numero) {
		return Math.sqrt(numero);
	}
	
	public double piso(double numeroA, double numeroB) {
		return Math.min(numeroA, numeroB);
	}
	
	public double teto(double numeroA, double numeroB) {
		return Math.max(numeroA, numeroB);
	}
}