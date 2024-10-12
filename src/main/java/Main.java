import taikhoan.TaiKhoan;
import TrangThai.TrangThaiTK;
import menu.Menu;
import menu.DanhSachNuoc;
import menu.LoaiMenu;
import order.Order;
import nguoi.NhanVienOrder;
import QuanNuoc.ChiNhanh;
import QuanNuoc.BlackPink_Coffe;
import ChoNgoi.Ban;
import TrangThai.TrangThaiBan;
import java.io.*;
import java.util.Scanner;
import taikhoan.TaiKhoanNhanVien;

public class Main {
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
        Scanner sc = new Scanner(System.in);

        // Tạo thương hiệu
        BlackPink_Coffe BlackPink = new BlackPink_Coffe("My BlackPink");

        // Tạo chi nhánh chính
        ChiNhanh ChiNhanhChinh = new ChiNhanh("Đại Học Phenikaa", "Hà Đông");
        BlackPink.themChiNhanh(ChiNhanhChinh);

        // Tạo menu chính
        Menu menu = new Menu("1", "Main Menu", "The main menu for the restaurant");
        taoMenuChinh(menu);

        // Thêm nhân viên lễ tân
        TaiKhoanNhanVien account = new TaiKhoanNhanVien("user1", "pass123", "123 Main St", TrangThaiTK.HoatDong);
        double luong = 5000.0; // Thay đổi giá trị lương theo nhu cầu
        NhanVienOrder leTan = new NhanVienOrder("1", account, "Alice", "alice@example.com", "123456789", luong);


        // Vòng lặp quản lý
        int choice;
        do {
            System.out.println("----- Quản lý quán BlackPink Coffee -----");
            System.out.println("1. Quản lý chi nhánh");
            System.out.println("2. Quản lý menu");
            System.out.println("3. Quản lý bàn");
            System.out.println("4. Tạo order mới");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    quanLyChiNhanh(sc, BlackPink);
                    break;
                case 2:
                    quanLyMenu(sc, menu);
                    break;
                case 3:
                    quanLyBan(sc, ChiNhanhChinh);
                    break;
                case 4:
                    taoOrderMoi(sc, leTan, menu);
                    break;
                case 0:
                    System.out.println("Thoát chương trình quản lý.");
                    break;
                default:
                    System.out.println("Chức năng không hợp lệ, vui lòng chọn lại.");
            }
        } while (choice != 0);

        sc.close();
    }

    // Quản lý chi nhánh
    public static void quanLyChiNhanh(Scanner sc, BlackPink_Coffe BlackPink) {
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

    // Quản lý menu
    public static void quanLyMenu(Scanner sc, Menu menu) {
        System.out.println("----- Quản lý Menu -----");
        menu.inMenu();
        System.out.println("1. Thêm món mới");
        System.out.println("2. Xóa món");
        System.out.print("Chọn chức năng: ");
        int chon = Integer.parseInt(sc.nextLine());

        switch (chon) {
            case 1:
                System.out.println("Nhập tên món: ");
                String ten = sc.nextLine();
                System.out.println("Nhập mô tả: ");
                String moTa = sc.nextLine();
                System.out.println("Nhập giá: ");
                double gia = Double.parseDouble(sc.nextLine());
                DanhSachNuoc nuocMoi = new DanhSachNuoc("4", ten, moTa, gia);
                menu.getLoaimenu().get(0).themNuoc(nuocMoi);
                System.out.println("Thêm món thành công.");
                break;
            case 2:
                System.out.println("Nhập tên món cần xóa: ");
                String tenXoa = sc.nextLine();
                for (DanhSachNuoc nuoc : menu.getLoaimenu().get(0).getNuoc()) {
                    if (nuoc.getTenNuoc().equals(tenXoa)) {
                        menu.getLoaimenu().get(0).getNuoc().remove(nuoc);
                        System.out.println("Xóa món thành công.");
                        return;
                    }
                }
                System.out.println("Không tìm thấy món cần xóa.");
                break;
            default:
                System.out.println("Chức năng không hợp lệ.");
        }
    }

    // Quản lý bàn
    public static void quanLyBan(Scanner sc, ChiNhanh chiNhanh) {
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

    // Tạo order mới
    public static void taoOrderMoi(Scanner sc, NhanVienOrder leTan, Menu menu) {
        System.out.println("----- Tạo Order mới -----");
        menu.inMenu();
        System.out.println("Nhập ID order: ");
        String orderId = sc.nextLine();
        Order order = new Order(orderId);

        System.out.println("Nhập số món muốn gọi: ");
        int soMon = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < soMon; i++) {
            System.out.println("Nhập tên món: ");
            String tenMon = sc.nextLine();
            for (DanhSachNuoc nuoc : menu.getLoaimenu().get(0).getNuoc()) {
                if (nuoc.getTenNuoc().equals(tenMon)) {
                    order.goiMon(nuoc);
                }
            }
        }

        order.printOrder();
    }

    public static void taoMenuChinh(Menu menu) {
        DanhSachNuoc burger = new DanhSachNuoc("1", "Burger", "Delicious beef burger", 10.99);
        DanhSachNuoc pizza = new DanhSachNuoc("2", "Pizza", "Cheesy pizza with toppings", 8.99);
        DanhSachNuoc salad = new DanhSachNuoc("3", "Salad", "Fresh garden salad", 5.99);

        LoaiMenu section = new LoaiMenu("1", "Main Dishes", "Our main dishes");
        section.themNuoc(burger);
        section.themNuoc(pizza);
        section.themNuoc(salad);
        menu.themLoaiMenu(section);
    }
}
