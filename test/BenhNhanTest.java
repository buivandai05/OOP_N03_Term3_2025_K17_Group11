import java.util.ArrayList;
import java.util.List;

public class BenhNhanTest {
    public static void main(String[] args) {
        // Tạo bác sĩ cho hồ sơ bệnh án
        BacSi bacSi = new BacSi(
                "BS001",
                "Bác sĩ Hà",
                "1980-01-01",
                "Nam",
                "0909123456",
                "Nội khoa",
                new ArrayList<>()
        );

        // Tạo đơn thuốc mẫu
        DonThuoc donThuoc1 = new DonThuoc("DT001", "2023-05-10", "Cúm", bacSi, new ArrayList<>());
        DonThuoc donThuoc2 = new DonThuoc("DT002", "2023-06-15", "Cảm lạnh", bacSi, new ArrayList<>());

        // Tạo hồ sơ bệnh án mẫu
        HoSoBenhAn hoSo1 = new HoSoBenhAn("HS001", "2023-05-10", "Sốt, ho", "Cúm", donThuoc1, bacSi);
        HoSoBenhAn hoSo2 = new HoSoBenhAn("HS002", "2023-06-15", "Sổ mũi, đau họng", "Cảm lạnh", donThuoc2, bacSi);

        List<HoSoBenhAn> hoSoList = new ArrayList<>();
        hoSoList.add(hoSo1);
        hoSoList.add(hoSo2);

        // Tạo bệnh nhân với constructor đầy đủ
        BenhNhan benhNhan = new BenhNhan(
                "BN001",
                "Nguyễn Thị Hương Lan",
                "2005-10-28",
                "Nữ",
                "0912345678",
                "123456789",
                "680 Quang Trung",
                hoSoList
        );

        // Kiểm tra các phương thức getter
        System.out.println("Mã Bệnh Nhân: " + benhNhan.getMaNguoi());
        System.out.println("Họ Tên: " + benhNhan.getHoTen());
        System.out.println("Ngày Sinh: " + benhNhan.getNgaySinh());
        System.out.println("Giới Tính: " + benhNhan.getGioiTinh());
        System.out.println("Số Điện Thoại: " + benhNhan.getSoDienThoai());
        System.out.println("Mã Thẻ BH: " + benhNhan.getMaTheBH());
        System.out.println("Địa Chỉ: " + benhNhan.getDiaChi());
        System.out.println("Hồ Sơ Bệnh Án: ");
        for (HoSoBenhAn hoSo : benhNhan.getHoSoBenhAn()) {
            System.out.println("  Mã Hồ Sơ: " + hoSo.getMaHoSo() + ", Chuẩn Đoán: " + hoSo.getChuanDoan());
        }

        // Kiểm tra các phương thức setter
        benhNhan.setMaNguoi("BN002");
        benhNhan.setHoTen("Trần Thị Lan");
        benhNhan.setNgaySinh("1990-12-15");
        benhNhan.setGioiTinh("Nữ");
        benhNhan.setSoDienThoai("0987654321");
        benhNhan.setMaTheBH("987654321");
        benhNhan.setDiaChi("680 Quang Trung");

        // Thêm hồ sơ bệnh án mới
        DonThuoc donThuoc3 = new DonThuoc("DT003", "2023-07-20", "Đau đầu", bacSi, new ArrayList<>());
        HoSoBenhAn hoSo3 = new HoSoBenhAn("HS003", "2023-07-20", "Đau đầu dữ dội", "Đau đầu", donThuoc3, bacSi);
        hoSoList.add(hoSo3);
        benhNhan.setHoSoBenhAn(hoSoList);

        // In thông tin đã cập nhật
        System.out.println("\nThông Tin Đã Cập Nhật:");
        System.out.println("Mã Bệnh Nhân: " + benhNhan.getMaNguoi());
        System.out.println("Họ Tên: " + benhNhan.getHoTen());
        System.out.println("Ngày Sinh: " + benhNhan.getNgaySinh());
        System.out.println("Giới Tính: " + benhNhan.getGioiTinh());
        System.out.println("Số Điện Thoại: " + benhNhan.getSoDienThoai());
        System.out.println("Mã Thẻ BH: " + benhNhan.getMaTheBH());
        System.out.println("Địa Chỉ: " + benhNhan.getDiaChi());
        System.out.println("Hồ Sơ Bệnh Án: ");
        for (HoSoBenhAn hoSo : benhNhan.getHoSoBenhAn()) {
            System.out.println("  Mã Hồ Sơ: " + hoSo.getMaHoSo() + ", Chuẩn Đoán: " + hoSo.getChuanDoan());
        }
    }
}
