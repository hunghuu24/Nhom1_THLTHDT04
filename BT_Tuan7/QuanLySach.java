import java.util.ArrayList;

/**
 * [T6] Lớp QuanLySach để quản lý danh sách các loại sách. 
 * [T7] Cập nhật các phương thức. 
 */
public class QuanLySach {
    
    // [T6] Sử dụng ArrayList để lưu trữ (Tính đa hình)
    private ArrayList<Sach> danhSachSach;

    public QuanLySach() {
        this.danhSachSach = new ArrayList<>();
    }

    /**
     * [T6] Chức năng thêm mới sách. 
     */
    public void themSach(Sach s) {
        danhSachSach.add(s);
        System.out.println("Đã thêm sách: " + s.getTieuDe());
    }

    /**
     * [T6] Chức năng tìm kiếm sách theo mã. 
     */
    public Sach timKiemSach(String maSach) {
        for (Sach s : danhSachSach) {
            if (s.getMaSach().equalsIgnoreCase(maSach)) {
                return s;
            }
        }
        return null;
    }

    /**
     * [T6] Chức năng xóa sách theo mã. 
     */
    public boolean xoaSach(String maSach) {
        Sach s = timKiemSach(maSach);
        if (s != null) {
            danhSachSach.remove(s);
            System.out.println("Đã xóa sách: " + s.getTieuDe());
            return true;
        }
        System.out.println("Không tìm thấy sách để xóa với mã: " + maSach);
        return false;
    }

    /**
     * [T6] Chức năng cập nhật sách theo mã. 
     */
    public boolean capNhatSach(String maSach, Sach sachMoi) {
        for (int i = 0; i < danhSachSach.size(); i++) {
            if (danhSachSach.get(i).getMaSach().equalsIgnoreCase(maSach)) {
                danhSachSach.set(i, sachMoi);
                System.out.println("Đã cập nhật sách: " + maSach);
                return true;
            }
        }
        System.out.println("Không tìm thấy sách để cập nhật với mã: " + maSach);
        return false;
    }

    /**
     * [T6] Chức năng hiển thị danh sách. 
     * [T7] Cập nhật để hiển thị thêm Giá Bán Ước Tính. 
     */
    public void hienThiDanhSach() {
        System.out.println("\n--- HIỂN THỊ DANH SÁCH SÁCH ---");
        if (danhSachSach.isEmpty()) {
            System.out.println("Danh sách hiện đang trống.");
            return;
        }
        for (Sach s : danhSachSach) {
            // In thông tin cơ bản (gọi toString() của lớp con)
            System.out.println(s.toString()); 
            
            // [T7] In thêm giá bán (gọi phương thức tinhGiaBan() đa hình) [cite: 30]
            System.out.println("    => Giá Bán Ước Tính: " + s.tinhGiaBan() + " VNĐ");
            System.out.println("----------------------------------------");
        }
    }
}