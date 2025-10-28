/**
 * [YC3] Giao diện trừu tượng hóa các chức năng quản lý sách.
 */
public interface IQuanLySach {

    void themSach(Sach s);

    Sach timKiemSach(String maSach);

    boolean xoaSach(String maSach);

    boolean capNhatSach(String maSach, Sach sachMoi);

    void hienThiDanhSach();
}