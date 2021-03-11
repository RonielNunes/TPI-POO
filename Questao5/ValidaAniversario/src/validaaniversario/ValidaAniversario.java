/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validaaniversario;

import java.util.Scanner;

/**
 *
 * @author Roniel Nunes
 */
public class ValidaAniversario {

    /**
     * @param args the command line arguments
     */
        
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int dia;
        int mes;
        
        System.out.print("Dia do aniversário: ");
        dia = teclado.nextInt();
        System.out.print("Mes do aniversário: ");
        mes = teclado.nextInt();
        
        switch (mes) {
            case 1:
                if(dia >=1 && dia <=31 ){
                    System.out.println("Data valida! Dia "+dia+ " de "+"Janeiro");
                }else{
                    System.out.println("Data invalida");
                }
                break;
            case 2:
                if(dia >=1 && dia <=28 ){
                    System.out.println("Data valida! Dia "+dia+ " de "+"Fevereiro");
                }else{
                    System.out.println("Data invalida");
                }
                break;
            case 3:
                if(dia >=1 && dia <=28 ){
                    System.out.println("Data valida! Dia "+dia+ " de "+"Marco");
                }else{
                    System.out.println("Data invalida");
                }
                break;
            case 4:
                if(dia >=1 && dia <=30 ){
                    System.out.println("Data valida! Dia "+dia+ " de "+"Abril");
                }else{
                    System.out.println("Data invalida");
                }
                break;
            case 5:
                if(dia >=1 && dia <=31 ){
                    System.out.println("Data valida! Dia "+dia+ " de "+"Maio");
                }else{
                    System.out.println("Data invalida");
                }
                break;
            case 6:
                if(dia >=1 && dia <=31 ){
                    System.out.println("Data valida! Dia "+dia+ " de "+"Julho");
                }else{
                    System.out.println("Data invalida");
                }
                break;
            case 7:
                if(dia >=1 && dia <=30 ){
                    System.out.println("Data valida! Dia "+dia+ " de "+"Junho");
                }else{
                    System.out.println("Data invalida");
                }
                break;
            case 8:
                if(dia >=1 && dia <=31 ){
                    System.out.println("Data valida! Dia "+dia+ " de "+"Agosto");
                }else{
                    System.out.println("Data invalida");
                }
                break;
            case 9:
                if(dia >=1 && dia <=30 ){
                    System.out.println("Data valida! Dia "+dia+ " de "+"Setembro");
                }else{
                    System.out.println("Data invalida");
                }
                break;
            case 10:
                if(dia >=1 && dia <=31 ){
                    System.out.println("Data valida! Dia "+dia+ " de "+"Outubro");
                }else{
                    System.out.println("Data invalida");
                }
                break;
            case 11:
                if(dia >=1 && dia <=30 ){
                    System.out.println("Data valida! Dia "+dia+ " de "+"Novembro");
                }else{
                    System.out.println("Data invalida");
                }
                break;
            case 12:
                if(dia >=1 && dia <=31 ){
                    System.out.println("Data valida! Dia "+dia+ " de "+"Dezembro");
                }else{
                    System.out.println("Data invalida");
                }
                break;
            default:
                System.out.println("Data invalida");
                break;
        }
        
    }
    
}
