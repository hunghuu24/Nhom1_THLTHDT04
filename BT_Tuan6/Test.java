import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLy ql = new QuanLy();
        int n;

        do {
            System.out.println("\n===== QUAN LY SACH =====");
            System.out.println("1. Them sach");
            System.out.println("2. Hien thi danh sach");
            System.out.println("3. Xoa sach");
            System.out.println("4. Sua sach");
            System.out.println("5. Tim kiem sach");
            System.out.println("0. Thoat");
            System.out.print("Lua chon cua ban: ");
            n = Integer.parseInt(sc.nextLine());
            switch (n) {
                case 1:
                    ql.ThemSach();
                    break;
                case 2:
                    ql.HienThiSach();
                    break;
                case 3:
                    ql.XoaSach();
                    break;
                case 4:
                    ql.SuaSach();
                    break;
                case 5:
                    ql.TimKiemSach();
                    break;
                case 0:
                    System.out.println("Thoat chuong trinh!");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }

        } while (n != 0);

        sc.close();
    }
}