public class BenhNhanTest {
    public static void main(String[] args) {
        BenhNhan bn = new BenhNhan(
            "BN001",
            "Trần Văn B",
            45,
            "Nam",
            "123 Lý Thường Kiệt, Hà Nội",
            "0912345678",
            "P202",
            "Viêm phổi"
        );

        System.out.println("=== THÔNG TIN BAN ĐẦU ===");
        bn.hienThiThongTin();

        bn.setTuoi(46);
        bn.setDiaChi("456 Nguyễn Trãi, Hà Nội");
        bn.setSoDienThoai("0987654321");
        bn.setChuanDoan("Viêm phổi nặng");

        System.out.println("\n THÔNG TIN SAU KHI CẬP NHẬT");
        bn.hienThiThongTin();

        bn.setMaPhong("P303");
        System.out.println("\n SAU KHI CHUYỂN PHÒNG");
        bn.hienThiThongTin();
    }
}
