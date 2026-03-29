package controller;

import otavioolinto.pilhas.PilhaStr;

public class PalindromoController {

	public PalindromoController() {
		super();
	}
	
	// Instanciando a classe PilhaStr e criando a pilha
	PilhaStr pilha = new PilhaStr();
	
	public void inverterPalavra(String palavra)throws Exception {
		
		dividirPalavra(palavra, 0);
		
		System.out.println("Esta palavra é um palindromo? "+compararPalavras(palavra));
	}
	
	// Método destinado para empilhar cada letra da palavra
	private String dividirPalavra(String palavra, int pos) {
		
		
		if(palavra.substring(pos)=="") return "";
		pilha.push(palavra.substring(pos,pos+1));
		
		return dividirPalavra(palavra, pos+1);
	}
	
	// Método destinado para verificar se é uma palindromo
	private boolean compararPalavras(String palavra)throws Exception {
		
		// Criando o buffer de Strings
		StringBuffer buffer = new StringBuffer();
		
		int tamanho = pilha.size();
		
		for(int cont=0; cont<tamanho; cont++) {
			
			buffer.append(pilha.pop());
		}
		
		String invertida = buffer.toString();
		
		return (palavra.equals(invertida)) ? true:false;
	}

}
