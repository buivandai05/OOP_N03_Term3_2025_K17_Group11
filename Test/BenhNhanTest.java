
public class BenhNhanTest {
    public static void main(String[] args) {
        TestBenhNhan benhNhan = new TestBenhNhan("BN001", "Pham Thi Lan", "1992-03-15", "nu", "0912345678", "tieuduong");

    
        System.out.println("Ma Benh Nhan: " + benhNhan.getMaBenhNhan());
        System.out.println("Ho Ten: " + benhNhan.getHoTen());
        System.out.println("Ngay Sinh: " + benhNhan.getNgaySinh());
        System.out.println("Gioi Tinh: " + benhNhan.getGioiTinh());
        System.out.println("So Dien Thoai: " + benhNhan.getSoDienThoai());
        System.out.println("Chuan Doan: " + benhNhan.getChuanDoan());

        
        benhNhan.setMaBenhNhan("BN002");
        benhNhan.setHoTen("Nguyen Thi Mai");
        benhNhan.setNgaySinh("1990-07-25");
        benhNhan.setGioiTinh("nu");
        benhNhan.setSoDienThoai("0987654321");
        benhNhan.setChuanDoan("tieuduong");

       
        System.out.println("\nUpdated Information:");
        System.out.println("Ma Benh Nhan: " + benhNhan.getMaBenhNhan());
        System.out.println("Ho Ten: " + benhNhan.getHoTen());
        System.out.println("Ngay Sinh: " + benhNhan.getNgaySinh());
        System.out.println("Gioi Tinh: " + benhNhan.getGioiTinh());
        System.out.println("So Dien Thoai: " + benhNhan.getSoDienThoai());
        System.out.println("Chuan Doan: " + benhNhan.getChuanDoan());
    }
}
