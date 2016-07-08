/**
 * Created by user on 7/8/2016.
 */
public class NumberGame {
    public void FizzBuzz(int n)
    {
        for(int i=1;i<=n;i++)
        {
            if((i%3==0)&&(i%5==0))
                System.out.println("FizzBuzz");
            else if(i%3==0)
                System.out.println("Fizz");
            else if(i%5==0)
                System.out.println("Buzz");
            else
                System.out.println(i);
        }

    }
    public static void main(String[] args)
    {
        NumberGame play=new NumberGame();
        play.FizzBuzz(100);
    }
}
