/**
 * [T6] Lớp con SachTieuThuyet kế thừa từ Sach. 
 * [T7] Triển khai (implements) giao diện IKiemKe. 
 */
public class SachTieuThuyet extends Sach implements IKiemKe {
    
    // [T6] Thuộc tính bổ sung 
    private String theLoai;
    private boolean laSachSeries;

    /**
     * [T6] & [T7] Hàm tạo đầy đủ tham số 
     */
    public SachTieuThuyet(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan, String theLoai, boolean laSachSeries) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.theLoai = theLoai;
        this.laSachSeries = laSachSeries;
    }

    /**
     * [T7] Triển khai phương thức trừu tượng tinhGiaBan()
     */
    @Override
    public double tinhGiaBan() {
        // [T7] Logic: Nếu laSachSeries là true thì cộng thêm 15.000 VNĐ 
        double phuThu = this.laSachSeries ? 15000 : 0;
        return getGiaCoBan() + phuThu;
    }

    /**
     * [T6] Ghi đè phương thức toString() [cite: 79]
     * [T7] Cập nhật toString() [cite: 16]
     */
    @Override
    public String toString() {
        return "[STT] " + super.toString() +
               ", The Loai: " + theLoai + ", Series: " + laSachSeries;
    }

    // --- [T7] Triển khai các phương thức của giao diện IKiemKe ---
    
    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu) {
        // [T7] Logic: Trả về true nếu soLuong ≥ soLuongToiThieu 
        return this.getSoLuong() >= soLuongToiThieu;
    }

    @Override
    public void capNhatViTri(String viTriMoi) {
        // [T7] Logic: In ra thông báo cập nhật vị trí 
        System.out.println("    -> [IKiemKe] Đã chuyển sách '" + getTieuDe() + "' đến khu vực: " + viTriMoi);
    }
}