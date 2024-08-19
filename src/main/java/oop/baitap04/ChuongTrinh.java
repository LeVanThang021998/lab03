package oop.baitap04;

import java.util.Scanner;

public class ChuongTrinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập thông tin cho Hình tròn
        System.out.print("Nhap ban kinh hinh tron: ");
        double banKinhTron = sc.nextDouble();
        HinhTron hinhTron = new HinhTron(banKinhTron);

        // Xuất thông tin của Hình tròn
        System.out.println("Thong tin Hinh Tron:");
        System.out.println(hinhTron);

        // Nhập thông tin cho Hình trụ
        System.out.print("Nhap ban kinh hinh tron cho hinh tru: ");
        double banKinhTru = sc.nextDouble();
        System.out.print("Nhap chieu cao hinh tru: ");
        double chieuCaoTru = sc.nextDouble();
        HinhTru hinhTru = new HinhTru(banKinhTru, chieuCaoTru);

        // Xuất thông tin của Hình trụ
        System.out.println("Thong tin Hinh Tru:");
        System.out.println(hinhTru);
    }
}
