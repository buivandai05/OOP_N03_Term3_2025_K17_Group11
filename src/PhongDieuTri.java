public class PhongDieuTri {
        private String maPhong;
        private String tenPhong;
        private int sucChua;
        private String trangThai; // Ví dụ: "Trống", "Đang sử dụng", "Bảo trì"

        public PhongDieuTri() {
        }

        public PhongDieuTri(String maPhong, String tenPhong, int sucChua, String trangThai) {
            this.maPhong = maPhong;
            this.tenPhong = tenPhong;
            this.sucChua = sucChua;
            this.trangThai = trangThai;
        }

        public String getMaPhong() {return maPhong;}
        public void setMaPhong(String maPhong) {this.maPhong = maPhong;}

        public String getTenPhong() {return tenPhong;}
        public void setTenPhong(String tenPhong) {this.tenPhong = tenPhong;}

        public int getSucChua() {return sucChua;}
        public void setSucChua(int sucChua) {this.sucChua = sucChua;}

        public String getTrangThai() {return trangThai;}
        public void setTrangThai(String trangThai) {this.trangThai = trangThai;}

        public void hienThiThongTin() {
            System.out.println("Mã phòng: " + maPhong);
            System.out.println("Tên phòng: " + tenPhong);
            System.out.println("Sức chứa: " + sucChua);
            System.out.println("Trạng thái: " + trangThai);
        }
    }
