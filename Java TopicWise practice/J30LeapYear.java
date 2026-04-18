import java.util.Scanner;

import java.util.Scanner;
public class J30LeapYear {
    public static void main(String [] args)
    {
        int Year;
        System.out.println("Enter Year");
        Scanner sc=new Scanner(System.in);
        Year=sc.nextInt();
        if(Year%4==0 && Year%100!=0 || Year%400==0 && Year%100==0)
        {
            System.out.println("Leap Year");
        }
        else{
            System.out.println("Not a Leap Year");
        }
    }
}
