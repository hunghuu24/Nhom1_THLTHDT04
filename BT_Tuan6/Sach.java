package BTTH_Tuan6;
public class Sach{
    private String maSach;
    private String tieuDe;   
    private String tacGia;
    private int namXuatBan;
    private int soLuong;
    // Constructor -- tính chất: tính đóngg gói, kế thừa, đa hình, trừu tượng.
    public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong) 
    {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
    }
    // Default constructor
    public Sach() {
        this.maSach = "";
        this.tieuDe = "";
        this.tacGia = "";
        this.namXuatBan = 0;
        this.soLuong = 0;
    }
    public void hienThiThongTin() {
        System.out.println("Mã sách: " + maSach);
        System.out.println("Tiêu đề: " + tieuDe);
        System.out.println("Tác giả: " + tacGia);
        System.out.println("Năm xuất bản: " + namXuatBan);
        System.out.println("Số lượng: " + soLuong);
    }
    // Getters and Setters
    public String getMaSach() {
        return maSach;
    }
    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }
    public String getTieuDe() {
        return tieuDe;
    }
    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }
    public String getTacGia() {
        return tacGia;
    }
    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }
    public int getNamXuatBan() {
        return namXuatBan;
    }
    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }
    public int getSoLuong() {
        return soLuong;
    }
    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    //
    @Override
    public String toString() {
        return "Mã sách: " + maSach + ", Tiêu đề: " + tieuDe + ", Tác giả: " + tacGia + ", Năm xuất bản: " + namXuatBan + ", Số lượng: " + soLuong;
    }
}