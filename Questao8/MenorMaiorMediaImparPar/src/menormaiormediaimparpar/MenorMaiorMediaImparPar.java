/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menormaiormediaimparpar;

import java.util.Scanner;

/**
 *
 * @author Roniel Nunes
 */
public class MenorMaiorMediaImparPar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int n, numero,menor = 0,maior = 0,qtPar = 0,qtImpar =0;
        float soma = 0;
        
        do{
            System.out.print("Digite o valor de n: ");
            n = teclado.nextInt();
            
        }while((n < 0) || (n > 1000));

        
        for(int i= 0; i < n; i++){
            System.out.print("Digite um valor: ");
            numero = teclado.nextInt();
            if( i == 0){
                menor = numero;
                maior = numero;
            }else{
                if(menor > numero){
                    menor = numero;
                }
                if(maior < numero){
                    maior = numero;
                }
            }

            soma += numero;
            
            if(numero %2 == 0){
                qtPar +=1;
            }else{
                qtImpar +=1;
            }
        }
        System.out.println("Media = "+ (soma/n));
        System.out.println("Maior = "+ maior);
        System.out.println("Menor = " + menor);
        System.out.println("Quantidade par " + qtPar);
        System.out.println("Quantidade impar " + qtImpar);
        //System.out.println("Produto = "+ produto);
        
    }
    
}
