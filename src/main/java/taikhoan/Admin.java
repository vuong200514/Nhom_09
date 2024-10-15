package taikhoan;

import TrangThai.TrangThaiTK;

public class Admin extends TaiKhoan {

    public Admin(String id, String pass) {
        super(id, pass);
    }

    @Override
    public boolean dangNhap(String id, String pass) {
        if (this.getId().equals(id) && this.getPass().equals(pass)) {
            System.out.println("Đăng nhập thành công với quyền Admin.");
            return true;
        } else {
            return false;
        }
    }
}
