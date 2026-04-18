import java.io.*;
public class J86copyFile {
    public static void main(String [] args)throws IOException
    {
        FileInputStream f=new FileInputStream("D:\\java\\java topics practice\\file1.txt");
        FileOutputStream r=new FileOutputStream("D:\\java\\java topics practice\\file2.txt");
        int i;
        while((i=f.read())!=-1)
        {
            r.write((char)i);
        }
            System.out.println("Data Copied Sucessfully");
    }
}
