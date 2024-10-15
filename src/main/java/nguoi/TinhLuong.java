package nguoi;

import java.util.List;
import java.util.Scanner;

public class TinhLuong {
    Scanner sc = new Scanner(System.in);
    
    public void tinhLuong(List<NhanVien> danhSachNhanVien) {
        for (NhanVien nhanVien : danhSachNhanVien) {
            System.out.println("Nhập số ngày làm việc:");
            int ngaylam = sc.nextInt();
            System.out.println("Nhập hệ số lương:");
            float heso = sc.nextInt();
            float luongCuoi = nhanVien.getLuongCoBan()*heso;
            System.out.println("Đã tính lương cho nhân viên: "+nhanVien.getTen()+", Lương cuối: "+luongCuoi);
            nhanVien.setLuong(luongCuoi);
        }
    }
    
    public void tinhLuong(List<NhanVien> danhSachNhanVien, float thuongle) {
        for (NhanVien nhanVien : danhSachNhanVien) {
            while (true) {                
                System.out.println("Nhập số ngày làm việc:");
                int ngaylam = sc.nextInt();
                if(ngaylam>=15){
                    break;
                } else{
                    System.out.println("Ngày làm phải lớn hơn 15.");
                }
            }
            System.out.println("Nhập hệ số lương:");
            float heso = sc.nextFloat();
            float luongCuoi = nhanVien.getLuongCoBan()*heso + thuongle;
            System.out.println("Đã tính lương cho nhân viên: "+nhanVien.getTen()+", Lương cuối: "+luongCuoi);
            nhanVien.setLuong(luongCuoi);
        }
    }
}
