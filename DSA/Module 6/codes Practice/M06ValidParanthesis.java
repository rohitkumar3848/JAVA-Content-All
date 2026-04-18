import java.util.Scanner;
import java.util.Stack;
public class M06ValidParanthesis{
    public static boolean checkValid(String s){
        char[] ch=s.toCharArray();
        Stack<Character> s1=new Stack<>();
        for(char ele:ch){
            if(ele=='{' || ele=='[' || ele=='('){
                s1.push(ele);
                continue;
            }
            else if(s1.empty()){
                return false;
            }
            char ch1=s1.pop();
            if(ch1=='}' && ele!='{'){
                return false;
            }
            else if(ch1==')' && ele!='('){
                return false;
            }
            else if(ch1==']' && ele!='['){
                return false;
            }
        }
        if(s1.empty()){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        if(checkValid(s)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}