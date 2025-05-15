public class HoaDon {
    private String maHoaDon;
    private String ngayLap;
    private BenhNhan benhNhan;
    private double tongTien;

    public HoaDon(String maHoaDon, String ngayLap, BenhNhan benhNhan, double tongTien) {
        this.maHoaDon = maHoaDon;
        this.ngayLap = ngayLap;
        this.benhNhan = benhNhan;
        this.tongTien = tongTien;
    }

    public String getMaHoaDon() {return maHoaDon;}
    public void setMaHoaDon(String maHoaDon) {this.maHoaDon = maHoaDon;}

    public String getNgayLap() {return ngayLap;}
    public void setNgayLap(String ngayLap) {this.ngayLap = ngayLap;}

    public BenhNhan getBenhNhan() {return benhNhan;}
    public void setBenhNhan(BenhNhan benhNhan) {this.benhNhan = benhNhan;}

    public double getTongTien() {return tongTien;}
    public void setTongTien(double tongTien) {this.tongTien = tongTien;}
}
