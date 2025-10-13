public class Test {
    public static void main(String[] args) {
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

        SachGiaoTrinh gt1 = new SachGiaoTrinh("GT01", "Giai tich 1", "Nguyen Van C", 2019, 10, "Toan", "Dai hoc");
        SachTieuThuyet tt1 = new SachTieuThuyet("TT01", "Doraemon", "Fujiko F. Fujio", 2015, 7, "Thieu nhi", true);

        System.out.println("\n--- Test lop ke thua ---");
        System.out.println(gt1.toString());
        System.out.println(tt1.toString());

        QuanLySach ql = new QuanLySach();
        ql.themSach(gt1);
        ql.themSach(tt1);
        ql.themSach(s1);
        ql.themSach(s2);

        System.out.println("\n📚 Danh sach ban dau :");
        ql.hienThi();

        System.out.println("\nTim kiem ma sach 'TT01':");
        Sach tim = ql.timKiemTheoMa("TT01");
        if (tim != null) {
            System.out.println("Tim thay: " + tim);
        } else {
            System.out.println("Khong tim thay TT01");
        }

        SachTieuThuyet tt2 = new SachTieuThuyet("TT01", "Conan", "Aoyama Gosho", 2018, 5, "Trinh tham", true);
        ql.capNhatSach("TT01", tt2);
        System.out.println("\nDanh sach sau khi cap nhat TT01:");
        ql.hienThi();

        ql.xoaSach("B002");
        System.out.println("\nDanh sach khi xoa B002:");
        ql.hienThi();
    }
}
