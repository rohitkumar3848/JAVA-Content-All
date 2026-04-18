import java.math.BigInteger;
import java.util.Scanner;

public class M03power {
    //Brute force approach-->
    public static int power(int a,int b){
        int res=1;
        if(b==0){
            return 1;
        }
        else{
            res=a*power(a, b-1);
        }
        return res;
    }
    //Optimized Aaproach
    public static int power1(int a,int b){
        int mid;
        int fianlResult;
        int res;
        if(b==0){
            return 1;
        }
        else{
            mid=b/2;
            res=power(a,mid);
            fianlResult=res*res;
        }
        if(b%2==0){
            return fianlResult; 
        }
        else{
            return a*fianlResult;
        }

    }
    // For Big Power
    public static BigInteger power2(BigInteger a,int b){
        BigInteger mid,fianlResult,res;
        if(b==1){
            return a;
        }
        else{
            res=power2(a,b/2);
            fianlResult=res.multiply(res);
            if(b%2==0){
                return fianlResult;
            }
            else{
                return a.multiply(fianlResult);
            }
        }
        
    }
    public static void main(String[] args) {
       System.out.println(power(2,3)) ;
       System.out.println(power1(2,6)) ;
       Scanner sc=new Scanner(System.in);
       BigInteger a=sc.nextBigInteger();
       int b=sc.nextInt();
       System.out.println(power2(a, b));

    }
}
