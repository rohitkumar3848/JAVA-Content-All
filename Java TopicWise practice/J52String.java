public class J52String {
    public static void main(String[] args)
    {
        //Using Predefined classes-->StringBuffer and StringBuilder
        StringBuffer s1=new StringBuffer("Rohit Kumar");
        System.out.println(s1.reverse());
        StringBuilder s2=new StringBuilder("Rohit Kumar");
        System.out.println(s2.reverse());
        //Without Using Methods-->
        int l;
        String s3="Kumar";
        String s4="";
        l=s3.length();
        for(int i=l-1;i>=0;i--)
        {
            s4+=s3.charAt(i);
        } 
        System.out.println(s4);
    }
}
