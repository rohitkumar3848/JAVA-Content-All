package NearBranches;
import java.util.Scanner;

public class branchesNearByCity {
    public void search(){
        Scanner sc=new Scanner(System.in);
        System.out.println("****************************************************************************************************************************");
        System.out.println("Enter your location to want know the near by branches of our hospital nearest the location :: ");
        System.out.println("****************************************************************************************************************************");
        String a=sc.nextLine();
        String b="Kolkata";
        String c="Mumbai";
        String d="Chennai";
        String e="Goa";
        String f="Delhi";
        if(a.equalsIgnoreCase(b)){
            System.out.println("Some nearest location according to your slected location "+b+" ::\n1. Jorasanka Thakur Bari \n2. Prince Ghat\n3. Science Ghat\n4. Kalighat kali");
        }
        else if(a.equalsIgnoreCase(c)){
            System.out.println("Some nearest location according to your slected location "+c+" :: \n1. Colabra \n2. Worli\n3. Dadri\n4. Juhu");
        }
        else if(a.equalsIgnoreCase(d)){
            System.out.println("Some nearest location according to your slected location "+d+" ::\n1. Dakshinta Chitra \n2. Elliot's\n3. Vellankani\n4. Thousand's Lights Mosque");
        }
        else if(a.equalsIgnoreCase(e)){
            System.out.println("Some nearest location according to your slected location "+e+" ::\n1. Mapusa \n2. Anjuna\n3. Dhudhsagar\n4. Curlies");
        }
        else if(a.equalsIgnoreCase(f)){
            System.out.println("Some nearest location according to your slected location "+f+" ::\n1. Vasant Kunj\n2. Lajpat Nagar\n3. Mayur Vihar\n4. KarolBagh");
        }
        else{
            System.out.println("Sorry we do not have any facilities at your nearest location.");
            System.out.println("You can take help of our self features by recommending medicine prescription process.");
            System.out.println("Thanking you for visiting here.");
        }
        System.out.println("****************************************************************************************************************************");
    }
}
