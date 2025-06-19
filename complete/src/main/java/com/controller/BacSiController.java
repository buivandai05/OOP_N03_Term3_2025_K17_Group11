package com.example.benhvien.controller;

import com.example.benhvien.entity.BacSi;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/bacsi")
public class BacSiController {

    private List<BacSi> danhSachBacSi = new ArrayList<>();

    @GetMapping
    public List<BacSi> getAll() {
        try {
            return danhSachBacSi;
        } catch (Exception e) {
            return null;
        }
    }

    @PostMapping
    public String themBacSi(@RequestBody BacSi bs) {
        try {
            for (BacSi b : danhSachBacSi) {
                if (b.getMaBacSi().equals(bs.getMaBacSi())) {
                    return "❌ Mã bác sĩ đã tồn tại!";
                }
            }
            danhSachBacSi.add(bs);
            return "✅ Thêm bác sĩ thành công!";
        } catch (Exception e) {
            return "❌ Lỗi: " + e.getMessage();
        }
    }

    @GetMapping("/{maBacSi}")
    public BacSi getByMa(@PathVariable String maBacSi) {
        try {
            for (BacSi b : danhSachBacSi) {
                if (b.getMaBacSi().equals(maBacSi)) {
                    return b;
                }
            }
            return null;
        } catch (Exception e) {
            return null;
        }
    }
}
