/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ellen
 */
public class votos1 {
    public static void main(String[] args) {
       
        //metódo votos válidos
        classevotos voto1 = new classevotos(); // iniciar metódo
        voto1.votosValidos(); //chamar o metódo criado para votos validos
       
        //metódo votos brancos 
        ClasseBrancos voto2 = new ClasseBrancos(); // iniciar metódo 
        voto2.votosBrancos();//chamar o metódo criado para votos brancos
        
        //metódo votos nulos
        ClasseNulos voto3 = new ClasseNulos(); // iniciar metódo
        voto3.votosNulos(); //chamar o metódo criado para votos nulos
    }
    }