package QuanLy;

import java.util.*;
import java.io.*;
import menu.Menu;
import menu.DanhSachNuoc;
import menu.LoaiMenu;

public class QuanLyMenu {

    public void quanLyMenu(Scanner sc, Menu menu) {
        System.out.println("----- Quản lý Menu -----");
        System.out.println("1. Thêm món mới");
        System.out.println("2. Xóa món");
        System.out.println("3. Hiện thị menu");
        System.out.print("Chọn chức năng: ");
        sc.nextLine();
        int chon = Integer.parseInt(sc.nextLine());

        switch (chon) {
                case 1:
                System.out.println("Nhập loại menu\n1. Menu trà\n2. Menu cà phê\n3. Menu sinh tố\n4. Menu nước ngọt\n5. Menu snack");
                int loaiMenuMoi = sc.nextInt();
                sc.nextLine();
                System.out.println("Nhập id món: ");
                String id = sc.nextLine();
                System.out.println("Nhập tên món: ");
                String ten = sc.nextLine();
                System.out.println("Nhập mô tả: ");
                String moTa = sc.nextLine();
                System.out.println("Nhập giá: ");
                double gia = Double.parseDouble(sc.nextLine());
                DanhSachNuoc nuocMoi = new DanhSachNuoc(id, ten, moTa, gia);

                switch (loaiMenuMoi) {
                    case 1:
                        menu.getLoaimenu().get(0).themNuoc(nuocMoi);
                        ghiDuLieuVaoFile("menuTra.txt", nuocMoi);
                        System.out.println("Thêm món thành công.");
                        break;
                    case 2:
                        menu.getLoaimenu().get(1).themNuoc(nuocMoi);
                        ghiDuLieuVaoFile("menuCoffee.txt", nuocMoi);
                        System.out.println("Thêm món thành công.");
                        break;
                    case 3:
                        menu.getLoaimenu().get(2).themNuoc(nuocMoi);
                        ghiDuLieuVaoFile("menuSinhTo.txt", nuocMoi);
                        System.out.println("Thêm món thành công.");
                        break;
                    case 4:
                        menu.getLoaimenu().get(3).themNuoc(nuocMoi);
                        ghiDuLieuVaoFile("menuNuocNgot.txt", nuocMoi);
                        System.out.println("Thêm món thành công.");
                        break;
                    case 5:
                        menu.getLoaimenu().get(4).themNuoc(nuocMoi);
                        ghiDuLieuVaoFile("menuSnack.txt", nuocMoi);
                        System.out.println("Thêm món thành công.");
                        break;
                    default:
                        System.out.println("Loại menu không hợp lệ.");
                }
            case 2:
                System.out.println("Nhập tên món cần xóa: ");
                String tenXoa = sc.nextLine();
                boolean found = false;
                
                for (LoaiMenu loaiMenu : menu.getLoaimenu()) {
                    for (DanhSachNuoc nuoc : loaiMenu.getNuoc()) {
                        if (nuoc.getTenNuoc().equals(tenXoa)) {
                            loaiMenu.getNuoc().remove(nuoc);
                            System.out.println("Xóa món thành công.");
                            found = true;
                            break;
                        }
                    }
                    if (found) break;
                }
                
                if (!found) {
                    System.out.println("Không tìm thấy món cần xóa.");
                }
                break;

            case 3:
                System.out.println("----- Hiển thị Menu -----");
                menu.inMenu();
                break;

            default:
                System.out.println("Chức năng không hợp lệ.");
        }
    }
    private void ghiDuLieuVaoFile(String fileName, DanhSachNuoc nuocMoi) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true))) {
            bw.write(nuocMoi.toString());
            bw.newLine();
        } catch (IOException e) {
            System.out.println("Lỗi ghi file: " + e.getMessage());
        }
    }
    
}
