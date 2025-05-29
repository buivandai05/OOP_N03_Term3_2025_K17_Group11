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
}
