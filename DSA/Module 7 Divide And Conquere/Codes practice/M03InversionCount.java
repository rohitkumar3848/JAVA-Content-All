import java.util.Arrays;

public class M03InversionCount {
    public static int mergeProcedure(int arr[],int l,int m,int h){
        int swap=0;
        int []lsubarray=Arrays.copyOfRange(arr, l, m+1);
        int []rsubarray=Arrays.copyOfRange(arr, m+1, h+1);
        int i=0;
        int j=0;
        int k=l;
        while(i<lsubarray.length && j<rsubarray.length){
            if(lsubarray[i]<=rsubarray[j]){
                arr[k++] = lsubarray[i++];
            }
            else{
                arr[k++] = rsubarray[j++];
                swap += (m + 1) - (l + i);
            }
        }
        while(i < lsubarray.length){
            arr[k++] = lsubarray[i++];
        }

        while(j < rsubarray.length){
            arr[k++] = rsubarray[j++];
        }
        return swap;
    }

    public static int inversionCount(int arr[],int l,int h){
        int count = 0;
        if(l<h){
            int m=l+(h-l)/2;
            count+=inversionCount(arr, l, m);
            count+=inversionCount(arr, m+1, h);
            count+=mergeProcedure(arr,l,m,h);
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {70, 50, 60, 10,20, 30, 80, 15};
        int[] arr1 = {5, 4, 3, 2, 1};
        int n = arr1.length;

        int countOpt = inversionCount(arr1, 0, n-1);
        System.out.println("The inversion count of a given array using divide and conquer approach is: "+countOpt);

    }
}
