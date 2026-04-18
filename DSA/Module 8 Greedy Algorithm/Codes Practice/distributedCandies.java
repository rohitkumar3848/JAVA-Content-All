public class distributedCandies {
    public static int DC(int arr[]){
        int n=arr.length;
        int dp[]=new int[n];
        for(int i=0;i<n;i++){
            dp[i]=1;
        }
        for(int i=1;i<n;i++){
            if(arr[i]>arr[i-1]){
                dp[i]=arr[i-1]+1;
            }
        }
        for(int i=n-2;i>=0;i--){
            if(arr[i]>arr[i+1] && dp[i]<=dp[i-1]){
                dp[i]=dp[i+1]+1;
            }
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=dp[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[]={1,5,3,1};
        System.out.println(DC(arr));
    }
}
