import java.util.Scanner;

public class Grading
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the mark of the student out of 100: ");
        int marks = sc.nextInt();
        sc.close();

        if(marks > 100 || marks < 0)
        {
            System.out.println("Enter valid input");
        }

        else if(marks >= 91 && marks <= 100)
        {
            System.out.println("Outstanding");
        }

        else if(marks >= 81 && marks <= 90)
        {
            System.out.println("Very good");
        } 

        else if(marks >= 61 && marks <= 80)
        {
            System.out.println("Good");
        }

        else if(marks >= 35 && marks <= 60)
        {
            System.out.println("Average");
        }
        
        else if(marks< 35)
        {
            System.out.println("Fail");
        }
    }
}
