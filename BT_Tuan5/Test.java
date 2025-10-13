public class Test {
    public static void main(String[] args) {
        Sach sach1 = new Sach("B001", "Lập trình Java cơ bản", "Nguyễn Văn A", 2022, 10);
        sach1.hienThiThongTin();
        sach1.setMaSach("B2412");
        sach1.setTacGia("Nguyễn Hữu Hưng");
        sach1.setNamXuatBan(2025);
        sach1.setSoLuong(24);
        System.out.println("Sau khi cập nhật thông tin:");
        sach1.hienThiThongTin();
    }
}
