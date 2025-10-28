package BT_Tuan8;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // Tạo đối tượng
        Scanner sc = new Scanner(System.in);
        
        // Yêu cầu 4: Khởi tạo đối tượng quản lý theo kiểu Interface
        IQuanLySach qls = new QuanLySachImpl();

        // Thêm sách
        System.out.println("--- THEM SACH MAU ---");
        // Lưu ý: Constructor của SachTieuThuyet/SachGiaoTrinh đã tự set giá cố định
        // là 30000/50000, nên tham số giaCoBan truyền vào không ảnh hưởng.
        qls.themSach(new SachTieuThuyet("MS001", "Harry Potter", "J.K.Rowling", 2005, 6, 30000, "Fantasy", true));
        qls.themSach(new SachTieuThuyet("MS002", "Tam Ly Hoc", "Giang", 2004, 15, 30000, "Tam Ly", false));
        qls.themSach(new SachTieuThuyet("MS003", "Neu tinh yeu lang quen", "Thu Nhoi Bong", 2009, 200, 30000, "Khong biet", true));
        qls.themSach(new SachGiaoTrinh("MS004", "Lap trinh huong doi tuong", "Tra My", 2015, 20, 50000, "Lap Trinh", "Cao"));
        qls.themSach(new SachGiaoTrinh("MS005", "Toan cao cap", "Truong Giang", 2011, 20, 50000, "Toan", "Cao"));
        qls.themSach(new SachGiaoTrinh("MS006", "Hoa sinh", "Ha Quyen", 2007, 50, 50000, "Hoa", "Cao"));
        System.out.println("------------------------------------");
        qls.hienThiDanhSach();

        // Tìm kiếm sách
        System.out.println("\n--- TIM KIEM SACH ---");
        System.out.print("Nhap ma sach muon tim: ");
        String masach = sc.nextLine();
        Sach timsach = qls.timKiemSach(masach);
        if (timsach != null)
            timsach.hienThiThongTin();
        else
            System.out.println("Khong tim thay sach.");

        // Cập nhật sách
        System.out.println("\n--- CAP NHAT SACH ---");
        System.out.print("Nhap ma sach muon cap nhat: "); // Sửa lại prompt
        String maupdate = sc.nextLine();
        qls.capNhatSach(maupdate, new SachTieuThuyet("MS007", "Messi", "Truong Giang", 2005, 10, 30000, "Võng Sư", true));
        qls.hienThiDanhSach();

        // Xóa sách
        System.out.println("\n--- XOA SACH ---");
        System.out.print("Nhap ma sach muon xoa: "); // Sửa lại prompt
        String maxoa = sc.nextLine();
        qls.xoaSach(maxoa);
        qls.hienThiDanhSach();
        
        // --- KIEM TRA INTERFACE IKiemKe ---
        // Ta sẽ test trên sách "MS003" có sẵn trong danh sách
        System.out.println("\n--- KIEM TRA INTERFACE IKiemKe (Test tren MS003) ---");
        Sach sachTest = qls.timKiemSach("MS003");

        if (sachTest != null) {
            System.out.println("Tim thay sach: " + sachTest.getTieuDe() + " (So luong: " + sachTest.getSoLuong() + ")");
            
            // 1. Gọi phương thức kiemTraTonKho(100)
            boolean ketQuaDu = sachTest.kiemTraTonKho(100);
            System.out.println("Kiem tra ton kho (>= 100): " + (ketQuaDu ? "Du hang" : "Thieu hang")); // Sẽ in ra "Du hang"
            
            // 2. Gọi phương thức kiemTraTonKho(300)
            boolean ketQuaThieu = sachTest.kiemTraTonKho(300);
            System.out.println("Kiem tra ton kho (>= 300): " + (ketQuaThieu ? "Du hang" : "Thieu hang")); // Sẽ in ra "Thieu hang"
            
            // 3. Gọi phương thức capNhatViTri("Ke A3")
            System.out.println("\n--- CAP NHAT VI TRI ---");
            sachTest.capNhatViTri("Kho A1-Ke 5"); 
            // Phương thức capNhatViTri trong SachTieuThuyet/SachGiaoTrinh sẽ tự in ra thông báo
        } else {
            System.out.println("Khong tim thay sach MS003 de test.");
        }

        sc.close();
    }
}