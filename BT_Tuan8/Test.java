package BT_Tuan7;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IQuanLySach ql = new QuanLySach();

        int chon;
        do {
            System.out.println("\n===== MENU QUAN LY SACH =====");
            System.out.println("1. Them Sach Giao Trinh");
            System.out.println("2. Them Sach Tieu Thuyet");
            System.out.println("3. Hien thi danh sach");
            System.out.println("4. Tim sach theo ten");
            System.out.println("5. Xoa sach theo ma");
            System.out.println("0. Thoat");
            System.out.print("Chon: ");
            chon = sc.nextInt();
            sc.nextLine();

            switch (chon) {
                case 1 -> {
                    System.out.print("Ma sach: "); String ma = sc.nextLine();
                    System.out.print("Tieu de: "); String ten = sc.nextLine();
                    System.out.print("Tac gia: "); String tg = sc.nextLine();
                    System.out.print("Nam xuat ban: "); int nam = sc.nextInt();
                    System.out.print("So luong: "); int sl = sc.nextInt();
                    System.out.print("Gia co ban: "); double gia = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Mon hoc: "); String mh = sc.nextLine();
                    System.out.print("Cap do: "); String cd = sc.nextLine();

                    ql.themSach(new SachGiaoTrinh(ma, ten, tg, nam, sl, gia, mh, cd));
                }
                case 2 -> {
                    System.out.print("Ma sach: "); String ma = sc.nextLine();
                    System.out.print("Tieu de: "); String ten = sc.nextLine();
                    System.out.print("Tac gia: "); String tg = sc.nextLine();
                    System.out.print("Nam xuat ban: "); int nam = sc.nextInt();
                    System.out.print("So luong: "); int sl = sc.nextInt();
                    System.out.print("Gia co ban: "); double gia = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("The loai: "); String tl = sc.nextLine();
                    System.out.print("Co phai sach series (true/false)? ");
                    boolean series = sc.nextBoolean();
                    sc.nextLine();

                    ql.themSach(new SachTieuThuyet(ma, ten, tg, nam, sl, gia, tl, series));
                }
                case 3 -> ql.hienThiDanhSachSach();
                case 4 -> {
                    System.out.print("Nhap ten sach can tim: ");
                    String tenTK = sc.nextLine();
                    Sach kq = ql.timKiemTheoTen(tenTK);
                    if (kq != null) System.out.println("Tim thay: " + kq);
                    else System.out.println("Khong tim thay sach.");
                }
                case 5 -> {
                    System.out.print("Nhap ma sach can xoa: ");
                    String maXoa = sc.nextLine();
                    ql.xoaSach(maXoa);
                }
                case 0 -> System.out.println("Ket thuc chuong trinh.");
                default -> System.out.println("Lua chon khong hop le!");
            }
        } while (chon != 0);

        sc.close();
    }
}
