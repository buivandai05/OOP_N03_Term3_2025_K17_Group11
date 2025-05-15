import java.util.List;

public class DonThuoc {
    private String maDonThuoc;
    private String ngayKeDon;
    private String chuanDoan;
    private BacSi bacSiKeDon;
    private List<Thuoc> dsThuoc;

    public DonThuoc(String maDonThuoc, String ngayKeDon, String chuanDoan, BacSi bacSiKeDon, List<Thuoc> dsThuoc) {
        this.maDonThuoc = maDonThuoc;
        this.ngayKeDon = ngayKeDon;
        this.chuanDoan = chuanDoan;
        this.bacSiKeDon = bacSiKeDon;
        this.dsThuoc = dsThuoc;
    }

    public String getMaDonThuoc() {return maDonThuoc;}
    public void setMaDonThuoc(String maDonThuoc) {this.maDonThuoc = maDonThuoc;}

    public String getNgayKeDon() {return ngayKeDon;}
    public void setNgayKeDon(String ngayKeDon) {this.ngayKeDon = ngayKeDon;}

    public String getChuanDoan() {return chuanDoan;}
    public void setChuanDoan(String chuanDoan) {this.chuanDoan = chuanDoan;}

    public BacSi getBacSiKeDon() {return bacSiKeDon;}
    public void setBacSiKeDon(BacSi bacSiKeDon) {this.bacSiKeDon = bacSiKeDon;}

    public List<Thuoc> getDsThuoc() {return dsThuoc;}
    public void setDsThuoc(List<Thuoc> dsThuoc) {this.dsThuoc = dsThuoc;}
}
