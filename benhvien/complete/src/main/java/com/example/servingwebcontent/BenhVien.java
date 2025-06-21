package com.example.servingwebcontent;
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
        try {
            if (timBenhNhanTheoMa(bn.getMaBenhNhan()) != null) {
                return false;
            }
            danhSachBenhNhan.add(bn);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public BenhNhan timBenhNhanTheoMa(String ma) {
        try {
            for (BenhNhan bn : danhSachBenhNhan) {
                if (bn.getMaBenhNhan().equals(ma)) {
                    return bn;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<BenhNhan> layTatCaBenhNhan() {
        try {
            return danhSachBenhNhan;
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    public boolean xoaBenhNhan(String ma) {
        try {
            return danhSachBenhNhan.removeIf(bn -> bn.getMaBenhNhan().equals(ma));
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    // ========================
    // === QUẢN LÝ BÁC SĨ ======
    // ========================
    public boolean themBacSi(BacSi bs) {
        try {
            if (timBacSiTheoMa(bs.getMaBacSi()) != null) {
                return false;
            }
            danhSachBacSi.add(bs);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public BacSi timBacSiTheoMa(String ma) {
        try {
            for (BacSi bs : danhSachBacSi) {
                if (bs.getMaBacSi().equals(ma)) {
                    return bs;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<BacSi> layTatCaBacSi() {
        try {
            return danhSachBacSi;
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    public boolean xoaBacSi(String ma) {
        try {
            return danhSachBacSi.removeIf(bs -> bs.getMaBacSi().equals(ma));
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    // ========================
    // === QUẢN LÝ PHÒNG =======
    // ========================
    public boolean themPhong(PhongDieuTri p) {
        try {
            if (timPhongTheoMa(p.getMaPhong()) != null) {
                return false;
            }
            danhSachPhong.add(p);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public PhongDieuTri timPhongTheoMa(String ma) {
        try {
            for (PhongDieuTri p : danhSachPhong) {
                if (p.getMaPhong().equals(ma)) {
                    return p;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<PhongDieuTri> layTatCaPhong() {
        try {
            return danhSachPhong;
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    public boolean xoaPhong(String ma) {
        try {
            return danhSachPhong.removeIf(p -> p.getMaPhong().equals(ma));
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    // ========================
    // === LIÊN KẾT ============
    // ========================

    public boolean themBenhNhanVaoPhong(String maPhong, BenhNhan bn) {
        try {
            PhongDieuTri p = timPhongTheoMa(maPhong);
            if (p != null) {
                return p.themBenhNhanVaoPhong(bn);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean ganPhongChoBacSi(String maBacSi, String maPhong) {
        try {
            BacSi bs = timBacSiTheoMa(maBacSi);
            PhongDieuTri p = timPhongTheoMa(maPhong);
            if (bs != null && p != null) {
                bs.themMaPhong(maPhong);
                p.setMaBacSi(maBacSi);
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
