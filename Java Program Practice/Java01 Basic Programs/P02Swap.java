public class P02Swap {
    
        public static void main(String [] args)
        {
            int a=3;
            int b=4;
            int temp=a;
            System.out.println("Before Swapping:"+a+" "+b);
            a=b;
            b=temp;
            System.out.println("After Swapping:"+a+" "+b);            
        }
}
