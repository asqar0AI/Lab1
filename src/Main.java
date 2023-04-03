import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.print("Choose the task you want to run: ");
        int id = Solutions.input.nextInt();
        int a, n, k;
        double[] arr;
        String str;


        switch(id) {
            case 1:
                n = Solutions.input.nextInt();
                arr = new double[n];
                for (int i = 0; i < n; i++) {
                    arr[i] = Solutions.input.nextDouble();
                }
                System.out.println(Solutions.min(n, arr));
            case 2:
                n = Solutions.input.nextInt();
                arr = new double[n];
                for (int i = 0; i < n; i++) {
                    arr[i] = Solutions.input.nextDouble();
                }
                System.out.println(Solutions.avg(n, arr));
            case 3:
                n = Solutions.input.nextInt();
                System.out.println(Solutions.isPrime(n));
            case 4:
                n = Solutions.input.nextInt();
                System.out.println(Solutions.factorial(n));
            case 5:
                n = Solutions.input.nextInt();
                System.out.println(Solutions.fibonacci(n));
            case 6:
                a = Solutions.input.nextInt();
                n = Solutions.input.nextInt();
                System.out.println(Solutions.binPow(a, n));
            case 7:
                n = Solutions.input.nextInt();
                Solutions.printReverse(n);
            case 8:
                str = Solutions.input.next();
                System.out.println(Solutions.isDigits(str));
            case 9:
                n = Solutions.input.nextInt();
                k = Solutions.input.nextInt();
                System.out.println(Solutions.C(n, k));
            case 10:
                n = Solutions.input.nextInt();
                k = Solutions.input.nextInt();
                System.out.println(Solutions.GCD(n, k));
        }
    }
}