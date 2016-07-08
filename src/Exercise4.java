import java.util.*;

/**
 * Created by user on 7/8/2016.
 */
public class Exercise4 {

    public static void main(String[] args)
    {
        int i;
        System.out.println("Enter a number(n): ");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(i=0;i<n;i++) {
            int j=i;
            while(j>=0) {
                System.out.print("*");
                j--;
            }
            System.out.print("\n");
        }
    }
}
