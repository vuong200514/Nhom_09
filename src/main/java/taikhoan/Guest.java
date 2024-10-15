package taikhoan;

import TrangThai.TrangThaiTK;

public class Guest extends TaiKhoan {

    public Guest(String id, String pass) {
        super(id, pass);
    }

    
    @Override
    public boolean dangNhap(String id, String pass) {
        if (this.getId().equals(id) && this.getPass().equals(pass)) {
            System.out.println("Đăng nhập thành công chào mừng đến với BlackPink Coffee");
            return true;
        } else {
            return false;
        }
    }
}
