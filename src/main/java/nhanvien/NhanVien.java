package nhanvien;

import taikhoan.TaiKhoan;

public abstract class NhanVien extends Nguoi {
    private String maNhanVien;
    private TaiKhoan TK;

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public TaiKhoan getTK() {
        return TK;
    }

    public void setTK(TaiKhoan TK) {
        this.TK = TK;
    }

    
    
    public NhanVien(String msnv, TaiKhoan taiKhoan, String tenNV, String email, String SDT) {
        super(tenNV, email, SDT);
        this.maNhanVien = msnv;
        this.TK = taiKhoan;
    }
    
    // Ham nhan luong
}
