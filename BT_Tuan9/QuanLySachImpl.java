package BT_Tuan9;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// Yêu cầu 3: Lớp triển khai implements interface IQuanLySach
public class QuanLySachImpl implements IQuanLySach {

    private ArrayList<Sach> danhSachSach;

    public QuanLySachImpl() {
        danhSachSach = new ArrayList<>();
    }

    @Override
    public void themSach(Sach sachMoi) {
        danhSachSach.add(sachMoi);
        System.out.println("Da them sach: " + sachMoi.getTieuDe());
    }

    @Override
    public boolean xoaSach(String maSach) {
        for (Sach i : danhSachSach) {
            if (i.getMaSach().equals(maSach)) {
                danhSachSach.remove(i);
                System.out.println("Da xoa sach co ma: " + maSach);
                return true;
            }
        }
        System.out.println("Khong tim thay sach co ma: " + maSach);
        return false;
    }

    @Override
    public boolean capNhatSach(String maSach, Sach sachMoi) {
        for (int i = 0; i < danhSachSach.size(); i++) {
            if (danhSachSach.get(i).getMaSach().equals(maSach)) {
                danhSachSach.set(i, sachMoi);
                System.out.println("Da cap nhat sach co ma: " + maSach);
                return true;
            }
        }
        System.out.println("Khong tim thay sach co ma: " + maSach);
        return false;
    }

    @Override
    public Sach timKiemSach(String maSach) {
        for (Sach s : danhSachSach) {
            if (s.getMaSach().equals(maSach)) {
                return s;
            }
        }
        return null;
    }
    @Override
    public void sapXepSach() {
        Collections.sort(danhSachSach, new Comparator<Sach>() {
            // Gọi phương thức sort() của lớp Collections:
            // Bên trong sort() sẽ tự động chạy nhiều vòng lặp
            // để sắp xếp danhSachSach theo quy tắc được định nghĩa trong Comparator.
            @Override
            public int compare(Sach s1, Sach s2) {
                // Phương thức compare() thuộc interface Comparator.
                // Hàm này được gọi lặp lại nhiều lần, mỗi lần so sánh 2 đối tượng (s1 và s2)
                // để xác định thứ tự giữa chúng.
                if (s1 instanceof SachTieuThuyet && s2 instanceof SachGiaoTrinh) {
                    return -1; // Tiểu thuyết đứng trước giáo trình
                } else if (s1 instanceof SachGiaoTrinh && s2 instanceof SachTieuThuyet) {
                    return 1; // Giáo trình đứng sau tiểu thuyết
                } else {
                    // So sánh theo mã sách nếu cùng loại
                    return s1.getMaSach().compareToIgnoreCase(s2.getMaSach());
                }
            }
        });
    }
    @Override
    public void hienThiDanhSach() {
        sapXepSach();
        if (danhSachSach.isEmpty()) {
            System.out.println("Danh sach trong!");
        } else {
            System.out.println("========== DANH SACH SACH ==========");
            for (Sach s : danhSachSach) {
                System.out.println(s.toString());
                System.out.println("------------------------------------");
            }
        }
    }
    @Override
    public int tinhTongSoLuong() {
        int tong = 0;
        // Duyệt qua tất cả sách trong danh sách
        for (Sach s : danhSachSach) {
            // Lấy số lượng của từng cuốn sách và cộng dồn
            tong += s.getSoLuong(); 
        }
        return tong;
    }
}