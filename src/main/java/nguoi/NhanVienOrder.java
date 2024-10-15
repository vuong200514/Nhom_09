package nguoi;

import cacloaihoadon.Order;
import menu.DanhSachNuoc;
import java.util.List;
import taikhoan.*;

public class NhanVienOrder extends NhanVien {
    private TaiKhoanNhanVien taiKhoanNhanVien;

    public NhanVienOrder(String maNV, String tenNV, String email, String SDT, TaiKhoanNhanVien taiKhoan) {
        super(maNV, tenNV, email, SDT);
        this.taiKhoanNhanVien = taiKhoan;
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
