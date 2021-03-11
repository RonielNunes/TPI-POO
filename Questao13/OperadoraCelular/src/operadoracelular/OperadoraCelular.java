/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoracelular;

import java.util.Scanner;

/**
 *
 * @author Roniel Nunes
 */
public class OperadoraCelular {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        float saldo = 50;
        float tempo = 100;
        
        float tempoOperadoraO = 0;
        float tempoOperadoraV = 0;
        float tempoOperadoraF = 0;
        
        float tempoVai = 50;
        float tempoAux =0;
        
        float resultado = 0;
        
        
        String operadora;
        String ligacao;
        
        float tempoGasto = 0;
        
        do{
            System.out.println("==================================================================");
            System.out.println("Saldo = " + saldo + "tempo " + tempo + "tempo Vai Vai " + tempoVai);
            System.out.println("o = outras operadoras v = operadora vai vai f telefone fixo");
            System.out.println("==================================================================");
            
            System.out.print("Escolha a operadora: ");
            operadora = teclado.next();
            
            System.out.print("Tempo gasto: ");
            
            tempoGasto = teclado.nextFloat();
            
                        
            if("o".equals(operadora)){
                tempoOperadoraO +=tempoGasto; 
                
            }else if("v".equals(operadora)){
                if(tempoVai >0 ){
                    tempoVai-= tempoGasto;
                }else if(tempoVai < 0){
                    tempoOperadoraV +=(tempoVai*-1);
                    tempoVai = 0;
                }else{
                    tempoOperadoraV +=tempoGasto;
                }   
            }else if("f".equals(operadora)){
                tempoOperadoraF +=tempoGasto;
            }
            
            tempo -= (tempoOperadoraO + tempoOperadoraV + tempoOperadoraF);
            if(tempo < 0){
                
                saldo -= ((tempoOperadoraO *0.65 ) + (tempoOperadoraV*0.20) + (tempoOperadoraF/2));
                tempo = 0;
            }
            tempoOperadoraO = 0;
            tempoOperadoraV = 0;
            tempoOperadoraF = 0;
            
            
            System.out.println("==================================================================");
            System.out.println("Deseja fazer mais ligação: Sim ou Nao");
            System.out.println("==================================================================");
            ligacao = teclado.next();
            
            
        }while(!"nao".equalsIgnoreCase(ligacao));
        
        
        
    }
    
}
