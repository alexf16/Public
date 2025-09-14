package application;
import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digita o primeiro número: ");
		int n1 = scan.nextInt();
		System.out.println("Digita o segundo número: ");
		int n2 = scan.nextInt();

		try {
			contar(n1, n2);
		}catch (ParametrosInvalidosException e) {
		System.out.println("O segundo parametro deve ser maior que o primeiro" + e.getMessage());	
			
		}	
//		scan.close();
	}
	static void contar(int n1, int n2) throws ParametrosInvalidosException {
		// validar se o n1 é MAIOR que n2 e lançar a exceção
		
		if (n1 >= n2) {
			throw new ParametrosInvalidosException("O segundo parametro deve ser mairo que o primeiro.");			
		}
		
		int contagem = n2 - n1;
		// realizar o for para imprimir os numeros com base na variavel contagem
		System.out.println("Impressão de números ...");
		for (int i = 0; i < contagem; i++) {
			System.out.println(i+1);
		}
		
	}

}
