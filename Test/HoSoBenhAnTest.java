
public class HoSoBenhAnTest {
    public static void main(String[] args) {
  
        BacSi bacSi1 = new BacSi("BS001", "Dr. Nguyen");

        
        Thuoc thuoc1 = new Thuoc("T001", "Paracetamol");
        Thuoc thuoc2 = new Thuoc("T002", "Amoxicillin");

        List<Thuoc> thuocList = new ArrayList<>();
        thuocList.add(thuoc1);
        thuocList.add(thuoc2);

    
        DonThuoc donThuoc = new DonThuoc("DT001", "2025-05-15", "nu", bacSi1, thuocList);

     
        HoSoBenhAn hoSoBenhAn = new HoSoBenhAn("HS001", "2025-05-15", "Fever, Cough", "Flu", donThuoc, bacSi1);

        // Test getter methods
        System.out.println("Testing Getter Methods:");
        System.out.println("Ma Ho So: " + hoSoBenhAn.getMaHoSo());
        System.out.println("Ngay Kham: " + hoSoBenhAn.getNgayKham());
        System.out.println("Trieu Chung: " + hoSoBenhAn.getTrieuChung());
        System.out.println("Chuan Doan: " + hoSoBenhAn.getChuanDoan());
        System.out.println("Bac Si Phu Trach: " + hoSoBenhAn.getBacSiPhuTrach().getHoTen());
        System.out.println("Don Thuoc: ");
        System.out.println("  Ma Don Thuoc: " + hoSoBenhAn.getDonThuoc().getMaDonThuoc());
        System.out.println("  Ngay Ke Don: " + hoSoBenhAn.getDonThuoc().getNgayKeDon());
        System.out.println("  Chuan Doan: " + hoSoBenhAn.getDonThuoc().getChuanDoan());
        System.out.println("  Bac Si Ke Don: " + hoSoBenhAn.getDonThuoc().getBacSiKeDon().getHoTen());
        System.out.println("  Thuoc: ");
        for (Thuoc thuoc : hoSoBenhAn.getDonThuoc().getDsThuoc()) {
            System.out.println("    Ma Thuoc: " + thuoc.getMaThuoc() + ", Ten Thuoc: " + thuoc.getTenThuoc());
        }

        
        System.out.println("\nTesting Setter Methods:");
        hoSoBenhAn.setMaHoSo("HS002");
        hoSoBenhAn.setNgayKham("2025-05-16");
        hoSoBenhAn.setTrieuChung("Headache, Dizziness");
        hoSoBenhAn.setChuanDoan("tieuduong");

        
        BacSi bacSiNew = new BacSi("BS002", "Dr. Tran");
        Thuoc thuoc3 = new Thuoc("T003", "Ibuprofen");
        thuocList.add(thuoc3);
        DonThuoc donThuocNew = new DonThuoc("DT002", "2025-05-16", "tieuduong", bacSiNew, thuocList);

        hoSoBenhAn.setDonThuoc(donThuocNew);
        hoSoBenhAn.setBacSiPhuTrach(bacSiNew);

        
        System.out.println("\nUpdated Information:");
        System.out.println("Ma Ho So: " + hoSoBenhAn.getMaHoSo());
        System.out.println("Ngay Kham: " + hoSoBenhAn.getNgayKham());
        System.out.println("Trieu Chung: " + hoSoBenhAn.getTrieuChung());
        System.out.println("Chuan Doan: " + hoSoBenhAn.getChuanDoan());
        System.out.println("Bac Si Phu Trach: " + hoSoBenhAn.getBacSiPhuTrach().getHoTen());
        System.out.println("Don Thuoc: ");
        System.out.println("  Ma Don Thuoc: " + hoSoBenhAn.getDonThuoc().getMaDonThuoc());
        System.out.println("  Ngay Ke Don: " + hoSoBenhAn.getDonThuoc().getNgayKeDon());
        System.out.println("  Chuan Doan: " + hoSoBenhAn.getDonThuoc().getChuanDoan());
        System.out.println("  Bac Si Ke Don: " + hoSoBenhAn.getDonThuoc().getBacSiKeDon().getHoTen());
        System.out.println("  Thuoc: ");
        for (Thuoc thuoc : hoSoBenhAn.getDonThuoc().getDsThuoc()) {
            System.out.println("    Ma Thuoc: " + thuoc.getMaThuoc() + ", Ten Thuoc: " + thuoc.getTenThuoc());
        }
    }
}
