import java.util.*;

public class BacSiTest {
    public static void main(String[] args) {
        // Tạo đối tượng Bác sĩ
        BacSi bacSi = new BacSi("BS001", "Nguyễn Văn A", "Nội khoa", "0123456789");

        System.out.println("=== THÔNG TIN BAN ĐẦU ===");
        bacSi.hienThiThongTin();
        
        bacSi.themMaPhong("P101");
        bacSi.themMaPhong("P102");
        bacSi.themMaPhong("P101"); 
        
        System.out.println("\n=== SAU KHI THÊM PHÒNG ===");
        bacSi.hienThiThongTin();

        bacSi.xoaMaPhong("P102");
        bacSi.xoaMaPhong("P999"); 

        System.out.println("\n SAU KHI XÓA PHÒNG ");
        bacSi.hienThiThongTin();

        bacSi.setSoDienThoai("0987654321");
        bacSi.setChuyenKhoa("Tim mạch");

        System.out.println("\n=== SAU KHI ĐỔI THÔNG TIN ===");
        bacSi.hienThiThongTin();
    }
}
