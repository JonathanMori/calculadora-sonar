package projeto_sonar.projeto_sonar;

import java.util.Scanner;

import entidades.Dados;

/**
 * Hello world!
 *
 */
public class App {
	
	public static void main( String[] args ) {
		String continuar = "";
		Scanner s = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		
		System.out.println("***************************************************");
		System.out.println("█▀▀ █▀▀█ █░░ █▀▀ █░░█ █░░ █▀▀█ █▀▀▄ █▀▀█ █▀▀█ █▀▀█ ");
		System.out.println("█░░ █▄▄█ █░░ █░░ █░░█ █░░ █▄▄█ █░░█ █░░█ █▄▄▀ █▄▄█ ");
		System.out.println("▀▀▀ ▀░░▀ ▀▀▀ ▀▀▀ ░▀▀▀ ▀▀▀ ▀░░▀ ▀▀▀░ ▀▀▀▀ ▀░▀▀ ▀░░▀ ");
		System.out.println("***************************************************");
		
		do {
			Dados dados = new Dados();
			
			menu(dados, s);
			
			double resultado = 0;
			
			if (dados.getOperacao() == 1) {
				resultado = somar(dados.getValorA(), dados.getValorB());
			} else if (dados.getOperacao() == 2) {
				resultado = subtrair(dados.getValorA(), dados.getValorB());
			} else if (dados.getOperacao() == 3) {
				resultado = multiplicar(dados.getValorA(), dados.getValorB());
			} else if (dados.getOperacao() == 4) {
				resultado = dividir(dados.getValorA(), dados.getValorB());
			}
			
			System.out.printf("\nO resultado é: %f\n\n", resultado);
			
			System.out.printf("\nDeseja realizar outra operação? (Digite s ou S para continuar) ");
			continuar = s2.nextLine();
						
			System.out.printf("\n\n\n");
		} while (continuar.contentEquals("s") || continuar.contentEquals("S"));
		
		s.close();
		s2.close();
    }
	
	private static void menu(Dados dados, Scanner s) {		
		System.out.println("");
		System.out.println("Qual operação deseja realizar?");
		System.out.println("1 - Somar");
		System.out.println("2 - Subtrair");
		System.out.println("3 - Multiplicar");
		System.out.println("4 - Dividir");
		
		System.out.printf("\nDigite o número da operação: ");
		dados.setOperacao(s.nextInt());
		
		System.out.printf("Digite o valor do primeiro número: ");
		dados.setValorA(s.nextDouble());
		
		System.out.printf("Digite o valor do segundo número: ");
		dados.setValorB(s.nextDouble());
	}
	
	private static double somar(double a, double b) {
		return a + b;
	}
	
	private static double subtrair(double a, double b) {
		return a - b;
	}
	
	private static double multiplicar(double a, double b) {
		return a * b;
	}
	
	private static double dividir(double a, double b) {
		return a / b;
	}
}
