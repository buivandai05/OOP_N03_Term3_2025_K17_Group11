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

    // ================================
    // BÁC SĨ
    // ================================
    public void themBacSi(BacSi bs) {
        danhSachBacSi.add(bs);
    }

    public BacSi timBacSiTheoMa(String ma) {
        for (BacSi bs : danhSachBacSi) {
            if (bs.getMaBacSi().equals(ma)) return bs;
        }
        return null;
    }

    public void xoaBacSi(String ma) {
        danhSachBacSi.removeIf(bs -> bs.getMaBacSi().equals(ma));
    }

    public void hienThiTatCaBacSi() {
        for (BacSi bs : danhSachBacSi) {
            bs.hienThiThongTin();
        }
    }

    public void ganPhongChoBacSi(String maBacSi, String maPhong) {
        BacSi bs = timBacSiTheoMa(maBacSi);
        if (bs != null) {
            bs.themMaPhong(maPhong);
            PhongDieuTri phong = timPhongTheoMa(maPhong);
            if (phong != null) {
                phong.setMaBacSi(maBacSi);
            }
        }
    }

    // ================================
    // BỆNH NHÂN
    // ================================
    public void themBenhNhan(BenhNhan bn) {
        danhSachBenhNhan.add(bn);
    }

    public BenhNhan timBenhNhanTheoMa(String ma) {
        for (BenhNhan bn : danhSachBenhNhan) {
            if (bn.getMaBenhNhan().equals(ma)) return bn;
        }
        return null;
    }

    public void xoaBenhNhan(String ma) {
        danhSachBenhNhan.removeIf(bn -> bn.getMaBenhNhan().equals(ma));
        // Đồng thời xóa khỏi các phòng nếu có
        for (PhongDieuTri p : danhSachPhong) {
            p.xoaBenhNhan(ma);
        }
    }

    public void hienThiTatCaBenhNhan() {
        for (BenhNhan bn : danhSachBenhNhan) {
            bn.hienThiThongTin();
        }
    }

    // ================================
    // PHÒNG ĐIỀU TRỊ
    // ================================
    public void themPhong(PhongDieuTri p) {
        danhSachPhong.add(p);
    }

    public PhongDieuTri timPhongTheoMa(String ma) {
        for (PhongDieuTri p : danhSachPhong) {
            if (p.getMaPhong().equals(ma)) return p;
        }
        return null;
    }

    public void xoaPhong(String ma) {
        danhSachPhong.removeIf(p -> p.getMaPhong().equals(ma));
        // Xóa thông tin phòng khỏi các bác sĩ
        for (BacSi bs : danhSachBacSi) {
            bs.xoaMaPhong(ma);
        }
    }

    public void hienThiTatCaPhong() {
        for (PhongDieuTri p : danhSachPhong) {
            p.hienThiThongTin();
        }
    }

    public boolean ganBenhNhanVaoPhong(String maBenhNhan, String maPhong) {
        BenhNhan bn = timBenhNhanTheoMa(maBenhNhan);
        PhongDieuTri p = timPhongTheoMa(maPhong);
        if (bn != null && p != null) {
            boolean ok = p.themBenhNhan(bn);
            if (ok) {
                bn.setMaPhong(maPhong);
                return true;
            }
        }
        return false;
    }

    public void xuatBaoCaoPhongRaFile() {
        // TODO: Cài đặt nếu bạn muốn ghi ra file .txt
    }
}
