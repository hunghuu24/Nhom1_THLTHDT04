package BTTH_Tuan6;
import java.util.Scanner;

public class Test
{
    public static void main(String[] args)
    { 
        //tạo đối tượng
        Scanner sc = new Scanner(System.in);
        QuanLySach qls = new QuanLySach();

        // Thêm sách
        qls.themSach(new SachTieuThuyet("MS001", "Harry Potter", "J.K.Rowling", 2005, 10, "Võng Sư", true));
        qls.themSach(new SachGiaoTrinh("MS002", "Lap trinh huong doi tuong", "Tra my", 2015, 20, "Lập Trình", "Cao"));
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
        qls.capNhatSach(maupdate, new SachTieuThuyet("MS003", "Ronaldo", "Truonqqianq", 2005, 10, "Võng Sư", true));
        qls.hienThiDanhSach();

        // Xóa sách
        System.out.println("Nhap thong tin sach muon xoa: ");
        String maxoa = sc.nextLine();
        qls.xoaSach(maxoa);
        qls.hienThiDanhSach();
        sc.close();
    }
}