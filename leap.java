import java.util.*;
public class leap
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the year");
int a=s.nextInt();
if(a%4==0)
{
System.out.println("Leap year");
}
else
{
System.out.println("Not a leap year");
}

}

}
