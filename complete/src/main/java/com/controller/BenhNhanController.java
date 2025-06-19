package controller;

import entity.BenhNhan;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/benhnhan")
public class BenhNhanController {

    private List<BenhNhan> danhSachBenhNhan = new ArrayList<>();

    // API: Lấy tất cả bệnh nhân (GET)
    @GetMapping
    public List<BenhNhan> getAllBenhNhan() {
        try {
            return danhSachBenhNhan;
        } catch (Exception e) {
            return null;
        }
    }

    // API: Thêm mới bệnh nhân (POST)
    @PostMapping
    public String themBenhNhan(@RequestBody BenhNhan bn) {
        try {
            for (BenhNhan b : danhSachBenhNhan) {
                if (b.getMaBenhNhan().equals(bn.getMaBenhNhan())) {
                    return "❌ Mã bệnh nhân đã tồn tại!";
                }
            }
            danhSachBenhNhan.add(bn);
            return "✅ Thêm bệnh nhân thành công!";
        } catch (Exception e) {
            return "❌ Lỗi: " + e.getMessage();
        }
    }

    // API: Lấy chi tiết bệnh nhân theo mã (GET)
    @GetMapping("/{maBN}")
    public BenhNhan getBenhNhanByMa(@PathVariable String maBN) {
        try {
            for (BenhNhan b : danhSachBenhNhan) {
                if (b.getMaBenhNhan().equals(maBN)) {
                    return b;
                }
            }
            return null;
        } catch (Exception e) {
            return null;
        }
    }
}
