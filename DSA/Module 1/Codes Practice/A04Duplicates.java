import java.util.Scanner;
public class A04Duplicates{
    public static void duplicates(int []arr){
        System.out.println("The duplicates elements are : ");
        int []visited=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(visited[i]==0){
                for(int j=i+1;j<arr.length;j++){
                    if(arr[i]==arr[j]){
                        System.out.println(arr[i]+" ");
                        visited[j]=1;
                    }
            }
        }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int []arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        duplicates(arr);
    }
}