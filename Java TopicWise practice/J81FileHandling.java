import java.io.*;
public class J81FileHandling {
    public static void main(String [] args) throws IOException
    {
        File f=new File("D:\\java\\java topics practice\\file1.txt");
            if(f.createNewFile())
            {
                System.out.println("File Sucessfully Created");
            }
            else{
                System.out.println("File Already Exits");
            }
        /*try{
            if(f.createNewFile())
            {
                System.out.println("File Sucessfully Created");
            }
            else{
                System.out.println("File Already Exits");
            }
        }*/
        /*catch(IOException e)
        {
            System.out.println(e);
            System.out.println("Exception Handled");
        }*/
    }
}
