package nguoi;

import taikhoan.TaiKhoan;
import taikhoan.Admin;
import java.util.*;

public class QuanLy extends NhanVien {
    private Admin taiKhoanAdmin;
    private List<NhanVien> danhSachNhanVien;

    public QuanLy(String maNV, TaiKhoan TKNV, String tenNv, String email, String SDT, Admin adminTK) {
        super(maNV, TKNV, tenNv, email, SDT);
        this.taiKhoanAdmin = adminTK;
    }

    public List<NhanVien> getDanhSachNhanVien() {
        return danhSachNhanVien;
    }

    public void setDanhSachNhanVien(List<NhanVien> danhSachNhanVien) {
        this.danhSachNhanVien = danhSachNhanVien;
    }


    public void themNhanVien(NhanVien nhanVien) {
        danhSachNhanVien.add(nhanVien);
        System.out.println("Đã thêm nhân viên: " + nhanVien.getTen());
    }

    public void xoaNhanVien(String maNhanVien) {
        NhanVien nhanVienXoa = null;
        for (NhanVien nv : danhSachNhanVien) {
            if (nv.getMaNhanVien().equals(maNhanVien)) {
                nhanVienXoa = nv;
                break;
            }
        }

        if (nhanVienXoa != null) {
            danhSachNhanVien.remove(nhanVienXoa);
            System.out.println("Đã xóa nhân viên: " + nhanVienXoa.getTen());
        } else {
            System.out.println("Không tìm thấy nhân viên với mã: " + maNhanVien);
        }
    }

    public void tinhLuongChoNhanVien(List<NhanVien> danhSachNhanVien) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Có tháng lễ không yes/no");
        String chon = sc.nextLine();
        if(chon.equals("yes")){
            System.out.println("Nhập số ngày làm việc:");
            int ngaylam = sc.nextInt();
            System.out.println("Nhập thưởng:");
            double thuong = sc.nextDouble();
            TinhLuong tinhLuong = new TinhLuong(danhSachNhanVien);
        }
        if(chon.equals("no")){
            System.out.println("Nhập số ngày làm việc:");
            int ngaylam = sc.nextInt();
            TinhLuong tinhLuong = new TinhLuong(danhSachNhanVien);
            tinhLuong.tinhLuong(ngaylam);
        }
    }
}
