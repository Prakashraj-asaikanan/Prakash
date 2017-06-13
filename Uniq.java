import java.util.Scanner;

public class Uniq
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
                if(A[j]==A[k])
                {
                    A[j]=0;
                    A[k]=0;
                }
                
            }
            
        } 
        for(int l=0;l<N;l++)
        {
            if(A[l]!=0)
            {
         System.out.println(A[l]);
    }}
        
    }
}
