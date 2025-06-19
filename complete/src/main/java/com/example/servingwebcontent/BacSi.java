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

    public boolean themMaPhong(String maPhong) {
        if (!dsMaPhong.contains(maPhong)) {
            dsMaPhong.add(maPhong);
            return true;
        }
        return false;
    }

    public void xoaMaPhong(String maPhong) {
        dsMaPhong.remove(maPhong);
    }

    public String getThongTin() {
        return "Mã BS: " + maBacSi + ", Tên: " + tenBacSi +
                ", Chuyên khoa: " + chuyenKhoa + ", SĐT: " + soDienThoai +
                ", Danh sách mã phòng: " + dsMaPhong;
    }

    @Override
    public String toString() {
        return getThongTin();
    }
}
