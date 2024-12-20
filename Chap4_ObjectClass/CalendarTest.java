package Chap4_ObjectClass;
import java.time.*;
/**
 * @version 1.0 2024-07-04
 * @version Neekon
 */
public class CalendarTest {
    public static void main(String[] args)
    {
        LocalDate date = LocalDate.now();
        int month = date.getMonthValue();
        int today = date.getDayOfMonth();

        date = date.minusDays(today-1);
        DayOfWeek weekday = date.getDayOfWeek();
        int value = weekday.getValue();
        System.out.println("Mon Tue Wed Thus Fri Sat Sun");
        for(int i = 1; i < value; i++)
          System.out.println("  ");
        while(date.getMonthValue() == month)
        {
            System.out.printf("%3d", date.getDayOfMonth());
            if(date.getDayOfMonth() == today)
             System.out.print("*");
            else
             System.out.print(" ");
            date = date.plusDays(1);
            if(date.getDayOfWeek().getValue() == 1) System.out.println();
        }
        if (date.getDayOfWeek().getValue() != 1) System.out.println();
    }
}
