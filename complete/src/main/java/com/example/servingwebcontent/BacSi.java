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
        this.maBacSi = maBacSi;
        this.tenBacSi = tenBacSi;
        this.chuyenKhoa = chuyenKhoa;
        this.soDienThoai = soDienThoai;
        this.dsMaPhong = new ArrayList<>();
    }

    // Getters và Setters
    public String getMaBacSi() { return maBacSi; }
    public void setMaBacSi(String maBacSi) { this.maBacSi = maBacSi; }

    public String getTenBacSi() { return tenBacSi; }
    public void setTenBacSi(String tenBacSi) { this.tenBacSi = tenBacSi; }

    public String getChuyenKhoa() { return chuyenKhoa; }
    public void setChuyenKhoa(String chuyenKhoa) { this.chuyenKhoa = chuyenKhoa; }

    public String getSoDienThoai() { return soDienThoai; }
    public void setSoDienThoai(String soDienThoai) { this.soDienThoai = soDienThoai; }

    public List<String> getDsMaPhong() { return dsMaPhong; }

    // Thêm mã phòng phụ trách (nếu chưa có)
    public boolean themMaPhong(String maPhong) {
        if (!dsMaPhong.contains(maPhong)) {
            dsMaPhong.add(maPhong);
            return true;
        }
        return false;
    }

    // Xóa mã phòng phụ trách
    public void xoaMaPhong(String maPhong) {
        dsMaPhong.remove(maPhong);
    }

    // Hiển thị thông tin bác sĩ
    public void hienThiThongTin() {
        System.out.println("Mã BS: " + maBacSi + ", Tên: " + tenBacSi +
                ", Chuyên khoa: " + chuyenKhoa + ", SĐT: " + soDienThoai);
        System.out.println("Danh sách mã phòng phụ trách: " + dsMaPhong);
    }
}
