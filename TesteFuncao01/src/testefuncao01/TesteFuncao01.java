 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package testefuncao01;

/**
 *
 * @author pablo
 */
public class TesteFuncao01 {
    
    static void procedimentoSoma(int a, int b) { 
        int s = a + b;                          
        System.out.println("A soma é " + s);    
    }
    
    public static void main(String[] args) {
        System.out.println("Começou o programa");
        procedimentoSoma(5, 2);
    }

}
