package com.example.servingwebcontent.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;

public class PhongDieuTri {

    private String maPhong;
    private String tenPhong;
    private String khoa;
    private int sucChua; // sức chứa tối đa
    private List<BenhNhan> dsBenhNhan;
    private String maBacSi;

    //  Constructor mặc định
    public PhongDieuTri() {
        this.dsBenhNhan = new ArrayList<>();
    }

    //  Constructor đầy đủ
    public PhongDieuTri(String maPhong, String tenPhong, String khoa, int sucChua, String maBacSi) {
        this.maPhong = maPhong;
        this.tenPhong = tenPhong;
        this.khoa = khoa;
        this.sucChua = sucChua;
        this.maBacSi = maBacSi;
        this.dsBenhNhan = new ArrayList<>();
    }

    //  Constructor không có mã bác sĩ
    public PhongDieuTri(String maPhong, String tenPhong, String khoa, int sucChua) {
        this(maPhong, tenPhong, khoa, sucChua, null);
    }

    // --- Getters & Setters ---
    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public String getKhoa() {
        return khoa;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }

    public int getSucChua() {
        return sucChua;
    }

    public void setSucChua(int sucChua) {
        this.sucChua = sucChua;
    }

    public String getMaBacSi() {
        return maBacSi;
    }

    public void setMaBacSi(String maBacSi) {
        this.maBacSi = maBacSi;
    }

    public List<BenhNhan> getDsBenhNhan() {
        return dsBenhNhan;
    }

    public void setDsBenhNhan(List<BenhNhan> dsBenhNhan) {
        this.dsBenhNhan = dsBenhNhan;
    }

    // --- Phương thức tiện ích ---

    public boolean themBenhNhanVaoPhong(BenhNhan bn) {
        if (dsBenhNhan.size() < sucChua) {
            dsBenhNhan.add(bn);
            return true;
        }
        return false; // Phòng đã đầy
    }

    public boolean xoaBenhNhan(String maBenhNhan) {
        return dsBenhNhan.removeIf(bn -> bn.getMaBenhNhan().equals(maBenhNhan));
    }

    public boolean xoaBenhNhanKhoiPhong(BenhNhan bn) {
        return dsBenhNhan.remove(bn);
    }

    public int getSoLuongBenhNhanHienTai() {
        return dsBenhNhan.size();
    }

    @JsonProperty("soGiuongTrong")
    public int getSoGiuongConTrong() {
        return sucChua - dsBenhNhan.size();
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
