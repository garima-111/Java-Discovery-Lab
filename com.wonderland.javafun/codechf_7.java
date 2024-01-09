/*Task
Write a program which does the following

Take input for two integer variables a & b
Output "Coding is Fun!" to the console if a is greater than b.
*/
import java.util.Scanner;

class Codechef
{
    public static void main (String[] args)
    {
        // your code goes here
        Scanner read = new Scanner(System.in);
        int a = read.nextInt();
        int b = read.nextInt();
        if (a > b){
            System.out.print("Coding is Fun!");
        }
    }
}