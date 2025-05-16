public class ThuocTest {
    public static void main(String[] args) {
        Thuoc thuoc = new Thuoc("Paracetamol", "Tablet", 20, "2 tablets every 4-6 hours");

        System.out.println("Testing Getters:");
        System.out.println("Ten Thuoc: " + thuoc.getTenThuoc());  
        System.out.println("Don Vi Tinh: " + thuoc.getDonViTinh());  
        System.out.println("So Luong: " + thuoc.getSoLuong()); 
        System.out.println("Lieu Dung: " + thuoc.getLieuDung());  

        System.out.println("\nTesting Setters:");
        thuoc.setTenThuoc("Aspirin");
        thuoc.setDonViTinh("Capsule");
        thuoc.setSoLuong(10);
        thuoc.setLieuDung("1 capsule every 8 hours");

        System.out.println("Updated Ten Thuoc: " + thuoc.getTenThuoc());  
        System.out.println("Updated Don Vi Tinh: " + thuoc.getDonViTinh());  
        System.out.println("Updated So Luong: " + thuoc.getSoLuong());  
        System.out.println("Updated Lieu Dung: " + thuoc.getLieuDung()); 
    }
}
