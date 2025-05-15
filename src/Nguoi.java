public abstract class Nguoi {
    protected String maNguoi;
    protected String hoTen;
    protected String ngaySinh;
    protected String gioiTinh;
    protected String soDienThoai;

    public Nguoi(String maNguoi, String hoTen, String ngaySinh, String gioiTinh, String soDienThoai) {
        this.maNguoi = maNguoi;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.soDienThoai = soDienThoai;
    }

    public Nguoi() {

    }

    public String getMaNguoi() { return maNguoi; }
    public void setMaNguoi(String maNguoi) { this.maNguoi = maNguoi; }

    public String getHoTen() { return hoTen; }
    public void setHoTen(String hoTen) { this.hoTen = hoTen; }

    public String getNgaySinh() { return ngaySinh; }
    public void setNgaySinh(String ngaySinh) { this.ngaySinh = ngaySinh; }

    public String getGioiTinh() { return gioiTinh; }
    public void setGioiTinh(String gioiTinh) { this.gioiTinh = gioiTinh; }

    public String getSoDienThoai() { return soDienThoai; }
    public void setSoDienThoai(String soDienThoai) { this.soDienThoai = soDienThoai; }
}
