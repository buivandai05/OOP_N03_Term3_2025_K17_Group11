package controller;

import entity.PhongDieuTri;
import entity.BenhNhan;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/phong")
public class PhongDieuTriController {

    private List<PhongDieuTri> danhSachPhong = new ArrayList<>();

    // API: Lấy tất cả phòng
    @GetMapping
    public List<PhongDieuTri> getAllPhong() {
        return danhSachPhong; // Spring Boot tự convert sang JSON
    }

    // API: Thêm phòng
    @PostMapping
    public String themPhong(@RequestBody PhongDieuTri phong) {
        for (PhongDieuTri p : danhSachPhong) {
            if (p.getMaPhong().equals(phong.getMaPhong())) {
                return "❌ Mã phòng đã tồn tại!";
            }
        }
        danhSachPhong.add(phong);
        return "✅ Thêm phòng thành công!";
    }

    // API: Lấy chi tiết phòng theo mã
    @GetMapping("/{maPhong}")
    public PhongDieuTri getPhongByMa(@PathVariable String maPhong) {
        for (PhongDieuTri p : danhSachPhong) {
            if (p.getMaPhong().equals(maPhong)) {
                return p;
            }
        }
        return null;
    }

    // API: Thêm bệnh nhân vào phòng
    @PostMapping("/{maPhong}/them-benh-nhan")
    public String themBenhNhanVaoPhong(@PathVariable String maPhong, @RequestBody BenhNhan bn) {
        for (PhongDieuTri p : danhSachPhong) {
            if (p.getMaPhong().equals(maPhong)) {
                boolean ok = p.themBenhNhanVaoPhong(bn);
                return ok ? "✅ Thêm bệnh nhân vào phòng thành công!" : "❌ Phòng đã đầy!";
            }
        }
        return "❌ Không tìm thấy phòng!";
    }
}
