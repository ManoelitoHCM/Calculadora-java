package main;

import java.util.Scanner;
import util.Calculadora;

public class Main {

	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		
		Scanner scanner = new Scanner(System.in);
		
		int opcao = -1;
		
		double numeroA, numeroB;
		
		try {
			while (true) {
				System.out.print("Digite uma opção (1-soma, 2-subtracao, 3-multiplicacao, 4-divisao, 5-exponencial, 6-raiz quadrada, 7-piso, 8-teto, 0-sair): ");
				opcao = scanner.nextInt();
				
				if(opcao == 0)
					break;
				
				if(opcao == 6) {
					System.out.print("Digite um numero: ");
					numeroA = scanner.nextDouble();
					System.out.println(calculadora.raizQuadrada(numeroA));
					continue;
				}
				
				System.out.print("Digite o primeiro numero: ");
				numeroA = scanner.nextDouble();
				System.out.print("Digite o segundo numero: ");
				numeroB = scanner.nextDouble();
				
				switch (opcao) {
				case 1:{
					System.out.println(calculadora.soma(numeroA, numeroB));
					break;
				}
				case 2:{
					System.out.println(calculadora.subtracao(numeroA, numeroB));
					break;
				}
				case 3:{
					System.out.println(calculadora.multiplicacao(numeroA, numeroB));
					break;
				}
				case 4:{
					System.out.println(calculadora.divisao(numeroA, numeroB));
					break;
				}
				
				case 5:{
					System.out.println(calculadora.exponencial(numeroA, numeroB));
					break;
				}
				
				case 7:{
					System.out.println(calculadora.piso(numeroA, numeroB));
					break;
				}
				case 8:{
					System.out.println(calculadora.teto(numeroA, numeroB));
					break;
				}
				default:
					System.out.println("Digite um número válido de 1 a 8.");
					break;
				}

			}
		
		} catch (ArithmeticException exc){
			System.out.println(exc.getMessage());
			System.out.println("Erro na execução, número escolhido inválido.");
		} 
		
		scanner.close();
	}

}