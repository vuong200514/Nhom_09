package nguoi;

import java.util.List;

public class TinhLuong {
    private List<NhanVien> danhSachNhanVien;

    public TinhLuong(List<NhanVien> danhSachNhanVien) {
        this.danhSachNhanVien = danhSachNhanVien;
    }
    
    public void tinhLuong(int ngaylamviec) {
        for (NhanVien nhanVien : danhSachNhanVien) {
            double luongCuoi = nhanVien.getLuong() * ngaylamviec;
            System.out.println("Tính lương cho nhân viên: " + nhanVien.getTen() + 
                               ", Lương cuối: " + luongCuoi);
        }
    }

    public void tinhLuong(int ngaylamviec, double thuong) {
        for (NhanVien nhanVien : danhSachNhanVien) {
            double luongCuoi = nhanVien.getLuong() * ngaylamviec + thuong;
            System.out.println("Tính lương cho nhân viên: " + nhanVien.getTen() + 
                               ", Lương cuối: " + luongCuoi);
        }
    }
}
