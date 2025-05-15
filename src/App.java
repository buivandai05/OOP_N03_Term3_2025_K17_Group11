import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Tạo bác sĩ
        BacSi bacSi = new BacSi(
                "BS01",
                "Trần Văn B",
                "1970-05-10",
                "Nam",
                "0123456789",
                "Nội tổng quát",
                new ArrayList<>()
        );

        // Tạo thuốc
        Thuoc thuoc1 = new Thuoc("Paracetamol", "viên", 10, "2 viên/ngày");
        Thuoc thuoc2 = new Thuoc("Amoxicillin", "viên", 15, "3 viên/ngày");

        List<Thuoc> danhSachThuoc = new ArrayList<>();
        danhSachThuoc.add(thuoc1);
        danhSachThuoc.add(thuoc2);

        // Tạo đơn thuốc
        DonThuoc donThuoc = new DonThuoc(
                "DT01",
                "2025-05-15",
                "Sốt, viêm họng",
                bacSi,
                danhSachThuoc
        );

        // Tạo bệnh nhân
        BenhNhan benhNhan = new BenhNhan();
        benhNhan.setMaNguoi("BN01");
        benhNhan.setHoTen("Nguyễn Văn An");
        benhNhan.setMaTheBH("BH123456");
        benhNhan.setDiaChi("Hà Nội");

        // Tạo hóa đơn
        HoaDon hoaDon = new HoaDon(
                "HD01",
                "2025-05-15",
                benhNhan,
                250000.0
        );

        // In thông tin cơ bản
        System.out.println("=== Thông tin hóa đơn ===");
        System.out.println("Mã hóa đơn: " + hoaDon.getMaHoaDon());
        System.out.println("Bệnh nhân: " + hoaDon.getBenhNhan().getHoTen());
        System.out.println("Tổng tiền: " + hoaDon.getTongTien());

        System.out.println("\n=== Đơn thuốc ===");
        for (Thuoc t : donThuoc.getDsThuoc()) {
            System.out.println("- " + t.getTenThuoc() + ": " + t.getSoLuong() + " " + t.getDonViTinh() + ", liều: " + t.getLieuDung());
        }
    }
}

