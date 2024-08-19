package oop.baitap04;

public class HinhTron {
    private double banKinh;

    // Constructor không tham số
    public HinhTron() {
        this.banKinh = 0.0;
    }

    // Constructor có tham số
    public HinhTron(double banKinh) {
        this.banKinh = banKinh;
    }

    // Getter cho bán kính
    public double getBanKinh() {
        return banKinh;
    }

    // Setter cho bán kính
    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

    // Tính diện tích hình tròn
    public double tinhDienTich() {
        return Math.PI * banKinh * banKinh;
    }

    // Tính chu vi hình tròn
    public double tinhChuVi() {
        return 2 * Math.PI * banKinh;
    }

    @Override
    public String toString() {
        return String.format("HinhTron[banKinh=%.2f, dienTich=%.2f, chuVi=%.2f]", 
                             banKinh, tinhDienTich(), tinhChuVi());
    }
}
