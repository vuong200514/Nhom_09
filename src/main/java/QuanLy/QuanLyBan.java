package QuanLy;

import QuanNuoc.ChiNhanh;
import ChoNgoi.*;
import TrangThai.LoaiChoNgoi;
import TrangThai.TrangThaiBan;
import java.util.Scanner;

public class QuanLyBan {

    public void quanLyBan(Scanner sc, ChiNhanh chiNhanh) {
        GheNgoi gheNgoi = new GheNgoi(5,LoaiChoNgoi.BinhThuong);
        System.out.println("----- Quản lý Bàn -----");
        System.out.println("1. Thêm bàn");
        System.out.println("2. Xóa bàn");
        System.out.println("3. Cập nhập bàn");
        System.out.println("4. Hiện danh sách bàn");
        System.out.println("5. Cập nhập bàn");
        System.out.print("Chọn chức năng: ");
        sc.nextLine();
        int chon = Integer.parseInt(sc.nextLine());

        switch (chon) {
            case 1:
                System.out.println("Nhập mã bàn: ");
                String maBan = sc.nextLine();
                System.out.println("Nhập sức chứa: ");
                int sucChua = Integer.parseInt(sc.nextLine());
                Ban banMoi = new Ban(maBan, sucChua, TrangThaiBan.ConBan, gheNgoi);
                chiNhanh.themBan(banMoi);
                System.out.println("Thêm bàn thành công.");
                break;
            case 2:
                System.out.println("Nhập mã bàn cần xóa: ");
                String maBanXoa = sc.nextLine();
                chiNhanh.xoaBan(maBanXoa);
                System.out.println("Xóa bàn thành công.");
                break;
            case 4:
                System.out.println("-----Danh sách các bàn ở chi nhánh "+chiNhanh.getTenChiNhanh()+"-----");
                chiNhanh.dsBan();
                break;
            case 5:
                System.out.println("Cập nhập bàn");
                System.out.println("Nhập mã bàn: ");
                maBan = sc.nextLine();
                System.out.println("Nhập sức chứa: ");
                sucChua = Integer.parseInt(sc.nextLine());
                banMoi = new Ban(maBan, sucChua, TrangThaiBan.ConBan, gheNgoi);
                chiNhanh.xoaBan(maBan);
                chiNhanh.themBan(banMoi);
                System.out.println("Cập nhập bàn thành công.");
            default:
                System.out.println("Chức năng không hợp lệ.");
        }
    }
}
