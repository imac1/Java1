package Cap2_10Conversii;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDate {
    public static void main(String[] args) throws ParseException {


        String data="31/12/1998";
        Date data1=new SimpleDateFormat("dd/MM/yyyy").parse(data);
        System.out.println(data+"\t"+data1);

    }
}
