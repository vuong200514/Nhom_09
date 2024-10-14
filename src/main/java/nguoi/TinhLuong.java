package nguoi;

import java.util.List;
import java.util.Scanner;

public class TinhLuong {
    Scanner sc = new Scanner(System.in);
    private List<NhanVien> danhSachNhanVien;

    public TinhLuong(List<NhanVien> danhSachNhanVien) {
        this.danhSachNhanVien = danhSachNhanVien;
    }
    
    public void tinhLuong(int thuongle) {
        for (NhanVien nhanVien : danhSachNhanVien) {
            System.out.println("Nhập số ngày làm việc:");
            int ngaylam = sc.nextInt();
            System.out.println("Nhập hệ số lương:");
            double heso = sc.nextInt();
            double luongCuoi = nhanVien.getLuongCoBan()*heso + thuongle;
            System.out.println("Tính lương cho nhân viên: "+nhanVien.getTen()+", Lương cuối: "+luongCuoi);
            nhanVien.setLuong(luongCuoi);
        }
    }
}
