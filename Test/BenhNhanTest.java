
public class BenhNhanTest {
    public static void main(String[] args) {

        HoSoBenhAn hoSo1 = new HoSoBenhAn("HS001", "Flu");
        HoSoBenhAn hoSo2 = new HoSoBenhAn("HS002", "Cold");
        
        List<HoSoBenhAn> hoSoList = new ArrayList<>();
        hoSoList.add(hoSo1);
        hoSoList.add(hoSo2);


        BenhNhan benhNhan = new BenhNhan("BN001", "Nguyen Thi Mai", "28-10-2005", "nu", "0912345678", 
                                          "123456789", "680 QUANG TRUNG", hoSoList);

        // Test getter methods
        System.out.println("Ma Benh Nhan: " + benhNhan.getMaNguoi());
        System.out.println("Ho Ten: " + benhNhan.getHoTen());
        System.out.println("Ngay Sinh: " + benhNhan.getNgaySinh());
        System.out.println("Gioi Tinh: " + benhNhan.getGioiTinh());
        System.out.println("So Dien Thoai: " + benhNhan.getSoDienThoai());
        System.out.println("Ma The BH: " + benhNhan.getMaTheBH());
        System.out.println("Dia Chi: " + benhNhan.getDiaChi());
        System.out.println("Ho So Benh An: ");
        for (HoSoBenhAn hoSo : benhNhan.getHoSoBenhAn()) {
            System.out.println("  Ma Ho So: " + hoSo.getMaHoSo() + ", Mo Ta Benh: " + hoSo.getMoTaBenh());
        }

       
        benhNhan.setMaNguoi("BN002");
        benhNhan.setHoTen("Tran Thi Lan");
        benhNhan.setNgaySinh("1990-12-15");
        benhNhan.setGioiTinh("nu");
        benhNhan.setSoDienThoai("0987654321");
        benhNhan.setMaTheBH("987654321");
        benhNhan.setDiaChi("680 QUANG TRUNG");

        
        HoSoBenhAn hoSo3 = new HoSoBenhAn("HS003", "Headache");
        hoSoList.add(hoSo3);
        benhNhan.setHoSoBenhAn(hoSoList);

       
        System.out.println("\nUpdated Information:");
        System.out.println("Ma Benh Nhan: " + benhNhan.getMaNguoi());
        System.out.println("Ho Ten: " + benhNhan.getHoTen());
        System.out.println("Ngay Sinh: " + benhNhan.getNgaySinh());
        System.out.println("Gioi Tinh: " + benhNhan.getGioiTinh());
        System.out.println("So Dien Thoai: " + benhNhan.getSoDienThoai());
        System.out.println("Ma The BH: " + benhNhan.getMaTheBH());
        System.out.println("Dia Chi: " + benhNhan.getDiaChi());
        System.out.println("Ho So Benh An: ");
        for (HoSoBenhAn hoSo : benhNhan.getHoSoBenhAn()) {
            System.out.println("  Ma Ho So: " + hoSo.getMaHoSo() + ", Mo Ta Benh: " + hoSo.getMoTaBenh());
        }
    }
}

