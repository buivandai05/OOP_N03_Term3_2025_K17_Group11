public class ThuocTest {
    public static void main(String[] args) {
        Thuoc thuoc = new Thuoc("Paracetamol", "Tablet", 20, "2 tablets every 4-6 hours");

        System.out.println("Testing Getters:");
        System.out.println("Ten Thuoc: " + thuoc.getTenThuoc());  // Expected: Paracetamol
        System.out.println("Don Vi Tinh: " + thuoc.getDonViTinh());  // Expected: Tablet
        System.out.println("So Luong: " + thuoc.getSoLuong());  // Expected: 20
        System.out.println("Lieu Dung: " + thuoc.getLieuDung());  // Expected: 2 tablets every 4-6 hours

        System.out.println("\nTesting Setters:");
        thuoc.setTenThuoc("Aspirin");
        thuoc.setDonViTinh("Capsule");
        thuoc.setSoLuong(10);
        thuoc.setLieuDung("1 capsule every 8 hours");

        System.out.println("Updated Ten Thuoc: " + thuoc.getTenThuoc());  // Expected: Aspirin
        System.out.println("Updated Don Vi Tinh: " + thuoc.getDonViTinh());  // Expected: Capsule
        System.out.println("Updated So Luong: " + thuoc.getSoLuong());  // Expected: 10
        System.out.println("Updated Lieu Dung: " + thuoc.getLieuDung());  // Expected: 1 capsule every 8 hours
    }
}
