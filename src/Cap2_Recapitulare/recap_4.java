package Cap2_Recapitulare;

import java.util.Scanner;

class recap_4 {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduceti un sir1 de caractere");
        String sir1 = sc.next();
        System.out.println("Introduceti alt sir1 de caractere");
        String sir2 = sc.next();

        boolean suntEgale = sir1.equals(sir2);
        System.out.println(suntEgale);

    }
}
