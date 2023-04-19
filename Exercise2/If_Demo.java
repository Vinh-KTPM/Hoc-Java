package Exercise2;

import java.util.Scanner;

public class If_Demo {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int num1;
        int num2;

        System.out.print("Nhập số thứ nhất: ");
        num1 = sn.nextInt();

        System.out.print("Nhập số thứ hai: ");
        num2 = sn.nextInt();

        if (num1 > num2){
            System.out.println("Số thứ nhất lơn hơn số thứ hai");
        }

        if (num1 < num2){
            System.out.println("Số thứ nhất nhỏ hơn số thứ hai");
        }

        if (num1 == num2){
            System.out.println("Số thứ nhất bằng số thứ hai");
        }
    }
}
