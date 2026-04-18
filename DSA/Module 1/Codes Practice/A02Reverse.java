import java.util.Scanner;
public class A02Reverse{
    public static void reverse(int []arr){
        for(int i=0;i<arr.length/2;i++){
            int temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int []arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        reverse(arr);
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
}