package entity;

import java.util.ArrayList;
import java.util.List;

public class PhongDieuTri {
    private String maPhong;
    private String tenPhong;
    private String khoa;
    private int sucChua;
    private List<BenhNhan> dsBenhNhan;
    private String maBacSi;

    public PhongDieuTri(String maPhong, String tenPhong, String khoa, int sucChua, String maBacSi) {
        this.maPhong = maPhong;
        this.tenPhong = tenPhong;
        this.khoa = khoa;
        this.sucChua = sucChua;
        this.maBacSi = maBacSi;
        this.dsBenhNhan = new ArrayList<>();
    }

    public PhongDieuTri(String p01, String phòngNội) {
    }

    public PhongDieuTri(String maPhong, String tenPhong, String khoa, int sucChua) {
        this.maPhong=maPhong;
        this.tenPhong=tenPhong;
        this.khoa=khoa;
        this.sucChua=sucChua;
        this.dsBenhNhan=new ArrayList<>();
    }

    // Getters và Setters
    public String getMaPhong() { return maPhong; }
    public void setMaPhong(String maPhong) { this.maPhong = maPhong; }

    public String getTenPhong() { return tenPhong; }
    public void setTenPhong(String tenPhong) { this.tenPhong = tenPhong; }

    public String getKhoa() { return khoa; }
    public void setKhoa(String khoa) { this.khoa = khoa; }

    public int getSucChua() { return sucChua; }
    public void setSucChua(int sucChua) { this.sucChua = sucChua; }

    public String getMaBacSi() { return maBacSi; }
    public void setMaBacSi(String maBacSi) { this.maBacSi = maBacSi; }

    public List<BenhNhan> getDsBenhNhan() { return dsBenhNhan; }

    // Thêm bệnh nhân vào phòng
    public boolean themBenhNhanVaoPhong(BenhNhan bn) {
        if (dsBenhNhan.size() < sucChua) {
            dsBenhNhan.add(bn);
            return true;
        }
        return false;
    }

    // Xóa bệnh nhân khỏi phòng
    public boolean xoaBenhNhan(String maBenhNhan) {
        return dsBenhNhan.removeIf(bn -> bn.getMaBenhNhan().equals(maBenhNhan));
    }

    // Hiển thị thông tin phòng
    public void hienThiThongTin() {
        System.out.println("Phòng: " + tenPhong + " - Khoa: " + khoa + " - Mã Bác sĩ: " + maBacSi);
        System.out.println("Danh sách bệnh nhân:");
        for (BenhNhan bn : dsBenhNhan) {
            bn.hienThiThongTin();
        }
    }

    // Xóa bệnh nhân khỏi phòng theo đối tượng
    public boolean xoaBenhNhanKhoiPhong(BenhNhan bn) {
        return dsBenhNhan.remove(bn);
    }

}
