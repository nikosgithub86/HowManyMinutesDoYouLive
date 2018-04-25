package dateproject;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import javafx.util.Duration;

public class DateProject {

    public static void main(String[] args) {
       
       LocalDate today =  LocalDate.now();
//        System.out.println(today);
        LocalDate birthDay =  LocalDate.of(1986, Month.JULY, 14);
    
          System.out.println("the month was "+birthDay.getDayOfMonth()+"the day was "+birthDay.getDayOfWeek()); 
        LocalTime time1 = LocalTime.now();
        Period period = Period.between(birthDay, today);
    period.getYears();
        System.out.println(period.getYears());
        
 

Duration dur = Duration.minutes(period.getDays());
        System.out.println(dur);
    }
    
}
