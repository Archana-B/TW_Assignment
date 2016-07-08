import java.util.Scanner;

/**
 * Created by user on 7/8/2016.
 */
class IsocelesTriangle{
    int num;
    public void printTriangle()
    {
        int n=1;

        for(int i=0;i<num;i++)
        {
           for(int k=1;k<(num-i);k++)
            {
             System.out.print(" ");
            }
            for(int j=n;j>0;j--) {
                System.out.print("*");
            }

            System.out.print("\n");
            n=n+2;
        }
    }
}
public class TestTriangle {
    public static void main(String[] args)
    {
        IsocelesTriangle tri=new IsocelesTriangle();
        System.out.println("Enter a number(n): ");
        Scanner s=new Scanner(System.in);
        tri.num=s.nextInt();
        tri.printTriangle();
    }
}
