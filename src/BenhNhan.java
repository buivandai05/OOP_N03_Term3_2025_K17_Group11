public class BenhNhan {
    private String maBenhNhan;
    private String tenBenhNhan;
    private int tuoi;
    private String gioiTinh;
    private String diaChi;
    private String soDienThoai;
    private String maPhong;
    private String chuanDoan;

    // Constructor
    public BenhNhan(String maBenhNhan, String tenBenhNhan, int tuoi, String gioiTinh,
                    String diaChi, String soDienThoai, String maPhong, String chuanDoan) {
        this.maBenhNhan = maBenhNhan;
        this.tenBenhNhan = tenBenhNhan;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
        this.maPhong = maPhong;
        this.chuanDoan = chuanDoan;
    }

    // Getters and Setters
    public String getMaBenhNhan() { return maBenhNhan; }
    public void setMaBenhNhan(String maBenhNhan) { this.maBenhNhan = maBenhNhan; }

    public String getTenBenhNhan() { return tenBenhNhan; }
    public void setTenBenhNhan(String tenBenhNhan) { this.tenBenhNhan = tenBenhNhan; }

    public int getTuoi() { return tuoi; }
    public void setTuoi(int tuoi) { this.tuoi = tuoi; }

    public String getGioiTinh() { return gioiTinh; }
    public void setGioiTinh(String gioiTinh) { this.gioiTinh = gioiTinh; }

    public String getDiaChi() { return diaChi; }
    public void setDiaChi(String diaChi) { this.diaChi = diaChi; }

    public String getSoDienThoai() { return soDienThoai; }
    public void setSoDienThoai(String soDienThoai) { this.soDienThoai = soDienThoai; }

    public String getMaPhong() { return maPhong; }
    public void setMaPhong(String maPhong) { this.maPhong = maPhong; }

    public String getChuanDoan() { return chuanDoan; }
    public void setChuanDoan(String chuanDoan) { this.chuanDoan = chuanDoan; }

    public void hienThiThongTin() {
        System.out.println("Mã BN: " + maBenhNhan + ", Tên: " + tenBenhNhan + ", Tuổi: " + tuoi +
                ", Giới tính: " + gioiTinh + ", Địa chỉ: " + diaChi +
                ", SĐT: " + soDienThoai + ", Phòng: " + maPhong + ", Chuẩn đoán: " + chuanDoan);
    }
}
