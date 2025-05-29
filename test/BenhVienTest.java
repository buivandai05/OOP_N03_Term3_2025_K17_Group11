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


}
