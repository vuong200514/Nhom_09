package QuanLy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;
import menu.LoaiMenu;
import menu.DanhSachNuoc;

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
}
