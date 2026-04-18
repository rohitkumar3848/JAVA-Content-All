import java.util.*;
public class A06PrefixSum {
    public static void prefixSumMatrix(int arr[][]){
        //row wise prefixSum-->
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr[0].length;j++){
                arr[i][j]+=arr[i][j-1];
            }
        }
        //row wise prefixSum-->
        for(int j=0;j<arr[0].length;j++){
            for(int i=1;i<arr.length;i++){
                arr[i][j]+=arr[i-1][j];
            }
        }
    }
    public static void prefixSumRegion(int arr[][],int r1,int c1,int r2,int c2){
        int sum = 0, up = 0, left = 0, repeated_region = 0, result=0;
        sum=arr[r2][c2];
        up=arr[r1-1][c2];
        left=arr[r2][c1-1];
        repeated_region=arr[r1-1][c1-1];
        result=sum-up-left+repeated_region;
        System.out.println("The result is :"+result);
    }
    public static int prefixSumMatrix(int arr[][],int r1,int c1,int r2,int c2){
        int sum=0;
        for(int i=r1;i<r2;i++){
            for(int j=c1;j<c2;j++){
                sum+=arr[i][j];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [][]arr={{1,1,1,1},
                     {1,1,1,1},
                     {1,1,1,1},
                     {1,1,1,1}};
        prefixSumMatrix(arr);
        prefixSumRegion(arr,2,2,3,3);
    }
}
