/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangulo;
import java.util.Scanner;
/**
 *
 * @author Roniel Nunes
 */
public class Triangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        String asteriscos ="";
        
        for (int i = 0; i < n; i++) {
            asteriscos +="*";
            System.out.println(asteriscos);
            
        }
    }
    
}
