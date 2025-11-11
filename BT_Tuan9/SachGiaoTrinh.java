package BT_Tuan9;


// Yêu cầu 2: Kế thừa từ Sach
public class SachGiaoTrinh extends Sach {
    private String monHoc;
    private String capDo;

    // Constructor
    public SachGiaoTrinh(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan, String monHoc, String capDo) {
        // Chú ý: giaCoBan của SGT là 50000 theo code cũ
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, 50000); 
        this.monHoc = monHoc;
        this.capDo = capDo;
    }

    // Default constructor
    public SachGiaoTrinh() {
        super();
        this.monHoc = "";
        this.capDo = "";
    }

    // Getters and Setters
    public String getMonHoc() {
        return monHoc;
    }

    public void setMonHoc(String monHoc) {
        this.monHoc = monHoc;
    }

    public String getCapDo() {
        return capDo;
    }

    public void setCapDo(String capDo) {
        this.capDo = capDo;
    }

    // Yêu cầu 2: Cập nhật toString()
    @Override
    public String toString() {
        return super.toString() + ", Mon hoc: " + monHoc + ", Cap đo: " + capDo + ", Gia ban: " + tinhGiaBan();
    }

    // Yêu cầu 2: Hoàn thành tinhGiaBan()
    @Override
    public double tinhGiaBan() {
        return getGiaCoBan() + (2025 - getNamXuatBan()) * 5000;
    }

    // Yêu cầu 2: Hoàn thành kiemTraTonKho()
    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu) {
        return getSoLuong() >= soLuongToiThieu;
    }

    // Yêu cầu 2: Hoàn thành capNhatViTri()
    @Override
    public void capNhatViTri(String viTriMoi) {
        // Cập nhật nội dung in ra cho đúng yêu cầu
        System.out.println("Đã chuyển sách " + getTieuDe() + " đến khu vực: " + viTriMoi);
    }
}