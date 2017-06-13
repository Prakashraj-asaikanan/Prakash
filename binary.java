import java.util.Scanner;

public class binary
{
    public static void main(String args[])
    {
       Scanner o=new Scanner(System.in);
       int s=o.nextInt();
      String a[]=new String[s];
      int f[]=new int [s];
       int d;
       for(int j=0;j<s;j++)
       {
           a[j]=o.nextLine();
           f[j]=Integer.parseInt(a[j]);
       }
      // for(d=0;d<a.length;d++)
      // {
       //    f[d]=Integer.toBinaryString(a[d]);
      // }
        
    }
}
