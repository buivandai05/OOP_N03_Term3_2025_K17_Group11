public class BacSiTest {
    public static void main(String[] args) {
        // Create an instance of TestBacSi
        TestBacSi bacSi = new TestBacSi("BS001", "Le Thi Hoa", "Noi khoa", "0909123456", "Thu 2 - Thu 6");

        // Test getter methods
        System.out.println("Ma Bac Si: " + bacSi.getMaBacSi());
        System.out.println("Ho Ten: " + bacSi.getHoTen());
        System.out.println("Chuyen Khoa: " + bacSi.getChuyenKhoa());
        System.out.println("So Dien Thoai: " + bacSi.getSoDienThoai());
        System.out.println("Lich Lam Viec: " + bacSi.getLichLamViec());

        // Test setter methods
        bacSi.setMaBacSi("BS002");
        bacSi.setHoTen("Nguyen Van C");
        bacSi.setChuyenKhoa("Ngoai khoa");
        bacSi.setSoDienThoai("0911122334");
        bacSi.setLichLamViec("Thu 2 - Thu 7");

        // Verify updated values
        System.out.println("\nUpdated Information:");
        System.out.println("Ma Bac Si: " + bacSi.getMaBacSi());
        System.out.println("Ho Ten: " + bacSi.getHoTen());
        System.out.println("Chuyen Khoa: " + bacSi.getChuyenKhoa());
        System.out.println("So Dien Thoai: " + bacSi.getSoDienThoai());
        System.out.println("Lich Lam Viec: " + bacSi.getLichLamViec());
    }
}

  
