package com.controller;

import com.example.servingwebcontent.BenhNhan;
import com.example.servingwebcontent.PhongDieuTri;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/phong")
public class PhongDieuTriController {

    private List<PhongDieuTri> danhSachPhong = new ArrayList<>();
    private List<BenhNhan> danhSachBenhNhan = new ArrayList<>(); // lưu tạm, thực tế nên DI từ Service

    // API: Lấy tất cả phòng
    @GetMapping
    public List<PhongDieuTri> getAllPhong() {
        return danhSachPhong;
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

    // ✅ API: Gán bệnh nhân đã có vào phòng (chỉ set mã phòng)
    @PostMapping("/{maPhong}/gan-benh-nhan")
    public String ganBenhNhanVaoPhong(
            @PathVariable String maPhong,
            @RequestParam String maBenhNhan) {

        // 1. Tìm phòng
        PhongDieuTri foundPhong = null;
        for (PhongDieuTri p : danhSachPhong) {
            if (p.getMaPhong().equals(maPhong)) {
                foundPhong = p;
                break;
            }
        }
        if (foundPhong == null) {
            return "❌ Không tìm thấy phòng!";
        }

        // 2. Tìm bệnh nhân
        BenhNhan foundBN = null;
        for (BenhNhan b : danhSachBenhNhan) {
            if (b.getMaBenhNhan().equals(maBenhNhan)) {
                foundBN = b;
                break;
            }
        }
        if (foundBN == null) {
            return "❌ Không tìm thấy bệnh nhân!";
        }

        // 3. Gán mã phòng cho bệnh nhân
        foundBN.setMaPhong(maPhong);
        return "✅ Đã gán bệnh nhân " + maBenhNhan + " vào phòng " + maPhong;
    }

    // ✅ API: Thêm bệnh nhân DEMO
    @PostMapping("/add-benh-nhan-demo")
    public String themBenhNhanDemo(@RequestBody BenhNhan bn) {
        for (BenhNhan b : danhSachBenhNhan) {
            if (b.getMaBenhNhan().equals(bn.getMaBenhNhan())) {
                return "❌ Mã bệnh nhân đã tồn tại!";
            }
        }
        danhSachBenhNhan.add(bn);
        return "✅ Thêm bệnh nhân demo thành công!";
    }
}
