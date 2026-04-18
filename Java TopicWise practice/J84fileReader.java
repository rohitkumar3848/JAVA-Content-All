import java.io.*;

public class J84fileReader {
    public static void main(String[] args) {
        try {
            FileReader f = new FileReader("D:\\java\\java topics practice\\file1.txt");
            try {
                int i;
                while ((i = f.read()) != -1) {
                    System.out.print((char) i);
                }
            } finally {
                f.close();
                System.out.println("file sucessfully read...");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
