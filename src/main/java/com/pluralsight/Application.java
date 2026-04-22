package com.pluralsight;
//-------------
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.TimeZone;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
//-------------
public class Application {
    public static void main(String[] args) {
//        Formatters
//        ObtainDate obtainDate = new ObtainDate();
        LocalDateTime today = LocalDateTime.now();
        TimeZone timeZone = TimeZone.getTimeZone("US/Central");
//        String dateFormat = "dd MMMM, yyyy G";
//        String timeFormat = "hh:mm:ss.SSS a zzzz";
//        String dayFormat = "EEEEE";
        System.out.println("(RAW) Today is: " + today);

        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formattedDate1 = today.format(formatter1);
        System.out.println("(FRMT1)Today is: " + formattedDate1);

        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        String formattedDate2 = today.format(formatter2);
        System.out.println("(FRMT2)Today is: " + formattedDate2);

        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("EEEE dd, yyyy");
        String formattedDate3 = today.format(formatter3);
        System.out.println("(FRMT3)Today is: " + formattedDate3);

        DateTimeFormatter formatter4 = DateTimeFormatter.ofPattern("EEEE, MMM dd, yyyy hh:mm");
        String formattedDate4 = today.format(formatter4);
        System.out.println("(FRMT4)Today is: " + formattedDate4);
    }
//        Challenge
        public static void challenge(String[] args) {
            LocalDateTime today = LocalDateTime.now();
            ZonedDateTime gmtTime = ZonedDateTime.now(ZoneId.of("GMT"));
        DateTimeFormatter formatterC = DateTimeFormatter.ofPattern("hh:mm" + "  " + "dd-EEE-yyyy");
        String formattedDateC = today.format(formatterC);
        System.out.println("(FRMTC)Today is: " + formattedDateC);

    }
}
