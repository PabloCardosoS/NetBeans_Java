/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comparacaostring;

/**
 *
 * @author pablo
 */
public class ComparacaoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome1 = "Pablo";
        String nome2 = "Pablo";
        String nome3 = new String("Pablo");
        String res;
        /*res = (nome1==nome2)?"igual":"diferente";
        System.out.println(res); //da que é igual*/
        /*res = (nome1==nome3)?"igual":"diferente";
        System.out.println(res); //da que é diferente*/
        //o último objeto foi instanciado pela clausula new, não tem a mesma estrutura dos outros
        //o conteudo é igual, mas não eles.
        res = (nome1.equals(nome3))?"igual":"diferente"; //método equals verificar se o conteúdo de um objeto é igual a outro
        System.out.println(res); //para objeto usar equals / usar para qualquer classe invólucro
    }
    
}
