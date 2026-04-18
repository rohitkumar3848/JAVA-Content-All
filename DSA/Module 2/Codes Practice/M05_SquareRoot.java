//Time Complexity:O(log(n))
//Space Complexity:O(1)
public class M05_SquareRoot {
    public static int SquareRoot(int num){
        int low=0;
        int high=num;
        int res=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int val=mid*mid;
            if(val==num){
                return mid;
            }
            else if(val<=num){
                res=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int x=SquareRoot(47);
        System.out.println("The square root is :"+x);
    }
}
