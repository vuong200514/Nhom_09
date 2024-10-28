package menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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

    public Menu(String maMenu, String TieuDe, String mota) {
        this.menuId = maMenu;
        this.tieudemenu = TieuDe;
        this.mota = mota;
        this.loaimenu = new ArrayList<>();
    }

    public void themLoaiMenu(LoaiMenu loai) {
        loaimenu.add(loai);
    }

    public void inMenu() {
        System.out.println("Menu: " + tieudemenu);
        for (LoaiMenu loai : loaimenu) {
            loai.inDanhSachNuoc();
        }
    }
    
    public void inMenuLoc() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu đã lọc: ");
        LoaiMenu fullMenu = new LoaiMenu("Menu theo yêu khoảng giá đã chọn", "Menu đã lọc", "Danh sách các món theo nhu cầu");
        System.out.println("Nhập giá min");
        double min = sc.nextDouble();
        System.out.println("Nhập giá max");
        double max = sc.nextDouble();
        sc.nextLine();
        for (LoaiMenu loai : loaimenu) {
            for(DanhSachNuoc ds : loai.getDanhSachNuoc()){
                if(ds.getGiatien()<max && ds.getGiatien()>min){
                   fullMenu.themNuoc(ds); 
                }
            }
        }
        for (DanhSachNuoc nuoc : fullMenu.getDanhSachNuoc()){
            
        }
        fullMenu.inDanhSachNuoc();
    }
}
