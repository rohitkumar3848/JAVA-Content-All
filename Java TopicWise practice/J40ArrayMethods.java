import java.util.Arrays;
public class J40ArrayMethods {
    public static void main(String [] args)
    {
        String s[]={"C","C++","Java","PHP","SQL"};
        //toString method
        System.out.println("toString Method : "+Arrays.toString(s));
        //asList
        //They both work with Single Dimentional Array
        //Both work with printing array elements but aslist in case of integer array it returns reference of an element but in case of toString method it returns elment.
        System.out.println("asList Method : "+Arrays.asList(s));
        //deepToString:It work with multidimentional to print array elements.
        int a[][]={{10,20},{30,40}};
        System.out.println("deepToString Method : "+Arrays.deepToString(a));

    }
}
