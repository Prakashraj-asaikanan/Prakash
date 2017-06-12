import java.util.Scanner;
import java.util.Arrays;
public class Inde
{
     public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
    int f=sc.nextInt();
    int a[]=new int[f];
    int i,j;
    for(i=0;i<f;i++)
    {
        a[i]=sc.nextInt();
    }    
     Arrays.sort(a);
     int s=sc.nextInt();
     int index1=s;
     if(a[s]==index1)
      {
          System.out.println("the number equal to index");
      }
      else{
          System.out.println("the number is not equal to index");
      }
   
     }
     
}
