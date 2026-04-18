public class M08PeakEle {
    public static int peakEle(int arr[],int l,int h){
        int m=l+(h-l)/2;
        if((arr[m]>=arr[m-1] || m==0)  && (arr[m]>=arr[m+1] || m==h)){
            return m;
        }
        else if(m>0 && arr[m-1]>arr[m]){
            return peakEle(arr, l, m-1);
        }
        else{
            return peakEle(arr, m+1, h);
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,8,4,6};
        int n=arr.length;
        int ans=peakEle(arr,0,n-1);
        System.out.println("The peak Element is: "+ans);
    }
}
