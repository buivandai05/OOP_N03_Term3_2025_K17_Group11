import java.util.List;

public class BenhNhan extends Nguoi {
    private String maTheBH;
    private String diaChi;
    private List<HoSoBenhAn> hoSoBenhAn;

    public BenhNhan(String maNguoi, String hoTen, String ngaySinh, String gioiTinh, String soDienThoai,
                    String maTheBH, String diaChi, List<HoSoBenhAn> hoSoBenhAn) {
        super(maNguoi, hoTen, ngaySinh, gioiTinh, soDienThoai);
        this.maTheBH = maTheBH;
        this.diaChi = diaChi;
        this.hoSoBenhAn = hoSoBenhAn;
    }

}
