package nguoi;
import ChoNgoi.*;
import TrangThai.LoaiChoNgoi;
import TrangThai.TrangThaiBan;
import TrangThai.TrangThaiTK;
import cacloaihoadon.Order;
import java.util.List;
import menu.DanhSachNuoc;
import taikhoan.Guest;
import taikhoan.TaiKhoan;

public class KhachHang extends Nguoi {
    private String maKhachHang;
    private TaiKhoan taiKhoan;

    public KhachHang(String maKhachHang,String tenKhachHang, String email, String sdt, TaiKhoan taiKhoan) {
        super(maKhachHang, email, sdt);
        this.maKhachHang = maKhachHang;
        this.taiKhoan = taiKhoan;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public TaiKhoan getTaiKhoan() {
        return taiKhoan;
    }

    public void setTaiKhoan(TaiKhoan taiKhoan) {
        this.taiKhoan = taiKhoan;
    }
    
    public boolean dangNhap(String id, String pass) {
        if (taiKhoan != null && taiKhoan.dangNhap(id, pass)) {
            taiKhoan.setTrangThai(TrangThaiTK.Online);
            System.out.println("Đăng nhập thành công cho khách hàng.");
            return true;
        } else {
            return false;
        }
    }

    //goi order voi nhan vien order va co danh sach cac mon da goi
    public void goiOrder(NhanVienOrder nhanVienOrder, String orderId, List<DanhSachNuoc> dsNuoc) {
        if (nhanVienOrder != null) {
            Order order = nhanVienOrder.taoOrder(orderId, dsNuoc);
            System.out.println("Khách hàng " + this.getTen() + " đã gọi order: " + orderId);
            order.printOrder();
        } else {
            System.out.println("Không thể gọi order. Nhân viên order không tồn tại.");
        }
    }
    
    // ham dat ban va kiem tra suc chua va trang thai cua ban
     public void datBan(int soCho, Ban ban) {
        if (ban.getTrangThaiBan() == TrangThaiBan.ConBan && ban.soCho() >= soCho) {
            ban.setTrangThaiBan(TrangThaiBan.DangSuDung);
            System.out.println("Đặt bàn thành công. Mã bàn: " + ban.getMaBan() + ", Số chỗ: " + ban.soCho() + ", Loại chỗ: " + ban.getGheNgoi().getLoaiChoNgoi());
        }
        else {
            System.out.println("Đã hết bàn hoặc bàn không đủ chỗ. Vui lòng thử lại sau.");
        }
    }
     
     public void traBan(Ban ban) {
         ban.setTrangThaiBan(TrangThaiBan.ConBan);
         try {
            System.out.println("Yêu cầu trả bàn đã được gửi, vui lòng đợi nhân viên đến.");
            Thread.sleep(2000);
            System.out.println("Trả bàn thành công. Mã bàn: " + ban.getMaBan());
        } catch (InterruptedException e) {
        }
    }
}
