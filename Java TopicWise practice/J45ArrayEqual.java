import java.util.Arrays;

public class J45ArrayEqual {
    public static void main(String [] args)
    {
        int a1[]={10,20,30,40,50};
        int a2[]={10,20,30,40,50};
        if(Arrays.equals(a1, a2))
        {
            System.out.println("The Array are equal");
        }
        else{
            System.out.println("The Array are not equal");
        }
    } 
}
