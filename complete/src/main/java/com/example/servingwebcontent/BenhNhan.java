package entity;

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
        try {
            this.maBenhNhan = maBenhNhan;
            this.tenBenhNhan = tenBenhNhan;
            this.tuoi = tuoi;
            this.gioiTinh = gioiTinh;
            this.diaChi = diaChi;
            this.soDienThoai = soDienThoai;
            this.maPhong = maPhong;
            this.chuanDoan = chuanDoan;
        } catch (Exception e) {
            System.out.println("Lỗi khi khởi tạo BenhNhan: " + e.getMessage());
        } finally {
            // Có thể ghi log nếu cần
        }
    }

    // Getters & Setters có xử lý lỗi

    public String getMaBenhNhan() {
        return maBenhNhan;
    }

    public void setMaBenhNhan(String maBenhNhan) {
        try {
            this.maBenhNhan = maBenhNhan;
        } catch (Exception e) {
            System.out.println("Lỗi setMaBenhNhan: " + e.getMessage());
        }
    }

    public String getTenBenhNhan() {
        return tenBenhNhan;
    }

    public void setTenBenhNhan(String tenBenhNhan) {
        try {
            this.tenBenhNhan = tenBenhNhan;
        } catch (Exception e) {
            System.out.println("Lỗi setTenBenhNhan: " + e.getMessage());
        }
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        try {
            this.tuoi = tuoi;
        } catch (Exception e) {
            System.out.println("Lỗi setTuoi: " + e.getMessage());
        }
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        try {
            this.gioiTinh = gioiTinh;
        } catch (Exception e) {
            System.out.println("Lỗi setGioiTinh: " + e.getMessage());
        }
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        try {
            this.diaChi = diaChi;
        } catch (Exception e) {
            System.out.println("Lỗi setDiaChi: " + e.getMessage());
        }
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        try {
            this.soDienThoai = soDienThoai;
        } catch (Exception e) {
            System.out.println("Lỗi setSoDienThoai: " + e.getMessage());
        }
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        try {
            this.maPhong = maPhong;
        } catch (Exception e) {
            System.out.println("Lỗi setMaPhong: " + e.getMessage());
        }
    }

    public String getChuanDoan() {
        return chuanDoan;
    }

    public void setChuanDoan(String chuanDoan) {
        try {
            this.chuanDoan = chuanDoan;
        } catch (Exception e) {
            System.out.println("Lỗi setChuanDoan: " + e.getMessage());
        }
    }

    // Ghi đè toString để debug
    @Override
    public String toString() {
        try {
            return "BenhNhan{" +
                    "maBenhNhan='" + maBenhNhan + '\'' +
                    ", tenBenhNhan='" + tenBenhNhan + '\'' +
                    ", tuoi=" + tuoi +
                    ", gioiTinh='" + gioiTinh + '\'' +
                    ", diaChi='" + diaChi + '\'' +
                    ", soDienThoai='" + soDienThoai + '\'' +
                    ", maPhong='" + maPhong + '\'' +
                    ", chuanDoan='" + chuanDoan + '\'' +
                    '}';
        } catch (Exception e) {
            return "❌ Lỗi toString: " + e.getMessage();
        }
    }
}
