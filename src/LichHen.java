public class LichHen {
    private String ngayHen;
    private String gioHen;
    private BenhNhan benhNhan;
    private BacSi bacSi;

    public LichHen(String ngayHen, String gioHen, BenhNhan benhNhan, BacSi bacSi) {
        this.ngayHen = ngayHen;
        this.gioHen = gioHen;
        this.benhNhan = benhNhan;
        this.bacSi = bacSi;
    }

    public String getNgayHen() {return ngayHen;}
    public void setNgayHen(String ngayHen) {this.ngayHen = ngayHen;}

    public String getGioHen() {return gioHen;}
    public void setGioHen(String gioHen) {this.gioHen = gioHen;}

    public BenhNhan getBenhNhan() {return benhNhan;}
    public void setBenhNhan(BenhNhan benhNhan) {this.benhNhan = benhNhan;}

    public BacSi getBacSi() {return bacSi;}
    public void setBacSi(BacSi bacSi) {this.bacSi = bacSi;}
}
