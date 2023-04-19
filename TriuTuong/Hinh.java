package TriuTuong;

public abstract class Hinh {
    private String tenHinh;
    public abstract double tinhChuVi();
    public abstract double tinhDienTich();
    public Hinh() {
    }
    public Hinh(String tenHinh) {
        this.tenHinh = tenHinh;
    }
    public String getTenHinh() {
        return tenHinh;
    }
    public void setTenHinh(String tenHinh) {
        this.tenHinh = tenHinh;
    }
}
