import java.util.*;
import java.util.Stack;
public class M04MinSwaps {
    public static int countSwaps(String s){
        int l_Count=0;
        int r_Count=0;
        int swap=0;
        int unbalance=0;
        char ch[]=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='['){
                l_Count++;
                if(unbalance>0){
                    swap+=unbalance;
                    unbalance--;
                }
            }
            else{
                r_Count++;
                unbalance=r_Count-l_Count;
            }
        }
        return swap;
    }
    public static int countSwaps2(String s){
        Stack<Character> s1=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='['){
                s1.push(s.charAt(i));
            }
            else if(!s1.empty()){
                s1.pop();
            }
        }
        System.out.println("Size:"+s1.size());
        return (s1.size()+1)/2;
    }
    public static void main(String[] args) {
        String s="]]][[[";
        int c1=countSwaps(s);
        System.out.println(c1);
        int c2=countSwaps2(s);
        System.out.println(c2);
    }
}
