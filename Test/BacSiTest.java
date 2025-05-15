import java.util.ArrayList;

public class BacSiTest {
    public static void main(String[] args) {
        // Tạo đối tượng BacSi với constructor đầy đủ
        BacSi bacSi = new BacSi(
                "BS001",
                "Nguyễn Thị Hà",
                "1980-01-01",
                "Nữ",
                "0909123456",
                "Nội khoa",
                new ArrayList<>() // Danh sách bệnh nhân phụ trách rỗng
        );

        // Kiểm tra các phương thức getter
        System.out.println("Mã Bác Sĩ: " + bacSi.getMaNguoi());
        System.out.println("Họ Tên: " + bacSi.getHoTen());
        System.out.println("Chuyên Khoa: " + bacSi.getChuyenKhoa());
        System.out.println("Số Điện Thoại: " + bacSi.getSoDienThoai());

        // Kiểm tra các phương thức setter
        bacSi.setMaNguoi("BS002");
        bacSi.setHoTen("Nguyễn Thị Diệp");
        bacSi.setChuyenKhoa("Ngoại khoa");
        bacSi.setSoDienThoai("0911122334");

        // Kiểm tra thông tin đã cập nhật
        System.out.println("\nThông Tin Đã Cập Nhật:");
        System.out.println("Mã Bác Sĩ: " + bacSi.getMaNguoi());
        System.out.println("Họ Tên: " + bacSi.getHoTen());
        System.out.println("Chuyên Khoa: " + bacSi.getChuyenKhoa());
        System.out.println("Số Điện Thoại: " + bacSi.getSoDienThoai());
    }
}
