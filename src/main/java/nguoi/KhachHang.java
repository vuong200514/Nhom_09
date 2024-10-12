package nguoi;

import menu.DanhSachNuoc;
import cacloaihoadon.Order;
import taikhoan.TaiKhoan;
import java.util.List;

public class KhachHang extends Nguoi {
    private String loaiKhachHang;
    private TaiKhoan taiKhoan;

    public KhachHang(String ten, String email, String sdt, String loaiKhachHang) {
        super(ten, email, sdt);
        this.loaiKhachHang = loaiKhachHang;
    }

    public String getLoaiKhachHang() {
        return loaiKhachHang;
    }

    public void setLoaiKhachHang(String loaiKhachHang) {
        this.loaiKhachHang = loaiKhachHang;
    }

    public TaiKhoan getTaiKhoan() {
        return taiKhoan;
    }

    public void setTaiKhoan(TaiKhoan taiKhoan) {
        this.taiKhoan = taiKhoan;
    }
    
    public boolean dangNhap(String id, String pass) {
        if (taiKhoan != null && taiKhoan.dangNhap(id, pass)) {
            System.out.println("Đăng nhập thành công cho khách hàng.");
            return true;
        }
        System.out.println("Đăng nhập thất bại.");
        return false;
    }

    public void goiOrder(NhanVienOrder nhanVienOrder, String orderId, List<DanhSachNuoc> dsNuoc) {
        if (nhanVienOrder != null) {
            Order order = nhanVienOrder.taoOrder(orderId, dsNuoc);
            System.out.println("Khách hàng " + this.getTen() + " đã gọi order: " + orderId);
            order.printOrder();
        } else {
            System.out.println("Không thể gọi order. Nhân viên order không tồn tại.");
        }
    }
}
