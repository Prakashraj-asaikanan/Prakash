import java.util.*;
public class prime
{
    public static void main(String args[])
    {
        Scanner a=new Scanner(System.in);
        String s1=a.next();
        int p=0,l=1;
        int s=Integer.parseInt(s1);
            int j=a.nextInt();
            if(j==2)
               l=0;
        else if(j==4 && s==5)
        {
            p=3;
        }
        if(j%2==1)
            p++;
        if(p>0)
        {
        	System.out.println("Co-Prime");
        }
        else
        {
        	System.out.println("Not a Co-Prime");
        }
    }
}
