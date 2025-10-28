import java.util.ArrayList;

/**
 * [YC3] Lớp triển khai (implements) giao diện IQuanLySach.
 * Quản lý danh sách các loại sách.
 */
public class QuanLySachImpl implements IQuanLySach {
    
    private ArrayList<Sach> danhSachSach;

    public QuanLySachImpl() {
        this.danhSachSach = new ArrayList<>();
    }

    /**
     * [YC3] Chức năng thêm mới sách. 
     */
    @Override
    public void themSach(Sach s) {
        danhSachSach.add(s);
        System.out.println("Đã thêm sách: " + s.getTieuDe());
    }

    /**
     * [YC3] Chức năng tìm kiếm sách theo mã. 
     */
    @Override
    public Sach timKiemSach(String maSach) {
        for (Sach s : danhSachSach) {
            if (s.getMaSach().equalsIgnoreCase(maSach)) {
                return s;
            }
        }
        return null;
    }

    /**
     * [YC3] Chức năng xóa sách theo mã. 
     */
    @Override
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
     * [YC3] Chức năng cập nhật sách theo mã. 
     */
    @Override
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
     * [YC3] Chức năng hiển thị danh sách. 
     */
    @Override
    public void hienThiDanhSach() {
        System.out.println("\n--- HIỂN THỊ DANH SÁCH SÁCH ---");
        if (danhSachSach.isEmpty()) {
            System.out.println("Danh sách hiện đang trống.");
            return;
        }
        for (Sach s : danhSachSach) {
            // In thông tin cơ bản (gọi toString() của lớp con)
            System.out.println(s.toString()); 
            
            // In thêm giá bán (gọi phương thức tinhGiaBan() đa hình)
            System.out.println("    => Giá Bán Ước Tính: " + s.tinhGiaBan() + " VNĐ");
            System.out.println("----------------------------------------");
        }
    }
}