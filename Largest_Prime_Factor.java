
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


/*The prime factors of  13195 are 5,7,13 and 29.

What is the largest prime factor of a given number N?

Input Format

First line contains T, the number of test cases. This is followed by  lines each containing an integer N.


Output Format

For each test case, display the largest prime factor of N.

Sample Input 0

2
10
17
Sample Output 0

5
17*/

public class Solution {

    public static void main(String[] args) {
        //use a scanner to read from stdin
        Scanner scan = new Scanner(System.in);

        //declare variables T and N
        int T;
        long  N;

        //get the number of inputs
        T = scan.nextInt();

        //for each input compute the required sum
        for(int i=0; i<T; i++){
            N = scan.nextLong();
            System.out.println(isPrime(N));

        }
    }

    public static long isPrime(  long N){
        while(N%2==0){
            N=N/2;
            if(N==1) return 2;
        }

        
        long n =N/2 -(N/2+1)%2;

        while (n>=Math.sqrt(N)){
            if (N%n==0){
                return isPrime(n);
            }else{
                n=n-2;
            }
        }
        return N;
    }
}
