public class Test {
    public static void main(String[] args) {
        Sach sach1 = new Sach("B001", "Lap trinh huong doi tuong can ban", "Nguyen Tan Chinh", 2022, 5);
        Sach sach2 = new Sach("B002", "Cau truc du lieu va giai thuat", "Nguyen Van A", 2021, 3);

        sach1.hienThiThongTin();
        sach2.hienThiThongTin();

        sach2.setSoLuong(10);
        System.out.println("Sau khi cap nhat so luong:");
        sach2.hienThiThongTin();
    }
}
