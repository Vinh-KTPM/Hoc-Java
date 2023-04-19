package TriuTuong;

import java.text.DecimalFormat;

public class HinhTron extends Hinh{
    private double banKinh;
    public HinhTron() {
        super();
    }
    public HinhTron(String tenHinh, double banKinh) {
        super(tenHinh);
        this.banKinh = banKinh;
    }
    public double getBanKinh() {
        return banKinh;
    }
    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }
    @Override
    public double tinhChuVi() {
        double cv;
        cv = 2 * Math.PI * banKinh;
        return cv;
    }
    @Override
    public double tinhDienTich() {
        double dt;
        dt = banKinh * banKinh * Math.PI;
        return dt ;
    }
    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        return  "Chu vi của hình " + getTenHinh()+ " : " +df.format(tinhChuVi()) +
                "\n Diện tích của hình " + getTenHinh()+ " : " + df.format(tinhDienTich());
    }
}
