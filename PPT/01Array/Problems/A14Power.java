
class A14Power {
    public static double myPow(double x, double n) {
        if(n==0){
            return 1;
        }
        if(n==1){
            return x;
        }
        if(n<0){
            x=1/x;
            n=-n;
            //myPow(x,n);
        }
        if (x < -10000 || x > 10000) {
            return 0;
        }
        // double res=myPow(x,n/2);
        // double finalres=res*res;
        // if(n%2!=0){
        //     return x*finalres;
        // }
        // return finalres;
        if(n%2==0){
            return myPow(x*x,n/2);
        }
        else{
            return x*myPow(x,n-1);
        }
    }
    public static void main(String[] args) {
        double x = 2.00000, n = 10;
        System.out.println(myPow(x,n));
    }
}