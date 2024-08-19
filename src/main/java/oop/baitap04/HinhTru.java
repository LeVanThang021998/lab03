package oop.baitap04;

public class HinhTru extends HinhTron {
    private double chieuCao;

    // Constructor không tham số
    public HinhTru() {
        super();
        this.chieuCao = 0.0;
    }

    // Constructor có tham số
    public HinhTru(double banKinh, double chieuCao) {
        super(banKinh);
        this.chieuCao = chieuCao;
    }

    // Getter cho chiều cao
    public double getChieuCao() {
        return chieuCao;
    }

    // Setter cho chiều cao
    public void setChieuCao(double chieuCao) {
        this.chieuCao = chieuCao;
    }

    // Ghi đè phương thức tính diện tích
    @Override
    public double tinhDienTich() {
        return 2 * super.tinhDienTich() + 2 * Math.PI * getBanKinh() * chieuCao;
    }

    // Tính thể tích của hình trụ
    public double tinhTheTich() {
        return super.tinhDienTich() * chieuCao;
    }

    @Override
    public String toString() {
        return String.format("HinhTru[banKinh=%.2f, chieuCao=%.2f, dienTich=%.2f, theTich=%.2f]", 
                             getBanKinh(), chieuCao, tinhDienTich(), tinhTheTich());
    }
}
