public class SachGiaoTrinh extends Sach {
    private String monHoc;
    private String capDo;
    private String viTri;
    public SachGiaoTrinh() {
        super();
    }
    public SachGiaoTrinh(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, String monHoc, String capDo, double giaCoBan, String viTri) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.monHoc = monHoc;
        this.capDo = capDo;
        this.viTri = viTri;
    }
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
    @Override
    public void Nhap() {
        super.Nhap();
        System.out.print("Nhap mon hoc: ");
        this.monHoc = sc.nextLine();
        System.out.print("Nhap cap do: ");
        this.capDo = sc.nextLine();
        this.viTri = "Chua cap nhat";
    }

    @Override
    public double tinhGiaBan() {
        int sonamXuatBan = 2025 - namXuatBan;
        return giaCoBan + (sonamXuatBan * 5000);
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
        return super.toString() + "\nMon hoc: " + monHoc + "\nCap do: " + capDo + "\nGia ban: " + tinhGiaBan() + "\nVi tri: " + viTri;
    }
}
