import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the staircase function below.
    static void staircase(int n) {

        for(int i=1; i<=n; i++){
            for(int j=i; j<n; j++){
                System.out.print(" ");
            }
            for(int k=n-1-i; k<n-1;k++){
                System.out.print("#");
            }
            System.out.print("\n");
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}