public class M0countStairs {
    public static int  fib(int num){
        int res;
        if(num==0 || num==1){
            return num;
        }
        else{
            res=fib(num-1)+fib(num-2);
        }
        return res;
    }
    public static void main(String[] args) {
        int num=5;
        System.out.println("The number of stairs according to specific location");
        for(int i=1;i<=5;i++){
            System.out.println(i+"-->"+fib(i+1)+" ");
        }
    }
}
