package nhanvien;

import taikhoan.TaiKhoan;

public class NhanVienPhaChe extends NhanVien {
    public NhanVienPhaChe(String maNV, TaiKhoan TKNV, String TenNV, String email, String SDT) {
        super(maNV, TKNV, TenNV, email, SDT);
    }

    public void lamOrder() {
        // Them ham tra thoi gian lam
    }
}
