import java.util.Scanner;
public class J13If {
    public static void main(String [] args)
    {
        int marks;
        System.out.println("Enter Marks: ");
        Scanner sc=new Scanner(System.in);
        marks=sc.nextInt();
        if(marks>80)
        {
            System.out.println("Topper");
            if(marks>90)
            {
                System.out.println("Gold Prize given to Topper");
            }
            else if(marks<90 && marks>85)
            {
                System.out.println("Silver Prize given to Topper");
            }
            else
            {
                System.out.println("Bronze Prize given to Topper");
    
            }   
        }
        else if(marks<80 && marks>=60)
        {
            System.out.println("First");   
        }
        else if(marks<60 && marks>=45)
        {
            System.out.println("Second");   
        }
        else
        {
            System.out.println("Fail");   
        }

    }
}
