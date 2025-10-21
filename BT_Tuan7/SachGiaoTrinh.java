package BT_Tuan7;
public class SachGiaoTrinh extends Sach implements IKiemKe {
    private String monHoc;
    private String capDo;
    // Constructor
    public SachGiaoTrinh(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan ,String monHoc, String capDo) {
        super(maSach,  tieuDe, tacGia, namXuatBan, soLuong, 50000);
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
    public double getGiaCoBan() {
        return super.getGiaCoBan();
    }
    public void setGiaCoBan(double giaCoBan) {
        super.setGiaCoBan(giaCoBan);
    }
    @Override
    public String toString() {
        return super.toString() + ", Mon hoc: " + monHoc + ", Cap đo: " + capDo + ", Gia ban: " + tinhGiaBan();
    }
    @Override
    public double tinhGiaBan() {
        return getGiaCoBan() + (2025 - getNamXuatBan()) * 5000;
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
        System.out.println("Vi tri sach giao trinh da duoc cap nhat den: " + viTriMoi);
    }
}
