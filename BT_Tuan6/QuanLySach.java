public class QuanLySach {
    private Sach[] danhSach;
    private int soLuong;
    private final int MAX = 100;

    public QuanLySach() {
        danhSach = new Sach[MAX];
        soLuong = 0;
    }

    public boolean themSach(Sach s) {
        if (soLuong >= MAX) return false;
        if (timKiemTheoMa(s.getMaSach()) != null) {
            // đã tồn tại mã này
            return false;
        }
        danhSach[soLuong++] = s;
        return true;
    }

    public boolean xoaSach(String maSach) {
        for (int i = 0; i < soLuong; i++) {
            if (danhSach[i].getMaSach().equals(maSach)) {
                for (int j = i; j < soLuong - 1; j++) {
                    danhSach[j] = danhSach[j + 1];
                }
                danhSach[soLuong - 1] = null;
                soLuong--;
                return true;
            }
        }
        return false;
    }

    public boolean capNhatSach(String maSach, Sach sachMoi) {
        for (int i = 0; i < soLuong; i++) {
            if (danhSach[i].getMaSach().equals(maSach)) 
            {
                danhSach[i] = sachMoi;
                return true;
            }
        }
        return false;
    }

    public Sach timKiemTheoMa(String maSach) {
        for (int i = 0; i < soLuong; i++) {
            if (danhSach[i].getMaSach().equals(maSach)) {
                return danhSach[i];
            }
        }
        return null;
    }

    public void hienThi() {
        if (soLuong == 0) {
            System.out.println("Danh sach rong.");
            return;
        }
        for (int i = 0; i < soLuong; i++) {
            System.out.println(danhSach[i].toString());
        }
    }
}
