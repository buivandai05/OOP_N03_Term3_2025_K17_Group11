public class TestHoaDon {
    public static void main(String[] args) {
        // Mocking the BenhNhan class (since it's referenced in HoaDon)
        class BenhNhan {
            private String maBenhNhan;
            private String tenBenhNhan;

            public BenhNhan(String maBenhNhan, String tenBenhNhan) {
                this.maBenhNhan = maBenhNhan;
                this.tenBenhNhan = tenBenhNhan;
            }

            @Override
            public String toString() {
                return "BenhNhan{" +
                        "maBenhNhan='" + maBenhNhan + '\'' +
                        ", tenBenhNhan='" + tenBenhNhan + '\'' +
                        '}';
            }
        }

        
// Create a BenhNhan instance
        BenhNhan benhNhan = new BenhNhan("BN001", "Nguyen Van A");

        // Create a HoaDon instance
        HoaDon hoaDon = new HoaDon("HD001", "2025-05-15", benhNhan, 1500000.0);

        // Test getters
        System.out.println("Ma Hoa Don: " + hoaDon.getMaHoaDon());
        System.out.println("Ngay Lap: " + hoaDon.getNgayLap());
        System.out.println("Benh Nhan: " + hoaDon.getBenhNhan());
        System.out.println("Tong Tien: " + hoaDon.getTongTien());

        // Test setters
        hoaDon.setMaHoaDon("HD002");
        hoaDon.setNgayLap("2025-05-16");
        hoaDon.setBenhNhan(new BenhNhan("BN002", "Tran Thi B"));
        hoaDon.setTongTien(2000000.0);

        // Verify updated values
        System.out.println("Updated Ma Hoa Don: " + hoaDon.getMaHoaDon());
        System.out.println("Updated Ngay Lap: " + hoaDon.getNgayLap());
        System.out.println("Updated Benh Nhan: " + hoaDon.getBenhNhan());
        System.out.println("Updated Tong Tien: " + hoaDon.getTongTien());
    }
}
