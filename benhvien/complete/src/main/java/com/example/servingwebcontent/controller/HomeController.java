package com.example.servingwebcontent.controller;

import com.example.servingwebcontent.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    private final HospitalService hospitalService;

    @Autowired
    public HomeController(HospitalService hospitalService) {
        this.hospitalService = hospitalService;
    }

    @GetMapping("/")
    public String trangChu(Model model) {
        // Thêm các số liệu thống kê
        model.addAttribute("tongBenhNhan", hospitalService.getTongSoBenhNhan());
        model.addAttribute("soPhongConTrong", hospitalService.getSoPhongConGiuongTrong());
        model.addAttribute("tongBacSi", hospitalService.getTongSoBacSi());
        return "index"; 
    }

    @GetMapping("/bacsi")
    public String bacSiPage() {
        return "BacSi"; 
    }

    @GetMapping("/benhnhan")
    public String benhNhanPage() {
        return "BenhNhan"; // s
    }

    @GetMapping("/phong")
    public String phongPage() {
        return "Phong"; 
    }

    @GetMapping("/hoso")
    public String hosoPage() {
        return "HoSo"; 
    }
}
