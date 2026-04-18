import java.util.Scanner;
public class A01Pallindrome{
    public static boolean is_pallindromic(int []arr){
        for(int i=0;i<arr.length/2;i++){
            if(arr[i]!=arr[arr.length-1-i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int []arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        if(is_pallindromic(arr)){
            System.out.println("Pallindormic array");
        }
        else{
            System.out.println("Not a pallindromic array");
        }
    }
}