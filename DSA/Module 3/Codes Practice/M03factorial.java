public class M03factorial{
    public static int factorial(int num){
        int res;
        if(num<=1){
            return 1;
        }
        else{
            res=num*factorial(num-1);
        }
        return res;
    }
    public static void main(String[] args) {
        int fact=factorial(5);
        System.out.println("The factorial is ::"+fact);
    }
}