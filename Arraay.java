import java.util.*;

public class Arraay {
public static void main(String args[])
{
	Scanner a=new Scanner(System.in);
	int s=a.nextInt();
	int f[]=new int[s];
	for(int d=0;d<s;d++)
	{
		f[d]=a.nextInt();
	}
	int t=0,h=0,l=0;
	if(s%2==0)
	{
		t=(s/2)-1;
	}
	else
		t=(s/2);
	for(int g=0;g<=t;g++)
	{
		h=h+f[g];
		
	}
	System.out.println(h);
	for(int j=t+1;j<s;j++)
	{
		l=l+f[j];
	}
	System.out.println(l);
	if(h==l)
	{
		System.out.println("POSSIBLE");
	}
	else
	{
		System.out.println("NOT POSSIBLE");
	}
}
}
