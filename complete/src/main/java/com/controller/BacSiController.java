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
        return danhSachBacSi;
    }

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

    @GetMapping("/{maBacSi}")
    public BacSi getByMa(@PathVariable String maBacSi) {
        for (BacSi b : danhSachBacSi) {
            if (b.getMaBacSi().equals(maBacSi)) {
                return b;
            }
        }
        return null; // Hoặc ResponseEntity.notFound().build()
    }
}
