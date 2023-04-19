package Interface;

import java.util.Scanner;

public class KiemTra {

    public static void main(String[] args) {
        double n1,n2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số thứ nhất :  ");
        n1 = sc.nextInt();
        System.out.print("Nhập số thứ hai :  ");
        n2 = sc.nextInt();

        PhepToan pt = new PhepToan();
        System.out.println("Tổng của " +n1+ " và " +n2+ " là : " +pt.cong(n1, n2));
        System.out.println("Hiệu của " +n1+ " và " +n2+ " là : " +pt.tru(n1, n2));
        System.out.println("Tích của " +n1+ " và " +n2+ " là : " +pt.nhan(n1, n2));
        System.out.println("Thương của " +n1+ " và " +n2+ " là : " +pt.chia(n1, n2));
    }
}
