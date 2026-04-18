public class M06SumOfdigit {
    public static int SumOfDigit(int num){
        if(num==0){
            return 0;
        }
        else{
            return num%10+SumOfDigit(num/10);
        }
    }
    public static void main(String[] args) {
        System.out.print("The sum of digits of number 789 is:"+SumOfDigit(789));
    }
}
