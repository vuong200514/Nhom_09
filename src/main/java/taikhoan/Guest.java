package taikhoan;

import TrangThai.TrangThaiTK;

public class Guest extends TaiKhoan {
    private String diaChi;

    public Guest(String id, String pass, String diaChi, TrangThaiTK trangThai) {
        super(id, pass, null, trangThai);
        this.diaChi = diaChi;
    }
    
    @Override
    public boolean dangNhap(String id, String pass) {
        if (this.getId().equals(id) && this.getPass().equals(pass)) {
            return true;
        } else {
            return false;
        }
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
}
