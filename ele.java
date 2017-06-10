import java.util.Scanner;
public class ele
{
    public static void main(String args[])
    {
        Scanner ne=new Scanner(System.in);
        int c=ne.nextInt();
        int s[]=new int[c];
        int i;
        int flag=0;
        for(i=0;i<c;i++)
        {
            s[i]=ne.nextInt();
        }
        for(int j=0;j<c;j++)
        {
          for(int g=j;g<c;g++)
            {
                if(flag==0)
            {
                if(s[j]==s[g])
                {
                    flag=1;
                    System.out.println(s[j]);
                }
            }
            
            }
        }
      
    }
}
