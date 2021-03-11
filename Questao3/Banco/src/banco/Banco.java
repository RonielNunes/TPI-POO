/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.util.Scanner;

/**
 *
 * @author Roniel Nunes
 */
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Operacao banco = new Operacao();
        Scanner teclado = new Scanner(System.in);
        float salario;
        float desconto;
        float valorRequerido;
        
        
        
        System.out.print("Insira o valor do seu salario: ");
        salario = teclado.nextFloat();
        
        System.out.print("Digite o valor de desconto: ");
        desconto = teclado.nextFloat();
        
        System.out.print("Digite o valor pedido: ");
        valorRequerido = teclado.nextFloat();
       
  
        banco.calculaEmprestimo(salario, desconto, valorRequerido);
 
        banco.informacaoEmprestimo();
        System.out.println("valor de emprestimo: " + banco.getEmprestimo());
    }
    
}
