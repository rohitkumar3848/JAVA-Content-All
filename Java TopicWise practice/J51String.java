/*String-->It is an object that stores sequence of charcters,which may contain alphanumeric values.
It is immutable in nature.
It is perform concat,equal,length methods.
Two types of ways to create string object-->
1.Using String Literal
2.using New keyword
 */
public class J51String {
    public static void main(String [] args)
    {
        //Using String Literal-->
        String s1="Rohit";
        System.out.println(s1);
        String b1="Rohit";
        System.out.println(b1);
        //Basically string is immutable but we can mutable in new copy
        //s1.concat("kumar");can't mutable bcz it is confuse for which object should be mutable either b1 or s1;
        s1=s1.concat("Kumar");
        System.out.println(s1);
        
        //Using new Keyowrd-->
        String s2=new String("Rohit");
        System.out.println(s1);
        String b2=new String("Rohit");
        System.out.println(b2);
        //Basically string is immutable but we can mutable in new copy
        //s2.concat("kumar");can't mutable bcz it is confuse for which object should be mutable either b2 or s2;
        s2=s2.concat("Kumar");
        System.out.println(s2);
        //Equals Method-->
        String a="Rohit";
        String b=new String("Rohit");
        if(a.equals(b))//But if(a==b)-->doesn't comapare with string literal and new keyword.
        {
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        //String Methods-->toLowecase,toUppercase,trim,equal,isempty,length,replace,charAt,indexOf..
        String c1="Rohit";
        String c2="Kumar";
        System.out.println(c1.toLowerCase());
        System.out.println(c1.toUpperCase());

        System.out.println(c1.concat(c2));
        System.out.println(c1.length());

        String d="    Rohit Kumar    ";
        System.out.println(d.trim());
        System.out.println((d.isEmpty()));

        System.out.println(c1.charAt(2));
        System.out.println((c1.indexOf('t')));
        System.out.println(c1.replace('t','T'));
    }
    
}
