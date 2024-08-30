package contador01;

public class Contador01 {

    public static void main(String[] args) {

        int cc = 0;
        while (cc < 10) {
            cc++;
            if (cc == 1 || cc == 3 || cc == 5 || cc == 9) {
                continue;  //não é legal fazer isso (muda o fluxo de um laço);
                            // existem tambêm o break = ele joga pra fora do laço "while"
            }
            if (cc == 7) {
                break; // não é bom usar esse tipo de tecnologia
            }
            System.out.println("Cambalhota: " + cc);
        }
    }

}
