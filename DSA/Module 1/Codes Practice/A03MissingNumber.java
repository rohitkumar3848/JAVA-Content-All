import java.util.Scanner;
public class A03MissingNumber{
    public static int Sum(int []arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum=Sum(arr);
        int sumnatural=((n+1)*(n+2))/2;
        int res=sumnatural-sum;
        System.out.println("The missing number is: "+res);
    }
}