/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package somaproduto;

import java.util.Scanner;

/**
 *
 * @author Roniel Nunes
 */
public class SomaProduto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int n, soma = 0, produto = 1, numero;
        
        do{
            System.out.print("Digite o valor de n: ");
            n = teclado.nextInt();
            
        }while((n < 0) || (n > 1000));

        
        for(int i= 0; i < n; i++){
            System.out.print("Digite um valor: ");
            numero = teclado.nextInt();
            soma +=numero;
            produto *=numero;
        }
        System.out.println("Soma = "+ soma);
        System.out.println("Produto = "+ produto);
    }
    
}
