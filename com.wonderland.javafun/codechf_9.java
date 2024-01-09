/*Task
Write a program which does the following

Create integer variables r and k - the weight of friends Ram and Karan
Initialise r and k as r = 24 and k = 32
Compute and output the following to the console
"Ram is heavier than Karan" if r is greater than k
"Karan is heavier than Ram" if r is lesser than k
"Ram & Karan have the same weight!" for any remaining conditions.
Update the values of r and k as r = 78 and k = 78`
Compute and output the following to the console
"Ram is heavier than Karan" if r is greater than k
"Karan is heavier than Ram" if r is lesser than k
"Ram & Karan have the same weight!" for any remaining conditions.*/
import java.util.*;

class Codechef
{
    public static void main (String[] args)
    {
        int r;
        int k;
        r = 24;
        k = 32;
        if (r > k) {
            System.out.println("Ram is heavier than Karan.");
        } else if (r < k) {
            System.out.println("Karan is heavier than Ram");
        } else {
            System.out.println("Ram & Karan have the same weight!");
        }

        r = 78;
        k = 78;
        if (r > k) {
            System.out.println("Ram is heavier than Karan.");
        } else if (r < k) {
            System.out.println("Karan is heavier than Ram");
        } else {
            System.out.println("Ram & Karan have the same weight!");
        }
    }
}