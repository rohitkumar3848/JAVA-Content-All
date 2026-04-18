import java.io.*;
import java.util.*;

public class M04SelectionProcedure {
    // function to do the partition of an array
    public static int partition(int[] arr, int l, int h){
        // first element as the pivot element in an array
        int pivot = arr[l];
        int i = l;
        for(int j=l+1; j<=h; j++){
            if(arr[j] <= pivot){
                i = i + 1;
                // swap(arr[i], arr[j])
                int tem = arr[i];
                arr[i] = arr[j];
                arr[j] = tem;
            }
        }
        // swap (arr[l], arr[i])
        // to get the correct position of the pivot element
        int tem = arr[l];
        arr[l] = arr[i];
        arr[i] = tem;
        // index of the pivot element
        return i;
    }



    // function of the quicksort algorithm
    public static int selectionProcedure(int[] arr, int l, int h, int k){
        int m=partition(arr, l, h);
        if(m==k-1){
            return arr[m];
        }
        else if(m<k-1){
            return selectionProcedure(arr, m+1, h, k);
        }
        else{
            return selectionProcedure(arr, l, m-1, k);
        }
    }

     public static void main(String[] args){
        int[] arr = {50, 30, 70, 90, 10, 34, 89, 98, 13};
        int n = arr.length;

        int k=3;
        int res=selectionProcedure(arr,0,n-1,k);
        System.out.println(res);


    }
}
