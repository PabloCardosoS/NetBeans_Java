/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package teste00004;

/**
 *
 * @author pablo
 */
public class Teste00004 {
    
    public static void main(String[] args) {
        int v0 = 3;
        int v1 = v0++;
        int v2 = ++v1;
        v1 += v0;
        v2 += --v1;
        System.out.println(v0 + " " + v1 + " " + v2);
    }

}
