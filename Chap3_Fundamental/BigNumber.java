package Chap3_Fundamental;
import java.math.*;
import java.util.*;

public class BigNumber
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("How many numbesr do you need to draw? ");
        int k = in.nextInt();

        System.out.println("What is the highest number you can draw? ");
        int n =in.nextInt();

        BigInteger lotteryOdds = BigInteger.valueOf(1);

        for(int i=1;i <=k;++i)
          lotteryOdds = lotteryOdds.multiply(BigInteger.valueOf(n-i+1)).divide(BigInteger.valueOf(i));

        System.out.println("Your odds are 1 in "+lotteryOdds+". Good luck!");
    }
}