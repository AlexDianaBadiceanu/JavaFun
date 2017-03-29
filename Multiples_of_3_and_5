import java.io.*;
import java.util.*;
/**
If we list all the natural numbers below 10 that are multiples of 3 or 5 , we get 3,5,6  and 9. The sum of these multiples is23 .

Find the sum of all the multiples of 3 or 5 below .

Input Format

First line contains T that denotes the number of test cases. This is followed by T lines, each containing an integer, N .

Constraints
1<=T<=10^5
1<=N<=10^9
Output Format

For each test case, print an integer that denotes the sum of all the multiples of 3 or 5 below N.

Sample Input 0

2
10
100
Sample Output 0

23
2318

 */
public class Multiples_of_3_and_5
{  public static void main(String[] args) {
        //use a scanner to read from stdin
        Scanner scan = new Scanner(System.in);

        //declare variables T and N
        int T;
        long N;

        //get the number of inputs
        T = scan.nextInt();

        //for each input compute the required sum
        for(int i=0; i<T; i++){
            N = scan.nextInt();
            N--;
            //add up multiples of 3
            long sum = 3*(N/3)*(N/3+1)/2;  
            //add up multiples of 5
            sum = sum + 5*(N/5)*(N/5+1)/2;
            //substract multiples of 15 (were added twice)
            sum = sum - 15*(N/15)*(N/15+1)/2;
            
            System.out.println(sum);
        }
    }
}

