# 🏥 Quản Lý Quy Trình Khám Chữa Bệnh

## 👥 Nhóm thực hiện: **OOP_Group 11**

**Thành viên:**
- 👩‍⚕️ Lê Thị Cẩm Ly  
- 👨‍⚕️ Bùi Văn Đại  
- 👨‍⚕️ Vũ Huy Đô

---

## 📌 Giới thiệu dự án

**Quản lý quy trình khám chữa bệnh** là một ứng dụng hỗ trợ theo dõi và quản lý toàn bộ quy trình khám chữa bệnh tại các cơ sở y tế. Hệ thống bao gồm các chức năng từ tiếp nhận bệnh nhân, khám chữa bệnh, điều trị nội trú đến thanh toán viện phí.

---

## 🎯 Mục tiêu của dự án

- 🧾 Quản lý thông tin bệnh nhân, bác sĩ và nhân viên y tế.  
- 📅 Hỗ trợ quy trình đăng ký khám, xếp lịch, khám bệnh, kê đơn thuốc và thanh toán.  
- 📊 Cung cấp báo cáo và thống kê cho người quản lý cơ sở y tế.  

---

## 💻 Công nghệ sử dụng

- 🧠 **Ngôn ngữ lập trình:** Java  
- 🗄️ **Cơ sở dữ liệu:** MySQL  

---

## 🧩 Các lớp chính trong hệ thống

- 🧑 `Nguoi` *(abstract class)*  
  - `maNguoi`, `hoTen`, `ngaySinh`, `gioiTinh`, `soDienThoai`

- 🧑‍🦽 `BenhNhan` *(extends Nguoi)*  
  - `maTheBH`, `diaChi`, `hoSoBenhAn`

- 👨‍⚕️ `BacSi` *(extends Nguoi)*  
  - `chuyenKhoa`, `benhNhanPhuTrach`

- 📋 `HoSoBenhAn`  
  - `maHoSo`, `ngayKham`, `trieuChung`, `chuanDoan`, `donThuoc`, `bacSiPhuTrach`

- 📆 `LichHen`  
  - `ngayHen`, `gioHen`, `benhNhan`, `bacSi`

- 💊 `DonThuoc`  
  - `maDonThuoc`, `ngayKeDon`, `chuanDoan`, `bacSiKeDon`, `dsThuoc`

- 💉 `Thuoc`  
  - `tenThuoc`, `donViTinh`, `soLuong`, `lieuDung`

- 🧾 `HoaDon`  
  - `maHoaDon`,`ngayLap`, `benhNhan`, `tongTien`.

---

## 🩺 Quy trình khám chữa bệnh

1. 📝 Tiếp nhận bệnh nhân  
2. 🔍 Kiểm tra thông tin bệnh nhân  
3. 🗓️ Tạo lịch hẹn khám  
4. 🧑‍⚕️ Khám bệnh  
5. 💊 Kê đơn thuốc (nếu cần)  
6. 🖨️ In đơn thuốc và trả kết quả  
7. 💵 Thanh toán (nếu có)  
8. ✅ Kết thúc  

---

## 📬 Liên hệ

Mọi thắc mắc, góp ý vui lòng liên hệ các thành viên nhóm hoặc giảng viên hướng dẫn.

---

> 🚀 Dự án được thực hiện trong khuôn khổ môn học **Lập trình Hướng đối tượng**.
