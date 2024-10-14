import QuanLy.*;
import taikhoan.*;
import TrangThai.*;
import menu.*;
import nguoi.*;
import QuanNuoc.*;
import java.io.*;
import java.util.*;
import cacloaihoadon.DoanhThu;

public class Main {
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
        Scanner sc = new Scanner(System.in);
        DoanhThu doanhThu = new DoanhThu();
        QuanLyChiNhanh qlcn = new QuanLyChiNhanh();
        QuanLyMenu qlmenu = new QuanLyMenu();
        QuanLyBan qlb = new QuanLyBan();
        TaoOrder order = new TaoOrder(doanhThu);
        
        // Tao Quan cafe + chi nhanh chinh
        BlackPink_Coffe BlackPink = new BlackPink_Coffe("My BlackPink");
        ChiNhanh ChiNhanhChinh = new ChiNhanh("Đại Học Phenikaa", "Hà Đông");
        BlackPink.themChiNhanh(ChiNhanhChinh);
        
        // Tao menu cac loai nuoc
        Menu menuchinh = new Menu("1", "Menu Chính", "Menu các loại nước");
        LoaiMenu menuTra = new LoaiMenu("1", "Trà", "Các loại trà ngon");
        LoaiMenu menuCoffee = new LoaiMenu("2", "Cà phê", "Các loại cà phê thơm ngon");
        LoaiMenu menuSinhTo = new LoaiMenu("3", "Sinh Tố và Trái Cây", "Các loại sinh tố và trái cây");
        LoaiMenu menuNuocNgot = new LoaiMenu("4", "Nước Ngọt Đóng Chai", "Các loại nước ngọt đóng chai");
        LoaiMenu menuSnack = new LoaiMenu("5", "Đồ Ăn Vặt", "Các loại đồ ăn vặt");
        
        List<LoaiMenu> danhSachLoaiMenu = new ArrayList<>();
        danhSachLoaiMenu.add(menuTra);
        danhSachLoaiMenu.add(menuCoffee);
        danhSachLoaiMenu.add(menuSinhTo);
        danhSachLoaiMenu.add(menuNuocNgot);
        danhSachLoaiMenu.add(menuSnack);

        LayDuLieu layDuLieu = new LayDuLieu();
        layDuLieu.docTatCaMenu(danhSachLoaiMenu);

        menuchinh.themLoaiMenu(menuTra);
        menuchinh.themLoaiMenu(menuCoffee);
        menuchinh.themLoaiMenu(menuSinhTo);
        menuchinh.themLoaiMenu(menuNuocNgot);
        menuchinh.themLoaiMenu(menuSnack);
        
        //Tai khoan nhan vien + quan ly nhan vien
        double luong = 5000.0;
        Admin admin = new Admin("admin", "123admin123", "192.168.1.1", TrangThaiTK.Offline);
        QuanLy quanLy = new QuanLy("QL001", admin, "Nguyễn Văn A", "nguyenvana@gmail.com", "0987654321", 10000, admin);
        TaiKhoanNhanVien nhanVien = new TaiKhoanNhanVien("mod1", "pass123", "123 Main St", TrangThaiTK.Offline);
        NhanVienOrder leTan = new NhanVienOrder("1", nhanVien, "Nguyễn Văn Chiến", "Chienmauchien12@gmail.com", "123456789", 50000.0);
        NhanVienPhaChe bartender = new NhanVienPhaChe("1", nhanVien, "Nguyễn Hữu Hưng", "Hungchicken12@gmail.com", "123456789", 30000.0);
        Guest khach = new Guest("vuong2005", "hellokitty", "Ha Dong", TrangThaiTK.Offline);
        KhachHang khachHang = new KhachHang("Nguyễn Văn B", "nguyenvanb@gmail.com", "0987654322", "Thường", khach);

        // Dang nhap tai khoan
        boolean isLoggedIn = false;
        while (!isLoggedIn) {
            System.out.print("Nhập tài khoản: ");
            String id = sc.nextLine();
            System.out.print("Nhập mật khẩu: ");
            String pass = sc.nextLine();
            if (admin.dangNhap(id, pass)) {
                isLoggedIn = true;
                admin.setTrangThai(TrangThaiTK.Online);
                int choice;
                do {
                    System.out.println("----- Quản lý quán BlackPink Coffee -----");
                    System.out.println("1. Quản lý chi nhánh");
                    System.out.println("2. Quản lý menu");
                    System.out.println("3. Quản lý bàn");
                    System.out.println("4. Hiển thị doanh thu");
                    System.out.println("5. Reset doanh thu");
                    System.out.println("0. Thoát");
                    System.out.print("Chọn chức năng: ");
                    choice = Integer.parseInt(sc.nextLine());

                    switch (choice) {
                        case 1:
                            qlcn.quanLyChiNhanh(sc, BlackPink);
                            break;
                        case 2:
                            qlmenu.quanLyMenu(sc, menuchinh);
                            break;
                        case 3:
                            qlb.quanLyBan(sc, ChiNhanhChinh);
                            break;
                        case 4:
                            doanhThu.hienThiDoanhThu();
                            break;
                        case 5:
                            doanhThu.resetDoanhThu();
                            break;
                        case 0:
                            admin.setTrangThai(TrangThaiTK.Offline);
                            System.out.println("Thoát chương trình quản lý.");
                            break;
                        default:
                            System.out.println("Chức năng không hợp lệ, vui lòng chọn lại.");
                    }
                } while (choice != 0);
            }
            else if (nhanVien.dangNhap(id, pass)) {
                isLoggedIn = true;
                nhanVien.setTrangThai(TrangThaiTK.Online);
                int choice;
                    do {
                        System.out.println("----- Quản lý quán BlackPink Coffee -----");
                        System.out.println("1. Quản lý menu");
                        System.out.println("2. Quản lý bàn");
                        System.out.println("3. Nhận order");
                        System.out.println("0. Thoát");
                        System.out.print("Chọn chức năng: ");
                        choice = Integer.parseInt(sc.nextLine());

                        switch (choice) {
                            case 1:
                                qlmenu.quanLyMenu(sc, menuchinh);
                                break;
                            case 2:
                                qlb.quanLyBan(sc, ChiNhanhChinh);
                                break;
                            case 3:
                                // muốn sửa tạoorder thành nhận order
                                order.taoOrderMoi(sc, leTan, menuchinh);
                                break;
                            case 0:
                                nhanVien.setTrangThai(TrangThaiTK.Offline);
                                System.out.println("Thoát chương trình quản lý.");
                                break;
                            default:
                                System.out.println("Chức năng không hợp lệ, vui lòng chọn lại.");
                        }
                    } while (choice != 0);
            }
            else if (khachHang.dangNhap(id, pass)) {
                isLoggedIn = true;
                int choice;
                    do {
                        System.out.println("----- Chào mừng đến quán BlackPink Coffee -----");
                        System.out.println("1. Gọi order");
                        System.out.println("2. Gọi nhân viên");
                        System.out.println("0. Thoát");
                        System.out.print("Chọn chức năng: ");
                        choice = Integer.parseInt(sc.nextLine());

                        switch (choice) {
                            case 1:
                                order.taoOrderMoi(sc, leTan, menuchinh);
                                break;
                            case 2:
                                break;
                            case 0:
                                khachHang.setTrangThai(TrangThaiTK.Online);
                                System.out.println("Thoát chương trình.");
                                break;
                            default:
                                System.out.println("Chức năng không hợp lệ, vui lòng chọn lại.");
                        }
                    } while (choice != 0);
            }
            else {
                System.out.println("Thông tin đăng nhập không chính xác. Vui lòng thử lại.");
            }
        }
        sc.close();
    }
}