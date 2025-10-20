package BT_Tuan6;
import java.util.ArrayList;
public class QuanLySach {
    
    private ArrayList <Sach> danhSachSach;

    public QuanLySach() {
        danhSachSach = new ArrayList<>();
    }
    
    public void themSach(Sach sachMoi) {
        danhSachSach.add(sachMoi);
        System.out.println("Da them sach: " + sachMoi.getMaSach());
    }
   
    public boolean xoaSach(String maSach) {
        for (Sach i : danhSachSach) {
            if (i.getMaSach().equals(maSach)) {
                danhSachSach.remove(i);
                System.out.println("Da xoa sach co ma: " + maSach);
                return true;
            }
        }
        System.out.println("khong tim thay sach co ma: " + maSach);
        return false;
    }

    public boolean capNhatSach(String maSach, Sach sachMoi) {
        for (int i = 0; i < danhSachSach.size(); i++) {
            if (danhSachSach.get(i).getMaSach().equals(maSach))
            {
                danhSachSach.set(i, sachMoi);
                System.out.println("Da cap nhat sach co ma: " + maSach);
                return true;
            }
        }
        System.out.println("khong tim thay sach co ma: " + maSach);
        return false;
    }

    public Sach timKiemSach(String maSach) {
        for (Sach s : danhSachSach) {
            if (s.getMaSach().equals(maSach)) {
                return s;
            }
        }
        return null;
    }

    public void hienThiDanhSach() {
        if (danhSachSach.isEmpty()) {
            System.out.println("Danh sach trong!");
        } else {
            System.out.println("Danh sach hien co:");
            for (Sach s : danhSachSach) {
                System.out.println("--------------------------------");
                System.out.println(s.toString());
            }
        }
    }
}
