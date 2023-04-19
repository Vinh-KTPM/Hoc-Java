package Exercise2;

public class Type_Conv {
    public static void main(String[] args) {
        int i = 10;
        float t = 5.0f;
        float f;

        f = i; /* chuyển số nguyên thành số thực*/
        System.out.println("i = " +i+ ", f = " +f);

        f = i + t; /* i được chuyển tự động thành float */
        System.out.println("i = " +i+ ", f = " +f);
    }
}
