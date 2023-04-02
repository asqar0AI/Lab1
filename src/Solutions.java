import java.util.Scanner;

public class Solutions {
    static Scanner input = new Scanner(System.in);
    public static double min(int n, double[] arr)
    {
        // 1
        if(n == 1)
        {
            return arr[0];
        }
        double temp = min(n - 1, arr);
        return (arr[n - 1] < temp) ? arr[n - 1] : temp;
    }
    public static double avg(int n, double[] arr)
    {
        // 2
        if(n == 0)
        {
            return 0;
        }
        return avg(n - 1, arr) + (arr[n - 1] / arr.length);

    }
    public static String isPrime(int n)
    {
        // 3
        return isPrime(n, 2);
    }

    private static String isPrime(int n, int div)
    {
        // 3
        if(div > Math.sqrt(n))
        {
            return "Prime";
        }
        return (n % div == 0) ? "Composite" : isPrime(n, div + 1);
    }
    public static int factorial(int n)
    {
        // 4
        if(n == 1 || n == 0)
        {
            return 1;
        }
        return factorial(n - 1) * n;
    }
    public static int fibonacci(int n)
    {
        // 5
        if (n == 0)
        {
            return 0;
        }
        else if(n == 1)
        {
            return 1;
        }
        else
        {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
    public static int binPow(int a, int n)
    {
        // 6
        if(n == 0)
        {
            return 0;
        }
        else if(n % 2 == 1)
        {
            return binPow(a, n - 1) * a;
        }
        else
        {
            int temp =  binPow(a, n/2);
            return temp * temp;
        }
    }
    public static void printReverse(int n)
    {
        // 7
        if(n == 0)
        {
            return;
        }
        int temp = input.nextInt();
        printReverse(n - 1);
        System.out.print(temp + " ");
    }
    public static boolean isDigits(String str)
    {
        // 8
        boolean temp = (str.charAt(0) >= '0' && str.charAt(0) <= '9');
        if(str.length() == 1)
        {
            return temp;
        }
        else
        {
            return (temp && isDigits(str.substring(1)));
        }
    }
    public static int C(int n, int k)
    {
        // 9
        if(k == 0 || k == n)
        {
            return 1;
        }
        else
        {
            return C(n - 1, k - 1) + C(n - 1, k);
        }
    }
    public static int GCD(int a, int b)
    {
        // 10
        if(b == 0)
        {
            return a;
        }
        else
        {
            return GCD(b, a % b);
        }
    }
}
