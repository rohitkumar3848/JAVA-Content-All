/*Package-->A java package is a group of similiar types of classes,interfaces and subpackages.
It is two types-->
1.Built in types-->                                2.User Defined Package-->
    java.lang(System.class,String.class)                1.Package P1;
    java.util(ArrayList.class,Map.class)                2.Package add;
    java.io                                             3.Package my pack;
    java.applet
    java.awt(Button.class)
    java.net
    java.SQL

    Using a java Package-->
    1.import java.lang.*;(import evrything from java.lang)
    2.import java.lang.String(Import String from java.lang)
    3.s=new Java.lang.string("harry");(Use without importing)

    Acess Pacakge from another pacakge
    1.import pacakge.*;//class and interfaces is acessible except subclasses
    2.import package.classname;//only declred class of package is acessbile
    3.full qualified name

    Creating a java Package-->
    javac J87Package.java //creates J87Package.class
    java -d.J87Package.java //creates a pacakge folder we can keep adding classes to a
    pacakge like this.
    We can create inner pacakge by adding "pacakge.inner" as pacakge name.
    These package once created can be used by other classes.
    Compile--> java -d.J87Package.java
               java mypack.J87Packge

    Acess Modifiers-->

    Modifier  ||  class  ||  package  ||  subclass  || world
    Public    ||   Yes   ||    Yes    ||    Yes     || Yes
    Protected ||   Yes   ||    Yes    ||    Yes     || NO
    Default   ||   Yes   ||    Yes    ||    NO      || NO
    Private   ||   Yes   ||    NO     ||    NO      || NO

    Note -->If you import a java pacakge then clases and interfcaes are imported except subpackge.
         we should import java sub packge seprately
    Package-->Package inside package is called the subpacakge.

    Advantage-->
    1.Reusuability
    2.Security
    3.Fast Searching
    4.Naming conflecting
    5.Hiding

    Dis-advantage-->
    1.We can't pass the parameter to the pacakge
 */
import java.lang.*;
import java.io.*;
import java.util.Scanner;;
public class J87BuiltDefinedPackage
{
     public static void main(String[] args) {
          try{
               File r=new File("D:\\java\\java topics practice\\file2.txt");
               Scanner sc=new Scanner(r);
               while(sc.hasNextLine())
               {
                    System.out.println(sc.nextLine());
               }
          }
          catch(IOException e)
          {
               System.out.println(e);
               System.out.println("Exception handled...");
          }
     }
}    