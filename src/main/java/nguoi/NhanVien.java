package nguoi;

import taikhoan.TaiKhoan;

public class NhanVien extends Nguoi {
    private String maNhanVien;
    private TaiKhoan taiKhoan;
    double luong;

    public NhanVien(String maNV, TaiKhoan TK, String tenNV, String email, String SDT, double luong) {
        super(tenNV, email, SDT);
        this.maNhanVien = maNV;
        this.taiKhoan = TK;
        this.luong = luong;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public TaiKhoan getTaiKhoan() {
        return taiKhoan;
    }

    public void setTaiKhoan(TaiKhoan taiKhoan) {
        this.taiKhoan = taiKhoan;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }


    public void linhLuong() {
    if (luong > 0) {
        System.out.println("Nhân viên " + super.getTen() + " đã lĩnh lương: " + luong);
        taiKhoan.setPass("0");
        luong = 0;
    } else {
        System.out.println("Nhân viên " + super.getTen() + " đã lĩnh lương hoặc chưa có lương.");
    }
}
}
