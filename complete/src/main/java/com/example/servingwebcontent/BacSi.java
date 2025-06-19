package entity;

import java.util.ArrayList;
import java.util.List;

public class BacSi {
    private String maBacSi;
    private String tenBacSi;
    private String chuyenKhoa;
    private String soDienThoai;
    private List<String> dsMaPhong;

    public BacSi(String maBacSi, String tenBacSi, String chuyenKhoa, String soDienThoai) {
        try {
            this.maBacSi = maBacSi;
            this.tenBacSi = tenBacSi;
            this.chuyenKhoa = chuyenKhoa;
            this.soDienThoai = soDienThoai;
            this.dsMaPhong = new ArrayList<>();
        } catch (Exception e) {
            System.out.println("Lỗi khởi tạo BacSi: " + e.getMessage());
        }
    }

    // Getters và Setters
    public String getMaBacSi() {
        return maBacSi;
    }

    public void setMaBacSi(String maBacSi) {
        try {
            this.maBacSi = maBacSi;
        } catch (Exception e) {
            System.out.println("Lỗi setMaBacSi: " + e.getMessage());
        }
    }

    public String getTenBacSi() {
        return tenBacSi;
    }

    public void setTenBacSi(String tenBacSi) {
        try {
            this.tenBacSi = tenBacSi;
        } catch (Exception e) {
            System.out.println("Lỗi setTenBacSi: " + e.getMessage());
        }
    }

    public String getChuyenKhoa() {
        return chuyenKhoa;
    }

    public void setChuyenKhoa(String chuyenKhoa) {
        try {
            this.chuyenKhoa = chuyenKhoa;
        } catch (Exception e) {
            System.out.println("Lỗi setChuyenKhoa: " + e.getMessage());
        }
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        try {
            this.soDienThoai = soDienThoai;
        } catch (Exception e) {
            System.out.println("Lỗi setSoDienThoai: " + e.getMessage());
        }
    }

    public List<String> getDsMaPhong() {
        return dsMaPhong;
    }

    // Thêm mã phòng (tránh trùng)
    public boolean themMaPhong(String maPhong) {
        try {
            if (!dsMaPhong.contains(maPhong)) {
                dsMaPhong.add(maPhong);
                return true;
            }
        } catch (Exception e) {
            System.out.println("Lỗi khi thêm mã phòng: " + e.getMessage());
        }
        return false;
    }

    // Xoá mã phòng
    public void xoaMaPhong(String maPhong) {
        try {
            dsMaPhong.remove(maPhong);
        } catch (Exception e) {
            System.out.println("Lỗi khi xóa mã phòng: " + e.getMessage());
        }
    }

    // Lấy thông tin bác sĩ dưới dạng chuỗi
    public String getThongTin() {
        try {
            return "Mã BS: " + maBacSi + ", Tên: " + tenBacSi +
                    ", Chuyên khoa: " + chuyenKhoa + ", SĐT: " + soDienThoai +
                    ", Danh sách mã phòng: " + dsMaPhong;
        } catch (Exception e) {
            System.out.println("Lỗi khi lấy thông tin bác sĩ: " + e.getMessage());
            return "❌ Không thể hiển thị thông tin.";
        }
    }

    @Override
    public String toString() {
        try {
            return getThongTin();
        } catch (Exception e) {
            return "❌ toString lỗi: " + e.getMessage();
        }
    }
}
