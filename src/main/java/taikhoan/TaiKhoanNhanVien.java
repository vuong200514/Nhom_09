package taikhoan;

import TrangThai.TrangThaiTK;

public class TaiKhoanNhanVien extends TaiKhoan {
    
    public TaiKhoanNhanVien(String id, String pass) {
        super(id, pass);
    }

    @Override
    public boolean dangNhap(String id, String pass) {
        if (this.getId().equals(id) && this.getPass().equals(pass)) {
            System.out.println("Đăng nhập thành công với quyền Mod.");
            return true;
        } else {
            return false;
        }
    }
}
