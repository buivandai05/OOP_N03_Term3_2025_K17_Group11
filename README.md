# Quản Lý Quy Trình Khám Chữa Bệnh

## 👨‍⚕️ Giới thiệu
**Quản lý quy trình khám chữa bệnh** là một ứng dụng giúp theo dõi và hỗ trợ quản lý các bước trong quy trình khám chữa bệnh của bệnh nhân tại các cơ sở y tế. Ứng dụng hỗ trợ từ khâu tiếp đón, tạo lịch hẹn, khám bệnh, điều trị đến kê đơn thuốc và thanh toán viện phí.

---

## 👥 Thành viên nhóm – Group 11
- Lê Thị Cẩm Ly  
- Bùi Văn Đại  
- Vũ Huy Đô  

---

## 🎯 Mục tiêu dự án
- Quản lý thông tin bệnh nhân, bác sĩ và nhân viên y tế.
- Hỗ trợ các quy trình:
  - Đăng ký khám bệnh
  - Xếp lịch khám
  - Khám bệnh và kê đơn thuốc
  - Thanh toán viện phí
- Cung cấp các báo cáo và thống kê phục vụ cho việc quản lý và điều hành tại cơ sở y tế.

---

## 🛠️ Công nghệ sử dụng
- **Ngôn ngữ lập trình:** Java  
- **Cơ sở dữ liệu:** MySQL

---

## 🏗️ Cấu trúc các lớp chính

```plaintext
+-----------------+
|     Nguoi       |  (abstract)
+-----------------+
| - maNguoi       |
| - hoTen         |
| - ngaySinh      |
| - gioiTinh      |
| - soDienThoai   |
+-----------------+
        ▲
        |
+---------------+        +---------------+
|   BenhNhan    |        |    BacSi      |
+---------------+        +---------------+
| - maTheBH     |        | - chuyenKhoa  |
| - diaChi      |        |               |
| - hoSoBenhAn* |        | - dsBenhNhan* |
+---------------+        +---------------+

             *                       *
             |                       |
+----------------+        +-------------------+
| HoSoBenhAn     |<-------|      BacSi        |
+----------------+        +-------------------+
| - maHoSo       |
| - ngayKham     |
| - trieuChung   |
| - chanDoan     |
| - donThuoc     |
| - bacSiPhuTrach|
+----------------+
        |
        v
+------------------+
|    DonThuoc      |
+------------------+
| - maDonThuoc     |
| - ngayKeDon      |
| - chanDoan       |
| - bacSiKeDon     |
| - dsThuoc        |
+------------------+
        |
        v
+------------------+
|     Thuoc        |
+------------------+
| - tenThuoc       |
| - donViTinh      |
| - soLuong        |
| - lieuDung       |
+------------------+

+--------------------+
|     LichHen        |
+--------------------+
| - ngayHen          |
| - gioHen           |
| - benhNhan         |
| - bacSi            |
+--------------------+

+--------------------+
|      HoaDon        |
+--------------------+
| - tongChiPhi       |
+--------------------+

🔁 Quy trình khám chữa bệnh
1.Tiếp nhận bệnh nhân

2.Kiểm tra thông tin bệnh nhân

3.Tạo lịch hẹn khám

4.Khám bệnh

5.Kê đơn thuốc (nếu cần)

6.In đơn thuốc và trả kết quả

7.Thanh toán (nếu có)

8.Kết thúc
