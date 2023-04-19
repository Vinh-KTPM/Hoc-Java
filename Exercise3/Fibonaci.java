package Exercise3;

import java.util.Scanner;

public class Fibonaci {
    public static void main(String[] args) {
        int n;
        int fibo;
        Scanner sn = new Scanner(System.in);
        System.out.print("Nhập số nguyên n: ");
        n = sn.nextInt();
        System.out.println("Dãy fibonaci của " + n + " đầu tiên là : ");
        for (int i = 1; i <= n; i++){
            System.out.print(fibo(i) + "  ");
        }

    }
    public static int fibo(int n){
        if (n < 0){
            return -1;
        } else if (n == 0 || n == 1) {
            return n;
        }else {
            return fibo(n - 2) + fibo(n - 1);
        }
    }
}
