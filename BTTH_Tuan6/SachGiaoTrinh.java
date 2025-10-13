package BTTH_Tuan6;
public class SachGiaoTrinh extends Sach {
    private String monHoc;
    private String capDo;
    // Constructor
    public SachGiaoTrinh(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, String monHoc, String capDo) {
        super(maSach,  tieuDe, tacGia, namXuatBan, soLuong);
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
    @Override
    public String toString() {
        return super.toString() + ", Môn học: " + monHoc + ", Cấp độ: " + capDo;
    }
}
