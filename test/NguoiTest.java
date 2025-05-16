class TestNguoi extends Nguoi {
    public TestNguoi(String maNguoi, String hoTen, String ngaySinh, String gioiTinh, String soDienThoai) {
        super(maNguoi, hoTen, ngaySinh, gioiTinh, soDienThoai);
    }
}

public class NguoiTest {
    public static void main(String[] args) {
        TestNguoi nguoi = new TestNguoi("001", "Nguyen Van A", "1990-01-01", "Male", "0123456789");

        System.out.println("Ma Nguoi: " + nguoi.getMaNguoi());
        System.out.println("Ho Ten: " + nguoi.getHoTen());
        System.out.println("Ngay Sinh: " + nguoi.getNgaySinh());
        System.out.println("Gioi Tinh: " + nguoi.getGioiTinh());
        System.out.println("So Dien Thoai: " + nguoi.getSoDienThoai());

        nguoi.setMaNguoi("002");
        nguoi.setHoTen("Tran Thi B");
        nguoi.setNgaySinh("1995-05-10");
        nguoi.setGioiTinh("Female");
        nguoi.setSoDienThoai("0987654321");

        System.out.println("\nUpdated Information:");
        System.out.println("Ma Nguoi: " + nguoi.getMaNguoi());
        System.out.println("Ho Ten: " + nguoi.getHoTen());
        System.out.println("Ngay Sinh: " + nguoi.getNgaySinh());
        System.out.println("Gioi Tinh: " + nguoi.getGioiTinh());
        System.out.println("So Dien Thoai: " + nguoi.getSoDienThoai());
    }
}
