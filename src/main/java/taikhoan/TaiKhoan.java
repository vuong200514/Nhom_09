package taikhoan;

import TrangThai.TrangThaiTK;

public class TaiKhoan {
    private String id;
    private String pass;
    private String diaChi;
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

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public TrangThaiTK getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(TrangThaiTK trangThai) {
        this.trangThai = trangThai;
    }

    
    
    public TaiKhoan(String id, String pass, String diachi, TrangThaiTK trangthai) {
        this.id = id;
        this.pass = pass;
        this.diaChi = diachi;
        this.trangThai = trangthai;
    }

    public TrangThaiTK getTrangThaiTK() {
        return trangThai;
    }

    public void setTrangThaiTK(TrangThaiTK trangthai) {
        this.trangThai = trangthai;
    }

    public void doiMK(String MKMOI) {
        this.pass = MKMOI;
    }
}
