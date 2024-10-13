package cacloaihoadon;

import menu.DanhSachNuoc;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private String orderId;
    private List<DanhSachNuoc> dsOrder;

    public Order(String id) {
        this.orderId = id;
        this.dsOrder = new ArrayList<>();
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public List<DanhSachNuoc> getDsOrder() {
        return dsOrder;
    }

    public void setDsOrder(List<DanhSachNuoc> dsOrder) {
        this.dsOrder = dsOrder;
    }

    public void goiMon(DanhSachNuoc nuoc) {
        dsOrder.add(nuoc);
    }

    public double tinhTongTien() {
        double tongTien = 0.0;
        for (DanhSachNuoc nuoc : dsOrder) {
            tongTien += nuoc.getGiatien();
        }
        return tongTien;
    }

    public void printOrder() {
        System.out.println("Order ID: " + orderId);
        for (DanhSachNuoc nuoc : dsOrder) {
            System.out.println("- " + nuoc.getTenNuoc() + ": $" + nuoc.getGiatien());
        }
        System.out.println("Tổng tiền: $" + tinhTongTien());
    }
    
    
}
