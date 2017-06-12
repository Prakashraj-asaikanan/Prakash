import java.util.*;
public class happy
{
    public  static void main(String args[])
    {
        
    
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int f=0;
        int h=5;
        for(int i=0;i<5;i++)
        {
            if(a>1)
            {
                f=a%10;
                a=a/10;
                a=(f*f)+(a*a);
                //Math.pow(s,a);
                //System.out.println(a);
            }
        }
        if(a==0)
        {
            System.out.println("1");
        }
        else
        {
            System.out.println("True");
        }
    }
    
}

