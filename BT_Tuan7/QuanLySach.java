package BT_Tuan7;
import java.util.ArrayList;

public class QuanLySach {
    private ArrayList<Sach> danhSach;

    public QuanLySach() {
        danhSach = new ArrayList<>();
    }

    public boolean themSach(Sach s) {
        if (timKiemTheoMa(s.getMaSach()) != null) {
            return false;
        }
        danhSach.add(s);
        return true;
    }

    public boolean xoaSach(String maSach) {
        return danhSach.removeIf(s -> s.getMaSach().equals(maSach));
    }

    public boolean capNhatSach(String maSach, Sach sachMoi) {
        for (int i = 0; i < danhSach.size(); i++) {
            if (danhSach.get(i).getMaSach().equals(maSach)) {
                danhSach.set(i, sachMoi);
                return true;
            }
        }
        return false;
    }

    public Sach timKiemTheoMa(String maSach) {
        for (Sach s : danhSach) {
            if (s.getMaSach().equals(maSach)) return s;
        }
        return null;
    }

    public void hienThiDanhSachSach() {
        if (danhSach.isEmpty()) {
            System.out.println("Danh sach rong.");
            return;
        }
        for (Sach s : danhSach) {
            System.out.println(s.toString());
            System.out.println("Gia ban uoc tinh: " + s.tinhGiaBan() + " VND");
        }
    }
}
