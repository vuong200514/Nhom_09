import taikhoan.TaiKhoan;
import TrangThai.TrangThaiTK;
import menu.Menu;
import menu.DanhSachNuoc;
import menu.LoaiMenu;
import order.Order;
import nhanvien.NhanVienOrder;
import QuanNuoc.ChiNhanh;
import QuanNuoc.BlackPink_Coffe;
import ChoNgoi.Ban;
import TrangThai.TrangThaiBan;
import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
        Scanner sc = new Scanner(System.in);
        //Tao Thuong hieu
        BlackPink_Coffe BlackPink = new BlackPink_Coffe("My BlackPink");
        //Tao chi nhanh chinh
        ChiNhanh ChiNhanhChinh = new ChiNhanh("Đại Học Phenikaa", "Hà Đông");
        BlackPink.themChiNhanh(ChiNhanhChinh);
        
        
        // Menu Quản lí Chi 
        int chon=0;
        switch (chon){
            case 1:{
                System.out.println("Thêm Chi Nhánh");
                String ten,diachi;
                ten = sc.nextLine();
                diachi = sc.nextLine();
                ChiNhanh chinhanh = new ChiNhanh(ten,diachi);
                BlackPink.themChiNhanh(chinhanh);
                break;
            }
            case 2:{
                System.out.println("Nhập tên chi nhánh cần xóa");
                String ten;
                ten = sc.nextLine();
                for (ChiNhanh cn : BlackPink.getDsChiNhanh()){
                    if(cn.getTenCN().equals(ten)){
                        BlackPink.getDsChiNhanh().remove(cn);
                    }
                }
                break;
            }
            default:{
                System.out.println("Nhập sai vui lòng chọn lại");
            }
        }

        
        // Sua tiep tu day
        // Tao menu
        Menu menu = new Menu("1", "Main Menu", "The main menu for the restaurant");

        // Them nuoc vao menu
        DanhSachNuoc burger = new DanhSachNuoc("1", "Burger", "Delicious beef burger", 10.99);
        DanhSachNuoc pizza = new DanhSachNuoc("2", "Pizza", "Cheesy pizza with toppings", 8.99);
        DanhSachNuoc salad = new DanhSachNuoc("3", "Salad", "Fresh garden salad", 5.99);

        // Tao menu va Loai menu
        LoaiMenu section = new LoaiMenu("1", "Main Dishes", "Our main dishes");
        section.themNuoc(burger);
        section.themNuoc(pizza);
        section.themNuoc(salad);
        menu.themLoaiMenu(section);

        // In Menu
        menu.inMenu();

        // Tao Ban
        Ban table1 = new Ban("T1", 4, TrangThaiBan.ConBan);
        ChiNhanhChinh.themBan(table1);

        // Tao Tai Khoan
        TaiKhoan account = new TaiKhoan("user1", "pass123", "123 Main St", TrangThaiTK.HoatDong);
        
        // Them Le Tan
        NhanVienOrder leTan = new NhanVienOrder("1", account, "Alice", "alice@example.com", "123456789");

        // Tao Order
        Order order = new Order("O1");
        order.goiMon(burger);
        order.goiMon(pizza);
        
        // InOrder
        order.printOrder();
        
        sc.close();
    }
}
