/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ellen
 */
public class classevotos {
    public void votosValidos() //nome do metódo
    {
      int percentual; //variavel percentual
      int validos = 800; //var validos e quantidade de votos
      int eleitoresTotal = 1000; //var total de eleitores
      
      percentual= (validos*100)/eleitoresTotal; //cálculo do percentual (regra de 3)
      System.out.println("Votos Validos "+percentual+"%"); //imprime o percentual dos votos
    }
}
