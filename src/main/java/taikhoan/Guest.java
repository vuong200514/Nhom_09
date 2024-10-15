package taikhoan;

import TrangThai.TrangThaiTK;

public class Guest extends TaiKhoan {
    private String diaChi;

    public Guest(String id, String pass, String diaChi, TrangThaiTK trangThai) {
        super(id, pass, null, trangThai);
        this.diaChi = diaChi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
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
