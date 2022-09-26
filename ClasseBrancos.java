/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ellen
 */
public class ClasseBrancos {
     public void votosBrancos()//nome do metódo
    {
      int percentual; //variavel percentual
      int brancos = 150; //var branco e quantidade de votos
      int eleitoresTotal = 1000; //var total de eleitores
      
      percentual= (brancos*100)/eleitoresTotal;//cálculo do percentual (regra de 3)
      System.out.println("Votos Brancos "+percentual+"%"); //imprime o percentual dos votos
    }
    
}
