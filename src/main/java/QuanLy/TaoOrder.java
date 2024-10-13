package QuanLy;

import cacloaihoadon.Order;
import cacloaihoadon.DoanhThu;
import nguoi.NhanVienOrder;
import menu.Menu;
import menu.DanhSachNuoc;
import java.util.Scanner;

public class TaoOrder {
    private DoanhThu doanhThu;

    public TaoOrder(DoanhThu doanhThu) {
        this.doanhThu = doanhThu;
    }

    public void taoOrderMoi(Scanner sc, NhanVienOrder leTan, Menu menu) {
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
                doanhThu.capNhatDoanhThu(order.tinhTongTien()); // Cập nhật doanh thu
                break;
            }
            else{
                System.out.println("Vui lòng chọn lại");
            }
        }
    }
}
