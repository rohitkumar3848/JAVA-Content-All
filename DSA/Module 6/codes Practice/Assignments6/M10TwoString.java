package Assignments6;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map;

public class M10TwoString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first String");
        String str1=sc.nextLine();
        System.out.println("Enter the second String");
        String str2=sc.nextLine();
        HashMap<Character,Integer> map1=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();
        for(int i=0;i<str1.length();i++){
            char ch=str1.charAt(i);
            if(map1.containsKey(ch)){
                map1.put(ch,map1.get(ch)+1);
            }
            else{
                map1.put(ch, 1);
            }
        }
        for(int i=0;i<str2.length();i++){
            char ch=str2.charAt(i);
            if(map2.containsKey(ch)){
                map2.put(ch,map2.get(ch)+1);
            }
            else{
                map2.put(ch, 1);
            }
        }
        boolean check=true;
        for(Map.Entry<Character,Integer> e : map1.entrySet()){
            if(!map2.containsKey(e.getKey()) || e.getValue()>map2.get(e.getKey())){
                check=false;
                break;
            }
        }
        if(check==true){
            System.out.println(check);
        }
        else{
            System.out.println(check);
        }
        
    }
}
