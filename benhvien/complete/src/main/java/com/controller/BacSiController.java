package com.example.benhvien.controller;

import com.example.benhvien.entity.BacSi;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/bacsi")
public class BacSiController {

    private List<BacSi> danhSachBacSi = new ArrayList<>();

    // Lấy danh sách tất cả bác sĩ
    @GetMapping
    public List<BacSi> getAll() {
        try {
            return danhSachBacSi;
        } catch (Exception e) {
            System.out.println("Lỗi khi lấy danh sách bác sĩ: " + e.getMessage());
            return new ArrayList<>();
        }
    }

    // Thêm bác sĩ mới
    @PostMapping
    public String themBacSi(@RequestBody BacSi bs) {
        try {
            for (BacSi b : danhSachBacSi) {
                if (b.getMaBacSi().equals(bs.getMaBacSi())) {
                    return " Mã bác sĩ đã tồn tại!";
                }
            }
            danhSachBacSi.add(bs);
            return "✅ Thêm bác sĩ thành công!";
        } catch (Exception e) {
            System.out.println("Lỗi khi thêm bác sĩ: " + e.getMessage());
            return " Lỗi thêm bác sĩ.";
        }
    }

    // Lấy bác sĩ theo mã
    @GetMapping("/{maBacSi}")
    public BacSi getByMa(@PathVariable String maBacSi) {
        try {
            for (BacSi b : danhSachBacSi) {
                if (b.getMaBacSi().equals(maBacSi)) {
                    return b;
                }
            }
        } catch (Exception e) {
            System.out.println("Lỗi tìm bác sĩ theo mã: " + e.getMessage());
        }
        return null;
    }
}
