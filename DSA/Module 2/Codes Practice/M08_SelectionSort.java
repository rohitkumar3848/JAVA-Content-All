//Time Complexity:O(n*n)
//Space Complexity:O(1)
public class M08_SelectionSort {
    public static void selectionSort(int arr[]){
        int curr_idx;
        for(int i=0;i<arr.length;i++){
            curr_idx=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[curr_idx]>arr[j]){
                    curr_idx=j;
                }
            }
            if(curr_idx!=i){
                int temp=arr[curr_idx];
                arr[curr_idx]=arr[i];
                arr[i]=temp;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={4,2,2,5,2,6,1};
        selectionSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
