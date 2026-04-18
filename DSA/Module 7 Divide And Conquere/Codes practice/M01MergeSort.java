public class M01MergeSort {
    public static void mergeProcedure(int arr[],int l,int mid,int r){
        int i;
        int j;
        int k;
        int n1=mid-l+1;
        int n2=r-mid;
        int lsubarray[]=new int[n1];
        int rsubarray[]=new int[n1];
        for(i=0;i<n1;i++){
            lsubarray[i]=arr[l+i];
        }
        for(j=0;j<n2;j++){
            rsubarray[j]=arr[mid+1+j];
        }
        // comparison among elements in the left and right subarray
        i=0;
        j=0;
        k=l;

        while(i < n1 && j < n2){
            if(lsubarray[i] <= rsubarray[j]){
                arr[k] = lsubarray[i];
                i = i+1;
            }
            else{
                arr[k] = rsubarray[j];
                j = j + 1;
            }
            k = k + 1;
        }

        // copy the remaining elements from left subarray
        while(i < n1){
            arr[k] = lsubarray[i];
            i = i+1;
            k = k+1;
        }

        // copy the remaining elements from right subarray
        while(j < n2){
            arr[k] = rsubarray[j];
            j = j + 1;
            k = k +1;
        }
    }
    public static void mergeSort(int arr[],int l,int r){
        if(l<r){
            int mid=l+(r-l)/2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid+1, r);
            mergeProcedure(arr,l,mid,r);
        }
    }
    public static void print(int []arr,int n){
            for(int i=0;i<n;i++){
                System.out.print(arr[i]+" ");
            }
    }
    public static void main(String[] args) {
        int arr[]={10,78,54,67,23,15,16};
        int n=arr.length;
        System.out.println("Array Before Sort:");
        print(arr,n);
        mergeSort(arr,0,n-1);
        System.out.println("\nArray After Sort:");
        print(arr,n);
    }
}
