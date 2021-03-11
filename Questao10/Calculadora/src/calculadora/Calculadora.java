/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author Roniel Nunes
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    
    
    
    /*
        Crie uma calculadora que funcione através da linha de comando. Esta
        calculadora deve receber comandos aritméticos, e após receber cada
        comando deve realizar o cálculo e exibir o resultado. Os comandos são no
        formato:
        MULTIPLICA A POR B
        DIVIDE A POR B
        SOMA A E B
        SUBTRAI A DE B
        Exemplo:
        MULTIPLICA 10 POR 2
        RESPOSTA: 20
    */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String comando;
        float a;
        float b;
        float resultado = 0;
        int count = 1;
        
        int inicioA = 0;
        int  finalA =0;
        
        int inicioB = 0;
        int finalB = 0;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("formato:");
        System.out.println("MULTIPLICA A POR B");
        System.out.println("DIVIDE A POR B");
        System.out.println("SOMA A E B");
        System.out.println("SUBTRAI A DE B");
        System.out.println("Exemplo:");
        System.out.println("MULTIPLICA 10 POR 2");
        System.out.println("RESPOSTA: 20");
        
        
        System.out.print("Digite o comando: ");
        comando = teclado.nextLine();
        
        
        for (int i = 0; i < comando.length(); i++) {
            if(comando.charAt(i) == ' '){
                switch (count) {
                    case 1:
                        inicioA = i+1;
                        count = 2;
                        break;
                    case 2:
                        finalA = i+1;
                        count  = 3;
                        break;
                    case 3:
                        inicioB = i+1;
                        finalB = comando.length();
                        count = 4;
                        break;
                    default:
                        break;
                }
            }
        }
        //count  = 1;
        
        a =  Float.parseFloat(comando.substring(inicioA, finalA));
        b = Float.parseFloat(comando.substring(inicioB,finalB));
        
        if("MULTIPLICA".equals(comando.substring(0, 10))){
            resultado = a * b;
        }else if("DIVIDE".equals(comando.substring(0,6))){
            resultado = a / b;
        }else if("SOMA".equals(comando.substring(0, 4))){
            resultado = a + b;
        }else if("SUBTRAI".equals(comando.substring(0, 7))){
            resultado = b - a; 
        }
        System.out.println("RESULTADO: " + resultado);
        
    }
    
}
