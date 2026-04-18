package Assignments6;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;
public class M08MapRemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of key-Value pairs");
        int n=sc.nextInt();
        HashMap<Integer,Integer> map=new HashMap<>();
        int arr[]=new int[n];
        System.out.println("Enter the  elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        boolean isduplicate=false;
        for(int i=0;i<n;i++)
        {
            if(map.containsKey(arr[i])){
                isduplicate=true;
                System.out.println("Yes");
                break;
            }
            else{
                map.put(arr[i], 1);
            }
        }
        if(isduplicate=false){
            System.out.println("No");
        }
        System.out.println("The map is"+map);
    }
}