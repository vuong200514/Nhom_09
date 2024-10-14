package nguoi;

import taikhoan.TaiKhoan;

public class NhanVien extends Nguoi {
    private String maNhanVien;
    private TaiKhoan taiKhoan;
    private double luongCoBan=200000;

    public NhanVien(String maNV, TaiKhoan TK, String tenNV, String email, String SDT) {
        super(tenNV, email, SDT);
        this.maNhanVien = maNV;
        this.taiKhoan = TK;
        this.luongCoBan = luongCoBan;
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

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuong(double luong) {
        this.luongCoBan = luong;
    }

    public void linhLuong() {
        if (luongCoBan > 0) {
            System.out.println("Nhân viên " + super.getTen() + " đã lĩnh lương: " + luongCoBan);
            taiKhoan.setPass("0");
            luongCoBan = 0;
        } else {
            System.out.println("Nhân viên " + super.getTen() + " đã lĩnh lương hoặc chưa có lương.");
        }
    }
}
