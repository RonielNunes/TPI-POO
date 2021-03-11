/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entradafim;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Roniel Nunes
 */
public class EntradaFim {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String numero;
        int numeroInt, i = 0;
        
        int lista[] ;
        lista= new int[1000];
 
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite nuemros inteiros, quando acabar digite Fim");
        System.out.print("Digite: ");
        
        numero = teclado.next();
        while(!"Fim".equals(numero)){
            numeroInt= Integer.parseInt(numero);
            lista[i] = numeroInt;
            i++;
                    
            System.out.print("Digite: ");
            numero = teclado.next();  
        }
        Arrays.sort(lista);
        
        for (int valor:lista) {
            System.out.println("numero: "+valor );
        }
        //System.out.println("Somatorio = " + somatorio);
    }
}

