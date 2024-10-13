package QuanLy;

import QuanNuoc.ChiNhanh;
import ChoNgoi.Ban;
import TrangThai.TrangThaiBan;
import java.util.Scanner;

public class QuanLyBan {

    public void quanLyBan(Scanner sc, ChiNhanh chiNhanh) {
        System.out.println("----- Quản lý Bàn -----");
        System.out.println("1. Thêm bàn");
        System.out.println("2. Xóa bàn");
        System.out.print("Chọn chức năng: ");
        int chon = Integer.parseInt(sc.nextLine());

        switch (chon) {
            case 1:
                System.out.println("Nhập mã bàn: ");
                String maBan = sc.nextLine();
                System.out.println("Nhập sức chứa: ");
                int sucChua = Integer.parseInt(sc.nextLine());
                Ban banMoi = new Ban(maBan, sucChua, TrangThaiBan.ConBan);
                chiNhanh.themBan(banMoi);
                System.out.println("Thêm bàn thành công.");
                break;
            case 2:
                System.out.println("Nhập mã bàn cần xóa: ");
                String maBanXoa = sc.nextLine();
                chiNhanh.xoaBan(maBanXoa);
                System.out.println("Xóa bàn thành công.");
                break;
            default:
                System.out.println("Chức năng không hợp lệ.");
        }
    }
}
