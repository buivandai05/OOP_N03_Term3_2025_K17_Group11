package com.example.servingwebcontent.controller;

import com.example.servingwebcontent.BenhNhan;
import com.example.servingwebcontent.PhongDieuTri;
import com.example.servingwebcontent.service.HospitalService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/phong")
public class PhongDieuTriController {

    private final HospitalService hospitalService;

    public PhongDieuTriController(HospitalService hospitalService) {
        this.hospitalService = hospitalService;
    }

    // ✅ GET tất cả phòng (cập nhật dsBenhNhan để tính giường trống chính xác)
    @GetMapping
    public List<PhongDieuTri> getAllPhong() {
        for (PhongDieuTri p : hospitalService.getDanhSachPhong()) {
            List<BenhNhan> ds = new ArrayList<>();
            for (BenhNhan b : hospitalService.getDanhSachBenhNhan()) {
                if (p.getMaPhong() != null && p.getMaPhong().equals(b.getMaPhong())) {
                    ds.add(b);
                }
            }
            p.setDsBenhNhan(ds);
        }
        return hospitalService.getDanhSachPhong();
    }

    // ✅ GET 1 phòng chi tiết
    @GetMapping("/{maPhong}")
    public PhongDieuTri getPhongByMa(@PathVariable String maPhong) {
        for (PhongDieuTri p : hospitalService.getDanhSachPhong()) {
            if (p.getMaPhong().equals(maPhong)) {
                List<BenhNhan> ds = new ArrayList<>();
                for (BenhNhan b : hospitalService.getDanhSachBenhNhan()) {
                    if (maPhong.equals(b.getMaPhong())) {
                        ds.add(b);
                    }
                }
                p.setDsBenhNhan(ds);
                return p;
            }
        }
        return null;
    }

    // ✅ POST thêm phòng mới
    @PostMapping
    public String themPhong(@RequestBody PhongDieuTri phong) {
        for (PhongDieuTri p : hospitalService.getDanhSachPhong()) {
            if (p.getMaPhong().equals(phong.getMaPhong())) {
                return "❌ Mã phòng đã tồn tại!";
            }
        }
        hospitalService.getDanhSachPhong().add(phong);
        return "✅ Thêm phòng thành công!";
    }

    // ✅ PUT cập nhật phòng
    @PutMapping("/{maPhong}")
    public String capNhatPhong(@PathVariable String maPhong, @RequestBody PhongDieuTri phong) {
        for (PhongDieuTri p : hospitalService.getDanhSachPhong()) {
            if (p.getMaPhong().equals(maPhong)) {
                p.setTenPhong(phong.getTenPhong());
                p.setKhoa(phong.getKhoa());
                p.setSucChua(phong.getSucChua());
                return "✅ Cập nhật phòng thành công!";
            }
        }
        return "❌ Không tìm thấy phòng!";
    }

    // ✅ DELETE xoá phòng
    @DeleteMapping("/{maPhong}")
    public String xoaPhong(@PathVariable String maPhong) {
        hospitalService.getDanhSachPhong().removeIf(p -> p.getMaPhong().equals(maPhong));
        return "✅ Đã xoá phòng " + maPhong;
    }

    // ✅ POST gán bệnh nhân vào phòng
    @PostMapping("/{maPhong}/gan-benh-nhan")
    public String ganBenhNhanVaoPhong(
            @PathVariable String maPhong,
            @RequestParam String maBenhNhan) {

        PhongDieuTri foundPhong = null;
        for (PhongDieuTri p : hospitalService.getDanhSachPhong()) {
            if (p.getMaPhong().equals(maPhong)) {
                foundPhong = p;
                break;
            }
        }
        if (foundPhong == null) return "❌ Không tìm thấy phòng!";

        BenhNhan foundBN = null;
        for (BenhNhan b : hospitalService.getDanhSachBenhNhan()) {
            if (b.getMaBenhNhan().equals(maBenhNhan)) {
                foundBN = b;
                break;
            }
        }
        if (foundBN == null) return "❌ Không tìm thấy bệnh nhân!";

        // Gán mã phòng cho bệnh nhân
        foundBN.setMaPhong(maPhong);

        // Thêm bệnh nhân vào danh sách của phòng nếu chưa có
        if (!foundPhong.getDsBenhNhan().contains(foundBN)) {
            foundPhong.getDsBenhNhan().add(foundBN);
        }

        return "✅ Đã gán bệnh nhân " + maBenhNhan + " vào phòng " + maPhong;
    }

    // ✅ DELETE xoá bệnh nhân khỏi phòng
    @DeleteMapping("/{maPhong}/xoa-benh-nhan")
    public String xoaBenhNhanKhoiPhong(
            @PathVariable String maPhong,
            @RequestParam String maBenhNhan) {

        PhongDieuTri foundPhong = null;
        for (PhongDieuTri p : hospitalService.getDanhSachPhong()) {
            if (p.getMaPhong().equals(maPhong)) {
                foundPhong = p;
                break;
            }
        }
        if (foundPhong == null) return "❌ Không tìm thấy phòng!";

        BenhNhan foundBN = null;
        for (BenhNhan b : hospitalService.getDanhSachBenhNhan()) {
            if (b.getMaBenhNhan().equals(maBenhNhan)) {
                foundBN = b;
                break;
            }
        }
        if (foundBN == null) return "❌ Không tìm thấy bệnh nhân!";

        // Xoá bệnh nhân ra khỏi danh sách của phòng
        boolean removed = foundPhong.xoaBenhNhan(maBenhNhan);

        // Cập nhật cả mã phòng của bệnh nhân về null
        foundBN.setMaPhong(null);

        return removed ? "✅ Đã xoá bệnh nhân khỏi phòng!" : "❌ Không tìm thấy bệnh nhân trong phòng!";
    }
}
