/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leituraarquivo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Roniel Nunes
 */
public class LeituraArquivo {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        
        float mediaIdadeHomens;
        int idadeHomens = 0;
        int countHomens = 0;
        
        int quantidadeMulheres = 0;
        
        int quantidadePaciente = 0;
        
        int maiorIdade = 0;
        int menorAltura = 300;
        String nomeMaiorIdade = "";
        String nomeMenorAltura = "";
        
        //Pegar nome
        int inicioPalavraNome = 0;
        int finalPalavraNome = 0;
        
        //Pegar sexo
        int inicioPalavraSexo = 0;
        int finalPalavraSexo = 0;
        
        //pegar peso
        int inicioPalavraPeso = 0;
        int finalPalavraPeso = 0;
        
        //pegar idade
        int inicioPalavraIdade = 0;
        int finalPalavraIdade = 0;
        
        //pegar altura
        int inicioPalavraAltura = 0;
        int finalPalavraAltura = 0;

        String sexo;
        String nome;
        int peso;
        int idade;
        int altura;
        
        int count = 1;
        
        System.out.println("Informe o nome de arquivo texto: ");
        String nomeArquivo = "arquivo1.txt";//teclado.nextLine();
        
        System.out.printf("\nConteúdo do arquivo texto:\n");
        try{
            try (FileReader arq = new FileReader(nomeArquivo)) {
                BufferedReader lerArq = new BufferedReader(arq);
                
                String linha = lerArq.readLine();
                
                while(linha != null){
                    System.out.printf("%s\n",linha);
                    
                    quantidadePaciente +=1; //Conta a quantidade de pacientes de acordo com a leitura da linha
                    
                    //Decobrindo onde ternima o nome e começa o sexo
                    for (int i = 0; i < linha.length(); i++) {
                        inicioPalavraNome = 0;
                        //Condição para pefar dados apartir do nome
                        if(linha.charAt(i) == ' '){
                            //System.out.println("Espaço vazio " + i);
                            switch (count) {
                                case 1:
                                    finalPalavraNome = i+1;
                                    inicioPalavraSexo = i+1;
                                    count = 2;
                                    break;
                                case 2:
                                    finalPalavraSexo = i;
                                    inicioPalavraPeso = i+1;
                                    finalPalavraPeso = i+3;
                                    count = 3;
                                    break;
                                case 3:
                                    inicioPalavraIdade = i+1;
                                    finalPalavraIdade = i+3;
                                    count = 4;
                                    break;
                                case 4:
                                    inicioPalavraAltura = i+1;
                                    finalPalavraAltura = i+4;
                                    count = 5;
                                    break;
                                default:
                                    break;
                            }
                        }
                    }
                    count = 1; //COUNT PARA O PRIMEIRO CORTE
                    
                    nome =  linha.substring(inicioPalavraNome,finalPalavraNome);//Pega o nome do arquivo
                    sexo = linha.substring(inicioPalavraSexo, finalPalavraSexo);//Pega a parte do arquivo do sexo do paciente
                    peso = Integer.parseInt(linha.substring(inicioPalavraPeso,finalPalavraPeso));
                    idade = Integer.parseInt(linha.substring(inicioPalavraIdade,finalPalavraIdade));//Pega a parte da idade do arquivo
                    altura = Integer.parseInt(linha.substring(inicioPalavraAltura,finalPalavraAltura));
                    
                            
                    if(idade > maiorIdade){
                        nomeMaiorIdade = nome;
                        maiorIdade = idade;
                    }
                    if("Feminino".equals(sexo)){
                          if(altura < menorAltura){
                              menorAltura = altura;
                              nomeMenorAltura = nome;
                          }
                        
                    }
                    
                    
                    if("Masculino".equals(sexo)){
                        countHomens +=1;
                        idadeHomens += Integer.parseInt(linha.substring(inicioPalavraIdade,finalPalavraIdade));
                        
                    }   
                    
                    if(("Feminino".equals(sexo)) && (altura > 160 && altura < 170) &&(peso > 70) ){
                        quantidadeMulheres +=1;
                    }
                    
                    
                    linha = lerArq.readLine();
                }
            }
        }catch(IOException e){
            System.err.printf("Erro na abertura do arquivo: %s.\n",e.getMessage());
        
        }
        mediaIdadeHomens = (float)(idadeHomens/countHomens);
        System.out.println();
        System.out.println("Quantidade de paciente = " + quantidadePaciente);
        System.out.println("Media idade dos pacientes masculinos = " + mediaIdadeHomens);
        System.out.println("número de mulheres com altura entre 1,60 e 1,70 e peso acima de 70kg = " + quantidadeMulheres);
        System.out.println("o nome do paciente mais velho " + nomeMaiorIdade +" e o nome da mulher mais baixa " + nomeMenorAltura);
        
        
    }
}
