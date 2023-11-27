//----------------------welcome-------------------------
package pratice_1;


import java.util.Scanner;

class day_1
{
    public static  void main(String[] arr)
    {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        int counter=1;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            {
                counter++;
            }
        }
        System.out.println(counter+1);
        for(int i=0;i<s.length();i++)
        {
            int  c=(int)s.charAt(i);
            if(c>=65 && c<=90 )
            {
                System.out.print(s.charAt(i));
            }else if(c>=97 && c<=122)
            {
                System.out.print(s.charAt(i));
            }
            else if(s.charAt(i)!=' '){
                System.out.print("");
            }else
            {
                System.out.println();
            }

        }
        scan.close();
    }
}


/*
class day_1
{
    public static void main(String[] args) {
        int n=5;
        int col_counter=((n*n)+n)/2;
        for(int i=1;i<=n;i++)
        {
            int row_counter=col_counter;
            for(int j=i;j<n;j++)
            {
                System.out.print("\t");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(row_counter-- +"\t");
            }
            System.out.println();
            col_counter-=i;
        }
    }
}

/*

class day_1
{
    public static void main(String[] args) {
        int n=5;
        int col_counter=n/n;
        for(int i=1;i<=n;i++)
        {
            int raw_counter=col_counter;
            for(int j=i;j<n;j++)
            {
                System.out.print("\t");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(raw_counter +"\t");
                raw_counter +=j;
            }
            System.out.println();
            col_counter ++;
        }
    }
}

/*
class day_1
{
    public static void main(String[] args) {
        int n=5;
        int col_counter=((n*n)+n)/2;
        for(int i=1;i<=n;i ++)
        {
            int raw_counter=col_counter;
            for(int j=1;j<i;j++)
            {
                System.out.print("\t");
            }
            for(int j=1;j<=n+1-i;j++)
            {
                System.out.print(raw_counter +"\t");
                raw_counter -=j+1;
            }
            System.out.println();
            col_counter -=i;
        }
    }
}


/*

class day_1
{
    public static void main(String[] args) {
        int n=5;
        int col_counter=n/n;
        for(int i=1;i<=n;i++)
        {
            int raw_counter=col_counter;
            for(int j=1;j<i;j++)
            {
                System.out.print("\t");
            }
            for(int j=1;j<=n+1-i;j++)
            {
                System.out.print(raw_counter +"\t");
                raw_counter +=j;
            }
            System.out.println();
            col_counter +=i+1;
        }
    }
}


/*
class day_1
{
    public static void main(String[] args) {
        int n=5;
        int col_counter=((n*n)/2)-1;
        for(int i=1;i<=n;i++)
        {
            int raw_counter=col_counter;
            for(int j=1;j<i;j++)
            {
                System.out.print("\t");
            }
            for(int j=1;j<=n+1-i;j++)
            {
                System.out.print(raw_counter++ +"\t");
            }
            System.out.println();
            col_counter -=n-i;
        }
    }
}


/*

class day_1
{
    public static void main(String[] args) {
        int n=5;
        int col_counter=n;
        for(int i=1;i<=n;i++)
        {
            int raw_counter=col_counter;
            for(int j=1;j<i;j++)
            {
                System.out.print("\t");
            }
            for(int j=1;j<=n+1-i;j++)
            {
                System.out.print(raw_counter-- +"\t");
            }
            col_counter +=n-i;
            System.out.println();
        }
    }
}


/*

class day_1
{
    public static void main(String[] args) {
        int n=5;
        int col_counter=((n*n)+n)/2;
        for(int i=1;i<=n;i++)
        {
            int raw_counter=col_counter;
            for(int j=1;j<i;j++)
            {
                System.out.print("\t");
            }
            for(int j=1;j<=n+1-i;j++)
            {
                System.out.print(raw_counter-- +"\t");
            }
            System.out.println();
            col_counter -=n+1-i;
        }
    }
}


/*
class day_1
{
    public static void main(String[] args) {
        int n=5;
        int col_counter=n/n;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<i;j++)
            {
                System.out.print("\t");
            }
            int raw_counter=col_counter;
            for(int j=1;j<=n+1-i;j++)
            {
                System.out.print(raw_counter++ +"\t");
            }
            System.out.println();
            col_counter +=n+1-i;
        }
    }
}




/*
class day_1
{
    public static void main(String[] args) {
        int n=5;
        int col_counter=((n*n)+n)/2;
        for(int i=1;i<=n;i++)
        {
            int raw_counter=col_counter;
            for(int j=i;j<=n;j++)
            {
                System.out.print(raw_counter +"\t");
                raw_counter -=j;
            }
            System.out.println();
            col_counter -=i+1;
        }
    }
}




/*
class day_1
{
    public static void main(String[] args) {
        int n=5;
        int col_counter=n/n;
        for(int i=1;i<=n;i++)
        {
            int raw_counter=col_counter;
            for(int j=i;j<=n;j++)
            {
                System.out.print(raw_counter +"\t");
                raw_counter +=j;
            }
            System.out.println();
            col_counter +=1+i;
        }
    }
}

/*
class day_1
{
    public static void main(String[] args) {
        int n=5;
        int col_counter=n/n;
        for(int i=1;i<=n;i++)
        {
            int raw_counter=col_counter;
            for(int j=1;j<=n+1-i;j++)
            {
                System.out.print(raw_counter +"\t");
                raw_counter +=j+1;
            }
            System.out.println();
            col_counter +=i;
        }
    }
}

/*

class day_1
{
    public static void main(String[] args) {
        int n=5;
        int col_counter=n/n;
        for(int i=1;i<=n;i++)
        {
            int raw_counter=col_counter;
            for(int j=1;j<=n+1-i;j++)
            {
                System.out.print(raw_counter +"\t");
                raw_counter +=n+1-j;
            }
            System.out.println();
            col_counter++;
        }
    }
}

/*
class day_1
{
    public static void main(String[] args) {
        int n=5;
        int col_counter=((n*n)/2)-1;
        for(int i=1;i<=n;i++)
        {
            int raw_counter=col_counter;
            for(int j=1;j<=n+1-i;j++)
            {
                System.out.print(raw_counter++  +"\t");
            }
            System.out.println();
            col_counter -=n-i;
        }
    }
}


/*

class day_1
{
    public static void main(String[] args) {
        int n=5;
        int col_counter=n;
        for(int i=1;i<=n;i++)
        {
            int raw_counter=col_counter;
            for(int j=1;j<=n+1-i;j++)
            {
                System.out.print(raw_counter-- +"\t");
            }
            System.out.println();
            col_counter+=n-i;
        }
    }
}

/*

class day_1
{
    public static void main(String[] args) {
        int n=5;
        int col_counter=((n*n)+n)/2;
        for(int i=1;i<=n;i++)
        {
            int raw_counter=col_counter;
            for(int j=i;j<=n;j++)
            {
                System.out.print(raw_counter-- +"\t");
            }
            System.out.println();
            col_counter -=n+1-i;
        }
    }
}


/*
class day_1
{
    public static void main(String[] args) {
        int n=5;
        int col_counter=n/n;
        for(int i=1;i<=n;i++)
        {
            int raw_counter=col_counter;
            for(int j=1;j<=n+1-i;j++)
            {
                System.out.print(raw_counter++ +"\t");
            }
            System.out.println();
            col_counter +=n+1-i;
        }

    }
}

/*
import java.util.Scanner;

public class day_1 {

    static boolean isAnagram(String a, String b) {

        for(int j=0;j<a.length();j++)
        {
            int counter=0;
            for(int i=j;i<a.length();i++)
            {
                int counter1=0;
                int counter2=0;
                if(a.charAt(counter)==a.charAt(i))
                {
                    counter1++;
                }else if( b.charAt(counter)==b.charAt(i))
                {
                    counter2++;
                }
                else if(counter1==counter2 && a.charAt(i)==b.charAt(i))
                {
                    return true;
                } else if(a.charAt(j)==b.charAt(j))
                {
                    if((a.charAt(i)==a.charAt(j)|| b.charAt(i)==b.charAt(j)) )
                        return true;
                }
                else
                {
                    return false;
                }
                counter++;
            }

        }

        return false;
        // Complete the function
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

/*

class day_1 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*

class day_1 {
    public static void main(String[] args) {

    }
}






import java.io.*;

import java.util.*;

public class day_1 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
         Enter your code here. Print output to STDOUT.
        StringBuffer str=new StringBuffer();

        for(int i=0;i<A.length();i++)
        {
            str.append(A.charAt(A.length()-i-1));
        }
        String str1=str.toString();
        if(A.equals(str1))
        {
            System.out.println("Yes");
        }

    }
}



/*


import java.util.HashMap;
import java.util.Scanner;

public class day_1 {

    // Function to check if a number is prime
    private static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static String solve(String S) {
        HashMap<Character, Integer> charCount = new HashMap<>();

        // Count occurrences of characters in the string
        for (char c : S.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        StringBuilder P = new StringBuilder();
        for (char c : S.toCharArray()) {
            if (!isPrime(charCount.get(c))) {
                P.append(c);
            }
        }

        if (P.length() == 0) {
            return "MARY";
        }
        return P.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // Read number of test cases

        scanner.nextLine(); // Consume newline character after reading integer

        for (int i = 0; i < T; i++) {
            String S = scanner.nextLine(); // Read the string for each test case
            String result = solve(S);
            System.out.println(result);
        }
    }
}



/*

import java.util.Scanner;
public class day_1 {

    static int solve(int N, int T) {
        int result = 0;

        int start = (T == 0) ? 0 : 9;
        int end = (T == 0) ? 9 : 0;
        int step = (T == 0) ? 1 : -1;

        for (int i = start; i != end + step; i += step) {
            for (int j = start; j != end + step; j += step) {
                int candidate = i * 10 + j;
                candidate = candidate * 10 + N;

                if (candidate % 3 == 0 && (result == 0 || (T == 0 ? candidate < result : candidate > result))) {
                    result = candidate;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int T = scanner.nextInt();
        System.out.println(solve(N, T));
    }
}


/*

public class day_1 {

    static int solve(int N, int T) {
        int result = 0;

        int start = (T == 0) ? 0 : 9;
        int end = (T == 0) ? 9 : 0;
        int step = (T == 0) ? 1 : -1;

        for (int i = start; i != end + step; i += step) {
            for (int j = start; j != end + step; j += step) {
                int candidate = i * 100 + j * 10 + N;

                if (candidate % 3 == 0 && (result == 0 || (T == 0 ? candidate < result : candidate > result))) {
                    result = candidate;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int T = scanner.nextInt();
        System.out.println(solve(N, T));
    }
}


/*
import java.util.Scanner;

public class day_1 {

    static int solve(int N, int T) {
        int result = 0;

        int start = (T == 0) ? 0 : 9;
        int end = (T == 0) ? 9 : 0;
        int step = (T == 0) ? 1 : -1;

        for (int i = start; i != end + step; i += step) {
            for (int j = start; j != end + step; j += step) {
                int candidate = Integer.parseInt("" + i + j + N);

                if (candidate % 3 == 0 && (result == 0 || (T == 0 ? candidate < result : candidate > result))) {
                    result = candidate;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int T = scanner.nextInt();
        System.out.println(solve(N, T));
    }
}


/*
import java.util.Scanner;

public class day_1{

    static int solve(int N, int T) {
        int result = 0;

        // If T is 0, we want the smallest number
        if (T == 0) {
            for (int i = 0; i <= 9; i++) {
                for (int j = 0; j <= 9; j++) {
                    int candidate = Integer.parseInt("" + i + j + N);

                    if (candidate % 3 == 0) {
                        if (result == 0 || candidate < result) {
                            result = candidate;
                        }
                    }
                }
            }
        }

        // If T is 1, we want the largest number
        if (T == 1) {
            for (int i = 9; i >= 0; i--) {
                for (int j = 9; j >= 0; j--) {
                    int candidate = Integer.parseInt("" + i + j + N);

                    if (candidate % 3 == 0) {
                        if (result == 0 || candidate > result) {
                            result = candidate;
                        }
                    }
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int T = scanner.nextInt();

        int result = solve(N, T);
        System.out.println(result);
    }
}


/*
import java.util.Scanner;
import java.util.Scanner;

public class day_1 {

    static long findSmallestPalindromic(int N) {
        // For small N values (1 and 2)
        if (N == 1) {
            return 7;
        } else if (N == 2) {
            return 77;
        }

        // For larger N values
        long num = 1L;
        long max = (long) Math.pow(10, N);

        for (int i = 1; i < N / 2; i++) {
            num *= 10;
            num += 1;
        }

        for (long i = num; i < max; i += num) {
            long palin = i * 100 + reverse(i / 10); // Generating palindrome

            if (palin % 7 == 0) {
                return palin;
            }
        }
        return -1; // If no such palindrome found
    }

    static long reverse(long num) {
        long rev = 0;
        while (num > 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt();
            long smallestPalindrome = findSmallestPalindromic(N);
            System.out.println(smallestPalindrome);
        }
    }
}


/*

import java.util.Scanner;

public class day_1 {

    static long findSmallestPalindromic(int N) {
        // Handling special cases for N = 1 and N = 2
        if (N == 1) {
            for (int i = 1; i <= 9; i++) {
                if (i % 7 == 0) {
                    return i;
                }
            }
        } else if (N == 2) {
            for (int i = 10; i <= 99; i++) {
                if (i % 7 == 0) {
                    return i;
                }
            }
        } else {
            // Finding the smallest N-digit palindrome that is divisible by 7
            for (int i = (int) Math.pow(10, N - 1); i < Math.pow(10, N); i++) {
                int num = i;
                int rev = 0;
                int temp = i;

                // Reversing the number to check palindrome
                while (temp != 0) {
                    int digit = temp % 10;
                    rev = rev * 10 + digit;
                    temp /= 10;
                }

                // Checking if the number is a palindrome and divisible by 7
                if (num == rev && num % 7 == 0) {
                    return num;
                }
            }
        }
        return -1; // If no such palindrome found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt();
            long smallestPalindrome = findSmallestPalindromic(N);
            System.out.println(smallestPalindrome);
        }
    }
}

/*

public class day_1 {

    static long findSmallestPalindromic(int N) {
        // Check for N = 1 or 2 as base cases
        if (N == 1) {
            return 7; // Smallest 1-digit number divisible by 7
        } else if (N == 2) {
            return 77; // Smallest 2-digit number divisible by 7
        }

        // For N > 2
        long smallestPalindrome = 1L;
        for (int i = 1; i < N; i++) {
            smallestPalindrome *= 10;
            smallestPalindrome += 1;
        }

        while (true) {
            if (smallestPalindrome % 7 == 0) {
                return smallestPalindrome;
            }
            smallestPalindrome++;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt();
            long smallestPalindrome = findSmallestPalindromic(N);
            System.out.println(smallestPalindrome);
        }
    }
}


/*
import java.util.*;
import java.util.Scanner;

public class day_1 {

    static long findSmallestPalindromic(int N) {
        // Generate the smallest N-digit palindrome divisible by 7
        if (N == 1) {
            return 7; // Smallest 1-digit number divisible by 7
        } else if (N == 2) {
            return 77; // Smallest 2-digit number divisible by 7
        } else {
            // Generate the smallest N-digit palindrome divisible by 7
            StringBuilder sb = new StringBuilder("1");
            for (int i = 1; i < N - 1; i++) {
                sb.append("0");
            }
            sb.append("1");
            return Long.parseLong(sb.toString());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt();
            long smallestPalindrome = findSmallestPalindromic(N);
            System.out.println(smallestPalindrome);
        }
    }
}


/*
import java.util.Scanner;

public class day_1{

    static long findSmallestPalindromic(int N) {
        int start = (int) Math.pow(10, N - 1) + 1;
        int end = (int) Math.pow(10, N) - 1;

        for (int i = start; i <= end; i++) {
            long palindrome = createPalindrome(i);
            if (palindrome % 7 == 0) {
                return palindrome;
            }
        }
        return -1;
    }

    static long createPalindrome(int num) {
        long palin = num;
        while (num > 0) {
            palin = palin * 10 + (num % 10);
            num /= 10;
        }
        return palin;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt();
            long smallestPalindrome = findSmallestPalindromic(N);
            System.out.println(smallestPalindrome);
        }
    }
}

/*
import java.util.Scanner;

public class day_1{

    static long findSmallestPalindromic(int N) {
        // Find the smallest palindromic number with N digits divisible by 7
        int middle = N / 2;
        long palindrome = 0;

        if (N % 2 == 0) {
            palindrome = 10L * (power(10, middle - 1) + power(10, middle)) - 1;
        } else {
            palindrome = 10L * (10L * power(10, middle) - 1);
        }

        return palindrome - (palindrome % 7); // Adjust to make it divisible by 7
    }

    static long power(long base, int exp) {
        long result = 1;
        while (exp > 0) {
            if (exp % 2 == 1) {
                result *= base;
            }
            exp >>= 1;
            base *= base;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt();
            long smallestPalindrome = findSmallestPalindromic(N);
            System.out.println(smallestPalindrome);
        }
    }
}


/*
import java.util.Scanner;

public class day_1 {

    static long findSmallestPalindromic(int N) {
        // We start from the smallest N-digit palindrome
        int start = (int) Math.pow(10, N - 1) + 1;
        int end = (int) Math.pow(10, N) - 1;

        for (int i = start; i <= end; i++) {
            // Check if the number is a palindrome and divisible by 7
            if (isPalindrome(i) && i % 7 == 0) {
                return i;
            }
        }
        return -1; // Return -1 if no such palindrome found (not expected in the provided constraints)
    }

    // Method to check if a number is palindrome
    static boolean isPalindrome(int num) {
        String original = Integer.toString(num);
        String reverse = new StringBuilder(original).reverse().toString();
        return original.equals(reverse);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt();
            long smallestPalindrome = findSmallestPalindromic(N);
            System.out.println(smallestPalindrome);
        }
    }
}


/*
import java.util.Scanner;

public class day_1 {

    static boolean isDivisibleBy7(int num) {
        return num % 7 == 0;
    }

    static int findSmallestPalindromic(int N) {
        int start = (int) Math.pow(10, N - 1);
        int end = (int) Math.pow(10, N) - 1;

        for (int i = start; i <= end; i++) {
            StringBuilder sb = new StringBuilder(Integer.toString(i));
            String rev = sb.reverse().toString();
            int palindrome = Integer.parseInt(i + rev);

            if (isDivisibleBy7(palindrome)) {
                return palindrome;
            }
        }
        return -1; // Return -1 if no such palindrome found (not expected in the provided constraints)
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt();
            int smallestPalindrome = findSmallestPalindromic(N);
            System.out.println(smallestPalindrome);
        }
    }
}


/*
import java.util.Scanner;

public class day_1 {

    static boolean isDivisibleBy7(int num) {
        return num % 7 == 0;
    }

    static int findSmallestPalindromic(int N) {
        int start = (int) Math.pow(10, N - 1);
        int end = (int) Math.pow(10, N) - 1;

        for (int i = start; i <= end; i++) {
            StringBuilder sb = new StringBuilder(Integer.toString(i));
            String rev = sb.reverse().toString();
            int palindrome = Integer.parseInt(i + rev);

            if (isDivisibleBy7(palindrome)) {
                return palindrome;
            }
        }
        return -1; // Return -1 if no such palindrome found (not expected in the provided constraints)
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt();
            int smallestPalindrome = findSmallestPalindromic(N);
            System.out.println(smallestPalindrome);
        }
    }
}

/*
import java.util.*;

class GFG {
    static String generateOutput(int a, int b) {
        return (a * 10 + (a + 1)) + "\n" + (b * 100 + (b + 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCases = sc.nextInt();
        for (int i = 0; i < testCases; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            String result = generateOutput(a, b);
            System.out.println(result);
        }
    }
}



/*
class GFG {
    static String generateOutput(int a, int b) {
        return String.valueOf(a * a + a) + "\n" + String.valueOf(b * b * b + b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCases = sc.nextInt();
        for (int i = 0; i < testCases; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            String result = generateOutput(a, b);
            System.out.println(result);
        }
    }
}


/*
import java.util.*;

class GFG {
    static String generateOutput(int a, int b) {
        return Integer.toBinaryString(a * a) + "\n" + Integer.toBinaryString(b * b * b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCases = sc.nextInt();
        for (int i = 0; i < testCases; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            String result = generateOutput(a, b);
            System.out.println(result);
        }
    }
}


/*
// Java implementation of the above approach
import java.util.*;

class GFG {
    static String smallestNonSubstring(List<String> strings) {
        Set<String> subs = new HashSet<>();

        for (String str : strings) {
            for (int i = 0; i < str.length(); ++i) {
                for (int j = i; j < str.length(); ++j) {
                    subs.add(str.substring(i, j + 1));
                }
            }
        }

        Queue<String> q = new LinkedList<>();
        for (char c = 'a'; c <= 'z'; ++c) q.add("" + c);

        while (!q.isEmpty()) {
            String cur = q.poll();
            if (!subs.contains(cur)) {
                return cur;
            }
            for (char c = 'a'; c <= 'z'; ++c) q.add(cur + c);
        }
        return "";
    }

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine(); // Consume newline
        for (int i = 0; i < n; i++) {
            strings.add(sc.nextLine());
        }

        String result = smallestNonSubstring(strings);
        System.out.println(result);
    }
}



/*
import java.util.*;

class GFG {
    static void smallestNonSubstring(char[] S, int n) {
        Set<String> subs = new HashSet<>();

        for (int i = 0; i < n; ++i)
            for (int j = i; j < n; ++j)
                subs.add(new String(S, i, j - i + 1));

        Queue<String> q = new LinkedList<>();
        for (char c = 'a'; c <= 'z'; ++c) q.add("" + c);

        while (!q.isEmpty()) {
            String cur = q.poll();
            if (!subs.contains(cur)) {
                System.out.print(cur + "\n");
                return;
            }
            for (char c = 'a'; c <= 'z'; ++c) q.add(cur + c);
        }
    }

    public static void main(String[] args) {
        String S = "aabacdefghijklmnopqrstuvwxyz";
        smallestNonSubstring(S.toCharArray(), S.length());
    }
}


/*

import java.util.*;

class GFG {

    static void lexicographicalSmallestString(char[] S, int n) {
        HashSet<String> collection = new HashSet<>();

        for (int i = 0; i < n; ++i) {
            for (int j = i; j < n; ++j) {
                collection.add(new String(S, i, j - i + 1));
            }
        }

        Queue<String> q = new LinkedList<>();
        for (char c = 'a'; c <= 'z'; ++c) {
            q.add(String.valueOf(c));
        }

        while (!q.isEmpty()) {
            String cur = q.poll();
            if (!collection.contains(cur)) {
                System.out.print(cur + "\n");
                return;
            }
            for (char c = 'a'; c <= 'z'; ++c) {
                q.add(cur + c);
            }
        }
    }

    public static void main(String[] args) {
        String S = "aabacdefghijklmnopqrstuvwxyz";
        lexicographicalSmallestString(S.toCharArray(), S.length());
    }
}


/*
import java.util.*;

class GFG{

    // Function to find the lexicographically
// smallest String of minimum characters
// not present as subString in String S
    static void lexicographicalSmallestString(char[] S, int n)
    {

        // Set which stores all subStrings
        // of the String S
        HashSet<String> collection = new HashSet<String>();

        // Constructing all subStrings of S
        for (int i = 0; i < n; ++i) {
            String cur="";
            for (int j = i; j < n; ++j) {
                cur+=(S[j]);

                // Inserting the current
                // subString to set
                collection.add(cur);
            }
        }

        Queue<String> q = new LinkedList<String>();

        // Initializing BFS queue
        for (int i = 0; i < 26; ++i) {
            q.add(String.valueOf((char)((i + 'a'))));
        }

        // Loop for the BFS Traversal
        while (!q.isEmpty()) {

            // Stores the current
            // lexicographically smallest
            // String of min characters
            String cur = q.peek();
            q.remove();

            // If the current String is
            // not present as a subString
            // of the given String
            if (!collection.contains(cur)) {

                // Print Answer
                System.out.print(cur +"\n");
                return;
            }

            // Append characters from [a-z]
            // to the back of String cur
            // and push into the queue.
            for (int i = 0; i < 26; ++i) {
                cur+=String.valueOf((char)((i + 'a')));
                q.add(cur);
                cur=cur.substring(0,cur.length()-1);
            }
        }
    }

    // Driver Code
    public static void main(String[] args)
    {
        String S = "aabacdefghijklmnopqrstuvwxyz";
        int N = S.length();

        lexicographicalSmallestString(S.toCharArray(), N);
    }
}

// This code is contributed by shikhasingrajput


/*
import java.util.Scanner;



public class day_1 {
    static  int  fun(int arr)
    {
        int numberOfPairs = (arr * (arr - 1)) / 2;
        return numberOfPairs;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int N = sc.nextInt();



        System.out.println("Number of possible pairs: " + fun(N));
    }
}



/*

import java.util.Scanner;



import java.util.Scanner;

public class day_1
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of words
        int n = scanner.nextInt();

        // Read the words into an array
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = scanner.next();
        }

        // Generate the output path
        String outputPath = generateOutputPath(words);

        // Print the output path
        System.out.println(outputPath);
    }
    public static String generateOutputPath(String[] words) {
        // Join the words to create the output path
        int n=words.length;
        StringBuilder outputPath = new StringBuilder("/home/");
        int counter=0;
        for (String word : words) {

            if(counter<n-1)
            {
                counter++;
                outputPath.append(word).append("/");
            }else
            {
                counter++;
                if(counter!=n )
                {
                    outputPath.append(word);
                }
            }
        }
        //outputPath.append("contests");

        return outputPath.toString();
    }
}



/*

  interface simple {
      int s = 90;


  }
  class simple1
 {
     int a=89;
     public  int fun()
     {
         return a;
     }
 }

 class day_1{
     public static void main(String[] args) {

     }
 }

/*

class singleton
{
    private static singleton instance;

    private singleton()
    {

    }

    public  static singleton  getInstance()
    {
        if(instance==null)
        {
            instance=new singleton();
        }
        return instance;
    }

    public  void d()
    {
        System.out.println("Rushikesh khillare");
    }
}


/*
class singleton
{
    private static singleton instance;
    private singleton()
    {

    }

    public static singleton getInstance()
    {
        if(instance==null)
        {
            instance=new singleton();
        }
        return  instance;
    }

    public void doSomething()
    {
        System.out.println("Rushikesh khillare");
    }
}

/*
public class singleton
{
    private static singleton Instance;
    private singleton()
    {

    }
    public static singleton getInstance()
    {
        if(Instance==null)
        {
            Instance=new singleton();
        }
        return Instance;
    }


}


/*
class simple
{
    protected simple()
    {

    }
}

class day_1
{
    public static void main(String[] args) {

    }
}

/*
import java.util.PriorityQueue;
import java.util.Queue;

class day_1
{
    public static void main(String[] args) {
        Queue<Integer> list= new PriorityQueue<>();
        list.add(90);
        list.add(43);
        list.add(12);
        list.add(9);
        System.out.println(list);
    }
}


/*
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

public class day_1
{
    public static void main(String[] args) {

        Queue<Integer> list=new Queue<Integer>() {
            @Override
            public boolean add(Integer integer) {
                return false;
            }

            @Override
            public boolean offer(Integer integer) {
                return false;
            }

            @Override
            public Integer remove() {
                return null;
            }

            @Override
            public Integer poll() {
                return null;
            }

            @Override
            public Integer element() {
                return null;
            }

            @Override
            public Integer peek() {
                return null;
            }

            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Integer> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Integer> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }
        }
    }
}

/*
import java.util.Stack;

class day_1
{
    public static void main(String[] args) {

        Stack<Integer> stack=new Stack<>();
        stack.push(12);
        stack.push(1);
        stack.push(21);
        stack.push(65);
        stack.push(8);
        stack.push(0);
        stack.push(87);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }
}


/*
import java.util.Vector;

public  class day_1 {

    public static void main(String[] args) {
        Vector<Integer> vector=new Vector<>();
        vector.add(10);
        vector.add(12);
        vector.add(21);
        vector.add(88);


        System.out.println(vector.capacity());
        //intional capacity of the vector is 10
        // ;
        System.out.println(vector.add(90));
        for (int i:vector
             ) {
            System.out.println(i);
        }
        vector.addFirst(1);
        vector.addLast(34);
       vector.clear();

    }
}

/*
import java.sql.*;

class day_1
{
    public static void main(String[] args)  {

        Connection con=null;
        PreparedStatement pre=null;
        ResultSet resultSet=null;
        try
        {
            Class.forName("com.mysql.cj.jdbc.driver");
            String url="jdbc:mysql:localhost//3306/college";
            String username="root";
            String password="Rushi@1101";
            con= DriverManager.getConnection(url,password,username);
            Statement statement=con.createStatement();
            String str="select *from college";
            pre=con.prepareStatement(str);
            resultSet=pre.executeQuery();
            while (resultSet.next())
            {
                int id=resultSet.getInt("id");
                String name=resultSet.getString("name");
            }


        }catch (Exception e)
        {
            System.out.println(e);
        }
    }
}

/*

final  class simple
{
    static   int a=90;
     int fun()
    {
        return a;
    }
}

class day_1
{
    public static void main(String[] args) {
        simple simpl= new simple();
        System.out.println( simpl.fun());
    }
}

/*
import java.util.LinkedList;

class day_1
{
    public static void main(String[] args) {
        LinkedList<Integer>list=new LinkedList<>();
        list.add(10);
        list.add(12);
        list.add(34);
        list.add(67);
        list.add(56);
        list.add(90);
        list.add(48);
        list.addFirst(1);
        list.addLast(8);
        System.out.println(list.get(0));
        for (int i:list
             ) {
            System.out.println(i);
        }


    }
}


/*
import java.util.ArrayList;

public class day_1 {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        number.add(19);
        number.add(12);
        number.add(13);
        number.add(45);
        number.add(90);
        number.add(12);

        int count = number.size();

        // Bubble Sort implementation
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - i - 1; j++) {
                if (number.get(j) > number.get(j + 1)) {
                    // Swap elements if they're in the wrong order
                    int temp = number.get(j);
                    number.set(j, number.get(j + 1));
                    number.set(j + 1, temp);
                }
            }
        }

        // Printing the sorted list
        for (int i = 0; i < count; i++) {
            System.out.println(number.get(i));
        }
    }
}

/*
import javax.swing.plaf.IconUIResource;
import java.util.ArrayList;

class day_1
{
    public static void main(String[] args) {
        ArrayList<Integer> number=new ArrayList<>();
        number.add(19);
        number.add(12);
        number.add(13);
        number.add(45);
        number.add(90);
        number.add(12);
        int count=0;
        for (int a:number
             ) {
            count++;
        }
        for(int i=0;i<count;i++)
        {
            for(int j=i+1;j<count;j++)
            {
                if(number.get(i)<=number.get(j))
                {
                    int temp=number.get(i);
                    number.add(number.get(j));
                    number.add(number.get(temp));

                }
            }
        }
        for (int i=0;i<count;i++)
        {
            System.out.println(number.get(i));
        }

//        number.remove(12);
//        System.out.println(number.get(0));

    }
}
/*
import java.util.ArrayList;
import java.util.List;

class day_1
{
    public static void main(String[] args) {
        List<String> f= new ArrayList<>();

        f.add("apple");
        f.add("banana");
        f.add("Rushi");
        f.add("khillare");

        for(int i=0;i<f.size()-1;i++)
        {
            for(int j=0;j<f.size()-i-1;j++)
            {
                if(f.get(j).compareTo(f.get(j+1))>0)
                {
                    String temp =f.get(j);
                    f.set(j,f.get(j+1));
                    f.set(j+1,temp);
                }
            }
        }
        for (String F:f
             ) {
            System.out.println(F);
        }
    }
}


/*
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class day_1
{
    public static void main(String[] args) {
        List<String > F=new ArrayList<>();
        F.add("Rushi");
        F.add("Khillare");
        F.add("danny");
        F.add("satya");
        F.add("yash");

        Collections.sort(F);
        for (String f:F
             ) {
            System.out.println(f);
        }
    }
}






/*
import java.util.ArrayList;
import java.util.List;

class day_1
{
    public static void main(String[] args) {
        List<String> Fruit=new ArrayList<>();

        //adding the element
        Fruit.add("apple");
        Fruit.add("orange");
        Fruit.add("Grapes");

        for (String f:Fruit
             ) {
            System.out.println(f);
        }
        System.out.println(Fruit);

        System.out.println(Fruit.size());

        System.out.println( Fruit.remove("Rushi"));
        //This particular value is not present

        System.out.println(Fruit.remove("Grapes"));//This remove
        //directly modified in the original
        System.out.println(Fruit);

        for(int i=0;i<Fruit.size();i++)
        {
            System.out.println(Fruit.get(i));
        }
        Fruit.clear();


    }
}

/*

class day_1
{
    public static void main(String[] args) {
        List<String> fruit= new List<String>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<String> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(String s) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends String> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends String> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public String get(int index) {
                return null;
            }

            @Override
            public String set(int index, String element) {
                return null;
            }

            @Override
            public void add(int index, String element) {

            }

            @Override
            public String remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<String> listIterator() {
                return null;
            }

            @Override
            public ListIterator<String> listIterator(int index) {
                return null;
            }

            @Override
            public List<String> subList(int fromIndex, int toIndex) {
                return null;
            }
        }
    }
}




/*

import java.util.Scanner;

class day_1
{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str1=scanner.nextLine();
        String str2=scanner.nextLine();
        System.out.println(str1.length()+str2.length());
        if(!(str1.length()<str2.length()))
        {
            System.out.println("NO");
        }
        StringBuilder stringBuilder=new StringBuilder();
        for (int i=0;i<str2.length();i++)
        {
            if(i==0)
            {
                stringBuilder.append(str2.charAt(i));
            }
            
    }
}

/*

class day_1
{
    public  static  int octaltodecimal(String str)
    {
        int decimal=0;
        int poweer=0;
        for(int i=str.length()-1;i>=0;i--)
        {
            int temp=str.charAt(i)-'0';
            decimal=temp*(int )Math.pow(8,poweer++);
        }
        return decimal;
    }
    public static void main(String[] args) {
         String str="512";
         int res=octaltodecimal(str);
        System.out.println(res);
    }
}

/*
class  day_1
{
    public static void main(String[] args) {
        int n=320;
        int des=0;
        int mul=1;
        while (n>0)
        {
            int temp=n%8;
            des=temp*mul;
            mul*=10;
            n/=8;
        }
        System.out.println(des);
    }
}



/*
class day_1
{
    public  static int otod(String s)
    {
        int decimal=0;
        int power=0;
        for(int i=s.length()-1;i>=0;i--)
        {
            int di=s.charAt(i)-'0';
            decimal=+di*(int )Math.pow(8,power++);
        }
        return decimal;
    }
    public static void main(String[] args) {
        String octalnumber="512";
        int res=otod(octalnumber);
        System.out.println(res);
    }
}

/*
class day_1 {
    public static void main(String[] args) {
        int n = 10;
        int bin = 0;
        int multiplier = 1;

        while (n > 0) {
            int bit = n % 2;
            bin += bit * multiplier;
            n /= 2;
            multiplier *= 10;
        }

        System.out.println(bin);
    }
}


/*
class day_1 {
    public static void main(String[] args) {
        int n = 10;
        int bin = 0;
        while (n > 0) {
            int temp = n % 2;
            bin = bin * 10 + temp;
            n /= 2;
        }

        int reversedBin = 0;
        while (bin != 0) {
            int digit = bin % 10;
            reversedBin = reversedBin * 10 + digit;
            bin /= 10;
        }

        System.out.println(reversedBin);
    }
}


/*

class day_1
{
    public static void main(String[] args) {
        int n=10;
        int bin=0;
        while (n>0)
        {
            int temp=n%2;
            bin =bin*10+temp;
            n/=2;
        }
        System.out.println(bin);
    }
}


/*
class day_1
{
    public static void main(String[] args) {
        int n=1010;
        int des=0;
        int i=0;
        while (n>0)
        {
            int temp=n%10;
            des=des+temp*(int)Math.pow(2,i++);
            n/=10;
        }
        System.out.println(des);
    }
}


/*
//another approach lcm
class day_1
{
    public static void main(String[] args) {
        int num=45;
        int num2=60;
        int max=(num2>num)?num2:num;
        int temp=0;
        int i=1;
        for ( i=max;;i+=max)
        {
            temp=(num2<num)?num2:num;
            if(i%temp==0)
            {
                break;
            }
        }
        System.out.println(i);
    }
}

/*
// LCM
class day_1
{
    public static void main(String[] args) {
        int num1=45;
        int num2=60;
        int max=(num1>num2)?num1:num2;
        for(int i=max;i<=num2*num2;i++)
        {
            if(i%num1==0 && i%num2==0)
            {
                System.out.println(i);
                break;
            }
        }
    }
}



/*

class day_1
{
    public static void main(String[] args) {
         int a=12;
         int b=14;
        int temp=a;
        int temp2=b;
        while (true)
        {
            if(temp<temp2)
            {
                temp+=a;
            }else if(temp>temp2)
            {
                temp2+=b;
            }else if(temp == temp2)
            {
                break;
            }
        }
        System.out.println(temp);
    }
}

/*

class day_1
{
    public static void main(String[] args) {
        int num=45,num1=85;
        for(int i=1;i<num || i<num1;i++)
        {
            if(num%i==0 && num1%i==0)
            {
                System.out.println(i);
            }
        }
    }
}

/*
class day_1
{
    public static void main(String[] args) {
        int num=40,num2=80,hcf=0;
        for(int i=1;i<num || i<num2;i++)
        {
            if(num%i==0 && num2 %i==0)
            {
                hcf=i;
            }
        }
        System.out.println(hcf);
    }
}



/*

class day_1
{
    public static void main(String[] args) {

        int num1=36;
        int num2=100;
        int max1=0;
        for(int i=1;i<num1 ||  i<num2;i++)
        {
            if(num1%i==0 && num2%i==0)
            {
                max1=i;
            }
        }
        System.out.println(max1);
    }
}


/*


class day_1
{
    public static void main(String[] args) {
        int n=36,m=60;
        int hcf=0;
        for(int i=1;i<=n||i<=m;i++)
        {
            if(n%i==0 && m%i==0)
            {
                hcf=i;
            }
        }
        System.out.println(hcf);
    }
}


/*
class day_1
{
    public static void main(String[] args) {
        int n=5;
        int temp=n*n;
        int temp1=temp;
        int counter=0;
        while(temp1>0)
        {
            temp1=temp1/10;
            counter++;
        }
        counter=counter/2;

        int i=0;
        int res=0;
        while (i<counter)
        {
            temp1=temp%10;
            res=res*10+temp1;
            temp/=10;
            i++;
        }
        if(res==n)
        {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}

/*
class day_1
{
    public static void main(String[] args) {
        int  n=67;
        int y=n*n;
        if(y%10==n%10)
        {
            System.out.println("automorphic");
        }
        else
        {
            System.out.println("not");
        }
    }
}


/*
class day_1
{
    public static void main(String[] args) {
        int n=376;
        int sq=n*n;
        if(is(n)==1)
        {
            System.out.println("num: "+n +);
        }else
        {
            System.out.println("NUM"+ n +);
        }
    }
}


/*

class day_1
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n+1-i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=2;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


/*
class day_1
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n+1-i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


/*
class day_1
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


/*

class day_1
{
    public  static  boolean  fun(int n)
    {
        if(n>=0)
        {
            int x=(int)Math.sqrt(n);
            return((n*n)==x);
        }
        return false;
    }
    public static void main(String[] args) {
        int n=8;
        boolean bool = fun(n);
        if(bool)
        {
            System.out.println("true");
        }else
        {
            System.out.println("false");
        }
    }
}


/*

class day_1
{
    public  static  void fun(int n)
    {
        if(Math.ceil((double) Math.sqrt(n))==Math.floor((double) Math.sqrt(n)))
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
    public static void main(String[] args) {
        int n=81;
        fun(n);
    }
}


/*
//Strong Number Program in Java
class day_1
{
    public  static int strong_nunber(int n)
    {
        int result=0;
       while (n>0)
       {
           int temp=n%10;
           int res=1;
           for(int i=1;i<=temp;i++)
           {
               res*=i;
           }
           result+=res;
           n/=10;
       }
        return result;
    }
    public static void main(String[] args) {
     int n=145;
        System.out.println(strong_nunber(n));

    }
}

/*

//finding the number factors

class day_1
{
    public static void main(String[] args) {
        int n=17;
        boolean bool=true;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                bool=false;
            }
        }
        if(bool)
        {
            for(int i=1;i<=n;i++)
            {
                if(n%i==0)
                {
                    System.out.print(i+" ");
                }
            }
        }
    }
}



/*
import java.util.Scanner;




/*

//factor of the number

class day_1
{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the number");
        int n=scanner.nextInt();
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                System.out.print(i +" ");
            }
        }
    }
}



/*

class day_1
{
    public static void main(String[] args) {
        System.out.print("Enter your normal number: ");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.print("Enter the power number: ");
        int pow=scanner.nextInt();
        int result=1;
        for(int i=1;i<=pow;i++)
        {
            result*=n;
        }
        System.out.println(result);
    }
}


/*

import java.util.Scanner;

//factorial number program approach is recursive
class factorial
{
    public int Factorial(int n)
    {
        if(n<=1)
        {
            return n;
        }
        return n*Factorial(n-1);
    }
}

class day_1
{
    public static void main(String[] args) {
        factorial fac=new factorial();
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int res=fac.Factorial(n);
        System.out.println(res);
    }
}




/*

//factorial number code iterative approach

class day_1
{
    public  static  int factorial(int n)
    {
        int res=1;
        for(int i=1;i<=n;i++)
        {
            res*=i;
        }
        return res;
    }
    public static void main(String[] args) {
        int n=10;
        int result=factorial(n);
        System.out.println(result);
    }
}




/*
class day_1
{
    public static void main(String[] args) {
        int n=10;
        int temp=0;
        int temp1=1;
        int fib=0;
        for(int i=1;i<=n;i++)
        {
            System.out.println(fib);
          fib=temp+temp1;
         temp=temp1;
         temp1=fib;
        }
    }
}



/*

import java.util.Scanner;

class day_1
{
    public  static int fun(int n)
    {
        if(n<=1)
        {
            return n;
        }
        return fun(n-1)+fun(n-2);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        for(int i=1;i<=n;i++)
        {
            System.out.println(fun(i));
        }
    }
}


/*


class day_1
{
    public static  int  fun(int n)
    {
        if(n<=1)
        {
            return n;
        }
        return fun(n-1)+fun(n-2);
    }

    public static void main(String[] args) {

        int n=fun(10);
        System.out.println(n);
    }
}


/*
import java.util.Scanner;

class day_1
{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int counter=1;int i=1;
         while (counter<=n)
         {
             int temp=i;
             int len=0;
             int check=0;
             while (temp>0)
             {
                 len++;
                 temp/=10;
             }
             temp=i;
             while(temp>0)
             {
                 int temp2=temp%10;
                 check+=(int)Math.pow(temp2,len);
                         temp/=10;
             }

             if(check==i)
             {
                 counter++;
             }
             i++;
         }
        System.out.println(i-1);
    }
}


/*

class day_1
{
    public static void main(String[] args) {
        int n=71;
        int put=n;
        String s=String.valueOf(n);
        int len=s.length();
//        String s1=Integer.toString(n);
//        String s3=""+n;
        int des=0;
        while(n>0)
        {
            int temp=n%10;
            des+=(int)Math.pow(temp,len);
            n/=10;
        }
        if(des==put)
        {
            System.out.println("Yes this is the amstrong number");
        }
        else
        {
            System.out.println("This is not amstrong number");
        }
    }
}



/*
class day_1
{
    public static void main(String[] args) {
        int counter=1;
        int n=10;
        int i=2;
        while (counter<=n)
        {
            boolean bool=true;
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    bool=false;
                }
            }

            if(bool)
            {
                counter++;
                if(counter==n)
                    break;
            }
            i++;
        }
        System.out.println(i);
    }
}




/*
class day_1
{
    public  static  void main(String []arr)
    {
        int n=6;
        boolean bool=true;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                bool=false;
            }
        }
        if(bool)
        {
            System.out.println("This is prime number");
        }
        else
        {
            System.out.println("This is not prime number");
        }
    }
}

/*
class simple
{
   String n;//static content the static only but non-static also content the static

    //static int j=10;
   public   void fun()//non-static  variable not able to access in the static method
   {
       System.out.println(n);
   }
}

class day_1
{
    public static void main(String[] args) {
    simple obj= new simple();
    obj.fun();
    String s;
        System.out.println(s);//here we need to initialized the value
    }
}


/*
class day_1
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(int j=2;j<2*n-i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*



543212345
 5432345
  54345
   545
    5



class day_1
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int j=n;j>=i;j--)
            {
                System.out.print(j);
            }
            for(int j=i+1;j<=n;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}



/*
543212345
 4321234
  32123
   212
    1

class day_1
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int j=n+1-i;j>=1;j--)
            {
                System.out.print(j);
            }
            for (int j=2;j<=n+1-i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

/*
class day_1
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<n;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=(i*2)-1;j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

/*
class day_1
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<n;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=(i*2)-1;j++)
            {
                if(j==1||j==(i*2)-1||i==n)
                {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

/*

class myThread extends Thread
{
    public void fun()
    {
        System.out.println("This is the method use in the thread class");
    }
    @Override
    public void run() {
        for(int i=0;i<100; i++)
        {
            fun();
        }
    }
}

class day_1
{
    public static void main(String[] args) {
        myThread obj=new myThread();
        System.out.println(obj.getState());
        System.out.println(obj.getClass());
        System.out.println(obj.threadId());
        System.out.println(obj.setDaemon(1));
    }
}
/*

class myThread extends  Thread
{
    public  void run()
    {
        //Getting the stack track of the current
        StackTraceElement[] stackTrace=Thread.currentThread().getStackTrace();
        System.out.println("stack track for mythread");
        for (StackTraceElement element: stackTrace
             ) {
            System.out.println(element);
        }
    }
}


/*
class MyThread extends Thread {
    public void run() {
        // Getting the stack trace of the current thread
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();

        // Printing the stack trace elements
        System.out.println("Stack Trace for MyThread:");
        for (StackTraceElement element : stackTrace) {
            System.out.println(element);
        }
    }
}

public class day_1 {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
    }
}

/*

import com.sun.security.jgss.GSSUtil;

import java.util.TreeMap;

class Rendering extends Thread
{
    public void run()
    {
        System.out.println("Rendering webpage content ....");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("webpage content rendered");
    }
}
class networkingTread extends Thread
{
    public void run()
    {
        System.out.println("fetching resources from the server");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
class javaScriptThread extends Thread
{
    public void run()
    {
        System.out.println("Executing javascript...");
        try
        {
            Thread.sleep(100);
        }catch (Exception e)
        {
            System.out.println(e);
        }
        System.out.println("javaScript executed!");
    }
}
class day_1
{
    public static void main(String[] args) {
        Rendering rendering=new Rendering();
        javaScriptThread obj=new javaScriptThread();
        networkingTread obj2=new networkingTread();

        System.out.println( obj.getName());
        System.out.println(obj2.getName());
        //System.out.println(obj.getContextClassLoader());
        //obj.setName("Rushikesh");
        //System.out.println(obj.getName());
        System.out.println(obj.getStackTrace());
    }
}


/*
class simple extends Thread
{
    public void reading()
    {
        System.out.println("This is parent class method reading");
    }

    @Override
    public void run() {
        for (int i=0;i<100;i++)
        {
            reading();
        }
    }
}

class myRunnable implements Runnable {
    private void watching()
    {
        System.out.println("I am watching moves");
    }
    public  void run()
    {
        for(int i=0;i<100;i++)
        {
            watching();
        }
    }
}

class day_1
{
    myRunnable obj=new myRunnable();
}


/*
class myThread extends  Thread
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("Running in my");
        }
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e)
        {
            System.out.println(e);
        }
    }
}
class simple extends Thread
{
    public void watching()
    {
        System.out.println("I am watching the moive");
    }

    @Override
    public void run() {
        for(int i=0;i<10;i++)
        {
            watching();
        }
    }
}
class simple1 extends Thread
{
    public void reading()
    {
        System.out.println("I am reading book");
    }

    @Override
    public void run() {
        for(int i=0;i<90;i++)
        {
            reading();
        }
    }
}
class day_1
{
    public static void main(String[] args) {
        simple obj=new simple();
        simple1 obj1= new simple1();
        myThread obj3=new myThread();
        obj3.start();
        obj1.start();
        obj.start();
    }
}

/*
class day_1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6, 7, 8, 97, 5, 5, 54, 4, 1, 1, 1, 1, 1, 1};
        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] != 0) {
                boolean bool = false;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        bool = true;
                        arr[j] = 0;
                    }
                }
                if (bool) {
                    System.out.print(arr[i] + " ");
                }
            }
        }
        System.out.println();
        for (int i = 0; i < arr.length-1; i++) {

                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        System.out.print(arr[i] + " ");
                    }

            }
        }

    }
}


/*
class day_1
{
    public static void main(String[] args) {
        int n=1010;
        int i=0;
        int des=0;
        while(n!=0)
        {
            int temp=n%10;
            des=des+temp*(int)Math.pow(2,i++);
            n/=10;

        }
        System.out.println(des);
    }
}


/*
class day_1
{
    public static void binnary(int n)
    {
       if(n>1)
       {
           binnary(n/2);
       }
        System.out.print(n%2);
    }
    public static void main(String[] args) {
        int n=10;
        binnary(n);
    }
}

/*
class day_1
{
    public static void main(String[] args) {
        int n=10;
        int [] arr=new int[40];
        int i=0;

        while (n>0)
        {
            arr[i++]=n%2;
            n/=2;
        }
        for(int j=i-1;j>=0;j--)
        {
            System.out.print(arr[j]);
        }
    }
}



/*


class day_1
{
    public static void main(String[] args) {
        int n=56;
        int temp[]=new int[10];
        int i=0;
        while(n>0)
        {
            temp[i++]=n%2;
            n/=2;
        }
        for(int j=i-1  ;j>=1;j--)
        {
            System.out.print(temp[j]);
        }
    }
}


/*

class day_1
{
    public static void main(String [] arr)
    {
        System.out.println("Rushikesh");
    }

}


/*
class day_1
{
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7,7,90,43,8};
        for(int i=0;i<arr.length-1;i+=2)
        {
            for(int j=1;j<=1;j++)
            {
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] +" ");
        }

    }
}


/*
import java.io.Serializable;
import java.rmi.Remote;

class simple implements Serializable,Cloneable, Remote
{

}


class day_1
{
    public static void main(String[] args) {

    }
}


/*
class simple extends Thread
{
    int fun() throws InterruptedException {
        for(int i=1;i<=10; i++)
        {
            System.out.println("this the method inside the runinterface");
        }

        Thread.sleep(100);

        return 0;
    }

    @Override
    public void run()
    {
        try {
            fun();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        fun2();
    }
    int fun2()
    {
        for(int i=1;i<10;i++)
        {
            System.out.println("this is the second function ");
        }
        return 0;
    }

}
class day_1
{
    public static void main(String[] args) {
//
        simple obj=new simple();
        obj.start();
    }
}

/*
interface  simple
{
    int fun(int i);
}
class day_1
{
    public static void main(String[] args) {
        simple obj=new simple() {
            @Override
            public int fun(int i) {
                return i;
            }
        };
        int s=obj.fun(90);
        System.out.println(s);
    }
}

/*
interface simple {
    int  fun(int a);
}

class day_1 {
    public static void main(String[] args) {
      simple obj=(int a)-> a;

        System.out.println(obj.fun(9));
    }
}


        /*
        simple obj=new simple() {
            @Override
            public int fun() {
                return 4;
            }
        };
        System.out.println(obj.fun());
    }
}

/*
class day_1
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<=n;j++)
            {
                System.out.print(" ");
            }
            for (int j=n;j>=  n+1-i;j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}


/*
class day_1
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int j=i;j<n;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*
class day_1
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int j=i;j<=n;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}



/*
class day_1
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int j=i;j<=n;j++)
            {
                System.out.print((char)(n+1-i+64));
            }
            System.out.println();
        }
    }
}

/*
class day_1
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=n+1-i;j++)
            {
                System.out.print((char)(i+64));
            }
            System.out.println();
        }
    }
}


/*
class day_1
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int j=i;j<=n;j++)
            {
                System.out.print(n+1-i);
            }
            System.out.println();
        }
    }
}

/*
class day_1
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<n;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print((char)(i+64));
            }
            System.out.println();
        }
    }
}


/*
class day_1
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=n+1-i;j++)
            {
                System.out.print((char)(i+64));
            }
            System.out.println();
        }
    }
}

/*
class day_1
{
    public static void main(String[] args) {
        int n=5;
        for(int i=n;i>=1;i--)
        {

            for(int j=i;j<n;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(i+1-j);
            }
            System.out.println();
        }
    }
}

/*
class day_1
{
    public static void main(String[] args) {
        int n=5;
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int j=i;j<=n;j++)
            {
                System.out.print(j);
            }
            System.out.println();

        }
    }
}


/*
class day_1
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<=n;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=n+1-i;j++)
            {
                System.out.print();
            }
        }
    }
}


/*
class day_1
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<n;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(n+1-j);
            }
            System.out.println();
        }
    }
}


/*
class day_1
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<n;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}



/*
class day_1
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<n;j++)
            {
                System.out.print(" ");
            }
            for(int j=n;j>=n+1-i;j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}



/*
class day_1
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<n;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

/*
class day_1
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

/*
class day_1
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n+1-i;j++)
            {
                System.out.print(n+1-i);
            }
            System.out.println();
        }
    }
}



/*
class day_1
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}



/*
class day_1
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n+1-i;j++)
            {
                if(j==1||i==1||j==n+1-i)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}


/*

class day_1
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
               if(j==1||i==n||j==i)
               {
                   System.out.print("*");
               }
               else {
                   System.out.print(" ");
               }
            }
            System.out.println();
        }
    }
}





/*
class day_1
{
    public static void main(String[] args) {
        int n=5;
        int col_counter=n/n;
        for(int i=1;i<=n;i++)
        {
            int row_counter=col_counter;
            for(int j=1;j<=i;j++)
            {
                System.out.print(row_counter +"\t");
                row_counter +=n-j;
            }
            col_counter++;
            System.out.println();
        }
    }
}



/*
class day_1
{
    public static void main(String[] args) {
        int n=5;
        int col_counter=((n*n)+n)/2;
        for(int i=1;i<=n;i++)
        {
            int row_counter=col_counter;
            for(int j=1;j<=i;j++)
            {
                System.out.print(row_counter++ +"\t");
            }
            col_counter-=i+1;
            System.out.println();
        }
    }
}

/*
class day_1 {
    public static void main(String[] args) {
        int n = 5;
        int col_counter = n / n;
        for (int i = 1; i <= n; i++) {
            int row_counter = col_counter;
            for (int j = 1; j <= i; j++) {
                System.out.print(row_counter + "\t");
                row_counter--;
            }
            col_counter += i + 1;
            System.out.println();
        }
    }
}

/*

class day_1
{
    public static void main(String[] args) {
        int n=5;
        int col_counter=((n*n)+n)/2;
        for(int i=1;i<=n;i++)
        {
            int row_counter=col_counter;

            for(int j=1;j<=i;j++)
            {
                System.out.print(row_counter--+"\t");
            }
            col_counter-=i;
            System.out.println();
        }
    }
}

/*
class day_1
{
    public static void main(String[] args) {
        int n=5;
        int col_counter=(n/n);
        for(int i=1;i<=n;i++)
        {
            int row_counter=col_counter;
            for(int j=1;j<=i;j++)
            {
                System.out.print(row_counter++ +"\t");
            }
            col_counter+=i;
            System.out.println();
        }

    }
}

/*
class main
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            System.out.print();
        }
    }
}


/*
class day_1
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int j=i;j<=n;j++)
            {
                System.out.print((char)(n-j+((int )('a'))));
            }
            System.out.println();
        }
    }
}



/*
class day_1
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=n+1-i;j++)
            {
                System.out.print((char)(n-j+((int)('a'))));
            }
            System.out.println();
        }
    }
}



/*
class day_1
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int j=i;j<=n;j++)
            {
                System.out.print((char)(j+64));
            }
            System.out.println();
        }
    }
}


/*
class day_1 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n + 1 - i; j++) {
                System.out.print((char) (i + 64));
            }
            System.out.println();
        }
    }
}


/*
class day_1 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= n; j++) {
                System.out.print(n + 1 - j);
            }
            System.out.println();
        }
    }
}

/*
class day_1
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int j=i;j<=n;j++)
            {
                System.out.print(n+i-j);
            }
            System.out.println();
        }
    }
}

/*
class day_1
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int j=i;j<=n;j++)
            {
                System.out.print(n+1-i);
            }
            System.out.println();
        }
    }
}



/*
class day_1
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int j=i;j<=n;j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

/*
class day_1
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<n+1-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--)
            {
                System.out.print((char)(j+96));
            }
            System.out.println();
        }
    }
}


/*
class day_1
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n+1-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print((char)(j+64));
            }
            System.out.println();
        }
    }
}



/*
class day_1
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<n;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print((char)(i+64));
            }
            System.out.println();
        }
    }
}


/*
class day_1
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<n;j++)
            {
                System.out.print(" ");
            }
            for(int j=n+1-i;j<=n;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}


/*
class day_1
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<n;j++)
            {
                System.out.print(" ");
            }
            for(int j=n;j>=n+1-i;j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}


/*
class day_1
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<n;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

/**
class day_1
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n+1-i;j++)
            {
                System.out.print(n+1-i);
            }
            System.out.println();
        }
    }
}


/*


class day_1
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n+1-i;j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}


/*
class day_1
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print((char)(n+1-j));
            }
            System.out.println();
        }
    }
}

/*

class day_1
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print((char)(j+64));
            }
            System.out.println();
        }
    }
}



/*

class day_1
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j>=1;j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

/*
class day_1
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}


/*
class day_1
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(n+1-i);
            }
            System.out.println();
        }
    }
}

/*

class day_1
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
/*
class day_1
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                System.out.print((char)((n+1-j)+96));
            }
            System.out.println();
        }
    }
}


/*

class day_1
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<=n;j++)
            {
                if(i==1||j==n||i==j)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}


/*
class day_1
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(j==1||i==n||j==i)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}



/*
class day_1
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                System.out.print((char)(64+i));
            }
            System.out.println();
        }
    }
}


/*

class day_1
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                System.out.print(n+1-i);
            }
            System.out.println();
        }
    }
}
/*
class day_1
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                System.out.print(n+1-j);
            }
            System.out.println();
        }
    }
}



/*
class day_1
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}


/*
class day_1
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}




/*
import java.util.Scanner;

class day_1
{

    public static  void dtoh(int des)
    {
        char []arr=new char[50];
        int i=0;
        while (des>0)
        {
            int temp=des%16;
            if(temp<10)
            {
                arr[i++]=Character.forDigit(temp+48,0);
            }
            else
            {
                arr[i++]=Character.forDigit(temp+58,0);
            }
            des/=16;
        }
        for (int j=0;j<=i;j++)
        {
            System.out.println(arr[j]);
        }
    }

    public  static  int binnarytodecimal(int sum)
    {
        int des=0;
        int i=0;
        while (sum>0)
        {
            int temp=sum%10;
            des=des+temp*(int) Math.pow(2,i++);
            sum/=10;
        }
        return des;
    }
    public static String fun(int num)
    {
        StringBuilder stringBuilder= new StringBuilder();
        while (num>0)
        {
            int a=num%2;
            stringBuilder.append(a);
            num/=2;
        }
        //System.out.println(stringBuilder);
        char []arr=new char[stringBuilder.length()];
        String str=stringBuilder.toString();
        //System.out.println(str);
        arr=str.toCharArray();
        stringBuilder.delete(0,stringBuilder.length());
        for(int i=arr.length-1;i>=0;i-- )
        {
            stringBuilder.append(arr[i]);
        }
        str=stringBuilder.toString();
        return str;
    }
    public static void main(String[] args) {
        int num;
        Scanner scanner=new Scanner(System.in);
        num=scanner.nextInt();
        String str=fun(num);
        int des=Integer.parseInt(str) ;
        System.out.println("This is the binary number:="+des);
       int res= binnarytodecimal(des);
        System.out.println("This is the decimal number:="+res);


        //-------------------------decimal to hexadecimal-------------------------------------------------
        dtoh(res);
    }
}

/*
import java.util.Arrays;
import java.util.Scanner;

class day_1
{
    public static void decimaltobinnary(int num)
{
    int arr[] = new int[10];
    int i=0;
    while(num>0)
    {
        arr[i++]=num%2;
        num/=2;
    }
   for(int j=i-1;j>=0;j--)
   {
       System.out.print(arr[j]);
   }
//   String str= Arrays.toString(arr);
//    System.out.println(str);
}
    public static void main(String[] args) {
        int num;
        Scanner scanner=new Scanner(System.in);
        num=scanner.nextInt();

        decimaltobinnary(num);

    }
}

/*
import java.util.Scanner;

class day_1
{
    public  static void fun(int sum)
    {
        if(sum>0)
        {
            fun(sum/2);
        }
        System.out.print(sum%2);
    }
    public static void main(String[] args) {
        int n;
        Scanner scanner =new Scanner(System.in);
        n=scanner.nextInt();
        fun(n);
    }
}


/*
class day_1
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<=n;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


/*
class day_1
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<n;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                if((i+j)%2==0)
                {
                    System.out.print("1");
                }
                else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}



/*
class day_1
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(j);
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(n+1-i);
            }
            System.out.println();
        }
    }
}

/*
class day_1
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<n;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=(i*2)-1;j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}


/*
class day_1
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<n;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=(i*2)-1;j++)
            {
               if(i==n|| j==(i*2)-1|| j==1)
               {
                   System.out.print("*");
               }
               else
               {
                   System.out.print(" ");
               }
            }
            System.out.println();
        }
    }
}


/*
class day_1
{
    public static void main(String[] args) {
        int arr[]={1,2,4,6,7,7,8,8};
        int sum=0;
        for(int i=0;i<arr.length/2;i++)
        {
            sum+=arr[i];
        }
        for(int i=0;i<arr.length/2;i++)
        {
            arr[i]=sum;
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}




/*


class day_1
{
    public static void main(String[] args) {
        int arr[]={1,2,4,5,6,7,5,75,5,3,333,3,3,3,4};
            for(int i=0;i<arr.length;i++)
            {
                for(int j=i+1;j<arr.length;j++)
                {
                    if(arr[i]>arr[j])
                    {
                        int temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                }
            }
            for (int i=0;i<arr.length;i++)
            {
                System.out.print(arr[i] +" ");
            }
    }
}



/*

class day_1
{
    public static void main(String[] args) {
        int arr[]={94,78,33,2,4,3,32,24,224,2,2,3,4,422,4};
        for(int i=0;i<arr.length-1;i++)
        {
            int min=i;
            for (int j=i+1;j< arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}


/*
class reading implements  Runnable
{
    public  void read()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("i am reading the book");
        }
    }
    @Override
    public void run() {
        read();
    }
}
class  watching implements  Runnable
{
    public void watch()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println("I am watching the moives");
        }
    }

    @Override
    public void run() {

        watch();
    }
}
class day_1
{
    public static void main(String[] args) {
        watching w= new watching();
        reading r =new reading();
        Thread obj1= new Thread(w);
        Thread boj2=new Thread(r);
        obj1.getName();
        boj2.start();
        obj1.start();
    }
}
/*
class writtting extends Thread
{
    public void writt()
    {
        for(int i=1;i<=10;i--)
        {
            System.out.println("writing the book");
        }
    }
    @Override
    public void run()
    {
        writt();
    }
}
class  reading extends  Thread
{
    public  void  read()
    {
        for(int i=1;i<10;i--)
        {
            System.out.println("reading the book");
        }
    }

    @Override
    public void run()
    {
        read();
    }
}
class  lesting extends  Thread
{
    public  void music()
    {
        for(int i=1;i<=10;i--)
        {
            System.out.println("i am leaning the song");
        }
    }
   public void run()
    {
       music();
    }
}
class day_1
{
    public static void main(String[] args) {
        lesting l=new lesting();
        writtting w =new writtting();
        reading r=new reading();
        w.start();
        l.start();
        r.start();
    }
}

/*
class simple implements Runnable
{

    int a=90;
    public static void fun()
    {
        System.out.println("this is method ");
    }

    simple obj=new simple();
    @Override
    public void run() {
        fun();
    }
}
class day_1
{
    public static void main(String[] args) {
        simple o=new simple();
        Thread obj= new Thread(o);
        obj.start();

    }
}

/*
class simple extends  Thread
{
    int a=10;

    @Override
    public void run() {
        super.run();
    }
}



/*

import java.util.Scanner;

class day_1
{
    public static void fun(String n){
        char hexa[]=new char[10];
        int i=0;
        if(n.charAt(i)>0)
        {
         int rem=n%16;
         if(rem<10)
         {
             hexa[i]=rem+48;
         }
        }
    }
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        fun(str);
    }
}

/*
import java.util.Scanner;

class day_1
{
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        String []hexa=new String[100];
        hexa=scanner.nextLine();
        for(int i=str.length()-1;i>=0;i--)
        {
            if (hexa[i]>'0' && hexa[i]<'9')
            {

            }
        }
    }
}


/*

class  day_1
{
    public static void fun(int num)
    {
        if(num>0)
        {
            fun(num/2);
        }
        System.out.print(num%2);
    }
    public static void main(String[] args) {
        int n=100101;
        int des=0;
        int temp=n;
        int i=0;
        while (temp>0)
        {
            int rem=temp%10;
            des=des+rem*(int)Math.pow(2,i);
            i++;
            temp/=10;
        }
        System.out.println(des);
        System.out.println("this is the converting the decimal");
        fun(des);
    }
}


/*

class day_1
{
    public static void fun(int n)
    {

        int i=0;

        if(n>0)
        {
            fun(n/2);
        }
        System.out.print(n%2);
    }
    public static void main(String[] args) {
        int n=90;
        fun(n);
    }
}



// Java implementation of the above approach


/*
import java.util.*;

class day_1{

    // Function to find the lexicographically
// smallest String of minimum characters
// not present as subString in String S
    static void lexicographicalSmallestString(char[] S, int n)
    {

        // Set which stores all subStrings
        // of the String S
        HashSet<String> collection = new HashSet<String>();

        // Constructing all subStrings of S
        for (int i = 0; i < n; ++i) {
            String cur="";
            for (int j = i; j < n; ++j) {
                cur+=(S[j]);

                // Inserting the current
                // subString to set
                collection.add(cur);
            }
        }

        Queue<String> q = new LinkedList<String>();

        // Initializing BFS queue
        for (int i = 0; i < 26; ++i) {
            q.add(String.valueOf((char)((i + 'a'))));
        }

        // Loop for the BFS Traversal
        while (!q.isEmpty()) {

            // Stores the current
            // lexicographically smallest
            // String of min characters
            String cur = q.peek();
            q.remove();

            // If the current String is
            // not present as a subString
            // of the given String
            if (!collection.contains(cur)) {

                // Print Answer
                System.out.print(cur +"\n");
                return;
            }

            // Append characters from [a-z]
            // to the back of String cur
            // and push into the queue.
            for (int i = 0; i < 26; ++i) {
                cur+=String.valueOf((char)((i + 'a')));
                q.add(cur);
                cur=cur.substring(0,cur.length()-1);
            }
        }
    }

    // Driver Code
    public static void main(String[] args)
    {
        String S;
        Scanner scanner=new Scanner(System.in);
        S=scanner.nextLine();
        int N = S.length();

        lexicographicalSmallestString(S.toCharArray(), N);
    }
}




/*
import java.util.Scanner;

public class day_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] lines = new String[4]; // Set the array size to 4 to read 4 lines

        for (int i = 0; i < 4; i++) {
            lines[i] = scanner.nextLine();
        }

        // Find common characters
        String commonChars = findCommonCharacters(lines);

        // Print the result
        System.out.println(commonChars);
    }

    // Function to find common characters in an array of strings
    private static String findCommonCharacters(String[] lines) {
        if (lines.length == 0) {
            return "";
        }

        String commonChars = lines[0];

        for (int i = 1; i < lines.length; i++) {
            commonChars = findCommonCharacters(commonChars, lines[i]);
        }

        return commonChars;
    }

    // Function to find common characters in two strings
    private static String findCommonCharacters(String str1, String str2) {
        StringBuilder result = new StringBuilder();

        int minLength = Math.min(str1.length(), str2.length());

        for (int i = 0; i < minLength; i++) {
            if (str1.charAt(i) == str2.charAt(i)) {
                result.append(str1.charAt(i));
            } else {
                break;
            }
        }

        return result.toString();
    }
}
/*

import java.util.Scanner;

public class day_1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line;
        String commonChars = "";

        boolean firstLine = true;

        while (scanner.hasNextLine()) {
            line = scanner.nextLine();

            if (line.isEmpty()) {
                break; // Stop when an empty line is encountered
            }

            if (firstLine) {
                commonChars = line;
                firstLine = false;
            } else {
                commonChars = findCommonCharacters(commonChars, line);
            }
        }

        // Print the result
        System.out.println(commonChars);
    }

    // Function to find common characters in two strings
    private static String findCommonCharacters(String str1, String str2) {
        StringBuilder result = new StringBuilder();

        int minLength = Math.min(str1.length(), str2.length());

        for (int i = 0; i < minLength; i++) {
            if (str1.charAt(i) == str2.charAt(i)) {
                result.append(str1.charAt(i));
            } else {
                break;
            }
        }

        return result.toString();
    }
}
/*
import java.util.Scanner;

public class day_1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] lines = new String[100]; // Assuming a maximum of 100 lines, you can adjust this as needed.
        int lineCount = 0;

        // Read input lines
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.isEmpty()) {
                break; // Stop when an empty line is encountered
            }
            lines[lineCount] = line;
            lineCount++;
        }

        // Find common characters
        StringBuilder result = new StringBuilder();
        int minLength = Integer.MAX_VALUE;

        for (int i = 0; i < lineCount; i++) {
            if (lines[i].length() < minLength) {
                minLength = lines[i].length();
            }
        }

        for (int i = 0; i < minLength; i++) {
            char commonChar = lines[0].charAt(i);
            boolean isCommon = true;

            for (int j = 1; j < lineCount; j++) {
                if (lines[j].charAt(i) != commonChar) {
                    isCommon = false;
                    break;
                }
            }

            if (isCommon) {
                result.append(commonChar);
            } else {
                break;
            }
        }

        // Print the result
        System.out.println(result.toString());
    }
}
/*

public class day_1 {
    static  int  fun(int arr)
    {
        int numberOfPairs = (arr * (arr - 1)) / 2;
        return numberOfPairs;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int N = sc.nextInt();



        System.out.println("Number of possible pairs: " + fun(N));
    }
}


/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class day_1 {
    public static int[] fun(int n, int k) {
        int[] arr = new int[k];
        for (int i = 0; n > 0; i = (i + 1) % k) {
            int candies = Math.min(n, i + 1);
            arr[i] += candies;
            n -= candies;
        }
        return arr;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the number of candies (N): ");
        int n = Integer.parseInt(reader.readLine());
        System.out.print("Enter the number of slots (K): ");
        int k = Integer.parseInt(reader.readLine());

        int[] res = fun(n, k);

        System.out.print("Candies in slots: ");
        for (int i : res) {
            System.out.print(i + " ");
        }
    }
}



/*
import java.util.Scanner;

public class day_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int[] arr = new int[k];
        for (int i = 0; n > 0; i = (i + 1) % k) {
            int candies = Math.min(n, i + 1);
            arr[i] += candies;
            n -= candies;
        }

        for (int candiesInSlot : arr) {
            System.out.print(candiesInSlot + " ");
        }
    }
}


/*
import  java.util.*;

public class day_1 {

    static void candies(int n, int k) {
        int[] arr = new int[k];
        int remainingCandies = n;
        int distributedCandies = 1;
        int currentIndex = 0;

        while (remainingCandies > 0) {
            if (remainingCandies < distributedCandies) {
                arr[currentIndex] += remainingCandies;
                break;
            }

            arr[currentIndex] += distributedCandies;
            remainingCandies -= distributedCandies;
            currentIndex = (currentIndex + 1) % k;
            distributedCandies++;
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();
        candies(n, k);
    }
}


//------------------------------------------------------------------------------------------

/*
public class day_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int result = solution(N);
        System.out.println(result);
    }

    public static int solution(int N) {
        int count = 0;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                // Calculate the return on investment
                int returnOnInvestment = i * j;
                if (isPerfectSquare(returnOnInvestment)) {
                    count++;
                }
            }
        }
        return count;
    }

    public static boolean isPerfectSquare(int num) {
        // Check if a number is a perfect square
        int sqrt = (int) Math.sqrt(num);
        return sqrt * sqrt == num;
    }
}
/*

import java.util.Scanner;

public class day_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int N = sc.nextInt();

        int numberOfPairs = (N * (N - 1)) / 2;

        System.out.println("Number of possible pairs: " + numberOfPairs);
    }
}

/*
public class day_1 {
    public static void main(String[] args) {
        int n = 3;
        for (int i = 1; i <= n; i++) {
            int result = i;
            if (i == n) {
                result = 0;
            }
            System.out.print(result);
            if (i < n) {
                System.out.print(" ");
            }
        }
    }
}


/*

public class day_1 {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 1; i <= 5; i++) {
            int result = n - i;
            System.out.print(result);
            if (i < 5) {
                System.out.print(" ");
            }
        }
    }
}


/*
class day_1
{
    public  static int fib(int n)
    {
        if(n==1||n==0)
        {
            return n;
        }
        else
        {
            return fib(n-1)+fib(n-1);
        }
    }
    public static void main(String[] args) {
        int n=10;
        for(int i=0;i<=n;i++)
        {
            System.out.print(fib(i)  +" ");
        }
    }
}

/*
class day_1
{



    public  static  int fib(int n)
    {
        if(n==1|| n==0)
        {
            return n;
        }
        else
        {
            return fib(n-1)+fib(n-2);
        }
    }
    public static void main(String[] args) {
        int n=12;
        int res=fib(n);
        System.out.println(res);
    }
}


/*
class day_1
{
    public static int  fib(int n)
    {
        if(n==1|| n==0)
        {
            System.out.println("enter the valid number");
        }
        System.out.println(fib(n-1)+fib(n-2) +" ");
        return 0;
    }
    public static void main(String[] args) {
        int n=19;
       fib(n);
    }
}
/*
import java.util.Scanner;

class day_1
{
    public static void main(String[] args) {
        int arr[]={1,2,34,6,5,5,4,4,3,3};
        Scanner scanner=new Scanner(System.in);
        int key=scanner.nextInt();
        for(int i=1;i<=arr.length;i++)
        {
            for(int j=i+1;j<=arr.length;j++)
            {
                if(key==arr[i])
                {
                    System.out.print(arr[i]);
                    break;
                }
            }
        }
    }
}
/*


class day_1
{
    public static void main(String[] args) {
        int []arr={1,1,2,4,1,5,6,64,4};
        int counter=13;
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+""+counter-- +" ");
        }
    }
}

/*
class day_1
{
    public static void main(String[] args) {
        int []arr={1,2,3,56,6,7,85,5,90};
        int n=3;
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                int temp=arr[i]+arr[j];
                if(temp==n)
                {
                    System.out.print(arr[i]+" "+arr[j]);
                }
            }
        }
    }
}

/*
class day_1
{
    public static void main(String[] args) {
        String str="12345";
        char []arr=str.toCharArray();
        char temp=arr[0];
        arr[0]=arr[arr.length-1];
        arr[arr.length-1]=temp;
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
        }
    }
}


/*
class day_1
{
    public  static  int fib(int n)
    {
        if(n==0 || n==1)
        {
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
        int n=12;
        System.out.println(fib(n));

    }
}


/*
class day_1
{
    public static void main(String[] args) {
        int n=121;
        int check=n;
        int rev=0;
        while(n!=0)
        {
            int temp=n%10;
            rev=rev*10+temp;
            n/=10;

        }
        if(check==rev)
        {
            System.out.println("yes");
        }
    }
}


/*

class day_1
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<n;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=(i*2)-1;j++)
            {
                if(i==n||j==(i*2)-1||j==1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
}







/*

class day_1
{
    public static void main(String[] args) {
        int a=153;
        int temp=a;
        int len =0;
        while(a!=0)
        {
            a/=10;
            len++;
        }
        a=temp;
        int sum=0;
        while (a!=0)
        {
            int res=a%10;
            sum+=(int)Math.pow(res,len);
            a/=10;
        }
        if(sum==temp)
        {
            System.out.println("Yes");
        }

    }
}






/*
import java.util.Scanner;

class checkprime {
    public static boolean isprime(int n) {
        boolean check = true;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                check = false;
            }
        }
        return check;
    }
}

class day_1 {
    public static void main(String[] args) {
        int counter = 0;
        System.out.println("Enter the particular number:");
        Scanner scanner = new Scanner(System.in);
        int i = 1;
        int number = scanner.nextInt();
        while (counter != number) {
            i++;
            if (checkprime.isprime(i)) {
                counter++;
                System.out.print(i+" ");
            }

        }
        System.out.println(i);
    }
}
/*
import java.util.Scanner;
 class  simple
{
    public  static boolean function(int n)
    {
        boolean check=true;
        for(int i=2;i<n/2;i++)
        {
            if(n%i==0)
            {
                check =false;
                break;
            }
        }
        return check;
    }
}
public class day_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int i=1;
        while (i<=n)
        {
            if(simple.function(i))
            {
                System.out.println(i);
            }
            i++;
        }
    }
}


/*
import java.util.Scanner;
class simple
{
    public  static  boolean function( int n)
    {
        if(n%400==0)
        {
            return true;
        }
        else if(n%100 !=0 && n%4==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class day_1
{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n=scanner.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(simple.function(i))
            {
                System.out.println("This are leaf year:"+i);
            }
        }
    }
}


/*

class day_1
{
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,2,1,2455,6,6,6322,};
        int max=arr[0];
        int max2 = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(max<arr[i])
            {
                max2=max;
                max=arr[i];

            }
        }
        System.out.println("First largest element in array:"+max);
        System.out.println("Second largest element in array"+max2);
    }
}


/*
class day_1
{
    public static void main(String[] args) {
        int n=5;
        int col_counter=((n*n)+n)/2;
        for(int i=1;i<=n;i++)
        {
            int row_counter=col_counter;
            int row_counter1=col_counter;
            for(int k=1, j=i;k<=n+1-i||j<=n;k++,j++)
            {
                System.out.print((char)(row_counter+64)+""+(char)(row_counter1+64)+"\t");
                row_counter-=n+1-j;
                row_counter1-=k;
            }
            System.out.println();
            col_counter--;
        }
    }
}





/*
class day_1
{
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,78,9,97};
        for(int i=0;i<arr.length;i++)
        {
            int temp=arr[0];
            arr[0]=arr[arr.length-1];
            arr[arr.length-1]=temp;
            break;
        }
        for (int i=0;i< arr.length;i++)
            System.out.print(arr[i] +" ");
    }
}



/*
import java.io.*;
import java.util.*;
import java.text.NumberFormat;
import java.text.DecimalFormatSymbols;

public class day_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Create a custom locale for India
        Locale indiaLocale = new Locale("en", "IN");

        // Create a custom DecimalFormatSymbols for India
        DecimalFormatSymbols customSymbols = new DecimalFormatSymbols(indiaLocale);
        customSymbols.setCurrencySymbol("RS."); // Set the currency symbol to "RS."

        // Create a custom NumberFormat for India with the custom symbols
        NumberFormat in = NumberFormat.getCurrencyInstance(indiaLocale);
        ((java.text.DecimalFormat) in).setDecimalFormatSymbols(customSymbols);

        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat fr = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        NumberFormat ch = NumberFormat.getCurrencyInstance(Locale.CHINA);

        String paymentInIndia = in.format(payment);
        String paymentInUS = us.format(payment);
        String paymentInFrance = fr.format(payment);
        String paymentInChina = ch.format(payment);

        System.out.println("US: " + paymentInUS);
        System.out.println("India: " + paymentInIndia);
        System.out.println("China: " + paymentInChina);
        System.out.println("France: " + paymentInFrance);
    }
}

/*
import java.io.FileOutputStream;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

import java.io.*;
import java.util.*;

import java.text.NumberFormat;
import java.util.Locale;

class day_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Create a custom locale for India with the "Rs." currency symbol
        Locale indiaLocale = new Locale("en", "IN");

        NumberFormat in = NumberFormat.getCurrencyInstance(indiaLocale);
        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat fr = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        NumberFormat ch = NumberFormat.getCurrencyInstance(Locale.CHINA);

        String paymentInIndia = in.format(payment);
        String paymentInUS = us.format(payment);
        String paymentInFrance = fr.format(payment);
        String paymentInChina = ch.format(payment);

        System.out.println("US: " + paymentInUS);
        System.out.println("India: " + paymentInIndia);
        System.out.println("China: " + paymentInChina);
        System.out.println("France: " + paymentInFrance);
    }
}



/*
class day_1 {
    public static void main(String[] args) {

        double value = 1232.2;

        Locale localeu = Locale.UK;
        //Locale localei = Locale.IN;
        Locale localec = Locale.CHINA;
        Locale localef = Locale.FRANCE;

        // Create a NumberFormat instance for currency formatting in the specified locale
        NumberFormat currencyFormatter1 = NumberFormat.getCurrencyInstance(localeu);
        //NumberFormat currencyFormatter2 = NumberFormat.getCurrencyInstance(localei);
        NumberFormat currencyFormatter3 = NumberFormat.getCurrencyInstance(localec);
        NumberFormat currencyFormatter4 = NumberFormat.getCurrencyInstance(localef);
        String formattedCurrency = currencyFormatter1.format(value);
        //String formattedCurrency2 = currencyFormatter2.format(value);
        String formattedCurrency3 = currencyFormatter3.format(value);
        String formattedCurrency4 = currencyFormatter4.format(value);
        System.out.println("US: "+ formattedCurrency);
        System.out.println("India:"+" Rs.12,324.13");
        System.out.println("China: " + formattedCurrency3);
        System.out.println("France: "+formattedCurrency4);
    }
}

 /*
/*
import jdk.internal.icu.text.UnicodeSet;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year


    public static String findDay(int month, int day, int year) {
        Calendar calendar = Calendar.getInstance();
         calendar.set(year,month,day);
        int n = calendar.get(Calendar.DAY_OF_WEEK);
         String []str={"", "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY","FRIDAY", "SATURDAY"};
         return str[n];
    }

}

public class day_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}


/*
class day_1
{
    public static void main(String[] args) {
        int []arr={1,2,4,5,6,7,8};
        int min=arr[5];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        System.out.println(min);
    }
}

/*
import java.util.Scanner;

class day_1
{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n=scanner.nextInt();
        int []arr=new int[n];

        for(int i=1;i<n;i++)
        {
           arr[i]=scanner.nextInt();
        }

        for(int i=1;i<arr.length-1;i++)
        {
            int min=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[min])
                {
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        for (int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+ " ");
        }
    }
}



/*
*********
 *******
  *****
   ***
    *
   ***
  *****
 *******
*********



class day_1
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=2*n-(2*i-1);j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--)
        {
            for(int j=1;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=2*n-(2*i-1);j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}




/*
*********
 *******
  *****
   ***
    *

class day_1
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=2*n-(2*i-1);j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*
class day_1
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for( int j=1;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=2*n-2*i-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


/*
import java.util.Arrays;
import java.util.Scanner;

public class day_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // Number of test cases

        for (int t = 0; t < T; t++) {
            int N = sc.nextInt(); // Array size
            int K = sc.nextInt(); // Maximum swaps allowed

            int[] A = new int[N];
            int[] B = new int[N];
            int sum1=0;
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
                sum1 += A[i];

            }
            int sum2=0;
            for (int i = 0; i < N; i++) {
                B[i] = sc.nextInt();
                sum2+=B[i];
            }

            if(sum1>sum2)
            {
                if(sum1>10)
                {
                    sum1=sum1-1;
                    System.out.println(sum1);
                }
                else
                {
                    System.out.println(sum1);
                }
            }
            else
            {
                if(sum2>10)
                {
                    sum2=sum2-1;
                    System.out.println(sum2);
                }
                else
                {
                    System.out.println(sum2);
                }
            }



        }
    }
}




/*
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;



class TestClass {
    public static void main(String args[] ) throws Exception {
      Scanner scanner= new Scanner(System.in);
    //   int n=scanner.nextInt();
    //   int m=scanner.nextInt();
    int []arr1=new int[scanner.nextInt()];
    int []arr2=new int [scanner.nextInt()];


      //this is for first array
      int sum1=0;
      for(int i=0;i<arr1.length;i++)
      {
        arr1[i]=scanner.nextInt();
        sum1 +=arr1[i];
      }

      int sum2=0;
     //This is for second array

     for(int i=0;i<arr2.length;i++)
     {
        arr2[i]=scanner.nextInt();
         sum2 +=arr2[i];
     }
     System.out.println(sum2);
     System.out.println(sum1);
    }
}
*/




/*
import java.util.Scanner;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class day_1 {
    public static void main(String args[] ) throws Exception {
        Scanner scanner= new Scanner(System.in);
        int n=scanner.nextInt();
        //   int n=scanner.nextInt();
        //   int m=scanner.nextInt();
        int []arr1 = new int[scanner.nextInt()];
        int []arr2=new int[scanner.nextInt()];


        //this is for first array
        int sum1=0;
        for(int i=0;i<arr1.length;i++)
        {
            arr1[i]=scanner.nextInt();
            sum1 +=arr1[i];
        }

        int sum2=0;
        //This is for second array

        for(int i=0;i<arr2.length;i++)
        {
            arr2[i]=scanner.nextInt();
            sum2 +=arr2[i];
        }
        System.out.println(sum2);
        System.out.println(sum1);
    }
}


/*



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class day_1 {
    public static boolean cubeRoot(int n) {
        for (int i = 1; i < n / 2; i++) {
            if (i * i * i == n) {
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]) throws Exception {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int prod = 1;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                prod *= arr[j];
                if (cubeRoot(prod)) {
                    count++;
                }
                if (prod == 0) {
                    prod = 1;
                }
            }
        }
        System.out.print(count);
    }
}

/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class day_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        long[] num = new long[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            num[i] = Long.parseLong(st.nextToken());
        }

        int count = 0;
        long[] prefixSum = new long[n];
        long currentSum = 0;

        for (int i = 0; i < n; i++) {
            currentSum += num[i];
            prefixSum[i] = currentSum;
        }

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                long subarraySum = prefixSum[j] - (i > 0 ? prefixSum[i - 1] : 0);
                if (subarraySum % 3 == 0) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}

/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class day_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // Read the elements of the array and add them to the sum
        long[] num = new long[n];
        for (int i = 0; i < n; i++) {
            num[i] = Long.parseLong(br.readLine()); // Use Long.parseLong for large integers
        }

        // Find and print all subarrays
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(num[k] + " ");
                }
                System.out.println();
            }
        }
    }
}


/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public  class day_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader( new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());

        long sum = 0; // We use long to handle large integers

        // Read the elements of the array and add them to the sum

        long[]num= new long[n];
        Scanner scanner=new Scanner(System.in);
        for(int i=0;i<=n;i++)
        {
             num[i] =scanner.nextLong();// Use Long.parseLong for large integers

        }
        for (int i=0;i<num.length;i++)
        {
            for(int j=0;j<i;j++)
            {
                for(int k=i;k<j;k++);
                {
                    System.out.print(num[i]);
                }
            }
        }
    }
}

/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class day_1{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Read the size of the array
        int N = Integer.parseInt(br.readLine());

        // Initialize a variable to store the sum
        long sum = 0; // We use long to handle large integers

        // Read the elements of the array and add them to the sum
        StringTokenizer st = new StringTokenizer(br.readLine());< N; i++) {
            long num = Long.parseLong(st.nextToken()); // Use Long.parseLong for large integers
            sum += num;
        for (int i = 0; i
        }

        // Close the BufferedReader
        br.close();

        // Print the sum
        System.out.println(sum);
    }
}



/*
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class day_1 {
    public static void main(String args[]) throws Exception {
        // BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str[] = new String[5];
        for (int i = 0; i < 5; i++) {
            str[i] = br.readLine(); // Reading input from STDIN
        }

        // Writing output to STDOUT
        int sum = 0;
        for (int i = 0; i < str.length; i++) {

                sum+=Integer.parseInt(str[i]);

        }

        System.out.println("Sum of ASCII values of characters: " + sum);
    }
}


/*
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class day_1 {
    public static void main(String args[] ) throws Exception {
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         String str[]=new String[5];
        for(int i=0;i<5;i++)
        {
            str[i]=br.readLine(); // Reading input from STDIN
        }
        // Writing output to STDOUT
        int sum=0;
        for (int i=0;i<str.length;i++)
        {
              sum+=(int)str[i];
        }

    }
}


/*
class day_1
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int j=2*n-1;j>=2*i-1;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}



/*
    E
   DED
  CDEDC
 BCDEDCB
ABCDEDCBA

class day_1
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<n+1-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<i;j++)
            {
                System.out.print((char)(n-i+j+64));
            }
            for(int j=n;j>=n+1-i;j--)
            {
                System.out.print((char)(j+64));
            }
            System.out.println();
        }
    }
}


/*
    E
   EdE
  EdCdE
 EdCbCdE
EdCbAbCdE


class day_1
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<n;j++)
            {
                System.out.print(" ");
            }
            for(int j=n;j>n+1-i;j--)
            {
                if(j%2!=0)
                {
                    System.out.print((char)(j+64));
                }
                else
                {
                    System.out.print((char)(j+96));
                }
            }
            for(int j=n+1-i;j<=n;j++)
            {
                if(j%2!=0)
                {
                    System.out.print((char)(j+64));
                }
                else
                {
                    System.out.print((char)(j+96));
                }
            }
            System.out.println();
        }
    }
}


/*
    A
   BAB
  CBABC
 DCBABCD
EDCBABCDE



class day_1
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<n;j++)
            {
                System.out.print(" ");
            }
            for(int j=i;j>1;j--)
            {
                System.out.print((char)(j+64));
            }for(int j=1;j<=i;j++)
            {
                System.out.print((char)(j+64));
            }
            System.out.println();
        }
    }
}


/*
class  day_1
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<n;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<2*i-i;j++)
            {
                System.out.print((char)(j+64));
            }
            for(int j=1;j<=2*i-i;j++)
            {
                System.out.print((char)((2*i-i)-j+1+64));
            }
            System.out.println();
        }
    }
}



/*
    5
   454
  34543
 2345432
123454321

class day_1
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<n;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<2*i-i;j++)
            {
                System.out.print((n-i)+j);
            }
            for(int j=1;j<=2*i-i;j++)
            {
                System.out.print(n+1-j);
            }
            System.out.println();
        }
    }
}



/*
    5
   545
  54345
 5432345
543212345


class day_1
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<n;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<2*i-i;j++)
            {
                System.out.print(n+1-j);
            }
            for(int j=1;j<=2*i-i;j++)
            {
                System.out.print((n-i)+j);
            }
            System.out.println();
        }
    }
}


/*

class day_1
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<n;j++)
            {
                System.out.print(" ");
            }
            for(int j=i;j<2*i-1;j++)
            {
                System.out.print(j);
            }
            for(int j=1;j<=2*i-i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}



/*

class day_1
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<n+1-i;j++)
            {
                System.out.print(" ") ;
            }
            for(int j=i;j<2*i-1;j++)
            {
                System.out.print(i);
            }for(int j=i;j<=2*i-1;j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}


/*

class day_1
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<=n;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                if(j==1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            for(int j=2;j<=i;j++)
            {
                if(j==i)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--)
        {
            for(int j=i;j<=n;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                if(j==1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            for(int j=2;j<=i;j++)
            {
                if(j==i)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}


/*
class day_1
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<=n;j++)
            {
                if(i==1 || j==i|| j==n)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}


/*
import java.util.ArrayList;
import java.util.Scanner;

public class day_1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> inputs = new ArrayList<>();

        System.out.println("Enter your inputs (one per line). Enter 'exit' to stop.");
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            inputs.add(input);
        }

        // Process the inputs here
        System.out.println("You entered the following inputs:");
        for (int i = 0; i < inputs.size(); i++) {
            System.out.println("Input " + (i + 1) + ": " + inputs.get(i));
        }

        scanner.close();
    }
}


/*
import java.util.Scanner;

public class day_1 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String input = "hackerearth contests back";
        String[] parts = input.split(" ");
        StringBuilder outputPath = new StringBuilder("/home/hackerearth");

        for (int i = 1; i < parts.length && !parts[i].equals("back"); i++) {
            outputPath.append("/");
            outputPath.append(parts[i]);
        }

        System.out.println(outputPath.toString());
    }
}

/*
import java.util.Scanner;

public class day_1 {

    static void candies(int n, int k) {
        int[] arr = new int[k];
        int remainingCandies = n;
        int distributedCandies = 1;
        int currentIndex = 0;

        while (remainingCandies > 0) {
            if (remainingCandies < distributedCandies) {
                arr[currentIndex] += remainingCandies;
                break;
            }

            arr[currentIndex] += distributedCandies;
            remainingCandies -= distributedCandies;
            currentIndex = (currentIndex + 1) % k;
            distributedCandies++;
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();
        candies(n, k);
    }
}

/*
import java.util.Scanner;

class day_1
{
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i)
    }
}


/*
class day_1
{
    static  int linearsearch(int arr[], int key)
    {

        int index=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==key)
            {
                index=i;
            }
        }
            return index;
    }
    public static void main(String[] args) {
        int []arr={1,23,45,53,332,455,255,3};
        Scanner scanner=new Scanner(System.in);
        int key=scanner.nextInt();
        System.out.println(linearsearch(arr,key));
    }
}

/*
public class day_1 {
    public static void main(String[] args) {
        String input = "hackerearth contests back";
        String[] parts = input.split(" ");
        StringBuilder outputPath = new StringBuilder("/home/hackerearth");

        for (int i = 1; i < parts.length && !parts[i].equals("back"); i++) {
            outputPath.append("/");
            outputPath.append(parts[i]);
        }

        System.out.println(outputPath.toString());
    }
}


/*
public class day_1{
    public static void main(String[] args) {
        String input = "hackerearth contests back";
        String output = "/home/" + input.replace(' ', '/');
        System.out.println(output);
    }
}


/*
import java.util.Scanner;

public class day_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int result = solution(N);
        System.out.println(result);
    }

    public static int solution(int N) {
        int count = 0;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                // Calculate the return on investment
                int returnOnInvestment = i * j;
                if (isPerfectSquare(returnOnInvestment)) {
                    count++;
                }
            }
        }
        return count;
    }

    public static boolean isPerfectSquare(int num) {
        // Check if a number is a perfect square
        int sqrt = (int) Math.sqrt(num);
        return sqrt * sqrt == num;
    }
}


/*
import java.util.Scanner;

public class day_1 {

    static void candies(int n, int k) {
        int[] arr = new int[k];
        int remainingCandies = n;
        int distributedCandies = 1;
        int currentIndex = 0;

        while (remainingCandies > 0) {
            if (remainingCandies < distributedCandies) {
                arr[currentIndex] += remainingCandies;
                break;
            }

            arr[currentIndex] += distributedCandies;
            remainingCandies -= distributedCandies;
            currentIndex = (currentIndex + 1) % k;
            distributedCandies++;
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();
        candies(n, k);
    }
}



/*
class day_1
{
    public static void main(String[] args) {
        String str="hello! i am Rushikesh                      khillare... i am form beed";
        String str1=str.replaceAll("\\s+"," ");
        System.out.print(str1);
    }
}



/*
class day_1
{
    public static void main(String[] args) {
        String str="Hello am    java    developer";
        String str1=str.replaceAll("\\s+"," ");
        System.out.println(str1);
    }
}

/*
public class day_1 {
    public static void main(String[] args) {
        String input = "hello     i      am      java        developer";
        String output = input.replaceAll("\\s+", " ");
        System.out.println(output);
    }
}


/*
class day_1
{
    public static void main(String[] args) {
        String str="    Rushikesh     khillare    ";
        str=str.trim();
        str.split(" ");
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==' ')
            {
                System.out.print(" ");
            }
            else {
                System.out.print(str.charAt(i));
            }
        }


    }
}


/*
class day_1 {
    public static void main(String[] args) {
        String str = "   Rushikesh    khillare ";
        int counter = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                continue;
            }
//            else if ()
//            {
//
//            }
            else {
                counter++;
            }
        }
        char[] chararr = new char[counter + 1];
        for (int i = 0; i < chararr.length; i++) {
            if (chararr[i] == 'h' && chararr[i - 1] == 's') {

                for (int j = i; j < chararr.length; j++) {
                    chararr[j + 1] = chararr[j];
                }
                chararr[i+1] = ' ';
            }
        }

        for (int i = 0; i < chararr.length; i++) {
            System.out.print(chararr[i]);
        }


    }
}


/*





class day_1 {
    public static void main(String[] args) {
        String str = "   Rushikesh    khillare ";
        int counter = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                continue;
            } else {
                counter++;
            }
        }

        char[] chararr = new char[counter];
        int index = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                continue;
            } else {
                chararr[index] = str.charAt(i);
                index++;
            }
        }

        for (int i = 0; i < chararr.length; i++) {
            System.out.print(chararr[i]);
        }
    }
}


/*

class day_1
{
    public static void main(String[] args) {
        String str="     Rushikesh    khillare   ";
        str=str.trim();
        char []arr= str.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
            do {
                System.out.print(" ");
            }while (arr[i]!='')

            {
                System.out.print(arr[i]);
            }
        }
    }
}


/*
import java.util.LinkedList;

class day_1
{
    public static void main(String[] args) {
        LinkedList<Integer> arr = new LinkedList<>();
        arr.add(10);
        arr.add(1);
        arr.add(2);
        arr.add(4);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(9);
        arr.add(5);

        int counter=0;
        for (int a: arr
             ) {
           counter++;
        }
        int counter2=0;
        int []temp=new int[counter];
        for (int a:arr
             ) {
            temp[counter2++]=a;
        }
        for(int i=0;i<counter-1;i++)
        {
            for(int j=i+1;j<counter;j++)
            {
                if(temp[i]>temp[j])
                {
                    int temp1=temp[i];
                    temp[i]=temp[j];
                    temp[j]=temp1;
                }
            }
        }
        for(int i=0;i< temp.length;i++)
        {
            System.out.print(temp[i] + " ");
        }
    }
}



/*
class day_1
{
    public static void main(String[] args) {
        String str="Eduction";
        String str1="aeiouAIUOE";
        StringBuilder stringBuilder=new StringBuilder();

        for(int i=0;i<str.length();i++)
        {
            if(str.contains(String.valueOf(str.charAt(i))))
            {
                stringBuilder.append(Character.toUpperCase(str.charAt(i)));
            }
            else
                stringBuilder.append(str.charAt(i));
        }
        System.out.println(stringBuilder);
    }
}


/*
import java.util.Arrays;

class day_1 {
    public static void main(String[] args) {
        String str = "Education";
        char ch[] = str.toCharArray();
        StringBuilder str1 = new StringBuilder();
        //Arrays.sort(ch);
        for (int i = 0; i < ch.length; i++) {
            if (!(ch[i] == 'a' || ch[i] == 'i' || ch[i] == 'e' || ch[i] == 'o' || ch[i] == 'u' || ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'U' || ch[i] == 'O')) {

                System.out.print(str.charAt(i));
            }
        }
        for (int i = 0; i < ch.length; i++) {
            if ((ch[i] == 'a' || ch[i] == 'i' || ch[i] == 'e' || ch[i] == 'o' || ch[i] == 'u' || ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'U' || ch[i] == 'O')) {
                str1.append(str.charAt(i));
            }

        }
        System.out.println(str1);
    }


}

/*
class day_1
{
    public static void main(String[] args) {
        String str="Education ";
        str=str.trim();
        char arr[]=str.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<arr[i+1])
            {
                char temp = arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}

/*
import java.util.Arrays;

class day_1
{
    public static void main(String[] args) {
        String str="Education";
        char arr[]=str.toCharArray();
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            if(!(arr[i]=='a'|| arr[i]=='e'|| arr[i]=='i' || arr[i]=='u' || arr[i]=='o' || arr[i]=='I'|| arr[i]=='E'|| arr[i]=='U'|| arr[i]=='O'))
            {
                System.out.print(arr[i]);
            }
        }
        for(int i=arr.length-1;i>=0;i--)
        {

            if((arr[i]=='a'|| arr[i]=='e'|| arr[i]=='i' || arr[i]=='u' || arr[i]=='o'|| arr[i]=='A'|| arr[i]=='I'|| arr[i]=='E'|| arr[i]=='U'|| arr[i]=='O'))
            {
                System.out.print(arr[i]);
            }
        }
    }
}

/*
class day_1
{
    public static void main(String[] args) {
        String str="Education";
        char arr[]=str.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
            if(!(arr[i]=='a'|| arr[i]=='e'|| arr[i]=='i' || arr[i]=='u' || arr[i]=='o' || arr[i]=='I'|| arr[i]=='E'|| arr[i]=='U'|| arr[i]=='O'))
            {
                System.out.print(arr[i]);
            }
        }
        for(int i=arr.length-1;i>=0;i--)
        {

            if((arr[i]=='a'|| arr[i]=='e'|| arr[i]=='i' || arr[i]=='u' || arr[i]=='o'|| arr[i]=='A'|| arr[i]=='I'|| arr[i]=='E'|| arr[i]=='U'|| arr[i]=='O'))
            {
                System.out.print(arr[i]);
            }
        }
    }
}

/*
class day_1
{
    public static void main(String[] args) {
        String str="rusheekesh";
        char arr[]=str.toCharArray();//this is the to string method is used coverting the string into the array
        for(int i=0;i<arr.length;i++)
        {
            if(!(arr[i]=='i'|| arr[i]=='a'|| arr[i]=='e'|| arr[i]=='u' || arr[i]=='o'))
            {
                System.out.print(arr[i]);
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            if((arr[i]=='i'|| arr[i]=='a'|| arr[i]=='e'|| arr[i]=='u' || arr[i]=='o'))
            {
                System.out.print(arr[i]);
            }
        }
    }
}

/*
class day_1
{
    public static void main(String[] args) {
        String str= "Rushikesh Khillare";
        str=str.toLowerCase();
        for(int i=0;i<str.length();i++)
        {
            char c=str.charAt(i);
            if(!(c=='a'|| c=='e'|| c=='i'|| c=='u'||c=='o'))
            {
                System.out.print(c);
            }
        }
        for(int i=0;i<str.length();i++)
        {
            char c=str.charAt(i);
            if((c=='a'|| c=='e'|| c=='i'|| c=='u'||c=='o'))
            {
                System.out.print(c);
            }
        }
    }
}

/*
class day_1
{
    public static void main(String[] args) {
        String str="hello my name is Rusheekesh khillare  and i am from beed";
        int counter=0;
        for(int i=0;i<str.length();i++)
        {
            int temp = (int )str.charAt(i);
            if(temp==97|| temp==((int)('i'))||temp== ((int)('e'))|| temp==((int)('o'))|| temp==((int)('u')))
            {
                counter++;
            }
        }
        for(int i=0;i<str.length();i++)
        {
            int temp = (int )str.charAt(i);
            if(temp==97|| temp==((int)('i'))||temp== ((int)('e'))|| temp==((int)('o'))|| temp==((int)('u')))
            {
                System.out.print(counter--);
            }
            else
            {
                System.out.print(str.charAt(i));
            }
        }
    }
}


/*
class day_1
{
    public static void main(String[] args) {
        String str="Rushikesh khillare";
        str=str.toLowerCase();
        int counter=5;
        for(int i=0;i<str.length();i++)
        {
            int temp=(int) str.charAt(i);
            if(temp==97|| temp==((int)('i'))||temp== ((int)('e'))|| temp==((int)('o'))|| temp==((int)('u')))
            {
                System.out.print(counter--);
            }
            else
            {
                System.out.print(str.charAt(i));
            }
        }
    }
}

/*
class day_1
{
    public static void main(String[] args) {
         String str= "Rushikesh khillare";
         int counter=0;
         for(int i=0;i<str.length();i++)
         {
             char c=str.charAt(i);
             if( !(c=='i'|| c=='o'|| c=='a'|| c=='u'|| c=='e'))
             {
                 counter++;
             }
             else
             {

             }
         }
        System.out.print(counter);
    }
}

/*
class day_1
{
    public static void main(String[] args) {
        String str="Rushikesh";
        str = str.toLowerCase();
        //System.out.println(str);
        int count=1;
        for(int i=0;i<str.length();i++)
        {
            char c=str.charAt(i);
            if(c=='i'||c=='a'|| c=='e' || c== 'o' || c== 'u')
            {
                System.out.print(count++);
            }
            else {
                System.out.print(c);
            }
        }
    }
}


/*
class day_1
{
    public static void main(String[] args) {
        int []arr={5,7,53,3,22,42,112,44,224,23,24,24,90};
        for(int i=0;i<arr.length;i++)
        {
            int min=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[min])
                {
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        for(int j=0;j<arr.length;j++)
        {
            System.out.print(arr[j] + " ");
        }
    }
}


/*
class day_1 {
    public static void main(String[] args) {
        int[] arr = {1, 22, 3, 422, 11, 34, 1, 3, 553, 33, 553, 3, 45, 90};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}


/*
class day_1 {
    public static void main(String[] args) {
        int[] arr = {3, 2, 21, 334, 112, 113, 5, 335, 224, 90};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

/*
import java.util.Scanner;

class day_1
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int [] arr=new  int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=scanner.nextInt();
        }
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}

/*
import java.util.Scanner;

class day_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min])
                    min = j;
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
    }
}



/*
class day_1
{
    public static void main(String[] args) {
        int arr[] ={2,214,113,1,12,14,4,7};

        for( int i=0;i<arr.length-1;i++)
        {
            int min=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]> arr[min])
                {
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;

        }

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}


/*
class day_1
{
    public static void main(String[] args) {
         Integer a=100;
         Integer b=100;
         Integer c=500;
         Integer d=500;
        System.out.println(a==b);
        System.out.println(c==d);
    }
}
/*
import java.util.Scanner;

class day_1
{
    public static void main(String[] args) {
        String str="hello?? how are you";
        char []ch=new char[str.length()];
        for (int i=0;i<str.length();i++)
        {
            ch[i]=str.charAt(i);
        }
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]=='?' || ch[i]=='!')
            {
                continue;
            }
            else
                System.out.print(ch[i]);
        }
    }
}

/*
class day_1
{
    public static void main(String[] args) {
        int n=5;
        int counter=15;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=n+1-i;j++)
            {
                System.out.print((char) (counter+64 ));
                counter--;
            }
            System.out.println();
        }
    }
}

/*

class day_1 {
    public static void main(String[] args) {
        String str = "6741247985";
        char[] arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}


/*
class day_1
{
    public static void main(String[] args) {
        String  str="7235912563";
        char []arr=new char[str.length()];
        char []arr1=new char[str.length()];
        for(int i=0;i<str.length();i++)
        {
             arr[i]= str.charAt(i);

        }
        int counter=0;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                arr1[counter++]=arr[i];

            }
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2!=0)
            {
                arr1[counter++]=arr[i];

            }
        }

        for (int i=0;i<str.length();i++)
        {
            System.out.print(arr1[i] + " ");
        }
    }
}

/*


public class day_1 {

    static void candies(int n, int k) {
        int[] arr = new int[k];
        int remainingCandies = n;
        int distributedCandies = 1;
        int currentIndex = 0;

        while (remainingCandies > 0) {
            if (remainingCandies < distributedCandies) {
                arr[currentIndex] += remainingCandies;
                break;
            }

            arr[currentIndex] += distributedCandies;
            remainingCandies -= distributedCandies;
            currentIndex = (currentIndex + 1) % k;
            distributedCandies++;
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();
        candies(n, k);
    }
}




/*
public class day_1 {

    static void candies(int n, int k) {

        int[] arr = new int[k];

        int remainingCandies = n;
        int distributedCandies = 1;
        int currentIndex = 0;

        while (remainingCandies > 0) {
            if (remainingCandies < distributedCandies) {
                arr[currentIndex] += remainingCandies;
                break;
            }

            arr[currentIndex] += distributedCandies;
            remainingCandies -= distributedCandies;
            currentIndex = (currentIndex + 1) % k;
            distributedCandies++;
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        int n = scanner.nextInt();
        int k =scanner.nextInt();
        candies(n, k);
    }
}



/*
import java.util.Scanner;

public class day_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int result = solution(N);
        System.out.println(result);
    }

    public static int solution(int N) {
        int count = 0;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                // Calculate the return on investment
                int returnOnInvestment = i * j;
                if (isPerfectSquare(returnOnInvestment)) {
                    count++;
                }
            }
        }
        return count;
    }

    public static boolean isPerfectSquare(int num) {
        // Check if a number is a perfect square
        int sqrt = (int) Math.sqrt(num);
        return sqrt * sqrt == num;
    }
}



/*
import java.util.Scanner;

public class day_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();  // Number of test cases
        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt();  // Value of N for each test case
            int result = solution(N);
            System.out.println(result);
        }
    }

    public static int solution(int N) {
        int count = 0;
        for (int i = 1; i <= N; i++) {
            // Calculate the return on investment
            int returnOnInvestment = i * i;
            if (isPerfectSquare(returnOnInvestment)) {
                count++;
            }
        }
        return count;
    }

    public static boolean isPerfectSquare(int num) {
        // Check if a number is a perfect square
        int sqrt = (int) Math.sqrt(num);
        return sqrt * sqrt == num;
    }
}

/*


public class day_1    {

    public static void main(String[] args) {
        int N = 4;
        int result = solution(N);
        System.out.println(result);
    }

    public static int solution(int N) {
        int count = 0;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                // Calculate the return on investment
                int returnOnInvestment = i * j;
                if (isPerfectSquare(returnOnInvestment)) {
                    count++;
                }
            }
        }
        return count;
    }

    public static boolean isPerfectSquare(int num) {
        // Check if a number is a perfect square
        int sqrt = (int) Math.sqrt(num);
        return sqrt * sqrt == num;
    }
}


/*

class day_1
{
    public static void main(String[] args) {
        int n=5;

        for(int i=1;i<=n;i++)
        {
            System.out.print(n*i +"  ");
        }
    }
}


/*

class day_1 {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 1; i <= 2 * n - 1; i++) {
            if (i <= n) {
                for (int j = i; j <= n; j++) {
                    System.out.print("*");
                }
                System.out.println();
            } else{
                for (int j = i; j < 2 * i - 2 * n; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}


/*
class day_1
{
    public static void main(String[] args) {
        int []arr={1,24,6,63,2,1,3,53,2};
        int start=0;
        int end=arr.length-1;

        while (start<end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;

        }
        try {
            for(int i=0;i<arr.length ;i++)
            {
                System.out.print(arr[i] +" " );
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}

/*
class  day_1
{
    public static void main(String[] args) {
        int []arr={1,2,3,5,64,256,3,53,90};
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] +" ");
        }
        for(int j=arr.length;j>1;j--)
        {
            System.out.print(arr[j]);
        }
    }
}

/*
class  day_1
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<=n;j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

/*

class  day_1
{
    public static void main(String[] args) {
        int n=10;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<n;j++)
            {
                if(j==i ||i==1 || i==n )
                    System.out.print("*" +"\t");
                else
                {
                    System.out.print("");
                }
            }
            System.out.println();
        }
    }
}


/*

class day_1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 564, 1, 1, 4, 5};
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 564)
                temp = arr[i];
        }
        for (int i=0;i<arr.length-1;i++)
        {
            arr[i+1]=arr[i];
        }
        for (int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] +" ");
        }
    }
}

/*

class  day_1
{
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,62,1};
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]==62)
            {
                int temp=arr[0];
                arr[0]=62;
                arr[i]=temp;
            }
        }
        for ( int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] +" ");
        }
    }
}
/*

class  day_1
{
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,77,34};
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]==77)
            {
               arr[i]=arr[i+1];
            }
        }
        try
        {

            for (int i=0;i<=arr.length-2;i++)
            {
                System.out.print(arr[i] +" ");
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}



/*
class day_1
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<=n;j++)
            {
                if(i==1||j==n || j==i)
                  System.out.print("*");
                else
                {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}

/*
class day_1
{
    public static void main(String[] args) {
        int []arr={1,2,34,6,7,54,42,3,2};
        int start=0;
        int end= arr.length;
        for(int i=0;i<arr.length;i++)
        {
            while (start<end)
            {
                int temp=arr[start];
                arr[start]=arr[end-1];
                arr[end-1]=temp;
                break;
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] +" ");
        }
    }
}


/*


class day_1
{
    public static void main(String[] args) {
        int [] arr={1,2,3,45,56,6,64,33,2,2,89};

       int temp=arr[0];
       for(int i=0;i<arr.length-1;i++)
       {
           arr[i]=arr[i+1];
       }
       arr[arr.length-1]=temp;
       temp=arr[arr.length-2];
//       arr[arr.length-2]=0;
//       for (int i=0;i<arr.length-2;i++)
//       {
//          arr[i+1]=arr[i];
//       }
       arr[0]=temp;
       for (int i=0;i<arr.length;i++)
       {
           System.out.print(arr[i] +" ");
       }
    }
}

/*

class  day_1
{
    public static void main(String[] args) {
        int []arr={1,2,4,5,6,7,7321,11,64};
        int temp=arr[arr.length-1];
        int tem2=arr[0];
        arr[0]=temp;
        arr[arr.length-1]=tem2;
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] +" ");
        }
    }
}
/*

class  day_1
{
    public static void main(String[] args) {
        int []arr={1,2,4,5,6,7,7321,11,64};
        int temp=arr[arr.length-1];
        int tem2=arr[0];
        for (int i=0;i<arr.length;i++)
        {
            if(arr[i]==arr[0])
            {
                arr[i]=temp;
            }
            else
            {
                if(arr[i]==arr[arr.length-1])
                       arr[i]=tem2;
            }
        }
        for (int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] +" ");
        }
    }
}


/*
class day_1
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=n+1-i;j>=1;j--)
            {
                if(j==1 ||j==n+1-i||i==1)
                   System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}

/*


class day_1
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<=n;j++)
            {
                if(i==1)
                {
                    System.out.print("*");
                }
                else
                {
                    if((j+i)%2 ==0)
                    {
                        System.out.print("*");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }

            }
            System.out.println();
        }
    }
}

/*
class  day_1
{
    public static void main(String[] args) {
        int [] arr= {112212,33433,3455,23442,1134,789};
        for (int i=0;i< arr.length ;i++)
        {
            int temp=arr[i];
            int rev=0;
            while (temp!=0)
            {
                int temp1=temp%10;
                rev= rev *10+temp1;
                temp/=10;
            }
            arr[i]=rev;

        }
        for (int i=0;i< arr.length;i++)
        {
            System.out.print(arr[i] +" ");
        }

    }
}

/*

class day_1
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<=n;j++)
            {
                if(i==1)
                {
                    System.out.print("*");
                }
                else
                {
                    if((j+i)%2 ==0)
                    {
                        System.out.print("*");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }

            }
            System.out.println();
        }
    }
}

/*
class day_1 {
    public static void main(String[] args) {
        String str="rushikesh khillare";
                char []ch=new char[str.length()];
                for (int i=0;i<ch.length-1;i++)
                {
                    ch[i]=str.charAt(i);
                }
                StringBuilder str2= new StringBuilder();
                int counter=1;
        for (int i=0;i<ch.length-1;i++)
        {
            if(ch[i]=='i'||ch[i]=='a' || ch[i]=='e'||ch[i]=='u'||ch[i]=='o')
            {
                str2.append(counter++);
            }
            else
            {
                str2.append(ch[i]);
            }
        }
        System.out.println(str2);
    }
}



/*
class day_1
{
  public static void main(String[] args) {
    int []arr={1,2,24,4,4,5};
    int temp=arr[arr.length-1];
    int len=arr.length-1;
    for(int i=1;i<arr.length;i++)
    {
      if(arr[0]==arr[i])
      {
        arr[i]=arr[arr.length-1];
      }else if(arr[arr.length-1]==temp)
      {
        arr[len]=temp;
      }
    }
    for (int i=1;i<arr.length;i++)
    {
      System.out.print(arr[i] + " ");
    }
  }
}


/*
    *
   * *
  *   *
 *     *
*       *
 *     *
  *   *
   * *
    *


class  day_1
{
  public static void main(String[] args) {
    int n=5;
    for(int i=1;i<=n;i++)
    {
      for(int j=i;j<n;j++)
      {
        System.out.print(" ");
      }
      for(int j=1;j<=n;j++)
      {
        if(j==1)
        {
          System.out.print("*");
        }
      }
      for(int j=2;j<2*i-1;j++)
      {
        System.out.print(" ");
      }
      for(int j=1;j<=n;j++)
      {
        if(j==1)
        {
          if(i==1)
          {
            continue;
          }
          System.out.print("*");
        }
      }
      System.out.println();
    }



    for(int i=n-1;i>=1;i--)
    {
      for(int j=i;j<n;j++)
      {
        System.out.print(" ");
      }
      for(int j=1;j<=n;j++)
      {
        if(j==1)
        {
          System.out.print("*");
        }
      }
      for(int j=2;j<2*i-1;j++)
      {
        System.out.print(" ");
      }
      for(int j=1;j<=n;j++)
      {
        if(j==1)
        {
          if(i==1)
          {
            continue;
          }
          System.out.print("*");
        }
      }
      System.out.println();
    }
  }
}


/*
class day_1
{
  public static void main(String[] args) {
    int n=5;
    for(int i=1;i<=n;i++)
    {
      for(int j=i;j<=n;j++)
      {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}


/*

class  name
{
  firstname obj=new firstname();
  public  void show()
  {
    obj.car();
  }
}
class  firstname
{
  public void car()
  {
    System.out.println("khillare");
  }
}
class day_1
{
  public static void main(String[] args) {
    name obj = new name();
    obj.show();
  }
}
/*
class p
{

  public void print()
  {
    System.out.print("rushikeh");
  }
}
class c extends p{
  public void print()
  {
    System.out.println(" Khillare");
  }
}
class  day_1
{
  public static void main(String[] args) {
    p obj= new c();
    obj.print();
  }
}

/*
interface simple
{
  public  int show(int a, int b);
}
class day_1
{
  public static void main(String[] args) {
    simple obj= (int a,int b)->
    {
      return a+b;
    };
    System.out.println(obj.show(89,90));
  }
}

/*
interface  simple{
   public void show();
}
class day_1
{
  public static void main(String[] args) {
    simple obj= new simple() {
      @Override
      public void show() {
        System.out.println("khillare Rushikesh");
      }
    };
    obj.show();
  }
}

/*
interface simple{
  public  void show();
}
class day_1
{
  public static void main(String[] args) {
    simple obj= ()->
    {
      System.out.println("thise lamda function");
    };
    obj.show();
  }
}

/*
abstract class shape
{
     abstract public void show();
}

class  child extends  shape
{
    @Override
    public void show() {
        System.out.println("this are child ");
    }
}

class  day_1
{
    public static void main(String[] args) {
        child obj =new child();
        obj.show();
    }
}



/*
abstract class shape
{
    abstract  public void dispay();
}
class child extends  shape
{
    public void  dispay()
    {
        System.out.println("this is sout");
    }
}
class  day_1
{
    public static void main(String[] args) {
        child obj=new child();
        obj.dispay();
    }
}


/*
abstract  class shpe
{
   abstract public void  cal();
    static void dispay()
    {
        System.out.println("This area back:");
    }
}

class  high extends shpe
{
    @Override
    public void cal() {
        System.out.println("thise");
    }
}
class  day_1
{
    public static void main(String[] args) {

    }
}

/*

class day_1
{
    public static void main(String[] args) {
         boolean []arr={-200};
    }
}
/*
class a
{
    a()
    {
        System.out.println("khillare");
    }
    int a=1200;
    public void key()
    {
        System.out.println("this p");
    }
}
class  b extends  a{



    public  void key()
    {
        super.key();
        System.out.println(super.a);
    }
}


class day_1
{
    public static void main(String[] args) {

    }
}

/*
interface  simple{
    int sho();
}
interface i implements simple
{
    int sho();
}

/*
class day_1
{
    public static void main(String[] args) {

    }
}

/*
import java.util.ArrayList;

public class day_1 {
    public static void main(String[] args) {
        ArrayList<Integer> number =new ArrayList<>();
        number.add(10);
        number.add(29);
        number.add(20);
        number.add(20);
        for (int i:number
             ) {
            System.out.print(i + " ");
        }
    }
}


/*
import java.util.ArrayList;
class day_1
{
    static  boolean check(int a,int temp)
    {
        int []arr=new int[temp];
        for( int i=0;i<arr.length;i++)
        {
            boolean bool=false;
            arr[i]=a;
            if(arr[i]==a)
            {
                bool= true;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int []arr={1,2,4,3,5,2,2,4,4,5,3,3,24,3,3,90};
        int len=arr.length;
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i] == arr[j])
                {
                    int temp=arr[i];
                    if(arr[i] == check(temp,len))
                }
            }
        }
    }
}

/*
class day_1
{
    public static void main(String[] args) {
        int []arr={1,23,45,3,3,2,45,90};
        ArrayList<Integer> list=new ArrayList<>();
        for (int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
                if(arr[i]==arr[j] && !list.contains(arr[i]) )
                {
                    list.add(arr[i]);
                }
            }
        }
        System.out.println(list);
    }
}


/*
class day_1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 45, 33, 22, 32, 24, 22, 33, 223, 224, 22, 335, 224, 2, 2, 90};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j] && i != j) {
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }
}

/*
class day_1
{
    public static void main(String[] args) {
        int []a={1,2,24,5,4,4,4,3,25,67,544,334,55,33,3,33,67};
        for(int i=0;i<a.length;i++)
        {
            boolean bool=false;
            for(int j=i+1;j<a.length;j++)
            {

                if(a[i]==a[j])
                {
                    bool=true;
                    break;
                }
            }
           if(bool)
           {
               System.out.print(a[i] + " ");
               a[i] = Integer.MIN_VALUE;
           }
        }

    }
}

/*
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class day_1
{
    public static void main(String[] args) {
        int []a={12,1,22,22,124,122,122,111,2233,1122,1224,1,1,89,23};
        Set<Integer>set=new HashSet<>();
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]==a[j])
                {
                    set.add(a[i]);
                }
            }
        }
        for (int i:set
             ) {
            System.out.println(i);
        }

    }
}

/*

class day_1
{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int var=0;
        if(a>b)
        {
            var=b;
        }
        else
        {
            var=a;
        }
        int res=0;
        for(int i=1;i<=var/2;i++)
        {
            if(a%i==0 && b%i==0 )
            {
                res=i;
            }
        }
        System.out.println(res);
    }
}

/*
class day_1 {
    public static void main(String[] args) {
        int a;
        System.out.print("Enter the a number:");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        System.out.println("Enter second number");
        int b = scanner.nextInt();
        int max = 0;
        for (int i = 1; i <= a / 2; i++) {
            if (a % i == 0) {
                if (max < i)
                    max = i;
            }
        }
        int max1 = 0;
        for (int i = 1; i <= b / 2; i++) {
            if (b % i == 0) {
                if (max1 < i)
                    max1 = i;
            }
        }
        if (max1 == max) {
            System.out.println(max);
        }
    }
}

/*

//

//Harshad number or not using Java
class day_1
{
    public static void main(String[] args) {
        int n;
        Scanner scanner=new Scanner(System.in);
        n=scanner.nextInt();
        int temp=n;
        int sum=0;
        while (temp!=0)
        {
            int temp1=temp%10;
            sum+=temp1;
            temp/=10;
        }
        if(n%sum==0)
        {
            System.out.print("YES");
        }
    }
}



/*

class day_1
{
    static int power(int n)
    {
        return (int) Math.pow(n,2);
    }

    public static void main(String[] args) {
        System.out.print("Enter the number");
        Scanner scanner =new Scanner(System.in);
        int n=scanner.nextInt();
        int res=n;
        int temp=power(n);
        int len=0;
        while (n!=0)
        {
          len++;
          n/=10;
        }
        int reversnumberstore=0;
        //System.out.println(temp);
        for (int i=1;i<=len;i++)
        {
            int temp1=temp%10;
            reversnumberstore=reversnumberstore*10+temp1;
            temp/=10;
        }
//        System.out.println(power(res));
//        System.out.println(reversnumberstore);
        if(res==reversnumberstore)
        {
            System.out.print("YES");
        }
    }
}
/*



class day_1 {
    static int perfect(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i == perfect(i)) {
                System.out.println(i);
            }
        }

    }
}
/*
class day_1 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        for (int j = 1; j <= n; j++) {
            int sum = 0;

            for (int i = 1; i <= j / 2; i++) {
                if (j % i == 0) {
                    sum += i;
                }
            }
            if (j == sum) {
                System.out.print(j);
            }
        }
    }
}

/*
class day_1
{
    static  int fact(int n)
    {
        if(n<=1)
        {
            return n;
        }
        else
        {
            return n*fact(n-1);
        }
    }
    public static void main(String[] args) {
        int n;
        Scanner scanner =new Scanner(System.in);
        n=scanner.nextInt();
        int store=n;
        int result=0;
        while (n!=0)
        {
            int temp=n%10;
            result+=fact(temp);
            n/=10;
        }
        if(store==result)
        {
            System.out.println("YES!..it is");
        }
    }
}

/*

class day_1
{
    static long fact(long n)
    {
        if(n<=1)
        {
            return n;
        }
         return n * fact(n-1);
    }
    static long power(long n)
    {
        return fact(n)*fact(n);
    }

    public static void main(String[] args) {
        long n =4;

        System.out.println(power(4));
    }
}

/*
class day_1
{
    static int fact(int n)
    {
        if(n<=1)
        {
            return n;
        }
        else
        {
            return fact(n-1) + fact(n-2);
        }

    }
    public static void main(String[] args) {
        int n;
        Scanner scanner= new Scanner(System.in);
        n=scanner.nextInt();
        for(int i=1;i<=n;i++) {
            System.out.println(fact(i));
        }
    }
}
//given range factorial;



/*
class day_1
{
    public static void main(String[] args) {
        System.out.print("Enter the number here to here want :");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        for(int j=1;j<=n;j++) {

            long res = 1;

            for (int i = 1; i <= j; i++) {
                res *= i;
            }
            System.out.println(res);
        }
    }
}


/*
import java.util.Map;
import java.util.Scanner;

class day_1{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number here to want to numbet:");
        int n=scanner.nextInt();
        for(int i=1;i<=n;i++) {
            int n1 = i;
            int len = 0;

            while (n1 != 0) {
                len++;
                n1 /= 10;
            }
            double sum = 0;
            n1=i;
            while (n1 != 0) {
                int temp = n1 % 10;
                sum += Math.pow(temp, len);
                n1 /= 10;
            }
            if (i == sum) {
                System.out.print(i +" ");
            }
        }
    }
}





/*

interface  simple
{
    int show(int a, int b);
}

class  day_1
{
    public static void main(String[] args) {
        simple obj=(a,b)->a+b;
        System.out.println(obj.show(56,56));
    }
}
/*
interface  simple
{
    void  show();
}
class  day_1
{
    public static void main(String[] args) {
        simple obj=new simple() {
            @Override
            public void show() {
                System.out.println("this anonumous reprasentation");
            }
        };
        obj.show();
    }
}
/*
interface  simple
{
    void show();
}
class day_1
{
    public static void main(String[] args) {
        simple obj=()-> System.out.println("this lamda class function:");
        obj.show();
    }
}

/*
//1st
interface  simple
{
    void show();

}
class sim  implements  simple
{
    public  void show()
    {
        System.out.println("this  is the first way to creating accesing interface method");
    }
}
/*

interface simple
{
    void  show(int a);
}
//if code very small in the function we can the interface this this lada
//this lamda expression is used to reduced the length of the code that main

class day_1
{
    public static void main(String[] args) {
        simple obj=(int s)-> System.out.println("this the values"+s);
        obj.show(89);
    }
}

/*
///this the frist way to abstracting the method of interface
interface  a
{
    void show();
}
class b implements a
{
    public  void show()
    {
        System.out.println("Rushikesh khillare");
    }
}
class day_1
{
    public static void main(String[] args) {
        b obj=new b();
        obj.show();
    }
}

/*
//2nd
interface  a
{
    void show();

}
public class day_1 {
    public static void main(String[] args) {
        a obj =new a()//this is the second way to call anonimous class creation
        {
            public void show()
            {
                System.out.println("Rushikesh khillare");
            }
        };
        obj.show();
    }
}

/*
543212345
4321 1234
321   123
21     12
1       1



import javax.swing.plaf.IconUIResource;

class day_1
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            if(i==1)
            {
                for(int j=1;j<=2*n-1;j++)
                {
                    if(j<n)
                    {
                        System.out.print(n+1-j);
                    }
                    else
                    {
                        System.out.print(j+1-n);
                    }
                }
            }
//            else
//            {
//                for(int j=n;j>=i;j--)
//                {
//                    System.out.print(j+1-i);
//                }
//                for(int j=2;j<2*i-1;j++)
//                {
//                    System.out.print(" ");
//                }
//                for (int j=1;j<=n+1-i;j++)
//                {
//                    System.out.print(j);
//                }
//            }
//            System.out.println();
        }
    }
}



/*
5       5
45     54
345   543
2345 5432
123454321
2345 5432
345   543
45     54
5       5





class day_1
{
    public static void main(String[] args) {
        int n=5;
        for(int i=n;i>=1;i--)
        {


            for(int j=i;j<=n;j++)
            {
                System.out.print(j);
            }
            for(int j=2;j<2*i-1;j++)
            {
                System.out.print(" ");
            }
            for(int j=n;j>=i;j--)
            {
                if(i==1 && j==5)
                    continue;
                System.out.print(j);
            }
            System.out.println();
        }
        for(int i=2;i<=n;i++)
        {


            for(int j=i;j<=n;j++)
            {
                System.out.print(j);
            }
            for(int j=2;j<2*i-1;j++)
            {
                System.out.print(" ");
            }
            for(int j=n;j>=i;j--)
            {
                if(i==1 && j==5)
                    continue;
                System.out.print(j);
            }
            System.out.println();
        }
    }
}



/*
123454321
1234 4321
123   321
12     21
1       1


class day_1
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            if(i==1)
            {
                for(int j=1;j<=2*n-1;j++)
                {
                    if(j<=n)
                        System.out.print(j);
                    else
                        System.out.print(2*n-j);
                }
            }
            else
            {
                for(int j=1;j<=n+1-i;j++)
                {
                    System.out.print(j);
                }
                for (int j=2;j<2*i-1;j++)
                {
                    System.out.print(" ");
                }
                for (int j=i;j<=n;j++)
                {
                    System.out.print(n+1-j);
                }
            }
            System.out.println();
        }
    }
}
/*

//This problem is making without using the for loop
class day_1
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            if(i==1) {
                for (int j = 1; j <= 2 * n - 1; j++) {
                    System.out.print(1);
                }
            }
            else {
                for (int j = i; j <= n; j++) {
                    System.out.print(i);
                }
                for(int j=2;j<2*i-1;j++)
                {
                    System.out.print(" ");
                }
                for(int j=i;j<=n;j++)
                {
                    System.out.print(i);
                }
            }
            System.out.println();

        }
    }
}


/*
class day_1
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<=n;j++)
            {
                System.out.print(n+1-i);
            }
            for (int j=2;j<2*i-1;j++)
            {
                System.out.print(" ");
            }
            for(int j=i;j<=n;j++)
            {
                if(i==1&& j==5)
                    continue;
                System.out.print(n+1-i);
            }
            System.out.println();
        }
    }
}
/*
class day_1
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<=n;j++)
            {
                System.out.print(i);
            }
            for(int j=2;j<2*i-1;j++)
            {
                System.out.print(" ");
            }
            for(int j=i;j<=n;j++)
            {
                if(i==1&& j==5)
                    continue;
                System.out.print(i);
            }
            System.out.println();

        }
    }
}











/*
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import static java.lang.Class.forName;

class day_1
{
    public static void main(String[] args) {
        try
        {
           forName("com.mysql.jdbc.driver");
          //This is the code for setting the path of sql query basically where the driver id the prasent
            Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","Rushi@1101");
            String q="insert into images(pic) values (?)";
            PreparedStatement obj=connection.prepareStatement(q);
            FileInputStream
            obj.setBinaryStream(1);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}

/*

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import static java.lang.Class.forName;

class  day_1
{
    public static void main(String[] args) {
         try
         {
             forName("com.mysql.jdbc.Driver");

             String url="jdbc:mysql://localhost:3306/Driver";
             String username="root";
             String password="Rushi@1101";
             Connection connection= DriverManager.getConnection(url,username,password);

             String q="select *from table1";

             PreparedStatement obj=connection.prepareStatement(q);
             BufferedReader bufferedReader=new BufferedReader( new InputStreamReader(System.in));
             System.out.println("Enter the Name:");
             String name= bufferedReader.readLine();
             System.out.println("Enter the city:");
             String city=bufferedReader.readLine();

         }
         catch (Exception e)
         {
             System.out.println(e.getMessage());
         }
    }
}


/*
class day_1
{
    public static void main(String[] args) {
        try
        {
            forName("com.mysql.jdbc.Driver");

            String url="jbdc:myqsql://localhost:3306/Driver";
            String username="root";
            String password="Rushi@1101";

            Connection connection= DriverManager.getConnection(url,username,password);

            String q="insert into table1(tName,tCity)";
            PreparedStatement obj=connection.prepareStatement(q);


            BufferedReader bufferedReader= new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter your  name:");
            String name=bufferedReader.readLine();
            System.out.println("Enter your city name:");
            String city=bufferedReader.readLine();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}

/*

class day_1
{
    public static void main(String[] args) {
        try
        {
            forName("com.mysql.jdbc.Driver");

            String url="jdbc:mysql://localhost:3306/youtube";
            String userName ="root";
            String password ="Rushi@1101";
            Connection connection= DriverManager.getConnection(url,userName,password);
            String q="insert into table1(tName,tcity) values(?,?)";
            PreparedStatement preparedStatement=connection.prepareStatement(q);
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the name:");
            String name=br.readLine();
            System.out.println("Enter your city:");
            String city=br.readLine();
            connection.close();


        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
/*
class day_1
{
    public static void main(String[] args) {
        try
        {
            forName("com.mysql.jdbc.driver");
            String url="jdbc:mysql://localhost:3006/youtube";
            String username = "root";
            String password="Rushi@1101";
            Connection con=DriverManager.getConnection(url,username,password);


            String q="insert into table(tName,tcity)values(?,?";

            PreparedStatement psmt=con.prepareStatement(q);
            psmt.setString(1,"Rushikesh khillare");
            psmt.setString(2,"khillare Rushikesh");
            psmt.executeUpdate();
            con.close();

        } catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
/*
class day_1
{
    public static void main(String[] args) {
        try
        {
            forName("com.mysql.jdbc.driver");
            String url="jdbc:mysql:localhost://3306/youtube";
            String username="root";
            String password="Rushi@1101";
            Connection con=DriverManager.getConnection(url,username,password);
            String q="create table table1(tid int (20) primary key auto_increment ,tName varchar(200) not null,tcity varchar(400)";
            Statement statement=con.createStatement();
            statement.executeUpdate(q);
        System.out.println("this is the table is the create");


            if(con.isClosed())
            {
                System.out.println("connection is created");
            }
            else
            {
                System.out.println("connection is not created");
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

    }
}

/*

class  day_1
{
    public static void main(String[] args) {
        try
        {
            forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/youtube";
            String username="root";
            String password="root";
            Connection con= DriverManager.getConnection(url,username,password);
            if(con.isClosed())
            {
                System.out.println("conection is done");
            }
            else
            {
                System.out.println("connection is not done");
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}

/*
import java.sql.*;

import static java.lang.Class.forName;

class day_1
{
    public static  void main(String [] args)
    {
        try {
            class.forName("com.mysql.jdbc.driver");
            String url="jdbc:mysql://localhost:3086/youtube";
            String username="root";
            String password ="Rushi@1101";
            Connection con= DriverManager.getConnection(url,username,password);
            if()

    }
}




/*
import java.io.IOError;
import java.io.IOException;

import java.io.*;

class Main {
    // declareing the type of exception
    public static void findFile() throws IOException {

        // code that may generate IOException
        File newFile = new File("test.txt");
        FileInputStream stream = new FileInputStream(newFile);
    }

    public static void main(String[] args) {
        try {
            findFile();
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
}
/*
class day_1
{
    public static void main(String[] args) {
        try
        {
            int n=10;
            int d=0;
            int res=n/0;//when the exception in show than father that code is not exicuting
            System.out.println("this is the result "+res);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("this is the finally block");
        }
//        catch (Exception e)
//        {
//            System.out.println(e.getMessage());
//        }
    }
}
/*
1	2	4	7	11
3	4	6	9
6	7	9
10	11
15


class day_1
{
    public static void main(String[] args) {
        int n=5;
        int col_counter=1;
        for(int i=1;i<=n;i++)
        {
            int raw_counter=col_counter;
            for(int j=1;j<=n+1-i;j++)
            {
                System.out.print(raw_counter + "\t");
                raw_counter +=j;
            }
            System.out.println();
            col_counter +=1+i;
        }
    }
}

/*

11	12	13	14	15
7	8	9	10
4	5	6
2	3
1

import javax.swing.plaf.IconUIResource;

class day_1
{
    public static void main(String[] args) {
        int n=5;
        int col_conter=((n*n)/2)-n/n;
        for(int i=1;i<=n;i++)
        {
            int raw_counter=col_conter;
            for(int j=1;j<=n+1-i;j++)
            {
                System.out.print(raw_counter++ + "\t");
            }
            System.out.println();
            col_conter -=n-i;
        }
    }
}
/*
5	4	3	2	1
9	8	7	6
12	11	10
14	13
15
class day_1
{
    public static void main(String[] args) {
        int n=5;
        int col_counter=n;
        for(int i=1;i<=n;i++)
        {
            int raw_conter=col_counter;
            for(int j=1;j<=n+1-i;j++)
            {
                System.out.print(raw_conter--  + "\t");
            }
            System.out.println();
            col_counter +=n-i;
        }
    }
}

/*
1	2	3	4	5
6	7	8	9
10	11	12
13	14
15

class day_1
{
    public static void main(String[] args) {
        int n=5;
        int col_counter=((n*n)+n)/2;
        for(int i=1;i<=n;i++)
        {
            int row_counter=col_counter;
            for(int j=1;j<=n+1-i;j++)
            {
                System.out.print(row_counter-- +"\t");
            }
            System.out.println();
            col_counter -=n+1-i;
        }
    }
}


/*
1	2	3	4	5
6	7	8	9
10	11	12
13	14
15


class day_1
{
    public static void main(String[] args) {
        int n=5;
        int column =n/n;
        for(int i=1;i<=n;i++)
        {
            int raw_counter=column;
            for(int j=1;j<=n+1-i;j++)
            {
                System.out.print(raw_counter++ +"\t");

            }
            System.out.println();
            column += n+1-i;
        }
    }
}
/*
import javax.swing.plaf.basic.BasicMenuUI;
import java.util.HashMap;
import java.util.Map;

class dat_1
{
  Map<String ,Integer> hashmap1=new HashMap<>();
  hashmap1.put("")
}
/*
import java.util.ArrayDeque;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

class day_1{
    public static void main(String[] args) {

        Set<Integer> integers=new TreeSet<>();
        integers.add(90);
        integers.add(901);
        integers.add(902);
        integers.add(903);
        integers.add(904);
        integers.add(9);
        System.out.println(integers);//[9, 90, 901, 902, 903, 904] return like thise
        //is working in the tree set sorting order  main all element the treeset that are present sorted order
        //set is not allowed the adding the duplicate element in set\


     //   Set<Integer> integers= new LinkedHashSet<>();
        //here linking the element same like the  linkedlist  but other operation in linklist is same


    }
}
/*
import java.util.HashSet;
import java.util.Set;

class day_1
{
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();
        set.add(32);
        set.add(78);
        set.add(8);
        set.add(90);
        set.add(90);// when adding the deuplicate element the set that not giving the error
        //but it will not allow add that element
        System.out.println(set);
        set.remove(90);
        System.out.println(set);
        System.out.println(set.contains(789));//return the false element in the stack
        System.out.println(set.isEmpty());
        System.out.println(set.size());
        set.clear();
    }
}
/*

class day_1
{
    public static void main(String[] args) {
        ArrayDeque<Integer> arrayDeque=new ArrayDeque<>();
        arrayDeque.offer(23);
        arrayDeque.offer(12);
        arrayDeque.offer(34);
        arrayDeque.offer(67);
        System.out.println(arrayDeque);
        System.out.println(arrayDeque.peek());
        arrayDeque.push(68);
        arrayDeque.add(45);
        System.out.println(arrayDeque);
        System.out.println();
        arrayDeque.getLast();
//        for (int i: arrayDeque
//             ) {
//            System.out.println(arrayDeque.getFirst());
//        }
    }
}



/*
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


class day_1
{
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();
        list.add(100);
        list.add(101);
        list.add(1002);
        list.add(1003);
        list.add(1044);
        System.out.println(list);

        //there are a different way to itreting the element the array
        for(int i=0;i<list.size();i++)
        {
            System.out.println("element in the list"+ list.get(i));
        }
        for (int i:list
             ) {
            System.out.println(list.get(i));
        }
        Iterator<Integer> it=list.iterator();
        while (it.hasNext())//it is checking the is there any element present after thar
        {
            System.out.println(it.next());//it is heping the element

        }
    }
}
/*



class day_1
{
    public static void main(String[] args) {
        LinkedList<Integer> numbers=new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.forEach(numbers-> System.out.println(numbers));
        .
    }
}

/*
import java.util.LinkedList;

class day_1
{
    public static void main(String[] args) {
        LinkedList<Integer> integers=new LinkedList<>();
        integers.add(10);
        integers.add(13);
        integers.add(14);
        integers.add(13);
        integers.add(234);
        for (int name: integers
             ) {
            System.out.println(name);
        }
        integers.addLast(32);
        integers.addLast(56);
        integers.addFirst(11);
        System.out.println(integers);//this performing the same operation the java

    }
}





/*
import java.util.ArrayList;
import java.util.Iterator;

class day_1
{
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(10);
        numbers.add(13);
        numbers.add(45);
        numbers.add(32);
        numbers.add(1);
        Iterator<Integer> iterator= numbers.iterator();
        while (iterator.hasNext())
        {
            Integer number=iterator.next();
            System.out.println(number);
        }
    }
}
/*
import java.util.ArrayList;
import java.util.Collection;

class day_1
{
    public static void main(String[] args) {
        ArrayList<String> frt=new ArrayList<>();
        frt.add("Rushi");
        frt.add("satya");
        frt.add("danny");
        frt.add("govya");
        Collection.sort(frt);

    }
}


/*
class day_1
{
    public static void main(String[] args) {
        ArrayList <String > fruits=new ArrayList<>();
        fruits.add("String");
        fruits.add("banana");
        fruits.add("mango");
       String []arr=fruits.toArray(new String[fruits.size()]);//this method using the creating the array of the ten bit only
        //temp size of the arrylist is the 10 bit


    }
}
/*

public class day_1 {

    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(45);
        numbers.add(65);
        System.out.println("Element at index:"+ numbers.get(1));
        numbers.remove(0);//where removing the array index number zero

        System.out.println(numbers);
//        for (int i:numbers
//             ) {
//            System.out.println(i);
//        }
    }
}



/*
import java.util.Arrays;

class day_1
{
    public static void main(String[] args) {

        String s1= "Never odd or even";
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s1.length();i++)
        {
            if(Character.isLetterOrDigit(s1.charAt(i)))
                sb.append(s1.charAt(i));
        }
        char c[]=sb.toString().toCharArray();
        Arrays.sort(c);
        sb.delete(0,sb.length());
        sb.append(c);
        for(int i=0;i<s1.length();i++)
        {
            if(Character.isLetterOrDigit(s1.charAt(i)))
                sb.insert(i," ");
        }
        System.out.println(sb);
    }
}

/*
class day_1{
    public static void main(String[] args) {
        String s1="Never odd or even";
        s1=s1.toLowerCase();
        char arr[]=s1.toCharArray();
        StringBuilder cb=new StringBuilder();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>=96 && arr[i]<=122)
            {
                cb.append(arr[i]);
            }
        }
       String s2=cb.toString();
        s1= String.valueOf(cb.reverse());
        System.out.println(s1);
        if(s1.equals(s2))
        {
            System.out.println("This is equal");
        }



    }
}
/*
class day_1
{
    public static void main(String[] args) {
        String str="Never odd or even";
        char []arr= new char[str.length()];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=str.charAt(i);
        }
        char [] arr1=new char[arr.length];
        for(int i=arr.length;i>0;i--)
        {

        }
    }
}

/*
import java.util.Arrays;
class day_1{
    public static void main(String[] args) {
        String str="Never odd or even";
        char [ ]arr=new char[str.length()];
        for(int i=arr.length-1;i>0;i--)
        {

            arr[str.length()-i]=str.charAt(i);
            //System.out.println(arr[i]);
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
        }

    }
}

/*

class day_1
{
    public static void main(String[] args) {
        String str="Never odd or even";
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++)
        {
            if(Character.isLetter(str.charAt(i)))
            {
                sb.append(str.charAt(i));
            }
        }
        char c[]=sb.toString().toCharArray();
        Arrays.sort(c);
        sb.delete(0,sb.length());
        sb.append(c);
        for(int i=0;i<str.length();i++)
            if(Character.isWhitespace(str.charAt(i)))
                sb.insert(i," ");
        System.out.println(sb);
    }
}
/*
class day_1
{
    public static void main(String[] args) {
        String str="Never odd or even";
        char [] arr=new char[str.length()];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=str.charAt(i);
        }

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
        }
    }
}

/*
public class day_1 {
    public  static  void main(String [] agrs)
    {
        System.out.println("Jay shree ram");
    }
}
*/
