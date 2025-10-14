public class SachGiaoTrinh extends Sach {
    private String monHoc;
    private String capDo;
    public SachGiaoTrinh() {
        super();
    }
    public SachGiaoTrinh(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, String monHoc, String capDo) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong);
        this.monHoc = monHoc;
        this.capDo = capDo;
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
    public void Nhap() {
        super.Nhap();
        System.out.print("Nhap mon hoc: ");
        this.monHoc = sc.nextLine();
        System.out.print("Nhap cap do: ");
        this.capDo = sc.nextLine();
    }
    @Override
    public String toString() {
        return super.toString() + "\nMon hoc: " + monHoc + "\nCap do: " + capDo;
    }
}
