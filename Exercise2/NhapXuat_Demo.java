package Exercise2;

import java.util.Scanner;

public class NhapXuat_Demo {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int num1;
        int num2;
        int sum = 0;
        System.out.print("Nhập số thứ nhất: ");
        num1 = sn.nextInt();

        System.out.print("Nhập số thứ hai: ");
        num2 = sn.nextInt();

        sum = num1 + num2;
        System.out.println("Tổng của "+num1+" và "+num2+" là: " +sum);
    }
}
