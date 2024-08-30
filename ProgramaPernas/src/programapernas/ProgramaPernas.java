/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programapernas;

import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class ProgramaPernas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // switch não funciona por intervalo...
        Scanner tec = new Scanner(System.in);
        System.out.print("Digite a quantidade de pernas: ");
        int perna = tec.nextInt();
        String tipo;
        System.out.println("Isso é um(a) ");
        switch (perna) {
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bípede";
                break;
            case 3:
                tipo = "Tripé";
                break;
            case 4:
                tipo = "Quadrúpede";
                break;
            case 6:
                tipo = "Aranha";
                break;
            default:
                tipo = "ET";
                break;  
        }
        System.out.println(tipo);
    }
    
}
