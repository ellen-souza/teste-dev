
import java.util.Scanner;

/*
3) Fatorial
Faça um programa que calcule o fatorial de um número qualquer. 
 */

/**
 *
 * @author Ellen
 */
public class fatorial3 {
    public static void main(String[] args) {
    
        double n,f; //declaracao das variáveis 
        Scanner input = new Scanner(System.in); 
        System.out.println("Digite um numero para fatoracao"); //solicita numero
        n=input.nextDouble(); //recebe numero
        f=n; //inicia variavel f com o valor de n
        
        if (n==0){ //se n for igual a 0
            f=1; //fatorial recebe 1
        }

            while (n > 1){ // Enquanto n for maior que 1 faça 

            f = f *(n-1); // fatorial recebe o resultado da multiplicação de n menos 1
                n--; // decrementamos o valor de n em um, no final do loop
            } System.out.println("Fatorial e: "+f); // Esse comando imprime o valor de f. O último será o valor final do Fatorial.
               
                                           }
                        }