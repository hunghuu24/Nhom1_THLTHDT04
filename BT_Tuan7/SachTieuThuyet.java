public class SachTieuThuyet extends Sach implements IkiemKe {
    private String theLoai;
    private boolean laSachSeries;
    private String viTri;
    public SachTieuThuyet() {
        super();
    }
    public SachTieuThuyet(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, String theLoai, boolean laSachSeries, double giaCoBan, String viTri) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.theLoai = theLoai;
        this.laSachSeries = laSachSeries;
        this.viTri = viTri;
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
        sc.nextLine();
        this.viTri = "Chua cap nhat";
    }
    @Override
    public double GiaBan() {
        if (laSachSeries) {
            return giaCoBan + 15000;
        } else {
            return giaCoBan;
        }
    }
    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu) {
        return soLuong >= soLuongToiThieu;
    }
    @Override
    public void capNhatViTri(String viTriMoi) {
        this.viTri = viTriMoi;
        System.out.println("Da chuyen sach co ma " + maSach + " den khu vuc: " + viTriMoi);
    }
    @Override
    public String toString() {
        return super.toString() + "\nThe loai: " + theLoai + "\nLa sach series: " + (laSachSeries ? "Co" : "Khong") + "\nGia ban: " + GiaBan() + "\nVi tri: " + viTri;
    }
}
