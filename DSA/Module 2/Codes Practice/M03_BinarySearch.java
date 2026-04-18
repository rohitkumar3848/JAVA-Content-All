//Time Complexity:O(log(n))
//Space Complexity:O(1)
public class M03_BinarySearch {
    public static int binarySearch(int arr[],int x){
        int low=0;
        int a=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==x){
                System.out.println(a);
                return mid;
            }
            else if(arr[mid]>x){
                a++;
                high=mid-1;
            }
            else{
                a++;
                low=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={5,6,77,88,99};
        int x=binarySearch(arr,88);
        if(x>0){
            System.out.println("The element 5 is at : "+x);
        }
        else{
            System.out.println("The element is not present in the array");
        }
    }
}
