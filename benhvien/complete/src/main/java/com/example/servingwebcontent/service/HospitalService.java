package com.example.servingwebcontent.service;

import com.example.servingwebcontent.BenhNhan;
import com.example.servingwebcontent.BacSi;
import com.example.servingwebcontent.PhongDieuTri;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HospitalService {

    private final List<BenhNhan> danhSachBenhNhan = new ArrayList<>();
    private final List<PhongDieuTri> danhSachPhong = new ArrayList<>();
    private final List<BacSi> danhSachBacSi = new ArrayList<>();

{
        //phòng mẫu
        danhSachPhong.add(new PhongDieuTri("P001", "Phòng 101", "Khoa Nội", 4));
        danhSachPhong.add(new PhongDieuTri("P002", "Phòng 102", "Khoa Ngoại", 3));

        //bác sĩ mẫu
        danhSachBacSi.add(new BacSi("BS001", "Nguyễn Văn A", "Khoa Nội", "0123456789"));
        danhSachBacSi.add(new BacSi("BS002", "Trần Thị B", "Khoa Ngoại", "03456987"));
}
    // Getter danh sách
    public List<BenhNhan> getDanhSachBenhNhan() {
        return danhSachBenhNhan;
    }

    public List<PhongDieuTri> getDanhSachPhong() {
        return danhSachPhong;
    }

    public List<BacSi> getDanhSachBacSi() {
        return danhSachBacSi;
    }

    public void themBenhNhan(BenhNhan bn) {
        danhSachBenhNhan.add(bn);
    }

    public void themPhong(PhongDieuTri p) {
        danhSachPhong.add(p);
    }

    public void themBacSi(BacSi b) {
        danhSachBacSi.add(b);
    }

    //  Tổng số bệnh nhân
    public int getTongSoBenhNhan() {
        return danhSachBenhNhan.size();
    }

    // Tổng số phòng còn giường trống
    public long getSoPhongConGiuongTrong() {
        return danhSachPhong.stream()
                .filter(phong -> phong.getSoLuongBenhNhanHienTai() < phong.getSucChua())
                .count();
    }

    //  Tổng số bác sĩ
    public int getTongSoBacSi() {
        return danhSachBacSi.size();
    }
}
