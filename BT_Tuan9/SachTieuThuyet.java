package BT_Tuan8;
// Yêu cầu 2: Kế thừa từ Sach
public class SachTieuThuyet extends Sach {
    private String theLoai;
    private boolean laSachSerie;

    // Constructor
    public SachTieuThuyet(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan, String theLoai, boolean laSachSerie) {
        // Chú ý: giaCoBan của STT là 30000 theo code cũ
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, 30000); 
        this.theLoai = theLoai;
        this.laSachSerie = laSachSerie;
    }

    // Default constructor
    public SachTieuThuyet() {
        super();
        this.theLoai = "";
        this.laSachSerie = false;
    }

    // Getters and Setters
    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public boolean getlaSachSeries() {
        return laSachSerie;
    }

    public void setlaSachSeries(boolean laSachSerie) {
        this.laSachSerie = laSachSerie;
    }

    // Yêu cầu 2: Cập nhật toString()
    @Override
    public String toString() {
        return super.toString() + ", The loai: " + theLoai + ", La sach series: " + (laSachSerie ? "Co" : "Khong") + ", Gia ban: " + tinhGiaBan();
    }

    // Yêu cầu 2: Hoàn thành tinhGiaBan()
    @Override
    public double tinhGiaBan() {
        if (laSachSerie) {
            return getGiaCoBan() + 15000;
        } else
            return getGiaCoBan();
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