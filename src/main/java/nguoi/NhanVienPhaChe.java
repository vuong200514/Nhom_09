package nguoi;

import cacloaihoadon.Order;
import java.time.LocalTime;
import taikhoan.*;

// Ý tưởng 1 cơ sở sẽ có nhiều quản lí mỗi quản lí sẽ quản lí 1 danh sách nhân viên nên chia thành phache/order

public class NhanVienPhaChe extends NhanVien {
    private TaiKhoanNhanVien taiKhoanNhanVien;
    
    public NhanVienPhaChe(String maNV, String TenNV, String email, String SDT, TaiKhoanNhanVien taiKhoan) {
        super(maNV, TenNV, email, SDT);
        this.taiKhoanNhanVien = taiKhoan;
    }

    public void nhanOrder(Order order) {
        LocalTime thoiGianBatDau = LocalTime.now();
        System.out.println("Order " + order.getOrderId() + " đã được nhận bởi nhân viên pha chế: " + this.getTen());
        System.out.println("Thời gian bắt đầu thực hiện: " + thoiGianBatDau);

        System.out.println("Thực hiện xong order " + order.getOrderId());
    }
}
