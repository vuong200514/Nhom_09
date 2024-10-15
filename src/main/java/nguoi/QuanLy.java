package nguoi;

import taikhoan.TaiKhoan;
import taikhoan.Admin;
import taikhoan.TaiKhoanNhanVien;
import java.util.*;

public class QuanLy extends NhanVien {
    private Admin taiKhoanAdmin;
    private List<NhanVien> danhSachNhanVien;

    public QuanLy(String maNV, String tenNv, String email, String SDT, Admin adminTK) {
        super(maNV, tenNv, email, SDT);
        this.taiKhoanAdmin = adminTK;
    }

    public List<NhanVien> getDanhSachNhanVien() {
        return danhSachNhanVien;
    }

    public void setDanhSachNhanVien(List<NhanVien> danhSachNhanVien) {
        this.danhSachNhanVien = danhSachNhanVien;
    }


    public void themNhanVien() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập mã nhân viên: ");
        String maNV = sc.nextLine();
        System.out.println("Nhập tên nhân viên:");
        String tenNV = sc.nextLine();
        System.out.println("Nhập email:");
        while (true) {            
            String email = sc.nextLine();
            if(email.matches("^\\S+@\\S+\\.\\S+$")){
                break;
            } else {
                System.out.println("Nhập sai! Định dạng là abc@xyz.mnp");
            }
        }
        while (true) {            
            System.out.println("Nhập SDT:");
            String SDT = sc.nextLine();
            if(SDT.matches("^0[0-9]{9}$")){
                break;
            } else {
                System.out.println("Nhập sai! Định dạng là 0123456789");
            }
        }
        NhanVien nhanVien = new NhanVien(maNV, tenNV, email, SDT);
        danhSachNhanVien.add(nhanVien);
        System.out.println("Đã thêm nhân viên: " + nhanVien.getTen());
    }

    public void xoaNhanVien(String maNhanVien) {
        NhanVien nhanVien = null;
        for (NhanVien nv : danhSachNhanVien) {
            if (nv.getMaNhanVien().equals(maNhanVien)) {
                nhanVien = nv;
                break;
            }
        }

        if (nhanVien != null) {
            danhSachNhanVien.remove(nhanVien);
            System.out.println("Đã xóa nhân viên: " + nhanVien.getTen());
        } else {
            System.out.println("Không tìm thấy nhân viên với mã: " + maNhanVien);
        }
    }

    public void tinhLuongChoNhanVien(List<NhanVien> danhSachNhanVien) {
        Scanner sc = new Scanner(System.in);
        TinhLuong tl = new TinhLuong();
        System.out.println("Có tháng lễ không yes/no");
        String chon = sc.nextLine();
        if(chon.equals("yes")){
            System.out.println("Nhập thưởng:");
            float thuong = sc.nextFloat();
            tl.tinhLuong(danhSachNhanVien, thuong);
        }
        if(chon.equals("no")){
            System.out.println("Nhập số ngày làm việc:");
            int ngaylam = sc.nextInt();
            tl.tinhLuong(danhSachNhanVien);
        }
    }
    
    public void timKiemNhanVien(List<NhanVien> danhSachNhanVien) {
        Scanner sc = new Scanner(System.in);
        String maNhanVien = null;
        System.out.println("Nhập mã nhân viên cần tìm");
        maNhanVien = sc.nextLine();
        for (NhanVien nv : danhSachNhanVien){
            if(maNhanVien.equals(nv.getMaNhanVien())){
                nv.hienthi();
                break;
            }
        }
    }
}
