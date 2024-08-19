package oop.baitap03;

public class SanPham {
    private String ten;
    private double gia;

    // Constructor không tham số
    public SanPham() {
        this.ten = "";
        this.gia = 0.0;
    }

    // Constructor có tham số
    public SanPham(String ten, double gia) {
        this.ten = ten;
        this.gia = gia;
    }

    // Getter cho thuộc tính ten
    public String getTen() {
        return ten;
    }

    // Setter cho thuộc tính ten
    public void setTen(String ten) {
        this.ten = ten;
    }

    // Getter cho thuộc tính gia
    public double getGia() {
        return gia;
    }

    // Setter cho thuộc tính gia
    public void setGia(double gia) {
        this.gia = gia;
    }

    // Overriding toString method
    @Override
    public String toString() {
        return String.format("SanPham[ten=%s, gia=%.2f]", ten, gia);
    }
}
