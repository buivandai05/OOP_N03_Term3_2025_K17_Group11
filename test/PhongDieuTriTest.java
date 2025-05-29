import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class PhongDieuTriTest {
    private PhongDieuTri phongDieuTri;

    @BeforeEach
    public void setUp() {
        phongDieuTri = new PhongDieuTri("P001", "Phòng A", "Khoa Nội", 2, "BS001");
    }

    @Test
    public void testThemBenhNhan_ThanhCong() {
        BenhNhan bn1 = new BenhNhan("BN001", "Nguyen Van A", 30);
        assertTrue(phongDieuTri.themBenhNhan(bn1));
        assertEquals(1, phongDieuTri.getDsBenhNhan().size());
    }

    @Test
    public void testThemBenhNhan_VuotSucChua() {
        BenhNhan bn1 = new BenhNhan("BN001", "Nguyen Van A", 30);
        BenhNhan bn2 = new BenhNhan("BN002", "Tran Thi B", 25);
        BenhNhan bn3 = new BenhNhan("BN003", "Le Van C", 40);

        assertTrue(phongDieuTri.themBenhNhan(bn1));
        assertTrue(phongDieuTri.themBenhNhan(bn2));
        assertFalse(phongDieuTri.themBenhNhan(bn3)); // Vượt sức chứa
        assertEquals(2, phongDieuTri.getDsBenhNhan().size());
    }

    @Test
    public void testXoaBenhNhan_ThanhCong() {
        BenhNhan bn1 = new BenhNhan("BN001", "Nguyen Van A", 30);
        phongDieuTri.themBenhNhan(bn1);

        assertTrue(phongDieuTri.xoaBenhNhan("BN001"));
        assertEquals(0, phongDieuTri.getDsBenhNhan().size());
    }

    @Test
    public void testXoaBenhNhan_KhongTonTai() {
        assertFalse(phongDieuTri.xoaBenhNhan("BN999")); // Không tồn tại
    }
}
