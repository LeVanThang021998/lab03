package oop.baitap03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class QuanLySanPham {
    private static List<SanPham> danhSachSanPham = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean exit = false;
        
        while (!exit) {
            System.out.println("Menu:");
            System.out.println("1. Nhap danh sach san pham");
            System.out.println("2. Sap xep giam dan theo gia va xuat ra man hinh");
            System.out.println("3. Tim va xoa san pham theo ten");
            System.out.println("4. Xuat gia trung binh cua cac san pham");
            System.out.println("5. Thoat");
            System.out.print("Chon chuc nang: ");
            
            int choice = sc.nextInt();
            sc.nextLine(); // Clear newline left-over

            switch (choice) {
                case 1:
                    nhapDanhSachSanPham();
                    break;
                case 2:
                    sapXepVaXuat();
                    break;
                case 3:
                    timVaXoaSanPham();
                    break;
                case 4:
                    xuatGiaTrungBinh();
                    break;
                case 5:
                    exit = true;
                    System.out.println("Thoat chuong trinh.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le. Vui long chon lai.");
            }
        }
    }

    private static void nhapDanhSachSanPham() {
        System.out.print("Nhap so luong san pham: ");
        int soLuong = sc.nextInt();
        sc.nextLine(); // Clear newline left-over

        for (int i = 0; i < soLuong; i++) {
            System.out.print("Nhap ten san pham: ");
            String ten = sc.nextLine();
            System.out.print("Nhap gia san pham: ");
            double gia = sc.nextDouble();
            sc.nextLine(); // Clear newline left-over

            danhSachSanPham.add(new SanPham(ten, gia));
        }
    }

    private static void sapXepVaXuat() {
        // Sort the list in descending order based on price
        Collections.sort(danhSachSanPham, new Comparator<SanPham>() {
            @Override
            public int compare(SanPham s1, SanPham s2) {
                return Double.compare(s2.getGia(), s1.getGia());
            }
        });

        // Print the sorted list
        System.out.println("Danh sach san pham sau khi sap xep giam dan theo gia:");
        for (SanPham sp : danhSachSanPham) {
            System.out.println(sp);
        }
    }

    private static void timVaXoaSanPham() {
        System.out.print("Nhap ten san pham can tim va xoa: ");
        String ten = sc.nextLine();

        boolean removed = danhSachSanPham.removeIf(sp -> sp.getTen().equalsIgnoreCase(ten));
        if (removed) {
            System.out.println("San pham da duoc xoa.");
        } else {
            System.out.println("San pham khong ton tai.");
        }
    }

    private static void xuatGiaTrungBinh() {
        if (danhSachSanPham.isEmpty()) {
            System.out.println("Danh sach san pham rong.");
            return;
        }

        double tongGia = 0;
        for (SanPham sp : danhSachSanPham) {
            tongGia += sp.getGia();
        }
        double giaTrungBinh = tongGia / danhSachSanPham.size();
        System.out.printf("Gia trung binh cua cac san pham la: %.2f\n", giaTrungBinh);
    }
}
