import java.util.*;
public class evene
{
    public static void main(String args[])
    {
        Scanner d=new Scanner(System.in);
        System.out.println("Enter the 1st Number");
        int s=d.nextInt();
        System.out.println("Enter the Second Number");
        int f=d.nextInt();
        for(int i=s;i<=f;i++)
        {
            
                if(i%2==0)
                {
                System.out.println(i);
                }
            
        }
        
    }
}
