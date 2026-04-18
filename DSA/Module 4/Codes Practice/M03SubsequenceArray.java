import java.util.*;
public class M03SubsequenceArray{
    public static void getSubSequence(int arr[],int index,ArrayList<Integer> temp){
        if(index==arr.length){
            if(temp.size()>0){
                System.out.println(temp);
            }
            return ;
        }
        getSubSequence(arr, index+1, temp);
        temp.add(arr[index]);
        getSubSequence(arr, index+1, temp);
        temp.remove(temp.size()-1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        getSubSequence(arr, 0,new ArrayList<Integer>());
    }
}