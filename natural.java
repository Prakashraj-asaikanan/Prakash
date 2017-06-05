
import java.util.Scanner;
public class natural
{
public static void main(String args[])
{
    int sum=0;
    Scanner t=new Scanner(System.in);
    System.out.println("enter the numbers");
int N=t.nextInt();
if(N>0)
{
for(int i=0;i<=N;i++)
{
    sum=sum+i;
    
}
    System.out.println(sum);
}
else
{
    System.out.println("Number is not  a natural numnbers");
}
}


}
