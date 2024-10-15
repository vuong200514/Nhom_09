package QuanLy;
import QuanLy.*;
import nguoi.*;
import taikhoan.*;
import java.io.*;
import java.util.*;
import TrangThai.*;

public class QuanLyNhanSu {
    public void quanLyNhanSu(Scanner sc, QuanLy quanLy, List<NhanVien> danhSachNhanVien) {
        System.out.println("----- Quản lý nhân sự -----");
        System.out.println("1. Thêm nhân viên");
        System.out.println("2. Xóa nhân viên");
        System.out.println("3. Hiện danh nhân viên");
        System.out.println("4. Tính lương cho nhân viên");
        System.out.println("5. Hiển thị danh sách nhân viên");
        System.out.print("Chọn chức năng: ");
        sc.nextLine();
        int chon = Integer.parseInt(sc.nextLine());

        switch (chon) {
            case 1:
                quanLy.themNhanVien();
                break;
            case 2:
                for (NhanVien nhanVien : danhSachNhanVien){
                    nhanVien.hienthi();
                }
                System.out.println("Nhập mã nhân viên muốn xóa");
                String maNhanVien = sc.nextLine();
                quanLy.xoaNhanVien(maNhanVien);
                break;
            case 3:
                for (NhanVien nhanVien : danhSachNhanVien){
                    nhanVien.hienthi();
                }
                break;
            case 4:
                quanLy.tinhLuongChoNhanVien(danhSachNhanVien);
                break;
            case 5:
                quanLy.timKiemNhanVien(danhSachNhanVien);
                break;
            default:
                System.out.println("Chức năng không hợp lệ.");
        }
    }
}
