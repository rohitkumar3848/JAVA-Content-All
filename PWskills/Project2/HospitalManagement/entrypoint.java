package HospitalManagement;

import java.util.*;
import HospitalDetails.hospitalDetails;
import DoctorDetails.bookAppointment;
import DoctorDetails.infoDoctors;
import MedicineList.medicine_Prescription;
import NearBranches.branchesNearByCity;

public class entrypoint {
    public static String name;
    public static String mail;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // Console cnsl= System.console();
        hospitalDetails h1 = new hospitalDetails();
        infoDoctors h2 = new infoDoctors();
        bookAppointment h3 = new bookAppointment();
        medicine_Prescription h4 = new medicine_Prescription();
        branchesNearByCity h5=new branchesNearByCity();
        System.out.println(
                "****************************************************************************************************************************");
        System.out.println("Enter your name : ");
        name = sc.nextLine();
        System.out.println("Enter your email : ");
        mail = sc.nextLine();
        //System.out.println("Make Your Password :");
        // // Read password
        // // into character array
        // char[] ch = cnsl.readPassword(
        //     "Enter password : ");
  
        // // Print password
        // System.out.println(
        //     "Password : " + ch);
        System.out.println(
                "****************************************************************************************************************************");
        int s1;
        System.out.println(name + ", Welcome to our Hospital");
        System.out.println(
                "****************************************************************************************************************************");
        do {
            System.out.println("1.Hospital Detail");
            System.out.println("2.Doctors Detail");
            System.out.println("3.Appointment Book");
            System.out.println("4.Medicine Details");
            System.out.println("5.Near Branches");
            System.out.println(
                "****************************************************************************************************************************");
            System.out.println("Select the choices given above : ");
            int a = sc.nextInt();
            switch (a) {
                case 1:
                    h1.display();
                    break;
                case 2:
                    h2.doctorDetails();
                    break;
                case 3:
                    h3.booking();
                    break;
                case 4:
                    h4.medicine();
                    break;
                case 5:
                    h5.search();
                    break;
            }
            System.out.println("You want to select the choices again then press 1 otherwise press any key ");
            s1 = sc.nextInt();
            System.out.println("Your selected choice is :"+s1);
        } while (s1 == 1);
        System.out.println(
                "****************************************************************************************************************************");
        System.out.println("!!Thanks for visiting!!");
    }
}