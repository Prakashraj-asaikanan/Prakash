import java.util.*;
import java.io.*;
class proo
{
    static public void main(String[] args)
    {
        Scanner sce=new Scanner(System.in);
        int num=sce.nextInt();
        String st=Integer.toString(num);
        char[] n=st.toCharArray();
        Arrays.sort(n);
        int ui=n.length;
        int jil=sce.nextInt();
        if(jil<ui)
        {
            int z=ui-jil;
            for(int i=0;i<z;i++)
            {
                System.out.print(n[i]);
            }
        }
    }
}
