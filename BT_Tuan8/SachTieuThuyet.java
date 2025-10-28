/**
 * [YC2] Lớp con SachTieuThuyet kế thừa từ Sach.
 * Kế thừa các phương thức trừu tượng từ IGiaBan và IKiemKe (thông qua lớp Sach).
 */
public class SachTieuThuyet extends Sach {
    
    private String theLoai;
    private boolean laSachSeries;

    /**
     * Hàm tạo đầy đủ tham số 
     */
    public SachTieuThuyet(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan, String theLoai, boolean laSachSeries) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.theLoai = theLoai;
        this.laSachSeries = laSachSeries;
    }

    /**
     * [YC2] Triển khai phương thức trừu tượng tinhGiaBan() (từ IGiaBan)
     */
    @Override
    public double tinhGiaBan() {
        // Logic: Nếu laSachSeries là true thì cộng thêm 15.000 VNĐ 
        double phuThu = this.laSachSeries ? 15000 : 0;
        return getGiaCoBan() + phuThu;
    }

    /**
     * [YC2] Ghi đè phương thức toString()
     */
    @Override
    public String toString() {
        return "[STT] " + super.toString() +
               ", The Loai: " + theLoai + ", Series: " + laSachSeries;
    }

    // --- [YC2] Triển khai các phương thức của giao diện IKiemKe ---
    
    /**
     * [YC2] Logic: Trả về true nếu soLuong ≥ soLuongToiThieu 
     */
    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu) {
        return this.getSoLuong() >= soLuongToiThieu;
    }

    /**
     * [YC2] Logic: In ra thông báo cập nhật vị trí 
     */
    @Override
    public void capNhatViTri(String viTriMoi) {
        System.out.println("    -> [IKiemKe] Đã chuyển sách '" + getTieuDe() + "' đến khu vực: " + viTriMoi);
    }
}