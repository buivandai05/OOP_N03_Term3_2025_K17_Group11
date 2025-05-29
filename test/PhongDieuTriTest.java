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
}
