package Assignments;

import java.util.Scanner;

public class Main
{
    Scanner sc = new Scanner(System.in);

    //function to checkPalindrome

    public void checkPalindrome()
    {
        System.out.println("Enter the Number");
        int y=sc.nextInt();

        int r,sum=0,temp;
        temp=y;

        while(y>0)
        {
            r=y%10;
            sum=(sum*10)+r;
            y=y/10;
        }

        if(temp==sum)
            System.out.println("No is Palindrome ");
        else
            System.out.println("No is not Palindrome");
    }



    //function to printPattern

    public void printPattern()
    {

        System.out.println("Enter the pattern size");
        int x=sc.nextInt();

        for (int i=0;i<x;i++)
        {

            for(int j=x ; j>i;j--)
            {
                System.out.print("*");
            }

            System.out.println();
        }

    }



    //function to check no is prime or not

    public void checkPrimeNumber()
    {
        System.out.println("Enter the number");
        int z=sc.nextInt();
        int temp=0;
        for(int i=2; i<=z-1;i++)
        {
            if(z%i==0)
            {
                temp++;
            }
        }
        if (temp>0)
        {
            System.out.println("No is not Prime");
        }
        else
        {
            System.out.println("No is Prime");
        }


    }



    // function to print Fibonacci Series

    public void printFibonacciSeries()
    {
        //initialize the first and second value as 0,1 respectively.

        System.out.println("Enter the Fibonacci series size");
        int n=sc.nextInt();

        int first = 0, second = 1;
        System.out.print(first+",");
        System.out.print(second+",");



for (int i=0;i<n-2;i++)
{
    int sum = first + second;
    System.out.print(sum + ",");
    first = second;
    second = sum;
}
        System.out.println("-------");

    }


    //main method which contains switch and do while loop

    public static void main(String[] args)
    {
        Main obj = new Main();
        int choice;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"

                    + "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

                    + "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

            System.out.println();
            choice = sc.nextInt();

            switch (choice) {

                case 0:
                    choice = 0;
                    break;

                    case 1:
                    {
                        obj.checkPalindrome();
                    }
                    break;

                case 2:
                {
                    obj.printPattern();
                }
                break;

                case 3:
                {
                    obj.checkPrimeNumber();
                }
                break;

                case 4:
                {
                    obj.printFibonacciSeries();
                }
                break;

                default:
                    System.out.println("Invalid choice. Enter a valid no.\n");

            }


        } while (choice != 0);

        System.out.println("Exited Successfully!!!");

        sc.close();

    }

}
