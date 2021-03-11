/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundacaonumero;

import java.util.Scanner;

/**
 *
 * @author Roniel Nunes
 */
public class MundacaoNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        double resultado;
        
        System.out.print("Digite o numerador: ");
        int numerador = teclado.nextInt();
        
        System.out.print("Digite o denominador: ");
        int denominador = teclado.nextInt();
        
        if(denominador == 0){
            System.out.println("Denominador invalido ");
            while(denominador == 0){
                System.out.print("Digite o denominador:");
                denominador = teclado.nextInt();
            }
        }
           resultado = (double)numerador/denominador ;
           System.out.println("Numerador " + numerador +"/"+denominador+" Denominador = " + resultado);

    }
}
