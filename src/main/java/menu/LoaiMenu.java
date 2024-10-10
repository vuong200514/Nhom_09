package menu;

import java.util.ArrayList;
import java.util.List;

public class LoaiMenu {
    private String loaimenu;
    private String tenLoaiMenu;
    private String mota;
    private List<DanhSachNuoc> Nuoc;

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
        return Nuoc;
    }

    public void setNuoc(List<DanhSachNuoc> Nuoc) {
        this.Nuoc = Nuoc;
    }
    
    
    
    //Khai bao menu (Tra , Tra Sua, Sua, Caphe)
    public LoaiMenu(String ma, String tieude, String mota) {
        this.loaimenu = ma;
        this.tenLoaiMenu = tieude;
        this.mota = mota;
        this.Nuoc = new ArrayList<>();
    }
    
    // Them nuoc vao menu
    public void themNuoc(DanhSachNuoc nuoc) {
        Nuoc.add(nuoc);
    }

    // In ra danh sach nuoc
    public void inDanhSachNuoc() {
        System.out.println(tenLoaiMenu + ": " + mota);
        for (DanhSachNuoc nuoc : Nuoc) {
            System.out.println("- " + nuoc.getTenNuoc() + ": $" + nuoc.getGia());
        }
    }
}
