/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testefuncao002;

/**
 *
 * @author pablo
 */
public class TesteFuncao002 {

    public static void main(String[] args) {
        System.out.println("Vai começar a contagem");
        System.out.println(Operacoes.contador(1, 5)); // eu chamei o método contador dentro da Classe Operacoes
        // passei os parâmetros, foi na classe e viu que era publico (pode utilizar), ele é static = pode fazer
        // chamada sem instanciar nenhum objeto... fez a contagem e mostrou na tela.
        // static = não precisa ser transformado em objeto para usá-lo.

    }

}
