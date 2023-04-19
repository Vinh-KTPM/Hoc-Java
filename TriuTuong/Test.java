package TriuTuong;

public class Test {
    public static void main(String[] args) {
        Hinh h[] = new Hinh[2];
        HinhChuNhat hcn = new HinhChuNhat("Hình Chữ Nhật", 4, 3);
        HinhTron ht = new HinhTron("Hình tròn", 2.3);
        h[0] = hcn;
        h[1] = ht;
        for (int i = 0; i < h.length; i++){
            System.out.println(h[i]);
        }
    }
}
