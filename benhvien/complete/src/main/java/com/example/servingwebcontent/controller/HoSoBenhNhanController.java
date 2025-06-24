package com.example.servingwebcontent.controller;

import com.example.servingwebcontent.BenhNhan;
import com.example.servingwebcontent.BacSi;
import com.example.servingwebcontent.PhongDieuTri;
import com.example.servingwebcontent.service.HospitalService;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/hoso")
public class HoSoBenhNhanController {

    private final HospitalService hospitalService;

    public HoSoBenhNhanController(HospitalService hospitalService) {
        this.hospitalService = hospitalService;
    }

    @GetMapping("/{maBenhNhan}")
    public Map<String, Object> getHoSo(@PathVariable String maBenhNhan) {
        // 1. Tìm bệnh nhân
        BenhNhan bn = hospitalService.getDanhSachBenhNhan().stream()
                .filter(b -> b.getMaBenhNhan().equals(maBenhNhan))
                .findFirst().orElse(null);

        if (bn == null) return null;

        // 2. Tìm phòng
        PhongDieuTri phong = hospitalService.getDanhSachPhong().stream()
                .filter(p -> p.getMaPhong().equals(bn.getMaPhong()))
                .findFirst().orElse(null);

        // 3. Tìm bác sĩ
        BacSi bacSi = null;
        if (phong != null && phong.getMaBacSi() != null) {
            bacSi = hospitalService.getDanhSachBacSi().stream()
                    .filter(b -> b.getMaBacSi().equals(phong.getMaBacSi()))
                    .findFirst().orElse(null);
        }

        // 4. Gói dữ liệu vào 1 Map thay vì DTO
        Map<String, Object> result = new HashMap<>();
        result.put("benhNhan", bn);
        result.put("phong", phong);
        result.put("bacSi", bacSi);

        return result;
    }
}
