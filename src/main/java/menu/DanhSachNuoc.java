package menu;

public class DanhSachNuoc {
    private String menuItemId;
    private String tenNuoc;
    private String moTaNuoc;
    private double giatien;

    public String getMenuItemId() {
        return menuItemId;
    }

    public void setMenuItemId(String menuItemId) {
        this.menuItemId = menuItemId;
    }

    public String getMoTaNuoc() {
        return moTaNuoc;
    }

    public void setMoTaNuoc(String moTaNuoc) {
        this.moTaNuoc = moTaNuoc;
    }

    public double getGiatien() {
        return giatien;
    }

    public void setGiatien(double giatien) {
        this.giatien = giatien;
    }
    
    
    //Constructor menu
    public DanhSachNuoc(String id, String tennuoc, String mota, double giatien) {
        this.menuItemId = id;
        this.tenNuoc = tennuoc;
        this.moTaNuoc = mota;
        this.giatien = giatien;
    }

    //Ham cap nhap gia
    public void capNhapGia(double gia) {
        this.giatien = gia;
    }

    public String getTenNuoc() {
        return tenNuoc;
    }

    public double getGia() {
        return giatien;
    }
}
