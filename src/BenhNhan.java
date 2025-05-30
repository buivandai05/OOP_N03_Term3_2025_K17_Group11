import java.util.*;
import java.time.LocalDate;

class BenhNhan {
    private String maBenhNhan;
    private String tenBenhNhan;
    private int tuoi;
    private String gioiTinh;
    private String diaChi;
    private String soDienThoai;
    private String khoa; // Khoa điều trị: Cấp cứu, Hồi sức, v.v.
    private String chuanDoan;
    private boolean duDieuKienXuatVien;
    private LocalDate ngayNhapVien;

    public BenhNhan(String maBenhNhan, String tenBenhNhan, int tuoi, String gioiTinh,
                    String diaChi, String soDienThoai, String khoa, String chuanDoan,
                    boolean duDieuKienXuatVien, LocalDate ngayNhapVien) {
        this.maBenhNhan = maBenhNhan;
        this.tenBenhNhan = tenBenhNhan;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
        this.khoa = khoa;
        this.chuanDoan = chuanDoan;
        this.duDieuKienXuatVien = duDieuKienXuatVien;
        this.ngayNhapVien = ngayNhapVien;
    }

    public String getMaBenhNhan() { return maBenhNhan; }
    public String getKhoa() { return khoa; }
    public void setKhoa(String khoa) { this.khoa = khoa; }
    public boolean isDuDieuKienXuatVien() { return duDieuKienXuatVien; }
    public LocalDate getNgayNhapVien() { return ngayNhapVien; }

    public void hienThiThongTin() {
        System.out.println("Mã BN: " + maBenhNhan + ", Tên: " + tenBenhNhan + ", Tuổi: " + tuoi +
                ", Giới tính: " + gioiTinh + ", Địa chỉ: " + diaChi +
                ", SĐT: " + soDienThoai + ", Khoa: " + khoa +
                ", Chuẩn đoán: " + chuanDoan +
                ", Đủ điều kiện xuất viện: " + duDieuKienXuatVien +
                ", Ngày nhập viện: " + ngayNhapVien);
    }
}

public class QuanLyBenhNhan {
    private List<BenhNhan> danhSachBenhNhan = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    // Thêm bệnh nhân vào danh sách
    public void themBenhNhan(BenhNhan bn) {
        danhSachBenhNhan.add(bn);
    }

    // 1. Hiển thị bệnh nhân tại khoa Cấp cứu trong ngày hiện tại
    public void hienThiBenhNhanCapCuuTrongNgay() {
        LocalDate homNay = LocalDate.now();
        System.out.println("Danh sách bệnh nhân tại Khoa Cấp cứu trong ngày " + homNay + ":");
        for (BenhNhan bn : danhSachBenhNhan) {
            if (bn.getKhoa().equalsIgnoreCase("Cấp cứu") && bn.getNgayNhapVien().equals(homNay)) {
                bn.hienThiThongTin();
            }
        }
    }

    // 2. Hiển thị bệnh nhân đủ điều kiện xuất viện trong ngày
    // 1. Hiển thị bệnh nhân tại khoa Cấp cứu theo ngày nhập từ bàn phím
    public void hienThiBenhNhanCapCuuTheoNgay() {
        try {
            System.out.print("Nhập ngày cần tìm bệnh nhân tại Khoa Cấp cứu (định dạng yyyy-MM-dd): ");
            String ngayNhap = scanner.nextLine();
            LocalDate ngayCanTim = LocalDate.parse(ngayNhap);
    
            System.out.println("Danh sách bệnh nhân tại Khoa Cấp cứu trong ngày " + ngayCanTim + ":");
            boolean coBenhNhan = false;
            for (BenhNhan bn : danhSachBenhNhan) {
                if (bn.getKhoa().equalsIgnoreCase("Cấp cứu") && bn.getNgayNhapVien().equals(ngayCanTim)) {
                    bn.hienThiThongTin();
                    coBenhNhan = true;
                }
            }
    
            if (!coBenhNhan) {
                System.out.println("Không có bệnh nhân nào tại Khoa Cấp cứu trong ngày " + ngayCanTim + ".");
            }
        } catch (Exception e) {
            System.out.println("Lỗi định dạng ngày. Vui lòng nhập đúng định dạng yyyy-MM-dd.");
        }
    }


    // 3. Cập nhật bệnh nhân chuyển từ Khoa Cấp cứu đến Hồi sức trong ngày
    public void capNhatChuyenKhoa() {
        LocalDate homNay = LocalDate.now();
        System.out.println("Cập nhật chuyển bệnh nhân từ Cấp cứu đến Hồi sức trong ngày " + homNay + ":");
        for (BenhNhan bn : danhSachBenhNhan) {
            if (bn.getKhoa().equalsIgnoreCase("Cấp cứu") && bn.getNgayNhapVien().equals(homNay)) {
                System.out.println("Chuyển bệnh nhân: ");
                bn.hienThiThongTin();
                bn.setKhoa("Hồi sức");
                System.out.println("==> Đã chuyển sang khoa Hồi sức.");
            }
        }
    }

    // Hàm main để test
    public static void main(String[] args) {
        QuanLyBenhNhan ql = new QuanLyBenhNhan();

        // Test dữ liệu mẫu
        ql.themBenhNhan(new BenhNhan("BN001", "Nguyen Van A", 30, "Nam",
                "Hà Nội", "0123456789", "Cấp cứu", "Sốt cao", true, LocalDate.now()));
        ql.themBenhNhan(new BenhNhan("BN002", "Tran Thi B", 25, "Nữ",
                "HCM", "0987654321", "Cấp cứu", "Tụt huyết áp", false, LocalDate.now()));
        ql.themBenhNhan(new BenhNhan("BN003", "Le Van C", 40, "Nam",
                "Đà Nẵng", "0345678910", "Hồi sức", "Đau tim", true, LocalDate.now()));

        ql.hienThiBenhNhanCapCuuTrongNgay();
        System.out.println("\n== Sau khi xuất viện ==\n");
        ql.hienThiBenhNhanXuatVienTrongNgay();
        System.out.println("\n== Sau khi chuyển khoa ==\n");
        ql.capNhatChuyenKhoa();
    }
}
