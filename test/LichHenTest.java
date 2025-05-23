public class TestLichHen {
    public static void main(String[] args) {
        BenhNhan benhNhan = new BenhNhan("Nguyen Van A");
        BacSi bacSi = new BacSi("Dr. Tran Thi B");

        LichHen lichHen = new LichHen("2025-05-20", "10:00 AM", benhNhan, bacSi);

        System.out.println("Ngay Hen: " + lichHen.getNgayHen());
        System.out.println("Gio Hen: " + lichHen.getGioHen());
        System.out.println("Benh Nhan: " + lichHen.getBenhNhan().getName());
        System.out.println("Bac Si: " + lichHen.getBacSi().getName());

        lichHen.setNgayHen("2025-05-21");
        lichHen.setGioHen("11:00 AM");
        BenhNhan newBenhNhan = new BenhNhan("Le Thi C");
        BacSi newBacSi = new BacSi("Dr. Nguyen Van D");
        lichHen.setBenhNhan(newBenhNhan);
        lichHen.setBacSi(newBacSi);

        System.out.println("Updated Ngay Hen: " + lichHen.getNgayHen());
        System.out.println("Updated Gio Hen: " + lichHen.getGioHen());
        System.out.println("Updated Benh Nhan: " + lichHen.getBenhNhan().getName());
        System.out.println("Updated Bac Si: " + lichHen.getBacSi().getName());
    }
}
