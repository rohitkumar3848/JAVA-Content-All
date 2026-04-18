package Assignments6;
import java.util.Scanner;
import java.util.TreeMap;
public class M06MapSortKey {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of key-Value pairs");
        int n=sc.nextInt();
        TreeMap<Integer,String> map=new TreeMap<>();
        System.out.println("Enter the  key-Value pairs");
        for(int i=0;i<n;i++){
            int key=sc.nextInt();
            String value=sc.nextLine();
            map.put(key,value);
        }
        System.out.println("The map is"+map);
    }
}