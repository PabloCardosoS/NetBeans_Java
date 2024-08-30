/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package testefuncao02;

public class TesteFuncao02 {

static int funcaoSoma(int a, int b) { 
        int s = a + b;                         
        return s; // boa pratica de programação.. criar uma função que retorna valor e o meu código vai tratar isso
    }
    
    public static void main(String[] args) {
        System.out.println("Começou o programa");
        int sm = funcaoSoma(5, 2);
        System.out.println("A soma é " + sm);
    }

}
