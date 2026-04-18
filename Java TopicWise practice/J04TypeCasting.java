public class J04TypeCasting {
    public static void main(String [] args) 
    {
     int a=10;
     double b=a;//Implicit Type Casting (Automatic Converted int datatype in double datatype)
     double c=10.5;
     int d=(int)c;//Explicit Type Casting (By default the compiler,doesn't allow the explcit typecasting)
     System.out.println(b);
     System.out.println(d);   
    }
    
}
