/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horarios;

import java.util.Scanner;

/**
 *
 * @author Roniel Nunes
 */
public class Horarios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int horas1 = 0, minutos1 = 0,segundos1 = 0,horas2=0,minutos2=0,segundos2=0,resultado;

        System.out.println("Digite as horas referente ao primeiro horario");
        
        do{
            System.out.print("Digite as horas: ");
            horas1 = teclado.nextInt();
        }while(horas1 <0 || horas1 > 24);

        do{
            System.out.print("Digite os minutos: ");
            minutos1 = teclado.nextInt();
        }while(minutos1 <0 || minutos1 > 60);
        
        do{
            System.out.print("Digite as segundos: ");
            segundos1 = teclado.nextInt();
        }while(segundos1 <0 || segundos1 > 60);
        
        
        System.out.println("Digite as horas referente ao Segundo horario");
        
        do{
            System.out.print("Digite as horas: ");
            horas2 = teclado.nextInt();
        }while(horas2 <0 || horas2 > 24);

        do{
            System.out.print("Digite os minutos: ");
            minutos2 = teclado.nextInt();
        }while(minutos2 <0 || minutos2 > 60);
        
        do{
            System.out.print("Digite as segundos: ");
            segundos2 = teclado.nextInt();
        }while(segundos2 <0 || segundos2 > 60);
        
        if(horas1 >= horas2){
            resultado = ((horas1-horas2)*60*60)+((minutos1 - minutos2)*60)+ (segundos1 - segundos2);
        }else{
            resultado = ((horas2-horas1)*60*60)+((minutos2 - minutos1)*60)+ (segundos2 - segundos1);
        }
        System.out.println("A diferença entre os horarios são: " + resultado+ " segundos");
        
        
    }
    
}
