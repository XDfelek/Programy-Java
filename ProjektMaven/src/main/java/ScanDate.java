import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class ScanDate {

    LocalDate date;

    public LocalDate getDate() {
        return this.date;
    }

    public void setDateFromScanner() {

        Scanner sc = new Scanner(System.in);

        //  System.out.println("Eample: 12-25-2103");
        //  System.out.print("Enter date: ");
        String str = sc.nextLine();
        LocalDate dateFromScanner = LocalDate.parse(str);
        //System.out.println("Date: " + );
        this.date = dateFromScanner;

    }

    public void setDate(String dateIntoString) {

        LocalDate date = LocalDate.parse(dateIntoString);

        this.date = date;

    }
}
