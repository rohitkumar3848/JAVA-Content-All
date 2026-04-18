import javax.swing.border.EmptyBorder;

/* Checked Exception-->It checked by compiler for smoth execution of program of runtime.
            It is commonly ocuured exception so compiler takes very much care about these exception.
            It doesn't handle the exception it provides a warning.
    Unchecked Exception-->It doesn't checked by compiler it checked by JVM at runtime.
            It rarely occured exception. So,the compiler doesn't take very much care about these exceptions.
    #Finalize method-->it is a method which is available in object super class.
        The purpose of finalize method is to realease the resources that is allocated by unused object,
        before removing unused object by garbage collector.
            */
class object{
    protected finalize()
    {
        empty();
    }
}
public class J75CheckedAndUncheckedfinalizemethod {
    
}
