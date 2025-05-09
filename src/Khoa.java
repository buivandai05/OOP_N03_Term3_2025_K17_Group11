public class Khoa {
    private static String maKhoa;
    private static String tenKhoa;
    private static int slgGiuong;
    private static int slgBenhNhan;

    public Khoa(String maKhoa, String tenKhoa, int slgGiuong) {
        this.maKhoa = maKhoa;
        this.tenKhoa = tenKhoa;
        this.slgGiuong = slgGiuong;
        this.slgBenhNhan = 0;
    }

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

    public static void displayInfo() {
        System.out.println("Khoa: " + tenKhoa + " | Mã: " + maKhoa +
                " | Số lượng giường bệnh: " + slgGiuong +
                " | Số lượng bệnh nhân đang điều trị: " + slgBenhNhan);
    }

}
