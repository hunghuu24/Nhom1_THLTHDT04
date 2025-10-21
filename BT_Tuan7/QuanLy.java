import java.util.Scanner;
import java.util.ArrayList;
public class QuanLy {
    private ArrayList<Sach> QuanLySach;
    private Scanner sc;
    public QuanLy() {
        QuanLySach = new ArrayList<Sach>();
        sc = new Scanner(System.in);
    }
   public void ThemSach() {
        System.out.println("Chon loai sach can them:");
        System.out.println("1. Sach giao trinh");
        System.out.println("2. Sach tieu thuyet");

        int n = Integer.parseInt(sc.nextLine());
        Sach s;

        if (n == 1) {
            s = new SachGiaoTrinh();
        } else if (n == 2) {
            s = new SachTieuThuyet();
        } else {
            System.out.println("Lua chon khong hop le!");
            return;
        }
        s.Nhap();
        QuanLySach.add(s);
        System.out.println("Them thanh cong!");
    }
    public void XoaSach() {
        System.out.print("Nhap ma sach can xoa: ");
        String ma = sc.nextLine();
        Sach sachCanXoa = null;

        for (Sach s : QuanLySach) {
            if (s.getMaSach().equals(ma)) {
                sachCanXoa = s;
                break;
            }
        }

        if (sachCanXoa != null) {
            QuanLySach.remove(sachCanXoa);
            System.out.println("Xoa thanh cong!");
        } else {
            System.out.println("Khong tim thay sach co ma nay!");
        }
    }
    public void SuaSach() {
        System.out.print("Nhap ma sach can sua: ");
        String ma = sc.nextLine();
        for (Sach s : QuanLySach) {
            if (s.getMaSach().equals(ma)) {
                System.out.println("Nhap thong tin moi cho sach:");
                s.Nhap();
                System.out.println("Da cap nhat thong tin sach!");
                return;
            }
        }
        System.out.println("Khong tim thay sach co ma nay!");
    }
    public void TimKiemSach() {
        System.out.print("Nhap ma sach can tim: ");
        String ma = sc.nextLine();
        Sach s = null;
        for (Sach sach : QuanLySach) {
            if (sach.getMaSach().equals(ma)) {
                s = sach;
                break;
            }
        }
        if (s != null) {
            System.out.println(s);
        } else {
            System.out.println("Khong tim thay sach co ma nay!");
        }
    }
    public Sach TimKiem(String ma) {
        for (Sach sach : QuanLySach) {
            if (sach.getMaSach().equals(ma)) {
                return sach;
            }
        }
        return null;
    }
    public void KiemKe() {
        System.out.print("Nhap ma sach can kiem ke: ");
        String kiemke = sc.nextLine();
        Sach s = TimKiem(kiemke);
        if(s == null) {
            System.out.println("Khong tim thay sach co ma nay!");
            return;
        }
        if (s instanceof IkiemKe) {
            IkiemKe ikiemke = (IkiemKe) s;
            System.out.print("Nhap so luong toi thieu can kiem tra: ");
            int soLuongToiThieu = Integer.parseInt(sc.nextLine());
            boolean tonKho = ikiemke.kiemTraTonKho(soLuongToiThieu);
            if (tonKho) {
                System.out.println("Sach con du ton kho.");
            } else {
                System.out.println("Sach khong du ton kho.");
            }
            System.out.print("Nhap vi tri moi de cap nhat: ");
            String viTriMoi = sc.nextLine();
            ikiemke.capNhatViTri(viTriMoi);
        }
    }    
    public void HienThiSach() {
        if (QuanLySach.isEmpty()) {
            System.out.println("Danh sach sach rong!");
            return;
        }
        for (Sach s : QuanLySach) {
            System.out.println("--------------------");
            System.out.println(s);
        }
    }
}
