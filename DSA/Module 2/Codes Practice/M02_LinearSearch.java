//Time Complexity:O(n)
//Space Complexity:O(1)
public class M02_LinearSearch{ 
    public static int linearSearch(int arr[],int x){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                return i;
            }
        }
        return-1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int x=linearSearch(arr,3);
        System.out.println("The element 3 is at : "+x);
    }
}