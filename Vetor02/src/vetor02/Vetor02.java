package vetor02;

public class Vetor02 {
    
    public static void main(String[] args) {
        String[] mes = {"jan", "fev", "mar", "abr", "mai", "jun",
            "jul", "ago", "set", "out", "nov", "dez"};
        int[] dias = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int c = 0; c < mes.length; c++) {
            System.out.println("O mês de " + mes[c] + " tem " 
                    + dias[c] + " ao todo.");
        }
    }

}
