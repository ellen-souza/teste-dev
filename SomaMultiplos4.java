import java.util.Scanner;
/*
 4) Soma dos multiplos de 3 ou 5
    Fazer uma implementação que faça a soma de todos os numeros que sejam multiplos de 3 ou 5. 
    Se listar todos os números naturais abaixo de 10 são multiplos de 3 ou 5, ficamos com
    3,5,6 e 9. A soma desses múltiplos é de 23.
        
    A implementação deve ser capaz de receber por parametro um número X se ja
    retornado a soma de todos os numeros multiplos de 3 ou 5. 

 * @author Ellen
 */
public class SomaMultiplos4 {
public static void main(String[] args) {
    
    int t = 3; //variavel armazena o 3
    int c = 5;//var que armazena o 5
    int x; // var armazena valor informado
    int somamult=0; //var da soma dos  multiplos da var t ou c
   
   Scanner input = new Scanner (System.in); 
   System.out.println("Digite um numero inteiro"); //solicita numero
   x=input.nextInt(); //receber numero 
      
	for(int i = 0; i < x; i++){ //laço 
            if(i % t == 0 || i % c == 0){ //se o resto da divisão de i para 3 for zero, guarda o 3 ou se o resto da divisão para 5 for 0, guarda o 5
            somamult += i; //faz a soma dos valores com resultado da divisão 0
}
}
    System.out.println("A soma dos multiplos de 3 ou 5 do numero "+x+" e: "+somamult); //mostra o valor digitado e o resultado da soma dos valores multiplos de 3 ou 5
}
}
