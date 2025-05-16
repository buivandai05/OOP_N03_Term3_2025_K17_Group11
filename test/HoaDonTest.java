import java.util.ArrayList;

public class HoaDonTest {
    public static void main(String[] args) {
        BacSi bacSi = new BacSi(
            "BS01",                      // maNguoi
            "Tran Van B",                // hoTen
            "1970-05-10",                // ngaySinh
            "Nam",                       // gioiTinh
            "0123456789",                // soDienThoai
            "Noi tong quat",             // chuyenKhoa
            new ArrayList<>()            // benhNhanPhuTrach
        );

        Thuoc thuoc1 = new Thuoc("Paracetamol", "vien", 10, "2 vien/ngay");
        Thuoc thuoc2 = new Thuoc("Amoxicillin", "vien", 15, "3 vien/ngay");
        ArrayList<Thuoc> danhSachThuoc = new ArrayList<>();
        danhSachThuoc.add(thuoc1);
        danhSachThuoc.add(thuoc2);

        DonThuoc donThuoc = new DonThuoc(
            "DT01",                      // maDonThuoc
            "2025-05-15",                // ngayKeDon
            "Sot, viem hong",            // chuanDoan
            bacSi,                       // bacSiKeDon
            danhSachThuoc                // dsThuoc
        );

        BenhNhan benhNhan = new BenhNhan(
            "BN01",                      // maNguoi
            "Nguyen Van A",              // hoTen
            "1990-01-01",                // ngaySinh
            "Nam",                       // gioiTinh
            "0123456789",                // soDienThoai
            "BH123456",                  // maTheBH
            "Hanoi, Vietnam",            // diaChi
            new ArrayList<>()            // hoSoBenhAn
        );

        HoaDon hoaDon = new HoaDon(
            "HD01",                      // maHoaDon
            "2025-05-15",                // ngayLap
            benhNhan,                    // benhNhan
            250000.0                     // tongTien
        );

        System.out.println("=== Testing Getters ===");
        System.out.println("Ma Hoa Don: " + hoaDon.getMaHoaDon());
        System.out.println("Ngay Lap: " + hoaDon.getNgayLap());
        System.out.println("Benh Nhan: " + hoaDon.getBenhNhan().getHoTen());
        System.out.println("Tong Tien: " + hoaDon.getTongTien());

        System.out.println("\n=== Testing Setters ===");
        hoaDon.setMaHoaDon("HD02");
        hoaDon.setNgayLap("2025-05-16");
        BenhNhan newBenhNhan = new BenhNhan(
            "BN02",                      // maNguoi
            "Tran Thi B",                // hoTen
            "1995-03-10",                // ngaySinh
            "Nu",                        // gioiTinh
            "0987654321",                // soDienThoai
            "BH654321",                  // maTheBH
            "HCMC, Vietnam",             // diaChi
            new ArrayList<>()            // hoSoBenhAn
        );
        hoaDon.setBenhNhan(newBenhNhan);
        hoaDon.setTongTien(300000.0);

        System.out.println("Ma Hoa Don: " + hoaDon.getMaHoaDon());
        System.out.println("Ngay Lap: " + hoaDon.getNgayLap());
        System.out.println("Benh Nhan: " + hoaDon.getBenhNhan().getHoTen());
        System.out.println("Tong Tien: " + hoaDon.getTongTien());
    }
}
