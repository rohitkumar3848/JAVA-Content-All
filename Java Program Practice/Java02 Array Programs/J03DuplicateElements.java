import java.util.Scanner;
public class J03DuplicateElements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int a[]=new int[size];
        for(int i=0;i<size;i++)
        {
            a[i]=sc.nextInt();
        }
        //case 1 : If the elements reapeated only 1 times:
        /*for(int i=0; i<size;i++)
        {
            for(int j=i+1;j<size;j++)
            {
                if(a[i]==a[j])
                {
                    System.out.println(a[i]);
                }
            }
        }*/
        //case 2: If the element reapeated more than 2 times:
        for(int i=0;i<size;i++)
        {
            int x=a[i];
            int count=0;
            if(x==-1)
            {
                continue;
            }
            for(int j=i+1;j<size;j++)
            {
                if(x==a[j])
                {
                    count++;
                    a[j]=-1;
                }
            }
            if(count>0)
            {   
                System.out.println(a[i]+" ");
            }
        }
    }
}
