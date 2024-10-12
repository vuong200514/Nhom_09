package nguoi;

import java.util.List;

public class TinhLuong {
    private List<NhanVien> danhSachNhanVien;

    public TinhLuong(List<NhanVien> danhSachNhanVien) {
        this.danhSachNhanVien = danhSachNhanVien;
    }

    public void tinhLuong() {
        for (NhanVien nhanVien : danhSachNhanVien) {
            System.out.println("Tính lương cho nhân viên: " + nhanVien.getTen() + ", Lương: " + nhanVien.getLuong());
        }
    }
}
