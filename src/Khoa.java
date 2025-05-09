public class Khoa {
    // ✅ Thuộc tính (biến thành viên)
    private String maKhoa;
    private String tenKhoa;
    private int slgGiuong;
    private int slgBenhNhan;

    // ✅ Constructor (hàm khởi tạo)
    public Khoa(String maKhoa, String tenKhoa, int slgGiuong) {
        this.maKhoa = maKhoa;
        this.tenKhoa = tenKhoa;
        this.slgGiuong = slgGiuong;
        this.slgBenhNhan = 0;
    }

    // ✅ Getter và Setter
    public String getMaKhoa() {
        return maKhoa;
    }

    public void setMaKhoa(String maKhoa) {
        this.maKhoa = maKhoa;
    }

    public String getTenKhoa() {
        return tenKhoa;
    }

    public void setTenKhoa(String tenKhoa) {
        this.tenKhoa = tenKhoa;
    }

    public int getSlgGiuong() {
        return slgGiuong;
    }

    public void setSlgGiuong(int slgGiuong) {
        this.slgGiuong = slgGiuong;
    }

    public int getSlgBenhNhan() {
        return slgBenhNhan;
    }

    public void setSlgBenhNhan(int slgGiuong) {
        this.slgBenhNhan = slgBenhNhan;
    }
    
}

