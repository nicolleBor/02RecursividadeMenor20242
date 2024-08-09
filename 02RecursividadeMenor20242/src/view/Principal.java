package view;

import controller.MenorNumero;

public class Principal {

	public static void main(String[] args) {
		MenorNumero menor = new MenorNumero();
		int[] vet = {10,-3,4,5,1};
		int tamanho = vet.length;
		tamanho = tamanho - 1;
		int ultimaPosicao = vet[tamanho];
		int resultado = menor.vetorSearch(vet, tamanho, ultimaPosicao);
		System.out.println(resultado);
	}

}
