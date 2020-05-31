package Cap2_10Conversii;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringTodate2 {
    public static void main(String[] args) throws ParseException {

        String stringData1 = "31/12/2020";
        String stringData2 = "31-Dec-2020";
        String stringData3 = "12 31, 2020";
        String stringData4 = "Thu, Dec 31 2020";
        String stringData5 = "Thu, Dec 31 2020 23:37:50";
        String stringData6 = "31-Dec-2020 23:37:50";

        SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat formatter2 = new SimpleDateFormat("dd-MMM-yyyy");
        SimpleDateFormat formatter3 = new SimpleDateFormat("MM dd, yyyy");
        SimpleDateFormat formatter4 = new SimpleDateFormat("E, MMM dd yyyy");
        SimpleDateFormat formatter5 = new SimpleDateFormat("E, MMM dd yyyy HH:mm:ss");
        SimpleDateFormat formatter6 = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss");

        Date data1 = formatter1.parse(stringData1);
        Date data2 = formatter2.parse(stringData2);
        Date data3 = formatter3.parse(stringData3);
        Date data4 = formatter4.parse(stringData4);
        Date data5 = formatter5.parse(stringData5);
        Date data6 = formatter6.parse(stringData6);

        System.out.println(stringData1 + "\t" + data1);
        System.out.println(stringData2 + "\t" + data2);
        System.out.println(stringData3 + "\t" + data3);
        System.out.println(stringData4 + "\t" + data4);
        System.out.println(stringData5 + "\t" + data5);
        System.out.println(stringData6 + "\t" + data6);
    }
}
