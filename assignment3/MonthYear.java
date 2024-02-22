import java.util.Scanner;

public class MonthYear 
{

    enum Month
    {
            JANUARY("January", 31),
            FEBRUARY("February", 28),
            MARCH("March", 31),
            APRIL("April", 30),
            MAY("May", 31),
            JUNE("June", 30),
            JULY("July", 31),
            AUGUST("August", 31),
            SEPTEMBER("September", 30),
            OCTOBER("October", 31),
            NOVEMBER("November", 30),
            DECEMBER("December", 31);

            private final String name;
            private final int days;

            Month(String name, int days)
            {
                this.name = name;
                this.days = days;
            }

            public String getName()
            {
                return name;
            }

            public int getDays()
            {
                return days;
            }
    }

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter year: ");
        int year = sc.nextInt();

        System.out.print("Enter month number \n (1 for January, 2 for February and so on) : ");
        int monthNumber = sc.nextInt();

        sc.close();

        boolean isLeapYear = false;
        
        if(year % 100 == 0) 
        {
            if(year % 4 == 0 && year % 400 == 0)
            {
                isLeapYear = true;
            }
        }

        else if(year % 4 == 0)
        {
            isLeapYear = true;
        }

        Month month = Month.values()[monthNumber - 1];
        int yearDays;
        int monthDays = month.getDays();

        if(isLeapYear)
        {
            yearDays = 366;
            if(monthNumber == 2)
            {
                ++monthDays;
            }

            System.out.println("The year " + year + " has " + yearDays + " of days and the month " +
                  month.getName() + " has " + monthDays); 
        }

        else 
        {
            yearDays = 365;
            System.out.println("The  year " + year + " has " + yearDays + " of days and the month " + 
                    month.getName() + " has " + monthDays);
        }
    }
}
