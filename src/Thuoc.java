public class Thuoc {
    private String tenThuoc;
    private String donViTinh;
    private int soLuong;
    private String lieuDung;

    public Thuoc(String tenThuoc, String donViTinh, int soLuong, String lieuDung) {
        this.tenThuoc = tenThuoc;
        this.donViTinh = donViTinh;
        this.soLuong = soLuong;
        this.lieuDung = lieuDung;
    }

    public String getTenThuoc() {return tenThuoc;}
    public void setTenThuoc(String tenThuoc) {this.tenThuoc = tenThuoc;}

    public String getDonViTinh() {return donViTinh;}
    public void setDonViTinh(String donViTinh) {this.donViTinh = donViTinh;}

    public int getSoLuong() {return soLuong;}
    public void setSoLuong(int soLuong) {this.soLuong = soLuong;}

    public String getLieuDung() {return lieuDung;}
    public void setLieuDung(String lieuDung) {this.lieuDung = lieuDung;}
}
