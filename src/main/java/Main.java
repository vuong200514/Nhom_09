import QuanLy.*;
import taikhoan.*;
import TrangThai.*;
import menu.*;
import nguoi.*;
import QuanNuoc.*;
import java.io.*;
import java.util.*;
import QuanLy.DoanhThu;
import ChoNgoi.*;
import Swing.*;

public class Main {
    public static void main(String[] args) throws UnsupportedEncodingException, InterruptedException {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
        Scanner sc = new Scanner(System.in);
        DoanhThu doanhThu = new DoanhThu();
        QuanLyChiNhanh qlcn = new QuanLyChiNhanh();
        QuanLyMenu qlmenu = new QuanLyMenu();
        QuanLyNhanSu qlns = new QuanLyNhanSu();
        QuanLyBan qlb = new QuanLyBan();
        TaoOrder order = new TaoOrder(doanhThu);
        LayDuLieu layDuLieu = new LayDuLieu();
        DangKi dangKi = new DangKi();
        dangKi.setVisible(true);
        while (dangKi.isVisible()) {
            Thread.sleep(1000);
        }

        // Tao Quan cafe + chi nhanh chinh
        BlackPink_Coffe BlackPink = new BlackPink_Coffe("My BlackPink");
        ChiNhanh ChiNhanhChinh = new ChiNhanh("Đại Học Phenikaa", "Hà Đông");
        BlackPink.themChiNhanh(ChiNhanhChinh);
        
        List<NhanVien> danhSachNhanVien = new ArrayList<>();
        List<NhanVienOrder> danhSachNhanVienOrder = new ArrayList<>();
        List<NhanVienPhaChe> danhSachNhanVienPhaChe = new ArrayList<>();
        List<LoaiMenu> danhSachLoaiMenu = new ArrayList<>();
        
        // Tao menu cac loai nuoc
        Menu menuchinh = new Menu("1", "Menu Chính", "Menu các loại nước");
        layDuLieu.docLoaiMenu("menu.txt", danhSachLoaiMenu);
        layDuLieu.docTatCaMenu(danhSachLoaiMenu);
        for(LoaiMenu menu : danhSachLoaiMenu){
            menuchinh.themLoaiMenu(menu);
        }
        
        //Tai khoan nhan vien + quan ly nhan vien + cai nay co 1 nen khoi tao = main
        Admin admin = new Admin("admin", "1");
        QuanLy quanLy = new QuanLy("Owner","Đào Mạnh Vương", "vuong200514@gmail.com", "0987654321",admin);
        TaiKhoanNhanVien taiKhoanNhanVien = new TaiKhoanNhanVien("mod1", "pass123");
        
        //Danh sach nhan vien
        
        layDuLieu.docNhanVienOrder("nhanVienOrder.txt", danhSachNhanVienOrder, taiKhoanNhanVien);
        layDuLieu.docNhanVienPhaChe("nhanVienPhaChe.txt", danhSachNhanVienPhaChe, taiKhoanNhanVien);

        for(NhanVienOrder nvod : danhSachNhanVienOrder){
            danhSachNhanVien.add(nvod);
        }
        for(NhanVienPhaChe nvpc : danhSachNhanVienPhaChe){
            danhSachNhanVien.add(nvpc);
        }
        quanLy.setDanhSachNhanVien(danhSachNhanVien);
        
        Guest khach = new Guest("vuong2005", "1");
        KhachHang khach1 = new KhachHang("NguyenHuuHung", "Nguyễn Hữu Hưng", "hhh@gmail.com", "098765432",khach);
        Guest guest = new Guest(dangKi.getTaiKhoan(), dangKi.getMatKhau());
        System.out.println("Tai khoan da nhap o Swing: "+dangKi.getTaiKhoan());

        //Dang ki tai khoan
        
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
                    System.out.println("6. Quản lý nhân sự");
                    System.out.println("0. Thoát");
                    System.out.print("Chọn chức năng: ");
                    choice = sc.nextInt();

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
                        case 6:
                           qlns.quanLyNhanSu(sc, quanLy, danhSachNhanVien);
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
            else if (taiKhoanNhanVien.dangNhap(id, pass)) {
                isLoggedIn = true;
                taiKhoanNhanVien.setTrangThai(TrangThaiTK.Online);
                int choice;
                    do {
                        System.out.println("----- Quản lý cho nhân viên BlackPink Coffee -----");
                        System.out.println("1. Quản lý menu");
                        System.out.println("2. Quản lý bàn");
                        System.out.println("3. Nhận order");
                        System.out.println("4. Nhận lương");
                        System.out.println("0. Thoát");
                        System.out.print("Chọn chức năng: ");
                        choice = sc.nextInt();

                        switch (choice) {
                            case 1:
                                qlmenu.quanLyMenu(sc, menuchinh);
                                break;
                            case 2:
                                qlb.quanLyBan(sc, ChiNhanhChinh);
                                break;
                            case 3:
                                order.taoOrderMoi(sc, menuchinh);
                                break;
                            case 4:
                                for (NhanVien nv : danhSachNhanVien) {
                                    nv.linhLuong();
                                }
                                break;
                            case 0:
                                taiKhoanNhanVien.setTrangThai(TrangThaiTK.Offline);
                                System.out.println("Thoát chương trình quản lý.");
                                break;
                            default:
                                System.out.println("Chức năng không hợp lệ, vui lòng chọn lại.");
                        }
                    } while (choice != 0);
            }
            else if (guest.dangNhap(id, pass)) {
                isLoggedIn = true;
                int choice;
                    do {
                        System.out.println("----- Chào mừng đến quán BlackPink Coffee -----");
                        System.out.println("1. Gọi order");
                        System.out.println("2. Gọi nhân viên Order");
                        System.out.println("3. Gọi nhân viên Pha Chế");
                        System.out.println("4. Đặt bàn");
                        System.out.println("5. Trả bàn");
                        System.out.println("0. Thoát");
                        System.out.print("Chọn chức năng: ");
                        choice = sc.nextInt();

                        switch (choice) {
                            case 1:
                                khach1.goiOrder(sc, danhSachNhanVienOrder, menuchinh);
                                break;
                            case 2:
                                khach1.goiNhanVienOrder(sc, danhSachNhanVienOrder);
                                break;
                            case 3:
                                khach1.goiNhanVienPhaChe(sc, danhSachNhanVienPhaChe);
                                break;
                            case 4:
                                int check=0;
                                System.out.println("Nhập số chỗ");
                                int soCho = sc.nextInt();
                                ChiNhanhChinh.dsBan();
                                System.out.println("Nhập mã bàn muốn chọn");
                                String maBan = sc.nextLine();
                                for (Ban ban : ChiNhanhChinh.getDanhSachBan()){
                                    if (ban.getMaBan().equals(maBan)){
                                        khach1.datBan(soCho, ban);
                                        check = 1;
                                        break;
                                    }
                                }
                                if (check==0) {
                                    System.out.println("Không tìm thấy bàn");
                                }
                                break;
                            case 5:
                                check=0;
                                ChiNhanhChinh.dsBan();
                                System.out.println("Nhập mã bàn muốn chọn");
                                maBan = sc.nextLine();
                                for (Ban ban : ChiNhanhChinh.getDanhSachBan()){
                                    if (ban.getMaBan().equals(maBan)){
                                        khach1.traBan(ban);
                                        check = 1;
                                        break;
                                    }
                                }
                                if (check==0) {
                                    System.out.println("Không tìm thấy bàn");
                                }
                                break;
                            case 0:
                                khach1.getTaiKhoan().setTrangThai(TrangThaiTK.Online);
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