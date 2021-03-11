/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mesdia;

import java.util.Scanner;

/**
 *
 * @author Roniel Nunes
 */
public class MesDia {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // TODO code application logic here
        String mes,mesEntrada, saida ="entra";
        Scanner teclado = new Scanner(System.in);
        
        do{
        System.out.println("=========================================");
        System.out.println("Digite o nome referente ao mês desejado: ");
        mesEntrada = teclado.next();
        mes = mesEntrada.toLowerCase(); //Deixa minusculo
        
        switch(mes){
            case "janeiro":
                System.out.println(1);
                break;
            case "fevereiro":
                System.out.println(2);
                break;
            case "março":
                System.out.println(3);
                break;
            case "abril":
                System.out.println(4);  
                break;
            case "maio":
                System.out.println(5);  
                break;
            case "julho":
                System.out.println(6);  
                break;
            case "junho":
                System.out.println(7);  
                break;
            case "agosto":
                System.out.println(8);  
                break;
            case "setembto":
                System.out.println(9);  
                break;
            case "outubro":
                System.out.println(10); 
                break;
            case "novembro":
                System.out.println(11);  
                break;
            case "dezembro":
                System.out.println(12);  
                break;
        }        
        
        System.out.println("Digite sair para SAIR, ou qualquer outra string para continuar");
        saida = teclado.next();
       
        
        }while(!"sair".equals(saida));

        
        
        
    }
    
}
