package nguoi;
import ChoNgoi.*;
import TrangThai.*;
import cacloaihoadon.Order;
import java.util.List;
import java.util.Scanner;
import menu.DanhSachNuoc;
import menu.Menu;
import taikhoan.Guest;
import taikhoan.TaiKhoan;

public class KhachHang extends Nguoi {
    private String maKhachHang;
    private TaiKhoan taiKhoan;

    public KhachHang(String maKhachHang,String tenKhachHang, String email, String sdt, TaiKhoan taiKhoan) {
        super(maKhachHang, email, sdt);
        this.maKhachHang = maKhachHang;
        this.taiKhoan = taiKhoan;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public TaiKhoan getTaiKhoan() {
        return taiKhoan;
    }

    public void setTaiKhoan(TaiKhoan taiKhoan) {
        this.taiKhoan = taiKhoan;
    }
    
    public boolean dangNhap(String id, String pass) {
        if (taiKhoan != null && taiKhoan.dangNhap(id, pass)) {
            taiKhoan.setTrangThai(TrangThaiTK.Online);
            System.out.println("Đăng nhập thành công cho khách hàng.");
            return true;
        } else {
            return false;
        }
    }

    //goi order voi nhan vien order va co danh sach cac mon da goi
    public void goiOrder(Scanner sc, List<NhanVienOrder> danhSachNhanVienOrder, Menu menu) throws InterruptedException {
        while (true) {
            int check=0;
            for (NhanVienOrder nhanVienOrder : danhSachNhanVienOrder){
            nhanVienOrder.hienthi();
            }
            System.out.println("Nhập mã nhân viên bạn muốn chọn");
            sc.nextLine();
            String maNhanVien = sc.nextLine();
            for (NhanVienOrder nhanVienOrder : danhSachNhanVienOrder){
                if(nhanVienOrder.getMaNhanVien().equals(maNhanVien)&&nhanVienOrder.getTrangThai().equals(TrangThaiNhanVien.DangRanh)){
                    System.out.println("Nhân viên "+nhanVienOrder.getTen()+" đang đến vui lòng đợi trong giây lát");
                    check = 1;
                    break;
                } else {
                    System.out.println("Nhân viên đang bận vui lòng chọn nhân viên khác");
                }
            }
            if(check==1){
                break;
            }
        }
    }
    
    public void goiNhanVienOrder(Scanner sc, List<NhanVienOrder> danhSachNhanVienOrder){
        sc.nextLine();
        for (NhanVienOrder nhanVienOrder : danhSachNhanVienOrder){
            nhanVienOrder.hienthi();
        }
        System.out.println("Nhập mã nhân viên");
        String maNhanVien = sc.nextLine();
        for (NhanVienOrder nhanVienOrder : danhSachNhanVienOrder){
            if(nhanVienOrder.getMaNhanVien().equals(maNhanVien)){
                try {
                    if(nhanVienOrder.getTrangThai().equals(TrangThaiNhanVien.DangRanh)){
                    Thread.sleep(2000);
                    System.out.println("Nhân Viên: "+nhanVienOrder.getTen()+" đang tới");
                    nhanVienOrder.setTrangThai(TrangThaiNhanVien.DangBan);
                }
                else{
                    System.out.println("Nhân Viên: "+nhanVienOrder.getTen()+" đang bận");
                }
                } catch (InterruptedException e) {
                }
            }
        }
    }
    
    public void goiNhanVienPhaChe(Scanner sc, List<NhanVienPhaChe> danhSachNhanVienPhaChe){
        for (NhanVienPhaChe nhanVienPhaChe : danhSachNhanVienPhaChe){
            nhanVienPhaChe.hienthi();
        }
        System.out.println("Nhập mã nhân viên");
        sc.nextLine();
        String maNhanVien = sc.nextLine();
        for (NhanVienPhaChe nhanVienPhaChe : danhSachNhanVienPhaChe){
            if(nhanVienPhaChe.getMaNhanVien().equals(maNhanVien)){
                try {
                    if(nhanVienPhaChe.getTrangThai().equals(TrangThaiNhanVien.DangRanh)){
                    Thread.sleep(2000);
                    System.out.println("Nhân Viên: "+nhanVienPhaChe.getTen()+" đang tới");
                    nhanVienPhaChe.setTrangThai(TrangThaiNhanVien.DangBan);
                }
                else{
                    System.out.println("Nhân Viên: "+nhanVienPhaChe.getTen()+" đang bận");
                }
                } catch (InterruptedException e) {
                }
            }
        }
    }
    
    // ham dat ban va kiem tra suc chua va trang thai cua ban
     public void datBan(int soCho, Ban ban) {
        if (ban.getTrangThaiBan() == TrangThaiBan.ConBan && ban.soCho() >= soCho) {
            ban.setTrangThaiBan(TrangThaiBan.DangSuDung);
            System.out.println("Đặt bàn thành công. Mã bàn: " + ban.getMaBan() + ", Số chỗ: " + ban.soCho() + ", Loại chỗ: " + ban.getGheNgoi().getLoaiChoNgoi());
        }
        else {
            System.out.println("Đã hết bàn hoặc bàn không đủ chỗ. Vui lòng thử lại sau.");
        }
    }
     
     public void traBan(Ban ban) {
         ban.setTrangThaiBan(TrangThaiBan.ConBan);
         try {
            System.out.println("Yêu cầu trả bàn đã được gửi, vui lòng đợi nhân viên đến.");
            Thread.sleep(2000);
            System.out.println("Trả bàn thành công. Mã bàn: " + ban.getMaBan());
        } catch (InterruptedException e) {
        }
    }
}
