package Exercise2;

import java.util.Scanner;

public class Switch_Demo {
    public static void main(String[] args) {
        String grade;
        Scanner sn = new Scanner(System.in);
        System.out.print("Mời nhập điểm (A, B, C, D, F):  ");
        grade = sn.nextLine();

        switch (grade){
            case "A":
                System.out.println("Xuất sắc");
                break;

            case "B":
                System.out.println("Giỏi");
                break;

            case "C":
                System.out.println("Khá");
                break;

            case "D":
                System.out.println("Trung Bình");
                break;

            case "F":
                System.out.println("Trượt!!!!!   Bạn phải học lại");
                break;

            default:
                System.out.println("Bạn nhập điểm không hợp lệ !!!");
        }
        System.out.println("Điểm của bạn là: " +grade);
    }
}
