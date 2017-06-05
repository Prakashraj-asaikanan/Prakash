
import java.util.Scanner;
public class digit
{
public static void main(String args[])
{
    int count=0;
    int N;
    Scanner t=new Scanner(System.in);
    System.out.println("enter the number");
 N=t.nextInt();

while(N!=0)
{
    N/=10;
    count++;
}
    System.out.println(count);
//}
}


}
