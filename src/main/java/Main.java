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
        BlackPink_Coffe BlackPink = new BlackPink_Coffe("My BlackPink");
        ChiNhanh ChiNhanhChinh = new ChiNhanh("Đại Học Phenikaa", "Hà Đông");
        BlackPink.themChiNhanh(ChiNhanhChinh);
        
        Menu menuchinh = new Menu("1", "Menu Chính", "Menu các loại nước");

        DanhSachNuoc tra1 = new DanhSachNuoc("1", "Trà Đen", "Trà đen thơm ngon", 15.000);
        DanhSachNuoc tra2 = new DanhSachNuoc("2", "Trà Sữa Hành", "Vị hành lá thơm ngon", 50.000);
        DanhSachNuoc tra3 = new DanhSachNuoc("3", "Trà Chanh", "Trà chanh tươi mát", 20.000);
        DanhSachNuoc tra4 = new DanhSachNuoc("4", "Trà sữa đen đá", " Vị ngọt từ sữa vị đắng từ cà phê nguyên chất", 30.000);
        DanhSachNuoc tra5 = new DanhSachNuoc("5", "Trà Sữa  Vịt Lộn", "Hương thơm của trà vị béo của trứng vịt lộn", 45.000);
        
        LoaiMenu menuTra = new LoaiMenu("1", "Trà", "Các loại trà ngon");
        menuTra.themNuoc(tra1);
        menuTra.themNuoc(tra2);
        menuTra.themNuoc(tra3);
        menuTra.themNuoc(tra4);
        menuTra.themNuoc(tra5);
        menuchinh.themLoaiMenu(menuTra);

        DanhSachNuoc coffee1 = new DanhSachNuoc("1", "Cà Phê Đen", "Cà phê đen nguyên chất", 20.000);
        DanhSachNuoc coffee2 = new DanhSachNuoc("2", "Cà Phê Sữa", "Cà phê sữa thơm ngậy", 25.000);
        DanhSachNuoc coffee3 = new DanhSachNuoc("3", "Cà Phê Mocha", "Cà phê mocha ngọt ngào", 30.000);
        DanhSachNuoc coffee4 = new DanhSachNuoc("4", "Cà Phê Trứng", "Cà phê trứng béo ngậy", 35.000);
        DanhSachNuoc coffee5 = new DanhSachNuoc("5", "Cà Phê Nóng", "Cà phê nóng ấm lòng", 18.000);

        LoaiMenu menuCoffee = new LoaiMenu("2", "Cà phê", "Các loại cà phê thơm ngon");
        menuCoffee.themNuoc(coffee1);
        menuCoffee.themNuoc(coffee2);
        menuCoffee.themNuoc(coffee3);
        menuCoffee.themNuoc(coffee4);
        menuCoffee.themNuoc(coffee5);
        menuchinh.themLoaiMenu(menuCoffee);

        DanhSachNuoc sinhTo1 = new DanhSachNuoc("1", "Sinh Tố Bơ", "Sinh tố bơ mịn màng", 30.000);
        DanhSachNuoc sinhTo2 = new DanhSachNuoc("2", "Sinh Tố Dâu", "Sinh tố dâu ngọt ngào", 28.000);
        DanhSachNuoc sinhTo3 = new DanhSachNuoc("3", "Sinh Tố Xoài", "Sinh tố xoài thơm ngon", 32.000);
        DanhSachNuoc sinhTo4 = new DanhSachNuoc("4", "Sinh Tố Đu Đủ", "Sinh tố đu đủ tươi", 25.000);
        DanhSachNuoc sinhTo5 = new DanhSachNuoc("5", "Trái Cây Tươi", "Đĩa trái cây tươi mát", 35.000);

        LoaiMenu menuSinhTo = new LoaiMenu("3", "Sinh Tố và Trái Cây", "Các loại sinh tố và trái cây");
        menuSinhTo.themNuoc(sinhTo1);
        menuSinhTo.themNuoc(sinhTo2);
        menuSinhTo.themNuoc(sinhTo3);
        menuSinhTo.themNuoc(sinhTo4);
        menuSinhTo.themNuoc(sinhTo5);
        menuchinh.themLoaiMenu(menuSinhTo);

        DanhSachNuoc nuocNgot1 = new DanhSachNuoc("1", "Coca Cola", "Nước ngọt Coca Cola", 15.00);
        DanhSachNuoc nuocNgot2 = new DanhSachNuoc("2", "Pepsi", "Nước ngọt Pepsi", 15.00);
        DanhSachNuoc nuocNgot3 = new DanhSachNuoc("3", "7Up", "Nước ngọt 7Up", 15.00);
        DanhSachNuoc nuocNgot4 = new DanhSachNuoc("4", "Mirinda", "Nước ngọt Mirinda", 15.00);
        DanhSachNuoc nuocNgot5 = new DanhSachNuoc("5", "Fanta", "Nước ngọt Fanta", 15.00);

        LoaiMenu menuNuocNgot = new LoaiMenu("4", "Nước Ngọt Đóng Chai", "Các loại nước ngọt đóng chai");
        menuNuocNgot.themNuoc(nuocNgot1);
        menuNuocNgot.themNuoc(nuocNgot2);
        menuNuocNgot.themNuoc(nuocNgot3);
        menuNuocNgot.themNuoc(nuocNgot4);
        menuNuocNgot.themNuoc(nuocNgot5);
        menuchinh.themLoaiMenu(menuNuocNgot);

        DanhSachNuoc snack1 = new DanhSachNuoc("1", "Hạt Hướng Dương", "Hạt hướng dương thơm ngon", 20.00);
        DanhSachNuoc snack2 = new DanhSachNuoc("2", "Bim Bim", "Bim bim giòn tan", 15.00);
        DanhSachNuoc snack3 = new DanhSachNuoc("3", "Khô Bò", "Khô bò cay ngon", 40.00);
        DanhSachNuoc snack4 = new DanhSachNuoc("4", "Khô Gà", "Khô gà xé cay", 35.00);
        DanhSachNuoc snack5 = new DanhSachNuoc("5", "Nem Lụi", "Nem lụi thơm ngon", 30.00);

        LoaiMenu menuSnack = new LoaiMenu("5", "Đồ Ăn Vặt", "Các loại đồ ăn vặt");
        menuSnack.themNuoc(snack1);
        menuSnack.themNuoc(snack2);
        menuSnack.themNuoc(snack3);
        menuSnack.themNuoc(snack4);
        menuSnack.themNuoc(snack5);
        menuchinh.themLoaiMenu(menuSnack);
        double luong = 5000.0;
        
        Admin admin = new Admin("admin", "123admin123", "192.168.1.1", TrangThaiTK.Offline);
        QuanLy quanLy = new QuanLy("QL001", admin, "Nguyễn Văn A", "nguyenvana@gmail.com", "0987654321", 10000, admin);
        TaiKhoanNhanVien nhanVien = new TaiKhoanNhanVien("mod1", "pass123", "123 Main St", TrangThaiTK.Offline);
        NhanVienOrder leTan = new NhanVienOrder("1", nhanVien, "Nguyễn Văn Chiến", "Chienmauchien12@gmail.com", "123456789", 50000.0);
        NhanVienPhaChe bartender = new NhanVienPhaChe("1", nhanVien, "Nguyễn Hữu Hưng", "Hungchicken12@gmail.com", "123456789", 30000.0);
        Guest khach = new Guest("vuong2005", "hellokitty", "Ha Dong", TrangThaiTK.Offline);
        KhachHang khachHang = new KhachHang("Nguyễn Văn B", "nguyenvanb@gmail.com", "0987654322", "Thường", khach);

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
