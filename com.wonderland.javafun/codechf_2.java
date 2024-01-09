/*
Write a program for the following

Declare an integer variable num.
Read the value from the user.
Print it's square.*/

import java.util.Scanner;

class Codechef
{
    public static void main (String[] args)
    {
        // update your code below this line

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println((int)(Math.pow(num,2)));


    }
}