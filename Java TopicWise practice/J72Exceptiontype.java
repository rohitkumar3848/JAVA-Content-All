public class J72Exceptiontype {
    public static void main(String [] args)
    {
        String s=null;
        try{
            System.out.println(s.toUpperCase());
        }
        catch(NullPointerException n){
            System.out.println(n);
            System.out.println("NUll Pointer can't casted");
        }
    } 
}
