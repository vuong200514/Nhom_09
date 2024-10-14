package nguoi;

import cacloaihoadon.Order;
import java.time.LocalTime;
import taikhoan.TaiKhoan;

public class NhanVienPhaChe extends NhanVien {
    public NhanVienPhaChe(String maNV, TaiKhoan TKNV, String TenNV, String email, String SDT) {
        super(maNV, TKNV, TenNV, email, SDT);
    }

    public void nhanOrder(Order order) {
        LocalTime thoiGianBatDau = LocalTime.now();
        System.out.println("Order " + order.getOrderId() + " đã được nhận bởi nhân viên pha chế: " + this.getTen());
        System.out.println("Thời gian bắt đầu thực hiện: " + thoiGianBatDau);

        System.out.println("Thực hiện xong order " + order.getOrderId());
    }
}
