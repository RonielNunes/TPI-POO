/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idadeatual;

import java.util.Scanner;

/**
 *
 * @author Roniel Nunes
 */
public class IdadeAtual {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.print("Insira sua ano de nascimento: ");
        int anoNascimento = teclado.nextInt();
        
        System.out.print("Insira o ano atual: ");
        int anoAtual = teclado.nextInt();
        
        int saida = anoAtual - anoNascimento;
        
        System.out.println("Sua idade é: " + saida);
    }
    
}
