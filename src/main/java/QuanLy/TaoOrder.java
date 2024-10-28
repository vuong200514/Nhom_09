package QuanLy;

import cacloaihoadon.Order;
import QuanLy.DoanhThu;
import java.util.*;
import nguoi.NhanVienOrder;
import menu.Menu;
import menu.DanhSachNuoc;
import java.util.Scanner;
import menu.*;

public class TaoOrder {
    private DoanhThu doanhThu;

    public TaoOrder(DoanhThu doanhThu) {
        this.doanhThu = doanhThu;
    }

    public void taoOrderMoi(Scanner sc, Menu menu) {
        System.out.println("----- Tạo Order mới -----");
        while(true){
            System.out.println("Nhập ID order: ");
            sc.nextLine();
            String orderId = sc.nextLine();
            menu.inMenu();
            System.out.println("Bạn có muốn lọc danh sách? (1. YES || 2. NO)");
            int timkiem = sc.nextInt();
            if(timkiem==1){
                System.out.println("Danh sách menu sau khi sắp xếp:");
                menu.inMenuLoc();
            }
            Order order = new Order(orderId);
            System.out.println("Nhập số món muốn gọi: ");
            int soMon;

            while (true) {
                try {
                    soMon = Integer.parseInt(sc.nextLine());
                    if (soMon > 0) 
                        break;
                    else 
                        System.out.println("Vui lòng nhập số lớn hơn 0.");
                } catch (NumberFormatException e) {
                    System.out.println("Vui lòng nhập số hợp lệ.");
                }
            }

            List<DanhSachNuoc> allDrinks = new ArrayList<>();
            for (LoaiMenu loai : menu.getLoaimenu()) {
                allDrinks.addAll(loai.getNuoc());
            }

            for (int i = 0; i < soMon; i++) {
                while(true){
                    System.out.println("Nhập tên món: ");
                    String tenMon = sc.nextLine();
                    boolean found = false;

                    for (DanhSachNuoc nuoc : allDrinks) {
                        if (nuoc.getTenNuoc().equals(tenMon)){
                            order.goiMon(nuoc);
                            found = true;
                        }
                    }
                    if (found==true){
                        break;
                    }
                    else {
                        System.out.println("Nhập sai tên món nhập lại");
                    }
                }
            }

            order.printOrder();
            System.out.println("Xác nhận order? yes/no");
            String xacnhan = sc.nextLine();
            if(xacnhan.equals("yes")){
                doanhThu.capNhatDoanhThu(order.tinhTongTien());
                System.out.println("Đã xác nhận đơn hàng vui lòng đợi trong giây lát");
                break;
            }
            else{
                System.out.println("Vui lòng chọn lại");
            }
        }
    }
}
