/**
 * [T5] Lớp Sach cơ sở. [cite: 50]
 * [T7] Chuyển đổi thành lớp trừu tượng (abstract class). [cite: 5]
 */
public abstract class Sach {
    
    // [T5] Các thuộc tính cơ bản (private để đảm bảo tính đóng gói) 
    private String maSach;
    private String tieuDe;
    private String tacGia;
    private int namXuatBan;
    private int soLuong;
    
    // [T7] Bổ sung thuộc tính giaCoBan 
    private double giaCoBan;

    /**
     * [T5] & [T7] Constructor đầy đủ tham số 
     */
    public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
        this.giaCoBan = giaCoBan;
    }

    // [T5] & [T7] Các phương thức Getters/Setters để đảm bảo tính đóng gói 
    public String getMaSach() { 
    	return maSach; 
    }
    public String getTieuDe() { 
    	return tieuDe; 
    }
    public String getTacGia() { 
    	return tacGia; 
    }
    public int getNamXuatBan() { 
    	return namXuatBan; 
    }
    public int getSoLuong() { 
    	return soLuong; 
    }
    public void setSoLuong(int soLuong) { 
    	this.soLuong = soLuong; 
    }
    public double getGiaCoBan() { 
    	return giaCoBan; 
    }
    public void setGiaCoBan(double giaCoBan) { 
    	this.giaCoBan = giaCoBan; 
    }

    /**
     * [T5] Yêu cầu hienThiThongTin()
     * [T6] Yêu cầu ghi đè toString() 
     * => Sử dụng toString() là thiết kế tốt nhất để hiển thị thông tin.
     */
    @Override
    public String toString() {
        return "Ma Sach: " + maSach + ", Tieu De: " + tieuDe +
               ", Tac Gia: " + tacGia + ", Nam XB: " + namXuatBan +
               ", So Luong: " + soLuong + ", Gia Co Ban: " + giaCoBan+"VNĐ";
    }
    
    /**
     * [T7] Phương thức trừu tượng tinhGiaBan() 
     * Buộc các lớp con phải định nghĩa cách tính giá bán riêng.
     */
    public abstract double tinhGiaBan();
}