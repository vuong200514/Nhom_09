package cacloaihoadon;

import java.util.ArrayList;
import java.util.List;

public class DoanhThu {
    private List<Order> dsOrder;

    public DoanhThu() {
        this.dsOrder = new ArrayList<>();
    }

    public void themOrder(Order order) {
        dsOrder.add(order);
    }

    public double tinhDoanhThu() {
        double tongDoanhThu = 0.0;
        for (Order order : dsOrder) {
            tongDoanhThu += order.tinhTongTien();
        }
        return tongDoanhThu;
    }

    public void hienThiDoanhThu() {
        double tongDoanhThu = tinhDoanhThu();
        System.out.println("Tổng doanh thu: " + tongDoanhThu + " VNĐ");
    }
}
