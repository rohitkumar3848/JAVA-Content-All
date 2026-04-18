//Time Complexity:O(log(n))
//Space Complexity:O(1)
public class M04_FirstOccurence {
    public static int binarySearch(int arr[],int x){
        int low=0;
        int high=arr.length-1;
        int res=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==x){
                res=mid;
                high=mid-1;
            }
            else if(arr[mid]>x){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[]={1,2,2,3,3};
        int x=binarySearch(arr,2);
        if(x>0){
            System.out.println("The first occurrnce of elment 2 is : "+x);
        }
        else{
            System.out.println("The element is not present in the array");
        }
    }
}
