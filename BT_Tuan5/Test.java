public class Test 
{
    public static void main(String[] args) 
    {
        Sach s1 = new Sach("B001", "Lap trinh Java", "Nguyen Van A", 2020, 5);
        s1.hienThiThongTin();
        Sach s2 = new Sach();
        s2.setMaSach("B002");
        s2.setTieuDe("Cau truc du lieu va giai thuat");
        s2.setTacGia("Tran Thi B");
        s2.setNamXuatBan(2018);
        s2.setSoLuong(3);
        s2.hienThiThongTin();
        System.out.println("Giam 1 khi muon sach B001...");
        s1.setSoLuong(s1.getSoLuong() - 1);
        s1.hienThiThongTin();
    }
}
