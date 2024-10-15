package taikhoan;

// class abtract cua cac loai tai khoan

import TrangThai.TrangThaiTK;

public abstract class TaiKhoan {
    private String id;
    private String pass;
    private TrangThaiTK trangThai;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public TrangThaiTK getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(TrangThaiTK trangThai) {
        this.trangThai = trangThai;
    }

    public TaiKhoan(String id, String pass) {
        this.id = id;
        this.pass = pass;
    }

    public abstract boolean dangNhap(String id, String pass);
}
