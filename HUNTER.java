import java.util.Scanner;

public class HUNTER
{
    public static void main(String args[])
    {
        int i;
        int j;
        int k;
        int d=0;
        int c=0;
        Scanner ne=new Scanner(System.in);
        int N=ne.nextInt();
        int A[]=new int[N];
        for(i=0;i<N;i++)
        {
            A[i]=ne.nextInt();
        }
        for(j=0;j<N;j++)
        {
            for(k=j+1;k<N;k++)
            {
                if(A[j]!=A[k])
                {
                    c=A[j];
                }
                
            }
            
        }    
         System.out.println(c);
