import java.util.Scanner;

public class Multiplication
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for multiplication table: ");
        int n = sc.nextInt();
        sc.close();

        for(int i = 1; i <= 20; i++)
        {
            System.out.printf("%-4d * %-4d = %-4d\n", i, n, i * n); 
        }
    }
}
