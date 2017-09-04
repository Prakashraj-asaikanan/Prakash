import java.util.*;
public class two {
	public static void main(String args[])
	{Scanner a=new Scanner(System.in);
	StringBuffer s=new StringBuffer(a.next());
	StringBuffer s1=new StringBuffer(a.next());
	int len=s.length(),len1=s1.length();
	int min=len;
	String str="";
	if(min<len1)
	{min=len1;	
	for(int i=1;i<=min;i++)
	{s.append(i);}}
	else
	{min=len;
	for(int i=1;i<=min;i++)
	{s1.append(i);}}
	for(int i=0;i<min;i++)
	{		
		str+=s.charAt(i);
		str+=s1.charAt(i);
	}
	System.out.println(str);
	a.close();
	
}
}
