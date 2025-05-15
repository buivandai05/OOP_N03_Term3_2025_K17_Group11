
public class DonThuocTest {
    public static void main(String[] args) {
  
        BacSi bacSi = new BacSi("BS001", "Dr. Nguyen");

        Thuoc thuoc1 = new Thuoc("T001", "Paracetamol");
        Thuoc thuoc2 = new Thuoc("T002", "Amoxicillin");

        List<Thuoc> thuocList = new ArrayList<>();
        thuocList.add(thuoc1);
        thuocList.add(thuoc2);

        DonThuoc donThuoc = new DonThuoc("DT001", "2025-05-15", "Flu", bacSi, thuocList);

        System.out.println("Ma Don Thuoc: " + donThuoc.getMaDonThuoc());
        System.out.println("Ngay Ke Don: " + donThuoc.getNgayKeDon());
        System.out.println("Chuan Doan: " + donThuoc.getChuanDoan());
        System.out.println("Bac Si Ke Don: " + donThuoc.getBacSiKeDon().getHoTen());
        System.out.println("Danh Sach Thuoc: ");
        for (Thuoc thuoc : donThuoc.getDsThuoc()) {
            System.out.println("  Ma Thuoc: " + thuoc.getMaThuoc() + ", Ten Thuoc: " + thuoc.getTenThuoc());
        }

        donThuoc.setMaDonThuoc("DT002");
        donThuoc.setNgayKeDon("2025-05-16");
        donThuoc.setChuanDoan("Cold");
        donThuoc.setBacSiKeDon(new BacSi("BS002", "Dr. Tran"));
      
        Thuoc thuoc3 = new Thuoc("T003", "Ibuprofen");
        thuocList.add(thuoc3);
        donThuoc.setDsThuoc(thuocList);

        System.out.println(" Information:");
        System.out.println("Ma Don Thuoc: " + donThuoc.getMaDonThuoc());
        System.out.println("Ngay Ke Don: " + donThuoc.getNgayKeDon());
        System.out.println("Chuan Doan: " + donThuoc.getChuanDoan());
        System.out.println("Bac Si Ke Don: " + donThuoc.getBacSiKeDon().getHoTen());
        System.out.println("Danh Sach Thuoc: ");
        for (Thuoc thuoc : donThuoc.getDsThuoc()) {
            System.out.println("  Ma Thuoc: " + thuoc.getMaThuoc() + ", Ten Thuoc: " + thuoc.getTenThuoc());
        }
    }
}

