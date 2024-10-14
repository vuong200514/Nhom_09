package nguoi;

import cacloaihoadon.Order;
import menu.DanhSachNuoc;
import java.util.List;
import taikhoan.TaiKhoan;

public class NhanVienOrder extends NhanVien {

    public NhanVienOrder(String maNV, TaiKhoan TK, String tenNV, String email, String SDT) {
        super(maNV, TK, tenNV, email, SDT);
    }
    

    public Order taoOrder(String orderId, List<DanhSachNuoc> dsNuoc) {
        Order order = new Order(orderId);
        for (DanhSachNuoc nuoc : dsNuoc) {
            order.goiMon(nuoc);
        }
        System.out.println("Order đã được tạo bởi nhân viên: " + this.getTen());
        return order;
    }
}
