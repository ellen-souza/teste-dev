/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ellen
 */
public class BubbleSort2 {
     public static void main(String[] args) {
    int[] v = {5, 3, 2, 4, 7, 1, 0, 6}; //declaracao do vetor
	int troca = 0; // 
	int i = 0;
	
        System.out.println("Vetor v "); //imprimir na tela 'Vetor v'
	for(i = 0; i<8; i++){ //para percorrer o vetor atual e 
		System.out.print(" "+v[i]); //imprimir o vetor atual na mesma linha
	}
	System.out.println(); //pular linha pro vetor organizado
	
	for(i = 0; i<8; i++){ //para percorrer o vetor atual
		for(int j = 0; j<7; j++){ //percorrer até a penultima posição para não comparar com num q não existe
			if(v[j] > v[j + 1]){ //se o conteudo da posição j for maior que o da j + 1 
				troca = v[j]; // a var troca vai receber o valor na posição j 
				v[j] = v[j+1]; // a posição atual vai ser comparada com a próxima
				v[j+1] = troca; // a próxima posição recebe o valor da posição da troca
			}
		}
	}
	System.out.println("Vetor v organizado"); // mostra o vetor organizado
	for(i = 0; i<8; i++){ //para percorrer o vetor após as comparações
            System.out.print(" "+v[i]); //imprimir o vetor ordenado
}}
}
