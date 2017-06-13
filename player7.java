import java.util.*;
public class player7 {
    public static void main(String args[])
    {char s=0;
        Scanner in=new Scanner(System.in);
        String st1=in.next();
        
        char ch[]=st1.toCharArray();
        for(int i=0;i<st1.length();i++)
        {
            if(i%2==0)
            {
                s=ch[i+1];
                ch[i+1]=ch[i];
                  ch[i]=s;
                
            }
            System.out.print(ch[i]);
              
            
        }
    }
}
    
    
