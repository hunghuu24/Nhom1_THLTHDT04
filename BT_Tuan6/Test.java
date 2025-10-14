public class Test {
    public static void main(String[] args) {
        // Khởi tạo đối tượng quản lý
        QuanLySach quanLy = new QuanLySach();

        // --- 1. Thêm các loại sách khác nhau ---
        System.out.println("--- THEM SACH MOI ---");
        SachGiaoTrinh sgt1 = new SachGiaoTrinh("SGT01", "Toan Cao Cap A1", "Nguyen Van B", 2020, 50, "Toan hoc", "Dai hoc");
        SachTieuThuyet stt1 = new SachTieuThuyet("STT01", "Harry Potter va Hon da Phu thuy", "J.K. Rowling", 1997, 100, "Phieu luu", true);
        Sach sachThuong = new Sach("S001", "Don Gian La Hanh Phuc", "John Doe", 2021, 20);

        quanLy.themSach(sgt1);
        quanLy.themSach(stt1);
        quanLy.themSach(sachThuong);
        
        // --- 2. Hiển thị danh sách ban đầu ---
        quanLy.hienThiDanhSach();

        // --- 3. Tìm kiếm sách ---
        System.out.println("\n\n--- TIM KIEM SACH THEO MA 'STT01' ---");
        Sach sachTimThay = quanLy.timKiemTheoMaSach("STT01");
        if (sachTimThay != null) {
            System.out.println("Tim thay sach:");
            System.out.println(sachTimThay.toString());
        } else {
            System.out.println("Khong tim thay sach.");
        }

        // --- 4. Cập nhật thông tin sách ---
        System.out.println("\n\n--- CAP NHAT SO LUONG SACH 'SGT01' ---");
        quanLy.capNhatSoLuong("SGT01", 35);
        quanLy.hienThiDanhSach();
        
        // --- 5. Xóa sách ---
        System.out.println("\n\n--- XOA SACH 'S001' ---");
        quanLy.xoaSach("S001");
        quanLy.hienThiDanhSach();
    }
}