public class M02PrintPermutation {
    public static String swap(String str,int i,int j){
        char s[]=str.toCharArray();
        char temp=s[i];
        s[i]=s[j];
        s[j]=temp;
        return String.valueOf(s);
    }
    public static void printPermutation(String str,int i){
        if(i==str.length()){
            System.out.print(str+" ");
            return ;
        }
        for(int j=i;j<str.length();j++){
            str=swap(str, i, j);
            printPermutation(str, i+1);
            str=swap(str, j, i);
        }
    }
    public static void main(String[] args) {
        //swap("ABC",0,1);
        printPermutation("ABC",0);
    }
}
