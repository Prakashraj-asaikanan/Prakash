import java.util.Scanner;
public class fact
{
    public static void main(String args[])
    {
        int fact=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int d=sc.nextInt();
        for(int i=1;i<=d;i++)
        {
            fact=fact*i;
          
        }
       System.out.print(fact);   
    }
}
