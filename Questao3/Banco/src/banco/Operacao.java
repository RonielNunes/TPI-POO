/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author Roniel Nunes
 */
public class Operacao {
    private float emprestimo = 0;
    
    public void calculaEmprestimo(float salarioBruto,float desconto, float valorPedido){
        float salarioLiquido = salarioBruto - desconto;
        float emprestimoParcial = (float) (0.3 * salarioLiquido);
        
        if((valorPedido > 0) && (valorPedido <= emprestimoParcial) ){
            emprestimo = valorPedido;
        }else{
            emprestimo = 0;
        }
    
    }
    public void informacaoEmprestimo(){
        if(emprestimo == 0){
            System.out.println("Emprestimo não concedido!");
        }else{
            System.out.println("Emprestimo concedido!");
        }
    }
    
    public float getEmprestimo(){
        return emprestimo;
    }
    
}
