import java.util.*;
public class Hunter102
{
    public static void main(String args[])
    {
        Scanner a=new Scanner(System.in);
        String s=a.next();
        String s1[]=s.split("");
        int l=s1.length;
        int count=0,c=0;
        int q=Integer.parseInt(s);
        if(q>9)
        {
            for(int i=0;i<l;i++)
            {
                for(int j=i;j<i+1;j++)
                {
                    int sq=Integer.parseInt(s1[j]);
                    c+=sq;
                    //System.out.print(c);
                }
                count+=c;
            }
        }
        if(count>0)
        {
            System.out.print(count);
        }
        else
        {
            System.out.print("-1");
        }
        
    }
}

