import java.util.Scanner;

public class Max3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter 3 numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        sc.close();

        if(a > b)
        {
            if(a > c) 
            {
                System.out.println(a + " is the biggest");
            }

            else
            {
                System.out.println(b + " is the biggest");
            }
        }

        else 
        {
            if(b > c)
            {
                System.out.println(b + " is the biggest");
            }

            else
            {
                System.out.println(c + " is the biggest");
            }
        }
    }
}

