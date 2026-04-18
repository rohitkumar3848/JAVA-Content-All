package Assignments;
import java.util.*;

import javax.sound.midi.SysexMessage;

class M08CombinationSum {
    public static void backtrack(List<List<Integer>> result,List<Integer> temp,int []candidates,int target,int start){
        if(target<0){
            return ;
        }
        else if(target==0){
            result.add(new ArrayList<>(temp));
            return ;
        }
        for(int i=start;i<candidates.length;i++){
            temp.add(candidates[i]);
            backtrack(result,temp,candidates,target-candidates[i],i);
            temp.remove(temp.size()-1);
        }
    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result=new ArrayList<>();
        backtrack(result,new ArrayList<>(),candidates,target,0);
        return result;
    }
    public static void main(String[] args) {
        int arr[]={2,3,6,7};
        System.out.println(combinationSum(arr,7));
    }
}