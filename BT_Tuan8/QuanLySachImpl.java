package BT_Tuan8;


import java.util.ArrayList;

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
    public void hienThiDanhSach() {
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
}