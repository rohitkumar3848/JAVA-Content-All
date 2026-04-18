public class M07PrintNumOfMul {
    public static void printMul(int num,int k){
        if(k==1){
            System.out.print(num+" ");
            return ;
        }
        else{
            printMul(num, k-1);
            System.out.print(num*k+" ");
        }
    }
    public static void main(String[] args) {
        printMul(4,5);
    }
}
