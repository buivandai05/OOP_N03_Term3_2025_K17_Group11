package com.example.servingwebcontent.controller;

import com.example.servingwebcontent.model.BenhNhan;
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
                return " Mã bệnh nhân đã tồn tại!";
            }
        }
        hospitalService.getDanhSachBenhNhan().add(bn);
        return " Thêm bệnh nhân thành công!";
    }

    @PutMapping("/{id}")
    public String suaBenhNhan(@PathVariable String id, @RequestBody BenhNhan updated) {
        List<BenhNhan> ds = hospitalService.getDanhSachBenhNhan();
        for (int i = 0; i < ds.size(); i++) {
            if (ds.get(i).getMaBenhNhan().equals(id)) {
                ds.set(i, updated);
                return " Cập nhật thành công!";
            }
        }
        return " Không tìm thấy bệnh nhân để cập nhật!";
    }

    @DeleteMapping("/{id}")
    public String xoaBenhNhan(@PathVariable String id) {
        List<BenhNhan> ds = hospitalService.getDanhSachBenhNhan();
        boolean removed = ds.removeIf(bn -> bn.getMaBenhNhan().equals(id));
        return removed ? " Đã xoá bệnh nhân!" : " Không tìm thấy bệnh nhân!";
    }
}
