package taikhoan;

import TrangThai.TrangThaiTK;

public class TaiKhoanNhanVien extends TaiKhoan {
    
    public TaiKhoanNhanVien(String id, String pass, String diaChi, TrangThaiTK trangThai) {
        super(id, pass, diaChi, trangThai);
    }

    @Override
    public boolean dangNhap(String id, String pass) {
        return this.getId().equals(id) && this.getPass().equals(pass);
    }
}
