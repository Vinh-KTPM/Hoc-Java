package Exercise2;

public class Type_Cast {
    public static void main(String[] args) {
        int i = 10;
        int j = 3;
        float f;
        f = 7.5F;
        i = (int)f; /* Ép kiểu */
        System.out.println("i = " +i+ ", f = " +f);

        f = i/j; /* Chia lấy phần nguyên */
        System.out.println("i = " +i+ ", f = " +f);

        f = (float)i/j; /* Ép kiểu số bị chia thành float */
        System.out.println("i = " +i+ ", f = " +f);

        f = i/(float)j; /* Ép kiểu số chia thành float */
        System.out.println("i = " +i+ ", f = " +f);

        f = (float) i/(float)j; /* Ép kiểu tất cả thành float */
        System.out.println("i = " +i+ ", f = " +f);
    }
}
