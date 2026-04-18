import java.util.*;
class A05kthLargest {
    public static int findKthLargest(int[] nums, int k) {
        // init heap 'the smallest element first'
        PriorityQueue<Integer> heap =
            new PriorityQueue<Integer>((n1, n2) -> n1 - n2);
 
        // keep k largest elements in the heap
        for (int n: nums) {
          heap.add(n);
          if (heap.size() > k)
            heap.remove();
        }
        // output
        return heap.remove();        
  }
  public static void main(String[] args) {
        int [] arr={3,2,1,5,6,4};
        System.out.println(findKthLargest(arr,2));
    }
}