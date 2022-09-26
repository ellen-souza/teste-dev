/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ellen
 */
public class ClasseNulos {
    public void votosNulos()//nome do metódo
    {
      int percentual; //variavel percentual
      int nulos = 50; //var nulo e quantidade de votos
      int eleitoresTotal = 1000; //var total de eleitores
      
      percentual= (nulos*100)/eleitoresTotal; //cálculo do percentual (regra de 3)
      System.out.println("Votos Nulos "+percentual+"%"); //imprime o percentual dos votos
    }
}
