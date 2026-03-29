package view;

import controller.PalindromoController;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Instanciando os métodos da classe PalindromoController
		PalindromoController metodo = new PalindromoController();
		
		// Criando o método de leitura com a biblioteca Scanner
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite a palavra que deseja verificar se é um palindromo: ");
		
		String palavra = ler.nextLine();
		palavra = palavra.toLowerCase();
		
		try {
			metodo.inverterPalavra(palavra);
			
		}catch(Exception exc) {
			
			System.err.println(exc.getMessage());
		}
		
		ler.close();

	}

}
