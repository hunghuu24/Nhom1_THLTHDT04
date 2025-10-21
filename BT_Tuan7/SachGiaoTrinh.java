/**
 * [T6] Lớp con SachGiaoTrinh kế thừa từ Sach. 
 * [T7] Triển khai (implements) giao diện IKiemKe. 
 */
public class SachGiaoTrinh extends Sach implements IKiemKe {
    
    // [T6] Thuộc tính bổ sung 
    private String monHoc;
    private String capDo;

    /**
     * [T6] & [T7] Hàm tạo đầy đủ tham số 
     */
    public SachGiaoTrinh(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan, String monHoc, String capDo) {
        // [T6] Gọi constructor lớp cha [cite: 72]
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.monHoc = monHoc;
        this.capDo = capDo;
    }

    /**
     * [T7] Triển khai phương thức trừu tượng tinhGiaBan()
     */
    @Override
    public double tinhGiaBan() {
        // [T7] Logic: Giá bán = giaCoBan + (Số năm đã xuất bản × 5.000 VNĐ) 
        int soNamDaXuatBan = 2025 - getNamXuatBan(); // Giả định năm hiện tại là 2025
        return getGiaCoBan() + (soNamDaXuatBan * 5000);
    }

    /**
     * [T6] Ghi đè phương thức toString() 
     * [T7] Cập nhật toString() 
     */
    @Override
    public String toString() {
        // [T6] Sử dụng super.toString() để lấy thông tin lớp cha
        return "[SGT] " + super.toString() +
               ", Mon: " + monHoc + ", Cap Do: " + capDo;
    }

    // --- [T7] Triển khai các phương thức của giao diện IKiemKe ---
    
    /**
     * [T7] Logic: Trả về true nếu soLuong ≥ soLuongToiThieu. [
     */
    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu) {
        return this.getSoLuong() >= soLuongToiThieu;
    }

    /**
     * [T7] Logic: In ra thông báo cập nhật vị trí. 
     */
    @Override
    public void capNhatViTri(String viTriMoi) {
        System.out.println("    -> [IKiemKe] Đã chuyển sách '" + getTieuDe() + "' đến khu vực: " + viTriMoi);
    }
}