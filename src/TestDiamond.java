import java.util.Scanner;

/**
 * Created by user on 7/8/2016.
 */
class Diamond{
    int num;
    void printDiamond()
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
        n=n-4;
        for(int i=1;i<num;i++)
        {
            for(int k=1;k<=i;k++)
            {
                System.out.print(" ");
            }
            for(int j=n;j>0;j--) {
                System.out.print("*");
            }

            System.out.print("\n");
            n=n-2;
        }

    }
}
public class TestDiamond {
    public static void main(String[] args)
    {
        Diamond d=new Diamond();
        System.out.println("Enter a number(n): ");
        Scanner s=new Scanner(System.in);
        d.num=s.nextInt();
        d.printDiamond();
    }
}
