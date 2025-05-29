import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

public class BenhVienTest {

    private BenhVien benhVien;
    private BacSi bacSi;
    private BenhNhan benhNhan;
    private PhongDieuTri phongDieuTri;

    @BeforeEach
    public void setUp() {
        benhVien = new BenhVien();

        // Mock objects for testing
        bacSi = new BacSi("BS001", "Dr. John", new ArrayList<>());
        benhNhan = new BenhNhan("BN001", "Alice", "Fever");
        phongDieuTri = new PhongDieuTri("P001");

        // Adding initial data
        benhVien.themBacSi(bacSi);
        benhVien.themBenhNhan(benhNhan);
        benhVien.themPhong(phongDieuTri);
    }

    @Test
    public void testThemBacSi() {
        BacSi newBacSi = new BacSi("BS002", "Dr. Jane", new ArrayList<>());
        benhVien.themBacSi(newBacSi);

        assertEquals(newBacSi, benhVien.timBacSiTheoMa("BS002"));
    }

    @Test
    public void testTimBacSiTheoMa() {
        assertEquals(bacSi, benhVien.timBacSiTheoMa("BS001"));
        assertNull(benhVien.timBacSiTheoMa("BS999"));
    }

    @Test
    public void testXoaBacSi() {
        benhVien.xoaBacSi("BS001");
        assertNull(benhVien.timBacSiTheoMa("BS001"));
    }

    @Test
    public void testGanPhongChoBacSi() {
        benhVien.ganPhongChoBacSi("BS001", "P001");
        assertTrue(phongDieuTri.getMaBacSi().equals("BS001"));
    }

    @Test
    public void testThemBenhNhan() {
        BenhNhan newBenhNhan = new BenhNhan("BN002", "Bob", "Cold");
        benhVien.themBenhNhan(newBenhNhan);

        assertEquals(newBenhNhan, benhVien.timBenhNhanTheoMa("BN002"));
    }

    @Test
    public void testTimBenhNhanTheoMa() {
        assertEquals(benhNhan, benhVien.timBenhNhanTheoMa("BN001"));
        assertNull(benhVien.timBenhNhanTheoMa("BN999"));
    }

    @Test
    public void testXoaBenhNhan() {
        benhVien.xoaBenhNhan("BN001");
        assertNull(benhVien.timBenhNhanTheoMa("BN001"));
    }

    @Test
    public void testGanBenhNhanVaoPhong() {
        boolean result = benhVien.ganBenhNhanVaoPhong("BN001", "P001");
        assertTrue(result);
        assertEquals("P001", benhNhan.getMaPhong());
    }

    @Test
    public void testThemPhong() {
        PhongDieuTri newPhong = new PhongDieuTri("P002");
        benhVien.themPhong(newPhong);

        assertEquals(newPhong, benhVien.timPhongTheoMa("P002"));
    }

    @Test
    public void testTimPhongTheoMa() {
        assertEquals(phongDieuTri, benhVien.timPhongTheoMa("P001"));
        assertNull(benhVien.timPhongTheoMa("P999"));
    }

    @Test
    public void testXoaPhong() {
        benhVien.xoaPhong("P001");
        assertNull(benhVien.timPhongTheoMa("P001"));
    }
}
