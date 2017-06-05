import java.util.Scanner;
public class calc
{
public static void main(String args[])
{
    int sum=0;
    Scanner t=new Scanner(System.in);
    System.out.println("enter the number");
int N=t.nextInt();
for(int i=0;i<=N;i++)
{
    sum=sum+i;
    
}
    System.out.println(sum);
}


}
