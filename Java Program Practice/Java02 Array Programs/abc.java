/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class abc
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0){
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    int c=sc.nextInt();
		    int d=sc.nextInt();
		    int count=0;
		    if(a>=10){
		        count++;
		    }
		    if(b>=10){
		        count++;
		    }
		    if(c>=10){
		        count++;
		    }
		    if(d>=10){
		        count++;
		    }
		    System.out.println(count);
		}
	}
}
