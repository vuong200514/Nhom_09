import taikhoan.TaiKhoan;
import TrangThai.TrangThaiTK;
import menu.Menu;
import menu.DanhSachNuoc;
import menu.LoaiMenu;
import cacloaihoadon.*;
import nguoi.NhanVienOrder;
import QuanNuoc.ChiNhanh;
import QuanNuoc.BlackPink_Coffe;
import ChoNgoi.Ban;
import TrangThai.TrangThaiBan;
import java.io.*;
import java.util.Scanner;
import cacloaihoadon.Order;
import taikhoan.TaiKhoanNhanVien;

public class Main {
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
        Scanner sc = new Scanner(System.in);
        DoanhThu doanhThu = new DoanhThu();
        BlackPink_Coffe BlackPink = new BlackPink_Coffe("My BlackPink");
        ChiNhanh ChiNhanhChinh = new ChiNhanh("Đại Học Phenikaa", "Hà Đông");
        BlackPink.themChiNhanh(ChiNhanhChinh);
        
        Menu menuchinh = new Menu("1", "Menu Chính", "Menu các loại nước");
        Menu menuphu = new Menu("2", "Menu Phụ", "Menu các loại đồ ăn");

        DanhSachNuoc tra1 = new DanhSachNuoc("1", "Trà Đen", "Trà đen thơm ngon", 15.00);
        DanhSachNuoc tra2 = new DanhSachNuoc("2", "Trà Sữa", "Trà sữa béo ngậy", 25.00);
        DanhSachNuoc tra3 = new DanhSachNuoc("3", "Trà Chanh", "Trà chanh tươi mát", 20.00);
        DanhSachNuoc tra4 = new DanhSachNuoc("4", "Trà Hoa Cúc", "Trà hoa cúc thanh nhẹ", 18.00);
        DanhSachNuoc tra5 = new DanhSachNuoc("5", "Trà Xanh", "Trà xanh thanh mát", 22.00);

        LoaiMenu menuTra = new LoaiMenu("1", "Trà", "Các loại trà ngon");
        menuTra.themNuoc(tra1);
        menuTra.themNuoc(tra2);
        menuTra.themNuoc(tra3);
        menuTra.themNuoc(tra4);
        menuTra.themNuoc(tra5);
        menuchinh.themLoaiMenu(menuTra);

        DanhSachNuoc coffee1 = new DanhSachNuoc("1", "Cà Phê Đen", "Cà phê đen nguyên chất", 20.00);
        DanhSachNuoc coffee2 = new DanhSachNuoc("2", "Cà Phê Sữa", "Cà phê sữa thơm ngậy", 25.00);
        DanhSachNuoc coffee3 = new DanhSachNuoc("3", "Cà Phê Mocha", "Cà phê mocha ngọt ngào", 30.00);
        DanhSachNuoc coffee4 = new DanhSachNuoc("4", "Cà Phê Trứng", "Cà phê trứng béo ngậy", 35.00);
        DanhSachNuoc coffee5 = new DanhSachNuoc("5", "Cà Phê Nóng", "Cà phê nóng ấm lòng", 18.00);

        LoaiMenu menuCoffee = new LoaiMenu("2", "Cà phê", "Các loại cà phê thơm ngon");
        menuCoffee.themNuoc(coffee1);
        menuCoffee.themNuoc(coffee2);
        menuCoffee.themNuoc(coffee3);
        menuCoffee.themNuoc(coffee4);
        menuCoffee.themNuoc(coffee5);
        menuchinh.themLoaiMenu(menuCoffee);

        DanhSachNuoc sinhTo1 = new DanhSachNuoc("1", "Sinh Tố Bơ", "Sinh tố bơ mịn màng", 30.00);
        DanhSachNuoc sinhTo2 = new DanhSachNuoc("2", "Sinh Tố Dâu", "Sinh tố dâu ngọt ngào", 28.00);
        DanhSachNuoc sinhTo3 = new DanhSachNuoc("3", "Sinh Tố Xoài", "Sinh tố xoài thơm ngon", 32.00);
        DanhSachNuoc sinhTo4 = new DanhSachNuoc("4", "Sinh Tố Đu Đủ", "Sinh tố đu đủ tươi", 25.00);
        DanhSachNuoc sinhTo5 = new DanhSachNuoc("5", "Trái Cây Tươi", "Đĩa trái cây tươi mát", 35.00);

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
        menuphu.themLoaiMenu(menuNuocNgot);

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
        menuphu.themLoaiMenu(menuSnack);

        TaiKhoanNhanVien account = new TaiKhoanNhanVien("user1", "pass123", "123 Main St", TrangThaiTK.Online);
        double luong = 5000.0;
        NhanVienOrder leTan = new NhanVienOrder("1", account, "Alice", "alice@example.com", "123456789", luong);

        int choice;
        do {
            System.out.println("----- Quản lý quán BlackPink Coffee -----");
            System.out.println("1. Quản lý chi nhánh");
            System.out.println("2. Quản lý menu");
            System.out.println("3. Quản lý bàn");
            System.out.println("4. Tạo order mới");
            System.out.println("5. Hiển thị doanh thu");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    quanLyChiNhanh(sc, BlackPink);
                    break;
                case 2:
                    System.out.println("Chọn loại menu muốn sửa:\nChọn 1: menu nước\nChọn 2: menu đồ ");
                    int chon;
                    chon = Integer.parseInt(sc.nextLine());
                    if (chon == 1){
                        System.out.println("Sửa menu nước");
                        quanLyMenu(sc, menuchinh);
                    }
                    else if (chon == 2){
                        System.out.println("Sửa menu đồ ăn vặt");
                        quanLyMenu(sc, menuphu);
                    }
                    else {
                        System.out.println("Thế cũng sai nghỉ việc đi em");
                    }
                    break;
                case 3:
                    quanLyBan(sc, ChiNhanhChinh);
                    break;
                case 4:
                    taoOrderMoi(sc, leTan, menuchinh);
                    break;
                case 5:
                    doanhThu.hienThiDoanhThu();
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

    public static void quanLyMenu(Scanner sc, Menu menu) {
        System.out.println("----- Quản lý Menu -----");
        System.out.println("1. Thêm món mới");
        System.out.println("2. Xóa món");
        System.out.println("3. Hiện thị menu");
        System.out.print("Chọn chức năng: ");
        int chon = Integer.parseInt(sc.nextLine());

        switch (chon) {
            case 1:
                System.out.println("Nhập loại nước\n1.menuTra\n2.menuCoffe\n3.menuSinhTo");
                String loaimenumoi;
                loaimenumoi = sc.nextLine();
                System.out.println("Nhập tên món: ");
                String ten = sc.nextLine();
                System.out.println("Nhập mô tả: ");
                String moTa = sc.nextLine();
                System.out.println("Nhập giá: ");
                double gia = Double.parseDouble(sc.nextLine());
                DanhSachNuoc nuocMoi = new DanhSachNuoc("4", ten, moTa, gia);
                switch (loaimenumoi){
                    case "menuTra":
                        menu.getLoaimenu().get(0).themNuoc(nuocMoi);
                        break;
                    case "menuCoffe":
                        menu.getLoaimenu().get(1).themNuoc(nuocMoi);
                        break;
                    case "menuSinhTo":
                        menu.getLoaimenu().get(2).themNuoc(nuocMoi);
                        break;
                    default:
                        throw new AssertionError();
                }
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
            case 3:
                System.out.println("Menu của quán");
                menu.inMenu();
                break;
            default:
                System.out.println("Chức năng không hợp lệ.");
        }
    }

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

    public static void taoOrderMoi(Scanner sc, NhanVienOrder leTan, Menu menu) {
        System.out.println("----- Tạo Order mới -----");
        while(true){
            System.out.println("Nhập ID order: ");
            String orderId = sc.nextLine();
            menu.inMenu();
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
                for (DanhSachNuoc nuoc : menu.getLoaimenu().get(1).getNuoc()) {
                    if (nuoc.getTenNuoc().equals(tenMon)) {
                        order.goiMon(nuoc);
                    }
                }
                for (DanhSachNuoc nuoc : menu.getLoaimenu().get(2).getNuoc()) {
                    if (nuoc.getTenNuoc().equals(tenMon)) {
                        order.goiMon(nuoc);
                    }
                }
            }
            order.printOrder();
            System.out.println("Xác nhận order? yes/no");
            String xacnhan = sc.nextLine();
            if(xacnhan.equals("yes")){
                break;
            }
            else{
                System.out.println("Vui lòng chọn lại");
            }
            
        }
    }

}
