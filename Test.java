public class Test {
    public static void main(String[] args) {
        Sach sach1 = new Sach("001", "Java Programming", "Nguyen Van A", 2020, 10);
        System.out.println("Ma Sach: " + sach1.getMaSach());
        System.out.println("Tieu De: " + sach1.getTieuDe());
        System.out.println("Tac Gia: " + sach1.getTacGia());
        System.out.println("Nam Xuat Ban: " + sach1.getNamXuatBan());
        System.out.println("So Luong: " + sach1.getSoLuong());

        Sach sach2 = new Sach();
        sach2.setMaSach("002");
        sach2.setTieuDe("Python Programming");
        sach2.setTacGia("Le Thi B");
        sach2.setNamXuatBan(2021);
        sach2.setSoLuong(15);
        System.out.println("\nMa Sach: " + sach2.getMaSach());
        System.out.println("Tieu De: " + sach2.getTieuDe());
        System.out.println("Tac Gia: " + sach2.getTacGia());
        System.out.println("Nam Xuat Ban: " + sach2.getNamXuatBan());
        System.out.println("So Luong: " + sach2.getSoLuong());
    }
}
