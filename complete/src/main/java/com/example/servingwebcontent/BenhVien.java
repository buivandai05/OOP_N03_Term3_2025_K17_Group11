package service;

import entity.BacSi;
import entity.BenhNhan;
import entity.PhongDieuTri;

import java.util.ArrayList;
import java.util.List;

public class BenhVien {

    private List<BacSi> danhSachBacSi;
    private List<BenhNhan> danhSachBenhNhan;
    private List<PhongDieuTri> danhSachPhong;

    public BenhVien() {
        this.danhSachBacSi = new ArrayList<>();
        this.danhSachBenhNhan = new ArrayList<>();
        this.danhSachPhong = new ArrayList<>();
    }

    // ========================
    // === QUẢN LÝ BỆNH NHÂN ===
    // ========================
    public boolean themBenhNhan(BenhNhan bn) {
        if (timBenhNhanTheoMa(bn.getMaBenhNhan()) != null) {
            return false;
        }
        danhSachBenhNhan.add(bn);
        return true;
    }

    public BenhNhan timBenhNhanTheoMa(String ma) {
        for (BenhNhan bn : danhSachBenhNhan) {
            if (bn.getMaBenhNhan().equals(ma)) {
                return bn;
            }
        }
        return null;
    }

    public List<BenhNhan> layTatCaBenhNhan() {
        return danhSachBenhNhan;
    }

    public boolean xoaBenhNhan(String ma) {
        return danhSachBenhNhan.removeIf(bn -> bn.getMaBenhNhan().equals(ma));
    }

    // ========================
    // === QUẢN LÝ BÁC SĨ ======
    // ========================
    public boolean themBacSi(BacSi bs) {
        if (timBacSiTheoMa(bs.getMaBacSi()) != null) {
            return false;
        }
        danhSachBacSi.add(bs);
        return true;
    }

    public BacSi timBacSiTheoMa(String ma) {
        for (BacSi bs : danhSachBacSi) {
            if (bs.getMaBacSi().equals(ma)) {
                return bs;
            }
        }
        return null;
    }

    public List<BacSi> layTatCaBacSi() {
        return danhSachBacSi;
    }

    public boolean xoaBacSi(String ma) {
        return danhSachBacSi.removeIf(bs -> bs.getMaBacSi().equals(ma));
    }

    // ========================
    // === QUẢN LÝ PHÒNG =======
    // ========================
    public boolean themPhong(PhongDieuTri p) {
        if (timPhongTheoMa(p.getMaPhong()) != null) {
            return false;
        }
        danhSachPhong.add(p);
        return true;
    }

    public PhongDieuTri timPhongTheoMa(String ma) {
        for (PhongDieuTri p : danhSachPhong) {
            if (p.getMaPhong().equals(ma)) {
                return p;
            }
        }
        return null;
    }

    public List<PhongDieuTri> layTatCaPhong() {
        return danhSachPhong;
    }

    public boolean xoaPhong(String ma) {
        return danhSachPhong.removeIf(p -> p.getMaPhong().equals(ma));
    }

    // ========================
    // === LIÊN KẾT ============
    // ========================

    public boolean themBenhNhanVaoPhong(String maPhong, BenhNhan bn) {
        PhongDieuTri p = timPhongTheoMa(maPhong);
        if (p != null) {
            return p.themBenhNhanVaoPhong(bn);
        }
        return false;
    }

    public boolean ganPhongChoBacSi(String maBacSi, String maPhong) {
        BacSi bs = timBacSiTheoMa(maBacSi);
        PhongDieuTri p = timPhongTheoMa(maPhong);
        if (bs != null && p != null) {
            bs.themMaPhong(maPhong);
            p.setMaBacSi(maBacSi);
            return true;
        }
        return false;
    }
}
