package BT_Tuan8;

public interface IQuanLySach {
    void themSach(Sach sachMoi);
    boolean xoaSach(String maSach);
    boolean capNhatSach(String maSach, Sach sachMoi);
    Sach timKiemSach(String maSach);
    void hienThiDanhSach();
}