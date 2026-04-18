import java.io.*;
public class J83fileWriter {
    public static void main(String [] args) throws IOException
    {
        FileWriter f=new FileWriter("D:\\java\\java topics practice\\file1.txt");
       try{
        f.write("Java is best programming language");
       }
       finally{
        f.close();
       }
        System.out.println("Sucessfully data wrote in the file..");
    }
}
