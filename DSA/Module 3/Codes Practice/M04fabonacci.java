public class M04fabonacci {
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
        for(int i=0;i<=5;i++){
            System.out.println(fib(i)+" ");
        }
    }
}
