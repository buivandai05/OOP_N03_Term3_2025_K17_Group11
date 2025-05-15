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

        
    }
}
