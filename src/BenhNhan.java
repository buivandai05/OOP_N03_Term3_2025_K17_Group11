import java.util.List;

public class BenhNhan extends Nguoi {
    private String maTheBH;
    private String diaChi;
    private List<HoSoBenhAn> hoSoBenhAn;
    private PhongDieuTri phongDieuTri;


    public BenhNhan(String maNguoi, String hoTen, String ngaySinh, String gioiTinh, String soDienThoai,
                    String maTheBH, String diaChi, List<HoSoBenhAn> hoSoBenhAn,PhongDieuTri phongDieuTri) {
        super(maNguoi, hoTen, ngaySinh, gioiTinh, soDienThoai);
        this.maTheBH = maTheBH;
        this.diaChi = diaChi;
        this.hoSoBenhAn = hoSoBenhAn;
        this.phongDieuTri = phongDieuTri;
    }

    public BenhNhan() {
        super();
    }

    public String getMaTheBH() {return maTheBH;}
    public void setMaTheBH(String maTheBH) {this.maTheBH = maTheBH;}

    public String getDiaChi() {return diaChi;}
    public void setDiaChi(String diaChi) {this.diaChi = diaChi;}

    public List<HoSoBenhAn> getHoSoBenhAn() {return hoSoBenhAn;}
    public void setHoSoBenhAn(List<HoSoBenhAn> hoSoBenhAn) {this.hoSoBenhAn = hoSoBenhAn;}

    public PhongDieuTri getPhongDieuTri() {return phongDieuTri;}
    public void setPhongDieuTri(PhongDieuTri phongDieuTri) {this.phongDieuTri = phongDieuTri;}

}
