import java.util.*;
public class pro
{
	public static void main(String pk[] )
	{
		
		Scanner a=new Scanner(System.in);
		int s=a.nextInt();
		int d=a.nextInt();
		int x;
		int temp=s;
		while(s>0)
		{
			x=s%10;
			s=s/10;
			temp=temp*x;
		}
		if(temp==d)
		{
			System.out.println("Seed");
		}
		else
		{
			System.out.println("No seed");
		}
		
	}
}
