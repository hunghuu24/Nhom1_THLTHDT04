package BT_Tuan7;

public abstract class Sach implements IGiaBan {
    protected String maSach;
    private String tieuDe;
    private String tacGia;
    private int namXuatBan;
    private int soLuong;
    protected double giaCoBan;

    public Sach() {}

    public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
        this.giaCoBan = giaCoBan;
    }

    public String getMaSach() { return maSach; }
    public void setMaSach(String maSach) { this.maSach = maSach; }

    public String getTieuDe() { return tieuDe; }
    public void setTieuDe(String tieuDe) { this.tieuDe = tieuDe; }

    public String getTacGia() { return tacGia; }
    public void setTacGia(String tacGia) { this.tacGia = tacGia; }

    public int getNamXuatBan() { return namXuatBan; }
    public void setNamXuatBan(int namXuatBan) { this.namXuatBan = namXuatBan; }

    public int getSoLuong() { return soLuong; }
    public void setSoLuong(int soLuong) { this.soLuong = soLuong; }

    public double getGiaCoBan() { return giaCoBan; }
    public void setGiaCoBan(double giaCoBan) { this.giaCoBan = giaCoBan; }

    public void hienThiThongTin() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return String.format("Ma:%s | TieuDe:%s | TacGia:%s | Nam:%d | SoLuong:%d | GiaCoBan:%.0f",
                maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
    }

    public abstract double tinhGiaBan();
}
