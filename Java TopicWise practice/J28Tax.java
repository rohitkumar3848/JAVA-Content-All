/*
   Input Salary<10000 === No Tax
   Input Salary>10000 and Salary<=100000 === 10% Tax
   Input Salary>100000 === 20% Tax
 */
import java.util.Scanner;
public class J28Tax {
    public static void main(String [] args)
    {
        int salary;
        double tax=0;
        System.out.println("Enter Salary");
        Scanner sc=new Scanner(System.in);
        salary=sc.nextInt();
        if(salary<10000)
        {
            System.out.println(salary+" "+"No Tax");  
        }
        else if(salary>=10000 && salary<100000)
        {
            tax=(salary*0.10);
            System.out.println(salary+" "+tax);  
        } 
        else
        {
            tax=(salary*0.20);
            System.out.println(salary+" "+tax);
        }
    }
    
}
