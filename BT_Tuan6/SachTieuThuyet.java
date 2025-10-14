public class SachTieuThuyet extends Sach {
    private String theLoai;
    private boolean laSachSeries;
    public SachTieuThuyet() {
        super();
    }
    public SachTieuThuyet(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, String theLoai, boolean laSachSeries) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong);
        this.theLoai = theLoai;
        this.laSachSeries = laSachSeries;
    }
    public String getTheLoai() {
        return theLoai;
    }
    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }
    public boolean getLaSachSeries() {
        return laSachSeries;
    }
    public void setLaSachSeries(boolean laSachSeries) {
        this.laSachSeries = laSachSeries;
    }
    public void Nhap() {
        super.Nhap();
        System.out.print("Nhap the loai: ");
        this.theLoai = sc.nextLine();
        System.out.print("Nhap (true/false) neu la sach series: ");
        this.laSachSeries = sc.nextBoolean();
    }
    @Override
    public String toString() {
        return super.toString() + "\nThe loai: " + theLoai + "\nLa sach series: " + (laSachSeries ? "Co" : "Khong");
    }
}
