package br.com.meacdavi.secao3;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		int quantidade_minima,quantidade_maxima;
		float estoque_medio;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o numero minimo do estoque: ");
		quantidade_minima = teclado.nextInt();
		
		System.out.println("Digite o numero maximo do estoque: ");
		quantidade_maxima= teclado.nextInt();
		
		estoque_medio = (quantidade_minima + quantidade_maxima ) / 2 ;
		
		System.out.println("O numero médio é: " + estoque_medio);
		
		teclado.close();
		
		
		
		
	}

}
