package QuanLy;

import QuanNuoc.BlackPink_Coffe;
import QuanNuoc.ChiNhanh;
import java.util.Scanner;

public class QuanLyChiNhanh {

    public void quanLyChiNhanh(Scanner sc, BlackPink_Coffe BlackPink) {
        System.out.println("----- Quản lý Chi nhánh -----");
        System.out.println("1. Thêm Chi nhánh");
        System.out.println("2. Xóa Chi nhánh");
        System.out.print("Chọn chức năng: ");
        int chon = Integer.parseInt(sc.nextLine());

        switch (chon) {
            case 1:
                System.out.println("Nhập tên chi nhánh: ");
                String ten = sc.nextLine();
                System.out.println("Nhập địa chỉ chi nhánh: ");
                String diachi = sc.nextLine();
                ChiNhanh chinhanh = new ChiNhanh(ten, diachi);
                BlackPink.themChiNhanh(chinhanh);
                System.out.println("Thêm chi nhánh thành công.");
                break;
            case 2:
                System.out.println("Nhập tên chi nhánh cần xóa: ");
                String tenXoa = sc.nextLine();
                for (ChiNhanh cn : BlackPink.getDsChiNhanh()) {
                    if (cn.getTenCN().equals(tenXoa)) {
                        BlackPink.getDsChiNhanh().remove(cn);
                        System.out.println("Xóa chi nhánh thành công.");
                        return;
                    }
                }
                System.out.println("Không tìm thấy chi nhánh cần xóa.");
                break;
            default:
                System.out.println("Chức năng không hợp lệ.");
        }
    }
}
