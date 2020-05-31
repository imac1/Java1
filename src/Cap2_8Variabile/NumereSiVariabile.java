package Cap2_8Variabile;

public class NumereSiVariabile {

    public static void main( String[] args )
    {
        int masini, soferi, pasageri, masini_neconduse, masini_conduse;
        double spatiu_in_masina, capacitate_masina, medie_pasageri_per_masina;

        masini = 100;
        spatiu_in_masina = 4.0;
        soferi = 30;
        pasageri = 90;
        masini_neconduse = masini - soferi;
        masini_conduse = soferi;
        capacitate_masina = masini_conduse * spatiu_in_masina;
        medie_pasageri_per_masina = pasageri / masini_conduse;


        System.out.println( "Sunt  " + masini + " masini disponibile." );
        System.out.println( "Sunt doar " + soferi + " soferi dsponibili." );
        System.out.println( "Vor fi " + masini_neconduse + " masini neconduse astazi." );
        System.out.println( "Putem transporta " + capacitate_masina + " pasageri astazi." );
        System.out.println( "Avem " + pasageri + " de pasageri de transportat astazi." );
        System.out.println( "trebuie sa punem " + medie_pasageri_per_masina + " pasageri in fiecare masina." );
    }
}
