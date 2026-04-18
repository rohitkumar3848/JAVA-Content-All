import java.util.Scanner;
import java.util.*;
import java.lang.*;
public class P09AddBinaryString {
    public static void main(String [] args)
    {
        String s1;
        String s2;
        String res="";
        int i=0;
        int carry=0;
        Scanner sc=new Scanner(System.in);
        s1=sc.next();
        s2=sc.next();
        int slen1=s1.length();
        int slen2=s2.length();
        while((i<slen1) || (i<slen2) || (carry!=0))
        {
            int x=0;
            if(i<slen1 && s1[slen1-1-i]=='1')
            {
                x=1;
            }
            int y=0;
            if(i<slen2 && s2[slen2-1-i]=='1')
            {
                y=1;
            }
            res=toString((x+y+carry)%2)+res;
            carry=(x+y+carry)/2;
            i++;
        }
        System.out.println(res);
    }
}
