import java.util.ArrayList;
import java.util.List;

public class DonThuocTest {
    public static void main(String[] args) {
        // Tạo bác sĩ
        BacSi bacSi = new BacSi(
                "BS001",
                "Bác sĩ Hà",
                "1975-05-15",
                "Nam",
                "0909123456",
                "Nội khoa",
                new ArrayList<>()
        );

        // Tạo các loại thuốc
        Thuoc thuoc1 = new Thuoc("Paracetamol", "viên", 10, "2 viên/ngày");
        Thuoc thuoc2 = new Thuoc("Amoxicillin", "viên", 15, "3 viên/ngày");

        List<Thuoc> thuocList = new ArrayList<>();
        thuocList.add(thuoc1);
        thuocList.add(thuoc2);

        // Tạo đơn thuốc
        DonThuoc donThuoc = new DonThuoc("DT001", "2025-05-15", "Cúm", bacSi, thuocList);

        // Kiểm tra các phương thức getter
        System.out.println("Mã Đơn Thuốc: " + donThuoc.getMaDonThuoc());
        System.out.println("Ngày Kê Đơn: " + donThuoc.getNgayKeDon());
        System.out.println("Chuẩn Đoán: " + donThuoc.getChuanDoan());
        System.out.println("Bác Sĩ Kê Đơn: " + donThuoc.getBacSiKeDon().getHoTen());
        System.out.println("Danh Sách Thuốc: ");
        for (Thuoc thuoc : donThuoc.getDsThuoc()) {
            System.out.println("  Tên Thuốc: " + thuoc.getTenThuoc() + ", Số lượng: " + thuoc.getSoLuong() +
                    ", Đơn vị: " + thuoc.getDonViTinh() + ", Liều dùng: " + thuoc.getLieuDung());
        }

        // Kiểm tra các phương thức setter
        BacSi bacSiMoi = new BacSi(
                "BS002",
                "Bác sĩ Diệp",
                "1980-06-20",
                "Nữ",
                "0912345678",
                "Ngoại khoa",
                new ArrayList<>()
        );

        donThuoc.setMaDonThuoc("DT002");
        donThuoc.setNgayKeDon("2025-05-16");
        donThuoc.setChuanDoan("Cảm lạnh");
        donThuoc.setBacSiKeDon(bacSiMoi);

        Thuoc thuoc3 = new Thuoc("Ibuprofen", "viên", 12, "2 viên/ngày");
        thuocList.add(thuoc3);
        donThuoc.setDsThuoc(thuocList);

        // In thông tin đã cập nhật
        System.out.println("\nThông Tin Đã Cập Nhật:");
        System.out.println("Mã Đơn Thuốc: " + donThuoc.getMaDonThuoc());
        System.out.println("Ngày Kê Đơn: " + donThuoc.getNgayKeDon());
        System.out.println("Chuẩn Đoán: " + donThuoc.getChuanDoan());
        System.out.println("Bác Sĩ Kê Đơn: " + donThuoc.getBacSiKeDon().getHoTen());
        System.out.println("Danh Sách Thuốc: ");
        for (Thuoc thuoc : donThuoc.getDsThuoc()) {
            System.out.println("  Tên Thuốc: " + thuoc.getTenThuoc() + ", Số lượng: " + thuoc.getSoLuong() +
                    ", Đơn vị: " + thuoc.getDonViTinh() + ", Liều dùng: " + thuoc.getLieuDung());
        }
    }
}
