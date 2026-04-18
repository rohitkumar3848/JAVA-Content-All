import java.io.File;
import java.io.File;
public class J85fileRename {
    public static void main(String [] args)
    {
        File f=new File("D:\\java\\java topics practice\\file1.txt");
        File r=new File("D:\\java\\java topics practice\\file1.txt");
        if(f.exists())
        {
            System.out.println(f.renameTo(r));
        }
        else{
            System.out.println("File doesn't exits");
        }

    }
}
