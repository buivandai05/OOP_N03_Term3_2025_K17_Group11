// Define a subclass for testing
class TestNguoi extends Nguoi {
    public TestNguoi(String maNguoi, String hoTen, String ngaySinh, String gioiTinh, String soDienThoai) {
        super(maNguoi, hoTen, ngaySinh, gioiTinh, soDienThoai);
    }
}

public class NguoiTest {
    public static void main(String[] args) {
        // Create an instance of TestNguoi
        TestNguoi nguoi = new TestNguoi("001", "Nguyen Van A", "1990-01-01", "Male", "0123456789");

        // Test getter methods
        System.out.println("Ma Nguoi: " + nguoi.getMaNguoi());
        System.out.println("Ho Ten: " + nguoi.getHoTen());
        System.out.println("Ngay Sinh: " + nguoi.getNgaySinh());
        System.out.println("Gioi Tinh: " + nguoi.getGioiTinh());
        System.out.println("So Dien Thoai: " + nguoi.getSoDienThoai());

        
    }
}
