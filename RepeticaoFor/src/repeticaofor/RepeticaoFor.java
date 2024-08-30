/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repeticaofor;

/**
 *
 * @author pablo
 */
public class RepeticaoFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        for (int cc = 1; cc <= 100; cc += 10) {
            System.out.println("Cambalhota: " + cc--);
            cc = cc++;
        }

        /*      // for () {};
        for (int cc = 0; cc <= 3; cc++) {
            System.out.println("Cambalhota: " + cc);
        }

        /*      // while () {};
        int cc = 0;
        while (cc < 4) {
            System.out.print("Cambalhota: " + cc);
            cc++;
        }
         */
 /*      // do {} while ();
        int cc = 0;
        do {
            System.out.println("Cambalhota: " + cc);
            cc++;
        } while (cc < 4);
         */
    }

}
