package Cap2_8Variabile;

import java.util.Scanner;

public class IntrebariSimple {

    public static void main( String[] args )  {

       // pentru citirea de la tastatura folosim un obiect de tip Scanner,
        // numit "tastatura" (puteti folosi orice alta denumire)

        Scanner tastatura = new Scanner(System.in);

        int varsta;
        String inaltime;
        double greutate;

        System.out.print( "Cati ani ai? " );
        varsta = tastatura.nextInt();

        System.out.print( "Care este inaltimea? " );
        inaltime = tastatura.next();

        System.out.print( "Ce greutate ai? " );
        greutate = tastatura.nextDouble();

        System.out.println( "Ai " + varsta + " ani, esti de  " + inaltime + " inaltime si ai " + greutate + " greutate." );

       // tastatura apeleaza metoda close() pentru a inchide procesul,
        // daca este lasat sa ruleze va produce multe erori
        // in clasele create ulterior
        tastatura.close();
    }
}
