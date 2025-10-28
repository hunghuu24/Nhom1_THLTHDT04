/**
 * [YC2] Lớp con SachGiaoTrinh kế thừa từ Sach.
 * Kế thừa các phương thức trừu tượng từ IGiaBan và IKiemKe (thông qua lớp Sach).
 */
public class SachGiaoTrinh extends Sach {
    
    private String monHoc;
    private String capDo;

    /**
     * Hàm tạo đầy đủ tham số
     */
    public SachGiaoTrinh(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan, String monHoc, String capDo) {
        // Gọi constructor lớp cha
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.monHoc = monHoc;
        this.capDo = capDo;
    }

    /**
     * [YC2] Triển khai phương thức trừu tượng tinhGiaBan() (từ IGiaBan)
     */
    @Override
    public double tinhGiaBan() {
        // Logic: Giá bán = giaCoBan + (Số năm đã xuất bản × 5.000 VNĐ) 
        int soNamDaXuatBan = 2025 - getNamXuatBan(); // Giả định năm hiện tại là 2025
        return getGiaCoBan() + (soNamDaXuatBan * 5000);
    }

    /**
     * [YC2] Ghi đè phương thức toString() 
     */
    @Override
    public String toString() {
        // Sử dụng super.toString() để lấy thông tin lớp cha
        return "[SGT] " + super.toString() +
               ", Mon: " + monHoc + ", Cap Do: " + capDo;
    }

    // --- [YC2] Triển khai các phương thức của giao diện IKiemKe ---
    
    /**
     * [YC2] Logic: Trả về true nếu soLuong ≥ soLuongToiThieu.
     */
    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu) {
        return this.getSoLuong() >= soLuongToiThieu;
    }

    /**
     * [YC2] Logic: In ra thông báo cập nhật vị trí. 
     */
    @Override
    public void capNhatViTri(String viTriMoi) {
        System.out.println("    -> [IKiemKe] Đã chuyển sách '" + getTieuDe() + "' đến khu vực: " + viTriMoi);
    }
}