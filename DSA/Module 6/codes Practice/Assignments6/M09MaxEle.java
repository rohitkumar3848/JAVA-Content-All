package Assignments6;
import java.util.Scanner;
import java.util.TreeMap;

public class M09MaxEle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of key-Value pairs");
        int n=sc.nextInt();
        TreeMap<Integer,Integer> map=new TreeMap<>();
        int arr[]=new int[n];
        System.out.println("Enter the  elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            map.put(arr[i], 1);
        }
        System.out.println("The max elment is :"+map.lastEntry().getKey());
        
    }
}
