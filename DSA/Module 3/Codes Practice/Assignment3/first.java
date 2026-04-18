/* package codechef; // don't place package name! */
package Assignment3;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

/* Name of the class has to be "Main" only if the class is public. */
class first
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
		//int T=sc.nextInt();
		//while(T-->0){
		    int x=sc.nextInt();
        for(int j=0;j<x;j++){
            BigInteger a=sc.nextBigInteger();
            BigInteger b=sc.nextBigInteger();
            BigInteger c=sc.nextBigInteger();
            BigInteger res1=Math.pow(a,(Math.pow(b,c)));
            BigInteger res2=Math.pow(a,(Math.pow(c,b)));
            BigInteger res3=Math.pow(b,(Math.pow(a,c)));
            BigInteger res4=Math.pow(b,(Math.pow(c,a)));
            BigInteger res5=Math.pow(c,(Math.pow(a,b)));
            BigInteger res6=Math.pow(c,(Math.pow(b,a)));
            BigInteger max1=max(max(max(max(max(res1,res2),res3),res4),res5),res6);
            if(max1==res1){
                System.out.println();
            }
            cout<<max1<<endl;
        }
		//}
		
	}
}
