package taikhoan;

import TrangThai.TrangThaiTK;

public class Guest extends TaiKhoan {

    public Guest(String id, String pass, String diaChi, TrangThaiTK trangThai) {
        super(id, pass, diaChi, trangThai);
    }

    @Override
    public boolean dangNhap(String id, String pass) {
        if (this.getId().equals(id) && this.getPass().equals(pass)) {
            System.out.println("Đăng nhập thành công với quyền Guest.");
            return true;
        } else {
            System.out.println("Đăng nhập thất bại.");
            return false;
        }
    }
}
