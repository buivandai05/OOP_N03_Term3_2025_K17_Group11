import java.util.List;

public class BacSi extends Nguoi {
    private String chuyenKhoa;
    private List<BenhNhan> benhNhanPhuTrach;

    public BacSi(String maNguoi, String hoTen, String ngaySinh, String gioiTinh, String soDienThoai,
                 String chuyenKhoa, List<BenhNhan> benhNhanPhuTrach) {
        super(maNguoi, hoTen, ngaySinh, gioiTinh, soDienThoai);
        this.chuyenKhoa = chuyenKhoa;
        this.benhNhanPhuTrach = benhNhanPhuTrach;
    }

    public String getChuyenKhoa() { return chuyenKhoa; }
    public void setChuyenKhoa(String chuyenKhoa) { this.chuyenKhoa = chuyenKhoa; }

    public List<BenhNhan> getBenhNhanPhuTrach() { return benhNhanPhuTrach; }
    public void setBenhNhanPhuTrach(List<BenhNhan> benhNhanPhuTrach) { this.benhNhanPhuTrach = benhNhanPhuTrach; }

}
