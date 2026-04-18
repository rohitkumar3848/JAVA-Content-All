public class M09BinarySearch {
    public static boolean binarySearch(int matrix[][],int target){
        int m=matrix.length;
        int mididx;
        int row;
        int col;
        int midele;
        if(m==0){
            return false;
        }
        int n=matrix[0].length;
        int low=0;
        int high=m*n-1;
        while(low<=high){
            mididx=low+(high-low)/2;
            row=mididx/n;
            col=mididx%n;
            midele=matrix[row][col];
            if(midele==target){
                System.out.print("At index "+mididx+" ");
                return true;
            }
            else {
                    if(target<midele){
                    high=mididx-1;
                }
                else{
                    low=mididx+1;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[][]={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16,17}
        };
        if(binarySearch(arr,15)){
            System.out.println("the element is 15 present in array");
        }
        else{
            System.out.println("The element 15 is not present in array");
        }
        
    }
}
