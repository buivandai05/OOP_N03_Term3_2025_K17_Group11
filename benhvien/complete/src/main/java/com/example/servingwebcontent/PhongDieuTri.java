package com.example.servingwebcontent;

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

    public PhongDieuTri(String maPhong, String tenPhong, String khoa, int sucChua) {
        this.maPhong = maPhong;
        this.tenPhong = tenPhong;
        this.khoa = khoa;
        this.sucChua = sucChua;
        this.dsBenhNhan = new ArrayList<>();
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

    // Thêm bệnh nhân
    public boolean themBenhNhanVaoPhong(BenhNhan bn) {
        try {
            if (dsBenhNhan.size() < sucChua) {
                dsBenhNhan.add(bn);
                return true;
            }
            return false;
        } catch (Exception e) {
            System.err.println("Lỗi khi thêm bệnh nhân vào phòng: " + e.getMessage());
            return false;
        }
    }

    // Xoá bệnh nhân theo mã
    public boolean xoaBenhNhan(String maBenhNhan) {
        try {
            return dsBenhNhan.removeIf(bn -> bn.getMaBenhNhan().equals(maBenhNhan));
        } catch (Exception e) {
            System.err.println("Lỗi khi xoá bệnh nhân theo mã: " + e.getMessage());
            return false;
        }
    }

    // Xoá bệnh nhân theo đối tượng
    public boolean xoaBenhNhanKhoiPhong(BenhNhan bn) {
        try {
            return dsBenhNhan.remove(bn);
        } catch (Exception e) {
            System.err.println("Lỗi khi xoá bệnh nhân khỏi phòng: " + e.getMessage());
            return false;
        }
    }

    @Override
    public String toString() {
        return "PhongDieuTri{" +
                "maPhong='" + maPhong + '\'' +
                ", tenPhong='" + tenPhong + '\'' +
                ", khoa='" + khoa + '\'' +
                ", sucChua=" + sucChua +
                ", maBacSi='" + maBacSi + '\'' +
                ", dsBenhNhan=" + dsBenhNhan +
                '}';
    }
}
