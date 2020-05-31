package Cap2_Recapitulare;

import java.util.Scanner;

public class recap_2 {
    public static void main(String[] args) {
        Scanner tastatura = new Scanner(System.in);

        System.out.println("Introduceti un sir de caractere");
        String sir = tastatura.next();

        char primul = sir.charAt(0);
        char ultimul = sir.charAt(sir.length() - 1);
        System.out.println("Primul caracter este " + primul + ", iar ultimul " + ultimul);

    }
}
