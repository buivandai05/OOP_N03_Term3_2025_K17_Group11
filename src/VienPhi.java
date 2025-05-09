public class VienPhi {
    private String maVienPhi;     // Mã viện phí
    private BenhNhan benhNhan;     // Bệnh nhân liên quan (đối tượng Patient)
    private double phiKham;      // Chi phí khám bệnh
    private double phiThuoc;     // Chi phí thuốc
    private double phiPhong;    // Chi phí giường bệnh (nếu có)
    private double tongVienPhi;

    public VienPhi(String maVienPhi, Patient benhNhan, double phiKham,
                   double phiPhong, double phiThuoc, double tongVienPhi) {
        this.maVienPhi = maVienPhi;
        this.benhNhan = benhNhan;
        this.phiKham = phiKham;
        this.phiThuoc = phiThuoc;
        this.tongVienPhi = tongVienPhi;
    }

    public String getMaVienPhi() {
        return maVienPhi;
    }

    public void setMaVienPhi(String maVienPhi) {
        this.maVienPhi = maVienPhi;
    }

    public BenhNhan getBenhNhan() {
        return benhNhan;
    }

    public void setBenhNhan(BenhNhan benhNhan) {
        this.benhNhan = benhNhan;
    }

    public double getPhiKham() {
        return phiKham;
    }

    public void setPhiKham(double phiKham) {
        this.phiKham = phiKham;
    }

    public double getPhiThuoc() {
        return phiThuoc;
    }

    public void setPhiThuoc(double phiThuoc) {
        this.phiThuoc = phiThuoc;
    }

    public double getPhiPhong() {
        return phiPhong;
    }

    public void setPhiPhong(double phiPhong) {
        this.phiPhong = phiPhong;
    }

    public double tinhTongChiPhi() {
        return phiKham + phiThuoc + phiPhong;
    }

}

