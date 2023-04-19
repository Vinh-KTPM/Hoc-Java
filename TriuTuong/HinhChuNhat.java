package TriuTuong;

import java.text.DecimalFormat;

public class HinhChuNhat extends Hinh{
    private  double chieuDai;
    private double chieuRong;
    public HinhChuNhat() {
        super();
    }
    public HinhChuNhat(String tenHinh, double chieuDai, double chieuRong) {
        super(tenHinh);
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }
    public double getChieuDai() {
        return chieuDai;
    }
    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }
    public double getChieuRong() {
        return chieuRong;
    }
    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }

    @Override
    public double tinhChuVi() {
        double cv;
        cv = (chieuDai + chieuRong) *2;
        return cv;
    }
    @Override
    public double tinhDienTich() {
        double dt;
        dt = chieuDai * chieuRong;
        return dt;
    }
    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        return  "Chu vi của hình " + getTenHinh()+ " : " +df.format(tinhChuVi()) +
                "\n Diện tích của hình " + getTenHinh()+ " : " + df.format(tinhDienTich());
    }
}
