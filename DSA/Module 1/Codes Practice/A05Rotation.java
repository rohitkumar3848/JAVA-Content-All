import java.util.*;
public class A05Rotation {
    public static void rotation(int [][]arr){
        //row
        int m=arr.length;
        //column
        int n=arr[0].length;
        //Transpose
        for(int i=0;i<m;i++){
            for(int j=i;j<n;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        //Swap left and right elements
        for(int i=0;i<m;i++){
            int li=0;
            int ri=n-1;
            while(li<ri){
                int temp=arr[i][li];
                arr[i][li]=arr[i][ri];
                arr[i][ri]=temp;
                li++;
                ri--;
            }
        }
    }
    public static void Printarray(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [][]arr={{1,2,3},
                     {4,5,6},
                     {7,8,9}};
        System.out.println("The array before rotation:");
        Printarray(arr);
        rotation(arr);
        System.out.println("The array after rotation:");
        Printarray(arr);
    }
}
