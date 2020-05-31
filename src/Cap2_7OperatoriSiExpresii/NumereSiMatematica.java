package Cap2_7OperatoriSiExpresii;

public class NumereSiMatematica
{
    public static void main( String[] args )
    {
        System.out.println( "Hai sa numaram masinile:" );

        System.out.println( "Skoda " + ( 25 + 30 / 6 ) );
        System.out.println( "Fiat " + ( 100 - 25 * 3 % 4 ) );

        System.out.println( "Acum voi numara kilometrii:" );

        System.out.println( 3 + 2 + 1 - 5 + 4 % 2 - 1 / 4 + 6 );

        System.out.println( "Este adevarat ca:  3 + 2 < 5 - 7?" );

        System.out.println( 3 + 2 < 5 - 7 );

        System.out.println( "Cat este 3 + 2? " + ( 3 + 2 ) );
        System.out.println( "Cat este 5 - 7? " + ( 5 - 7 ) );

        System.out.println( "Ok, de aceea este fals." );

        System.out.println( "Mai multe calcule." );

        System.out.println( "Este mai mare? " + ( 5 > -2 ) );
        System.out.println( "Este mai mare sau egal? " + ( 5 >= -2 ) );
        System.out.println( "Este mai mic sau egal? " + ( 5 <= -2 ) );
    }
}
