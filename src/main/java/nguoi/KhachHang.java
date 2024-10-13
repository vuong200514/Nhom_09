package nguoi;

import TrangThai.TrangThaiTK;
import cacloaihoadon.Order;
import java.util.List;
import menu.DanhSachNuoc;
import taikhoan.Guest;
import taikhoan.TaiKhoan;

public class KhachHang extends Nguoi {
    private String loaiKhachHang;
    private TaiKhoan taiKhoan;
    private TrangThaiTK trangThai;

    public KhachHang(String ten, String email, String sdt, String loaiKhachHang, TaiKhoan taiKhoan) {
        super(ten, email, sdt);
        this.loaiKhachHang = loaiKhachHang;
        this.taiKhoan = taiKhoan;
        this.trangThai = TrangThaiTK.Offline;
    }

    public TrangThaiTK getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(TrangThaiTK trangThai) {
        this.trangThai = trangThai;
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
            this.trangThai = TrangThaiTK.Online;
            System.out.println("Đăng nhập thành công cho khách hàng.");
            return true;
        } else {
            return false;
        }
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
