import java.util.Scanner;

/**
 * Created by user on 7/8/2016.
 */
import java.io.*;
import java.util.*;
public class Exercise3 {
    public static void main(String[] args)
    {
        int i;
        System.out.println("Enter a number(n): ");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(i=0;i<n;i++)
            System.out.println("*");
    }
}
