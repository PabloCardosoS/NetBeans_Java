/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadorternario;

/**
 *
 * @author pablo
 */
public class OperadorTernario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1, n2, r;
        n1 = 14;
        n2 = 8;
        //r = (n1>n2)?n1-n2:n2; // se n1 for maior que n2, então r recebe n1
        //r = (n1>=n2)?n1:n2;
        //r = (n1==n2)?0:1;
        r = (n1!=n2)?n1+n2:n1*n1;
        System.out.println(r);
    }
    
}
