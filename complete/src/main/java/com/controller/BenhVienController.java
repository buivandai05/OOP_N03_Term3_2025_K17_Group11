package controller;

import entity.BacSi;
import entity.BenhNhan;
import entity.PhongDieuTri;
import org.springframework.web.bind.annotation.*;
import service.BenhVien;

import java.util.List;

@RestController
@RequestMapping("/api/benhvien")
public class BenhVienController {

    private BenhVien benhVien = new BenhVien();

    // === BỆNH NHÂN ===
    @PostMapping("/benhnhan")
    public String themBenhNhan(@RequestBody BenhNhan bn) {
        boolean ok = benhVien.themBenhNhan(bn);
        return ok ? "✅ Thêm bệnh nhân thành công!" : "❌ Mã đã tồn tại!";
    }

    @GetMapping("/benhnhan")
    public List<BenhNhan> layTatCaBenhNhan() {
        return benhVien.layTatCaBenhNhan();
    }

    @GetMapping("/benhnhan/{ma}")
    public BenhNhan layBenhNhanTheoMa(@PathVariable String ma) {
        return benhVien.timBenhNhanTheoMa(ma);
    }

    @DeleteMapping("/benhnhan/{ma}")
    public String xoaBenhNhan(@PathVariable String ma) {
        boolean ok = benhVien.xoaBenhNhan(ma);
        return ok ? "✅ Xoá thành công!" : "❌ Không tìm thấy!";
    }

    // === BÁC SĨ ===
    @PostMapping("/bacsi")
    public String themBacSi(@RequestBody BacSi bs) {
        boolean ok = benhVien.themBacSi(bs);
        return ok ? "✅ Thêm bác sĩ thành công!" : "❌ Mã đã tồn tại!";
    }

    @GetMapping("/bacsi")
    public List<BacSi> layTatCaBacSi() {
        return benhVien.layTatCaBacSi();
    }

    @GetMapping("/bacsi/{ma}")
    public BacSi layBacSiTheoMa(@PathVariable String ma) {
        return benhVien.timBacSiTheoMa(ma);
    }

    @DeleteMapping("/bacsi/{ma}")
    public String xoaBacSi(@PathVariable String ma) {
        boolean ok = benhVien.xoaBacSi(ma);
        return ok ? "✅ Xoá thành công!" : "❌ Không tìm thấy!";
    }

    // === PHÒNG ===
    @PostMapping("/phong")
    public String themPhong(@RequestBody PhongDieuTri p) {
        boolean ok = benhVien.themPhong(p);
        return ok ? "✅ Thêm phòng thành công!" : "❌ Mã đã tồn tại!";
    }

    @GetMapping("/phong")
    public List<PhongDieuTri> layTatCaPhong() {
        return benhVien.layTatCaPhong();
    }

    @GetMapping("/phong/{ma}")
    public PhongDieuTri layPhongTheoMa(@PathVariable String ma) {
        return benhVien.timPhongTheoMa(ma);
    }

    @DeleteMapping("/phong/{ma}")
    public String xoaPhong(@PathVariable String ma) {
        boolean ok = benhVien.xoaPhong(ma);
        return ok ? "✅ Xoá thành công!" : "❌ Không tìm thấy!";
    }

    // === LIÊN KẾT ===
    @PostMapping("/phong/{maPhong}/benhnhan")
    public String themBenhNhanVaoPhong(@PathVariable String maPhong, @RequestBody BenhNhan bn) {
        boolean ok = benhVien.themBenhNhanVaoPhong(maPhong, bn);
        return ok ? "✅ Thêm bệnh nhân vào phòng thành công!" : "❌ Phòng không tồn tại hoặc đã đầy!";
    }

    @PostMapping("/bacsi/{maBacSi}/ganphong/{maPhong}")
    public String ganPhongChoBacSi(@PathVariable String maBacSi, @PathVariable String maPhong) {
        boolean ok = benhVien.ganPhongChoBacSi(maBacSi, maPhong);
        return ok ? "✅ Gán phòng cho bác sĩ thành công!" : "❌ Mã phòng hoặc bác sĩ không tồn tại!";
    }
}
