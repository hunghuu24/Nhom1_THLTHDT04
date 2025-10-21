package BT_Tuan7;
public class SachTieuThuyet extends Sach implements IKiemKe {
    private String theLoai;
    private boolean laSachSerie;
    // Constructor
    public SachTieuThuyet(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan, String theLoai, boolean laSachSerie) {
        super(maSach,  tieuDe, tacGia, namXuatBan, soLuong, 30000);
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
        return super.toString() + ", The loai: " + theLoai + ", La sach series: " + (laSachSerie ? "Co" : "Khong") + ", Gia ban: " + tinhGiaBan();
    }
    @Override
    public double tinhGiaBan() {
        if(laSachSerie) {
            return getGiaCoBan() + 15000;
        }
        else
            return getGiaCoBan();
    }
    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu) 
    {
        if(getSoLuong() >= soLuongToiThieu)
        {
            return true ;
        }
        else
        {
            return false ;
        }
    }
    @Override
    public void capNhatViTri(String viTriMoi) {
        System.out.println("Vi tri sach tieu thuyet da duoc cap nhat den: " + viTriMoi);
    }
}
