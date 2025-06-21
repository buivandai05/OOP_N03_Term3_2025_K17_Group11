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
        try {
            return danhSachPhong;
        } catch (Exception e) {
            return null;
        }
    }

    // API: Thêm phòng
    @PostMapping
    public String themPhong(@RequestBody PhongDieuTri phong) {
        try {
            for (PhongDieuTri p : danhSachPhong) {
                if (p.getMaPhong().equals(phong.getMaPhong())) {
                    return "❌ Mã phòng đã tồn tại!";
                }
            }
            danhSachPhong.add(phong);
            return "✅ Thêm phòng thành công!";
        } catch (Exception e) {
            return "❌ Lỗi: " + e.getMessage();
        }
    }

    // API: Lấy chi tiết phòng theo mã
    @GetMapping("/{maPhong}")
    public PhongDieuTri getPhongByMa(@PathVariable String maPhong) {
        try {
            for (PhongDieuTri p : danhSachPhong) {
                if (p.getMaPhong().equals(maPhong)) {
                    return p;
                }
            }
            return null;
        } catch (Exception e) {
            return null;
        }
    }

    // API: Thêm bệnh nhân vào phòng
    @PostMapping("/{maPhong}/them-benh-nhan")
    public String themBenhNhanVaoPhong(@PathVariable String maPhong, @RequestBody BenhNhan bn) {
        try {
            for (PhongDieuTri p : danhSachPhong) {
                if (p.getMaPhong().equals(maPhong)) {
                    boolean ok = p.themBenhNhanVaoPhong(bn);
                    return ok ? "✅ Thêm bệnh nhân vào phòng thành công!" : "❌ Phòng đã đầy!";
                }
            }
            return "❌ Không tìm thấy phòng!";
        } catch (Exception e) {
            return "❌ Lỗi: " + e.getMessage();
        }
    }
}
