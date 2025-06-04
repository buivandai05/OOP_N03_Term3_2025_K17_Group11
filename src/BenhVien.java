package entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BenhVien {
    private List<BacSi> danhSachBacSi;
    private List<BenhNhan> danhSachBenhNhan;
    private List<PhongDieuTri> danhSachPhong;
    private final Scanner scanner = new Scanner(System.in);

    public BenhVien() {
        this.danhSachBacSi = new ArrayList<>();
        this.danhSachBenhNhan = new ArrayList<>();
        this.danhSachPhong = new ArrayList<>();
    }


    //====================BỆNH NHÂN====================

    public boolean themBenhNhan(BenhNhan bn) {
        if (timBenhNhanTheoMa(bn.getMaBenhNhan()) != null){
            System.out.println("Mã bệnh nhân đã tồn tại!");
            return false;
        }
        danhSachBenhNhan.add(bn);
        return true;
    }

    // Tìm bệnh nhân theo mã
    public BenhNhan timBenhNhanTheoMa(String ma) {
        for (BenhNhan bn : danhSachBenhNhan) {
            if (bn.getMaBenhNhan().equals(ma)) return bn;
        }
        return null;
    }
    public void hienThiBenhNhanTheoMa() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã bệnh nhân cần tìm: ");
        String ma = scanner.nextLine();
        BenhNhan bn = timBenhNhanTheoMa(ma);
        if (bn != null) {
            System.out.println("Thông tin bệnh nhân:");
            bn.hienThiThongTin();
        } else {
            System.out.println("Không tìm thấy bệnh nhân có mã: " + ma);
        }
    }


    public void xoaBenhNhan(String ma) {
        danhSachBenhNhan.removeIf(bn -> bn.getMaBenhNhan().equals(ma));
        for (PhongDieuTri p : danhSachPhong) {
            p.xoaBenhNhan(ma);
        }
    }

    public void hienThiTatCaBenhNhan() {
        for (BenhNhan bn : danhSachBenhNhan) {
            bn.hienThiThongTin();
        }
    }


    //====================BÁC SĨ====================
    public boolean themBacSi(BacSi bs) {
        if (timBacSiTheoMa(bs.getMaBacSi()) != null){
            System.out.println("Mã bác sĩ đã tồn tại!");
            return false;
        }
        danhSachBacSi.add(bs);
        return true;
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

    public boolean ganPhongChoBacSi(String maBacSi, String maPhong) {
        BacSi bs = timBacSiTheoMa(maBacSi);
        if (bs != null) {
            bs.themMaPhong(maPhong);
            PhongDieuTri phong = timPhongTheoMa(maPhong);
            if (phong != null) {
                phong.setMaBacSi(maBacSi);
                return true;
            }
        }
        return false;
    }

    public void ganPhongChoBacSiTuBP() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã phòng cần gán cho Bác Sĩ phụ trách: ");
        String maPhong = scanner.nextLine();
        System.out.print("Nhập mã Bác Sĩ phụ trách: ");
        String maBacSi = scanner.nextLine();
        boolean ketQua = ganPhongChoBacSi(maBacSi, maPhong);
        if (ketQua) {
            System.out.println("Gán phòng " + maPhong + " cho bác sĩ phụ trách " + maBacSi + " thành công.");
        } else {
            System.out.println("Gán thất bại.");
        }
    }

    //Xóa phòng cho bác sĩ
    public boolean xoaPhongChoBacSi(String maBacSi, String maPhong) {
        BacSi bs = timBacSiTheoMa(maBacSi);
        if (bs != null && bs.getDsMaPhong().contains(maPhong)) {
            bs.xoaMaPhong(maPhong);
            PhongDieuTri phong = timPhongTheoMa(maPhong);
            if (phong != null && maBacSi.equals(phong.getMaBacSi())) {
                phong.setMaBacSi(null); // Xóa thông tin bác sĩ phụ trách
            }
            return true;
        }
        return false;
    }

    public void xoaPhongBSPhuTrachTuBP() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã bác sĩ: ");
        String maBacSi = scanner.nextLine();
        System.out.print("Nhập mã phòng cần xóa khỏi bác sĩ phụ trách: ");
        String maPhong = scanner.nextLine();

        boolean ketQua = xoaPhongChoBacSi(maBacSi, maPhong);
        if (ketQua) {
            System.out.println("Xóa phòng " + maPhong + " khỏi danh sách phụ trách của bác sĩ " + maBacSi + " thành công.");
        } else {
            System.out.println("Xóa thất bại. Kiểm tra lại mã phòng hoặc mã bác sĩ.");
        }
    }

    // Hiển thị ds phòng mà bác sĩ phụ trách
    public void hienThiPhongBacSiPhuTrach() {
        System.out.print("Nhập mã bác sĩ phụ trách: ");
        Scanner scanner = new Scanner(System.in);
        String maBacSi = scanner.nextLine();
        BacSi bs = timBacSiTheoMa(maBacSi);
        if (bs != null) {
            List<String> dsMaPhong = bs.getDsMaPhong();
            if (dsMaPhong.isEmpty()) {
                System.out.println("Bác sĩ chưa phụ trách phòng nào.");
            } else {
                System.out.println("Danh sách phòng bác sĩ " + maBacSi + " phụ trách:");
                for (String maPhong : dsMaPhong) {
                    PhongDieuTri p = timPhongTheoMa(maPhong);
                    if (p != null) {
                        p.hienThiThongTin();                      ;
                    }
                }
            }
        } else {
            System.out.println("Không tìm thấy mã bác sĩ.");
        }
    }

    //====================PHÒNG ĐIỀU TRỊ====================
    public boolean themPhong(PhongDieuTri p) {
        if (timPhongTheoMa(p.getMaPhong()) != null){
            System.out.println("Mã phòng đã tồn tại!");
            return false;
        }
        danhSachPhong.add(p);
        return true;
    }

    public PhongDieuTri timPhongTheoMa(String ma) {
        for (PhongDieuTri p : danhSachPhong) {
            if (p.getMaPhong().equals(ma)) return p;
        }
        return null;
    }

    public void hienThiPhongTheoMa() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã phòng cần tìm: ");
        String maPhong = scanner.nextLine();

        PhongDieuTri phong = timPhongTheoMa(maPhong);
        if (phong != null) {
            System.out.println("Thông tin phòng điều trị:");
            phong.hienThiThongTin();
        } else {
            System.out.println("Không tìm thấy phòng điều trị có mã: " + maPhong);
        }
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
    //ganBenhNhanVaoPhong
    public boolean ganBenhNhanVaoPhong(String maBenhNhan, String maPhong) {
        BenhNhan bn = timBenhNhanTheoMa(maBenhNhan);
        PhongDieuTri p = timPhongTheoMa(maPhong);
        if (bn != null && p != null) {
            boolean KQ = p.themBenhNhanVaoPhong(bn);
            if (KQ) {
                bn.setMaPhong(maPhong);
                return true;
            }
        }
        return false;
    }
    public void ganBenhNhanVaoPhongTuBP() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã bệnh nhân cần gán vào phòng: ");
        String maBenhNhan = scanner.nextLine();
        System.out.print("Nhập mã phòng điều trị: ");
        String maPhong = scanner.nextLine();
        boolean ketQua = ganBenhNhanVaoPhong(maBenhNhan, maPhong);
        if (ketQua) {
            System.out.println("Gán bệnh nhân " + maBenhNhan + " vào phòng " + maPhong + " thành công.");
        } else {
            System.out.println("Gán thất bại.");
        }
    }

    //Xóa bệnh nhân khỏi phòng
    public boolean xoaBenhNhanKhoiPhong(String maBenhNhan, String maPhong) {
        BenhNhan bn = timBenhNhanTheoMa(maBenhNhan);
        PhongDieuTri p = timPhongTheoMa(maPhong);
        if (bn != null && p != null && maPhong.equals(bn.getMaPhong())) {
            boolean kq = p.xoaBenhNhanKhoiPhong(bn);
            if (kq) {
                bn.setMaPhong(null); // Xóa liên kết giữa bệnh nhân và phòng
                return true;
            }
        }
        return false;
    }

    public void xoaBenhNhanKhoiPhongTuBP() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã phòng điều trị: ");
        String maPhong = scanner.nextLine();
        System.out.print("Nhập mã bệnh nhân cần xóa khỏi phòng: ");
        String maBenhNhan = scanner.nextLine();
        boolean ketQua = xoaBenhNhanKhoiPhong(maBenhNhan, maPhong);
        if (ketQua) {
            System.out.println("Đã xóa bệnh nhân " + maBenhNhan + " khỏi phòng " + maPhong + " thành công.");
        } else {
            System.out.println("Xóa thất bại. Kiểm tra mã bệnh nhân hoặc mã phòng.");
        }
    }



    public void xuatBaoCaoPhong() {
        System.out.printf("%-10s | %-10s | %-20s%n", "Mã phòng", "Mã bác sĩ", "Số bệnh nhân");
        for (PhongDieuTri p : danhSachPhong) {
            System.out.printf("%-10s | %-10s | %-20d%n",
                    p.getMaPhong(),
                    p.getMaBacSi() == null ? "Chưa gán" : p.getMaBacSi(),
                    p.getDsBenhNhan().size());
        }
    }

    // Hiển thị ds bênh nhân theo mã phòng
    public void hienThiBenhNhanTheoPhong() {
        System.out.print("Nhập mã phòng điều trị: ");
        Scanner scanner = new Scanner(System.in);
        String maPhong = scanner.nextLine();
        PhongDieuTri p = timPhongTheoMa(maPhong);
        if (p != null) {
            List<BenhNhan> danhSach = p.getDsBenhNhan();
            if (danhSach.isEmpty()) {
                System.out.println("Phòng chưa có bệnh nhân.");
            } else {
                System.out.println("Danh sách bệnh nhân trong phòng " + maPhong + ":");
                for (BenhNhan bn : danhSach) {
                    bn.hienThiThongTin();
                }
            }
        } else {
            System.out.println("Không tìm thấy phòng.");
        }
    }


    //public void xuatBaoCaoPhongRaFile() {
       //  TODO: Cài đặt nếu bạn muốn ghi ra file .txt
    //}
    }

