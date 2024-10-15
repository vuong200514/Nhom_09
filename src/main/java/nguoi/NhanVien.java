package nguoi;

import TrangThai.TrangThaiNhanVien;
import taikhoan.TaiKhoan;

public class NhanVien extends Nguoi {
    private String maNhanVien;
    private TaiKhoan taiKhoan;
    private float luongCoBan=200000;
    private float luong = 0;
    private TrangThaiNhanVien trangThai;

    public NhanVien(String maNV, String tenNV, String email, String SDT) {
        super(tenNV, email, SDT);
        this.maNhanVien = maNV;
        this.luongCoBan = luongCoBan;
        this.trangThai = TrangThaiNhanVien.DangRanh;
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

    public float getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(float luongcb) {
        this.luongCoBan = luongcb;
    }

    public TrangThaiNhanVien getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(TrangThaiNhanVien trangThai) {
        this.trangThai = trangThai;
    }
    
    public  void setLuong(float luong){
        this.luong = luong;
    }

    public float getLuong() {
        return luong;
    }
    
    public void linhLuong() {
        if (luongCoBan > 0) {
            System.out.println("Nhân viên " + super.getTen() + " đã lĩnh lương: " + luongCoBan);
            taiKhoan.setPass("0");
            luongCoBan = 200000;
        } else {
            System.out.println("Nhân viên " + super.getTen() + " đã lĩnh lương hoặc chưa có lương.");
        }
    }
    
    public void hienthi(){
                    System.out.println("Mã nhân viên: " + maNhanVien +
                ", Tên nhân viên: " + ten +
                ", SDT: " + SDT +
                ", Tài khoản: " + taiKhoan +
                ", Lương cơ bản: " + luongCoBan +
                ", Trạng thái: " + trangThai +
                ", Lương tháng: " + luong);
        }
}
