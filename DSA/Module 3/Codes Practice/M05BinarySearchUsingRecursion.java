public class M05BinarySearchUsingRecursion {
    public static int  binarysearch(int arr[],int low,int high,int num){
        int mid=low+(high-low)/2;
        int res=-1;
        while(low<=high){
            if(arr[mid]==num){
                return mid;
            }
            else if(arr[mid]<num){
                return binarysearch(arr, mid+1, high, num);
            }
            else{
                return binarysearch(arr, low, mid-1, num);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int low=0;
        int high=arr.length-1;
       int x= binarysearch(arr,low,high,4);
       if(x!=-1){
        System.out.println("The number 4 is present at:"+x);
       }
       else{
        System.out.println("The number 4 is not present in array");
       }
    }
}
