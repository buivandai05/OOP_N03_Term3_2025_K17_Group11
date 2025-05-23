# 🏥 Quản Lý Bệnh Viện

## 👥 Nhóm thực hiện: **OOP_Group 11**

**Thành viên:**
- 👩‍⚕️ Lê Thị Cẩm Ly  
- 👨‍⚕️ Bùi Văn Đại  
- 👨‍⚕️ Vũ Huy Đô

---

## 📌 Giới thiệu dự án

**Quản Lý Bệnh Viện ** là một hệ thống quản lý tại bệnh viện, giúp tối ưu hóa và cải thiện hiệu quả hoạt động của các bệnh viện. Hệ thống cho phép quản lý hồ sơ bệnh nhân, bác sĩ.

---

## 🎯 Mục tiêu của dự án

- 🧾 Quản lý thông tin bệnh nhân, bác sĩ, phòng điều trị, hồ sơ bệnh án.  

---


🩺 Chức Năng Chính
- Quản lý bệnh nhân: thêm, sửa, xóa thông tin bệnh nhân.
- Quản lý phòng điều trị: thêm, sửa, xóa thông tin phòng.
- Phân công bệnh nhân vào phòng điều trị: thêm hoặc xóa bệnh nhân khỏi phòng.
- Tạo hồ sơ bệnh án: lưu trữ thông tin bệnh lý, ngày khám, bác sĩ điều trị, phương pháp điều trị, và kết quả.

---

## 💻 Công nghệ sử dụng

- **Ngôn ngữ lập trình:** Java  
- **Cơ sở dữ liệu:** MySQL  

---

## 🧩 Các lớp chính trong hệ thống

- `Nguoi` *(abstract class)*  
  - `maNguoi`, `hoTen`, `ngaySinh`, `gioiTinh`

- `BenhNhan` *(extends Nguoi)*  
  - `maBenhNhan`, `diaChi`, `sđt`

- `BacSi` *(extends Nguoi)*  
  - `maBacSi`,`chuyenKhoa`

- `HoSoBenhAn`  
  - `maHoSo`, `maBenhNhan`, `maBacSi`, `trieuChung`, `chuanDoan`

- `PhongDieuTri`
  - `maPhong`, `tenPhong`, `sucChua`, `danhSachBN`

---

