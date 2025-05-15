public class TestLichHen {
    public static void main(String[] args) {
        // Assuming BenhNhan and BacSi classes have constructors (String name)
        BenhNhan benhNhan = new BenhNhan("Nguyen Van A");
        BacSi bacSi = new BacSi("Dr. Tran Thi B");

        // Create an instance of LichHen
        LichHen lichHen = new LichHen("2025-05-20", "10:00 AM", benhNhan, bacSi);

        // Test getters
        System.out.println("Ngay Hen: " + lichHen.getNgayHen());
        System.out.println("Gio Hen: " + lichHen.getGioHen());
        System.out.println("Benh Nhan: " + lichHen.getBenhNhan().getName());
        System.out.println("Bac Si: " + lichHen.getBacSi().getName());

        
    }
}
