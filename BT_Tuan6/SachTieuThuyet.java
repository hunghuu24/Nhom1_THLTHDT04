package BT_Tuan6;
public class SachTieuThuyet extends Sach {
    private String theLoai;
    private boolean laSachSerie;
    // Constructor
    public SachTieuThuyet(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, String theLoai, boolean laSachSerie) {
        super(maSach,  tieuDe, tacGia, namXuatBan, soLuong);
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

    @Override
    public String toString() {
        return super.toString() + ", Thể loại: " + theLoai + ", Là sách series: " + (laSachSerie ? "Có" : "Không");
    }
}
