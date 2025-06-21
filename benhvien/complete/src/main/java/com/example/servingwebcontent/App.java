import entity.BacSi;
import entity.BenhNhan;
import entity.BenhVien;
import entity.PhongDieuTri;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try {
            new controller.LoginController();
        } catch (Exception e) {
            System.err.println("Đã xảy ra lỗi khi khởi động ứng dụng: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
