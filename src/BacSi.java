public class BacSi {
    private String hoTen;
    private String chuyenKhoa;
    private String soDienThoai;
    private int namKinhNghiem;

    // Constructor
    public BacSi(String hoTen, String chuyenKhoa, String soDienThoai, int namKinhNghiem) {
        this.hoTen = hoTen;
        this.chuyenKhoa = chuyenKhoa;
        this.soDienThoai = soDienThoai;
        this.namKinhNghiem = namKinhNghiem;
    }

    // Getter và Setter
    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getChuyenKhoa() {
        return chuyenKhoa;
    }

    public void setChuyenKhoa(String chuyenKhoa) {
        this.chuyenKhoa = chuyenKhoa;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public int getNamKinhNghiem() {
        return namKinhNghiem;
    }

    public void setNamKinhNghiem(int namKinhNghiem) {
        this.namKinhNghiem = namKinhNghiem;
    }

    // In thông tin bác sĩ
    public void hienThiThongTin() {
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Chuyên khoa: " + chuyenKhoa);
        System.out.println("SĐT: " + soDienThoai);
        System.out.println("Năm kinh nghiệm: " + namKinhNghiem);
    }
}

