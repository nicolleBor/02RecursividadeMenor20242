package controller;

public class MenorNumero {

	public MenorNumero() {
		super();
	}
	
	public int vetorSearch(int[] vet, int tamanho, int ultimaPosicao) {
		//Condição de parada
		if(tamanho == -1) {
			return ultimaPosicao;
		}
		if(vet[tamanho] < ultimaPosicao) {
			ultimaPosicao = vet[tamanho]; 
		}
		return vetorSearch(vet, (tamanho - 1), ultimaPosicao); // Chamada da função
	}

}
