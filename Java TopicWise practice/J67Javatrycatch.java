/*try--->Whenever we want a statement and if the statement is error suspecting or risky code then put that
code inside a try block.
catch-->The main purpose of catch block is to handle the exception which are throws by 
try block.
It will not executed if their is no excception inside the try block.

 */
public class J67Javatrycatch {
    public static void main(String [] args){
        String s="ankush";
        try{
            int a=Integer.parseInt(s);
            System.out.println(a);
        }
        catch(NumberFormatException n){
            System.out.println("String "+s+" can't be converted  to integer");
        }
    }
    
}
