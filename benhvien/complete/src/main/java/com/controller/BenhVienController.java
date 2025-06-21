package com.controller;

import com.example.servingwebcontent.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/benhvien")
public class BenhVienController {

    private BenhVien benhVien = new BenhVien();

    // === BỆNH NHÂN ===
    @PostMapping("/benhnhan")
    public String themBenhNhan(@RequestBody BenhNhan bn) {
        try {
            boolean ok = benhVien.themBenhNhan(bn);
            return ok ? "✅ Thêm bệnh nhân thành công!" : "❌ Mã đã tồn tại!";
        } catch (Exception e) {
            return "❌ Lỗi: " + e.getMessage();
        }
    }

    @GetMapping("/benhnhan")
    public List<BenhNhan> layTatCaBenhNhan() {
        try {
            return benhVien.layTatCaBenhNhan();
        } catch (Exception e) {
            return null;
        }
    }

    @GetMapping("/benhnhan/{ma}")
    public BenhNhan layBenhNhanTheoMa(@PathVariable String ma) {
        try {
            return benhVien.timBenhNhanTheoMa(ma);
        } catch (Exception e) {
            return null;
        }
    }

    @DeleteMapping("/benhnhan/{ma}")
    public String xoaBenhNhan(@PathVariable String ma) {
        try {
            boolean ok = benhVien.xoaBenhNhan(ma);
            return ok ? "✅ Xoá thành công!" : "❌ Không tìm thấy!";
        } catch (Exception e) {
            return "❌ Lỗi: " + e.getMessage();
        }
    }

    // === BÁC SĨ ===
    @PostMapping("/bacsi")
    public String themBacSi(@RequestBody BacSi bs) {
        try {
            boolean ok = benhVien.themBacSi(bs);
            return ok ? "✅ Thêm bác sĩ thành công!" : "❌ Mã đã tồn tại!";
        } catch (Exception e) {
            return "❌ Lỗi: " + e.getMessage();
        }
    }

    @GetMapping("/bacsi")
    public List<BacSi> layTatCaBacSi() {
        try {
            return benhVien.layTatCaBacSi();
        } catch (Exception e) {
            return null;
        }
    }

    @GetMapping("/bacsi/{ma}")
    public BacSi layBacSiTheoMa(@PathVariable String ma) {
        try {
            return benhVien.timBacSiTheoMa(ma);
        } catch (Exception e) {
            return null;
        }
    }

    @DeleteMapping("/bacsi/{ma}")
    public String xoaBacSi(@PathVariable String ma) {
        try {
            boolean ok = benhVien.xoaBacSi(ma);
            return ok ? "✅ Xoá thành công!" : "❌ Không tìm thấy!";
        } catch (Exception e) {
            return "❌ Lỗi: " + e.getMessage();
        }
    }

    // === PHÒNG ===
    @PostMapping("/phong")
    public String themPhong(@RequestBody PhongDieuTri p) {
        try {
            boolean ok = benhVien.themPhong(p);
            return ok ? "✅ Thêm phòng thành công!" : "❌ Mã đã tồn tại!";
        } catch (Exception e) {
            return "❌ Lỗi: " + e.getMessage();
        }
    }

    @GetMapping("/phong")
    public List<PhongDieuTri> layTatCaPhong() {
        try {
            return benhVien.layTatCaPhong();
        } catch (Exception e) {
            return null;
        }
    }

    @GetMapping("/phong/{ma}")
    public PhongDieuTri layPhongTheoMa(@PathVariable String ma) {
        try {
            return benhVien.timPhongTheoMa(ma);
        } catch (Exception e) {
            return null;
        }
    }

    @DeleteMapping("/phong/{ma}")
    public String xoaPhong(@PathVariable String ma) {
        try {
            boolean ok = benhVien.xoaPhong(ma);
            return ok ? "✅ Xoá thành công!" : "❌ Không tìm thấy!";
        } catch (Exception e) {
            return "❌ Lỗi: " + e.getMessage();
        }
    }

    // === LIÊN KẾT ===
    @PostMapping("/phong/{maPhong}/benhnhan")
    public String themBenhNhanVaoPhong(@PathVariable String maPhong, @RequestBody BenhNhan bn) {
        try {
            boolean ok = benhVien.themBenhNhanVaoPhong(maPhong, bn);
            return ok ? "✅ Thêm bệnh nhân vào phòng thành công!" : "❌ Phòng không tồn tại hoặc đã đầy!";
        } catch (Exception e) {
            return "❌ Lỗi: " + e.getMessage();
        }
    }

    @PostMapping("/bacsi/{maBacSi}/ganphong/{maPhong}")
    public String ganPhongChoBacSi(@PathVariable String maBacSi, @PathVariable String maPhong) {
        try {
            boolean ok = benhVien.ganPhongChoBacSi(maBacSi, maPhong);
            return ok ? "✅ Gán phòng cho bác sĩ thành công!" : "❌ Mã phòng hoặc bác sĩ không tồn tại!";
        } catch (Exception e) {
            return "❌ Lỗi: " + e.getMessage();
        }
    }
}
