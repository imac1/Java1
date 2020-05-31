package Cap2_Recapitulare;

import java.util.Scanner;

public class Recap_1 {
    public static void main(String[] args) {
        Scanner tastatura = new Scanner(System.in);

        System.out.println("Introduceti un sir de caractere");
        String sir = tastatura.next();

        int lungime = sir.length();
        System.out.println("Sirul \"" + sir + "\" are lungimea de " + lungime + " caractere");

    }
}
