import java.util.Scanner;

/**
 * [T5, T6, T7] Lớp Test (Main)
 * Phiên bản này hỗ trợ nhập liệu từ bàn phím (Scanner)
 */
public class Test {
    
    // Khởi tạo Scanner một lần và dùng chung
    public static Scanner sc = new Scanner(System.in);
    // Khởi tạo QuanLySach
    private static QuanLySach qls = new QuanLySach();

    public static void main(String[] args) {
        
        int luaChon;
        luaChon=0;
        
        do {
            // Hiển thị menu
            System.out.println("\n--- MENU QUẢN LÝ SÁCH ---");
            System.out.println("1. Thêm một Sách Giáo Trình");
            System.out.println("2. Thêm một Sách Tiểu Thuyết");
            System.out.println("3. Hiển thị danh sách sách");
            System.out.println("4. Tìm kiếm sách theo mã");
            System.out.println("5. Xóa sách theo mã");
            System.out.println("6. Kiểm tra giao diện (Demo)");
            System.out.println("0. Thoát chương trình");
            System.out.print("Vui lòng chọn chức năng: ");            
            luaChon=sc.nextInt();
            sc.nextLine();
            // Xử lý lựa chọn
            switch (luaChon) {
                case 1:
                    themMoiSachGiaoTrinh();
                    break;
                case 2:
                    themMoiSachTieuThuyet();
                    break;
                case 3:
                    // [T7] Gọi hienThiDanhSach() để kiểm tra kết quả tính giá
                    qls.hienThiDanhSach();
                    break;
                case 4:
                    timKiem();
                    break;
                case 5:
                    xoaSach();
                    break;
                case 6:
                    // [T7] Demo chức năng của Interface
                    demoInterface();
                    break;
                case 0:
                    System.out.println("Đang thoát chương trình...");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại.");
            }
            
        } while (luaChon != 0);
    }
    /**
     * Chức năng nhập thông tin Sách Giáo Trình mới
     */
    
    private static void themMoiSachGiaoTrinh() {
        System.out.println("--- Thêm Sách Giáo Trình ---");
        try {
            System.out.print("Nhập mã sách (SGTxxx): ");
            String maSach = sc.nextLine();
            System.out.print("Nhập tiêu đề: ");
            String tieuDe = sc.nextLine();
            System.out.print("Nhập tác giả: ");
            String tacGia = sc.nextLine();
            System.out.print("Nhập năm xuất bản: ");
            int namXB = Integer.parseInt(sc.nextLine());
            System.out.print("Nhập số lượng: ");
            int soLuong = Integer.parseInt(sc.nextLine());
            System.out.print("Nhập giá cơ bản: ");
            double giaCoBan = Double.parseDouble(sc.nextLine());
            System.out.print("Nhập môn học: ");
            String monHoc = sc.nextLine();
            System.out.print("Nhập cấp độ (Đại học/Phổ thông): ");
            String capDo = sc.nextLine();

            // [T7] Tạo đối tượng SachGiaoTrinh
            SachGiaoTrinh sgt = new SachGiaoTrinh(maSach, tieuDe, tacGia, namXB, soLuong, giaCoBan, monHoc, capDo);
            
            // [T7] Thêm vào quản lý
            qls.themSach(sgt);

        } catch (NumberFormatException e) {
            System.out.println("Lỗi nhập liệu: " + e.getMessage() + ". Vui lòng thử lại.");
        }
    }

    /**
     * Chức năng nhập thông tin Sách Tiểu Thuyết mới
     */
    private static void themMoiSachTieuThuyet() {
        System.out.println("--- Thêm Sách Tiểu Thuyết ---");
        try {
            System.out.print("Nhập mã sách (STTxxx): ");
            String maSach = sc.nextLine();
            System.out.print("Nhập tiêu đề: ");
            String tieuDe = sc.nextLine();
            System.out.print("Nhập tác giả: ");
            String tacGia = sc.nextLine();
            System.out.print("Nhập năm xuất bản: ");
            int namXB = Integer.parseInt(sc.nextLine());
            System.out.print("Nhập số lượng: ");
            int soLuong = Integer.parseInt(sc.nextLine());
            System.out.print("Nhập giá cơ bản: ");
            double giaCoBan = Double.parseDouble(sc.nextLine());
            System.out.print("Nhập thể loại: ");
            String theLoai = sc.nextLine();
            System.out.print("Có phải sách series (true/false): ");
            boolean laSeries = Boolean.parseBoolean(sc.nextLine());

            // [T7] Tạo đối tượng SachTieuThuyet
            SachTieuThuyet stt = new SachTieuThuyet(maSach, tieuDe, tacGia, namXB, soLuong, giaCoBan, theLoai, laSeries);
            
            // [T7] Thêm vào quản lý
            qls.themSach(stt);

        } catch (NumberFormatException e) {
            System.out.println("Lỗi nhập liệu: " + e.getMessage() + ". Vui lòng thử lại.");
        }
    }
    
    /**
     * Chức năng tìm kiếm sách
     */
    private static void timKiem() {
        System.out.print("Nhập mã sách cần tìm: ");
        String maTim = sc.nextLine();
        Sach s = qls.timKiemSach(maTim);
        
        if (s != null) {
            System.out.println("--- Tìm thấy sách ---");
            System.out.println(s.toString());
            System.out.println("    => Giá Bán Ước Tính: " + s.tinhGiaBan() + " VNĐ");
        } else {
            System.out.println("Không tìm thấy sách với mã: " + maTim);
        }
    }

    /**
     * Chức năng xóa sách
     */
    private static void xoaSach() {
        System.out.print("Nhập mã sách cần xóa: ");
        String maXoa = sc.nextLine();
        qls.xoaSach(maXoa); // Phương thức xóaSach đã có thông báo
    }

    /**
     * [T7] Chức năng demo Interface
     */
    private static void demoInterface() {
        System.out.println("\n--- KIỂM TRA GIAO DIỆN (INTERFACE) ---");
        System.out.print("Nhập mã sách bạn muốn kiểm tra (SGT/STT): ");
        String maKiem = sc.nextLine();
        Sach s = qls.timKiemSach(maKiem);

        if (s == null) {
            System.out.println("Không tìm thấy sách.");
            return;
        }

        // Kiểm tra xem sách có phải là 1 đối tượng IKiemKe không
        if (s instanceof IKiemKe) {
            // [T7] Tạo một đối tượng IKiemKe tham chiếu đến sách tìm được
            IKiemKe kiemKe = (IKiemKe) s; // Ép kiểu
            
            System.out.print("Nhập số lượng tồn kho tối thiểu cần kiểm tra: ");
            int sl = Integer.parseInt(sc.nextLine());
            
            // [T7] Gọi phương thức qua tham chiếu Interface
            boolean ketQua = kiemKe.kiemTraTonKho(sl);
            System.out.println("Kết quả kiểm tra tồn kho (>= " + sl + "): " + ketQua);
            
            System.out.print("Nhập vị trí mới để cập nhật: ");
            String viTri = sc.nextLine();
            // [T7] Gọi phương thức capNhatViTri
            kiemKe.capNhatViTri(viTri);
            
        } else {
            System.out.println("Lỗi: Sách này không triển khai giao diện IKiemKe.");
        }
    }
}