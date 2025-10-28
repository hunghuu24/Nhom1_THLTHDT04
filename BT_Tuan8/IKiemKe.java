/**
 * [T7] YÊU CẦU 3: GIAO DIỆN IKiemKe 
 * Giao diện định nghĩa các chức năng kiểm kê và bảo trì.
 */
public interface IKiemKe {
    
    /**
     * [T7] Kiểm tra sách có đủ số lượng tối thiểu hay không. 
     */
    boolean kiemTraTonKho(int soLuongToiThieu);

    /**
     * [T7] Cập nhật vị trí lưu trữ mới của cuốn sách.
     */
    void capNhatViTri(String viTriMoi);
}