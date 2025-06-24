package com.example.servingwebcontent.controller;

import com.example.servingwebcontent.BenhNhan;
import com.example.servingwebcontent.service.HospitalService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/benhnhan")
public class BenhNhanController {

    private final HospitalService hospitalService;

    public BenhNhanController(HospitalService hospitalService) {
        this.hospitalService = hospitalService;
    }

    @GetMapping
    public List<BenhNhan> getAllBenhNhan() {
        return hospitalService.getDanhSachBenhNhan();
    }

    @PostMapping
    public String themBenhNhan(@RequestBody BenhNhan bn) {
        for (BenhNhan b : hospitalService.getDanhSachBenhNhan()) {
            if (b.getMaBenhNhan().equals(bn.getMaBenhNhan())) {
                return "❌ Mã bệnh nhân đã tồn tại!";
            }
        }
        hospitalService.getDanhSachBenhNhan().add(bn);
        return "✅ Thêm bệnh nhân thành công!";
    }
}
