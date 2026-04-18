public class M07SearchEleRotateSorted {
    public static int binarySearch(int arr[],int l,int h,int key){
        if(h<l){
            return -1;
        }
        int m=l+(h-l)/2;
        if(arr[m]==key){
            return m;
        }
        if(arr[m]<key){
            return binarySearch(arr, m+1, h, key);
        }
        else{
            return binarySearch(arr, l, m-1, key);
        }
    }
    public static int findPivot(int arr[],int l,int h){
        if(h<l){
            return -1;
        }
        int m=l+(h-l)/2;
        if(m<h &&arr[m]>arr[m+1]){
            return m;
        }
        if(m>l && arr[m-1]>arr[m]){
            return m-1;
        }
        if(arr[l]>=arr[m]){
            return findPivot(arr, l, m-1);
        }
        else{
            return findPivot(arr, m+1, h);
        }
    }
    public static int  search(int arr[],int l,int h,int key){
        int pivot=findPivot(arr,l,h);
        if(pivot==-1){
            return binarySearch(arr,l,h,key);
        }
        if(arr[pivot]==key){
            return pivot;
        }
        if(arr[l]<=key){
            return binarySearch(arr,l,pivot-1,key);
        }
        else{
            return binarySearch(arr,pivot+1,h,key);
        }
    }
    public static void main(String[] args) {
        int arr[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        int key = 5;
        int n=arr.length;
        int ans=search(arr,0,n,key);
        System.out.println("The element is present at: "+ans);
    }
}
