package hotel.management.system;

import java.text.SimpleDateFormat;
import java.util.Date;

class SimpleDateFormats {
    public static void main (String[] args)
    {
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String s = sdf.format(d);
        System.out.println(s);
        
    }
}
