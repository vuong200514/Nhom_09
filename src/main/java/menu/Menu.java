package menu;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private String menuId;
    private String tieudemenu;
    private String mota;
    private List<LoaiMenu> loaimenu;

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    public String getTieudemenu() {
        return tieudemenu;
    }

    public void setTieudemenu(String tieudemenu) {
        this.tieudemenu = tieudemenu;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public List<LoaiMenu> getLoaimenu() {
        return loaimenu;
    }

    public void setLoaimenu(List<LoaiMenu> loaimenu) {
        this.loaimenu = loaimenu;
    }

    
    
    
    // Khai bao menu
    public Menu(String maMenu, String TieuDe, String mota) {
        this.menuId = maMenu;
        this.tieudemenu = TieuDe;
        this.mota = mota;
        this.loaimenu = new ArrayList<>();
    }

    
    // Ham them loai menu
    public void themLoaiMenu(LoaiMenu loai) {
        loaimenu.add(loai);
    }

    
    // Ham In Menu
    public void inMenu() {
        System.out.println("Menu: " + tieudemenu);
        for (LoaiMenu loai : loaimenu) {
            loai.inDanhSachNuoc();
        }
    }
}
