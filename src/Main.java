import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws Exception{
        //System.out.println("Hello World!");
        Account myacc = new Account(1122,20000,4.5);

        Date date = new SimpleDateFormat("dd/mm/yyyy").parse("10/04/2018");
        myacc.setDateCreated(date);
        myacc.withdraw(2.50);
        myacc.display();
    }
}
