import java.util.*;
public class Hunter105
{
    public static void main(String args[])
    {
        Scanner a=new Scanner(System.in);
        String s[]=a.next().split("");
        int q[]=new int[s.length];
        int q1[]=new int[s.length];
        int sum1=0;
        for(int i=0;i<s.length;i++)
        {q[i]=Integer.parseInt(s[i]);}
        int pk=0;
        for(int j=0;j<s.length;j++)
        { if(j==s.length-1)
            {  pk=q[0]; }
            else
            {pk=q[j+1];}
             int sum=1;
            for(int k=0;k<pk;k++)
            {sum*=q[j];}
            q1[j]=sum;
        }
       for(int i=0;i<s.length;i++)
        {sum1+=q1[i];}
        System.out.print(sum1);
    }
}

