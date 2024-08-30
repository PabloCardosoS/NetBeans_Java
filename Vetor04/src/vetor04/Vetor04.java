package vetor04;

import java.util.Arrays;
import java.util.Scanner;

public class Vetor04 {

    public static void main(String[] args) {
        int vet[] = {3, 5, 2, 6, 8, 0, 2, 9, 4, 7, 1};
        for (int v : vet) {
            System.out.print(v + " ");
        }
        System.out.println("");
        int p = Arrays.binarySearch(vet, 11); // se não existe o valor, 
        // ele vai dar posição negativa na próxima posição
        System.out.println("Encontrei o valor na posição: " + p);
    }

}
