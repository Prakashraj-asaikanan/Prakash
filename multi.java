import java.util.Scanner;
public class multi
{
    public static void main(String pk[])
    {
        Scanner s=new Scanner(System.in);
        int d=s.nextInt();
        for(int i=1;i<=10;i++)
        {
            int f=d*i;
            System.out.println(d+"*"+i+"="+f);
        }
    }
}
