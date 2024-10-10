package nhanvien;

import taikhoan.TaiKhoan;

public class NhanVienOrder extends NhanVien {
    public NhanVienOrder(String maNV, TaiKhoan TKNV, String tenNV, String email, String SDT) {
        super(maNV, TKNV, tenNV, email, SDT);
    }

    public void taoOrder() {
        // Ham Tao Order
    }
    
}
