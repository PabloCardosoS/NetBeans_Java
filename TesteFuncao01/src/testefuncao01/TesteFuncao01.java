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
    
    static void procedimentoSoma(int a, int b) { // método static serve para classe e não instância(objeto)
        int s = a + b;                          // não posso chamar um procedimento dentro de um metodo static 
        System.out.println("A soma é " + s);    // se esse procedimento não for static.
    }
    
    public static void main(String[] args) {
        System.out.println("Começou o programa");
        procedimentoSoma(5, 2);
    }

}
