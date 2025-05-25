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
- Quản lý phòng điều trị: thêm, sửa, xóa thông tin phòng, thêm hoặc xóa bênh nhân khỏi phòng.
- Quản lý bác sĩ: thêm, sửa, xóa thông tin bác sĩ, thêm hoặc xóa phòng phụ trách cho bác sĩ.
- Lưu thông tin bệnh nhân ra file.

---

## 💻 Công nghệ sử dụng

- **Ngôn ngữ lập trình:** Java  
- **Cơ sở dữ liệu:** MySQL  

---

## 🧩 Các lớp chính trong hệ thống

- `BenhNhan`
  - `maBenhNhan`, `tenBenhNhan`, `tuoi`, `gioiTinh`, `diaChi`, `sđt`, `maPhong`, `chuanDoan`
  - 
- `PhongDieuTri`
  - `maPhong`, `tenPhong`, `khoa`, `sucChua`, `dsBenhNhan`, `MaBacSi` 
    
- `BacSi`
  - `maBacSi`, `tenBacSi`,`chuyenKhoa`, `sđt`, `dsBenhNhan`

---

