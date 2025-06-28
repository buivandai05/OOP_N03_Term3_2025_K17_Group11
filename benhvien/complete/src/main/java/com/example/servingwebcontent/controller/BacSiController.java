package com.example.servingwebcontent.controller;

import com.example.servingwebcontent.BacSi;
import com.example.servingwebcontent.PhongDieuTri;
import com.example.servingwebcontent.service.HospitalService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/bacsi")
public class BacSiController {

    private final HospitalService hospitalService;

    public BacSiController(HospitalService hospitalService) {
        this.hospitalService = hospitalService;
    }

    // GET tất cả bác sĩ
    @GetMapping
    public List<BacSi> getAll() {
        return hospitalService.getDanhSachBacSi();
    }

    // Thêm hoặc cập nhật bác sĩ
    @PostMapping
    public String themHoacCapNhatBacSi(@RequestBody BacSi bs) {
        List<BacSi> danhSachBacSi = hospitalService.getDanhSachBacSi();
        for (BacSi b : danhSachBacSi) {
            if (b.getMaBacSi().equals(bs.getMaBacSi())) {
                b.setTenBacSi(bs.getTenBacSi());
                b.setChuyenKhoa(bs.getChuyenKhoa());
                b.setSoDienThoai(bs.getSoDienThoai());
                return "✅ Cập nhật bác sĩ thành công!";
            }
        }
        danhSachBacSi.add(bs);
        return "✅ Thêm bác sĩ thành công!";
    }

    // GET 1 bác sĩ
    @GetMapping("/{maBacSi}")
    public BacSi getByMa(@PathVariable String maBacSi) {
        return hospitalService.getDanhSachBacSi().stream()
                .filter(b -> b.getMaBacSi().equals(maBacSi))
                .findFirst().orElse(null);
    }

    // DELETE bác sĩ
    @DeleteMapping("/{maBacSi}")
    public String xoaBacSi(@PathVariable String maBacSi) {
        List<BacSi> danhSachBacSi = hospitalService.getDanhSachBacSi();
        danhSachBacSi.removeIf(b -> b.getMaBacSi().equals(maBacSi));
        for (PhongDieuTri p : hospitalService.getDanhSachPhong()) {
            if (maBacSi.equals(p.getMaBacSi())) {
                p.setMaBacSi(null);
            }
        }
        return " Đã xoá bác sĩ " + maBacSi;
    }

    // Gán phòng cho bác sĩ
    @PostMapping("/{maBacSi}/gan-phong")
    public String ganPhongChoBacSi(@PathVariable String maBacSi, @RequestParam String maPhong) {
        BacSi bacSi = hospitalService.getDanhSachBacSi().stream()
                .filter(b -> b.getMaBacSi().equals(maBacSi))
                .findFirst().orElse(null);

        if (bacSi == null) return " Không tìm thấy bác sĩ!";

        boolean ok = bacSi.themMaPhong(maPhong);
        if (!ok) return " Phòng đã được gán trước đó!";

        PhongDieuTri phong = hospitalService.getDanhSachPhong().stream()
                .filter(p -> p.getMaPhong().equals(maPhong))
                .findFirst().orElse(null);

        if (phong == null) return " Không tìm thấy phòng!";

        phong.setMaBacSi(maBacSi);
        return " Gán phòng thành công!";
    }

    // DELETE phòng khỏi bác sĩ
    @DeleteMapping("/{maBacSi}/xoa-phong")
    public String xoaPhongKhoiBacSi(@PathVariable String maBacSi, @RequestParam String maPhong) {
        BacSi bacSi = hospitalService.getDanhSachBacSi().stream()
                .filter(b -> b.getMaBacSi().equals(maBacSi))
                .findFirst().orElse(null);

        if (bacSi == null) return " Không tìm thấy bác sĩ!";

        bacSi.xoaMaPhong(maPhong);

        for (PhongDieuTri p : hospitalService.getDanhSachPhong()) {
            if (p.getMaPhong().equals(maPhong) && maBacSi.equals(p.getMaBacSi())) {
                p.setMaBacSi(null);
            }
        }

        return "✅ Đã xoá phòng " + maPhong + " khỏi Bác Sĩ " + maBacSi;
    }

    // GET danh sách phòng của bác sĩ
    @GetMapping("/{maBacSi}/phong")
    public List<PhongDieuTri> getPhongByBacSi(@PathVariable String maBacSi) {
        List<PhongDieuTri> ds = new ArrayList<>();
        for (PhongDieuTri p : hospitalService.getDanhSachPhong()) {
            if (maBacSi.equals(p.getMaBacSi())) {
                ds.add(p);
            }
        }
        return ds;
    }

    // GET tất cả phòng (quản lý nhanh)
    @GetMapping("/phong")
    public List<PhongDieuTri> getAllPhong() {
        return hospitalService.getDanhSachPhong();
    }

    // POST thêm phòng (quản lý nhanh)
    @PostMapping("/phong")
    public String themPhong(@RequestBody PhongDieuTri p) {
        hospitalService.getDanhSachPhong().add(p);
        return " Thêm phòng thành công!";
    }
}
