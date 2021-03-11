/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogosorte;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Roniel Nunes
 */
public class JogoSorte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random gerador = new Random();
        int numeroSorteado = 1 + gerador.nextInt(99);
        int numero, tentativa = 0;
        
        do{
            Scanner teclado = new Scanner(System.in);
            System.out.print("Digite o número: ");
            numero = teclado.nextInt();
            tentativa +=1;
            
            if(numero == numeroSorteado){
                System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*");
                System.out.println("Parabéns você acertou!");
                System.out.println("Número sorteado foi " + numeroSorteado+"é o número de tentativas foi "+ tentativa);
                System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*");
                break;
            }else if(numero > numeroSorteado){
                System.out.println("O número sorteado é menor!");
            }else{
                System.out.println("O número sorteado é maior!");
            }

        }while(numeroSorteado != numero);
        
    }
    
}
