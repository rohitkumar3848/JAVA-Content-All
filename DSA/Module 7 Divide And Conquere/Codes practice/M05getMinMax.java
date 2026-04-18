public class M05getMinMax {
    static class Pair{
        int min;
        int max;
    }
    public static Pair getMinMax(int arr[],int i,int j){
        Pair minmax=new Pair();
        Pair leftminmax=new Pair();
        Pair rightminmax=new Pair();
        
        if(i==j){
            minmax.min=arr[i];
            minmax.max=arr[i];
            return minmax;
        }
        else if(i == j-1){
            if(arr[i] < arr[j]){
                minmax.min = arr[i];
                minmax.max = arr[j];
            }
            else{
                minmax.min = arr[j];
                minmax.max = arr[i];
            }
            return minmax;
        }
        else{
            // 1. Divide - c
            int mid = i + (j-i)/2;
            // 2. Conquer
            // left side subtree - T(n/2)
            // minmaxLeft = min(left), max(left)
            leftminmax = getMinMax(arr, i, mid);
            // right side subtree - T(n/2)
            // minmaxRight = min(right), max(right)
            rightminmax = getMinMax(arr, mid+1, j);
            // 3. Combine - c
            //  Compared the minimum values of left and right 
            if(leftminmax.min < rightminmax.min){
                minmax.min = leftminmax.min;
            }
            else{
                minmax.min = rightminmax.min;
            }

            //  Compared the maximum values of left and right 
            if(leftminmax.max < rightminmax.max){
                minmax.max = rightminmax.max;
            }
            else{
                minmax.max = leftminmax.max;
            }

            return minmax;
        }


    }
    public static void main(String[] args) {
        int[] arr = {50, 45, 11, 9, 15, 75, 89, 97};
        int n = arr.length;

        // function calling
        Pair minmax = getMinMax(arr, 0, n-1);

        System.out.println("The smallest element in an array is:"+minmax.min);
        System.out.println("The largest element in an array is:"+minmax.max);
    }

    
}
