package BT_Tuan7;

import java.util.ArrayList;

public class QuanLySach implements IQuanLySach {
    private ArrayList<Sach> danhSach;

    public QuanLySach() {
        danhSach = new ArrayList<>();
    }

    @Override
    public boolean themSach(Sach s) {
        if (timKiemTheoMa(s.getMaSach()) != null) {
            System.out.println("Ma sach da ton tai!");
            return false;
        }
        danhSach.add(s);
        System.out.println("Da them sach: " + s.getTieuDe());
        return true;
    }

    @Override
    public boolean xoaSach(String maSach) {
        boolean removed = danhSach.removeIf(s -> s.getMaSach().equalsIgnoreCase(maSach));
        if (removed) System.out.println("Da xoa sach co ma: " + maSach);
        else System.out.println("Khong tim thay ma sach!");
        return removed;
    }

    public Sach timKiemTheoMa(String maSach) {
        for (Sach s : danhSach) {
            if (s.getMaSach().equalsIgnoreCase(maSach)) return s;
        }
        return null;
    }

    @Override
    public Sach timKiemTheoTen(String tenSach) {
        for (Sach s : danhSach) {
            if (s.getTieuDe().equalsIgnoreCase(tenSach)) return s;
        }
        return null;
    }

    @Override
    public void hienThiDanhSachSach() {
        if (danhSach.isEmpty()) {
            System.out.println("Danh sach rong.");
            return;
        }
        System.out.println("\n=== DANH SACH SACH HIEN CO ===");
        for (Sach s : danhSach) {
            System.out.println(s.toString());
        }
    }
}
