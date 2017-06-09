import java.util.*;
public class range
{
    public static void main(String pk[])
    {
        int flag=0;
        Scanner c=new Scanner(System.in);
     int s=c.nextInt();
     int e=c.nextInt();
     for(int i=s;i<=e;i++)
     {
         for(int j=2;j<i;j++)
         {
         if(i%j != 0)

    {flag = 1;}

    else

    {flag = 0;

     break;}
  
   }
  if(flag== 1)
    System.out.println(i+" is Prime");

     }
    }
}

    

    
