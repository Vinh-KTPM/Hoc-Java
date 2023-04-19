package Exercise2;

public class Toan_Tu {
    public static void main(String[] args) {
        int i = 5;
        int j = 10;
        int k = 0;

        i++;  /* Cộng 1 vào i sau */
        System.out.println("i= " +i+ ", j= " +j+ ",k= " +k);

        ++i; /* Cộng 1 vào i trước */
        System.out.println("i= " +i+ ", j= " +j+ ",k= " +k);

        i--; /* Trừ 1 vào i sau*/
        System.out.println("i= " +i+ ", j= " +j+ ",k= " +k);

        --i; /* Trừ 1 vào i trước*/
        System.out.println("i= " +i+ ", j= " +j+ ",k= " +k);

        k = i++ + j;
        System.out.println("i= " +i+ ", j= " +j+ ",k= " +k);

        k = ++i +j;
        System.out.println("i= " +i+ ", j= " +j+ ",k= " +k);

        k = i-- +j;
        System.out.println("i= " +i+ ", j= " +j+ ",k= " +k);

        k = --i +j;
        System.out.println("i= " +i+ ", j= " +j+ ",k= " +k);
    }
}
