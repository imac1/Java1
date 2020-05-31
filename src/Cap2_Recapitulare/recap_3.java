package Cap2_Recapitulare;

import java.util.Scanner;

class recap_3 {

    public static void main (String[] args) {

        Scanner tastatura = new Scanner(System.in);

        System.out.println("Introduceti un sir de caractere");
        String sir = tastatura.next();

        int index = sir.indexOf('a');
        System.out.println("Indexul lui 'a' este " + index);

    }
}
