package QuanLy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import menu.LoaiMenu;
import menu.DanhSachNuoc;

public class LayDuLieu {
    private static final String DATA_FOLDER = "D:/data/";

    public LoaiMenu docMenuTuFile(String tenFile) {
        LoaiMenu loaiMenu = null;

        try (BufferedReader br = new BufferedReader(new FileReader(DATA_FOLDER + tenFile))) {
            String line;
            if ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                loaiMenu = new LoaiMenu(parts[0], parts[1], parts[2]);
            }

            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                DanhSachNuoc nuoc = new DanhSachNuoc(parts[0], parts[1], parts[2], Double.parseDouble(parts[3])); // ID, Tên, Mô tả, Giá
                if (loaiMenu != null) {
                    loaiMenu.themNuoc(nuoc);
                }
            }
        } catch (IOException e) {
            System.err.println("Lỗi khi đọc file: " + e.getMessage());
        }

        return loaiMenu;
    }
}
