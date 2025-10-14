import java.util.ArrayList;
import java.util.List;

public class QuanLySach {
    private List<Sach> danhSachSach;

    public QuanLySach() {
        this.danhSachSach = new ArrayList<>();
    }

    // 1. Thêm sách mới
    public void themSach(Sach sach) {
        // Kiểm tra xem mã sách đã tồn tại chưa
        if (timKiemTheoMaSach(sach.getMaSach()) != null) {
            System.out.println("Loi: Ma sach " + sach.getMaSach() + " da ton tai!");
            return;
        }
        this.danhSachSach.add(sach);
        System.out.println("Da them sach \"" + sach.getTieuDe() + "\" thanh cong.");
    }

    // 2. Xóa sách theo mã
    public void xoaSach(String maSach) {
        Sach sachCanXoa = timKiemTheoMaSach(maSach);
        if (sachCanXoa != null) {
            this.danhSachSach.remove(sachCanXoa);
            System.out.println("Da xoa sach co ma " + maSach + " thanh cong.");
        } else {
            System.out.println("Khong tim thay sach co ma " + maSach + " de xoa.");
        }
    }

    // 3. Cập nhật số lượng sách
    public void capNhatSoLuong(String maSach, int soLuongMoi) {
        Sach sachCanCapNhat = timKiemTheoMaSach(maSach);
        if (sachCanCapNhat != null) {
            sachCanCapNhat.setSoLuong(soLuongMoi);
            System.out.println("Da cap nhat so luong cho sach co ma " + maSach + ".");
        } else {
            System.out.println("Khong tim thay sach co ma " + maSach + " de cap nhat.");
        }
    }

    // 4. Tìm kiếm sách theo mã
    public Sach timKiemTheoMaSach(String maSach) {
        for (Sach sach : this.danhSachSach) {
            if (sach.getMaSach().equalsIgnoreCase(maSach)) {
                return sach;
            }
        }
        return null;
    }

    // 5. Hiển thị toàn bộ danh sách sách
    public void hienThiDanhSach() {
        System.out.println("\n===== DANH SACH SACH TRONG THU VIEN =====");
        if (danhSachSach.isEmpty()) {
            System.out.println("Thu vien chua co sach nao.");
        } else {
            for (Sach sach : this.danhSachSach) {
                System.out.println(sach.toString()); // Tính đa hình được thể hiện ở đây
                System.out.println("----------------------------------------");
            }
        }
    }
}