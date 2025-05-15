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

        
