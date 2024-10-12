package menu;

import java.util.ArrayList;
import java.util.List;

public class LoaiMenu {
    private String loaimenu;
    private String tenLoaiMenu;
    private String mota;
    private List<DanhSachNuoc> nuoc;

    public String getLoaimenu() {
        return loaimenu;
    }

    public void setLoaimenu(String loaimenu) {
        this.loaimenu = loaimenu;
    }

    public String getTenLoaiMenu() {
        return tenLoaiMenu;
    }

    public void setTenLoaiMenu(String tenLoaiMenu) {
        this.tenLoaiMenu = tenLoaiMenu;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public List<DanhSachNuoc> getNuoc() {
        return nuoc;
    }
    
    public LoaiMenu(String ma, String tieude, String mota) {
        this.loaimenu = ma;
        this.tenLoaiMenu = tieude;
        this.mota = mota;
        this.nuoc = new ArrayList<>();
    }

    public void themNuoc(DanhSachNuoc nuoc) {
        this.nuoc.add(nuoc);
    }

    public void inDanhSachNuoc() {
        System.out.println(tenLoaiMenu + ": " + mota);
        for (DanhSachNuoc nuoc : nuoc) {
            System.out.println("- " + nuoc.getTenNuoc() + ": $" + nuoc.getGiatien()); // Sửa gọi đến getGiatien()
        }
    }
}
