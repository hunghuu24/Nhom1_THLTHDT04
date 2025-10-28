/**
 * [YC1] Lớp Sach cơ sở (Abstract Class).
 * Triển khai (implements) cả hai giao diện IGiaBan và IKiemKe.
 */
public abstract class Sach implements IGiaBan, IKiemKe {
    
    private String maSach;
    private String tieuDe;
    private String tacGia;
    private int namXuatBan;
    private int soLuong;
    
    // [YC1] Bổ sung thuộc tính giaCoBan
    private double giaCoBan;

    /**
     * Constructor đầy đủ tham số
     */
    public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
        this.giaCoBan = giaCoBan;
    }

    // [YC1] Các phương thức Getters/Setters
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

    @Override
    public String toString() {
        return "Ma Sach: " + maSach + ", Tieu De: " + tieuDe +
               ", Tac Gia: " + tacGia + ", Nam XB: " + namXuatBan +
               ", So Luong: " + soLuong + ", Gia Co Ban: " + giaCoBan+"VNĐ";
    }
    
    // --- Hoàn thành hợp đồng từ Interfaces ---

    
    @Override
    public abstract double tinhGiaBan();
    
    @Override
    public abstract boolean kiemTraTonKho(int soLuongToiThieu);

    @Override
    public abstract void capNhatViTri(String viTriMoi);
}