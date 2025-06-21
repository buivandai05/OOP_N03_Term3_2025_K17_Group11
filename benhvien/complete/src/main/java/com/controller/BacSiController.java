package com.controller;

import com.example.servingwebcontent.BacSi;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/bacsi")
public class BacSiController {

    private List<BacSi> danhSachBacSi = new ArrayList<>();

    // API: Lấy tất cả bác sĩ
    @GetMapping
    public List<BacSi> getAll() {
        return danhSachBacSi;
    }

    // API: Thêm bác sĩ mới
    @PostMapping
    public String themBacSi(@RequestBody BacSi bs) {
        for (BacSi b : danhSachBacSi) {
            if (b.getMaBacSi().equals(bs.getMaBacSi())) {
                return "❌ Mã bác sĩ đã tồn tại!";
            }
        }
        danhSachBacSi.add(bs);
        return "✅ Thêm bác sĩ thành công!";
    }

    // API: Lấy bác sĩ theo mã
    @GetMapping("/{maBacSi}")
    public BacSi getByMa(@PathVariable String maBacSi) {
        for (BacSi b : danhSachBacSi) {
            if (b.getMaBacSi().equals(maBacSi)) {
                return b;
            }
        }
        return null;
    }

    // ✅ API: Gán thêm 1 phòng cho bác sĩ
    @PostMapping("/{maBacSi}/gan-phong")
    public String ganPhongChoBacSi(@PathVariable String maBacSi, @RequestParam String maPhong) {
        for (BacSi b : danhSachBacSi) {
            if (b.getMaBacSi().equals(maBacSi)) {
                boolean ok = b.themMaPhong(maPhong);
                return ok ? "✅ Gán phòng thành công!" : "❌ Phòng đã được gán trước đó!";
            }
        }
        return "❌ Không tìm thấy bác sĩ!";
    }

    // (Tuỳ chọn) API: Xoá phòng khỏi bác sĩ
    @PostMapping("/{maBacSi}/xoa-phong")
    public String xoaPhong(@PathVariable String maBacSi, @RequestParam String maPhong) {
        for (BacSi b : danhSachBacSi) {
            if (b.getMaBacSi().equals(maBacSi)) {
                b.xoaMaPhong(maPhong);
                return "✅ Đã xoá phòng khỏi bác sĩ!";
            }
        }
        return "❌ Không tìm thấy bác sĩ!";
    }
}
