public class HoSoBenhAn {
    private String maHoSo;
    private String ngayKham;
    private String trieuChung;
    private String chuanDoan;
    private DonThuoc donThuoc;
    private BacSi bacSiPhuTrach;

    public HoSoBenhAn(String maHoSo, String ngayKham, String trieuChung, String chuanDoan,
                      DonThuoc donThuoc, BacSi bacSiPhuTrach) {
        this.maHoSo = maHoSo;
        this.ngayKham = ngayKham;
        this.trieuChung = trieuChung;
        this.chuanDoan = chuanDoan;
        this.donThuoc = donThuoc;
        this.bacSiPhuTrach = bacSiPhuTrach;
    }

    public String getMaHoSo() {return maHoSo;}
    public void setMaHoSo(String maHoSo) {this.maHoSo = maHoSo;}

    public String getNgayKham() {return ngayKham;}
    public void setNgayKham(String ngayKham) {this.ngayKham = ngayKham;}

    public String getTrieuChung() {return trieuChung;}
    public void setTrieuChung(String trieuChung) {this.trieuChung = trieuChung;}

    public void setChuanDoan(String chuanDoan) {this.chuanDoan = chuanDoan;}
    public String getChuanDoan() {return chuanDoan;}

    public DonThuoc getDonThuoc() {return donThuoc;}
    public void setDonThuoc(DonThuoc donThuoc) {this.donThuoc = donThuoc;}

    public BacSi getBacSiPhuTrach() {return bacSiPhuTrach;}
    public void setBacSiPhuTrach(BacSi bacSiPhuTrach) {this.bacSiPhuTrach = bacSiPhuTrach;}

}
