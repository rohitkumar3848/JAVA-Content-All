import java.util.Scanner;

public class P12Patterns {
    /*
    public static void rightSidePattern(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }*/
    public static void leftSidePattern(int n)
    {
        for(int i=1;i<=n;i++)
        {
            //space
            for(int j=i;j<=n;j++)
            {
                System.out.print(" ");
            }
            //star
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    /* 
    public static void rightSidePatternReverse(int n)
    {
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }*/
    ///OR---->
   /*  public static void rightSidePatternReverse(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=(n-i+1);j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    } */
    /*
    public static void leftSidePatternReverse(int n)
    {
        for(int i=n;i>=1;i--)
        {
            //space
            for(int j=1;j<=(n-i);j++)
            {
                System.out.print(" ");
            }
            //star
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }*/

    public static void hollowPattern(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==0||j==n-1||i==(n-1)/2||j==0)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        
        }
    }
        public static void CrossX(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==0||j==n-1||j==0||i==(n-1) || i==j || (i+j)==(n-1)||(i+j)==(n-1)/2||(i-j)==(n-1)/2||(j-i)==(n-1)/2||(i+j)==(n-1)/2+(n-1)) 
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        
        }
    }
    public static void CrossFill(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==0 && j<=(n-1)/2 || j==0 && i<=(n-1)/2 || (i+j)<=(n-1)/2 ||
                  i==0 && j>=(n-1)/2 || j==n-1 && i<=(n-1)/2 || (j-i)>=(n-1)/2 ||
                  j==0 && i>=(n-1)/2 || i==n-1 && j<=(n-1)/2 || (i-j)>=(n-1)/2 ||
                  j==n-1 && i>=(n-1)/2 || i==n-1 && j>=(n-1)/2 || (j+i)>=(n-1)/2+(n-1)
                ) 
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        
        }
    }
        public static void Apattern(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==0 && j>0 && j<(n-1)/2 ||j==0 && i>0 || j==(n-1)/2 && i>0 || i==(n-1)/2 && j<(n-1)/2 || j==(n-1)/2 && i>0)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        
        }
        public static void Bpattern(int n)
        {
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    if(i==0 && j<(n-1)/2 || j==0 || j==(n-1)/2 && i>0 && i<n-1 || i==(n-1) && j<(n-1)/2)
                    {
                        System.out.print("*");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            
            }
    }
    public static void main(String [] args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        //rightSidePattern(n);
        //rightSidePatternReverse(n);
        //leftSidePattern(n);
        //leftSidePatternReverse(n);
        //hollowPattern(n);
        //Apattern(n);
        //Bpattern(n);
        //CrossX(n);
        CrossFill(n);
    }
}
