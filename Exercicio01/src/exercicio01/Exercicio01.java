/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio01;

/**
 *
 * @author pablo
 */
public class Exercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i = 1;
        int a = 0;
        while (i < 10) {
            ++a;
            i += 1;
            if (a > 6) {
                ++i;
            }
        }
        System.out.println(i);
        System.out.println(a);

    }

}
