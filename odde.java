import java.util.*;
public class odde
{
    public static void main(String args[])
    {
        Scanner d=new Scanner(System.in);
        int s=d.nextInt();
        int f=d.nextInt();
        for(int i=s;i<f;i++)
        {
            while(i>=0)
            {
                if(i%2!=0)
                {
                System.out.println("the odd numbers are"+i);
                }
            }
        }
        
    }
}
