# Group 11 Project: Quản lý quy trình khám chữa bệnh.

# Member
- Lê Thị Cẩm Ly
- Bùi Văn Đại
- Vũ Huy Đô

# Introduction
Dự án "Quy trình khám chữa bệnh" là một hệ thống giúp theo dõi và quản lý các bước khám chữa bệnh tại các cơ sở y tế bao gồm từ tiếp đón bệnh nhân, khám bệnh, điều trị nội trú đến thanh toán viện phí.

# Structural Diagram
- Class:
  + BenhNhan : maBenhNhan, tenBenhNhan, ngaySinh, gioiTinh, sdtBenhNhan, diaChi.
  + BacSi : maBacSi, tenBacSi, khoa, sdtBacSi.
  + HoSoBenhAn : maBenhAn, tenBenhNhan, tenBacSi, chuanDoan, ngayKham, khoaDieuTri.
  + Khoa : maKhoa, tenKhoa, soGiuong.
  + VienPhi : maVienPhi, tenBenhNhan, phiKham, phiPhong, phiThuoc.
