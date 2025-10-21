package BT_Tuan7;
import java.util.Scanner;

public class Test
{
    public static void main(String[] args)
    { 
        //tạo đối tượng
        Scanner sc = new Scanner(System.in);
        QuanLySach qls = new QuanLySach();

        // Thêm sách
        qls.themSach(new SachTieuThuyet("MS001", "Harry Potter", "J.K.Rowling", 2005, 6, 50000 ,"fantasy", true));
        qls.themSach(new SachTieuThuyet("MS002", "Tam Ly Hoc", "Giang", 2004, 15, 50000 ,"Tam Ly", false));
        qls.themSach(new SachTieuThuyet("MS003", "Neu tinh yeu lang quen", "Thu Nhoi Bong", 2009, 200, 50000 ,"Khong biet", true));
        qls.themSach(new SachGiaoTrinh("MS004", "Lap trinh huong doi tuong", "Tra my", 2015, 20, 50000,"Lap Trinh", "Cao"));
        qls.themSach(new SachGiaoTrinh("MS005", "toan cao cap", "Truonqqianq", 2011, 20, 50000,"Toan", "Cao"));
        qls.themSach(new SachGiaoTrinh("MS006", "Hoa sinh", "Ha Quyen", 2007, 50, 50000,"hoa", "Cao"));
        qls.hienThiDanhSach();

        // Tìm kiếm sách
        System.out.print("Nhap ma sach muon tim: ");
        String masach = sc.nextLine();       
        Sach timsach = qls.timKiemSach(masach);
        if (timsach != null)
            timsach.hienThiThongTin();
        else
            System.out.println("Khong tim thay sach.");

        // Cập nhật sách
        System.out.println("Nhap thong tin muon cap nhat: ");
        String maupdate = sc.nextLine();
        qls.capNhatSach(maupdate, new SachTieuThuyet("MS007", "Messi", "Truonqqianq", 2005, 10, 70000,"Võng Sư", true));
        qls.hienThiDanhSach();

        // Xóa sách
        System.out.println("------------------------------------");
        System.out.println("Nhap thong tin sach muon xoa: ");
        String maxoa = sc.nextLine();
        qls.xoaSach(maxoa);
        qls.hienThiDanhSach();
        // Gọi phương thức kiemTraTonKho(100)
        System.out.println("------------------------------------");
        System.out.println("\n--- KIEM TRA TON KHO ---");
        IKiemKe kiemke = new SachTieuThuyet("MS003", "Neu tinh yeu lang quen", "Thu Nhoi Bong", 2009, 200, 50000 ,"Khong biet", true);
        boolean Ketqua = kiemke.kiemTraTonKho(100);
        System.out.println("Kiem tra ton kho (100): " + (Ketqua ? "Du hang" : "Thieu hang")); // Sẽ in ra "Du hang"
        /*  Gọi phương thức kiemTraTonKho(300)
        boolean thieuHang = kiemKe.kiemTraTonKho(300);
        System.out.println("Kiem tra ton kho (200): " + (thieuHang ? "Du hang" : "Thieu hang")); // Sẽ in ra "Thieu hang" */
        // Gọi phương thức capNhatViTri("Ke A3")
        System.out.println("\n--- CAP NHAT VI TRI ---");
        kiemke.capNhatViTri("Kho A1-Ke 5" );
        System.out.println("Da chuyen sach " + ((SachTieuThuyet) kiemke).getMaSach() + " den vi tri moi.");
        sc.close(); 
    }
}