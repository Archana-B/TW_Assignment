/**
 * Created by user on 7/8/2016.
 */
import java.util.*;
public class PrimeFactors {
    ArrayList<Integer> generate(int n)
    {
        ArrayList<Integer> factors=new ArrayList<Integer>();
        int i=2;
        while(n>1)
        {
            if(n%i == 0)
            {
                factors.add(i);
                n=n/i;
            }
            else
                i++;
        }
     return factors;
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n;
        System.out.print("Enter a Number : ");
        n=s.nextInt();
        PrimeFactors pf=new PrimeFactors();
        ArrayList<Integer> list=pf.generate(n);
        System.out.print("The Prime Factors of "+n+" are : ");
        for(int k:list)
            System.out.print(k+" ");

    }
}
