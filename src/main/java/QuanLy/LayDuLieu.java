package QuanLy;

import TrangThai.TrangThaiTK;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;
import menu.LoaiMenu;
import menu.DanhSachNuoc;
import nguoi.*;
import taikhoan.*;

public class LayDuLieu {

    public void docDuLieuNuoc(String fileName, LoaiMenu loaiMenu) {
        try {
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                String[] txt = line.split(";");
                String id = txt[0];
                String name = txt[1];
                String mota = txt[2];
                double gia = Double.parseDouble(txt[3]);
                DanhSachNuoc nuoc = new DanhSachNuoc(id, name, mota, gia);
                loaiMenu.themNuoc(nuoc);
            }
            br.close();
        } catch (Exception e) {
            System.out.println("Có lỗi khi đọc file: " + fileName);
        }
    }

    public void docTatCaMenu(List<LoaiMenu> danhSachLoaiMenu) {
        String[] fileNames = {
            "menuTra.txt", "menuCoffee.txt", "menuSinhTo.txt", 
            "menuNuocNgot.txt", "menuSnack.txt"
        };
        
        for (int i = 0; i < fileNames.length; i++) {
            docDuLieuNuoc(fileNames[i], danhSachLoaiMenu.get(i));
        }
    }
    
    public void docLoaiMenu(String fileName, List<LoaiMenu> danhSachLoaiMenu) {
        try {
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                String[] txt = line.split(";");
                String id = txt[0];
                String name = txt[1];
                String mota = txt[2];
                LoaiMenu loaiMenu = new LoaiMenu(id, name, mota);
                danhSachLoaiMenu.add(loaiMenu);
            }
            br.close();
        } catch (Exception e) {
            System.out.println("Có lỗi khi đọc file: " + fileName);
        }
    }
    
    public void docNhanVienOrder(String fileName, List<NhanVienOrder> danhSachNhanVienOrder, TaiKhoanNhanVien taiKhoanNhanVien) {
        try {
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                String[] txt = line.split(";");
                String id = txt[0];
                String name = txt[1];
                String gmail = txt[2];
                String sdt = txt[3];
                NhanVienOrder nhanVien = new NhanVienOrder(id, name, gmail, sdt, taiKhoanNhanVien);
                danhSachNhanVienOrder.add(nhanVien);
            }
            br.close();
        } catch (Exception e) {
            System.out.println("Có lỗi khi đọc file: " + fileName);
        }
    }
    
    public void docNhanVienPhaChe(String fileName, List<NhanVienPhaChe> danhSachNhanVienPhaChe, TaiKhoanNhanVien taiKhoanNhanVien) {
        try {
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                String[] txt = line.split(";");
                String id = txt[0];
                String name = txt[1];
                String gmail = txt[2];
                String sdt = txt[3];
                NhanVienPhaChe nhanVien = new NhanVienPhaChe(id, name, gmail, sdt, taiKhoanNhanVien);
                danhSachNhanVienPhaChe.add(nhanVien);
            }
            br.close();
        } catch (Exception e) {
            System.out.println("Có lỗi khi đọc file: " + fileName);
        }
    }
}
