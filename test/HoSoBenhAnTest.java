import java.util.ArrayList;
import java.util.List;

public class HoSoBenhAnTest {
    public static void main(String[] args) {
        // Tạo bác sĩ
        BacSi bacSi1 = new BacSi(
                "BS001",
                "Bác sĩ Nguyễn",
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
        DonThuoc donThuoc = new DonThuoc("DT001", "2025-05-15", "Cúm", bacSi1, thuocList);

        // Tạo hồ sơ bệnh án
        HoSoBenhAn hoSoBenhAn = new HoSoBenhAn("HS001", "2025-05-15", "Sốt, Ho", "Cúm", donThuoc, bacSi1);

        // Kiểm tra các phương thức getter
        System.out.println("Kiểm Tra Phương Thức Getter:\n");
        System.out.println("Mã Hồ Sơ: " + hoSoBenhAn.getMaHoSo());
        System.out.println("Ngày Khám: " + hoSoBenhAn.getNgayKham());
        System.out.println("Triệu Chứng: " + hoSoBenhAn.getTrieuChung());
        System.out.println("Chuẩn Đoán: " + hoSoBenhAn.getChuanDoan());
        System.out.println("Bác Sĩ Phụ Trách: " + hoSoBenhAn.getBacSiPhuTrach().getHoTen());
        System.out.println("Đơn Thuốc: ");
        System.out.println("  Mã Đơn Thuốc: " + hoSoBenhAn.getDonThuoc().getMaDonThuoc());
        System.out.println("  Ngày Kê Đơn: " + hoSoBenhAn.getDonThuoc().getNgayKeDon());
        System.out.println("  Chuẩn Đoán: " + hoSoBenhAn.getDonThuoc().getChuanDoan());
        System.out.println("  Bác Sĩ Kê Đơn: " + hoSoBenhAn.getDonThuoc().getBacSiKeDon().getHoTen());
        System.out.println("  Thuốc: ");
        for (Thuoc thuoc : hoSoBenhAn.getDonThuoc().getDsThuoc()) {
            System.out.println("    Tên Thuốc: " + thuoc.getTenThuoc() + ", Số lượng: " + thuoc.getSoLuong() +
                    ", Đơn vị: " + thuoc.getDonViTinh() + ", Liều dùng: " + thuoc.getLieuDung());
        }

        // Kiểm tra các phương thức setter
        System.out.println("\nKiểm Tra Phương Thức Setter:");
        hoSoBenhAn.setMaHoSo("HS002");
        hoSoBenhAn.setNgayKham("2025-05-16");
        hoSoBenhAn.setTrieuChung("Đau đầu, Chóng mặt");
        hoSoBenhAn.setChuanDoan("Đau nửa đầu");

        // Tạo bác sĩ và đơn thuốc mới
        BacSi bacSiMoi = new BacSi(
                "BS002",
                "Bác sĩ Trần",
                "1980-06-20",
                "Nữ",
                "0912345678",
                "Ngoại khoa",
                new ArrayList<>()
        );

        Thuoc thuoc3 = new Thuoc("Ibuprofen", "viên", 12, "2 viên/ngày");
        thuocList.add(thuoc3);

        DonThuoc donThuocMoi = new DonThuoc("DT002", "2025-05-16", "Đau nửa đầu", bacSiMoi, thuocList);

        hoSoBenhAn.setDonThuoc(donThuocMoi);
        hoSoBenhAn.setBacSiPhuTrach(bacSiMoi);

        // In thông tin đã cập nhật
        System.out.println("\nThông Tin Đã Cập Nhật:");
        System.out.println("Mã Hồ Sơ: " + hoSoBenhAn.getMaHoSo());
        System.out.println("Ngày Khám: " + hoSoBenhAn.getNgayKham());
        System.out.println("Triệu Chứng: " + hoSoBenhAn.getTrieuChung());
        System.out.println("Chuẩn Đoán: " + hoSoBenhAn.getChuanDoan());
        System.out.println("Bác Sĩ Phụ Trách: " + hoSoBenhAn.getBacSiPhuTrach().getHoTen());
        System.out.println("Đơn Thuốc: ");
        System.out.println("  Mã Đơn Thuốc: " + hoSoBenhAn.getDonThuoc().getMaDonThuoc());
        System.out.println("  Ngày Kê Đơn: " + hoSoBenhAn.getDonThuoc().getNgayKeDon());
        System.out.println("  Chuẩn Đoán: " + hoSoBenhAn.getDonThuoc().getChuanDoan());
        System.out.println("  Bác Sĩ Kê Đơn: " + hoSoBenhAn.getDonThuoc().getBacSiKeDon().getHoTen());
        System.out.println("  Thuốc: ");
        for (Thuoc thuoc : hoSoBenhAn.getDonThuoc().getDsThuoc()) {
            System.out.println("    Tên Thuốc: " + thuoc.getTenThuoc() + ", Số lượng: " + thuoc.getSoLuong() +
                    ", Đơn vị: " + thuoc.getDonViTinh() + ", Liều dùng: " + thuoc.getLieuDung());
        }
    }
}
