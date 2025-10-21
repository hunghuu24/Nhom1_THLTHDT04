package BT_Tuan7;

public class Test {
    public static void main(String[] args) {
        SachGiaoTrinh gt1 = new SachGiaoTrinh("GT01", "Giai tich 1", "Nguyen Van C", 2019, 10, 50000, "Toan", "Dai hoc");
        SachTieuThuyet tt1 = new SachTieuThuyet("TT01", "Doraemon", "Fujiko F. Fujio", 2015, 7, 70000, "Thieu nhi", true);

        QuanLySach ql = new QuanLySach();
        ql.themSach(gt1);
        ql.themSach(tt1);

        System.out.println("\nDANH SACH SACH HIEN CO:");
        ql.hienThiDanhSachSach();

        System.out.println("\nKIEM TRA GIAO DIEN IKiemKe:");
        IKiemKe kiemKe = gt1;
        System.out.println("Kiem tra ton kho >= 5? " + kiemKe.kiemTraTonKho(5));
        kiemKe.capNhatViTri("Kho A1 - Ke 5");

        IKiemKe kiemKe2 = tt1;
        System.out.println("Kiem tra ton kho >= 10? " + kiemKe2.kiemTraTonKho(10));
        kiemKe2.capNhatViTri("Kho B2 - Ke 3");
    }
}
