package DoctorDetails;
import java.util.Scanner;

import HospitalManagement.entrypoint;

import static HospitalManagement.entrypoint.*;
public class bookAppointment {
    public void booking(){
        Scanner sc=new Scanner(System.in);
        System.out.println("****************************************************************************************************************************");
        System.out.println("The doctors slot provided you according to you helath problems such as\n1.Migrain\n2.Cancer\n3.Heartattack\n4.Cardiacarrest\n5.BloodToomer");
        String n=entrypoint.name;
        System.out.println("Please enter your age:");
        int age=sc.nextInt();
        System.out.println("Enter your gender :");
        String gender=sc.nextLine();
        String gen=sc.nextLine();
        System.out.println("Enter your health issues");
        String healthissue=sc.nextLine();
        if(healthissue.equals("Migrain")){
            System.out.println("Welcome "+n+" to our Hospital.\nYour appointment is book to Dr. Naresh Trehan at Room No :101 on Monday at 11:00 AM.\nYour Age : "+age+"\nYour Gender : "+gen+"\nYour health issues : "+healthissue);
        }
        else if(healthissue.equals("Cancer")){
            System.out.println("Welcome "+n+" to our Hospital.\nYour appointment is book to Dr. Siddhartha Mukherjee at Room No :102 on Tuesday at 11:00 AM.\nYour Age : "+age+"\nYour Gender : "+gen+"\nYour health issues : "+healthissue);
        }
        else if(healthissue.equals("Heartattack")){
            System.out.println("Welcome "+n+" to our Hospital.\nYour appointment is book to Dr. YK Moshra at Room No :103 on Wednesday at 11:00 AM.\nYour Age : "+age+"\nYour Gender : "+gen+"\nYour health issues : "+healthissue);
        }
        else if(healthissue.equals("Cardiacarrest")){
            System.out.println("Welcome "+n+" to our Hospital.\nYour appointment is book to Dr. Sandeep Vaishya at Room No :104 on Thursday at 11:00 AM.\nYour Age : "+age+"\nYour Gender : "+gen+"\nYour health issues : "+healthissue);
        }
        else if(healthissue.equals("BloodToomer")){
            System.out.println("Welcome "+n+" to our Hospital.\nYour appointment is book to  Dr. Arun Saroha Trehan at Room No :105 on Friday at 11:00 AM.\nYour Age : "+age+"\nYour Gender : "+gen+"\nYour health issues : "+healthissue);
        }
        else{
            System.out.println("The appointment slot is full for this disease, please visit after sometime.");
        }
        System.out.println("****************************************************************************************************************************");
    }
}
